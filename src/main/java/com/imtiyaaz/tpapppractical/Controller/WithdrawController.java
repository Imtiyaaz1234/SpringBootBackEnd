package com.imtiyaaz.tpapppractical.Controller;

import com.imtiyaaz.tpapppractical.Domain.Account;
import com.imtiyaaz.tpapppractical.Domain.Operations;
import com.imtiyaaz.tpapppractical.Domain.User;
import com.imtiyaaz.tpapppractical.Repository.AccountRepository;
import com.imtiyaaz.tpapppractical.Repository.OperationsRepository;
import com.imtiyaaz.tpapppractical.Repository.UserRepository;
import com.imtiyaaz.tpapppractical.Validation.WithDrawValidation;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Date;

/**
 * Created by Ameer on 2017/10/15.
 */
@Controller
@RequestMapping(value = "/withdraw")
public class WithdrawController {
    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private OperationsRepository operationRepository;

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(method = RequestMethod.GET)
    public String show(){
        return "/withdraw";
    }

    @RequestMapping(method = RequestMethod.POST)
    public  String withdraw(HttpServletRequest request) throws FileNotFoundException, com.itextpdf.text.DocumentException {
        Account account = accountRepository.findOne(String.valueOf(Long.parseLong(request.getParameter("account"))));
        float sum = Float.parseFloat(request.getParameter("sum"));
        String selectedOperation = request.getParameter("option");

        WithDrawValidation validation = new WithDrawValidation();

        if (validation.validateWithdraw(account,sum)){
            account.setAccBalance(account.getAccBalance() - sum);
            Authentication auth = SecurityContextHolder.getContext().getAuthentication();
            String username = auth.getName();
            User user = userRepository.findByEmployeeUsername(username);
            Operations operation = new Operations(new Date(), "Withdraw from " + account.getAccountNumber(), null, user);

            accountRepository.save(account);
            operationRepository.save(operation);

            if(selectedOperation.equals("bill")){
                Document doc = new Document();
                PdfWriter.getInstance(doc, new FileOutputStream("Bill.pdf"));
                doc.open();
                doc.addTitle("Bill");
                doc.addCreationDate();
                doc.add(new Paragraph("Payment: " + sum + "\nFrom account: "+account.toString()));
                doc.close();
            }
            else
            {
                Document doc = new Document();
                PdfWriter.getInstance(doc, new FileOutputStream("Withdraw.pdf"));
                doc.open();
                doc.addTitle("Withdraw");
                doc.addCreationDate();
                doc.add(new Paragraph("Withdraw: " + sum + "\nFrom account: "+account.toString()));
                doc.close();
            }

            return "redirect:/home";
        }
        else
            return "redirect:/errorpage";
    }
}

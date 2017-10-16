package com.imtiyaaz.tpapppractical.Controller;

import com.imtiyaaz.tpapppractical.Domain.Account;
import com.imtiyaaz.tpapppractical.Domain.Operations;
import com.imtiyaaz.tpapppractical.Domain.User;
import com.imtiyaaz.tpapppractical.Repository.AccountRepository;
import com.imtiyaaz.tpapppractical.Repository.OperationsRepository;
import com.imtiyaaz.tpapppractical.Repository.UserRepository;
import com.imtiyaaz.tpapppractical.Validation.TransferValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * Created by Ameer on 2017/10/15.
 */
@Controller
@RequestMapping(value = "/transfer")
public class TransferController {
    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OperationsRepository operationRepository;

    @RequestMapping(method = RequestMethod.GET)
    public String show(){return "/transfer";}

    @RequestMapping(method = RequestMethod.POST)
    public String transfer(HttpServletRequest request){
        Account from = accountRepository.getOne(String.valueOf(Long.parseLong(request.getParameter("first"))));
        Account to = accountRepository.getOne(Long.parseLong(request.getParameter("second")));
        float sum = Float.parseFloat(request.getParameter("sum"));

        TransferValidation validation = new TransferValidation();
        if(validation.validateTransfer(from,to,sum)){
            from.setAccBalance(from.getAccBalance() - sum);
            to.setAccBalance(to.getAccBalance() + sum);

            Authentication auth = SecurityContextHolder.getContext().getAuthentication();
            String username = auth.getName();
            User user = userRepository.findByEmployeeUsername(username);
            Operations operation = new Operations(new Date(), "Transfer from " + from.getAccountNumber() + " to " + to.getAccountNumber(), null, user);

            accountRepository.save(from);
            accountRepository.save(to);
            operationRepository.save(operation);

            return "redirect:/home";
        }
        else
            return "redirect:/errorpage";
    }
}

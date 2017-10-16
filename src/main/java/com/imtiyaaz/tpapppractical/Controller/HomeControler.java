package com.imtiyaaz.tpapppractical.Controller;

import com.imtiyaaz.tpapppractical.Domain.Account;
import com.imtiyaaz.tpapppractical.Domain.Client;
import com.imtiyaaz.tpapppractical.Repository.AccountRepository;
import com.imtiyaaz.tpapppractical.Repository.ClientRepository;
import com.imtiyaaz.tpapppractical.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Ameer on 2017/10/15.
 */
@Controller
@RequestMapping(value = "/home")
public class HomeControler {

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private EmployeeRepository employeeRepository;


    @RequestMapping(method = RequestMethod.POST)
    public String search(HttpServletRequest request) {
        String selectedOperation = request.getParameter("option");

        if(selectedOperation.equals("viewAccount")) {
            Account account = accountRepository.findOne(String.valueOf(Long.parseLong(request.getParameter("search"))));
            if (account!=null)
                return "redirect:/home/" + account.getAccountNumber() + "/view_account";
            else
                return "redirect:/errorpage";
        }

        if(selectedOperation.equals("editAccount")){
            Account account = accountRepository.findOne(String.valueOf(Long.parseLong(request.getParameter("search"))));
            if(account!=null)
                return "redirect:/home/" + account.getAccountNumber() + "/update_account";
            else
                return "redirect:/errorpage";
        }

        if(selectedOperation.equals("deleteAccount")) {
            Account account = accountRepository.findOne(String.valueOf(Long.parseLong(request.getParameter("search"))));
            if (account!=null)
                return "redirect:/home/" + account.getAccountNumber() + "/delete";
            else
                return "redirect:/errorpage";
        }

        if(selectedOperation.equals("viewClient")) {
            Client client = clientRepository.findOne(Integer.parseInt(request.getParameter("search")));
            if(client!=null)
                return "redirect:/home/" + client.getcId() + "/view";
            else
                return "redirect:/errorpage";
        }

        if(selectedOperation.equals("editClient")){
            Client client = clientRepository.findOne(Integer.parseInt(request.getParameter("search")));
            if (client!=null)
                return "redirect:/home/" + client.getcId() + "/update_client";
            else
                return "redirect:/errorpage";
        }
        return "redirect:/home";
    }
}

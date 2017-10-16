package com.imtiyaaz.tpapppractical.Controller;

import com.imtiyaaz.tpapppractical.Domain.Employee;
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
@RequestMapping( value = "/admin")
public class AdminController {


        @Autowired
        private ClientRepository clientRepository;

        @Autowired
        private AccountRepository accountRepository;

        @Autowired
        private EmployeeRepository employeeRepository;


        @RequestMapping(method = RequestMethod.POST)
        public String search(HttpServletRequest request) {
            String selectedOperation = request.getParameter("option");

            if(selectedOperation.equals("viewEmployee")){
                Employee employee = employeeRepository.findOne(Integer.parseInt(request.getParameter("search")));
                if (employee!=null)
                    return "redirect:/admin/" + employee.getEmployeeNumber() + "/view_employee";
                else
                    return "redirect:/errorpage";
            }

            if(selectedOperation.equals("editEmployee")){
                Employee employee = employeeRepository.findOne(Integer.parseInt(request.getParameter("search")));
                if (employee!=null)
                    return "redirect:/admin/" + employee.getEmployeeNumber() + "/update_employee";
                else
                    return "redirect:/errorpage";
            }

            if(selectedOperation.equals("deleteEmployee")){
                Employee employee = employeeRepository.findOne(Integer.parseInt(request.getParameter("search")));
                if(employee!=null)
                    return "redirect:/admin/" + employee.getEmployeeNumber() + "/delete";
                else
                    return "redirect:/errorpage";
            }

            return "redirect:/admin";
        }
    }



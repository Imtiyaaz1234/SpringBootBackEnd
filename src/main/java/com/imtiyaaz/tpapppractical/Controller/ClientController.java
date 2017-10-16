package com.imtiyaaz.tpapppractical.Controller;

import com.imtiyaaz.tpapppractical.Domain.Client;
import com.imtiyaaz.tpapppractical.Domain.Operations;
import com.imtiyaaz.tpapppractical.Domain.User;
import com.imtiyaaz.tpapppractical.Repository.ClientRepository;
import com.imtiyaaz.tpapppractical.Repository.OperationsRepository;
import com.imtiyaaz.tpapppractical.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * Created by Ameer on 2017/10/15.
 */
@Controller
@RequestMapping("/home")
public class ClientController {
    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private OperationsRepository operationRepository;

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value="/{id}/view", method = RequestMethod.GET)
    public String viewClient(@PathVariable int id, Model model){
        Client client = clientRepository.findOne(id);
        model.addAttribute("client",client);
        return "/view";
    }

    @RequestMapping(method = RequestMethod.GET)
    public String showHome(){
        return "/home";
    }


    @RequestMapping(value="home/add_client",method = RequestMethod.POST)
    public String addNewClient(HttpServletRequest request){
        Client client = new Client(request.getParameter("clientCnp"),request.getParameter("clientIdNumber"), request.getParameter("clientName"), request.getParameter("clientEmail"), request.getParameter("clientPhone"), request.getParameter("clientAddress"));

        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String username = auth.getName();
        User user = userRepository.findByEmployeeUsername(username);
        Operations operation = new Operations(new Date(), "Added new client with ID: " + client.getcId(), client, user);
        clientRepository.save(client);
        operationRepository.save(operation);
        return "redirect:/home";
    }

    @RequestMapping(value="/update_client", method = RequestMethod.GET)
    public String showUpdate(){
        return "/update_client";
    }


    @RequestMapping(value="/{id}/update_client", method = RequestMethod.GET)
    public String viewUpdate(@PathVariable int id, Model model){
        Client client = clientRepository.findOne(id);
        model.addAttribute("client",client);
        return "/home/update_client";
    }

    @RequestMapping(value = "update", method = RequestMethod.POST)
    public String updateClient(HttpServletRequest request){
        Client client = clientRepository.findOne(Integer.parseInt(request.getParameter("search")));

        if(client!=null) {
            client.setcCnp(request.getParameter("clientCnp"));
            client.setcId(Integer.parseInt(request.getParameter("clientIdNumber")));
            client.setcName(request.getParameter("clientName"));
            client.setcEmail(request.getParameter("clientEmail"));
            client.setcPhone(request.getParameter("clientPhone"));
            client.setcAddress(request.getParameter("clientAddress"));
            Authentication auth = SecurityContextHolder.getContext().getAuthentication();
            String username = auth.getName();
            User user = userRepository.findByEmployeeUsername(username);
            Operations operation = new Operations(new Date(), "Updated client with ID: " + client.getcId(), client, user);

            clientRepository.save(client);
            operationRepository.save(operation);

            return "redirect:/home";
        }
        else
            return "redirect:home/update_client?param=error";
    }

}

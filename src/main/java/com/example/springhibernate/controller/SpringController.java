package com.example.springhibernate.controller;

import com.example.springhibernate.orm.Customer;
import com.example.springhibernate.orm.CustomerDAO;
import com.example.springhibernate.orm.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class SpringController {

    @Autowired
    CustomerService customerService;

    @InitBinder
    public void initBind(WebDataBinder binder) {
        StringTrimmerEditor trimmerEditor = new StringTrimmerEditor(true);
        binder.registerCustomEditor(String.class, trimmerEditor);

    }

    @GetMapping(value = "/")
    public String showForm(Model model) {
        var customers = customerService.getCustomers();
        model.addAttribute("customerList", customers);
        return "index";
    }

    @GetMapping(value = "/showCustomerForm")
    public String redirectToCustomerPage(Model model){
        model.addAttribute("customer", new Customer());
        return "addCustomerPage";
    }

    @PostMapping(value = "/addCustomer")
    public String showForms(Model model, @Valid @ModelAttribute("customer") Customer customer,
                            BindingResult bindingResult) {
        if(bindingResult.hasErrors()) {
            return "addCustomerPage";
        }
        customerService.addCustomer(customer);
        return "redirect:/";
    }

    @PostMapping(value = "/updateCustomer")
    public String updateCustomer() {
        return "updatePage";
    }

}

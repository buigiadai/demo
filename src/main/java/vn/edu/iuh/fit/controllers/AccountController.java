package vn.edu.iuh.fit.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import vn.edu.iuh.fit.models.Account;
import vn.edu.iuh.fit.repositories.AccountRepository;
import vn.edu.iuh.fit.services.AccountService;

@Controller
public class AccountController {
    @Autowired
    private AccountService accountService;

    @GetMapping("/account")
    public String showAccount(Model model){
        Account account = new Account();
        model.addAttribute("account",account);
        return "login";
    }

    @PostMapping("/add")
    public String addAccount(@ModelAttribute Account account,Model model)
    {
        account.createNumberCard();
        accountService.saveAccount(account);
        model.addAttribute("report", "Thanh cong");
        model.addAttribute("numberCard", account.getNumberCard());
        return "result";
    }
}


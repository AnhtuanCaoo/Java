package com.example.thanhtoantienbqthok.Auth;


import com.example.thanhtoantienbqthok.ThanhVien.ThanhVien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;
import java.util.Optional;
@Controller
@RequestMapping("/auth")
public class AuthController {
    @Autowired private AuthService authService;

    @GetMapping("/login")
    public String loginPage(Model model) {
        model.addAttribute("thanhVien", new ThanhVien());
        return "login";
    }

    @PostMapping("/login")
    public String loginAction(RedirectAttributes ra, @RequestParam("username") String username, @RequestParam("password") String password, HttpSession session) {
        boolean isLoginSuccess = authService.authLogin(username, password);
        if(isLoginSuccess) {
            session.setAttribute("username", username);
            return "redirect:/";
        }
        ra.addFlashAttribute("message",  "Tài khoản hoặc mật khẩu không chính xác!");
        return "redirect:/auth/login";
    }
}

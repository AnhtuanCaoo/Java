package com.example.thanhtoantienbqthok;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import javax.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.ui.Model;
import com.example.thanhtoantienbqthok.DoiBong.DoiBong;
import com.example.thanhtoantienbqthok.DoiBong.DoiBongService;
import java.util.List;
import java.util.Optional;
import java.util.Set;
@Controller
public class MainController {
    @Autowired private DoiBongService DoiBongService;
    @GetMapping("")
    public String homePage(HttpSession session, RedirectAttributes ra) {
        if(session.getAttribute("username") == null) {
            ra.addFlashAttribute("requireLogin", "Vui lòng đăng nhập!");
            return "redirect:/auth/login";
        } else {
            return "index";
        }
    }
}

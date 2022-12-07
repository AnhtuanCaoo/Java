package com.example.thanhtoantienbqthok.PhieuThanhToanDoiBong;

import com.example.thanhtoantienbqthok.BanToChuc.BanToChuc;
import com.example.thanhtoantienbqthok.BanToChuc.BanToChucService;
import com.example.thanhtoantienbqthok.DoiBong.DoiBong;
import com.example.thanhtoantienbqthok.DoiBong.DoiBongOne;
import com.example.thanhtoantienbqthok.DoiBong.DoiBongService;
import com.example.thanhtoantienbqthok.HopDongTranDau.HopDongTranDau;
import com.example.thanhtoantienbqthok.TranDau.TranDau;
import com.example.thanhtoantienbqthok.TranDauDoiBong.TranDauDoiBong;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Controller
public class PhieuThanhToanDoiBongController {
    @Autowired BanToChucService banToChucService;
    @Autowired DoiBongService doiBongService;
    @Autowired PhieuThanhToanDoiBongService phieuThanhToanDoiBongService;
    @GetMapping("/xac-nhan")
    public String addNewPhieu(HttpSession session, RedirectAttributes ra, Model model) {
        if(session.getAttribute("username") == null) {
            ra.addFlashAttribute("requireLogin", "Vui lòng đăng nhập!");
            return "redirect:/auth/login";
        } else {
            Integer doibongId = ((Integer) session.getAttribute("doibongId"));
            Integer userId = ((Integer) session.getAttribute("userId"));
            String ngayThanhToan = (String) session.getAttribute("ngayThanhToan");
            Float grandtotal = ((Float) session.getAttribute("grandtotal"));
            String doibongname = ((String) session.getAttribute("doibongname"));
            String ten = "Thanh toán cho đội bóng " + doibongname;
            Optional<BanToChuc> banToChuc = banToChucService.getById(userId);
            Optional<DoiBong> doiBong = doiBongService.getById(doibongId);
            PhieuThanhToanDoiBong phieuThanhToanDoiBong = new PhieuThanhToanDoiBong(ten,banToChuc.get(), doiBong.get(),ngayThanhToan);
            phieuThanhToanDoiBongService.save(phieuThanhToanDoiBong);
            model.addAttribute("doibongId",doibongId);
            model.addAttribute("ten",ten);
            model.addAttribute("grandtotal",grandtotal);
            model.addAttribute("ngayThanhToan",ngayThanhToan);
            return "hoadon";
        }
    }
}

package com.example.thanhtoantienbqthok.TranDauDoiBong;

import com.example.thanhtoantienbqthok.DoiBong.DoiBong;
import com.example.thanhtoantienbqthok.DoiBong.DoiBongService;
import com.example.thanhtoantienbqthok.HopDongTranDau.HopDongTranDau;
import com.example.thanhtoantienbqthok.HopDongTranDau.HopDongTranDauRepository;
import com.example.thanhtoantienbqthok.PhieuThanhToanDoiBong.PhieuThanhToanDoiBong;
import com.example.thanhtoantienbqthok.ThanhVien.ThanhVien;
import com.example.thanhtoantienbqthok.ThanhVien.ThanhVienRepository;
import com.example.thanhtoantienbqthok.ThanhVien.ThanhVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Controller
public class TranDauDoiBongController {
    @Autowired
    private DoiBongService doiBongService;
    @Autowired
    private TranDauDoiBongService tranDauDoiBongService;
    @Autowired
    private ThanhVienRepository thanhVienRepository;
    @GetMapping("/doi-bong-detail/{id}")
    public String doiBongDetail(HttpSession session, RedirectAttributes ra,@PathVariable("id") Integer id, Model model){
        if(session.getAttribute("username") == null) {
            ra.addFlashAttribute("requireLogin", "Vui lòng đăng nhập!");
            return "redirect:/auth/login";
        }
        else{
            String username = (String) session.getAttribute("username");
            session.setAttribute("doibongId",id);
            Optional<ThanhVien> user = thanhVienRepository.findByUsername(username);
            Integer userId = user.get().getId();
            session.setAttribute("userId",userId);
            Optional<DoiBong> doibong = doiBongService.getById(id);
            Set<TranDauDoiBong> tddb = doibong.get().getListTranDauDoiBong();
            List<TranDauDoiBongOne> listTdo = new ArrayList<>();
            for (TranDauDoiBong td : tddb) {
                String ngayThanhToan = "";
                String ten = td.tranDau.ten;
                Set<HopDongTranDau> listHD = td.tranDau.listHopDongTranDau;
                float total = 0;
                for (HopDongTranDau hd : listHD) {
                    total += hd.giaTien;
                    ngayThanhToan = hd.ngayThanhToan;
                }
                System.out.println("tddb" + tranDauDoiBongService.getGiaTienByTranDauDoiBongId(1));
                listTdo.add(new TranDauDoiBongOne(td.getId(), ten,ngayThanhToan, total));
            }
            float grandtotal = 0;
            String day = "";
            for (TranDauDoiBongOne tdo : listTdo){
                grandtotal += tdo.sotien;
                day = tdo.ngayThanhToan;
            }
            String doibongname = doibong.get().getTen();
            session.setAttribute("grandtotal",grandtotal);
            session.setAttribute("doibongname",doibongname);
            session.setAttribute("ngayThanhToan",day);
            model.addAttribute("doibongId", id);
            model.addAttribute("TranDauDoiBong", tddb);
            model.addAttribute("DoiBong", doibong);
            model.addAttribute("TDO", listTdo);
            model.addAttribute("userid", userId);
            model.addAttribute("grandtotal", grandtotal);
            model.addAttribute("day", day);
            return "detail";
        }
    }
}

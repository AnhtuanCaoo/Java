package com.example.thanhtoantienbqthok.DoiBong;
import com.example.thanhtoantienbqthok.*;
import com.example.thanhtoantienbqthok.HopDongTranDau.HopDongTranDau;
import com.example.thanhtoantienbqthok.TranDau.TranDau;
import com.example.thanhtoantienbqthok.TranDauDoiBong.TranDauDoiBong;
import com.example.thanhtoantienbqthok.TranDauDoiBong.TranDauDoiBongOne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;
import java.util.*;

@Controller
public class DoiBongController {
    @Autowired private DoiBongService doiBongService;
    @Autowired private DoiBongRepository doiBongRepository;
    @GetMapping("/doi-bong")
    public String doiBongList(HttpSession session,RedirectAttributes ra,Model model) {
        if(session.getAttribute("username") == null) {
            ra.addFlashAttribute("requireLogin", "Vui lòng đăng nhập!");
            return "redirect:/auth/login";
        } else {
//            List<DoiBong> list = (List<DoiBong>) doiBongService.getAll();
            List<DoiBongOne> listDbo = new ArrayList<>();

            List<DoiBong> list = doiBongRepository.getAllDoiBong();

            for (DoiBong dd:list){
                float total = 0;
//                Optional<DoiBong> doiBong = doiBongService.getById(dd.getId());
                Set<TranDauDoiBong> listTddb = dd.listTranDauDoiBong;
                for (TranDauDoiBong tddb : listTddb){
                    TranDau td = tddb.getTranDau();
                    Set<HopDongTranDau> listHdtd = td.listHopDongTranDau;
                    for (HopDongTranDau hd : listHdtd){
                        total+= hd.giaTien;
                    }
                }
                listDbo.add(new DoiBongOne(dd.getId(),dd.getTen(),total));
            }
            model.addAttribute("listDoiBong",list);
            model.addAttribute("listDbo",listDbo);
            return "doibong";
        }
    }

}

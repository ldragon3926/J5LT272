package com.example.lt272.controller;


import com.example.lt272.model.ChucVu;
import com.example.lt272.model.NhanVien;
import com.example.lt272.repository.NhanVienRepository;
import com.example.lt272.service.ChucVuService;
import com.example.lt272.service.NhanVienService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/nhan-vien")
@Controller
public class NhanVienController {
    @Autowired
    NhanVienService nhanVienService;
    @Autowired
    ChucVuService chucVuService;

    @Autowired
    NhanVienRepository nhanVienRepository;

    @ModelAttribute("listCV")
    public List<ChucVu> getAll(){
        return chucVuService.getAll();
    }

    @GetMapping("/hien-thi")
    public String hienThi(Model model, @ModelAttribute NhanVien nhanVien){
        model.addAttribute("ListNV", nhanVienService.getAll());
        return "/hienThi";

    }

    @GetMapping("/phan-trang")
    public String hienThi(Model model,@RequestParam(name = "page", defaultValue = "0", required = false) Integer page){
        int PageSize = 4;
        Sort sort = Sort.by(Sort.Direction.DESC,"id");
        Pageable pageable = PageRequest.of(page, PageSize, sort);
        model.addAttribute("page", nhanVienRepository.findAll(pageable));
        return "/phanTrang";

    }

    @GetMapping("/delete")
    public String deleteNV(@RequestParam("id") Integer id){
        nhanVienService.deleteNV(id);
        return "redirect:/nhan-vien/hien-thi";
    }
    @PostMapping("/add")
    public String addNV(Model model, @ModelAttribute @Valid NhanVien nhanVien, Errors errors){
        if (errors.hasErrors()){
            model.addAttribute("ListNV", nhanVienService.getAll());
            return "/hienThi";
        }
        nhanVienService.addNV(nhanVien);
       return "redirect:/nhan-vien/hien-thi";

    }

}

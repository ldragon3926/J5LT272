package com.example.lt272.service;

import com.example.lt272.model.NhanVien;
import com.example.lt272.repository.NhanVienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class NhanVienService {
    @Autowired
    NhanVienRepository nhanVienRepository;
    public List<NhanVien> getAll(){
        return nhanVienRepository.findAll();
    }
    public void addNV(NhanVien nhanVien){
        nhanVienRepository.save(nhanVien);
    }
    public void deleteNV(Integer id){
        nhanVienRepository.deleteById(id);
    }



}

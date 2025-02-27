package com.example.lt272.service;

import com.example.lt272.model.ChucVu;
import com.example.lt272.model.NhanVien;
import com.example.lt272.repository.ChucVuRepository;
import com.example.lt272.repository.NhanVienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ChucVuService {
    @Autowired
    ChucVuRepository chucVuRepository;
    public List<ChucVu> getAll(){
        return chucVuRepository.findAll();
    }
}

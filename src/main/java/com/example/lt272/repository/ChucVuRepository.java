package com.example.lt272.repository;

import com.example.lt272.model.ChucVu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  ChucVuRepository extends JpaRepository<ChucVu,Integer> {
}

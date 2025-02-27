package com.example.lt272.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "chuc_vu")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ChucVu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "ma_chuc_vu")
    private String maChucVu;
    @Column(name = "ten_chuc_vu")
    private String tenChucVu;
    @Column(name = "mo_ta")
    private String moTa;
    @Column(name = "he_so_luong")
    private float heSoLuong;
}

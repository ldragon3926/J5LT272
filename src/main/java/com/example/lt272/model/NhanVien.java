package com.example.lt272.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "nhan_vien")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class NhanVien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank(message = "Ma nhan vien khong duoc trong")
    @Column(name = "ma_nhan_vien")
    private String maNhanVien;

    @NotBlank(message = "ho va ten khong duoc trong")
    @Column(name = "ho_ten")
    private String hoTen;

    @NotBlank(message = "sdt khong duoc trong")
    @Column(name = "so_dien_thoai")
    private String soDienThoai;

    @NotNull(message = "gioi tinh khong duoc trong")
    @Column(name = "gioi_tinh")
    private boolean gioiTinh;


    @NotNull(message = "Chuc vu khong duoc trong")
    @ManyToOne
    @JoinColumn(name = "id_chuc_vu", referencedColumnName = "id")
    private ChucVu chucVu;
}

package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.NhanVien;

@Repository
public interface NhanVienRepository extends CrudRepository<NhanVien, String> {
	@Query(value = "SELECT * FROM chuyenbay.nhanvien where Luong<10000;",nativeQuery = true)
	public List<NhanVien> nhanvienluongduoi10k();

}

package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.MayBay;
import com.example.demo.entity.NhanVien;
import com.example.demo.repository.MayBayRepository;
import com.example.demo.repository.NhanVienRepository;

@RestController
@RequestMapping("/nhan-vien")
public class NhanVienController {
	@Autowired
	 private NhanVienRepository  repo;
		@GetMapping("/nv10k")
		public List<NhanVien> nhanvien10k() {
			List<NhanVien> lisMB = (List<NhanVien>) repo.nhanvienluongduoi10k();
					System.out.println(lisMB);
			return lisMB;
		}

}

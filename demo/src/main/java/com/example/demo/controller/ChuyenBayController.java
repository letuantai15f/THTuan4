package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.ChuyenBay;
import com.example.demo.repository.ChuyenBayRepository;



@RestController
@RequestMapping("/chuyen-bay")
public class ChuyenBayController {
	@Autowired
	private ChuyenBayRepository repo;

	@GetMapping("")
	public List<ChuyenBay> get() {
		List<ChuyenBay> lstChuyenBay = (List<ChuyenBay>) repo.findAll();
		System.out.println(lstChuyenBay);
		return lstChuyenBay;
	}
	

	@PostMapping("")
	public ChuyenBay add(@RequestBody ChuyenBay chuyenBay) {
		repo.save(chuyenBay);
		System.out.println(chuyenBay);
		return chuyenBay;
	}
}
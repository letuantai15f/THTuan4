package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.ChuyenBay;
import com.example.demo.entity.MayBay;
import com.example.demo.repository.MayBayRepository;
@RestController
@RequestMapping("/may-bay")
public class MayBayController {
	@Autowired
 private MayBayRepository repo;
	@GetMapping("/cb10k")
	public List<MayBay> chuyenbay10k() {
		List<MayBay> lisMB = (List<MayBay>) repo.chuyenBay10000km();
				System.out.println(lisMB);
		return lisMB;
	}

}

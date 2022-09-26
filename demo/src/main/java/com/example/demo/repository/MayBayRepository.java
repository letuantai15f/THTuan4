package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.ChuyenBay;
import com.example.demo.entity.MayBay;
@Repository
public interface MayBayRepository extends CrudRepository<MayBay, Integer> {
	@Query(value = "SELECT * FROM chuyenbay.maybay where TamBay>10000;",nativeQuery = true)
	public List<MayBay> chuyenBay10000km ();
}

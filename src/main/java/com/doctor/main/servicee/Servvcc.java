package com.doctor.main.servicee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.doctor.main.model.Modells;
import com.doctor.main.reposs.repositor;

@RestController
public class Servvcc {

	@Autowired
	private repositor repp;
	
	@GetMapping("/uuss")
	public List<Modells> getall()
	{
		return repp.findAll();
	}
	
	@GetMapping("/uuss/{Id}")
	public Modells getall(@PathVariable int Id)
	{
		return repp.findAll().get(Id);
	}
	
	@PostMapping("/uuss")
	public void getall(@RequestBody Modells md)
	{
		repp.save(md);
	}
	
}

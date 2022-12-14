package com.example.demo.eli.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.eli.Service.DetalleService;

@RestController
@RequestMapping("/api/detalle")
public class DetalleController {

	@Autowired
	private DetalleService detalleService;
	
	@GetMapping("/all")
	public List<Map<String, Object>> readAll2(){		
		return detalleService.readAll2();
	}
	
}

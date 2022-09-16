package com.example.demo.eli.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.eli.Service.ProductoService;
import com.example.demo.eli.entity.producto;

@RestController

@RequestMapping("/api/producto")

public class ProductoController {

	@Autowired
	private ProductoService productoService;
	
	@GetMapping("/all")
	public List<producto> readAll2(){		
		return productoService.readAll();
	}
	
	@PostMapping("/save")
	public int save(@RequestBody producto producto){		
		return productoService.create(producto);
	}
	
}

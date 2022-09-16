package com.example.demo.eli.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.eli.Service.VentaService;
import com.example.demo.eli.entity.venta;


@RestController

@RequestMapping("/api/venta")
public class VentaController {
	
	@Autowired
	private VentaService service;
	
	@GetMapping("/all")
	public List<venta> readAll(){		
		return service.readAll();
	}
	@GetMapping("/{id}")
	public venta read(@PathVariable int id){		
		return service.read(id);
	}
	
	@PostMapping("/save")
	public int save(@RequestBody venta venta){		
		return service.create(venta);
	}
	
	@PutMapping("/update")
	public int update(@PathVariable int id, @RequestBody venta venta){	
		venta v = service.read(id);
		v.setFecha("2022-09-15");
		return service.update(v);
	}
	
	@DeleteMapping("/del/{id}")
	public int save(@PathVariable int id){		
		return service.delete(id);
	}
}

package com.example.demo.eli.Service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.eli.dao.Todo;
import com.example.demo.eli.daoimpl.ventadaoimpl;
import com.example.demo.eli.entity.venta;

@Service
public class VentaService implements Todo<venta>{

	
	@Autowired
	private ventadaoimpl vendaoimpl;
	
	@Override
	public int create(venta t) {
		// TODO Auto-generated method stub
		return vendaoimpl.create(t);
	}

	@Override
	public int update(venta t) {
		// TODO Auto-generated method stub
		return vendaoimpl.update(t);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return vendaoimpl.delete(id);
	}

	@Override
	public venta read(int id) {
		// TODO Auto-generated method stub
		return vendaoimpl.read(id);
	}

	@Override
	public List<venta> readAll() {
		// TODO Auto-generated method stub
		return vendaoimpl.readAll();
	}

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		return vendaoimpl.readAll2();
	}

	
}

package com.example.demo.eli.Service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.eli.dao.Todo;
import com.example.demo.eli.daoimpl.productodaoimpl;
import com.example.demo.eli.entity.producto;

@Service
public class ProductoService implements Todo<producto> {
	
	@Autowired
	private productodaoimpl prodaoimpl;

	@Override
	public int create(producto t) {
		// TODO Auto-generated method stub
		return prodaoimpl.create(t);
	}

	@Override
	public int update(producto t) {
		// TODO Auto-generated method stub
		return prodaoimpl.update(t);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return prodaoimpl.delete(id);
	}

	@Override
	public producto read(int id) {
		// TODO Auto-generated method stub
		return prodaoimpl.read(id);
	}

	@Override
	public List<producto> readAll() {
		// TODO Auto-generated method stub
		return prodaoimpl.readAll();
	}

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		return prodaoimpl.readAll2();
	}
	
	
}

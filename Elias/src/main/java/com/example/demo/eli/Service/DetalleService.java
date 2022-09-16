package com.example.demo.eli.Service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.eli.dao.Todo;
import com.example.demo.eli.daoimpl.detalledaoimpl;
import com.example.demo.eli.entity.detalle;

@Service

public class DetalleService implements Todo<detalle> {

	
	@Autowired
	private detalledaoimpl detadaoimpl;

	@Override
	public int create(detalle t) {
		// TODO Auto-generated method stub
		return detadaoimpl.create(t);
	}

	@Override
	public int update(detalle t) {
		// TODO Auto-generated method stub
		return detadaoimpl.update(t);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return detadaoimpl.delete(id) ;
	}

	@Override
	public detalle read(int id) {
		// TODO Auto-generated method stub
		return detadaoimpl.read(id);
	}

	@Override
	public List<detalle> readAll() {
		// TODO Auto-generated method stub
		return detadaoimpl.readAll();
	}

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		return detadaoimpl.readAll2();
	}	

}

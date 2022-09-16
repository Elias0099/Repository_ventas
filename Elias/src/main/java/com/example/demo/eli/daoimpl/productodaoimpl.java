package com.example.demo.eli.daoimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.eli.dao.Todo;
import com.example.demo.eli.entity.producto;

@Repository
public class productodaoimpl implements Todo<producto> {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int create(producto t) {
		// TODO Auto-generated method stub
		String SQL = "INSERT INTO producto (nombre, precio, stock) VALUES(?,?,?)";
		return jdbcTemplate.update(SQL, t.getNombre(), t.getPrecio(), t.getStock());
	}

	@Override
	public int update(producto t) {
		// TODO Auto-generated method stub
		String SQL = "INSERT INTO producto (nombre, precio, stock) VALUES(?,?,?)";
		return jdbcTemplate.update(SQL, t.getNombre(), t.getPrecio(), t.getStock());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		String SQL = "DELETE FROM producto WHERE idproducto=?";
		return jdbcTemplate.update(SQL, id);
	}

	@Override
	public producto read(int id) {
		// TODO Auto-generated method stub
		try {
			producto prod = jdbcTemplate.queryForObject("SELECT * FROM producto WHERE idproducto=?",
					BeanPropertyRowMapper.newInstance(producto.class), id);
			return prod;
		} catch (IncorrectResultSizeDataAccessException e) {
			return null;
		}

	}

	@Override
	public List<producto> readAll() {
		// TODO Auto-generated method stub	
		return jdbcTemplate.query("SELECT * FROM producto", BeanPropertyRowMapper.newInstance(producto.class));
	}

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		return null;
	}

}

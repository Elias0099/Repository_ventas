package com.example.demo.eli.daoimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.eli.dao.Todo;
import com.example.demo.eli.entity.venta;

@Repository
public class ventadaoimpl implements Todo<venta> {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public int create(venta t) {
		// TODO Auto-generated method stub
		String SQL = "INSERT INTO venta(fecha) VALUES(now())";
		return jdbcTemplate.update(SQL);
	}

	@Override
	public int update(venta t) {
		// TODO Auto-generated method stub
		String SQL = "UPDATE venta SET fecha = ? WHERE idventa=?";
		return jdbcTemplate.update(SQL, t.getFecha(), t.getIdventa());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		String SQL = "DELETE FROM venta WHERE idventa=?";
		return jdbcTemplate.update(SQL, id);
	}

	@Override
	public venta read(int id) {
		// TODO Auto-generated method stub
		try {
			venta v = jdbcTemplate.queryForObject("SELECT * FROM venta WHERE idventa=?",
					BeanPropertyRowMapper.newInstance(venta.class), id);
			return v;
		} catch (IncorrectResultSizeDataAccessException e) {
			return null;
		}
	}

	@Override
	public List<venta> readAll() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("SELECT * from venta", BeanPropertyRowMapper.newInstance(venta.class));
	}

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		return null;
	}
	
}

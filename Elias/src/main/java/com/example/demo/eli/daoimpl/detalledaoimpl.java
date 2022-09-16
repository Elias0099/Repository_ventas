package com.example.demo.eli.daoimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.example.demo.eli.dao.Todo;
import com.example.demo.eli.entity.detalle;

@Component
public class detalledaoimpl implements Todo<detalle> {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int create(detalle t) {
		// TODO Auto-generated method stub
		String SQL = "INSERT INTO detalle (idventa, idproducto, precio, cantidad) VALUES (?,?,?,?)";
		return jdbcTemplate.update(SQL, t.getIdventa(), t.getidproducto(),t.getPrecio(), t.getCantidad());
	}

	@Override
	public int update(detalle t) {
		// TODO Auto-generated method stub
		String SQL = "UPDATE detalle SET cantidad = ? WHERE (iddetalle = ?)";
		return jdbcTemplate.update(SQL, t.getCantidad(), t.getiddetalle());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		String SQL="DELETE FROM  WHERE iddetalle = ?";
		return jdbcTemplate.update(SQL, id);
	}

	@Override
	public detalle read(int id) {
		// TODO Auto-generated method stub
		try {
			detalle det = jdbcTemplate.queryForObject("SELECT * FROM detalle WHERE iddetalle=?",
					BeanPropertyRowMapper.newInstance(detalle.class), id);
			return det;
		} catch (IncorrectResultSizeDataAccessException e) {
			return null;
		}
	}

	@Override
	public List<detalle> readAll() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("SELECT * from detalle", BeanPropertyRowMapper.newInstance(detalle.class));
	}

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		String SQL = "select v.idventa, v.fecha, p.idproducto, p.nombre, d.precio, d.cantidad from detalle as d "
				+ "inner join venta as v on d.idventa= v.idventa "
				+ "inner join producto as p on d.idproducto= p.idproducto ";
		return jdbcTemplate.queryForList(SQL);
	}
 
}

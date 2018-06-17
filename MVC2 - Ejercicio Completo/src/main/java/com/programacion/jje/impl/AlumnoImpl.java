package com.programacion.jje.impl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.programacion.jje.models.Alumno;
import com.programacion.jje.models.AlumnoDao;

public class AlumnoImpl implements AlumnoDao{
	
	private DataSource dataSource;
	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public List<Alumno> getAll(){
		List<Alumno> alumnos = new ArrayList<Alumno>();
		try {
			conn = dataSource.getConnection();
			ps = conn.prepareStatement("SELECT * FROM alumno");
			rs = ps.executeQuery();
			while(rs.next()) {
				alumnos.add(  new Alumno(  rs.getString("alumnoId"), rs.getString("nombre"), rs.getString("apellidos")  )  );
			}
			rs.close();
			ps.close();
			
		}catch(SQLException sqle) {
			throw new RuntimeException(sqle);
		}finally{
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return alumnos;
	}

	@Override
	public Alumno getById(String alumnoId) {
		Alumno alumno = null;
		try {
			conn = dataSource.getConnection();
			ps = conn.prepareStatement("SELECT * FROM alumno WHERE alumnoId = ?");
			ps.setString(1,alumnoId);
			rs = ps.executeQuery();
			while(rs.next()) {
				alumno =  new Alumno(  rs.getString("alumnoId"), rs.getString("nombre"), rs.getString("apellidos")  );
			}
			rs.close();
			ps.close();
			
		}catch(SQLException sqle) {
			throw new RuntimeException(sqle);
		}finally{
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return alumno;
	}

	@Override
	public String insert(Alumno alumno) {
		String mensaje = "";
		try {
			conn = dataSource.getConnection();
			ps = conn.prepareStatement("INSERT INTO alumno (nombre, apellidos) VALUES(?, ?)");
			ps.setString(1, alumno.getNombre());
			ps.setString(2, alumno.getApellidos());
			int id =  ps.executeUpdate();
			ps.close();
			mensaje = "Se ha agregado correctamente a : "+alumno.toString()+"  con el ID: "+id;
			
		}catch(SQLException sqle) {
			throw new RuntimeException(sqle);
		}finally{
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return mensaje;
	}

	@Override
	public String update(Alumno alumno) {
		String mensaje = "";
		try {
			conn = dataSource.getConnection();
			ps = conn.prepareStatement("UPDATE alumno SET nombre = ?, apellidos = ? WHERE alumnoId = ?");
			ps.setString(1, alumno.getNombre());
			ps.setString(2, alumno.getApellidos());
			ps.setString(3, alumno.getAlumnoId());
			ps.executeUpdate();
			ps.close();
			mensaje = "Se ha actualizado correctamente a : "+alumno.toString()+"  con el ID: "+alumno.getAlumnoId();
		}catch(SQLException sqle) {
			mensaje = sqle.getMessage();
		}finally{
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return mensaje;
	}

	@Override
	public String delete(String alumnoId) {
		String mensaje = "";
		try {
			conn = dataSource.getConnection();
			ps = conn.prepareStatement("DELETE FROM alumno WHERE alumnoId = ?");
			ps.setString(1, alumnoId);
			ps.executeUpdate();
			ps.close();
			mensaje = "Se ha elimiando correctamente el Alumno con ID: "+alumnoId;
		}catch(SQLException sqle) {
			mensaje = sqle.getMessage();
		}finally{
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return mensaje;
	}

}

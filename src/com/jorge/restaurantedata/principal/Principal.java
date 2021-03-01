package com.jorge.restaurantedata.principal;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.List;

import com.jorge.restaurantedata.dao.impl.TipoRestauranteDAOImpl;
import com.jorge.restaurantedata.entity.TipoRestaurante;
import com.jorge.restaurantedata.myexceptions.RestauranteException;

public class Principal {

	public static void main(String[] args) {
		
		TipoRestauranteDAOImpl tipoRestauranteDAOImpl = new TipoRestauranteDAOImpl();
		
		//::::::::::::: PRUEBA INSERT ::::::::::::::::
		
//		TipoRestaurante tipoRestaurante = new TipoRestaurante();
//		tipoRestaurante.setDescripcion("Griego");
//		tipoRestaurante.setFechaCreacion(LocalDateTime.now());
//		tipoRestaurante.setEstatus(1);
//		
//		try {
//			int guardado = tipoRestauranteDAOImpl.guardar(tipoRestaurante);
//			if(guardado > 0) {
//				System.out.println("El tipo restaurante " + tipoRestaurante.getDescripcion() + " fue guardado exitosamente");
//			}else {
//				System.err.println("Hubo un error al guardar el tipo de restaurante");
//			}
//		} catch (SQLException e) {
//			System.err.println("Error: " + e.getMessage());
//			e.printStackTrace();
//		}
		
		// :::::::::::::::: PRUEBA DE UPDATE :::::::::::::::::::
		
//		TipoRestaurante tipoRestaurante = new TipoRestaurante();
//		tipoRestaurante.setIdTipoRestaurante(1);
// 		tipoRestaurante.setDescripcion("Griego");
//		tipoRestaurante.setFechaModificacion(LocalDateTime.now());
//		tipoRestaurante.setEstatus(1);
//		
//		try {
//			int guardado = tipoRestauranteDAOImpl.actualizar(tipoRestaurante);
//			
//			if(guardado > 0) {
//				System.out.println("El tipo de restaurante " + tipoRestaurante.getDescripcion() + " fue actualizado exitósamente.");
//			}else {
//				System.err.println("Hubo un error al actualizar el tipo de restaurante");
//			}
//		}catch(SQLException e) {
//			System.err.println("Error: " + e.getMessage());
//		}
		
		// :::::::::::: PRUEBA DE DELETE ::::::::::::::::
		
//		TipoRestaurante tipoRestaurante = new TipoRestaurante();
//		tipoRestaurante.setIdTipoRestaurante(1);
//		tipoRestaurante.setDescripcion("Griego");
//		
//		try {
//			int guardado = tipoRestauranteDAOImpl.eliminar(tipoRestaurante.getIdTipoRestaurante());
//			
//			if(guardado > 0) {
//				System.out.println("El tipo de restaurante "+ tipoRestaurante.getDescripcion() +" fue eliminado exitósamente.");
//			}else {
//				System.err.println("Hubo un error al elimininar el tipo de restaurante");
//			}
//		}catch(SQLException e) {
//			System.err.println("Error: " + e.getMessage());
//		}
		
		// ::::::::::::::: PRUEBA DE SELECT :::::::::::::::::::::
		
//		try {
//			List<TipoRestaurante> tiposConsultados = tipoRestauranteDAOImpl.consultar();
//			
//			for (TipoRestaurante tipoRestaurante : tiposConsultados) {
//				System.out.println("ID: " + tipoRestaurante.getIdTipoRestaurante());
//				System.out.println("DESCRIPCIÓN: " + tipoRestaurante.getDescripcion());
//				System.out.println("ESTATUS: " + tipoRestaurante.isEstatus() + "\n");
//			}
//		}catch(SQLException e) {
//			System.out.println("Error: " + e.getMessage());
//			e.printStackTrace();
//		}
		
		// ::::::::::::::: PRUEBA DE SELECT WHERE :::::::::::::::::
		
		try {
			TipoRestaurante tipoConsultado = tipoRestauranteDAOImpl.consultarPorId(3);
			
			if (tipoConsultado != null ) {
				System.out.println("ID: " + tipoConsultado.getIdTipoRestaurante());
				System.out.println("DESCRIPCIÓN: " + tipoConsultado.getDescripcion());
				System.out.println("ESTATUS: " + tipoConsultado.isEstatus());
			}else {
				System.out.println("No se encontró el tipo de restaurante que buscas. :(");
			}
		}catch(SQLException e) {
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
		} catch (RestauranteException e) {
			System.out.println(e.getErrorCode());
			e.printStackTrace();
		}
	}

}

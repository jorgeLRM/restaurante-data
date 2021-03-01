package com.jorge.restaurantedata.enums;

public enum CodigoEnum {
	
	SINTAXIS_SQL_ERROR_CODE(100);
	
	private int code;
	
	private CodigoEnum(int code) {
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}
	
	public void setCode() {
		this.code = code;
	}
}

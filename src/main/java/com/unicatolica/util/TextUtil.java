package com.unicatolica.util;

public class TextUtil {
	private StringBuilder builder = new StringBuilder();
	
	public String getPrinter() {
		return builder.toString();
	}
	
	public void write(String trecho) {
		builder.append(trecho).append("\n");
	}
}
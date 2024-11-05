package br.com.cod3r.cm.model;

import java.util.ArrayList;
import java.util.List;

public class Field {
	private final int line;
	private final int column;
	
	private boolean opened = false;
	private boolean undermined = false;
	private boolean marked = false;
	
	private List<Field> neighbors = new ArrayList<Field>();
	
	Field(int line, int coluna) {
		this.line = line;
		this.column = coluna;
	}
	

}

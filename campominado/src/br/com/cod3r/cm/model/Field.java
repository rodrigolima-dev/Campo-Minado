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
	
	public Field(int line, int column) {
		this.line = line;
		this.column = column;
	}
	
	public boolean neighborsAdd(Field neighbor) {
		boolean differentLine = line != neighbor.line;
		boolean differentColumn = column != neighbor.column;
		boolean diagonal = differentLine && differentColumn;
		
		//Delta = Diferença
		int deltaLine = Math.abs(line - neighbor.line);
		int deltaColumn = Math.abs(column - neighbor.column);
		int deltaGeneral = deltaColumn + deltaLine;
		
		if(deltaGeneral == 1 && !diagonal) {
			neighbors.add(neighbor);
			return true;
		} else if(deltaGeneral == 2 && diagonal) {
			neighbors.add(neighbor);
			return true;
		} else {
			return false;
		}
		
	}
	

}

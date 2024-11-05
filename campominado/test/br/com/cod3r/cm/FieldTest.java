package br.com.cod3r.cm;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.cod3r.cm.model.Field;

public class FieldTest {
	//Campo clicado.
	private Field field;
	
	@BeforeEach
	void initField() {
		field = new Field(3, 3);
	}
	
	@Test
	void testNeighborReal() {
		Field neighbor = new Field(5, 6);
		//True = vizinho | false = não é vizinho
		boolean result = field.neighborsAdd(neighbor);
		assertTrue(result);
	}
	
	@Test
	void testNeighborRealDistance2() {
		Field neighbor2 = new Field(2,2);
		boolean result = field.neighborsAdd(neighbor2);
		assertTrue(result);
;	}
}

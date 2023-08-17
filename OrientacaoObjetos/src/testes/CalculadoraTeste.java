package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import classes.Calculadora;

class CalculadoraTeste {

	
	@Test
	void doisMaisDoisDeveriaSerQuatro() {
		Calculadora c = new Calculadora();
		assertEquals(4,c.soma(2, 2));
		
	}
	
	@Test
	void tresMaisSeteDeveriaDez() {
		Calculadora c = new Calculadora();
		assertEquals(10,c.soma(3, 7));
		
	}

}

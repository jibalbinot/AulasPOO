
package testes;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JUnitTeste {
	@Test
	public void test_Junit() {
		System.out.println("Testando JUnit");
		String str = "Vamos checar";
		assertEquals("Vamos checar", str);
	}
}

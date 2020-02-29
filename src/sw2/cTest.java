package sw2;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class cTest {

	@Test
	void test1() {
		assertEquals(15,hw2.add(10, 5));
		
	}
	@Test
	void test2() {
		assertEquals(5,hw2.sub(10, 5));
		
	}
	@Test
	void test3() {
		assertEquals(50,hw2.mul(10, 5));
		
	}
	@Test
	void test4() {
		assertThrows(ArithmeticException.class,()->hw2.div(10, 0));
		
	}

}

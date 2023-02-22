package quiz3_unittest64021610;
import static org.junit.Assert.*;

import org.junit.Test;

public class TestSquare {
	
	QuizOneJunit obj = new QuizOneJunit();

	@Test
	public void test1() {
		assertEquals(obj.square(10), 100);

	}

	@Test
	public void test2() {
		assertNotEquals(obj.checkTwoLetter("aabbffaa"), obj.checkTwoLetter("aaffbbAA"));
	}

	@Test
	public void test3() {
		assertTrue(obj.countLetterA("kAokwaanSaakson") > 4);
	}


}

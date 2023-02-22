package quiz3_unittest64021610;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestcountLetterA {
	
	QuizOneJunit obj = new QuizOneJunit();

	@Test
	public void test1() {
		assertEquals(obj.countLetterA("kanokwanAA"), 4);

	}

	@Test
	public void test2() {
		assertNotEquals(obj.countLetterA("Cola FAAt caAt"), 8);
	}

	@Test
	public void test3() {
		assertTrue(obj.countLetterA("chachaeAAAAAA") > 5);
	}

	@Test
	public void test4() {
		assertFalse(obj.countLetterA("CatAAt cla") == 3);
	}

	@Test
	public void test5() {
		assertSame(obj, obj);
	}
	
}

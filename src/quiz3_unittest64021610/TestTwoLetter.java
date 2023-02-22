package quiz3_unittest64021610;
import static org.junit.Assert.*;

import org.junit.Test;
public class TestTwoLetter {
	QuizOneJunit obj = new QuizOneJunit();
	
	@Test
	public void test1() {
		assertEquals(obj.checkTwoLetter("colaAAAAAco"), true);
	}

	@Test
	public void test2() {
		assertNotEquals(obj.checkTwoLetter("satyyysa"), obj.checkTwoLetter("satyyySA"));
	}

	@Test
	public void test3() {
		assertTrue(obj.checkTwoLetter("saloooosa") == obj.checkTwoLetter("colaaaaco"));
	}

	@Test
	public void test4() {
		assertFalse(obj.checkTwoLetter("dolllllldo") == false);
	}

	@Test
	public void test5() {
		assertNotNull(obj.checkTwoLetter("kanokwan"));
	}

}

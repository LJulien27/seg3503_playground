
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class TicTest {

	@Test
	void test() {
		Tic board = new Tic(3, 3);
		Tic board2 = new Tic(3, 3);
		assertEquals(board, board2);
		// testing ability to declare a board
	}

	@Test
	public void emptyBoardTest1() {
		Tic actual = new Tic(2, 1);
		String[][] expected = { { "_" }, { "_" } };
		assertTrue(Arrays.deepEquals(expected, actual.board));
	}

	@Test
	public void test2() {
		Tic actual = new Tic(3, 1);
		String[][] expected = { { "_" }, { "_" }, { "_" } };
		assertTrue(Arrays.deepEquals(expected, actual.board));
	}

	@Test
	public void test3() {
		Tic actual = new Tic(3, 2);
		String[][] expected = { { "_", "_" }, { "_", "_" }, { "_", "_" } };
		assertTrue(Arrays.deepEquals(expected, actual.board));
	}

	@Test
	public void test4() {
		Tic actual = new Tic(4, 1);
		String[][] expected = { { "_" }, { "_" }, { "_" }, { "_" } };
		assertTrue(Arrays.deepEquals(expected, actual.board));
	}

	@Test
	public void test5() {
		Tic actual = new Tic(3, 3);
		Tic actual2 = new Tic(3, 3);
		assertTrue(actual.Equals(actual2));
	}

	@Test
	public void test6() {
		Tic actual = new Tic(4, 3);
		Tic actual2 = new Tic(4, 3);
		assertTrue(actual.Equals(actual2));
	}

	@Test
	public void test7() {
		Tic actual = new Tic(4, 1);
		Tic actual2 = new Tic(4, 1);
		assertTrue(actual.Equals(actual2));
	}

}

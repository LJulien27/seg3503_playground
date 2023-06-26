
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
		String[][] expected = { { "_" } };
		assertTrue(Arrays.deepEquals(expected, actual.board));
	}

}

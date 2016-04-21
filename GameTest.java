import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class GameTest {

	@Test
	public void testGetWord() throws IOException 
	{
		Game.loadChoices();
		Game.getWord(0);
		assertTrue(Game.getAnswer().equals("word"));
	}

	@Test
	public void testSplitWord() throws IOException
	{
		Game.loadChoices();
		Game.getWord(0);
		Game.splitWord();
		assertTrue(String.valueOf(Game.getLetter(0)).equals("w"));
	}

	@Test
	public void testClearArray() throws IOException 
	{
		Game.loadChoices();
		Game.clearArray();
		boolean t = Game.empty();
		assertTrue(t == true);
	}

}

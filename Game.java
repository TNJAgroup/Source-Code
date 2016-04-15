import java.io.IOException;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.*;

public class Game 
{
	static String answer;
	static char character;
	public static ArrayList<String> choices = new ArrayList<String>();
	static ArrayList<Character> letters = new ArrayList<Character>();
	
	public static void loadChoices() throws IOException
	{
		File loadedPlanner = new File("src/choices.txt");
		FileReader loadedReader = new FileReader(loadedPlanner);
		BufferedReader loadedBuffer = new BufferedReader(loadedReader);
		StringBuffer stringBuffer = new StringBuffer();
		String plannerEntry;
		while((plannerEntry = loadedBuffer.readLine()) != null)
		{
			stringBuffer.append(plannerEntry);
			stringBuffer.append("\n");
			choices.add(plannerEntry);
		}
		loadedReader.close();
	}
	
	public static void getWord(int n)
	{
		answer = choices.get(n);
	}
	
	public static String getAnswer()
	{
		return answer;
	}
	
	public static void splitWord()
	{
		for(int i = 0; i<answer.length(); i++)
		{
			char a = answer.charAt(i);
			letters.add(a);
		}
	}
	
	public static char getLetter(int n)
	{
		return letters.get(n);
	}
	
	public static char getCharacter()
	{
		return character;
	}
	
	public static void clearArray()
	{
		choices.clear();
		letters.clear();
	}
	
	public static boolean empty()
	{
		return choices.isEmpty();
	}
}

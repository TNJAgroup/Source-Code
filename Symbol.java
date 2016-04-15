

	public class Symbol
	{
		private static char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
				'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
				'w', 'x', 'y', 'z'};
		private static char[] symbol = {'!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '1', '2',
				'3', '4', '5', '6', '7', '8', '9', '0', '~', '+', '=', '-', '>', '?'};
		

				public static char[] letterShift(int shift_val)
				{
				    char[] shiftAlphabet = new char[26];
				    for (int i = 0; i < 26; i++)
				    {
				        if(((i + shift_val) < 26) && ((i + shift_val) >= 0))
				        {
				            shiftAlphabet[i]  = alphabet[i + shift_val];
				        }
				        else if ((i + shift_val) >= 26)
				        {
				            shiftAlphabet[i] = alphabet[i + shift_val - 26];
				        }
				    }
				    return shiftAlphabet;
				}
				public static String encrypt(String string, int shift)
				{
				    String example = "";
				    for(int i = 0; i < string.length(); i++)
				    {
				        char letter = string.charAt(i);
				        if (letter != ' ')
				        {
				            int finder = find(alphabet, letter);
				            if(((finder + shift) < 26) && ((finder + shift) >= 0))
				            {
				                letter  = symbol[finder + shift];
				            }
				            else if ((finder + shift) >= 26)
				            {
				                letter = symbol[finder + shift - 26];
				            }
				            example = example + String.valueOf(letter);
				        }
				        else 
				        {
				            example = example + " ";
				        }
				    }
				    return example;
				}
				public static String decrypt(String string, int shift)
				{
				    String example = "";
				    for(int i = 0; i < string.length(); i++)
				    {
				        char letter = string.charAt(i);
				        if (letter != ' ')
				        {
				            int finder = find(symbol, letter);
				            if(((finder + shift) < 26) && ((finder + shift) >= 0))
				            {
				                letter  = alphabet[finder + shift];
				            }
				            else if ((finder + shift) >= 26)
				            {
				                letter = alphabet[finder + shift - 26];
				            }
				            example = example + String.valueOf(letter);
				        }
				        else 
				        {
				            example = example + " ";
				        }
				    }
				    return example;
				}
				
				public static int find(char[] chara, char character)
				{
				    int pos = 0;
				    for(int i = 0; i < chara.length; i++)
				    {
				        if(chara[i] == (character))
				            pos = i;
				    }
				    return pos;
				}
              
	}


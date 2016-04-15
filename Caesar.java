
public class Caesar {

	    static String caesar_cipher(String value, int shift) {
		char[] p_holder = value.toCharArray();

		for (int i = 0; i < p_holder.length; i++) {

		    char spot = p_holder[i];
		    spot = (char) (spot + shift);
		    if (spot > 'z') {
			spot = (char) (spot - 26);
		    } else if (spot < 'a') {
			spot = (char) (spot + 26);
		    }
		    p_holder[i] = spot;
		}

		return new String(p_holder);
	    }

	    
	}


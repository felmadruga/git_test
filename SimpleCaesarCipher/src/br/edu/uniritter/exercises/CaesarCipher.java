package br.edu.uniritter.exercises;


/**
 * Simple class that calculates the Caesar's cipher for a 
 * given String
 * @author Felipe Madruga
 *
 */
public class CaesarCipher {
	
	/**
	 * Lower case english alphabet.
	 */
	private static final String lowerAlphabet = "abcdefghijklmnopqrstuvwxyz";

	/**
	 * Upper case english alphabet.
	 */
	private static final String upperAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	/**
	 * Creates a CaesarCipher object.
	 */
	public CaesarCipher() {}
	
	/**
	 * Calculates the Caesar's cipher for a given String. 
	 * @param original Original string.
	 * @param shiftCount The number of shifts.
	 * @return The encrypted string.
	 */
	public String encrypt(String original, int shiftCount){
		char[] lRet = new char [original.length()];
		for (int i = 0; i < original.length(); i++) {
			int index = lowerAlphabet.indexOf(original.charAt(i));
			if (index != -1){
				lRet[i] = lowerAlphabet.charAt((index + shiftCount) % 26);
			} else {
				index = upperAlphabet.indexOf(original.charAt(i));
				if (index != -1){
					lRet[i] = upperAlphabet.charAt((index + shiftCount) % 26);
				} else {
					lRet[i] = original.charAt(i);
				}
			}
		}
		return String.valueOf(lRet);
	}

}

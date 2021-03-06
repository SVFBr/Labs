import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * 1) Write a java program to find the duplicate words and their number of
 * occurrences in a string??
 */

public class Solution {

	public static void main(String[] args) {

		contagem("a a a b b c");
	}

	public static void contagem(String palavras) {
		String[] elementos = palavras.split(" ");
		HashMap<String, Integer> registroPalavras = new LinkedHashMap<String, Integer>();

		for (String palavra : elementos) {
			registroPalavras.put(palavra,
					(registroPalavras.get(palavra) == null ? 1 : (registroPalavras.get(palavra) + 1)));
		}

		System.out.println(registroPalavras);
	}

}
package manipulacaoDeStrings;

public class AlterarString {

	
	public static void main(String[] args) {
		
		String frase = "?1123,456.00";
		String frase2 = "123";
		
		String nova = frase.replace("?", "9");
		String s;
		double total;
		
//		if (!frase.isEmpty()) frase = frase.substring (0, frase.length() - 1);
		
		s =  frase.substring (1);
		total = Double.parseDouble(s.replace(",", ""));
		
		System.out.println(Double.parseDouble(s.replace(",", "")) > Integer.parseInt(frase2));
	}
}

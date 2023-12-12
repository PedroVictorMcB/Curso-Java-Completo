package secao7;



public class FuncoesString {

	public static void main(String[] args) {
		
		String primeiraFrase = "abcde FGHIJ ABC abc DEFGH    ";
		
		String lowCase = primeiraFrase.toLowerCase();
		
		String upperCase = primeiraFrase.toUpperCase();
		
		String trim = primeiraFrase.trim();
		
		String substring = primeiraFrase.substring(5);
		
		String substring2 = primeiraFrase.substring(2, 22);
		
		String replace = primeiraFrase.replace("a", "*");
		
		String replaceSubStr = primeiraFrase.replaceAll("abc", "012");
		
		System.out.println("TEXTO MODELO: " + primeiraFrase + "\n");
		
		System.out.println("Usando toLowerCase() no texto modelo: -" + lowCase + "-\n");
		
		System.out.println("Usando toUpperCase() no texto modelo: -" + upperCase + "-\n");
		
		System.out.println("Usando trim() no texto modelo: -" + trim + "-\n");
		
		System.out.println("Usando substring(valor inteiro do index inicial) no texto modelo: -" + substring + "-\n");
		
		System.out.println("Usando substring(valor inteiro do index inicial, e valor inteiro do index final) no texto modelo: -" + substring2 + "-\n");
		
		System.out.println("Usando replace(valor char inicial, valor char final) no texto modelo: -" + replace + "-\n");
		
		System.out.println("Usando replace(valor char inicial, valor char final) no texto modelo, para substituir uma substring: -" + replaceSubStr + "-\n");

	}

}

package application;

//Classe do Programa principal

import java.util.Locale;
import java.util.Scanner;

import secao8.Products;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Products product = new Products();
		System.out.println("Enter product Data: ");
		System.out.print("Name: ");
		product.name = sc.nextLine();
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		System.out.print("Quantity: ");
		product.quantity = sc.nextInt();
		
		sc.close();
		
		System.out.println("Product: " + product.name + ", Price: " + product.price + ", Quantity: " + product.quantity + ", Total Value: "
				+ product.totalValue() + ".");
	}

}

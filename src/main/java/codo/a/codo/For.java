package codo.a.codo;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {

		Scanner teclado =new Scanner(System.in);
		System.out.println("ingrese N");
		
		int n= teclado.nextInt();
		
		for(int i=0; i<=n;i++) {
			System.out.println(i);
		}

	}

}

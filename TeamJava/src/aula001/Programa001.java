package aula001;

import java.util.Scanner;

public class Programa001 
{
	public static void main(String[] args)
	{
		/* Texto */
		System.out.println("Ol�! Qual seu nome?");
		
		/* Ler nome */
		Scanner in  = new Scanner(System.in);
		String nome = in.nextLine();

		/* Texto e vari�vel */
		System.out.println();
		System.out.printf("Ol�, %s!\n", nome);
	}
}

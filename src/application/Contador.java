package application;

import java.util.Scanner;

import exception.ParametrosInvalidosException;

public class Contador {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o primeiro parâmetro: ");
		int parametroUm = input.nextInt();
		
		System.out.println("Digite o segundo parâmetro:");
		int parametroDois = input.nextInt();
		
		try {
			
			contar(parametroUm, parametroDois);
			
			
			
		}
		catch(ParametrosInvalidosException e){
			
			System.out.println(e.getMessage());
			
			
			
		}
		
		
		
		
		input.close();
	}
	
	static void contar (int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		
		if (parametroUm > parametroDois) {
			
			throw new ParametrosInvalidosException("O parâmetro um deve ser menor que o parâmetro dois");
		}
		
		int contagem = parametroDois - parametroUm;
		
		for (int i = 1; contagem >= i; i++) {
			
			System.out.println(i);
		}
		
		
		
	}

}

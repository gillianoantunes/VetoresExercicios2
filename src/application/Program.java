package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o tamanho do vetor");
		int n = sc.nextInt();
		//declara��o de vetor
		double[] vetor = new double[n];
		
		for(int i = 0; i < n ; i++) {
			System.out.println("Digite a altura");
			vetor[i] = sc.nextDouble();
		}
		double soma = 0.0;
		for ( int i = 0; i < n; i++) {
			soma += vetor[i];
		}
		double avg = soma/n;
		System.out.printf("M�dia das alturas �: %.2f", avg);
		
		// fazendo declaraca��o vetor do tipo classe Product
		
		Product[] vetorreferencia = new Product[n];
		
		//alimentando o vetor com nome e preco
		//ao inves de usar n, usar vetor.length que sabe o tamanho do vetor
		for(int i = 0; i< vetorreferencia.length ; i++) {
			sc.nextLine();
		    System.out.printf("%n Digite o nome do produto:");
			String nome = sc.nextLine();
			System.out.printf("%n Digite o pre�o do produto:");
			double preco = sc.nextDouble();
			//vetor recebendo o Produto com nome e pre�o
			vetorreferencia[i]= new Product(nome, preco) ;
		}
		
		//fazendo a soma pegando apenas o preco com getPreco
		double soma2 = 0.0;
		for(int i = 0; i< n; i++) {
			soma2 += vetorreferencia[i].getPreco();
		}
		double avg2 = soma2/n;
		System.out.printf("m�dia de pre�os: %.2f" , avg2);
		
		//Alimentando vetor assim tamb�m
		
		String[] vetor3 = new String[] {"Gilliano", "Kau�", "Kaiky"};
		
		//Para percorrer utilizando for each
		
		for(String objeto : vetor3) {
			System.out.println(objeto);
		}
		sc.close();
		
		
		

	}
	

}

package AtividadesGen.Collection2;

import java.util.ArrayList;
import java.util.Scanner;



public class Collections {

	public static void main(String[] args) {
		
	
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		int soma, quantidade, numadd, subtracao;
		
		
		
		
		String Produto1 = "Gabinete";
		String Produto2 = "Memoria RAM";
		String Produto3 = "SSD";
		String Produto4 = "Placa de vídeo";
		String Produto5 = "Processador";
		String Produto6 = "Tela";
		
		ArrayList<String> Produtos = new ArrayList<>();
		
		Produtos.add(Produto1);//-->[0]
		Produtos.add(Produto2);//-->[1]
		Produtos.add(Produto3);//-->[2]
		Produtos.add(Produto4);//-->[3]
		Produtos.add(Produto5);//-->[4]
		Produtos.add(Produto6);//-->[5]
		
		System.out.println("Digite o numero do produto: ");
		num = sc.nextInt();
		
		
		do {
		if(num == 1) {
			System.out.println("===Gabinetes===");
			System.out.println("Marca: K-mex\nquantidade: 2");
			System.out.println("===================");
		
			System.out.println("Quantidade: ");
			quantidade = sc.nextInt();
			System.out.println("Quantos deseja adicionar ? ");
			numadd = sc.nextInt();
		
			
		    System.out.println("Digite a se quer add ou remover produtos: ");
			num = sc.nextInt();
			
			if(num == 0) {
				soma = quantidade + numadd;
				System.out.println("A quantidade de produtos agora é: " + soma);
			}
			if(num == 9) {
			subtracao = quantidade - numadd;
			System.out.println("A quantidade de produtos agora é: " + subtracao);
			}
			
			
	 }	
		}while(num == 1);System.out.println("Digite o numero do produto: ");
		                 num = sc.nextInt();
		
		
		 
		do {
		if(num == 2) {
			System.out.println("===Memorias Ram===");
			System.out.println("Marca: KINGSTON\nQuantidade: 20\nMarca: CORSAIR\nQuantidade: 40\nMarca: ADATA\nQuantidade: 0 ");
			System.out.println("==================");
			
			System.out.println("Quantidade: ");
			quantidade = sc.nextInt();
			System.out.println("Quantos deseja adicionar ? ");
			numadd = sc.nextInt();
		
			
		    System.out.println("Digite a se quer add ou remover produtos: ");
			num = sc.nextInt();
			
			if(num == 0) {
				soma = quantidade + numadd;
				System.out.println("A quantidade de produtos agora é: " + soma);
			}
			if(num == 9) {
			subtracao = quantidade - numadd;
			System.out.println("A quantidade de produtos agora é: " + subtracao);
			}
	}
		}while(num == 1);System.out.println("Digite o numero do produto: ");
        num = sc.nextInt();
        
		do {
		if(num == 3) {
			System.out.println("===SSD===");
			System.out.println("Marca: San Disk\nQuantidade: 60\nMarca: Samsung\nQuantidade: 30\nMarca: Kingston\nQuantidade: 90");
			System.out.println("==================");
			
			System.out.println("Quantidade: ");
			quantidade = sc.nextInt();
			System.out.println("Quantos deseja adicionar ? ");
			numadd = sc.nextInt();
		
			
		    System.out.println("Digite a se quer add ou remover produtos: ");
			num = sc.nextInt();
			
			if(num == 0) {
				soma = quantidade + numadd;
				System.out.println("A quantidade de produtos agora é: " + soma);
			}
			if(num == 9) {
			subtracao = quantidade - numadd;
			System.out.println("A quantidade de produtos agora é: " + subtracao);
			}
	}
		}while(num == 1);System.out.println("Digite o numero do produto: ");
        num = sc.nextInt();
		do {
		if(num == 4) {
			System.out.println("===Placa de Vídeo===");
			System.out.println("Marca: GIGABYTE\nQuantidade: 100\nMarca: EVGA\nQuantidade: 50\nMarca: GALAXY\nQuantidade: 43");
			System.out.println("==================");
			
			System.out.println("Quantidade: ");
			quantidade = sc.nextInt();
			System.out.println("Quantos deseja adicionar ? ");
			numadd = sc.nextInt();
		
			
		    System.out.println("Digite a se quer add ou remover produtos: ");
			num = sc.nextInt();
			
			if(num == 0) {
				soma = quantidade + numadd;
				System.out.println("A quantidade de produtos agora é: " + soma);
			}
			if(num == 9) {
			subtracao = quantidade - numadd;
			System.out.println("A quantidade de produtos agora é: " + subtracao);
			}
		}
		}while(num == 1);System.out.println("Digite o numero do produto: ");
        num = sc.nextInt();
		do {
		if(num == 5) {
			System.out.println("===Processador===");
			System.out.println("Marca: Intel\nQuantidade: 200\nMarca: AMD\nQuantidade: 90");
			System.out.println("==================");
			
			System.out.println("Quantidade: ");
			quantidade = sc.nextInt();
			System.out.println("Quantos deseja adicionar ? ");
			numadd = sc.nextInt();
		
			
		    System.out.println("Digite a se quer add ou remover produtos: ");
			num = sc.nextInt();
			
			if(num == 0) {
				soma = quantidade + numadd;
				System.out.println("A quantidade de produtos agora é: " + soma);
			}
			if(num == 9) {
			subtracao = quantidade - numadd;
			System.out.println("A quantidade de produtos agora é: " + subtracao);
			}
		}
		}while(num == 1);System.out.println("Digite o numero do produto: ");
        num = sc.nextInt();
		
        do {
		if(num == 6) {
			System.out.println("===Tela===");
			System.out.println("Marca: Acer\nQuantidade: 30\nMarca: LG\nQuantidade: 50\nMarca: Alienware\nQuantidade:  200");
			System.out.println("==================");
			
			System.out.println("Quantidade: ");
			quantidade = sc.nextInt();
			System.out.println("Quantos deseja adicionar ? ");
			numadd = sc.nextInt();
		
			
		    System.out.println("Digite a se quer add ou remover produtos: ");
			num = sc.nextInt();
			
			if(num == 0) {
				soma = quantidade + numadd;
				System.out.println("A quantidade de produtos agora é: " + soma);
			}
			if(num == 9) {
			subtracao = quantidade - numadd;
			System.out.println("A quantidade de produtos agora é: " + subtracao);
			}
		
			
		}
        }while(num == 1);System.out.println("Digite o numero do produto: ");
        num = sc.nextInt();
	     
	}
}

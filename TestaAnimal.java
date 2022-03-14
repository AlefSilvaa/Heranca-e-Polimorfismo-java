package AtividadesGen;

public class TestaAnimal1 {

	public static void main(String[] args) {
		
		Cachorro1 ch = new Cachorro1();
		
		System.out.println("======================================");
		ch.nome();
		ch.idade();
		ch.som();
		ch.acao();

		System.out.println("=======================================");
		
		Cavalo1 cv = new Cavalo1();
		
		System.out.println("========================================");
		cv.nome();
		cv.idade();
		cv.som();
		cv.acao();
		
		System.out.println("========================================");
		
		Preguiça pr = new Preguiça();
		
		System.out.println("=========================================");
		pr.nome();
		pr.idade();
		pr.som();
		pr.acao();
		
		System.out.println("==========================================");
		
	}

}
package AtividadesGen;

public class Cavalo1 implements Animal1{

	@Override
	 public void nome() {
		System.out.println("Cavalo");
	}
	@Override
	public void idade() {
		System.out.println("13 Anos");
	}
	@Override
	public void som() {
		System.out.println("hinn in in");
	}
    @Override
    public void acao() {
    	System.out.println("Correndo....");
    }
	
}
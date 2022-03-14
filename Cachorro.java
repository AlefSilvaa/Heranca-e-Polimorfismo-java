package AtividadesGen;

public class Cachorro1 implements Animal1{
	
	@Override
	public void nome() {
		System.out.println("Cachorro");
	}
	@Override
	public void idade() {
		System.out.println("9 Anos");
	}
	@Override
	public void som() {
		System.out.println("AU au");
	}
    @Override
    public void acao() {
    	System.out.println("Correndo....");
    }
}
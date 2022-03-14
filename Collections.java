package AtividadesGen.Collection2;

public class CollectionInicio {

	private int numproduto;
	private String nome;
	private int quantidade;
	
	public CollectionInicio(int numproduto, String nome, int quantidade) {
		super();
		this.numproduto = numproduto;
		this.nome = nome;
		this.quantidade = quantidade;
	}

	public int getNumproduto() {
		return numproduto;
	}

	public void setNumproduto(int numproduto) {
		this.numproduto = numproduto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
	
}
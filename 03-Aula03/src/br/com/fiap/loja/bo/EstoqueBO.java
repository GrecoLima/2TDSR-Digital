package br.com.fiap.loja.bo;

public class EstoqueBO {

	private int codProduto;

	
	/**
	 * @param codProduto
	 */
	public EstoqueBO(int codProduto) {
		super();
		this.codProduto = codProduto;
	}

	/**
	 * @return the codProduto
	 */
	public int getCodProduto() {
		return codProduto;
	}

	/**
	 * @param codProduto the codProduto to set
	 */
	public void setCodProduto(int codProduto) {
		this.codProduto = codProduto;
	}
	
	
}

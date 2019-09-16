package Dominio;

public class Oferta {
	private Integer codigo;
	private Integer multiplicador;


	public Oferta (Integer codigo, Integer multiplicador) {
		this.codigo=codigo;
		this.multiplicador=multiplicador;
	}


	public Integer getCodigo() {
		return codigo;
	}


	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}


	public Integer getMultiplicador() {
		return multiplicador;
	}


	public void setMultiplicador(Integer multiplicador) {
		this.multiplicador = multiplicador;
	}

	
}

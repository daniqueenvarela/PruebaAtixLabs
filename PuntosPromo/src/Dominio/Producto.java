package Dominio;

public class Producto {
	private String nombre;
	private Double precio;
	private Integer codigo;
	
	public Producto (String nombre, Double precio, Integer codigo) {
		this.nombre=nombre;
		this.precio=precio;
		this.codigo=codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precio=" + precio + ", codigo=" + codigo + "]";
	}
	
	
	
	
	
}

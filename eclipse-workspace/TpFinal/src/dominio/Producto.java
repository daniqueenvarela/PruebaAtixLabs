package dominio;

public abstract class Producto {
	String nombre;
	Integer codigo;
	Double precio;
	Integer precioEnPuntos;
	
	public Producto(String nombre, Integer codigo, Double precio, Integer precioEnPuntos) {
		this.nombre=nombre;
		this.codigo=codigo;
		this.precio=precio;
		this.precioEnPuntos=precioEnPuntos;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public Integer getPrecioEnPuntos() {
		return precioEnPuntos;
	}
	public void setPrecioEnPuntos(Integer precioEnPuntos) {
		this.precioEnPuntos = precioEnPuntos;
	} 
}

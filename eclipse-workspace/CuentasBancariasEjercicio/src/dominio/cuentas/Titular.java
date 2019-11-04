package dominio.cuentas;

public class Titular {
	

		private String nombre;
		private String apellido;
		private Long dni;


		public Titular(String nombre, String apellido, Long dni) {
			this.nombre = nombre;
			this.apellido = apellido;
			this.dni = dni;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getApellido() {
			return apellido;
		}

		public void setApellido(String apellido) {
			this.apellido = apellido;
		}

		public Long getDni() {
			return dni;
		}

		public void setDni(Long dni) {
			this.dni = dni;
		}
}

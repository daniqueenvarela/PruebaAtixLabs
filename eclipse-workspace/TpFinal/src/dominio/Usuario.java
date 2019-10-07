package dominio;
import java.util.List;
import java.util.ArrayList;
import dominio.Mail;
import java.util.HashSet;
public class Usuario {
	private String nombre;
	private String apellido;
	private Mail mail;
	private Integer idCliente;
	private String password;
	private HashSet<Mail> mailsAlmacenados = new HashSet<Mail>();
	
	public Usuario(Mail mail, String password) {
		 HashSet<Mail> mailsAlmacenados = new HashSet<Mail>(); 
		for(int i=0; i<mailsAlmacenados.size();i++) {
			if(mail.equals(mailsAlmacenados)){/*NO SE QUE HACER ACA T-T*/
					this.mail=mail;
				}
			}
		
		
		
		for(int j=0; j<password.length();j++) {
			if(password.length()>=8 && password!="12345678") {
				if(password.matches("[A-Z]")) {
					if(password.matches("[a-z]")) {
						if(password.matches("[0-9]")) {
							this.password=password;
					}
				}
				
			}
			
		}
	}
		/*NO SE QUE PONER EN CASO DE QUE NO SE CUMPLAN LAS CONDICIONES PARA VALIDAR LA CONTRASEÑA...*/
	}
	
	

	public Usuario(String nombre, String apellido,Integer idCliente ) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.idCliente=idCliente;
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



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apellido == null) ? 0 : apellido.hashCode());
		result = prime * result + ((idCliente == null) ? 0 : idCliente.hashCode());
		result = prime * result + ((mail == null) ? 0 : mail.hashCode());
		result = prime * result + ((mailsAlmacenados == null) ? 0 : mailsAlmacenados.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (apellido == null) {
			if (other.apellido != null)
				return false;
		} else if (!apellido.equals(other.apellido))
			return false;
		if (idCliente == null) {
			if (other.idCliente != null)
				return false;
		} else if (!idCliente.equals(other.idCliente))
			return false;
		if (mail == null) {
			if (other.mail != null)
				return false;
		} else if (!mail.equals(other.mail))
			return false;
		if (mailsAlmacenados == null) {
			if (other.mailsAlmacenados != null)
				return false;
		} else if (!mailsAlmacenados.equals(other.mailsAlmacenados))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		return true;
	}

	

	
	
	
}

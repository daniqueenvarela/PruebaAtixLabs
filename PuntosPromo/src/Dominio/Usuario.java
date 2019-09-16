package Dominio;

public class Usuario {
	private String mail;
	private String usuario;
	private String password;
	private Integer cantidadDeUsuarios;
	private String Usuarios [];
	
	public Usuario (String mail,String usuario, String password) {
		this.mail=mail;
		this.usuario=usuario;
		this.password=password;
		
	}

	public Boolean ValidarMail() {
		if(mail.endsWith(".com")&&mail.contains(".")&&mail.contains("@")) {
			for(int i=0; i<Usuarios.length;i++) {
			Object other;
			if(mail!=mail) {
				return true;
				}
		
			}
			
		}
		
		return false;
	}

	public Boolean Validarcontraseña() {
		if(password.length()>=8) {
			return true;
		}
		return false;
	}
	
	
	public String getMail() {
		return mail;
	}


	public void setMail(String mail) {
		this.mail = mail;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((mail == null) ? 0 : mail.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((usuario == null) ? 0 : usuario.hashCode());
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
		if (mail == null) {
			if (other.mail != null)
				return false;
		} else if (!mail.equals(other.mail))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (usuario == null) {
			if (other.usuario != null)
				return false;
		} else if (!usuario.equals(other.usuario))
			return false;
		return true;
	}

	


}

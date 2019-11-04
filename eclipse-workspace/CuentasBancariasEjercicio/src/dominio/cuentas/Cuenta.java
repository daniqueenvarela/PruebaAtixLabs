package dominio.cuentas;

import dominio.cuentas.Titular;

public abstract class Cuenta {
	
	private static Long idCuenta;
	private Double saldo;
	private Titular titular;
	private static Long contadorCuenta;
	


	public Cuenta(Titular titular, Double saldo) {
		this.titular = titular;
		Cuenta.idCuenta = ++contadorCuenta;
		this.saldo = saldo;
	}


	public void depositar (Double monto) {
		saldo += monto;
		}
	
	public abstract Boolean extraer(Double monto);
	
	public Long getIdCuenta() {
		return idCuenta;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Titular getTitular() {
		return titular;
	}

	public void setTitular(Titular titular) {
		this.titular = titular;
	}

	public static Long getContadorCuenta() {
		return contadorCuenta;
	}

	@Override
	public String toString() {
		return "Cuenta [idCuenta=" + idCuenta + ", saldo=" + saldo + ", titular=" + titular + "]";
	}

		
}

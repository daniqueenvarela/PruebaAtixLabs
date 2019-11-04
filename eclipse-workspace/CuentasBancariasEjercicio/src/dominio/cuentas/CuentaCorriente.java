package dominio.cuentas;

public class CuentaCorriente extends Cuenta{
	
	private Double interesPorDescubierto;
	private Double descubiertoAcordado;
	private Double interes;

	public CuentaCorriente(Titular titular, Double saldo, Double descubiertoAcordado, Double interes) {
		super(titular,saldo); 
		this.descubiertoAcordado = descubiertoAcordado;
		this.interes = 1d;
	}
	
	
	
	private Double calcularInteresPorDescubierto() {
		return this.getInteresPorDescubierto() * this.getSaldo();
	}

	public Double getDescubiertoAcordado() {
		return getDescubiertoAcordado();
	}

	public void setDescubiertoAcordado(Double descubiertoAcordado) {
		this.descubiertoAcordado = descubiertoAcordado;
	}

	public Double getInteresPorDescubierto() {
		return interesPorDescubierto;
	}

	public void setInteresPorDescubierto(Double interesPorDescubierto) {
		this.interesPorDescubierto = interesPorDescubierto;
	}


	public Double getInteres() {
		return interes;
	}

	public void setInteres(Double interes) {
		this.interes = interes;
	}

	@Override
	public Boolean extraer(Double monto) {
		if (this.getSaldo() + this.descubiertoAcordado >= monto) {
			super.setSaldo(getSaldo()-monto);
			if (this.getSaldo() < 0) {
				this.setSaldo(this.getSaldo() + calcularInteresPorDescubierto());
			}
			return true;
		}
		else {
			throw new RuntimeException("No hay dinero suficiente");
		}
	}

	
	
}

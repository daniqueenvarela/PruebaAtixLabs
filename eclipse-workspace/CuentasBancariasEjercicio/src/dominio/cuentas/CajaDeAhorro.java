package dominio.cuentas;

public class CajaDeAhorro extends Cuenta {

	public CajaDeAhorro(Titular titular, Double saldo) {
		super(titular, saldo);
	}
	
	public void extraer (long monto) throws RuntimeException {
		if(monto<=super.getSaldo()) {
			super.setSaldo(getSaldo()-monto);
			
		}
		else {
			throw new RuntimeException("No hay dinero suficiente");
		}
	}

	@Override
	public Boolean extraer(Double monto) {
		if (super.getSaldo() >= monto && monto > 0) {
			super.setSaldo(getSaldo()-monto);
			return true;	
	}
		else {
			throw new RuntimeException("No hay dinero suficiente");
		}
}
}
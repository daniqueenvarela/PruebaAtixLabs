package dominio.cuentas;

import java.util.Iterator;
import java.util.LinkedList;


public class Banco {
	

		private String nombre;
		private LinkedList<Cuenta> cuenta = new LinkedList<Cuenta>();
		

		public Banco(String nombre) {
			this.nombre = nombre;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public LinkedList<Cuenta> getCuenta() {
			return cuenta;
		}

		public void setCuenta(LinkedList<Cuenta> cuenta) {
			this.cuenta = cuenta;
		}

		public Cuenta buscarPorCbu(Long cbu) {
			for (Cuenta lista : cuenta) {
				if (lista.getIdCuenta().equals(cbu))
					return lista;
			}
			return null;
		}

		public Boolean transferir(Long idCuentaOrigen, Long idCuentaDestino, Double monto) {
			Cuenta cuentaOrigen = buscarPorCbu(idCuentaOrigen);
			Cuenta cuentaDestino = buscarPorCbu(idCuentaDestino);
			Boolean exito = false;
			if (cuentaDestino != null && cuentaOrigen != null) {
				cuentaOrigen.extraer(monto);
				cuentaDestino.depositar(monto);
				exito = true;
			}
			return exito;
		}

		public Boolean agregarCuenta(CajaDeAhorro cuentaUno) {
			if (!cuenta.contains(cuentaUno)) {
				return cuenta.add(cuentaUno);
			}
			return false;
		}

		public boolean eliminarCuentaPorId(Long id) {
			Boolean exito = false;
			Iterator<Cuenta> it = cuenta.iterator();
			while (it.hasNext()) {
				Cuenta cuenta = it.next();
				if (cuenta.getIdCuenta().equals(id)) {
					it.remove();
					exito = true;
				}

			}
			return exito;
		}

	}



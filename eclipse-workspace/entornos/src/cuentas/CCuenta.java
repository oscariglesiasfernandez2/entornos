package cuentas;
/**
 * probando cuentas 
 * @author oscari
 *
 */
public class CCuenta {

	private String nombre;
	private String cuenta;
	private double saldo;
	private double tipoInterés;

	/**
	 * Permite asignar el tipo de interés
	 * 
	 * @param tipoInterés
	 */

	public void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}

	/**
	 * constructor vacio
	 */
	public CCuenta() {
	}

	/**
	 * constructor completo
	 * 
	 * @param nom  que es nombre
	 * @param cue  que es cuenta
	 * @param sal  que es saldo
	 * @param tipo que es el tipo
	 */

	public CCuenta(String nom, String cue, double sal, double tipo) {
		nombre = nom;
		cuenta = cue;
		saldo = sal;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getTipoInterés() {
		return tipoInterés;
	}

	/**
	 * 
	 * @return devuelve el SALDO DE LA CUENTA
	 */
	public double estado() {
		return saldo;
	}

	/**
	 * PERMITE HACER INGRESOS
	 * 
	 * @param cantidad
	 * @throws Exception
	 */
	public void ingresar(double cantidad) throws Exception {
		if (cantidad < 0)
			throw new Exception("No se puede ingresar una cantidad negativa");
		saldo = saldo + cantidad;
	}

	/**
	 * pERMITE HACER RETIRADAS
	 * 
	 * @param cantidad
	 * @throws Exception
	 */

	public void retirar(double cantidad) throws Exception {
		if (cantidad <= 0)
			throw new Exception("No se puede retirar una cantidad negativa");
		if (estado() < cantidad)
			throw new Exception("No se hay suficiente saldo");
		saldo = saldo - cantidad;
	}
}

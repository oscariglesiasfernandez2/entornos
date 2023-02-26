
/**
 * 
 * @author rodolfoUcha
 *
 */
package cuentas;



/**
 * 
 * @author rodolfoucha o xunta
 *
 */

public class CCuenta {
	private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Constructor vacio
     */
    
    public CCuenta()
    {
    }
    
    /**
     * Constructor con todos los parametros
     * @param nom que representa el nonmbre
     * @param cue que representa la cuenta
     * @param sal que representa el saldo
     * @param tipo que representa el tipo de interés
     */

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    
    /**
     * Devuelve el saldo de una cuenta
     * @return saldo
     */

    public double estado()
    {
        return saldo;
    }
    
    /**
     * permite hacer ingresos en la cuenta
     * @param cantidad la cantidad ingresar
     * @throws Exception no permite ingresar cantidades negativas
     */

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }
    
    /**
     * permite hacer retiradas de la cuenta
     * @param cantidad la cantidad que se va a retirar 
     * @throws Exception no permite retirar cantidades superiores a saldo
     */

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
    
   /**
    * recupera el valor de nombre
    * @return nombre
    */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * establece el valor de nombre
	 * @param nombre
	 */

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * recupera el valor de cuenta
	 * @return cuenta
	 */
	
	public String getCuenta() {
		return cuenta;
	}

	/**
	 * establece el valor de cuenta
	 * @return cuenta
	 */
	
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	
	/**
	 * recuperael valor de saldo
	 * @return saldo
	 */
	
	public double getSaldo() {
		return saldo;
	}
	
	/**
	 * establece el valor de saldo
	 * @return saldo
	 */

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	/**
	 * recupera el valor de tipoInteres
	 * @return tipoInteres
	 */

	public double getTipoInterés() {
		return tipoInterés;
	}
	
	/**
	 * establece el valor de tipoInteres
	 * @return tipoInteres
	 */


	public void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}
    
    
}

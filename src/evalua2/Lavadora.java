package evalua2;

/**
 * Contiene informacion de lavadora
 * @author diego
 *
 */

public class Lavadora extends Electrodomesticos {

	//Constante metodos por defecto
	protected static final int CARGA_DEF = 5;

	//Atributos
	private int carga = CARGA_DEF;

	/**
	 * Constructor por defecto
	 */
	public Lavadora() {
	}

	/**
	 *  Constructor con variables pedidas
	 * @param precioBase
	 * @param peso
	 */
	public Lavadora(double precioBase, int peso) {
		super(precioBase, peso);
	}
	/**
	 * constructor con todas las variables 
	 * @param precioBase
	 * @param color
	 * @param consumoEnergetico
	 * @param peso
	 * @param carga
	 */
	public Lavadora(double precioBase, String color, char consumoEnergetico, int peso, int carga) {
		super(precioBase, color, consumoEnergetico, peso);
		this.carga = carga;

	}
	//Metodos public
	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}
	
	/**
	 * Metodo que devuelve precio final
	 * @return
	 */
	public double precioFinal() {

		double fin = super.precioFinal();

		if (carga > 30) {
			fin += 50;
		}
		return fin;
	}

}

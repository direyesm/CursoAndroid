package evalua2;

/**
 * Contiene informacion de Television
 * @author diego
 *
 */

public class Television extends Electrodomesticos {

	//Constante metodos por defecto 
	protected static final int RESOLUCION_DEF = 20;

	//Atributos
	private int resolucion = RESOLUCION_DEF;
	private boolean sintonizadorTDT;

	/**
	 * Constructor por defecto
	 */
	public Television() {
	}
	
	/**
	 * Constructor con variables pedidas
	 * @param precioBase
	 * @param peso
	 */

	public Television(double precioBase, int peso) {
		super(precioBase, peso);
	}
	
	/**
	 * Constructor con todas las variables 
	 * @param precioBase
	 * @param color
	 * @param consumoEnergetico
	 * @param peso
	 * @param resolucion
	 * @param sintonizadorTDT
	 */

	public Television(double precioBase, String color, char consumoEnergetico, int peso, int resolucion,
			boolean sintonizadorTDT) {
		super(precioBase, color, consumoEnergetico, peso);
		this.resolucion = resolucion;
		this.sintonizadorTDT = sintonizadorTDT;
	}

	//Metodos public
	public int getResolucion() {
		return resolucion;
	}

	public void setResolucion(int resolucion) {
		this.resolucion = resolucion;
	}

	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}

	public void setSintonizadorTDT(boolean sintonizadorTDT) {
		this.sintonizadorTDT = sintonizadorTDT;
	}
	
	/**
	 * Metodo que devuelve precio final
	 * @return
	 */
	public double precioFinal() {

		double fin = super.precioFinal();

		if (resolucion > 40) {

			fin += precioBase * 0.30;

		} else if (sintonizadorTDT) {

			fin += 50;
		}
		return fin;

	}

}

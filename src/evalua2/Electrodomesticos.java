package evalua2;

/**
 * Contiene informacion de los electrodomesticos
 * @author diego
 *
 */


public class Electrodomesticos {
	// Constantes metodos por defecto
	protected static final double PRECIO_BASE_DEF = 100000;
	protected static final String COLOR_DEF = "Blanco";
	protected static final char CONSUMO_ENERGETICO_DEF = 'F';
	protected static final int PESO_DEF = 5;
	// Atributos
	protected double precioBase = PRECIO_BASE_DEF;
	protected String color = COLOR_DEF;
	protected char consumoEnergetico = CONSUMO_ENERGETICO_DEF;
	protected int peso = PESO_DEF;

	/**
	 * Constructor por defecto
	 */
	public Electrodomesticos() {
	}

	/**
	 * Constructor con variables pedidas
	 * 
	 * @param precioBase
	 * @param peso
	 */
	public Electrodomesticos(double precioBase, int peso) {
		this.precioBase = precioBase;
		this.peso = peso;
	}

	/**
	 * constructor con todas las variables
	 * 
	 * @param precioBase
	 * @param color
	 * @param consumoEnergetico
	 * @param peso
	 */
	public Electrodomesticos(double precioBase, String color, char consumoEnergetico, int peso) {
		this.precioBase = precioBase;
		comprobarConsumoEnergetico(consumoEnergetico);
		comprobarColor(color);
		this.peso = peso;
	}

	// Metodos public

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public void setConsumoEnergetico(char consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	/**
	 * Metodo que comprueba el consumo de energia
	 * 
	 * @param letra
	 */

	private void comprobarConsumoEnergetico(char letra) {

		if (letra >= 65 && letra <= 700) {
			this.consumoEnergetico = letra;
		} else {
			this.consumoEnergetico = CONSUMO_ENERGETICO_DEF;
		}

	}

	/**
	 * Metodo que comprueba el color ingresado
	 * 
	 * @param color
	 */
	private void comprobarColor(String color) {

		String colores[] = { "blanco", "negro", "rojo", "azul", "gris" };
		boolean encontrado = false;

		for (int i = 0; i < colores.length && !encontrado; i++) {
			if (colores[i].equals(color)) {
				encontrado = true;
			}
			if (encontrado) {
				this.color = color;
			} else {
				this.color = COLOR_DEF;
			}
		}
	}

	/**
	 * Metodo que devuelve precio final
	 * 
	 * @return
	 */
	public double precioFinal() {

		double fin = 0;

		switch (consumoEnergetico) {
		case 'A':
			fin += 100;
			break;
		case 'B':
			fin += 80;
			break;
		case 'C':
			fin += 60;
			break;
		case 'D':
			fin += 50;
			break;
		case 'E':
			fin += 30;
			break;
		case 'F':
			fin += 10;
			break;
		}
		if (peso >= 0 && peso < 19) {
			fin += 10;
		} else if (peso >= 20 && peso < 49) {
			fin += 50;
		} else if (peso >= 50 && peso < 79) {
			fin += 80;
		} else if (peso >= 80) {
			fin += 100;
		}

		return precioBase + fin;

	}

}

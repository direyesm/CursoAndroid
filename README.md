# CursoAndroid

## Readme evaluacion 2 curso android


#Clase Electrodomestico

	/**
    * Contiene informacion de los electrodomesticos
    * 
    * @author diego
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

#Clase Lavadora


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

#Clase Television


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

#Clase Ejecutable

 
    /**
    * Clase ejecutable
    * @author diego
    *
    */

    public class Ejecutable {
	//Se Crea uhn array de Electrodomesticos
	public static void main(String[] args) {

		Electrodomesticos listElectro[] = new Electrodomesticos[10];

		//Se agregan los datos a pedir
		listElectro[0] = new Electrodomesticos(500000, "Rojo", 'e', 60);
		listElectro[1] = new Television(100000, 20);
		listElectro[2] = new Lavadora(150000, 50);
		listElectro[3] = new Electrodomesticos();
		listElectro[4] = new Television(250000, 20);
		listElectro[5] = new Lavadora();
		listElectro[6] = new Electrodomesticos();
		listElectro[7] = new Television();
		listElectro[8] = new Lavadora();
		listElectro[9] = new Electrodomesticos(650000, "Verde", 'd', 40);

		double sumaElectro = 0;
		double sumaTele = 0;
		double sumaLava = 0;

		for (int i = 0; i < listElectro.length; i++) {

			if (listElectro[i] instanceof Electrodomesticos) {

				sumaElectro += listElectro[i].precioFinal();
			}
			if (listElectro[i] instanceof Lavadora) {

				sumaLava += listElectro[i].precioFinal();
			}
			if (listElectro[i] instanceof Television) {

				sumaTele += listElectro[i].precioFinal();
			}
		}

		//Mostramos los resultado
		System.out.println("La suma del precio de los electrodomesticos es de " + sumaElectro);
		System.out.println("La suma del precio de las lavadoras es de " + sumaLava);
		System.out.println("La suma del precio de las televisiones es de " + sumaTele);

	}

    }

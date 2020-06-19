package evalua2;

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

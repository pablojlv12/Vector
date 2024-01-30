package vector;

import java.util.Arrays;

public class MiVector {

	private int datos[];
	int cuantos;

	public MiVector(int cantidad) {
		datos = new int[cantidad];
		cuantos = 0;

	}

	public int add(int num) {

		if (cuantos < datos.length) {

			datos[cuantos] = num;
			cuantos++;
			return cuantos - 1;
		}

		return -1;
	}

	public int del(int num) {

		int pos = buscar(num);
		if (pos != -1) {
			if (pos < cuantos - 1) {
				for (int i = pos; i <= cuantos - 1; i++) {
					datos[i] = datos[i + 1];
				}
				cuantos--;

			}

		}

		return pos;
	}

	private int buscar(int num) {
		int pos = -1;
		for (int i = 0; i < datos.length; i++) {
			if (datos[i] == num) {
				pos = i;
			}
		}
		return pos;
	}

	@Override
	public String toString() {
		String devolver = "[";

		for (int i = 0; i < cuantos - 1; i++) {

			devolver += "" + datos[i] + ", ";

		}

		return devolver + datos[cuantos - 1] + "]" + "\ncuantos: " + cuantos;

	}

}

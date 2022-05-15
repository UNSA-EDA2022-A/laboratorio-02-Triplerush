package com.example.project;

import java.util.Scanner;

public class Exercise2 {

	public static void main(final String[] args) {

		Exercise2 obj = new Exercise2();
		Scanner sc = new Scanner(System.in);
		while (true) {

			int n = sc.nextInt(), suma, temp;
			int a[] = new int[n];

			for (int i = 0; i < n; i++) {
				temp = sc.nextInt();
				a[i] = temp;
			}
			suma = sc.nextInt();

			System.out.println(obj.esSubconjuntoSuma(a,0, suma));
		}
	}
	public boolean esSubconjuntoSumaExt(int a[], int suma) {
		return esSubconjuntoSuma(a,0,suma);
	}
	public boolean esSubconjuntoSuma(int conjunto[],int n, int suma) {
		if (suma == 0)
			return true;
		if (n == conjunto.length)
			return false;
		
		if (conjunto[n] % 7 == 0 && n != conjunto.length-1) {
			if (conjunto[n + 1] == 1)
				return esSubconjuntoSuma(conjunto, n + 1, suma);
			else
				return esSubconjuntoSuma(conjunto, n + 1, suma - conjunto[n]);
		} else
			return esSubconjuntoSuma(conjunto, n + 1, suma - conjunto[n]) || esSubconjuntoSuma(conjunto, n + 1, suma);

	}
}
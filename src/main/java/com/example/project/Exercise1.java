package com.example.project;;

import java.util.Scanner;

public class Exercise1 {

	public static void main(final String[] args) {

		Exercise1 obj = new Exercise1();
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			System.out.println(obj.esCuadradoPerfecto(n));			
		}
	}

	public boolean esCuadradoPerfecto(int numero) {
		if(numero == 1) 
			return true;
		else if(numero <= 0 )
			return false;
			
		double raiz = raizRecursiva(numero,numero/2);//se llama a la funcion empezando por la mitad del número
		double raizNatural  = (int)raiz ;//Se saca la parte natural de la raiz
		
		if(raiz == raizNatural) {
			return true;
		}else {
			return false;
		}
	}

	//funcion para sacar la raiz a un número
	public double raizRecursiva(double numero, double auxNumero) {	    
		double raiz = (auxNumero + (numero / auxNumero)) / 2;//Se calcula el valor aproximado a la raiz
		
		if(auxNumero == raiz) {//Si el valor de 'raiz' se repite dos veces es la raiz del número
			return raiz;
		}else {
	    	return raizRecursiva(numero,raiz);//En el caso de que no se vuelve a llamar pero con el valor actual de la raiz
		}
	}
}
package Ejemplo1;

import java.util.Scanner;

public class MainCircle {
	public static void main(String[]args) {
		Circle circleone=new Circle();
		
		Scanner teclado=new Scanner(System.in);
		System.out.println("-----------------------------");
		System.out.println("Circulo 1:");
		System.out.println("ingrese el radio");
		circleone.setRadius(teclado.nextDouble());
		circleone.printCircle();
		System.out.println("-----------------------------");
		System.out.println(circleone);
	}
	
	
	
	
}

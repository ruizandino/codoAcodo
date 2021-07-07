package tarea2;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Datos {
	static String nombre;
	static String apellido;
	static int edad;
	static String hobbie;
	static String Editorpreferido;
	static String sistOp;
 
	static Scanner sc= new Scanner (System.in);
	
	public static void solicitarDatos() {		V
		
		System.out.println("Ingresa tu nombre");
		nombre= sc.nextLine();
		
		System.out.println("Ingresa tu apellido");
		apellido= sc.nextLine();
		
		System.out.println("cuál es tu hobbie?");
		hobbie= sc.nextLine();
		
		System.out.println("cuál es tu editor preferido?");
		Editorpreferido= sc.nextLine();
		
		System.out.println("qué Sistema operativo usas?");
		sistOp= sc.nextLine();		
		
		System.out.println("Ingresa tu edad");
		edad= sc.nextInt();
	}
	
	public static void mostrarDatos() {	
		System.out.println("nombre: "+nombre+"\napellido: "+apellido+"\nedad: "+edad+"\nhobbie: "+hobbie+"\nEditor preferido: "+Editorpreferido+"\nSist. operativo: "+sistOp);
	}
	

	public static void main(String[] args) {
		solicitarDatos();
		mostrarDatos();
		
	}

}

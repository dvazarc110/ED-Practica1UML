package prueba;

import java.util.Scanner;

public class main {
	
	@SuppressWarnings("resource")

	public void newPedido(){
		
		Pedido pedido;
		Producto producto;
		Scanner keyboard = new Scanner(System.in);
		int cantidad;
		int cont = 0;
		pedido = new Pedido(1);
		System.out.println("¿Cuántos productos quiere añadir?");
		cantidad = keyboard.nextInt();
		
		while (cont!=cantidad) {
			System.out.printf("\nNombre del producto número %d", cont+1);
			String nombre = keyboard.nextLine();
			System.out.printf("\nPrecio del producto número %d", cont+1);
			double precio = keyboard.nextDouble();
			producto = new Producto(nombre, precio);
		}
	}
	
	public static void main(String[] args) {

        new main().newPedido();

    }
	
}

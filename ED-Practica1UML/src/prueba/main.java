package prueba;

import java.util.Scanner;

public class main {
	
	@SuppressWarnings("resource")

	public void newPedido(){
		
		Pedido pedido;
		Producto producto;
		Scanner keyboard = new Scanner(System.in);
		boolean next = false;
		int cantidad;
		int cont = 0;
		pedido = new Pedido(1);
		System.out.println("¿Cuántos productos quiere añadir?");
		cantidad = keyboard.nextInt();
		
		while (cont!=cantidad) {
			System.out.printf("\nNombre del producto número %d\n", cont+1);
			String nombre = keyboard.next();
			
			System.out.printf("Precio del producto número %d\n", cont+1);
			double precio = keyboard.nextDouble();
			producto = new Producto(nombre, precio);
			pedido.agregarProducto(producto);
			cont++;
			if(cont == cantidad) {
				System.out.printf("\nDetalles: \n%s", pedido);
				while(next==false) {
					System.out.println("¿Quiere enviar su pedido?(Y/N)");
					String respuesta = keyboard.next();
					if((respuesta.isEmpty()) || ((respuesta.toLowerCase()).charAt(0) != 'y')) {
						System.out.println("Porfavor, envíe su pedido.");
						next = false;
					}else {
						next = true;
						pedido.setEstado(EstadoPedido.ENVIADO);
						System.out.printf("\nEstupendo, su pedido ha sido enviado. \nDetalles: \n%s", pedido);
					}
				}
			}
		}
		
	}
	
	public static void main(String[] args) {

        new main().newPedido();

    }
	
}

package prueba;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

	public int numero;
	private EstadoPedido estado;
	private List<Producto> productos;
	private String resume = "";
	
	public Pedido(int numero) {
		this.numero = numero;
	    this.estado = EstadoPedido.PENDIENTE; // estado inicial lógico
	    this.productos = new ArrayList<>();
	}

	public void agregarProducto(Producto p) {
	    productos.add(p);
	}

	public double calcularTotal() {
	    double total = 0.0;
	    for (Producto p : productos) {
	    	total += p.getPrecio();
	    }
	    return total;
	}
	
	public String resumePedido() {
		String resume = "";
	    for (Producto p : productos) {
	    	resume = resume.concat(String.format("%s, ",p.getNombre()));
	    }
	    resume = resume.substring(0, (resume.length()-2));
	    return resume;
	}

	public int getNumero() {
	    return numero;
	}

	public EstadoPedido getEstado() {
	    return estado;
	}

	public void setEstado(EstadoPedido estado) {
	    this.estado = estado;
	}
	

	@Override
	public String toString() {
		return String.format("Pedido: %d \nProductos: %s \nEstado: %s \nTotal: %.2f \n", numero, resumePedido(), estado, calcularTotal()); 
	}  
	
	
}

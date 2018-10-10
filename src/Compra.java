import java.util.ArrayList;

public class Compra {
	
	private ArrayList<Producto> productos = new ArrayList<Producto>();
	
	private double descuento;
	
	public Compra() {
		
	}
	
	public void agregarDescuento(double d) {
		
		this.descuento = d;		
		
	}
	
	public void agregarProducto(Producto p) {
		
		productos.add(p);
		
	}
	
	public void eliminarProducto(Producto p) {
		
		productos.remove(p);
	}
	
	public double subtotal() {
		
		/* Calcula el precio total de los productos */
		
		return 0;
		
	}

}

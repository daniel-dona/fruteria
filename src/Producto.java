
public class Producto {
	
	protected String nombre;
	protected double precio;
	protected int cantidad;
	
	public Producto(String nombre, double precio, int cantidad) {
		
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
		
	}
	
	public double getPrecio() {
		
		return this.precio * this.cantidad;
		
	}

}

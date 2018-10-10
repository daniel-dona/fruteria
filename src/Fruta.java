
public class Fruta extends Producto {
	
	boolean temporada;
	
	public Fruta(String nombre, double precio, int cantidad) {
		
		super(nombre, precio, cantidad);
	
	}
	
	public Fruta(String nombre, double precio, int cantidad, boolean temporada) {
		
		super(nombre, precio, cantidad);
		this.temporada = temporada;
		
	}
	
	public double getPrecio() {
		
		double precio;
		
		if(temporada) {
			
			precio = this.precio * this.cantidad * 0.8;
			
		}else {
			
			precio = this.precio * this.cantidad;
		}
		
		return precio;
		
	}

}


public class Main {
	
	public static void main(String args[]) {
		
		Fruteria frut = new Fruteria();
		
		Compra comp = new Compra();
		
		Fruta manzana = new Fruta("Manzana", 1.34, 4);
		
		comp.agregarProducto(manzana);
		
		frut.agregarCompra(comp);

	}

}

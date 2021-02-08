
public class Electrodomestico {
	
	private final static double PRECIO_DEF = 100;
	private final static String COLOR_DEF = "blanco";
	private final static char CONSUMO_DEF = 'F';
	private final static int PESO_DEF = 5;
	
	private double precio_base;
	private String color;
	private char consumo;
	private int peso;
	
	
	public Electrodomestico() {
		this.color=COLOR_DEF;
		this.consumo=CONSUMO_DEF;
		this.precio_base=PRECIO_DEF;
		this.peso=PESO_DEF;
	}
	
	
	public Electrodomestico(double precio_base, int peso) {
		this.color=COLOR_DEF;
		this.consumo=CONSUMO_DEF;
		this.precio_base=precio_base;
		this.peso=peso;
	}
	
	public Electrodomestico(String color, char consumo, double precio_base, int peso) {
		this.color=color;
		this.consumo=consumo;
		this.precio_base=precio_base;
		this.peso=peso;
		comprobarColor();
		comprobarConsumo();
	}
	
	
	private void comprobarConsumo() {

		if (this.consumo != 'A' && this.consumo != 'B' && this.consumo != 'C' && this.consumo != 'D' && this.consumo != 'E' && this.consumo != 'F') {
            this.consumo = CONSUMO_DEF;

        }		
	}


	private void comprobarColor() {
		
		this.color= this.color.toLowerCase();

		if (!this.color.equals("blanco") && !this.color.equals("negro") && !this.color.equals("rojo") && !this.color.equals("azul") && !this.color.equals("gris")) {
            this.color = COLOR_DEF;

        }
		
	}

	
	
	public String getColor() {
		return color;
	}
	
	public char getConsumo() {
		return consumo;
	}
	
	public int getPeso() {
		return peso;
	}
	
	public double getPrecio_base() {
		return precio_base;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setConsumo(char consumo) {
		this.consumo = consumo;
	}
	
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	public void setPrecio_base(double precio_base) {
		this.precio_base = precio_base;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Informacion del Electrodomestico\n"

                + "Color: " + color + "\n"

                + "Consumo: " + consumo + "\n"

                + "Peso: " + peso + " Kg\n"

                + "Precio: " + precio_base + " €\n";
	}
	
	
	
	
	public static void main(String[] args) {
		Electrodomestico electro[]=new Electrodomestico[3];
		
		electro[0]=new Electrodomestico();
		electro[1]=new Electrodomestico(23,8);
		electro[2]=new Electrodomestico("Rojo",'C',50,7);

		System.out.println(electro[0]);
		System.out.println(electro[1]);
		System.out.println(electro[2]);

	}

	
	
	
	
}


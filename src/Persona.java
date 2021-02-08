
public class Persona {
	private String nombre;
	private int edad;
	private String DNI;
	private final static char SEXO_DEF = 'H';
	private int peso;
	private double altura;
	private char sexo;

	public Persona() {
		this.nombre=" ";
		this.edad=0;
		this.peso=0;
		this.altura=0;
	}
	
	public Persona(String nombre, int edad, char sexo) {
		this.nombre=nombre;
		this.edad=edad;
		this.sexo=sexo;
        comprobarSexo();

	}
	
	public Persona(String nombre, int edad, char sexo, String DNI, int peso, double altura) {
		this.nombre=nombre;
		this.edad=edad;
		this.DNI=DNI;
		this.sexo=sexo;
		this.peso=peso;
		this.altura=altura;
        comprobarSexo();

	}
	
	public void setSexo(char sexo){
		this.sexo=sexo;
	}
	public char getSexo() {
		return sexo;
	}
	
	public void comprobarSexo(){
		if (this.sexo != 'H' && this.sexo != 'M') {

            this.sexo = SEXO_DEF;

        }
    }
	
	
	public static void main(String[] args) {
		
		Persona personas[]=new Persona[3];
		
		personas[0]=new Persona("Lucia",28,'M');
		personas[1]=new Persona("David",23,'H');
		personas[2]=new Persona("Carlos",21,'H',"43882200K",68,1.80);

		System.out.println(personas[0]);
		System.out.println(personas[1]);
		System.out.println(personas[2]);

		
	}
	
	public String toString() {

        String sexo;

        if (this.sexo == 'H') {

            sexo = "Hombre";

        } else {

            sexo = "Mujer";

        }

        return "Informacion de la persona\n"

                + "Nombre: " + nombre + "\n"

                + "Sexo: " + sexo + "\n"

                + "Edad: " + edad + " años\n"

                + "DNI: " + DNI + "\n"

                + "Peso: " + peso + " kg\n"

                + "Altura: " + altura + " metros\n";

    }
}

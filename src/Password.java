import java.util.Random;
import java.util.Scanner;

public class Password {

	private int longitud;
	private String contraseña;
	
	
	public Password() {
		this.longitud=8;
		this.contraseña=this.generarPassword();
	}
	
	
	public Password(int longitud) {
		this.longitud=longitud;
		this.contraseña=this.generarPassword();
	}
	


    public String generarPassword(){
    	final char[] caracteres =
            {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P',
                    'Q','R','S','T','U','V','W','X', 'Y','Z',
                    'a','b','c','d','e','f','g','e','h','i','j','l','k','m',
                    'n','o','p','r','s','t','u','v','w','x','y','z',
                    '1','2','3','4','5','6','7','8','9','0',
                    '@','#','!','$','€','&','[',']'};
        String temporal = "";
        Random aleatorio = new Random();
        for(int i = 0; i < this.longitud ; i++){
            temporal += caracteres[aleatorio.nextInt(caracteres.length)];
        }
        return temporal;
    }
	
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.println ("############################");
		System.out.println ("# Generador de Contraseñas #");
		System.out.println ("############################");
		System.out.println ("Introduce la longitud de la contraseña:");
		int pass = teclado.nextInt();
		Password contra=new Password(pass);
		System.out.print(contra);

	}

	@Override
	public String toString() {
		return "Longitud: "+this.longitud+" Password: "+this.contraseña;
	}
}

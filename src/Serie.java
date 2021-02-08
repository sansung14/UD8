
public class Serie {

	private String titulo;
	private int n_temporadas;
	private boolean entregado;
	private String genero;
	private String creador;
	
	
	
	public Serie() {
		this.titulo=" ";
		this.n_temporadas=3;
		this.entregado=false;
		this.genero=" ";
		this.creador=" ";
	}
	
	public Serie(String titulo, String creador) {
		this.titulo=titulo;
		this.n_temporadas=3;
		this.entregado=false;
		this.genero=" ";
		this.creador=creador;
	}
	
	public Serie(String titulo, String creador, int n_temporadas, String genero) {
		this.titulo=titulo;
		this.n_temporadas=n_temporadas;
		this.entregado=false;
		this.genero=genero;
		this.creador=creador;
	}
	
	
	public String getCreador() {
		return creador;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public int getN_temporadas() {
		return n_temporadas;
	}
		
	public String getTitulo() {
		return titulo;
	}
	
	public void setCreador(String creador) {
		this.creador = creador;
	}
	
	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}
	
	public boolean isEntregado() {
		return entregado;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public void setN_temporadas(int n_temporadas) {
		this.n_temporadas = n_temporadas;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	

	public static void main(String[] args) {
		Serie series[]=new Serie[2];
		
		series[0]=new Serie("WestWorld","Jonathan Nolan i Lisa Joy");
		series[1]=new Serie("Game of thrones","D. B. Weiss",8,"Aventuras, fantasia y drama");

		System.out.println(series[0]);
		System.out.println(series[1]);
	}

	
	@Override
	public String toString() {
		return "Informacion de la Serie\n"

                + "Titulo: " + titulo + "\n"

                + "Nº Temporadas: " + n_temporadas + "\n"

                + "Entregado: " + entregado + "\n"

                + "Genero: " + genero + "\n"

                + "Creador: " + creador + "\n";
	}
}

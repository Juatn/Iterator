package Models;

public class jugador {
	
	//ATRIBUTOS

	private String nombre;
	private int dorsal;
	private int edad;
	private float altura;
	private int partidasJugadas;

	//CONSTRUCTOR
	
	public jugador(String nombre, int dorsal, int edad, float altura, int partidasJugadas) {
		super();
		this.nombre = nombre;
		this.dorsal = dorsal;
		this.edad = edad;
		this.altura = altura;
		this.partidasJugadas = partidasJugadas;
	}

	
	//METODOS 
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public int getPartidasJugadas() {
		return partidasJugadas;
	}

	public void setPartidasJugadas(int partidasJugadas) {
		this.partidasJugadas = partidasJugadas;
	}


	@Override
	public String toString() {
		return "jugador [nombre=" + nombre + ", dorsal=" + dorsal + ", edad=" + edad + ", altura=" + altura
				+ ", partidasJugadas=" + partidasJugadas + "]";
	}
	
	
	
	
}


public class Jogada {
	private String tipo; // 0 = corrida, 1 = passe, 2 = trick play
	private int down;
	private int distance;
	private int scrimmage;
	private int jdsConquistadas;

	public Jogada(String tipo, int down, int distance, int scrimmage, int jdsConquistadas){
		this.tipo = tipo;
		this.down = down;
		this.distance = distance;
		this.scrimmage = scrimmage;
		this.jdsConquistadas = jdsConquistadas;
		
	}
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getDown() {
		return down;
	}

	public void setDown(int down) {
		this.down = down;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public int getScrimmage() {
		return scrimmage;
	}

	public void setScrimmage(int scrimmage) {
		this.scrimmage = scrimmage;
	}

	public int getJdsConquistadas() {
		return jdsConquistadas;
	}

	public void setJdsConquistadas(int jdsConquistadas) {
		this.jdsConquistadas = jdsConquistadas;
	}

}

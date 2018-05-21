package polirats.ratstats;

public class Jogada {
	private String tipo;
	private int down;
	private int distance;
	private int scrimmage;
	private int jdsConquistadas;
	private int half;
	private Jogador[] emCampo;
	private int pontRats;
	private int pontAdv;
	private boolean TD;

	public Jogada(String tipo, int down, int distance, int scrimmage, int jdsConquistadas, int pontRats, int pontAdv, boolean TD, int half, Jogador[] emCampo){
		this.tipo = tipo;
		this.down = down;
		this.distance = distance;
		this.scrimmage = scrimmage;
		this.jdsConquistadas = jdsConquistadas;
		this.TD = TD;
		this.half = half;
		this.emCampo = emCampo;

		GameSituation.updateDownDistance(jdsConquistadas);
		if (TD)
			GameSituation.updateScore(6, "rats");
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

	public int getHalf() { return half; }

	public void setHalf(int half) { this.half = half; }

	public int getPontRats() { return pontRats; }

	public void setPontRats(int pontRats) { this.pontRats = pontRats; }

	public int getPontAdv() { return pontAdv; }

	public void setPontAdv(int pontAdv) { this.pontAdv = pontAdv; }
}

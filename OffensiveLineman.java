
public class OffensiveLineman extends Jogador {

	private int badSnaps;
	private int corridasEmCampo;
	private int jdsCorridaEmCampo;
	private int passesEmCampo;
	private int jdsPassadasEmCampo;
	private int sacks;
	
	public OffensiveLineman(String nome, int numero, String posicao, int tempoTime) {
		super(nome, numero, posicao, tempoTime);
		
	}
	
	public int getBadSnaps() {
		return badSnaps;
	}


	public void setBadSnaps(int badSnaps) {
		this.badSnaps = badSnaps;
	}


	public int getCorridasEmCampo() {
		return corridasEmCampo;
	}


	public void setCorridasEmCampo(int corridasEmCampo) {
		this.corridasEmCampo = corridasEmCampo;
	}


	public int getJdsCorridaEmCampo() {
		return jdsCorridaEmCampo;
	}


	public void setJdsCorridaEmCampo(int jdsCorridaEmCampo) {
		this.jdsCorridaEmCampo = jdsCorridaEmCampo;
	}


	public int getPassesEmCampo() {
		return passesEmCampo;
	}


	public void setPassesEmCampo(int passesEmCampo) {
		this.passesEmCampo = passesEmCampo;
	}


	public int getJdsPassadasEmCampo() {
		return jdsPassadasEmCampo;
	}


	public void setJdsPassadasEmCampo(int jdsPassadasEmCampo) {
		this.jdsPassadasEmCampo = jdsPassadasEmCampo;
	}


	public int getSacks() {
		return sacks;
	}


	public void setSacks(int sacks) {
		this.sacks = sacks;
	}

	

}

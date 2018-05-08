
public class SkillPosition extends Jogador{

	private int corridas;
	private int jdsCorrida;
	private int tdsCorrida;
	
	public SkillPosition(String nome, int numero, String posicao, int tempoTime) {
		super(nome, numero, posicao, tempoTime);
		this.corridas = 0;
		this.jdsCorrida = 0;
		this.tdsCorrida = 0;		
	}

	public int getCorridas() {
		return corridas;
	}

	public void addCorridas() {
		this.corridas += 1;
	}

	public int getJdsCorrida() {
		return jdsCorrida;
	}

	public void plusJdsCorrida(int jdsCorrida) {
		this.jdsCorrida += jdsCorrida;
	}

	public int getTdsCorrida() {
		return tdsCorrida;
	}

	public void addTdsCorrida() {
		this.tdsCorrida += tdsCorrida;
	}

}

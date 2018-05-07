
public class SkillPosition extends Jogador{

	private int corridas;
	private int jdsCorrida;
	private int firstCorrida;
	private int tdsCorrida;
	
	public SkillPosition(String nome, int numero, int tempoTime) {
		super(nome, numero, tempoTime);
		this.corridas = 0;
		this.jdsCorrida = 0;
		this.firstCorrida = 0;
		this.tdsCorrida = 0;		
	}

	public int getCorridas() {
		return corridas;
	}

	public void setCorridas(int corridas) {
		this.corridas = corridas;
	}

	public int getJdsCorrida() {
		return jdsCorrida;
	}

	public void setJdsCorrida(int jdsCorrida) {
		this.jdsCorrida = jdsCorrida;
	}

	public int getFirstCorrida() {
		return firstCorrida;
	}

	public void setFirstCorrida(int firstCorrida) {
		this.firstCorrida = firstCorrida;
	}

	public int getTdsCorrida() {
		return tdsCorrida;
	}

	public void setTdsCorrida(int tdsCorrida) {
		this.tdsCorrida = tdsCorrida;
	}

}

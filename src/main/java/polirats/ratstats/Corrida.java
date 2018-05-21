package polirats.ratstats;

public class Corrida extends Jogada {

	private SkillPosition corredor;
	private int pontRats;
	private int pontAdv;
	
	public Corrida(String tipo, int down, int distance, int scrimmage, int jdsConquistadas, int pontRats, int pontAdv, boolean TD,
				   int half, Jogador[] emCampo, SkillPosition corredor) {
		super(tipo, down, distance, scrimmage, jdsConquistadas, pontRats, pontAdv, TD, half, emCampo);
		this.corredor = corredor;
		
		//this.corredor.addCorridas();
		//this.corredor.plusJdsCorrida(jdsConquistadas);
		//if (TD)
			corredor.addTdsCorrida();
		
		//System.out.println("Corrida de " + jdsConquistadas + " registrada para " + this.corredor.getNome());
	}
	
	public void setCorredor(SkillPosition corredor) {
		this.corredor = corredor;
	}
	
	public SkillPosition getCorredor() {
		return corredor;
	}

}

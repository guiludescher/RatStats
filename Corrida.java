
public class Corrida extends Jogada {

	private SkillPosition corredor;
	private boolean TD;
	
	public Corrida(String tipo, int down, int distance, int scrimmage, int jdsConquistadas, SkillPosition corredor, boolean TD) {
		super(tipo, down, distance, scrimmage, jdsConquistadas);
		this.TD = TD;
		this.corredor = corredor;
		
		this.corredor.addCorridas();
		this.corredor.plusJdsCorrida(jdsConquistadas);
		if (TD)
			corredor.addTdsCorrida();
		
		System.out.println("Corrida de " + jdsConquistadas + " registrada para " + this.corredor.getNome());
	}
	
	public void setCorredor(SkillPosition corredor) {
		this.corredor = corredor;
	}
	
	public SkillPosition getCorredor() {
		return corredor;
	}

}

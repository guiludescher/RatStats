
public class Passe extends Jogada {

	private Quarterback QB;
	private WideReceiver WR;
	private int resultado; //completo = 0, incompleto = 1, pick = 2
	private boolean touchdown, drop;
	
	public Passe(String tipo, int down, int distance, int scrimmage, int jdsConquistadas, int resultado, Quarterback QB, WideReceiver WR, boolean touchdown, boolean drop) {
		super(tipo, down, distance, scrimmage, jdsConquistadas);
		
		this.QB = QB;
		this.WR = WR;
		this.resultado = resultado;
		this.touchdown = touchdown;
		this.drop = drop;
		
		this.QB.addPassesTotais();
		this.WR.addTargets();
		
		if (resultado == 0){

			this.QB.addPassesCompl();
			this.QB.plusJdsPasse(jdsConquistadas);

			this.WR.addRecepcoes();
			this.WR.plusJdsRecepcao(jdsConquistadas);
			
			if (touchdown) {
				this.QB.addTdsPasse();
				this.WR.addTdsRecepcao();
			}
		}
		
		if (resultado == 1){
			this.QB.addPassesIncompl();
			
			if (drop)
				this.WR.addDrops();			
		}
		
		if (resultado == 2){
			this.QB.addPassesIncompl();
			this.QB.addPicks();		
		}
		
		System.out.println("Passe de " + QB.getNome() + " para " + WR.getNome());
	}
	
}

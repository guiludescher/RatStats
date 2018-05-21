package polirats.ratstats;

public class Passe extends Jogada {

	private Quarterback QB;
	private WideReceiver WR;
	private int resultado; //completo = 0, incompleto = 1, pick = 2
	private boolean TD, drop;
	private int pontRats;
	private int pontAdv;
	
	public Passe(String tipo, int down, int distance, int scrimmage, int jdsConquistadas, int pontRats, int pontAdv, boolean TD,
				 int half, Jogador[] emCampo, int resultado, Quarterback QB, WideReceiver WR, boolean drop) {
		super(tipo, down, distance, scrimmage, jdsConquistadas, pontRats, pontAdv, TD, half, emCampo);
		
		this.QB = QB;
		this.WR = WR;
		this.resultado = resultado;
		this.TD = TD;
		this.drop = drop;
		
		this.QB.addPassesTotais();
		this.WR.addTargets();
		
		if (resultado == 0){

			this.QB.addPassesCompl();
			this.QB.plusJdsPasse(jdsConquistadas);

			this.WR.addRecepcoes();
			this.WR.plusJdsRecepcao(jdsConquistadas);
			
			if (TD) {
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


public class WideReceiver extends SkillPosition{
	
	private boolean flanker;
	private int recepcoes;
	private int targets;
	private int drops;
	private int jdsRecepcao;
	private int tdsRecepcao;
	
	public WideReceiver(String nome, int numero, String posicao, int tempoTime, boolean flanker) {
		super(nome, numero, posicao, tempoTime);
		this.flanker = flanker;
	}
		
	public boolean isFlanker() {
		return flanker;
	}

	public void setFlanker(boolean flanker) {
		this.flanker = flanker;
	}

	public int getRecepcoes() {
		return recepcoes;
	}

	public void addRecepcoes() {
		this.recepcoes += 1;
	}

	public int getTargets() {
		return targets;
	}

	public void addTargets() {
		this.targets += 1;
	}

	public int getDrops() {
		return drops;
	}

	public void addDrops() {
		this.drops += 1;
	}

	public int getJdsRecepcao() {
		return jdsRecepcao;
	}

	public void plusJdsRecepcao(int jdsRecepcao) {
		this.jdsRecepcao += jdsRecepcao;
	}

	public int getTdsRecepcao() {
		return tdsRecepcao;
	}

	public void addTdsRecepcao() {
		this.tdsRecepcao += 1;
	}

}

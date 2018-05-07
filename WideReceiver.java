
public class WideReceiver extends SkillPosition{
	
	private boolean flanker;
	private int recepcoes;
	private int targets;
	private int drops;
	private int jdsRecepcao;
	private int tdsRecepcao;
	

	public WideReceiver(String nome, int numero, int tempoTime, boolean flanker) {
		super(nome, numero, tempoTime);
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

	public void setRecepcoes(int recepcoes) {
		this.recepcoes = recepcoes;
	}

	public int getTargets() {
		return targets;
	}

	public void setTargets(int targets) {
		this.targets = targets;
	}

	public int getDrops() {
		return drops;
	}

	public void setDrops(int drops) {
		this.drops = drops;
	}

	public int getJdsRecepcao() {
		return jdsRecepcao;
	}

	public void setJdsRecepcao(int jdsRecepcao) {
		this.jdsRecepcao = jdsRecepcao;
	}

	public int getTdsRecepcao() {
		return tdsRecepcao;
	}

	public void setTdsRecepcao(int tdsRecepcao) {
		this.tdsRecepcao = tdsRecepcao;
	}

}

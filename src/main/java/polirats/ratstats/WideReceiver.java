package polirats.ratstats;

import static polirats.ratstats.MainActivity.hmWR;

public class WideReceiver extends SkillPosition{
	

	private int recepcoes;
	private int targets;
	private int drops;
	private int jdsRecepcao;
	private int tdsRecepcao;
	
	public WideReceiver(String nome, String apelido, int numero, String posicao, int tempoTime) {
		super(nome, apelido, numero, posicao, tempoTime);
		this.recepcoes = 0;
		this.targets = 0;
		this.drops = 0;
		this.jdsRecepcao = 0;
		this.tdsRecepcao = 0;

		hmWR.put(apelido, this);
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

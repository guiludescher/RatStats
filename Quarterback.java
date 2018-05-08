
public class Quarterback extends SkillPosition{

	private int passesTotais;
	private int passesCompl;
	private int passesIncompl;
	private int tdsPasse;
	private int picks;
	private int jdsPasse;
	private int sacks;
	
	public Quarterback(String nome, int numero, String posicao, int tempoTime) {
		super(nome, numero, posicao, tempoTime);
		this.passesTotais = 0;
		this.passesCompl = 0;
		this.passesIncompl = 0;
		this.tdsPasse = 0;
		this.picks = 0;
		this.jdsPasse = 0;
	}
	
	public int getPassesTotais() {
		return passesTotais;
	}

	public void addPassesTotais() {
		this.passesTotais += 1;
	}

	public int getPassesCompl() {
		return passesCompl;
	}

	public void addPassesCompl() {
		this.passesCompl += 1;
	}

	public int getPassesIncompl() {
		return passesIncompl;
	}

	public void addPassesIncompl() {
		this.passesIncompl += 1;
	}

	public int getTdsPasse() {
		return tdsPasse;
	}

	public void addTdsPasse() {
		this.tdsPasse += 1;
	}

	public int getPicks() {
		return picks;
	}

	public void addPicks() {
		this.picks += 1;
	}

	public int getJdsPasse() {
		return jdsPasse;
	}

	public void plusJdsPasse(int jdsPasse) {
		this.jdsPasse += jdsPasse;
	}

	public int getSacks() {
		return sacks;
	}

	public void setSacks(int sacks) {
		this.sacks = sacks;
	}
}

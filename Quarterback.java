
public class Quarterback extends SkillPosition{

	private int passesTotais;
	private int passesCompl;
	private int passesIncompl;
	private int tdsPasse;
	private int picks;
	private int jdsPasse;
	
	public int getPassesTotais() {
		return passesTotais;
	}

	public void setPassesTotais(int passesTotais) {
		this.passesTotais = passesTotais;
	}

	public int getPassesCompl() {
		return passesCompl;
	}

	public void setPassesCompl(int passesCompl) {
		this.passesCompl = passesCompl;
	}

	public int getPassesIncompl() {
		return passesIncompl;
	}

	public void setPassesIncompl(int passesIncompl) {
		this.passesIncompl = passesIncompl;
	}

	public int getTdsPasse() {
		return tdsPasse;
	}

	public void setTdsPasse(int tdsPasse) {
		this.tdsPasse = tdsPasse;
	}

	public int getPicks() {
		return picks;
	}

	public void setPicks(int picks) {
		this.picks = picks;
	}

	public int getJdsPasse() {
		return jdsPasse;
	}

	public void setJdsPasse(int jdsPasse) {
		this.jdsPasse = jdsPasse;
	}

	public Quarterback(String nome, int numero, int tempoTime) {
		super(nome, numero, tempoTime);
		this.passesTotais = 0;
		this.passesCompl = 0;
		this.passesIncompl = 0;
		this.tdsPasse = 0;
		this.picks = 0;
		this.jdsPasse = 0;
	}
	

}


public class Jogador {
	
	private String nome;
	
	private int numero;
	private int tempoTime;
	private int nSnaps;
	private boolean jogando;
	
	public Jogador(String nome, int numero, int tempoTime){
		this.nome = nome;
		this.numero = numero;
		this.tempoTime = tempoTime;
		this.nSnaps = 0;
		this.jogando = false;
		
		System.out.println("Jogador " + this.nome + " criado!");
		
		//this.tempoTime = anoatual (?) - anoBixo -- IMPLEMENTAR
	}

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getTempoTime() {
		return tempoTime;
	}

	public void setTempoTime(int tempoTime) {
		this.tempoTime = tempoTime;
	}

	public int getnSnaps() {
		return nSnaps;
	}

	public void setnSnaps(int nSnaps) {
		this.nSnaps = nSnaps;
	}

	public boolean isJogando() {
		return jogando;
	}

	public void setJogando(boolean jogando) {
		this.jogando = jogando;
	}

	
}

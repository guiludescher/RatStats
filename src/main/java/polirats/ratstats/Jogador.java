package polirats.ratstats;

public class Jogador {

    private String nome;
    private String apelido;
    private String posicao;
    private int numero;
    private int tempoTime;
    private int nSnaps;
    private boolean jogando;
    public static int nJogadores;

    public Jogador(String nome, String apelido, int numero, String posicao, int tempoTime){
        this.nome = nome;
        this.numero = numero;
        this.tempoTime = tempoTime;
        this.setPosicao(posicao);
        this.nSnaps = 0;
        this.jogando = false;
        this.apelido = apelido;

        nJogadores++;
        //System.out.println("Jogador " + this.nome + " criado!");

        //this.tempoTime = anoatual (?) - anoBixo -- IMPLEMENTAR
    }
    public Jogador (){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
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


    public String getPosicao() {
        return posicao;
    }


    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }


}

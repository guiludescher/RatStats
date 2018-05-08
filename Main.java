import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		String nomeQB = "Ivan Stamborowski";
		int numeroQB = 6;
		String posicaoQB = "QB";
		int tempoTimeQB = 2;
		Quarterback QB = new Quarterback (nomeQB, numeroQB, posicaoQB, tempoTimeQB);
		
		String nomeWR = "Renato Fograngolli";
		int numeroWR = 34;
		String posicaoWR = "WR";
		int tempoTimeWR = 1;
		boolean flanker = false;
		WideReceiver WR1 = new WideReceiver (nomeWR, numeroWR, posicaoWR, tempoTimeWR, flanker);
		
		nomeWR = "Juão Cortes";
		numeroWR = 80;
		posicaoWR = "WR";
		tempoTimeWR = 1;
		flanker = true;
		WideReceiver WR2 = new WideReceiver (nomeWR, numeroWR, posicaoWR, tempoTimeWR, flanker);
				
		String tipo1 = "Corrida";
		int down1 = 1;
		int dist1 = 10;
		int scrim1 = 20;
		int jds1 = 5;
		boolean td = false;
		
		Corrida J1 = new Corrida(tipo1, down1, dist1, scrim1, jds1, QB, td);
		
		String tipo2 = "Passe";
		int down = 1;
		int dist = 10;
		int scrim = 20;
		int jds = 0;
		int resultado = 1;
		td = false;
		boolean drop = true;
		
		Passe P1 = new Passe(tipo2, down, dist, scrim, jds, resultado, QB, WR1, td, drop);
		
		down = 3;
		dist = 10;
		scrim = 20;
		jds = 20;
		resultado = 0;
		td = true;
		drop = false;
		
		Passe P2 = new Passe(tipo2, down, dist, scrim, jds, resultado, QB, WR2, td, drop);
		
		System.out.println(QB.getNome());
		System.out.println("Corridas: " + QB.getCorridas());
		System.out.println("Jardas corridas: " + QB.getJdsCorrida());
		System.out.println("Passes: " + QB.getPassesCompl() + "/" + QB.getPassesTotais());
		System.out.println("Jardas passadas: " + QB.getJdsCorrida());
		System.out.println("Touchdowns: " + QB.getTdsCorrida() + QB.getTdsPasse());
		
		System.out.println("\n" + WR1.getNome());
		System.out.println("Recepções: " + WR1.getRecepcoes());
		System.out.println("Jardas Recebidas: " + WR1.getJdsRecepcao());
		System.out.println("Drops: " + WR1.getDrops());
		System.out.println("Touchdowns: " + WR1.getTdsRecepcao());
		
		System.out.println("\n" + WR2.getNome());
		System.out.println("Recepções: " + WR2.getRecepcoes());
		System.out.println("Jardas Recebidas: " + WR2.getJdsRecepcao());
		System.out.println("Drops: " + WR2.getDrops());
		System.out.println("Touchdowns: " + WR2.getTdsRecepcao());
	}

}

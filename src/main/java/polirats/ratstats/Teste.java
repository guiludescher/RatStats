package polirats.ratstats;

import static polirats.ratstats.MainActivity.emCampo;
import static polirats.ratstats.MainActivity.hmOL;
import static polirats.ratstats.MainActivity.hmQB;
import static polirats.ratstats.MainActivity.hmWR;

public class Teste {

    public static void CriaJogadores(int n, String posicao){

        int i;
        for (i = 0; i < n; i++){
            String nome = posicao + Integer.toString(i+1);
            Jogador J =  null;
            switch (posicao) {
                case "QB":
                    J = new Quarterback(nome, "the"+nome, i, posicao, 2018);
                    break;
                case "WR":
                    J = new WideReceiver(nome, "the"+nome, i, posicao, 2018);
                    break;
                case "OL":
                    J = new OffensiveLineman(nome, "the"+nome, i, posicao, 2018);
                default:
                    break;
            }
        }
    }

    public static void ColocaTimeEmCampo (){
        emCampo[0] = hmWR.get("theWR1");
        emCampo[1] = hmWR.get("theWR2");
        emCampo[6] = hmWR.get("theWR3");
        emCampo[7] = hmWR.get("theWR4");

        emCampo[2] = hmOL.get("theOL1");
        emCampo[3] = hmOL.get("theOL2");
        emCampo[4] = hmOL.get("theOL3");

        emCampo[5] = hmQB.get("theQB1");
    }

}

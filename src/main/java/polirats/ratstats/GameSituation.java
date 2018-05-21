package polirats.ratstats;

import java.util.HashMap;

import static java.lang.Math.abs;

public class GameSituation {

    static HashMap<String, Integer> gameSituation;
    public static void gameStart (){
        gameSituation = new HashMap<String, Integer>();
        gameSituation.put("down", 1);
        gameSituation.put("distance", 10);
        gameSituation.put("scrim", -20);
        gameSituation.put("half", 1);
        gameSituation.put("rats", 0);
        gameSituation.put("adv", 0);
    }

    public static void updateDownDistance(Integer jds){
        Integer newDist = gameSituation.get("distance") - jds;
        Integer newDown = gameSituation.get("down") + 1;

        gameSituation.put("scrim", gameSituation.get("srcim") + jds);
        if (newDist > 0) {
            if (newDown > 4) {
                gameSituation.put("distance", 10);
                gameSituation.put("down", 1);
                gameSituation.put("scrim", -gameSituation.get("scrim"));
            } else
                gameSituation.put("distance", newDist);
        }
        else {
            gameSituation.put("distance", 10);
            gameSituation.put("down", 1);
        }
    }

    public static void updateScore (int pontuacao, String equipe) {
        gameSituation.put(equipe, gameSituation.get(equipe) + pontuacao);
    }

    public static int nextHalf() {
        gameSituation.put("half", gameSituation.get("half")+1);
        return gameSituation.get("half");
    }

    public static String getDown() {
        switch (gameSituation.get("down")) {
            case 1:
                return "1st";
            case 2:
                return "2nd";
            case 3:
                return "3rd";
            case 4:
                return "4th";
            default:
                return "ERRO_DOWN";
        }
    }

    public static String getDistance() {
        return gameSituation.get("distance").toString();
    }
    public static String getScrim() {
        int pos = gameSituation.get("scrim");
        if (pos < 0)
            return Integer.toString(30+pos) + " (DEFESA)";
        else if (pos > 0)
            return Integer.toString(30-pos) + " (ATAQUE)";
        else
            return "30";
    }
    public static String getRatsScore() {
        return gameSituation.get("rats").toString();
    }
    public static String getAdvScore() {
        return gameSituation.get("adv").toString();
    }
    public static String getHalf () {
        switch (gameSituation.get("half")){
            case 1:
                return "1st";
            case 2:
                return "2nd";
            default:
                return "FIM DE JOGO";
        }
    }
    public static String getPlacar() {
        return "RATS " + gameSituation.get("rats") + "-" + gameSituation.get("adv") + " ADV";
    }

    public static Jogada putGameSituation(Jogada J) {
        J.setDistance(gameSituation.get("distance"));
        J.setDown(gameSituation.get("down"));
        J.setScrimmage(gameSituation.get("scrim"));
        J.se
        return J;
    }
}

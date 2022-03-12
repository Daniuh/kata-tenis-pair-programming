import java.util.*;

public class TennisGame1 implements TennisGame {
    private int m_score1 = 0;
    private int m_score2 = 0;
    private String player1Name;
    private String player2Name;

    public TennisGame1(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public void puntoGanador(String playerName) {
        boolean igualJugador1 = playerName == "player1";
        if (igualJugador1)
            m_score1 += 1;
        else
            m_score2 += 1;
    }

    public String getScore() {
        String score = "";
        if (m_score1 == m_score2) {
            score = siScoreIgual( m_score1, m_score2, score);
        }
        else if (m_score1>=4 || m_score2>=4)
        {
            score = siAlgunScoreMayor( m_score1, m_score2, score);
        }
        else{
            score = puntaje( m_score1,  m_score2,  score);
        }
            return score;
    }

    public String siScoreIgual(int m_score1, int m_score2, String score){
        if (m_score1 >= 3) {
            return "Deuce";
        }

        Map<Integer, String> map = new HashMap<>();
        map.put(0, "Love-All");
        map.put(1, "Fifteen-All");
        map.put(2, "Thirty-All");
        score = map.get(m_score1);
        return score;
    }

    public String siAlgunScoreMayor (int m_score1, int m_score2, String score){
            int minusResult = m_score1-m_score2;
            if (minusResult == 1) score = "Advantage player1";
            else if (minusResult ==- 1) score = "Advantage player2";
            else if (minusResult >= 2) score = "Win for player1";
            else score = "Win for player2";
        return score;
    }


    public String puntaje(int m_score1, int m_score2, String score){
        int tempScore;
        for (int i = 1; i < 3; i++)
        {
            if(i == 1) tempScore = m_score1;
            else { score += "-"; tempScore = m_score2;}
            score = metodoSwitch(tempScore, score);
        }
        return score;
    }

    public String metodoSwitch(int tempScore, String score){

        Map<Integer, String> map = new HashMap<>();
        map.put(0, "Love");
        map.put(1, "Fifteen");
        map.put(2, "Thirty");
        map.put(3, "Forty");
        score += map.get(tempScore);

     return score;
    }
}

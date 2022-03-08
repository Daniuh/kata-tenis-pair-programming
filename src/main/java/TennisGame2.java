
public class TennisGame2 implements TennisGame{
    public int P1point = 0;
    public int P2point = 0;
    
    public String P1res = "";
    public String P2res = "";
    private String player1Name;
    private String player2Name;

    public TennisGame2(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public String getScore(){
        String score = "";
        score = primeraValidacion(score);
        score = segundaValidacion(score);
        score = terceraValidacion(score);
        score = cuartaValidacion(score);
        score = quintaValidacion(score);
        score = sextaValidacion(score);
        score = septimaValidacion(score);
        score = octavaValidacion(score);
        score = novenaValidacion(score);
        return score;
    }

    public String primeraValidacion(String score){
        if (P1point == P2point && P1point < 4)
        {
           score = subValidacion101(score);
        }
        score = subValidacion102(score);
        return score;
    }

    public String subValidacion101(String score){
        if (P1point == 0)
            score = "Love";
        if (P1point == 1)
            score = "Fifteen";
        if (P1point == 2)
            score = "Thirty";
        score += "-All";
        return score;
    }

    public String subValidacion102(String score){
        if (P1point == P2point && P1point>=3)
            score = "Deuce";
        return score;
    }

    public String segundaValidacion(String score){
        validacion201(score);
        return score;
    }

    public String validacion201(String score){
        if (P1point == 1)
            P1res = "Fifteen";
        if (P1point == 2)
            P1res = "Thirty";
        if (P1point == 3)
            P1res = "Forty";

        P2res = "Love";
        score = P1res + "-" + P2res;
        return score;
    }

    public String terceraValidacion(String score){
        if (P2point > 0 && P1point==0)
        {
            if (P2point == 1)
                P2res = "Fifteen";
            if (P2point == 2)
                P2res = "Thirty";
            if (P2point == 3)
                P2res = "Forty";

            P1res = "Love";
            score = P1res + "-" + P2res;
        }
        return score;
    }

    public String cuartaValidacion(String score){
        if (P1point>P2point && P1point < 4)
        {
            if (P1point == 2)
                P1res="Thirty";
            if (P1point == 3)
                P1res="Forty";
            if (P2point == 1)
                P2res="Fifteen";
            if (P2point == 2)
                P2res="Thirty";
            score = P1res + "-" + P2res;
        }
        return score;
    }

    public String quintaValidacion(String score){
        if (P2point>P1point && P2point < 4)
        {
            if (P2point==2)
                P2res="Thirty";
            if (P2point==3)
                P2res="Forty";
            if (P1point==1)
                P1res="Fifteen";
            if (P1point==2)
                P1res="Thirty";
            score = P1res + "-" + P2res;
        }
        return score;
    }

    public String sextaValidacion(String score){
        if (P1point > P2point && P2point >= 3)
        {
            score = "Advantage player1";
        }
        return score;
    }

    public String septimaValidacion(String score){
        if (P2point > P1point && P1point >= 3)
        {
            score = "Advantage player2";
        }
        return score;
    }

    public String octavaValidacion(String score){
        if (P1point>=4 && P2point>=0 && (P1point-P2point)>=2)
        {
            score = "Win for player1";
        }
        return score;
    }

    public String novenaValidacion(String score){
        if (P2point>=4 && P1point>=0 && (P2point-P1point)>=2)
        {
            score = "Win for player2";
        }
        return score;
    }

    public void SetP1Score(int number){
        for (int i = 0; i < number; i++)
        {
            P1Score();
        }
    }
    
    public void SetP2Score(int number){
        for (int i = 0; i < number; i++)
        {
            P2Score();
        }
    }
    
    public void P1Score(){
        P1point++;
    }
    
    public void P2Score(){
        P2point++;
    }

    public void puntoGanador(String player) {
        if (player == "player1")
            P1Score();
        else
            P2Score();
    }
}
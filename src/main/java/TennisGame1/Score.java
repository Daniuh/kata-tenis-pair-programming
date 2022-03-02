package TennisGame1;public class Score {

    public String metodo1(int m_score1, int m_score2, String score){
        if (m_score1==m_score2) //IGUALDAD DE PUNTOS - PODRÍA SER UN MÉTODO QUE RETORNE SCORE
        {
            switch (m_score1)
            {
                case 0:
                    score = "Love-All";
                    break;
                case 1:
                    score = "Fifteen-All";
                    break;
                case 2:
                    score = "Thirty-All";
                    break;
                default:
                    score = "Deuce";
                    break;

            }
        }
        return score;
    }

    public String metodo2 (int m_score1, int m_score2, String score){
        if (m_score1>=4 || m_score2>=4) //ALGUNO MAYOR // CADA ELSE PUEDE SER UN MÉTODO
        {
            int minusResult = m_score1-m_score2;
            if (minusResult==1) score ="Advantage player1";
            else if (minusResult ==-1) score ="Advantage player2";
            else if (minusResult>=2) score = "Win for player1";
            else score ="Win for player2";
        }
        return score;
    }



    public String metodo3 (int m_score1, int m_score2, int tempScore, String score){
        for (int i=1; i<3; i++)
        {
            if (i==1) tempScore = m_score1;
            else { score += "-"; tempScore = m_score2;}
            switch(tempScore)
            {
                case 0:
                    score+="Love";
                    break;
                case 1:
                    score+="Fifteen";
                    break;
                case 2:
                    score+="Thirty";
                    break;
                case 3:
                    score+="Forty";
                    break;
            }
        }
        return score;
    }


    }


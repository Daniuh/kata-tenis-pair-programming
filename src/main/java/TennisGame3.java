
public class TennisGame3 implements TennisGame {
    
    private int puntajeJugador2;
    private int puntajeJugador1;
    private String jugador1;
    private String jugador2;

    public TennisGame3(String jugador1, String jugador2) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
    }

    public String getScore() {
        String score;
        if (puntajeJugador1 < 4 && puntajeJugador2 < 4 && !(puntajeJugador1 + puntajeJugador2 == 6)) {
            String[] p = new String[]{"Love", "Fifteen", "Thirty", "Forty"}; 
            score = p[puntajeJugador1];
            return (puntajeJugador1 == puntajeJugador2) ? score + "-All" : score + "-" + p[puntajeJugador2];
        } else {
            if (puntajeJugador1 == puntajeJugador2)
                return "Deuce";
            score = puntajeJugador1 > puntajeJugador2 ? jugador1 : jugador2;
            return ((puntajeJugador1 - puntajeJugador2)*(puntajeJugador1 - puntajeJugador2) == 1) ? "Advantage " + score : "Win for " + score;
        }
    }
    
    public void wonPoint(String playerName) {
        if (playerName == "player1")
            this.puntajeJugador1 += 1;
        else
            this.puntajeJugador2 += 1;
        
    }

}

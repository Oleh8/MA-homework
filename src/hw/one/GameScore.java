package hw.one;

public class GameScore {
    public static int GameForecastCalculator(int teamAscore, int teamBscore, int teamAscoreGuess, int teamBscoreGuess) {

        return ((teamAscore == teamAscoreGuess && teamBscore == teamBscoreGuess) ?
        2:((teamAscore > teamBscore && teamAscoreGuess > teamBscoreGuess)
                || (teamAscore < teamBscore && teamAscoreGuess < teamBscoreGuess)
                || (teamAscore == teamBscore && teamAscoreGuess == teamBscoreGuess) ?
        1: 0));
    }
}

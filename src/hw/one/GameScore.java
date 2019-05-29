package hw.one;

public class GameScore {

    public static int GameForecastCalculator(int teamAscore, int teamBscore, int teamAscoreGuess, int teamBscoreGuess) {

        if (teamAscore == teamAscoreGuess && teamBscore == teamBscoreGuess) {
            return 2;
        } else if ((teamAscore > teamBscore && teamAscoreGuess > teamBscoreGuess)
                || (teamAscore < teamBscore && teamAscoreGuess < teamBscoreGuess)
                || (teamAscore == teamBscore && teamAscoreGuess == teamBscoreGuess)) {
            return 1;
        }
        return 0;
    }
}

package rocks.zipcode.io.quiz3.objectorientation.enums;

/**
 * @author leon on 09/12/2018.
 */
public enum RockPaperScissorHandSign {
    ROCK("PAPER", "SCISSOR"),
    PAPER("SCISSOR", "ROCK"),
    SCISSOR("ROCK", "PAPER");

    private String losingSign;
    private String winningSign;

    private RockPaperScissorHandSign(String winningSign, String losingSign) {
        this.winningSign = winningSign;
        this.losingSign = losingSign;
    }

    public RockPaperScissorHandSign getWinner() {
        return valueOf(this.winningSign);
//        if (this == ROCK) {
//            return PAPER;
//        } else if (this == PAPER) {
//            return SCISSOR;
//        } else {
//            return ROCK;
//        }
    }

    public RockPaperScissorHandSign getLoser() {
        return valueOf(this.losingSign);
//        if (this == ROCK) {
//            return SCISSOR;
//        } else if (this == PAPER) {
//            return ROCK;
//        } else {
//            return PAPER;
//        }
    }
}

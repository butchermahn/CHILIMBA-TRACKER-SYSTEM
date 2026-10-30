package zm.zut.exception;

public class MissedContributionException extends RuntimeException {

    private final String userId;
    private final double penaltyFee;

    public MissedContributionException(String message, String userId, double penaltyFee) {
        super(message);
        this.userId = userId;
        this.penaltyFee = penaltyFee;
    }

    public String getUserId() {
        return userId;
    }

    public double getPenaltyFee() {
        return penaltyFee;
    }
}

package zm.zut.service;

import zm.zut.model.SavingsGroup;
import zm.zut.model.User;

public class PayoutCalculator {

    // Calculates the total payout pool based on members and target
    public double calculateTotalPayout(SavingsGroup group) {
        int activeMembers = group.getMembers().size();
        return activeMembers * group.getTargetAmount();
    }

    // Determines the next user in the rotation cycle
    public User getNextRecipient(SavingsGroup group, int currentRotationIndex) {
        if (group.getMembers().isEmpty()) {
            return null;
        }
        int nextIndex = currentRotationIndex % group.getMembers().size();
        return group.getMembers().get(nextIndex);
    }
}
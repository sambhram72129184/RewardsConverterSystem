public class RewardValue {
    private final double cashValue;
    private final double milesValue;

    // Constructor that accepts cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / 0.0035;
    }

    // Constructor that accepts miles value
    public RewardValue(double milesValue, boolean isMiles) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * 0.0035;
    }

    // Method to get the cash value
    public double getCashValue() {
        return cashValue;
    }

    // Method to get the miles value
    public double getMilesValue() {
        return milesValue;
    }

    //The purpose of this below code is to show you how the RewardValue class can be utilized in practice.
    //public static void main(String[] args) {
        //RewardValue reward1 = new RewardValue(100.0); // Cash value
        //RewardValue reward2 = new RewardValue(35000.0, true); // Miles value

        //System.out.println("Reward 1 - Cash Value: $" + reward1.getCashValue());
        //System.out.println("Reward 1 - Miles Value: " + reward1.getMilesValue() + " miles");

        //System.out.println("Reward 2 - Cash Value: $" + reward2.getCashValue());
        //System.out.println("Reward 2 - Miles Value: " + reward2.getMilesValue() + " miles");
    }
}

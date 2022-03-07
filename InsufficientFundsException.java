public class InsufficientFundsException extends Exception {
    private double currAmount;

    public InsufficientFundsException(double amount){
        this.currAmount = amount;
    }
    public double getAmount(){
        // returns the amount
        return currAmount;
    }
}

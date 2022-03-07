public class CheckingAccount {
    private double currBalance;
    private String accountNo;
    private double amount;

    public CheckingAccount(){
        this.currBalance = 0;
        this.accountNo = "ACC124";
        this.amount = 0;
    }

    public double getBalance(){
        //RETURNS BALANCE
        return currBalance;
    }

    public String getAccountNo(){
        //RETURNS ACCOUNT NO.
        return accountNo;
    }

    public double getAmount(){
        //RETURNS CURR AMOUNT
        return amount;
    }

    public double deposit(double amountDeposit){
        //RETURNS BALANCE
        this.currBalance = this.currBalance + amountDeposit;
        return this.currBalance;
    }

    public double withdraw(double amountWithdraw) throws InsufficientFundsException{

        //THROWS ERROR (INSUFFICIENT FUNDS)
        if (amountWithdraw > this.currBalance) {
            this.amount = amountWithdraw - this.currBalance;
            throw new InsufficientFundsException(amountWithdraw);
        }

        //RETURNS NEW BALANCE
        this.currBalance = this.currBalance - amountWithdraw;
        return this.currBalance;
    }
}

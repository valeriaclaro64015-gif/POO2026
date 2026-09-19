public class ElectronicWallet {
    private String owner;
    private double balance;
   public String getOwner(){
        return owner;
    }
    public double getBalance(){
        return balance;
    }
    public boolean setOwner(String newOwner){
    if(!newOwner.equals("")){
        owner = newOwner;
        return true;
    }
    return false;
    }
    public boolean settopUp(double value){
        if(value > 0){
            balance = balance + value;
            return true;
        }
        return false;
    }

    public boolean setpayment(double value){
        if(value > 0 && value <= balance && value <= 500000){
            balance = balance - value;
            return true;
        }
        return false;
    }
}

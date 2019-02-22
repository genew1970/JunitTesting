package creditcard;

public class Discover implements CreditCard{
    private static final double cardInterestRate = .01;
    private double simpleInterest;
    private double cardBalance;

    public Discover(double cardBalance){
        this.cardBalance = cardBalance;
        setSimpleInterest();
    }

    @Override
    public double getCardInterestRate(){
        return cardInterestRate;
    }

    @Override
    public void setCardBalance(double cardBalance){
        this.cardBalance = cardBalance;
    }

    @Override
    public double getCardBalance() {
        return cardBalance;
    }

    @Override
    public void setSimpleInterest(){
        this.simpleInterest = cardBalance * cardInterestRate;
    }

    @Override
    public double getSimpleInterest(){
        return simpleInterest;
    }

}

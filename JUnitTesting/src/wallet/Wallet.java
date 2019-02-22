package wallet;

import creditcard.CreditCard;
import java.util.List;

public class Wallet {
    private double creditCardInterest;
    private List<CreditCard> creditCard;

    public Wallet() {}

    public Wallet(List<CreditCard> creditCard){
        setCreditCard(creditCard);
        calcSimpleInterest();
    }

    private void calcSimpleInterest() {
        for(CreditCard cardInterest: creditCard){
            this.creditCardInterest += cardInterest.getSimpleInterest();
            setCardInterest(creditCardInterest);
        }
    }

    public List<CreditCard> getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(List<CreditCard> creditCard) {
        this.creditCard = creditCard;
    }

    public double getCardMonthlyInterest(){
        return  creditCardInterest;
    }

    public void setCardInterest(double cardMonthlyInterest){
        this.creditCardInterest = cardMonthlyInterest;
    }

}

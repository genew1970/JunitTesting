package person;

import wallet.Wallet;
import java.util.List;

public class Person {
    private List<Wallet> wallet;
    private double totalInterest;

    public Person() {}

    public Person(List<Wallet> wallet){
        setWallet(wallet);
        calcPersonTotalInterest();
    }

    private void calcPersonTotalInterest() {
        for(Wallet walletList: wallet){
            this.totalInterest += walletList.getCardMonthlyInterest();
        }
    }

    public List<Wallet> getWallet() {
        return wallet;
    }

    public void setWallet(List<Wallet> wallet) {
        this.wallet = wallet;
    }

    public double getTotalInterest() {
        return totalInterest;
    }

    public void setTotalInterest(double totalInterest) {
        this.totalInterest = totalInterest;
    }

}

import creditcard.CreditCard;
import creditcard.MasterCard;
import creditcard.Visa;
import org.junit.Test;
import person.Person;
import wallet.Wallet;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class CreditCardAppTestThree {
    // set the values for the card, person and wallet
    CreditCard[] creditCards1 = {new MasterCard(100), new Visa(100)};
    CreditCard[] creditCards2 = {new Visa(100), new MasterCard(100)};

    Wallet[] wallet1 = {new Wallet(Arrays.asList(creditCards1))};
    Wallet[] wallet2 = {new Wallet(Arrays.asList(creditCards2))};

    private Person person1 = new Person(Arrays.asList(wallet1));
    private Person person2 = new Person(Arrays.asList(wallet2));

    // test cases for third test case
    @Test
    public void personOneTotalInterest() {
        assertEquals(15, person1.getTotalInterest(), 0);
    }

    @Test
    public void walletOneTotalInterest() {
        assertEquals(15, wallet1[0].getCardMonthlyInterest(), 0);
    }

    @Test
    public void personTwoTotalInterest() {
        assertEquals(15, person2.getTotalInterest(), 0);
    }
    @Test
    public void walletTwoTotalInterest() {
        assertEquals(15, wallet2[0].getCardMonthlyInterest(), 0);
    }
}

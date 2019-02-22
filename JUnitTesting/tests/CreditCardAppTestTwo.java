import creditcard.CreditCard;
import creditcard.Discover;
import creditcard.MasterCard;
import creditcard.Visa;
import org.junit.Test;
import person.Person;
import wallet.Wallet;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class CreditCardAppTestTwo {
    // set the values for the card, person and wallet
    CreditCard[] creditCards1 = {new Visa(100), new Discover(100)};
    CreditCard[] creditCards2 = {new MasterCard(100)};

    Wallet[] wallet = {new Wallet(Arrays.asList(creditCards1)), new Wallet(Arrays.asList(creditCards2))};

    private Person person = new Person(Arrays.asList(wallet));

    // test cases for second test case
    @Test
    public void totalInterest() {
        assertEquals(16, person.getTotalInterest(), 0);
    }

    @Test
    public void walletOneSimpleInterest() {
        assertEquals(11, wallet[0].getCardMonthlyInterest(), 0);
    }

    @Test
    public void walletTwoSimpleInterest() {
        assertEquals(5, wallet[1].getCardMonthlyInterest(), 0);
    }

}

import creditcard.CreditCard;
import creditcard.Discover;
import creditcard.MasterCard;
import creditcard.Visa;
import org.junit.Test;
import person.Person;
import wallet.Wallet;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class CreditCardAppTest {
    // set the values for the card, person and wallet
    CreditCard[] creditCards = {new Visa(100), new MasterCard(100), new Discover(100)};

    Wallet[] wallet = {new Wallet(Arrays.asList(creditCards))};

    private Person person = new Person(Arrays.asList(wallet));

    // test cases for first test case
    @Test
    public void totalInterest() {
        assertEquals(16, person.getTotalInterest(), 0);
    }

    @Test
    public void visaSimpleInterest() {
        assertEquals(10, creditCards[0].getSimpleInterest(), 0);
    }

    @Test
    public void mastercardSimpleInterest() {
        assertEquals(5, creditCards[1].getSimpleInterest(), 0);
    }

    @Test
    public void discoverSimpleInterest() {
        assertEquals(1, creditCards[2].getSimpleInterest(), 0);
    }

}
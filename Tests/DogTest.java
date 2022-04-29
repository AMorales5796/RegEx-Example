import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    //SIMPLE TESTS
    @Test
    void FirstNameLetterACapTrue()
    {
        Dog tester1 = new Dog();
        tester1.setName("A");
        assertTrue(tester1.getName().matches("[A-Z]"));
    }

    @Test
    void FirstNameLetterBCapTrue()
    {
        Dog tester1 = new Dog();
        tester1.setName("B");
        assertTrue(tester1.getName().matches("[A-Z]"));
    }

    @Test
    void FNLetterBMoreFalse()
    {
        Dog tester1 = new Dog();
        tester1.setName("Bob");
        assertFalse(tester1.getName().matches("[A-Z]"));
    }

    @Test
    void FirstNamewithNumberFalse()
    {
        Dog tester1 = new Dog();
        tester1.setName("Kib");
        assertFalse(tester1.getName().matches("[0-9]"));
    }

    @Test
    void FirstNameWithNumberTrue()
    {
        Dog tester1 = new Dog();
        tester1.setName("K9");
        assertTrue(tester1.getName().matches("[9]$"));
    }

    @Test
    void FNLetterbFalse()
    {
        Dog tester1 = new Dog();
        tester1.setName("b");
        assertFalse(tester1.getName().matches("[A-Z]"));
    }

    @Test
    void FNLetterBoTrue()
    {
        Dog tester1 = new Dog();
        tester1.setName("Bo");
        assertTrue(tester1.getName().matches("[A-Z][a-z]"));
    }

    @Test
    void FNLetterBFalse()
    {
        Dog tester1 = new Dog();
        tester1.setName("B");
        assertFalse(tester1.getName().matches("[A-Z][a-z]"));
    }

    @Test
    void FNLetterBLengthTrue()
    {
        Dog tester1 = new Dog();
        tester1.setName("Bfwrgertbgdcsahe");
        assertTrue(tester1.getName().matches("[A-Z][a-z]*"));
    }

    @Test
    void HyphenTrue()
    {
        Dog tester1 = new Dog();
        tester1.setName("-bob");
        assertTrue(tester1.getName().matches("[-]+[a-z]*"));
    }

    @Test
    void FNLWithHyphenTrue1()
    {
        Dog tester1 = new Dog();
        tester1.setName("J-bob");
        assertTrue(tester1.getName().matches("[A-Z]+[-]+[a-z]*"));
    }

    @Test
    void FNLWithHyphenTrue2()
    {
        Dog tester1 = new Dog();
        tester1.setName("Jon-Bob");
        assertTrue(tester1.getName().matches("([A-Za-z])*+[-]([A-Za-z])*"));
    }//[a-z]+([-][A-Za-z])*

    @Test
    void breedNamesWithSpace()
    {
        Dog tester1 = new Dog();
        tester1.setBreed("German Shepherd");
        assertTrue(tester1.getBreed().matches("([A-Za-z])*+[ ]([A-Za-z])*")); //<--- uses character class (space is used)
    }

    //LAST TEST NOT WORKING
    @Test
    void getFirstName() {
    }

    @Test
    void setFirstName() {
    }

    @Test
    void testToString() {
    }
}
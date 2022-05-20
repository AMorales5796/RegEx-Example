import java.util.Scanner;

public class DogDriver
{
    public static void main(String[] args)
    {
        Dog sumName = new Dog("k9","dog", 9,false);
        Dog Kip = new Dog("Kip","German Shepherd", 2,true);
        sumName.validateName(sumName.getName());
        Kip.validateName(Kip.getName());
    }
}

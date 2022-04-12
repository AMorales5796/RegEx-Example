import java.util.Scanner;

public class Dog
{
    Scanner input = new Scanner(System.in);
    private String name;
    private String breed;
    private int age;
    private boolean isChipped;

    public Dog()
    {
        name = "";
        breed = "";
        age = 0;
        isChipped = false;
    }//end of public default constructor

    public String getName()
    {
        return name;
    }//firstName getter

    public void setName(String name)
    {
        this.name = name;
    }//firstName setter

    private String validateName(String name)
    {
        while(!name.matches("[A-Z][a-zA-Z]*"))
        {
            System.out.println("Format Incorrect");
            name = input.nextLine();
        }
            return name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name = " + name + '\'' +
                ", breed = " + breed + '\'' +
                ", age = " + age + '\'' +
                ", isChipped = " + isChipped + '\'';
    }
}
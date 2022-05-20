import java.util.Scanner;

public class Dog
{
    Scanner input = new Scanner(System.in);
    public String name;
    public String breed;
    public int age;
    public boolean isChipped;

    public Dog()
    {
        name = "";
        breed = "";
        age = 0;
        isChipped = false;
    }//end of public default constructor

    public Dog(String name, String breed, int age, boolean isChipped)
    {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.isChipped = isChipped;
    }//end of public default constructor

    //Getters
    public String getName()
    {
        return name;
    }//name getter

    public String getBreed()
    {
        return breed;
    }//breed getter

    public int getAge()
    {
        return age;
    }//age getter

    public boolean getIsChipped()
    {
        return isChipped;
    }//isChipped getter

    //Setters
    public void setName(String name)
    {
        this.name = name;
    }//name setter

    public void setBreed(String breed)
    {
        this.breed = breed;
    }//name setter

    public void setAge(int age)
    {
        this.age = age;
    }//name setter

    public void setChipped(boolean isChipped)
    {
        this.isChipped = isChipped;
    }//name setter

    public String validateName(String name)
    {
        String output = "";
        if(!name.matches("[A-Z][a-zA-Z]*"))
        {
            System.out.println("Format Incorrect. Please try again:");
            name = input.nextLine();
        }
        else
        {
            System.out.println("Format Incorrect");
        }
        output = "Your dog's name is: " + name;
        System.out.println(output);
        return output;
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
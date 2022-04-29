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
        while(!name.matches("[A-Z][a-zA-Z]*"))
        {
            System.out.println("Format Incorrect");
            name = input.nextLine();
        }
            return "Your dog's name is: " + name;
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
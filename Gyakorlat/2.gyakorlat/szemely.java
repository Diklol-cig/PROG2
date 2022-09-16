import java.util.Calendar;

class Person
{
    public String name;
    public String email;
    public int yearOfBirth;

    public int howOldAreYou(){
        int year = Calendar.getInstance().get(Calendar.YEAR);
        return year-yearOfBirth;
    }
}


public class szemely {
    public static void main(String[] args)
    {
        Person p1 = new Person();
        p1.name = "John";
        p1.email = "john@gmail.com";
        p1.yearOfBirth = 2000;
        System.out.println("Eletkor: " + p1.howOldAreYou());
    }
}

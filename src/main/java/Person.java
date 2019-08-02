import java.time.LocalDate;
import java.util.List;

public class Person {

    public enum Sex {
        MALE,
        FEMALE
    }

    private String name;
    private LocalDate birthDay;
    private Sex gender;
    private String emailAddress;

    public Person(String name, LocalDate birthDay, Sex gender, String emailAddress) {
        this.name = name;
        this.birthDay = birthDay;
        this.gender = gender;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public Sex getGender() {
        return gender;
    }

    public void setGender(Sex gender) {
        this.gender = gender;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void printPerson() {
        System.out.println(String.format("Name: %\nBirthdate: %s\nSex: %\nEmail: %s"
                ,this.getName()
                ,this.getBirthDay()
                ,this.getGender()
                ,this.getEmailAddress()
        ));

    }

    public static void printPersons(List<Person> roster, CheckPerson tester) {

        for(Person p: roster) {
            if(tester.test(p)) {
                p.printPerson();

            }
        }
    }
}

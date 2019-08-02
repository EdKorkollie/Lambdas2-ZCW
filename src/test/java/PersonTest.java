import org.junit.Assert;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class PersonTest {
    private Person person;

    @org.junit.Test
    public void getName() {
        String expectedname = "Ed Kor";
        person = new Person(expectedname, null, null, null);
        String actual = person.getName();
        Assert.assertEquals(expectedname, actual);

    }

    @org.junit.Test
    public void setName() {

//        String expected = "Ed Kor";
//        person = new Person();
//        person.setName(expected);
//        String actual = person.getName();
//        Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void getBirthDay() {

        LocalDate expected = LocalDate.of(1999, 03, 04);
        person = new Person(null, expected, null, null);
        LocalDate actual = person.getBirthDay();
        Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void setBirthDay() {
    }

    @org.junit.Test
    public void getGender() {
        Person.Sex expected = Person.Sex.MALE;
        person = new Person(null, null, expected, null);
        Person.Sex actual = person.getGender();
        Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void setGender() {
    }

    @org.junit.Test
    public void getEmailAddress() {
        String expected = "korkollj@gmia";
        person = new Person(null, null, null, expected);
        String actual = person.getEmailAddress();
        Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void setEmailAddress() {
    }
}
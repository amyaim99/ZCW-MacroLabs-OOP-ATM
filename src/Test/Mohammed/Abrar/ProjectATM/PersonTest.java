package Mohammed.Abrar.ProjectATM;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    Person person = new Person("Abrar", "Juhar");
    Person person2 = new Person();
    @Test
    void getFirstName() {

        String expected = "Abrar";

        String actual = person.getFirstName();


        Assert.assertEquals("The two names are equal", expected, actual);

    }

    @Test
    void setFirstName() {

        person2.setFirstName("Raul");
        String expected = "Raul";

        String actual = person2.getFirstName();


        Assert.assertEquals("The two names are equal", expected, actual);
    }

    @Test
    void lastName() {

        String expected = "Juhar";

        String actual = person.getLastName();


        Assert.assertEquals("The two names are equal", expected, actual);
    }

    @Test
    void setLasttNameTest() {
        person2.setLasttName("Raul");
        String expected = "Raul";

        String actual = person2.getLastName();


        Assert.assertEquals("The two names are equal", expected, actual);
    }

    @Test
    void toStringTest() {
        String expected = "Abrar Juhar";
        String actual = person.toString();
        Assert.assertEquals(expected,actual);
    }

}
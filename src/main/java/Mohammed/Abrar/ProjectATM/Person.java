package Mohammed.Abrar.ProjectATM;

public class Person {
    private String firstName;
    private String lastName;





    public  Person(){
        this.firstName = firstName;
        this.lastName = lastName;

    }

    public  Person(String firstName, String lastName){

        this.firstName = firstName;
        this.lastName = lastName;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String name) {
        this.firstName = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLasttName(String name) {
        this.lastName = name;
    }

    @Override
    public String toString(){
        return this.firstName + " " + this.lastName;
    }
    }

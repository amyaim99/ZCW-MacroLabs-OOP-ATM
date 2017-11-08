package Mohammed.Abrar.ProjectATM;

public class Person {
    private String firstName;
    private String lastName;
    private String fullName;
    private boolean isMale;



    public  Person(){
        this.firstName = firstName;
        this.lastName = lastName;

    }

    public  Person(String name){
        this.fullName = name;


    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName() {
        this.firstName = firstName;
    }

    public String lastName() {
        return lastName;
    }

    public void setLasttName() {
        this.lastName = lastName;
    }

    @Override
    public String toString(){
        return this.fullName;
    }
    }

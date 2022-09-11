public abstract class GettersAndSetters {
    // This class has only one method, and the method is used to explain getters/setters.
    // The method is not meant to be called.
    Person person = new Person("Jupiter");

    // There are naming conventions for getters and setters. The below methods show these conventions.
    // Non-boolean values (replace void with variable type)
    public void getNonBooleanVariableName() {

    }

    public void setNonBooleanVariableName() {

    }

    // Boolean values
    public Boolean isBooleanVariableName() {
        return Boolean.TRUE;
    }

    public Boolean setBooleanVariableName() {
        return Boolean.TRUE;
    }

}

class Person {
    private String name;

    // constructor
    public Person(String name) {
        this.name = name;
    }

    // Why do we use getters and setters? Well, they let the programmer create variables
    // that are reachable and changable by the user, on the programmer's terms. The programmer
    // can set up conditions that prevent unwanted or harmful editing.

    // We also provide a 'black box' that can have it's inner contents changed, while the user expects
    // the same thing. For example, we can make changes on the conditions, or even choose a different
    // algorithm, without affecting code that depends on it.

    // So, if a variable will *ever* change, always make it private and create getters and setters for it.
    // Public variables must be significantly thought through before adding, and it's uncertain on if they are worth it.
    public String getName() {
        if (name.length() > 16)
            return "Name is too large!";
        else
            return name;
    }

    public void setName(String name) {
        if(name != null && name.length()>2) {
            this.name = name;
        }
    }

}
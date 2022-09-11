public class Member {
    // Why do we use 'private' here? Well, if someone wanted to know your
    // name, they should ask you directly instead of reaching into your
    // pocket and pulling out your Social Security Card.



    // You can only access private variables using 'getter' and 'setter' methods,
    // which manipulate the variables in the CORRECT context.
    private String name;
    private String type;
    private int level;
    private int rank;

    public Member(String name, String type, int level, int rank) {
        this.name = name;
        this.type = type;
        this.level = level;
        this.rank = rank;
    }

    /* let's define our getter functions here */
    public String getName() { // what's your name?
        return name; // my name is ...
    }

    public String getType() { // what's your type?
        return type; // my type is ...
    }

    public int getLevel() { // what's your level?
        return level; // my level is ...
    }

    public int getRank() { // what's your rank?
        return rank; // my rank is ...
    }

}

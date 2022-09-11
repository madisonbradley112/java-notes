// Java Notes. These notes are adapted from the "Java notes for Professionals"
// from GoalKicker.com

import java.util.Calendar;
import java.util.Date;

public class Main {
    // This is the entry point for the program.
    // Public means that it can be called from anywhere, even outside of the program.
    // Static means that it exists and can be run by itself (without creating an object)
    // Void means that the function doesn't return anything.
    public static void main(String[] args) {
        // String[] args is an array of the arguments passed into the program (eg. by command line)

        /* Initialization and accessing objects */
        Member myMember = new Member("Jupiter", "dude", 10, 11);
        Team myTeam = new Team(myMember);
        System.out.println(myTeam.member.getName());
        System.out.println(myTeam.member.getType());
        System.out.println(myTeam.member.getLevel());
        System.out.println(myTeam.member.getRank());
    }
}


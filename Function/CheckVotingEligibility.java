package Function;

import java.util.Scanner;

public class CheckVotingEligibility {
    public static void isEligible(float age) {
        if (age >= 18) {
            System.out.print("Candidate Eligible for voting");
        } else {
            System.out.print("Candidate are not Eligible for voting");
        }

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age of candidate :-");
        float age = sc.nextFloat();
        isEligible(age); // call method
        sc.close();
    }
}

import java.util.Scanner;

public class Lab04_Q1 {

    public static void main(String[] args) {

        float max_num_people;
        float min_num_people;

        Scanner myScan = new Scanner(System.in);

        do {

            System.out.print("Enter the minimum and maximum number of people: ");
            min_num_people = myScan.nextInt();
            max_num_people = myScan.nextInt();
            if (min_num_people >= max_num_people) {
                System.out.println("Invalid input - minimum must be less than maximum...");

            }

        } while (min_num_people >= max_num_people);

        myScan.close();

        // calculating & printing probability

        System.out.println("NUMBER OF PEOPLE             PROBABILITY");


        for (float num_people = min_num_people; num_people <= max_num_people; num_people++) {

            float days = 365;
            float probability = 1;
            float calculation = 1;

             for ( float group_size = num_people; group_size >= 2; group_size--) {

            calculation = calculation * ((days-(group_size-1)) / days); 

            }

            probability = 1 - calculation ;
 
            System.out.printf("%.0f                           %.20f %n",num_people,probability);


        }

    }

}
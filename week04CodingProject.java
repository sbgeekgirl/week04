package week04;

public class week04CodingProject {

    public static void main(String[] args) {

        // Create an arrary
        int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
        ages[ages.length - 1] -=  ages[0];
        
        // Print result
        System.out.println("Last number in ages is now " + ages[ages.length-1]);

        // Create 2nd array
        int[] ages2 = {1, 3, 5, 6, 10, 12, 135, 25, 9};

        // Same math as line 9 but with new array
        // Shows using index values is dynamic
        ages2[ages2.length - 1] -= ages2[0];

        System.out.println("The last number in ages2 is " + ages2[ages2.length -1]);

        // Determine average age
        int ageTotal = 0;
        for (int age: ages){
            ageTotal += age;
        }
        int aveAge = ageTotal / (ages.length);
        System.out.println("The average age is " + aveAge);

        // Array of strings
        String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};

        // Calculate the average number of letters per name
        int totalNameLength = 0;
        for (String name : names){
            totalNameLength += name.length();
        }
        int aveNameLength = totalNameLength / (names.length); 
        System.out.println("Average name length is " + aveNameLength);

        // Concatenate all the names together
        String nameList = "";
        for (String name : names){
            nameList += name + " ";
        }
        System.out.println(nameList);

        /*
         * How do you access the last element of any array?
         * Using the array length - 1 as the index
         * 
         * How do you access the first element of any array?
         * Index 0 points to the first element
         */


         // New int array
         int[] nameLengths = new int[names.length];

         // add length of each name in names to nameLengths
         for (int i = 0 ; i < names.length ; i += 1){
            nameLengths[i] = names[i].length();
         }
         
         // calculate the sum of all elements in nameLengths
         int sumLengths = 0;
         for (int len: nameLengths){
            sumLengths += len;
         }
         System.out.println(sumLengths);

         // run wordLoop method
         wordLoop("Hello", 3);

         // run fullName method
         System.out.println(fullName("Amy", "Tate"));

         // run onehundredPlus method to return true
         int[] returnTrue = {101, 105, 222, 333};
         System.out.println(onehundredPlus(returnTrue));

         // run onehundredPlus method to return false
         int [] returnFalse = {101, 105, 222, 333, 99, 444};
         System.out.println(onehundredPlus(returnFalse));

         // run doubleAve method
         double[] doubles = {11.1, 22.2, 43.3};
         System.out.println("The average of all numbers in the array is " + doubleAve(doubles));

         //run isGreater method to return true
         double[] moreDoubles = {1.1, 2.2, 4.3};
         System.out.println(isGreater(doubles, moreDoubles));

         //run isGreater method to return false
         System.out.println(isGreater(moreDoubles, doubles));

         //run willBuyDrink method to return true
         System.out.println(willBuyDrink(true, 20.02));

         //run willBuyDrink method to return false
         System.out.println(willBuyDrink(true, 5.05));

         //run isSnowbird method to print "It's not a Snowbird!"
         isSnowbird("AZ");

         //run isSnowbird method to print "It's a Snowbird!"
         isSnowbird("MN");
    }
    // takes a word and number (n) and concatenates the word n number of times
    public static void wordLoop(String word, int n){
        String response = "";
        int i = 0;
        while (i < n){
            response += word;
            i += 1;
        }
        System.out.println(response);;
    }

    public static String fullName(String firstName, String lastName){
        return (firstName + " " + lastName);
    }

    public static boolean onehundredPlus(int[] nums){
        boolean plusOneHundred = true;
        for (int num : nums){
            if (num < 100){
                plusOneHundred = false;
                break;
            }
        }
        return plusOneHundred;
    }

    public static double doubleAve(double[] doubles){
        double total = 0;
        for (double nums : doubles){
            total += nums;
        }
        return total/doubles.length;
    }

    public static boolean isGreater(double[] first, double[] second){
        boolean larger = true;
        if (doubleAve(first) < doubleAve(second)){
            larger = false;
        }
        return larger;
    }

    public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket){
        return (isHotOutside = true && moneyInPocket > 10.50);
    }

    // a method of my own making to determine if a car is driven by a snowbird
    public static void isSnowbird(String state){
        if (state.equals("AZ")){
            System.out.println("It's not a Snowbird!");
        } else {
            System.out.println("It's a Snowbird!");
        }
    }
}
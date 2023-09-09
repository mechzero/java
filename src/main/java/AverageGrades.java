public class AverageGrades {


    static int arr[] = {85, 92, 78,95, 88};

    static int sum() {
        int sum = 0;
        int i;

        // Iterate through all elements and add them to sum
        for (i = 0; i < arr.length; i++) {
            sum += arr[i];

        }
        return sum;
    }

    static int average() {


        int length = arr.length;

       int sum = sum();

       int average = sum/length;

        return average;
    }

    public void poop() {

        average();

    }


    public static void main (String[] args){

       displayJsonGrades();



    }

    public static void displayJsonGrades() {

        String filePathOfFile = "src/main/resources/userData.json";

        // Create object of parseJson, to access the json parsing tools
        ParsingJson parseJson = new ParsingJson();

        parseJson.parseJsonFile(filePathOfFile);











    }

    public static void display () {

        System.out.println("Sum of given array is: " + sum());

        System.out.println(" The Average of the given array is: " + average());

    }




}

/*Student 1:
Name: John Doe
Grade: 85

Student 2:
Name: Jane Smith
Grade: 92

Student 3:
Name: Michael Johnson
Grade: 78

Student 4:
Name: Emily Davis
Grade: 95

Student 5:
Name: David Lee
Grade: 88
*/

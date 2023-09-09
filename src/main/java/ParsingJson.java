import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.StringReader;

public class ParsingJson {

    private  static String userData = "src/main/resources/userData.json";
    private static String filePath = "src/main/resources/studentGrades.json";
    private static String jsonString = "{\"name\":\"John\",\"age\":30,\"city\":\"New York\"}";
    public String path;







    public void setMyString(String myString) {
      this.path = myString;
    }

    public String getMyString() {

        return path;
    }

    public static void parseJsonFile(String filePath){

        // Specify the path to the JSON file

        String path = "";
        filePath = path;


        // Create an ObjectMapper instance
        ObjectMapper objectMapper = new ObjectMapper();

        try {
        // Read JSON data from the file
            File jsonFile = new File(path);
           // File jsonFile = new File("src/main/resources/userData.json");
           JsonNode jsonNode = objectMapper.readTree(jsonFile);

           JsonNode personDataArray = jsonNode.get("hobbies");

           // Loop through the array and access the keys

            for (JsonNode student: personDataArray) {


            }




        }
        catch (Exception e) {
            e.printStackTrace();

        }



    }


    public static void main(String[] args){

        // parseJsonFile(filePath);
        // parseJsonFromLocalString(jsonString);
        information("age");
    }


    public static void information(String keyInformation){

        // Create an ObjectMapper instance
        ObjectMapper objectMapper = new ObjectMapper();



        try {
            // Read JSON data from the file
            File jsonFile = new File(userData);
            JsonNode jsonNode = objectMapper.readTree(jsonFile);

            int keySize = jsonNode.size();


            JsonNode infoArr = jsonNode.get(keyInformation);



            // Loop through the array and access the keys


            for (JsonNode data: infoArr) {

                System.out.println(infoArr.get("name"));

            }

            System.out.println("Array Size: " + keySize);





        }
        catch (Exception e) {
            e.printStackTrace();

        }


    }


    public static void parseJsonFromLocalString(String filePath){



        ObjectMapper objectMapper = new ObjectMapper();

        try {
            // Parse JSON String to JsonNode

            JsonNode jsonNode = objectMapper.readTree(filePath);

            // Access Values by key
            String name = jsonNode.get("name").asText();
            int age = jsonNode.get("age").asInt();
            String city = jsonNode.get("city").asText();

            System.out.println("Name: " + name);
            System.out.println("Age " + age);
            System.out.println("City: " + city);
        }
        catch (Exception e) {
            e.printStackTrace();

        }




    }


}

import java.io.*;

public class Read {
    public static void main(String[] args) {
        try {
            // Step 1: Create a FileInputStream to read the file
            FileInputStream fileInputStream = new FileInputStream("C:/Users/rajth/OneDrive/Desktop/User.txt");

            // Step 2: Create an ObjectInputStream to read objects
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            // Step 3: Use a loop to read objects until the end of the file is reached
            try {
                while (true) {
                    // Read an object from the file
                    Object obj = objectInputStream.readObject();
                    
                    // Handle the object as needed (e.g., print or process it)
                    System.out.println("Read Object: " + obj.toString());
                }
            } catch (EOFException e) {
                // End of file reached, stop reading
                System.out.println(e+"End of file reached.");
            }

            // Step 4: Close the ObjectInputStream and FileInputStream
            objectInputStream.close();
            fileInputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

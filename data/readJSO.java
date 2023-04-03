import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ReadJSOFile {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("cleanCleanErDatasets/acmProfiles");
            

            ObjectInputStream ois = new ObjectInputStream(fis)) {
                System.out.println(1);
            ArrayList<?> data = (ArrayList<?>) ois.readObject();
            // Process the deserialized data here
            for (Object obj : data) {
                System.out.println(obj);
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
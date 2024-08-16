import java.io.File;
import java.util.Scanner;

public class CreateFolderHierarchy {
    public static void main(String[] args) {
        System.out.println("Enter the path where you want to create a folder: ");
        Scanner sc = new Scanner(System.in);
        String path = sc.next();

        System.out.println("Enter the name of the desired directory: ");
        path = path + sc.next();

        File folder = new File(path);
        boolean success = folder.mkdirs();

        if (success) {
            System.out.println("Folder hierarchy created successfully!");
        } else {
            System.out.println("Error encountered while creating the folder hierarchy.");
        }
    }
}

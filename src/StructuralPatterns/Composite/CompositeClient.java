package StructuralPatterns.Composite;

public class CompositeClient {
    public static void main(String[] args) {
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");

        Directory directory1 = new Directory("Folder 1");
        directory1.addComponent(file1);
        directory1.addComponent(file2);

        File file3 = new File("file3.txt");
        File file4 = new File("file4.txt");

        Directory directory2 = new Directory("Folder 2");
        directory2.addComponent(file3);
        directory2.addComponent(file4);

        Directory rootDirectory = new Directory("Root");
        rootDirectory.addComponent(directory1);
        rootDirectory.addComponent(directory2);

        // Show properties of the entire file system
        rootDirectory.showProperties();
    }
}
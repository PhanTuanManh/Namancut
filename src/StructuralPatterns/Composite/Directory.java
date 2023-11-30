package StructuralPatterns.Composite;
import java.util.ArrayList;
import java.util.List;
class Directory implements FileSystemComponent {
    private String name;
    private List<FileSystemComponent> components;

    Directory(String name) {
        this.name = name;
        this.components = new ArrayList<>();
    }

    void addComponent(FileSystemComponent component) {
        components.add(component);
    }

    @Override
    public void showProperties() {
        System.out.println("Directory: " + name);
        System.out.println("Contains:");

        for (FileSystemComponent component : components) {
            component.showProperties();
        }
    }
}

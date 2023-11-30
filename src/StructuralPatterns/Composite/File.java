package StructuralPatterns.Composite;

class File implements FileSystemComponent {
    private String name;

    File(String name) {
        this.name = name;
    }

    @Override
    public void showProperties() {
        System.out.println("File: " + name);
    }
}
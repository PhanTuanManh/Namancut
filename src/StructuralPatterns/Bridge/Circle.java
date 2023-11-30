package StructuralPatterns.Bridge;

class Circle implements Shape {
    private Color color;

    Circle(Color color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.print("Draw Circle in ");
        color.applyColor();
    }
}

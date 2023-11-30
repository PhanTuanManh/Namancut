package StructuralPatterns.Bridge;

class Square implements Shape {
    private Color color;

    Square(Color color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.print("Draw Square in ");
        color.applyColor();
    }
}

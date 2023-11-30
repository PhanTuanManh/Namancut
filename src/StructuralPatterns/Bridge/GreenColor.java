package StructuralPatterns.Bridge;

class GreenColor implements Color {
    @Override
    public void applyColor() {
        System.out.println("Green");
    }
}
package StructuralPatterns.Bridge;

class RedColor implements Color {
    @Override
    public void applyColor() {
        System.out.println("Red");
    }
}

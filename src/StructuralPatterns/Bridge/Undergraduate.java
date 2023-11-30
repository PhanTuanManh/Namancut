package StructuralPatterns.Bridge;

class Undergraduate implements StudentType {
    @Override
    public void showType() {
        System.out.println("Undergraduate Student");
    }
}

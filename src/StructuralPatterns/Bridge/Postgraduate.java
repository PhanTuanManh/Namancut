package StructuralPatterns.Bridge;
class Postgraduate implements StudentType {
    @Override
    public void showType() {
        System.out.println("Postgraduate Student");
    }
}

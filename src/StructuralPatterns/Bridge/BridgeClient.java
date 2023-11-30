package StructuralPatterns.Bridge;

public class BridgeClient {
    public static void main(String[] args) {
        StudentType undergraduateType = new Undergraduate();
        StudentType postgraduateType = new Postgraduate();

        StudentAbstraction regularStudent = new RegularStudent(undergraduateType);
        StudentAbstraction exchangeStudent = new ExchangeStudent(postgraduateType);

        regularStudent.showDetails();
        exchangeStudent.showDetails();
    }
}
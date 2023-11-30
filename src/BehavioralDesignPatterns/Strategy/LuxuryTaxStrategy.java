package BehavioralDesignPatterns.Strategy;

class LuxuryTaxStrategy implements TaxStrategy {
    @Override
    public double calculateTax(double income) {
        // Giả sử logic tính thuế theo mô hình thuế sang trọng ở đây
        return income > 50000 ? income * 0.2 : 0;
    }
}
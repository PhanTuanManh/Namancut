package BehavioralDesignPatterns.Strategy;

class FlatTaxStrategy implements TaxStrategy {
    @Override
    public double calculateTax(double income) {
        // Giả sử logic tính thuế theo mô hình thuế cố định ở đây
        return 1000;
    }
}
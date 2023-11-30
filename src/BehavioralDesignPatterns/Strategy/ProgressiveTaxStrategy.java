package BehavioralDesignPatterns.Strategy;

class ProgressiveTaxStrategy implements TaxStrategy {
    @Override
    public double calculateTax(double income) {
        // Giả sử logic tính thuế theo mô hình thuế tiến bộ ở đây
        return income * 0.15;
    }
}

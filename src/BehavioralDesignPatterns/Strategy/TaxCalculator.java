package BehavioralDesignPatterns.Strategy;

class TaxCalculator {
    private TaxStrategy taxStrategy;

    TaxCalculator(TaxStrategy taxStrategy) {
        this.taxStrategy = taxStrategy;
    }

    void setTaxStrategy(TaxStrategy taxStrategy) {
        this.taxStrategy = taxStrategy;
    }

    double calculateTax(double income) {
        return taxStrategy.calculateTax(income);
    }
}

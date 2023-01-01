package masai;

public class TaxationMasai {

    interface Taxation {
        double calculateTax();
    }


    class SalariedPeople implements Taxation {
        //write code here

        double annualIncome;

        public SalariedPeople(int annualIncome) {
            this.annualIncome = annualIncome;
        }


        @Override
        public double calculateTax() {
            double tax = 0.0;
            while (true) {

                if (annualIncome >= 0 && annualIncome <= 250000) {
                    tax += 0.0;
                    break;
                } else if (annualIncome > 250000 && annualIncome <= 500000) {

                    double slab = annualIncome - 250000;
                    annualIncome -= slab;
                    tax += ((double) (annualIncome)) * 0.1;
                } else if (annualIncome > 500000 && annualIncome <= 1000000) {

                    double slab = annualIncome - 500000;
                    annualIncome -= slab;
                    tax += ((double) (annualIncome)) * 0.2;
                } else if (annualIncome > 1000000) {

                    double slab = annualIncome - 1000000;
                    annualIncome -= slab;
                    tax += ((double) (slab)) * 0.3;

                    if (annualIncome > 10000000) {
                        tax += ((double) (750000));
                    }

                }

            }

            return tax;
        }
    }


    class BusinessPeople implements Taxation {
        //write code here

        int sales;
        int costOfMaking;
        int otherExpenses;


        public BusinessPeople(int sales, int costOfMaking, int otherExpenses) {
            this.sales = sales;
            this.costOfMaking = costOfMaking;
            this.otherExpenses = otherExpenses;
        }


        @Override
        public double calculateTax() {
            double annualIncome = (sales) - ((costOfMaking + otherExpenses));

            double tax = 0.0;
            while (true) {


                if (annualIncome >= 0 && annualIncome <= 500000) {
                    break;
                } else if (annualIncome > 500000 && annualIncome <= 1500000) {

                    double slab = annualIncome - 500000;
                    annualIncome -= slab;
                    tax += ((double) (slab)) * 0.1;
                } else if (annualIncome > 1500000 && annualIncome <= 5000000) {

                    double slab = annualIncome - 1500000;
                    annualIncome -= slab;
                    tax += ((double) (slab)) * 0.22;
                } else if (annualIncome > 5000000) {

                    double slab = annualIncome - 1500000;
                    annualIncome -= slab;
                    tax += ((double) (slab)) * 0.32;

                    if (annualIncome > 50000000) {
                        tax += ((double) (1250000));
                    }
                }

            }


            return tax;

        }
    }


}

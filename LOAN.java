package paractice;


import java.util.Date;

public class loan {


        private double annualInterestRate;
        private int numberOfYears;
        private double loanAmount;
        private Date loanDate;


        public loan() {
            this.annualInterestRate = 2.5;
            this.numberOfYears = 1;
            this.loanAmount = 1000;
            this.loanDate = new Date();
        }


        public loan(double annualInterestRate,
                    int numberOfYears,
                    double loanAmount
        ) {
            this.annualInterestRate = annualInterestRate;
            this.numberOfYears = numberOfYears;
            this.loanAmount = loanAmount;
            this.loanDate = new Date();
        }


        public double getAnnualInterestRate() {
            return annualInterestRate;
        }

        public int getNumberOfYears() {
            return numberOfYears;
        }

        public double getLoanAmount() {
            return loanAmount;
        }

        public Date getLoanDate() {
            return loanDate;
        }


        public void setAnnualInterestRate(double annualInterestRate) {
            this.annualInterestRate = annualInterestRate;
        }

        public void setNumberOfYears(int numberOfYears) {
            this.numberOfYears = numberOfYears;
        }

        public void setLoanAmount(double loanAmount) {
            this.loanAmount = loanAmount;
        }


        public double getMonthlyPayment() {
            double monthlyInterestRate = annualInterestRate / 1200;
            int numberOfPayments = numberOfYears * 12;

            double monthlyPayment = loanAmount * monthlyInterestRate
                    / (1 - Math.pow(1 + monthlyInterestRate, -numberOfPayments));

            return monthlyPayment;
        }


        public double getTotalPayment() {
            return getMonthlyPayment() * numberOfYears * 12;
        }


        public String toString() {
            return "Loan: " +
                    "\n\tAnnual Interest Rate: " + annualInterestRate +
                    "\n\tNumber of Years: " + numberOfYears +
                    "\n\tLoan Amount: " + loanAmount +
                    "\n\tLoan Date: " + loanDate +
                    "\n";
        }
    }

    class Test {
        public static void main(String[] args) {


            loan loan1 = new loan();
            System.out.println(loan1);


            loan loan2 = new loan(5.5, 5, 10000);
            System.out.println(loan2);


            System.out.println("annual interest rate is: "
                    + loan2.getAnnualInterestRate());

            System.out.println("number of years is: "
                    + loan2.getNumberOfYears());

            System.out.println("loan amount is: "
                    + loan2.getLoanAmount());

            System.out.println("loan date is: "
                    + loan2.getLoanDate());


            loan2.setAnnualInterestRate(6.0);
            loan2.setNumberOfYears(10);
            loan2.setLoanAmount(20000);

            System.out.println(loan2);

            System.out.println("monthly payment is: "
                    + loan2.getMonthlyPayment());

            System.out.println("total payment is: "
                    + loan2.getTotalPayment());
        }
    }
}

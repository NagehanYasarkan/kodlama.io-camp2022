public class Main {
    public static void main(String[] args) {

//        TutorLoanManager tutorLoanManager = new TutorLoanManager();
//        tutorLoanManager.Calculate();

        LoanUI loanUI = new LoanUI();
        loanUI.CalculateLoan(new TutorLoanManager());
    }
}
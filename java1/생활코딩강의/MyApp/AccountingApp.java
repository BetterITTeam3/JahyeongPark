
public class AccountingApp {

	public static void main(String[] args) {
		double ValueOfSupply = Double.parseDouble(args[0]);

		System.out.println("Value of supply : " + ValueOfSupply);
		
		double VAT_rate = 0.1;
		double VAT = ValueOfSupply * VAT_rate;
		double Total = ValueOfSupply + VAT;
		double Expense_rate = 0.3;
		double Expense = ValueOfSupply * Expense_rate;
		double Income = ValueOfSupply - Expense;
		
		System.out.println("VAT : " + VAT);
		System.out.println("Total : " + Total);
		System.out.println("Expense : " + Expense);
		System.out.println("Income : " + Income);
		
		double Dividend1 = Income * 0.5;
		double Dividend2 = Income * 0.3;
		double Dividend3 = Income * 0.2;
		
		System.out.println("Dividend 1 : " + Dividend1);
		System.out.println("Dividend 2 : " + Dividend2);
		System.out.println("Dividend 3 : " + Dividend3);

	}

}

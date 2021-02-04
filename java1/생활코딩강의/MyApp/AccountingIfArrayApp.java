
public class AccountingIfArrayApp {

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
		
		double Dividend1 = 0;
		double Dividend2 = 0;
		double Dividend3 = 0;
		
		double [] Dividend_rate = new double [6];	//배열 선
		Dividend_rate[0] = 0.5;
		Dividend_rate[1] = 0.3;
		Dividend_rate[2] = 0.2;
		Dividend_rate[3] = 1.0;
		Dividend_rate[4] = 0.0;
		
		if (Income > 10000.0) {
			Dividend1 = Income * Dividend_rate[0];
			Dividend2 = Income * Dividend_rate[1];
			Dividend3 = Income * Dividend_rate[2];
		}
		else {
			Dividend1 = Income * Dividend_rate[3];
			Dividend2 = Income * Dividend_rate[4];
			Dividend3 = Income * Dividend_rate[4];
		}
		
		System.out.println("Dividend 1 : " + Dividend1);
		System.out.println("Dividend 2 : " + Dividend2);
		System.out.println("Dividend 3 : " + Dividend3);

	}

}

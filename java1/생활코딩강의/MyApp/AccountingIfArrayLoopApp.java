
public class AccountingIfArrayLoopApp {

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
		
		int SIZE = 3;
		int i;
		
		double[] Dividend = new double[SIZE];
		double[] Dividend_rate = new double[SIZE];
		
		if (Income > 10000.0) {
			Dividend_rate[0] = 0.5;
			Dividend_rate[1] = 0.3;
			Dividend_rate[2] = 0.2;
		}
		else {
			Dividend_rate[0] = 1.0;
			Dividend_rate[1] = 0.0;
			Dividend_rate[2] = 0.0;
		}
		
		for (i = 0; i < SIZE; i++) {
			Dividend[i] = Income * Dividend_rate[i];
		}
		
		i = 0;
		while (i < SIZE) {
		System.out.println("Dividend" + (i + 1) + " : " + Dividend[i]);
		i += 1;
		}

	}

}

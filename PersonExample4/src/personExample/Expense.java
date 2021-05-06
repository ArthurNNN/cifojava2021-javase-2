package personExample;

public class Expense {
	String title;
	double amount;
	Boolean isMensual;

	public Expense() {
		super();
	}

	public Expense(double amount) {
		super();
		this.amount = amount;
	}

	public Expense(String title, double amount, Boolean isMensual) {
		super();
		this.title = title;
		this.amount = amount;
		this.isMensual = isMensual;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Boolean getIsMensual() {
		return isMensual;
	}

	public void setIsMensual(Boolean isMensual) {
		this.isMensual = isMensual;
	}

	@Override
	public String toString() {
//		String s1 ="\n" + title + " - ";
//		double double1 = amount;
//		String s2 =(isMensual ? " euro/month" : " one-time") + " payment";	
//		System.out.format("%32s%8f%16s", s1, double1, s2);
//		System.out.println();
		return "\n" + title + " - " + amount + (isMensual ? " euro/month" : " one-time") + " payment";
	}

}

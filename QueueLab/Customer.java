package QueueLab;

public class Customer {

	private int ArrivalTime;
	private int TransactionTime;
	private int CustomerNumber;

	public Customer(int clock, int transactionTime,  int numberOfArrivals) {
		this.ArrivalTime = clock;
		this.TransactionTime = transactionTime;
		this.CustomerNumber = numberOfArrivals;
		
	}

	public int getArrivalTime() {
		return this.ArrivalTime;
	}

	public int getTransactionTime() {
		return this.TransactionTime;
	}

	public int getCustomerNumber() {
		return this.CustomerNumber;
	}

}

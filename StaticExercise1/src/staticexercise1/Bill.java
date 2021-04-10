//lex_auth_012908251364786176516
//do not modify the above line

package staticexercise1;

public class Bill {
	 //Implement your code here
	private static int counter;
	private String billId;
	private  String paymentMode;
	
	static {
		counter=9001;
	}
	public Bill(String paymentMode) {
		this.paymentMode=paymentMode;
		this.billId="B"+(++Bill.counter);
		
	}
	//getters and setters
	public static int getCounter() {
		return counter;
	}
//	public static void setCounter(int counter) {
//		Bill.counter = counter;
//	}
	public String getBillId() {
		return billId;
	}
	public void setBillId(String billId) {
		this.billId = billId;
	}
	public  String getPaymentMode() {
		return paymentMode;
	}
	public  void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	
}

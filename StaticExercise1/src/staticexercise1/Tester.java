//lex_auth_012908251364786176516
//do not modify the above line

package staticexercise1;

public class Tester {
	
	 public static void main(String[] args) {

	        Bill bill1 = new Bill("DebitCard");
	        Bill bill2 = new Bill("PayPal");
	        
	        //Create more objects and add them to the bills array for testing your code
	              
	        Bill[] bills = { bill1, bill2 };
	              
	        for (Bill bill : bills) {
	            System.out.println("Bill Details");
	            System.out.println("Bill Id: " + bill.getBillId());
	            System.out.println("Payment method: " + bill.getPaymentMode());
	            System.out.println();
	       }
	    }

}

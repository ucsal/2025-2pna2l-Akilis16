package br.com.mariojp.solid.lspaccounts;

public class BankService {
    public void processWithdrawal(Account acc, double amount){ 

    	if(acc instanceof Withdrawable) acc.withdraw(amount);
    	
// 		Poderia ser assim, né Mario?!
//    	try {
//    		Withdrawable wd = (Withdrawable) acc;
//    		wd.withdraw(amount);
//		} catch (Exception e) {
//			System.err.println("QUAAAAAAAASE ERREI PAPACO!");
//		}
    }
}
package javaapplication29;

public class JavaApplication29 {
    public static void main(String[] args) {
       Account acc1=new Account();
         acc1.setBalance(50000);
       Account acc2=new Account(10204,80000); 
        System.out.println(acc2.getId());
        System.out.println(acc2.getBalance());
        System.out.println(acc2.getAnnulInterestRate());
        System.out.println(acc2.getDateCreated());
    }
}
      


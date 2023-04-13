package javaapplication29;

public class Account {
    private int id=0;
    private double balance=0;
    private double annulInterestRate=0;
    private java.util.Date dateCreated;
       public Account(){
           dateCreated=new java.util.Date();
       }
       public Account (int i, double b){
            
             this();
             this.id=i;
             this.balance=b;
       }
       public void setId(int i){
           this.id=i;
       }
       public void setBalance(double b){
           this.balance=b;
       }
       public void setAnnulInterestRate(double a){
           this.annulInterestRate=a;
       }
       public int getId(){
           return this.id;
       }
       public double getBalance(){
           return this.balance;
       }        
       public double getAnnulInterestRate(){
           return this.annulInterestRate;
       }  
       public String getDateCreated(){
           return this.dateCreated.toString();
       }
       public double getMonthlyInterestRate(){
           return annulInterestRate/12;
       }
       public double getMonthlyInterest(){
           return balance*getMonthlyInterestRate();
       }
       public  void withdraw(int w){
           int withdraw=w;
           if(w< balance){
             System.out.println("Your withdraw has been accepted collect your money");
             this.balance-=w;
             System.out.println("your balance: "+balance);
           }else
               System.out.println("Your withdraw has been regected");
           
       }
       public  void deposit(int d){
            int deposite=d;
            this.balance+=d;
            System.out.println("your balance: "+balance);
       }
}

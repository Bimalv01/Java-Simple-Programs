import java.util.Scanner;
public class BA{
int no;
Double Amount=0.0;
//new account method
public void New(int num){
this.no=num;
this.Amount=0.0;
System.out.println("Account has been created Successfully!");
}
//deposit method
public void deposit(int no,Double amount){
if(this.no==no){
this.Amount=amount;
System.out.println("Deposited successfully!");
}else{
System.out.println("wrong Account number!");
}
}
//balance method
public void balance(int no){
if(this.no==no){
System.out.println("Balance :"+this.Amount);
}else{
System.out.println("wrong Account number!");
}
}
//withdraw method
public void withdraw(int no,Double amount){
if(this.no==no){
System.out.println();
}else{
System.out.println("wrong Account number!");
}
if(this.Amount<=amount){
System.out.println("Sorry you don't have this Amount in your Account");
}else{
this.Amount-=amount;
System.out.println(amount+" Has been Debited ");
}
}
public static void main(String[] args){
BA bank = new BA();
Scanner in = new Scanner(System.in);
Scanner input = new Scanner(System.in);

while(true){
System.out.println("1. Create Account");
System.out.println("2. Deposit");
System.out.println("3. Balance");
System.out.println("4. Withdraw");
System.out.println("5. Exit");
System.out.println("enter your choice");
int c=in.nextInt();
int num;
double a;
switch(c){
case 1:
System.out.println("Enter the account number :");
num=input.nextInt();
bank.New(num);
break;
case 2:
System.out.println("Enter the account number :");
num=input.nextInt();
System.out.println("Enter the Amount :");
a=input.nextDouble();
bank.deposit(num,a);
break;
case 3:
System.out.println("Enter the account number :");
num=input.nextInt();
bank.balance(num);
break;
case 4:
System.out.println("Enter the account number :");
num=input.nextInt();
System.out.println("Enter the Amount :");
a=input.nextDouble();
bank.withdraw(num,a);
break;
case 5:
System.out.println("Exited!");
input.close();
return;
default :
System.out.println("invlid!");
}
}
}
}
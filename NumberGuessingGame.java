import java.util.*;
class NumberGuessingGame{
public static void main(String[] args){
Random k=new Random();
Scanner sc=new Scanner(System.in);
int d=0,ch,n=0;
while(true){
System.out.println("Enter your choice:\n1.Start the game\n2.Quit");
ch=sc.nextInt();
int x=k.nextInt(100);
switch(ch){
    case 1:
    n++;
System.out.println("Round "+n+" starts");
int z=0;
while(true){
System.out.println("Guess the Number");
int y=sc.nextInt();
if(y==x){
System.out.println(" Win \n"+"Number is "+x);
System.out.println(" * Score is "+(100-(z*10))+" *");
break;
}
else if(y>x){
if(z!=10){
System.out.println("Little Low");
}
}
else{
    if(z!=10)
System.out.println("Little High");
}
z++;
if(z==11){
System.out.println(" * Score is "+y+" *\n"+"Try Again");
break;
}
}
break;
case 2:
System.out.println("Exit the Game?\nYes\nNo");
    String e=sc.next();
    if(e.equalsIgnoreCase("Yes"))
     java.lang.System.exit(0);
     else
     break;
 }
}
}
}

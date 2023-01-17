// Q_10
package numbercounting;
import java.util.Scanner;
public class Numbercounting {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int count=0,count2=0,count3=0,tot=0;
        float average=0;
    System.out.println("ENTER THE INTEGER THE INPUT IS END IF NUMBER =0");
      int n=scan.nextInt();  
      if (n == 0) { 
System.out.println("No numbers are entered except 0");
System.exit(1);
}
while (n != 0) {
if (n > 0)
count++; 
else
count2++; 
tot += n;
count3++; 
n = scan.nextInt();
}
 average = tot / count3;
System.out.println("THE NUMBER OF POSITIVE NUMBERS IS "+count );
System.out.println("THE NUMBER OF POSITIVE NUMBERS IS "+count2 );
System.out.println("THE SUM NUMBERS IS "+tot);
System.out.println("THE AVERAGE OF NUMBERS IS "+average);


}
}  
        
        
        
    

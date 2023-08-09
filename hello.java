import java.util.Scanner;
class clasadd {
    public int sum(int a,int b){
        return a+b;
    }
}
public class add {
    public static void main(String []args){
        clasadd a=new clasadd();
        int num1,num2;
        Scanner sc=new Scanner(System.in);
        num1=sc.nextInt();
        num2=sc.nextInt();
        int sum=0;
        sum=a.sum(num1,num2);
        System.out.println("sum of the numbers is:-"+ sum);
        sc.close();
    }
    
}


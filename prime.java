import java.util.Scanner;
public class prime {
    public static void main(String[] args){
        int i,a;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the number");
        a=obj.nextInt();
        boolean flag=true;
        for(i=2;i<a;i++)
        {
            if(a%i==0)
            flag=false;
        }
        if(flag==true){
                System.out.println("prime");

            }
            else{ 
             System.out.println("not prime");}
        

    }


    
}

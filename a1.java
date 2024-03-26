import java.util.Scanner;

public class a1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the num of values");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter the values");
        for(int i=0;i<n;i++){
            a[i]= sc.nextInt();
        }
        for(int j:a){
            System.out.print(j+" ");
        }

    }
}

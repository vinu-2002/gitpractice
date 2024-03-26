public class bubble {
    public static void buu(int a[]){
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int a[]={7,89,71,654,724,2,1,0,-1,-56};
        System.out.println("before sorting");
        for(int e:a){
            System.out.print(e+" ");
        }
        buu(a);
        System.out.println(" ");
        System.out.println("after sorting");

        for (int l:a){
            System.out.print(l+" ");
        }
    }
}

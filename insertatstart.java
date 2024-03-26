public class insertatstart {
    public static void insertStart(int a[],int val){
        for(int i=a.length-1;i>0;i--){
            a[i]=a[i-1];
        }
        a[0]=val;
    }

    public static void main(String[] args) {
        int a[]={2,3,4,5,6};
        insertStart(a,1);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}

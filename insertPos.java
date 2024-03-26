public class insertPos {
    public static void insertPos(int a[],int pos,int val){
        for(int i=a.length-1;i>pos;i--){
            a[i]=a[i-1];

        }
        a[pos]=val;
    }
    public static void main(String[] args) {
        int a[]={4,5,6,7,8};
        insertPos(a,2,100);
        for(int y:a){
            System.out.print(y+" ");
        }
    }
}

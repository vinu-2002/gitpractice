public class search {
    public static int linears(int a[],int ele)
    {
        for(int i=0;i<a.length;i++){
            if(a[i]==ele){
                return i;
            }
        }
      return -1;
    }
    public static void main(String[] args) {
        int a[]={5,7,6,9,11,10,15,75};
        System.out.println(linears(a,115));
    }
}

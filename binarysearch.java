public class binarysearch {
    public static int bin(int a[],int start,int end,int ele){

        while(start<end){
            if(a.length==0||start>end){
                return -1;
            }
            int mid=(start+end)/2;
            if(a[mid]==ele){
                return mid;
            } else if (ele<=a[mid]) {
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int a[]={1,2,5,7,9,10,11};
        System.out.println(bin(a,0,a.length-1,10));
    }
}

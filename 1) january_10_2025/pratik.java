class Pratik {

    static int findSecondLargest(int[] arr) {
        int lar=arr[0],sec=-1;
        for(int n:arr){
            if(n>lar){
                sec=lar;
                lar=n;
            }else if(n>sec&&n<lar){
                sec=n;
            }
        }
        return sec;
    }

    public static void main(String[] args) {
        int arr[]={1,2,4,5,5,6,7,8};
        int result = findSecondLargest(arr);

        if (result == -1) {
            System.out.println("Second largest element not found");
        } else {
            System.out.println("Second largest element: " + result);
        }
    }
}

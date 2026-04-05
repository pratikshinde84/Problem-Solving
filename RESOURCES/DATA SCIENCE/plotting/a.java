class a{
    int nextPowerOf2(int n){
        int count=1;
            int n1=n;
            while(n>0){
                int ans=n&0;
                if(ans==0){
                    break;
                }
                n>>=1;
                count++;
            }
            System.out.println(count);
            System.out.println((int)Math.pow(2,count));
        return n1+(int)Math.pow(2,count);
    }
    public static void main(String[] args) {
        a a1=new a();
        System.out.println(a1.nextPowerOf2(6));
    }
}

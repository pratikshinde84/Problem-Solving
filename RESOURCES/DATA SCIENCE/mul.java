class mul{
    void div(int a, int b) {
        int ans=0;
        while(a>=b){
            a=a-b;
            ans++;
        }
        System.out.println(a + " "+ans);
    }
    public static void main(String[] args) {
        mul m = new mul();
        m.div(7, 3);
    }
}
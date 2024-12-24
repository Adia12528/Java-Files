class helloExample{
    static int multi(int a, int b){
        return (a*b);
    }
    static int multi(int a, int b, int c){
        return (a*b*c);
    }
    public static void main(String[] args) {
        helloExample h = new helloExample();
        int n1 = h.multi(1, 5);
        System.out.println("Value of first: "+n1);
        int n2 = h.multi(1, 4, 0);
        System.out.println("Value of second: "+n2);
    }

}
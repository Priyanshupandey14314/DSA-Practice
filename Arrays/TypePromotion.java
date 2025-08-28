class TypePromotion{
    public static void main(String[] args) {
        char c= 'a';
        byte b = 25;
        short s = 1024;
        long res  = (long)c+b+s;
        System.out.println(res);
    }
}
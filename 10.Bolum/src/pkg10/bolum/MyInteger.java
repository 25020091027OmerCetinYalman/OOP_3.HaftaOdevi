package pkg10.bolum;

public class MyInteger {
    private int value;
    
   
    public MyInteger(int value){
        this.value = value;
    }
    
    
    public int getValue(){
        return value;
    }
    
    
    public boolean isEven(){
        return isEven(this.value);
    }
    
    public boolean isOdd(){
        return isOdd(this.value);
    }
    
    public boolean isPrime() {
        return isPrime(this.value);
    }
    
    
    public static boolean isEven(int val){
        return val % 2 == 0;
    }
    
    public static boolean isOdd(int val){
        return val % 2 != 0;
    }
    
    public static boolean isPrime(int val) {
        if (val <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(val); i++) {
            if (val % i == 0) {
                return false;
            }
        }
        return true;
    }
    
   
    public static boolean isEven(MyInteger myInt){
        return myInt.isEven();
    }
    
    public static boolean isOdd(MyInteger myInt){
        return MyInteger.isOdd(myInt.getValue());
    }
    
    public static boolean isPrime(MyInteger myInt) {
        return myInt.isPrime();
    }
    
    
    public boolean equals(int val){
        return this.value == val;
    }
    
    public boolean equals(MyInteger myInt){
        return this.value == myInt.getValue();
    }
    
   
    public static int parseInt(char[] chars){
        int result = 0;
        for (int i = 0; i < chars.length; i++) {
            result = result * 10 + (chars[i] - '0');
        }
        return result;
    }
    
    public static int parseInt(String s){
        return Integer.parseInt(s);
    }
    
    
    public static void main(String[] args) {
        MyInteger n1 = new MyInteger(7);
        MyInteger n2 = new MyInteger(24);
        
        System.out.println("n1 sayısı: " + n1.getValue());
        System.out.println("n1 çift mi? " + n1.isEven());
        System.out.println("n1 asal mı? " + n1.isPrime());
        
        System.out.println("-------------------");
        
        System.out.println("n2 sayısı: " + n2.getValue());
        System.out.println("n2 tek mi? " + n2.isOdd());
        System.out.println("17 sayısı asal mı? (Static): " + MyInteger.isPrime(17));
        
        System.out.println("-------------------");
        
        char[] charArray = {'1', '9', '9', '8'};
        System.out.println("Karakter dizisinden parseInt: " + MyInteger.parseInt(charArray));
        System.out.println("String'den parseInt: " + MyInteger.parseInt("2026"));
    }
}

public class Palindromo {
    public static boolean NumeroPalindromo (int x)
    {
        if(x < 0 || (x != 0 && x % 10 == 0)){
            return false;
        }

        int reversa = 0;
        int original = x;

        while( x > reversa) {
            reversa = (reversa * 10) + (x % 10);
            x /= 10; 
        }
        
        return (x == reversa) || (x == reversa / 10);
    }
    public static main(String[] args){
        
    }
}
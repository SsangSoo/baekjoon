import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int c = a-b;
        
        if(c>0) System.out.println(">");
        else if(c<0) System.out.println("<");
        else System.out.println("==");
    }
}
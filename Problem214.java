import java.util.*;
public class Problem214
{
    public static void main(String[] args){
       long total = 0;
       Problem214a P214a = new Problem214a();
        for(int i=2; i<40000000; i++){
        if (P214a.isPrime(i)){
            if (P214a.phi(i,0) == 25){
                total += i;
                System.out.println("\t"+total+", " + i);
            }
            
        }
        if (i%10000000 ==0)
            System.out.println(i);
       }
       System.out.println(total);
       System.out.println("1677366278943");
    }
}

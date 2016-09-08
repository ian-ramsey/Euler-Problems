
/**
 * Write a description of class p here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class p
{
    public static void phitest(int a){
        Problem214a p = new Problem214a();
        System.out.println(p.phi(a,0));
        //       for (int i=1;i<100;i++){
        //       if (i%10==0)
        //       System.out.println();
        //       System.out.print(""+ i + p.isPrime(i) + ",");
        //     }
        for (int n = 1; n<=a; n++)
        System.out.println(""+ n + "\t" + p.phi3(n));
        
    }
}

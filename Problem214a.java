import java.lang.Math.*;
 
public class Problem214a {
    boolean[] pArray = new boolean[40000000];
    public Problem214a(){
        //computes prime array
       for (int i=2; i<6324; i++){
           if (!pArray[i]){
               for (int j = 0; (i*i+j*i)<40000000; j++){
                   if ((i*i)+(j*i)>40000000)
                   break;
                   pArray[(i*i)+(j*i)] = true;
                }
            }
        }
    }
    //return if prime
    public boolean isPrime(int c){
        if (!pArray[c])
        return true;
        return false;
    }    
    //finds totient of n
    public int phi3(int n){
       if (n<2)
         return 1;
       if (isPrime(n))
         return n-1;
       if ((n & 1 )== 0){// if n is even
           int m = n >> 1;//m is n/2 
           return (m & 1)==0 ? phi3(m)<<1 : phi3(m);// if m is even return phi3(m)*2 else return phi3(m)
       }
       for(int g = 2; g<n; g++){ 
          if ((n % g)!=0)
           continue;
           int o = n/g;
           int d = gcd(g,o);
           return d==1 ? phi3(g)*phi3(o) : phi3(g)*phi3(o)*d/phi3(d);
        }
        return 0;
    }
    public int gcd(int a,int b){
        if (b == 0)
            return a;
        else
            return gcd(b,a % b);
    }
    public int phi(int a, int b){
        if (a == 2)
        return b+2;
        if (b > 30)
        return -1;
        return phi(phi3(a), b+1);
        
    }
}
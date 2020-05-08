
import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        if(n>=0 && n<=50)
        {
         int  p;
            
            int i=1,k=1;
            
            while(i<=n)
            {
                p=k;
                 int j=1;
                  System.out.print(p);
              
                while(j<n)
                {
                  
                    p=p+2;
                    if(p<=((2*n)-1))
                    {
                    
                    System.out.print(p);
                    }
                    else
                    {
                        p=1;
                        System.out.print(p);
                    }
                    j++;
                
                
                }
                k=k+2;
                i++;
                System.out.println();
            }
        }
	}
}

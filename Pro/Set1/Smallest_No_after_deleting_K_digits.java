//rechechecking removed all other op stmts
import java.util.*;
import java.lang.Math;
public class AL{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long ip = sc.nextLong();
        //System.out.println("Ip from user = "+ip);
        long d=sc.nextLong();
        //System.out.println("D from user Nos to delete = "+d);
        long k,div,result,n;
        n=result=div=0;
        k=(long)(Math.log10(ip)+1);
        //System.out.println("No of terms in the integer"+k);
        for(int i=0;i<=d-1;i++){
            k=k-1;
        }
        //System.out.println("Val of k before exp= "+k);
        div=(long)Math.pow(10,k);
        //System.out.println("divisior = "+div);
        result = ip/div;
        result=result*div;
        result=ip-result;
        System.out.println(result);
        
    }
    
}


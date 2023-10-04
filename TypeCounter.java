import java.util.*;
import java.io.*;
import java.lang.*;
public class add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sen = sc.nextLine();
        sc.close();
        int ff = 0;
        int ss = 0,dd=0;
        boolean sflag = true,fflag = true;
        String [] sen2= sen.split(" ");
        for (int i = 0; i < sen2.length; i++) {
            try{
                Integer d= Integer.parseInt(sen2[i]);
                
            }catch (NumberFormatException ex1){
                fflag= false;
            }
            if(fflag==false){
                try{
                    Double g = Double.parseDouble(sen2[i]);
                }catch (NumberFormatException ex1){
                    sflag = false;
                }
            }
        }
        if (fflag)
        ii=ii+1;
        if(sflag==true&& fflag = false)
         dd = dd+1;
        if (sflag == false) {
            ss = ss + 1;
            fflag = true;
            sflag = true;
        }
        System.out.println("string"+ss);
        System.out.println("integer"+ii);
        System.out.println("double"+dd);
            
        }
        
        
        
    }

}
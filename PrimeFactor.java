public class PrimeFactor{
    public static void main(String []args){
        int a,i,j,f=1;
        a=Integer.parseInt(args[0]);
        for(i=1;i<a;i++){
            if(a%i==0){
                for(j=2;j<i;j++){
                    if(i%j==0){
                        f=0;
                        break;
                    }
                 }
                 if(f==1){
                     System.out.println(i+" ");
                 }
             }
        }
    }
}
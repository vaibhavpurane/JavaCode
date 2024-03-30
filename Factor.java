public class Factor{
    public static void main(String []args){
        int a,i,f;
        a=Integer.parseInt(args[0]);
        for(i=1;i<a;i++){
            if(a%i==0){
                System.out.println(i+" ");
            }
        }
    
}

}
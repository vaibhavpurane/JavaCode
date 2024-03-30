public class Fibb{
    public static void main(String args[]){
        int a=0,b=1,c=0,d,i;
        d=Integer.parseInt(args[0]);
        System.out.println(a);
        System.out.println(b);
        for(i=0;i<d;i++){
            c=a+b;
            a=b;
            b=c;
            System.out.println(c+" ");
        }
    }
}
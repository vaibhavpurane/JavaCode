import java.util.*;

class AutoboxingUnboxing{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.println("primitive data type into Wrapper object conversion ");

//       System.out.println("Enter char ");
//        char a = sc.next().charAt(0);
  //      Character b = a;
  //      System.out.println("B is "+b);    
        
    //    System.out.println("Enter short ");
//        short c = sc.nextShort();
//        Short d = c;
//        System.out.println("D is "+d);    
        //
 //       System.out.println("Enter long ");
   //     long e = sc.nextLong();
     //   Long f = e;
       // System.out.println("f is "+f);    
        
        System.out.println("Enter double ");
        double g = sc.nextDouble();
        Double h = g;
        System.out.println("B is "+h);        
        
        System.out.println("Enter byte ");
        byte k = sc.nextByte();
        Byte l = k;
        System.out.println("L is "+l);    
        
        System.out.println("Enter integer ");
        int m = sc.nextInt();
        Integer n = m;
        System.out.println("N is "+n);    
        
        System.out.println("Enter float ");
        float o = sc.nextFloat();
        Float p = o;
        System.out.println("P is "+p);    
        
        System.out.println("Enter boolean ");
        boolean i = sc.nextBoolean();
        Boolean j = i;
        System.out.println("J is "+j);

        System.out.println("Wrapper object into primitive data type conversion ");

        Integer intobj = 10;
        int iobj = intobj;
        System.out.println("int is "+iobj);

        Float fobj = 5.12f;
        float ff = fobj;
        System.out.println("float is "+ff);

        Byte bobj = 10;
        byte bb = bobj;
        System.out.println("byte is "+bb);

        Long lobj = 512L;
        long ll = lobj;
        System.out.println("long is "+ll);

        Boolean bbobj = true;
        boolean bo = bbobj;
        System.out.println("boolean is "+bo);

    }

}

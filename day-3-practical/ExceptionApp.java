import java.util.*;

class ExceptionApp{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a choice: 1: Arithmatic Exception\t2: ArrayIndexOutOfBoundException.\t3: NullPointerException\t4: ClassNotFoundException.\t5: NumberFormatException\t6: InputMismatchException ");
        int ch = sc.nextInt();

        switch(ch){
            case 1:

               try{
                System.out.println("Enter two value for division \n");
                 int a=sc.nextInt();
                 int b=sc.nextInt();
                 int c = a/b;
            
               }
               catch(ArithmeticException e){
               System.out.println(e);
               }
                break;
            case 2: 

               try{
                 int arr[]=new int[5];
                 arr[6]=11;
                }
                catch(ArrayIndexOutOfBoundsException e){
                     System.out.println(e);
               }
                break; 

            case 3: 

               try{
                 String x=null;
                 System.out.println(x.charAt(0));

                }
                catch(NullPointerException e){
                     System.out.println(e);
               }
                break; 
            case 4:

               try{
                 Class.forName("Exceptionapp");

                }
                catch(ClassNotFoundException e){
                     System.out.println(e);
               }
                break;

            case 5:

               try{
                 int no=Integer.parseInt("abc");
                  System.out.println(no);

                }
                catch(NumberFormatException e){
                     System.out.println(e);
               }
                break;

            case 6: 

               try{
                 int no1=sc.nextInt();
                  System.out.println(no1);

                }
                catch(InputMismatchException e){
                     System.out.println(e);
               }
                break;
        }
     }
}
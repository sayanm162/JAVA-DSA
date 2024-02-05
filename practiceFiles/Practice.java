public class Practice {

  public static void main(String agrs[]) {
   //nested try blocks
   
   //outer try
   try {

    //inner try 1
    try {

      //inner try 2 
      try {
        int arr[] = {1,1,1,1};
        System.out.println(arr[4]);
      }

      catch(ArithmeticException e) {
        System.out.println(e);
        System.out.println("Handled in the innermost try itself");
      }
    }
    catch(ArrayIndexOutOfBoundsException e) {
      System.out.println(e);
      System.out.println("Handled by the inner try block 2");
    }
   }
   catch(Exception e) {
    System.out.println(e);
    System.out.println("Handled by the outer try block by Parent Exception");
   }

   System.out.println("Rest of the code");
  }
}
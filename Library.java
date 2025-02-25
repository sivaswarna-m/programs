class Library 
 {
     public static void main(String args[])
     {
       int days=35;
       int book_price=200;
       int charge=10;
       if(days<0)
       {
          System.out.println("invalid input");
       }

       else if(days<31)
       {
         System.out.println("no need to pay ");
       }
       else if(days==31)
       {
         System.out.println("need to pay"+book_price);
       }
       else if(days>31)
       {
         System.out.println("need to pay"+(charge*days));
       }
       else 
       {
          System.out.println("invalid input");
       }

     }
}
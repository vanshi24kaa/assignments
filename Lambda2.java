
    interface Orders
    {
        void criteria(int price);
    }
    public class Lambda2 {
    public static void main(String args[])
        {
            Orders lamdaexpression=(int a)->
            {
                if(a>10000)
                {
                    System.out.println("order price is more than 10000");
                    System.out.println("Completed");
                }
                else
                {
                    System.out.println("not accepted");
                }
            };
            lamdaexpression.criteria(20000);
        }
    }



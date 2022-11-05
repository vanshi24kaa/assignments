import java.lang.*;
import java.util.*;
class Date
{
    int date;
    int month;
    int year;
    public Date(int d, int m, int y) {
        this.date = d;
        this.month = m;
        this.year = y;
    }
     @Override
    public String toString(){
        return "Date{" + "date=" + date + ", Month=" + month + ", year=" +year + '}';

    }
}
public class LinkedListExample {
    public static void main(String args[])
    {
     LinkedList<Date> list=new LinkedList<>();
     Date d1=new Date(3,8,2001);
     Date d2=new Date(10,11, 2010);
     Date d3=new Date(28,12, 2011);
     Date d4=new Date(10,11, 2016);
     list.add(d1);
     list.add(d2);
     list.add(d3);
     list.add(d4);
     System.out.println(list);
        Iterator<Date> iterator=list.iterator();
        while(iterator.hasNext())
        {
            //int =iterator.next();
            //int month=iterator.next().month;
            //int year=iint date = iterator.next().date;
            //int month=iterator.next().Month;
            Integer year=iterator.next().year;
            if(year%4==0) {
                //System.out.println("the date of birth is " + date+"-"+month+"-"+year+" is leap year");
                System.out.println("the date of birth is " + year + " is leap year");
           }
           else
                {
                    //System.out.println("the date of birth is " +date+"-"+month+"-"+year+" is not leap year");
                    System.out.println("the date of birth is " + year + " is not leap year");
                }
        }
    }
}

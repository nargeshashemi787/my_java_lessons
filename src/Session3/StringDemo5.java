package Session3;

public class StringDemo5 {
    static void main(String[] args) {
        //immutable
   /*     String str1="ali";//object creation
        //str1.concat("reza");  str1تغییری نمیکنه
       str1= str1.concat("reza");//تغییر میکنه str1ومیشه علی رضا object creation
        System.out.println(str1);

     */   //mutable

        StringBuilder str1= new StringBuilder("ali");  //******
      //  String str2="ali";
       // System.out.println(str2.length());
        System.out.println(str1.length());
        System.out.println(str1.capacity());

        System.out.println("##############");
        StringBuilder str2=new StringBuilder();   //*****مثل اینجا علی نداره که بشه 19 تا چون خالیه همون 16 میمونه
        str2.append("ali");
        System.out.println(str2.length());
        System.out.println(str2.capacity());  //

        System.out.println("##############");
        StringBuilder str3=new StringBuilder();   //*****مثل اینجا علی نداره که بشه 19 تا چون خالیه همون 16 میمونه
        str3.append("ali");
        str3.trimToSize();// فضای اضافه رو حذف میکنه و ظرفیت اندازه متن واقعی کن
        System.out.println(str3.length());
        System.out.println(str3.capacity());  //



    }
}

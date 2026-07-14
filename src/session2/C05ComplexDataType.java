package session2;

public class C05ComplexDataType {

    int k;//یه ادرس در فضای هیپ ما* یه ابجکت رفت در فضای هیپ ساخت
    Student s;

    static void main(String[] args) {

        //int i=12;
        //Student s= literal value;

       // Student s=new Student(); //جنسش ادرسه ادرس ابجکتی که جاوا تو فضای هیپ ساخته
      //  s.code// با نقطه به هر فیلدی که در کلاسه هست دسترسی دارم
        C05ComplexDataType c= new C05ComplexDataType();//ابجکت ساخت برای اینکه به کلاس دسترسی داشته باشم
        System.out.println(c.k); //مقادیر دیفالت پریمیتیوها صفر هست
        System.out.println(c.s);//مقادیر دیفالت رفرنس ها نال هست

       // System.out.println(s);
       // s= null;  //دیگه خدافظی کن با این ابجکت mark to gc garbage collectorمکانیزم کشتن ابجکت ها
        //مکانیزم جی سی اصلا نمیتونی ببینی مثل اینه که اشغالا رو ببری بیرون ولی مشخص نیست شهرداری ساعت چند بیاد برش داره
      //  System.out.println(s);

    }
}


//کرلی بریس اول بدنه کلاس کرلی بریس دوم بدنه متد
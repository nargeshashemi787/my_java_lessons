package Session3;

public class ArreyDemo4 {
    static void main(String[] args) {
        int[] a= new int[3];
        a[0]=1;
        a[1]=2;
        a[2]=3;
        PrintNumber(a);// در واقع دستور میره سمت پرینتر

        //anonymous arrayبدون نام بدون قلاده// میتونستم اریه رو همین جا تعریف کنم
        PrintNumber(new int[]{1,2,3});
       // PrintNumber();نمیشه که هیچی چاپ نکنه چون همین خط پایین براش ورودی تعریف کردیم
        PrintNumbers2();//میشه بدون ورودی هم چاپش کرد چون تو ران تایم ساخته میشه
        PrintNumbers2(4,5,6);//جاوا خوش پشت صحنه نیو اینت میکنه و به عنوان ورودی میده
        //این اعداد بالایی آرایه نیستن ولی جاوا پشت صحنه برای من ارایه ایجاد کرد



    }

    static void PrintNumber(int[]numbers)
    {
        for (int i=0; i<numbers.length;i++){

            System.out.println(numbers[i] );
        }
    }

    static void PrintNumbers2(int...numbers)
    // اریتی ها یا  variabe arguments--توسط خود جی وی ام تو ران تایم سلخته میشه
    //ینی اریه ای از نامبر ها ---پاس دادن آریه به متد (اریتی ها)---فقط هم در ورودی متد
            //ینی ساخت ارایه رو سپردم به جاوا
    {
        for (int i=0; i<numbers.length;i++){

        System.out.println(numbers[i] );
    }


    }


}

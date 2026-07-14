package session2;

public class C04PrimitiveCasting {

    static void main(String[] args) {
        int i=12;
        long l =122;

        //casting
        l=i;
        System.out.println(l);

       // data lose
       // i=l; // ارور میده--پارچ ریختیم تو لیوان

        i=(int)l;  //میدونم دیتا لوز دارم ولی برو این کارو انجام بده


        //تو بولین کستینگ نداریم
    }
}

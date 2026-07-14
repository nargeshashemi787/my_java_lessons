package Session3;

public class StringDemo1 {

    public static void main(String[] args) {

        String s1="JAVA";
        String s2=new String("java");
        char[]c3={'j','a','v','a'};
        String s4= new String((c3));         //1/استثنای staticدرسته رفرنس هست ولی جنسش ادرس نیست و مقدار چاپ میکنه

        System.out.println(s4);
        System.out.println(c3);


        System.out.println(s1+s2);  //concatدوتا رشته رو بهم میچسبونه

    }
}

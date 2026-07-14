package Session3;

public class StringDemo2 {
    static void main(String[] args) {
        String str1=new String("ali");
        System.out.println(str1);
        String str2="ali reza".substring(0,3);
        System.out.println(str2);



        //برابری مقادیر در پریمیتیو ها ==
        //فرنس ها ()equal.

        if (str1==str2){

            System.out.println("equal with ==");
    }
        if (str1.equals(str2)){
            System.out.println("equal with equal method");
        }
}
}
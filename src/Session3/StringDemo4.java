package Session3;


public class StringDemo4 {
    static void main(String[] args) {


        String str1 = "ali";   //pool
        String str2 = "ali";   //pool
        String str3= new String("ali");  //no pool



        //برابری مقادیر در پریمیتیو ها ==
        //فرنس ها ()equal.

        if (str1 == str2) {

            System.out.println("equal with ==");
        }
        if (str1.equals(str2)) {
            System.out.println("equal with equal method");
        }

        System.out.println("##############");
        if(str1==str3){
            System.out.println("equal with ==");
        }

        if (str1.equals(str3)){
            System.out.println("equal with equal method");
        }
    }
}

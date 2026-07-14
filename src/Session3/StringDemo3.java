package Session3;


    public class StringDemo3 {
        static void main(String[] args) {


            String str1 = "ali";

            String str2 = "ali";


            //برابری مقادیر در پریمیتیو ها ==
            //فرنس ها ()equal.

            if (str1 == str2) {

                System.out.println("equal with ==");
            }
            if (str1.equals(str2)) {
                System.out.println("equal with equal method");
            }
        }
    }

package Session3;



    class Var {
        int ret() {
            var x = 1;
            return x;
        }

        public static void main(String a[]) {
            System.out.println(new Var().ret()); // این عدد 1 را چاپ می‌کند

            // حالا این خط را داخل پرینت می‌گذاریم تا خروجی آن یعنی 1- چاپ شود:
            System.out.println("java is the best".substring(2, 10).indexOf('b'));
        }
    }


//در جاوا وقتی چیزی در رشته پیدا نشود، خروجی -1 است).
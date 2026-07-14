package Session3;

class P02TypeInferenceDemo {
//always in methods
//always assign  a literal value

    int a;
    int b;

    void m() {

        int a;
        int b;
    }

    void avg(){

        var a=12;// int a=12;پشت صحنه خود جاوا تبدیل میکنه
        var b=23.23;//float b=23.23;
        var c=true;//boolean


    }
}
// هیچ ایرادی نداره دو تا اینت ای و بی یکسان داریم چون اسکوپاش باهم فرق میکنه
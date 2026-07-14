package Session3.AccessModifier.p01;

public class Test1 {

    //public
    //protected
    //default
    //private
    public int i ;
    protected int j;
    int k;//دیفالت
    private int l;

    static void main(String[] args) {
        Test1 obj=new Test1();
        obj.l=500;//فقط تو همین کلاس میشه دید

    }
}

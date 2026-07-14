package Session3.AccessModifier.p02;

import Session3.AccessModifier.p01.Test1;

 class B {
    public static void main(String[] args) {
        Test1 obj=new Test1();//اینجا فرقش اینه یه import اون بالا میاد بعدا میگه
        obj.i=10;//یه import اون بالا اومد
       // obj.j;قابل دیدن نیستن
       // obj.k;قابل دیدن نیستن



    }
}

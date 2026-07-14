package Session3;

 class P01ScopeDemo {

    int age; //field of class-instance var- obj var - attribute
    //first; اینجا فرست دیده نمیشه

   // int age;نمیشه دوباره نوشت چون توی یک اسکوپ هست

    static int g; // class var-staticمثل کد ملی یک فرد که همیشه ثابت است  var

    void avg(int first , int second){//method parametr

        int sum;// method var- local var
        age=first+second;//میتونم به متغییر سن دسترسی داشته باشم

        //loop
        for (int i=0;i<10;i++){

        }


    }

    static void main(StringDemo3[] args) {
        P01ScopeDemo obj = new P01ScopeDemo();//برای دسترسی به فیلد و متدها
       // obj.first دسترسی ندارم
    }

}

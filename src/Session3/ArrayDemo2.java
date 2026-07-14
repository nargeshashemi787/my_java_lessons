package Session3;

public class ArrayDemo2 {
    static void main(String[] args) {
       Student s1; //address
        Student[] arr1;
        arr1=new Student[3];
        System.out.println(arr1);//address
        System.out.println(arr1[0]);
        arr1[0]= new Student();//یک شی جدید به وجود امد و ارایه حالا صاحب مقدار شد
        Student student = arr1[0];
        System.out.println(arr1[0]);


    }
}

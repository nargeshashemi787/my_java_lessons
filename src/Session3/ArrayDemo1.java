package Session3;

public class ArrayDemo1 {

    static void main(String[] args) {

        int i;//value
        int[]arr1;
        int n=4;
        arr1=new int[n];
        System.out.println(arr1);
        System.out.println(arr1[0]);
        arr1[0]=10;
        arr1[1]=10;
        arr1[2]=10;
        arr1[3]=10;//اگه ارایه یدونه دیگه اضفه کنم ارور میده چون من چهارتا براش تعریف کرده بودم
        System.out.println(arr1[3]);

        System.out.println("###############");

        int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9};//خودش همون اول مقدار دهی میککنه خونه هارو
        System.out.println(arr3.length); // خروجی: 9
        System.out.println(arr3[4]);    // خروجی: 5 (عنصر پنجم)





    }
}

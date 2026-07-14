package session2;

import java.math.BigDecimal;
import java.math.BigInteger;

public class C06BigNumber
{
    static void main(String[] args) {
//financial price در قسمت های حسابداری بیشتر از اینا استفاده میشه دقت اعضار بالایی دارن ولی دابل و فلوت این شکلی نیستن
        BigDecimal bigDecimal=new BigDecimal("651221526262626.62626666666666666");
        BigInteger bigInteger=new BigInteger("62516262626226262626262626");

       // bigInteger.وقتی بیگ اینتیجر دات میزنی به کلی عملکرد درسترسی پیدا میکنی
        System.out.println(bigInteger);
        System.out.println(bigDecimal);
    }

}

package com.CK;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {
        format f = new format();
        f.m1();
        f.m2();
        f.m3();
        f.m4();
        f.m5();
    }
}

class format {
    double f = 111231.5585, nf = 10.00;
    public void m1() {
        BigDecimal bg = new BigDecimal(f);
        double f1 = bg.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
        System.out.println(f1);
    }
    /**
     * DecimalFormatת������
     */
    public void m2() {
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println(df.format(f));
    }
    /**
     * String.format��ӡ����
     */
    public void m3() {
        System.out.println(String.format("%.2f", f));
    }
    public void m4() {
        NumberFormat nf = NumberFormat.getNumberInstance();
        nf.setMaximumFractionDigits(2);
        System.out.println(nf.format(f));
    }

    public void m5() {
        double  discount = nf * 0.2;
        if (discount % Math.floor(discount) == 0)
            System.out.println((int)discount);
    }

}

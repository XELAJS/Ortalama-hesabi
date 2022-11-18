import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner girdi=new Scanner(System.in);
        System.out.print("Fizik vize notunuzu giriniz:");
        double vizefiz= girdi.nextDouble();
        if (vizefiz<0){
            System.out.println("Bir hata oluştu lütfen girdiğiniz değerleri kontrol ediniz");
            return;
        } else if (vizefiz>100) {
            System.out.println("Bir hata oluştu lütfen girdiğiniz değerleri kontrol ediniz");
            return;
        }

        System.out.print("Fizik final notunuzu giriniz:");
        double Finalfiz=girdi.nextDouble();

        if (Finalfiz<0){
            System.out.println("Bir hata oluştu lütfen girdiğiniz değerleri kontrol ediniz");
        return;
        } else if (Finalfiz>100) {
            System.out.println("Bir hata oluştu lütfen girdiğiniz değerleri kontrol ediniz");
            return;
        }

        double vizeortfiz=vizefiz*0.4;
        double finalortfiz=Finalfiz*0.6;
        double ortfiz=finalortfiz+vizeortfiz;

        double ortFizKR=ortfiz*4;

        double ortfiz2;

         if (ortfiz>100){

            System.out.println("Bir hata oluştu lütfen girdiğiniz değerleri kontrol ediniz");
        return;

        }

        else if (ortfiz>=90){
             ortfiz2=4*4;
           System.out.println("Fizik ortalamanız:"+ortfiz+" \nNotunuz:AA"+"\nGeçtiniz.");
       } else if (ortfiz>=85) {
            ortfiz2=4*3.50;
            System.out.println("Fizik ortalamanız:"+ortfiz+" \nNotunuz:BA"+"\nGeçtiniz.");

       }else if (ortfiz>=80){
            ortfiz2=4*3;
            System.out.println("Fizik ortalamanız:"+ortfiz+" \nNotunuz:BB"+"\nGeçtiniz.");

    } else if (ortfiz>=75) {
           ortfiz2=4*2.50;
            System.out.println("Fizik ortalamanız:"+ortfiz+" \nNotunuz:CB"+"\nGeçtiniz.");
       } else if (ortfiz>=70) {
           ortfiz2=4*2;
            System.out.println("Fizik ortalamanız:"+ortfiz+" \nNotunuz:CC"+"\nGeçtiniz.");
           
       } else if (ortfiz>=65) {
           ortfiz2=4*1.50;
            System.out.println("Fizik ortalamanız:"+ortfiz+" \nNotunuz:DC"+"\nGeçtiniz.");

       } else if (ortfiz>=60) {
          ortfiz2=4*1.00;
           System.out.println("Fizik ortalamanız:"+ortfiz+" \nNotunuz:DD"+"\nGeçtiniz.");

       } else if (ortfiz>=55) {
           ortfiz2=4*0.50;
            System.out.printf("Fizik ortalamanız:"+ortfiz+" \nNotunuz:FD"+"\nGeçtiniz.");

       }else if(ortfiz>=0){
           ortfiz2=4*0;
            System.out.println("Fizik ortalamanız:"+ortfiz+" \nNotunuz:FF"+"\nKaldınız.");
       }else {
            System.out.println("Bir hata oluştu lütfen girdiğiniz değerleri kontrol ediniz.");

            return;
        }
        System.out.print("Mat vize notunuzu giriniz:");
        double vizemat= girdi.nextDouble();

        if (vizemat<0){
            System.out.println("Bir hata oluştu lütfen girdiğiniz değerleri kontrol ediniz");
            return;
        } else if (vizemat>100) {
            System.out.println("Bir hata oluştu lütfen girdiğiniz değerleri kontrol ediniz");
            return;
        }

        System.out.print("Mat final notunuzu giriniz:");
        double Finalmat=girdi.nextDouble();

        if (Finalmat<0) {
            System.out.println("Bir hata oluştu lütfen girdiğiniz değerleri kontrol ediniz");
        return;
        } else if (Finalmat>100) {
            System.out.println("Bir hata oluştu lütfen girdiğiniz değerleri kontrol ediniz");
            return;
        }

        double vizeortmat=vizemat*0.4;
        double finalortmat=Finalmat*0.6;
        double ortmat=finalortmat+vizeortmat;

        double ortMatKr=ortmat*4;

        double ortMat2;
        if (ortmat>100){

            System.out.println("Bir hata oluştu lütfen girdiğiniz değerleri kontrol ediniz");

            return;
        }

        else if (ortmat>=90){
            ortMat2=4*4;
            System.out.println("Matematik ortalamanız:"+ortmat+" \nNotunuz:AA"+"\nGeçtiniz.");
        } else if (ortmat>=85) {
            ortMat2=4*3.50;
            System.out.println("Matematik ortalamanız:"+ortmat+" \nNotunuz:BA"+"\nGeçtiniz.");

        }else if (ortmat>=80){
            ortMat2=4*3;
            System.out.println("Matematik ortalamanız:"+ortmat+" \nNotunuz:BB"+"\nGeçtiniz.");

        } else if (ortmat>=75) {
            ortMat2=4*2.50;
            System.out.println("Matematik ortalamanız:"+ortmat+" \nNotunuz:CB"+"\nGeçtiniz.");
        } else if (ortmat>=70) {
            ortMat2=4*2;
            System.out.println("Matematik ortalamanız:"+ortmat+" \nNotunuz:CC"+"\nGeçtiniz.");

        } else if (ortmat>=65) {
            ortMat2=4*1.50;
            System.out.println("Matematik ortalamanız:"+ortmat+" \nNotunuz:DC"+"\nGeçtiniz.");

        } else if (ortmat>=60) {
            ortMat2=4*1;
            System.out.println("Matematik ortalamanız:"+ortmat+" \nNotunuz:DD"+"\nGeçtiniz.");

        } else if (ortmat>=55) {
            ortMat2=4*0.50;
            System.out.println("Matematik ortalamanız:"+ortmat+" \nNotunuz:FD"+"\nGeçtiniz.");

        }else if(ortmat>=0){
            ortMat2=4*0;
            System.out.println("Matematik ortalamanız:"+ortmat+" \nNotunuz:FF"+"\nKaldınız.");
        }else {
            System.out.println("Bir hata oluştu lütfen girdiğiniz değerleri kontrol ediniz.");

            return;
        }
        System.out.print("Türkçe vize notunuzu giriniz:");
        double vizetur= girdi.nextDouble();

        if (vizetur<0){
            System.out.println("Bir hata oluştu lütfen girdiğiniz değerleri kontrol ediniz");
            return;
        } else if (vizetur>100) {
            System.out.println("Bir hata oluştu lütfen girdiğiniz değerleri kontrol ediniz");
            return;
        }

        System.out.print("Türkçe final notunuzu giriniz:");
        double Finaltur=girdi.nextDouble();

        if (Finaltur<0){
            System.out.println("Bir hata oluştu lütfen girdiğiniz değerleri kontrol ediniz");
        return;
        } else if (Finaltur>100) {
            System.out.println("Bir hata oluştu lütfen girdiğiniz değerleri kontrol ediniz");
            return;
        }

        double vizeorttur=vizetur*0.4;
        double finalorttur=Finaltur*0.6;
        double orttur=finalorttur+vizeorttur;

        double ortTurKr=orttur*2;

        double ortTur2;
        if (orttur>100){

            System.out.println("Bir hata oluştu lütfen girdiğiniz değerleri kontrol ediniz");
        return;
        }


        else if (orttur>=90){
            ortTur2=2*4;
            System.out.println("Türkçe ortalamanız:"+orttur+" \nNotunuz:AA"+"\nGeçtiniz.");
        } else if (orttur>=85) {
            ortTur2=2*3.50;
            System.out.println("Türkçe ortalamanız:"+orttur+" \nNotunuz:BA"+"\nGeçtiniz.");

        }else if (orttur>=80){
            ortTur2=2*3;
            System.out.println("Türkçe ortalamanız:"+orttur+" \nNotunuz:BB"+"\nGeçtiniz.");

        } else if (orttur>=75) {
            ortTur2=2*2.50;
            System.out.println("Türkçe ortalamanız:"+orttur+" \nNotunuz:CB"+"\nGeçtiniz.");

        } else if (orttur>=70) {
            ortTur2=2*2;
            System.out.println("Türkçe ortalamanız:"+orttur+" \nNotunuz:CC"+"\nGeçtiniz.");

        } else if (orttur>=65) {
            ortTur2=2*1.50;
            System.out.println("Türkçe ortalamanız:"+orttur+" \nNotunuz:DC"+"\nGeçtiniz.");

        } else if (orttur>=60) {
            ortTur2=2*1;
            System.out.println("Türkçe ortalamanız:"+orttur+" \nNotunuz:DD"+"\nGeçtiniz.");

        } else if (orttur>=55) {
            ortTur2=2*0.50;
            System.out.printf("Türkçe ortalamanız:"+orttur+" \nNotunuz:FD"+"\nGeçtiniz.");

        }else if(orttur>=0){
            ortTur2=2*0;
            System.out.println("Türkçe ortalamanız:"+orttur+" \nNotunuz:FF"+"\nKaldınız.");
        }else {
            System.out.println("Bir hata oluştu lütfen girdiğiniz değerleri kontrol ediniz.");

            return;
        }
        System.out.print("İngilizce vize notunuzu giriniz:");
        double vizeing= girdi.nextDouble();

        if (vizeing<0){
            System.out.println("Bir hata oluştu lütfen girdiğiniz değerleri kontrol ediniz");
        return;
        } else if (vizeing>100) {
            System.out.println("Bir hata oluştu lütfen girdiğiniz değerleri kontrol ediniz");
            return;
        }

        System.out.print("İngilizce final notunuzu giriniz:");
        double Finaling=girdi.nextDouble();

        if (Finaling<0){
            System.out.println("Bir hata oluştu lütfen girdiğiniz değerleri kontrol ediniz");
        return;
        } else if (Finaling>100) {
            System.out.println("Bir hata oluştu lütfen girdiğiniz değerleri kontrol ediniz");
        return;
        }

        double vizeorting=vizeing*0.4;
        double finalorting=Finaling*0.6;
        double orting=finalorting+vizeorting;

        double ortİngKr=orting*2;

        double ortIng2;

         if (orting>100){

            System.out.println("Bir hata oluştu lütfen girdiğiniz değerleri kontrol ediniz");

            return;
         }



        else if (orting>=90){
            ortIng2=2*4;
            System.out.println("İngilizce ortalamanız:"+orting+" \nNotunuz:AA"+"\nGeçtiniz.");
        } else if (orting>=85) {
            ortIng2=2*3.50;
            System.out.println("İngilizce ortalamanız:"+orting+" \nNotunuz:BA"+"\nGeçtiniz.");

        }else if (orting>=80){
            ortIng2=2*3;
            System.out.println("İngilizce ortalamanız:"+orting+" \nNotunuz:BB"+"\nGeçtiniz.");

        } else if (orting>=75) {
            ortIng2=2*2.50;
            System.out.println("İngilizce ortalamanız:"+orting+" \nNotunuz:CB"+"\nGeçtiniz.");
        } else if (orting>=70) {
            ortIng2=2*2;
            System.out.println("İngilizce ortalamanız:"+orting+" \nNotunuz:CC"+"\nGeçtiniz.");

        } else if (orting>=65) {
            ortIng2=2*1.50;
            System.out.println("İngilizce ortalamanız:"+orting+" \nNotunuz:DC"+"\nGeçtiniz.");

        } else if (orting>=60) {
            ortIng2=2*1;
            System.out.println("İngilizce ortalamanız:"+orting+" \nNotunuz:DD"+"\nGeçtiniz.");

        } else if (orting>=55) {
            ortIng2=2*0.50;
            System.out.printf("İngilizce ortalamanız:"+orting+" \nNotunuz:FD"+"\nGeçtiniz.");

        }else if(orting>=0){
            ortIng2=2*0;
            System.out.println("İngilizce ortalamanız:"+orting+" \nNotunuz:FF"+"\nKaldınız.");
        }else {
             System.out.println("Bir hata oluştu lütfen girdiğiniz değerleri kontrol ediniz.");

             return;
        }

        System.out.print("Algoritma ve Programlama vize notunuzu giriniz:");
        double vizeap= girdi.nextDouble();

        if (vizeap<0){
            System.out.println("Bir hata oluştu lütfen girdiğiniz değerleri kontrol ediniz");
            return;
        } else if (vizeap>100) {
            System.out.println("Bir hata oluştu lütfen girdiğiniz değerleri kontrol ediniz");
            return;
        }

        System.out.print("Algoritma ve Programlama final notunuzu giriniz:");
        double Finalap=girdi.nextDouble();

        if (Finalap<0){
            System.out.println("Bir hata oluştu lütfen girdiğiniz değerleri kontrol ediniz");
        return;
        } else if (Finalap>100) {
            System.out.println("Bir hata oluştu lütfen girdiğiniz değerleri kontrol ediniz");
            return;
        }

        double vizeortap=vizeap*0.4;
        double finalortap=Finalap*0.6;
        double ortap=finalortap+vizeortap;

        double ortApKr=ortap*3;

        double ortAp2;

        if (ortap>100){

            System.out.println("Bir hata oluştu lütfen girdiğiniz değerleri kontrol ediniz");

            return;
        }



        else if (ortap>=90){
            ortAp2=3*4;
            System.out.println("Algoritma ve Programlama ortalamanız:"+ortap+" \nNotunuz:AA"+"\nGeçtiniz.");
        } else if (ortap>=85) {
            ortAp2=3*3.50;
            System.out.println("Algoritma ve Programlama ortalamanız:"+ortap+" \nNotunuz:BA"+"\nGeçtiniz.");

        }else if (ortap>=80){
            ortAp2=3*3;
            System.out.println("Algoritma ve Programlama ortalamanız:"+ortap+" \nNotunuz:BB"+"\nGeçtiniz.");

        } else if (ortap>=75) {
            ortAp2=3*2.50;
            System.out.println("Algoritma ve Programlama ortalamanız:"+ortap+" \nNotunuz:CB"+"\nGeçtiniz.");
        } else if (ortap>=70) {
            ortAp2=3*2;
            System.out.println("Algoritma ve Programlama ortalamanız:"+ortap+" \nNotunuz:CC"+"\nGeçtiniz.");

        } else if (ortap>=65) {
            ortAp2=3*1.50;
            System.out.println("Algoritma ve Programlama ortalamanız:"+ortap+" \nNotunuz:DC"+"\nGeçtiniz.");

        } else if (ortap>=60) {
            ortAp2=3*1;
            System.out.println("Algoritma ve Programlama ortalamanız:"+ortap+" \nNotunuz:DD"+"\nGeçtiniz.");

        } else if (ortap>=55) {
            ortAp2=3*0.50;
            System.out.printf("Algoritma ve Programlama ortalamanız:"+ortap+" \nNotunuz:FD"+"\nGeçtiniz.");

        }else if(ortap>=0){
            ortAp2=3*0;
            System.out.println("Algoritma ve Programlama ortalamanız:"+ortap+" \nNotunuz:FF"+"\nKaldınız.");
        }else {
            System.out.println("Bir hata oluştu lütfen girdiğiniz değerleri kontrol ediniz.");

            return;
        }

        System.out.print("Bilgisayar bilimlerine giriş vize notunuzu giriniz:");
        double vizebg= girdi.nextDouble();

        if (vizebg<0){
            System.out.println("Bir hata oluştu lütfen girdiğiniz değerleri kontrol ediniz");
            return;
        } else if (vizebg>100) {
            System.out.println("Bir hata oluştu lütfen girdiğiniz değerleri kontrol ediniz");
            return;
        }

        System.out.print("Bilgisayar bilimlerine giriş  final notunuzu giriniz:");
        double Finalbg=girdi.nextDouble();

        if (Finalbg<0){
            System.out.println("Bir hata oluştu lütfen girdiğiniz değerleri kontrol ediniz");
            return;
        } else if (Finalbg>100) {
            System.out.println("Bir hata oluştu lütfen girdiğiniz değerleri kontrol ediniz");
            return;
        }

        double vizeortbg=vizebg*0.4;
        double finalortbg=Finalbg*0.6;
        double ortbg=finalortbg+vizeortbg;

        double ortBgKr=ortbg*3;

        double ortBg2;
        if (ortbg>100){

            System.out.println("Bir hata oluştu lütfen girdiğiniz değerleri kontrol ediniz");

            return;
        }

        else if (ortbg>=90){
            ortBg2=3*4;
            System.out.println("Bilgisayar bilimlerine giriş  ortalamanız:"+ortbg+" \nNotunuz:AA"+"\nGeçtiniz.");
        }else if (ortbg>=85) {
            ortBg2=3*3.50;
            System.out.println("Bilgisayar bilimlerine giriş  ortalamanız:"+ortbg+" \nNotunuz:BA"+"\nGeçtiniz.");

        }else if (ortbg>=80){
            ortBg2=3*3;
            System.out.println("Bilgisayar bilimlerine giriş  ortalamanız:"+ortbg+" \nNotunuz:BB"+"\nGeçtiniz.");

        } else if (ortbg>=75) {
            ortBg2=3*2.50;
            System.out.println("Bilgisayar bilimlerine giriş  ortalamanız:"+ortbg+" \nNotunuz:CB"+"\nGeçtiniz.");
        } else if (ortbg>=70) {
            ortBg2=3*2;
            System.out.println("Bilgisayar bilimlerine giriş  ortalamanız:"+ortbg+" \nNotunuz:CC"+"\nGeçtiniz.");

        } else if (ortbg>=65) {
            ortBg2=3*1.50;
            System.out.println("Bilgisayar bilimlerine giriş  ortalamanız:"+ortbg+" \nNotunuz:DC"+"\nGeçtiniz.");

        } else if (ortbg>=60) {
            ortBg2=3*1;
            System.out.println("Bilgisayar bilimlerine giriş  ortalamanız:"+ortbg+" \nNotunuz:DD"+"\nGeçtiniz.");

        } else if (ortbg>=55) {
            ortBg2=3*0.50;
            System.out.printf("Bilgisayar bilimlerine giriş  ortalamanız:"+ortbg+" \nNotunuz:FD"+"\nGeçtiniz.");

        }else if(ortbg>=0){
            ortBg2=3*0;
            System.out.println("Bilgisayar bilimlerine giriş  ortalamanız:"+ortbg+" \nNotunuz:FF"+"\nKaldınız.");
        }else {
            System.out.println("Bir hata oluştu lütfen girdiğiniz değerleri kontrol ediniz.");

            return;
        }

        System.out.print("Algoritma ve programlama labaratuar vize notunuzu giriniz:");
        double vizeapl= girdi.nextDouble();

       if (vizeapl<0){
           System.out.println("Bir hata oluştu lütfen girdiğiniz değerleri kontrol ediniz");
           return;
       } else if (vizeapl>100) {
           System.out.println("Bir hata oluştu lütfen girdiğiniz değerleri kontrol ediniz");
           return;
       }

        System.out.print("Algoritma ve programlama labaratuar final notunuzu giriniz:");
        double Finalapl=girdi.nextDouble();

        if (Finalapl<0){
            System.out.println("Bir hata oluştu lütfen girdiğiniz değerleri kontrol ediniz");
        return;
        } else if (Finalapl>100) {
            System.out.println("Bir hata oluştu lütfen girdiğiniz değerleri kontrol ediniz");
            return;
        }

        double vizeortapl=vizeapl*0.4;
        double finalortapl=Finalapl*0.6;
        double ortapl=finalortapl+vizeortapl;

        double ortAplKr=ortapl*1;

        double ortApl2;
        if (ortapl>100){

            System.out.println("Bir hata oluştu lütfen girdiğiniz değerleri kontrol ediniz");
        return;
        }

        else if (ortapl>=90){
            ortApl2=3*4;
            System.out.println("Algoritma ve programlama labaratuar ortalamanız:"+ortapl+" \nNotunuz:AA"+"\nGeçtiniz.");
        } else if (ortapl>=85) {
            ortApl2=3*3.50;
            System.out.println("Algoritma ve programlama labaratuar ortalamanız:"+ortapl+" \nNotunuz:BA"+"\nGeçtiniz.");

        }else if (ortapl>=80){
            ortApl2=3*3;
            System.out.println("Algoritma ve programlama labaratuar ortalamanız:"+ortapl+" \nNotunuz:BB"+"\nGeçtiniz.");

        } else if (ortapl>=75) {
            ortApl2=3*2.50;
            System.out.println("Algoritma ve programlama labaratuar ortalamanız:"+ortapl+" \nNotunuz:CB"+"\nGeçtiniz.");
        } else if (ortapl>=70) {
            ortApl2=3*2;
            System.out.println("Algoritma ve programlama labaratuar ortalamanız:"+ortapl+" \nNotunuz:CC"+"\nGeçtiniz.");

        } else if (ortapl>=65) {
            ortApl2=3*1.50;
            System.out.println("Algoritma ve programlama labaratuar ortalamanız:"+ortapl+" \nNotunuz:DC"+"\nGeçtiniz.");

        } else if (ortapl>=60) {
            ortApl2=3*1;
            System.out.println("Algoritma ve programlama labaratuar ortalamanız:"+ortapl+" \nNotunuz:DD"+"\nGeçtiniz.");

        } else if (ortapl>=55) {
            ortApl2=3*0.50;
            System.out.printf("Algoritma ve programlama labaratuar  ortalamanız:"+ortapl+" \nNotunuz:FD"+"\nGeçtiniz.");

        }else if(ortapl>=0){
            ortApl2=3*0;
            System.out.println("Algoritma ve programlama labaratuar  ortalamanız:"+ortapl+" \nNotunuz:FF"+"\nKaldınız.");
        }else {System.out.println("Bir hata oluştu lütfen girdiğiniz değerleri kontrol ediniz.");

            return;
        }

        System.out.print("Fizik labaratuar vize notunuzu giriniz:");
        double vizefl= girdi.nextDouble();

        if (vizefl<0){
            System.out.println("Bir hata oluştu lütfen girdiğiniz değerleri kontrol ediniz");
            return;
        } else if (vizefl>100) {
            System.out.println("Bir hata oluştu lütfen girdiğiniz değerleri kontrol ediniz");
            return;
        }

        System.out.print("Fizik labaratuar final notunuzu giriniz:");
        double Finalfl=girdi.nextDouble();

        if (Finalfl<0){
            System.out.println("Bir hata oluştu lütfen girdiğiniz değerleri kontrol ediniz");
            return;
        } else if (Finalfl>100) {
            System.out.println("Bir hata oluştu lütfen girdiğiniz değerleri kontrol ediniz");
            return;
        }

        double vizeortfl=vizefl*0.4;
        double finalortfl=Finalfl*0.6;
        double ortfl=finalortfl+vizeortfl;

        double ortFlKr=ortfl*1;

        double ortFl2;
        if (ortfl>100){

            System.out.println("Bir hata oluştu lütfen girdiğiniz değerleri kontrol ediniz");

            return;

        }

        else if (ortfl>=90){
            ortFl2=1*4;
            System.out.println("Fizik labaratuar  ortalamanız:"+ortfl+" \nNotunuz:AA"+"\nGeçtiniz.");
        } else if (ortfl>=85) {
            ortFl2=1*3.50;
            System.out.println("Fizik labaratuar  ortalamanız:"+ortfl+" \nNotunuz:BA"+"\nGeçtiniz.");

        }else if (ortfl>=80){
            ortFl2=1*3;
            System.out.println("Fizik labaratuar ortalamanız:"+ortfl+" \nNotunuz:BB"+"\nGeçtiniz.");

        } else if (ortfl>=75) {
            ortFl2=1*2.50;
            System.out.println("Fizik labaratuar  ortalamanız:"+ortfl+" \nNotunuz:CB"+"\nGeçtiniz.");
        } else if (ortfl>=70) {
            ortFl2=1*2;
            System.out.println("Fizik labaratuar ortalamanız:"+ortfl+" \nNotunuz:CC"+"\nGeçtiniz.");

        } else if (ortfl>=65) {
            ortFl2=1*1.50;
            System.out.println("Fizik labaratuar  ortalamanız:"+ortfl+" \nNotunuz:DC"+"\nGeçtiniz.");

        } else if (ortfl>=60) {
            ortFl2=1*1;
            System.out.println("Fizik labaratuar  ortalamanız:"+ortfl+" \nNotunuz:DD"+"\nGeçtiniz.");

        } else if (ortfl>=55) {
            ortFl2=1*0.50;
            System.out.println("Fizik labaratuar  ortalamanız:"+ortfl+" \nNotunuz:FD"+"\nGeçtiniz.");

        }else if(ortfl>=0){
            ortFl2=1*0;
            System.out.println("Fizik labaratuar  ortalamanız:"+ortfl+" \nNotunuz:FF"+"\nKaldınız.");
        }else {
            System.out.println("Bir hata oluştu lütfen girdiğiniz değerleri kontrol ediniz.");

            return;
        }
        System.out.print("Yazılım mühendisliği oryantasyonu vize notunuzu giriniz:");
        double vizeyo= girdi.nextDouble();

        if (vizeyo<0){
            System.out.println("Bir hata oluştu lütfen girdiğiniz değerleri kontrol ediniz");
            return;
        } else if (vizeyo>100) {
            System.out.println("Bir hata oluştu lütfen girdiğiniz değerleri kontrol ediniz");
            return;
        }

        System.out.print("Yazılım mühendisliği oryantasyonu final notunuzu giriniz:");
        double Finalyo=girdi.nextDouble();

        if (Finalyo<0){
            System.out.println("Bir hata oluştu lütfen girdiğiniz değerleri kontrol ediniz");
            return;
        } else if (Finalyo>100) {
            System.out.println("Bir hata oluştu lütfen girdiğiniz değerleri kontrol ediniz");
            return;
        }

        double vizeortyo=vizeyo*0.4;
        double finalortyo=Finalyo*0.6;
        double ortyo=finalortyo+vizeortyo;

        double ortYoKr=ortyo*1;

        double ortYo2;
        if (ortyo>100){

            System.out.println("Bir hata oluştu lütfen girdiğiniz değerleri kontrol ediniz");

            return;

        }

        else if (ortyo>=90){
            ortYo2=1*4;
            System.out.println("Yazılım mühendisliği oryantasyonu  ortalamanız:"+ortyo+" \nNotunuz:AA"+"\nGeçtiniz.");
        } else if (ortyo>=85) {
            ortYo2=1*3.50;
            System.out.println("Yazılım mühendisliği oryantasyonu  ortalamanız:"+ortyo+" \nNotunuz:BA"+"\nGeçtiniz.");

        }else if (ortyo>=80){
            ortYo2=1*3;
            System.out.println("Yazılım mühendisliği oryantasyonu ortalamanız:"+ortyo+" \nNotunuz:BB"+"\nGeçtiniz.");

        } else if (ortyo>=75) {
            ortYo2=1*2.50;
            System.out.println("Yazılım mühendisliği oryantasyonu  ortalamanız:"+ortyo+" \nNotunuz:CB"+"\nGeçtiniz.");
        } else if (ortyo>=70) {
            ortYo2=1*2;
            System.out.println("Yazılım mühendisliği oryantasyonu ortalamanız:"+ortyo+" \nNotunuz:CC"+"\nGeçtiniz.");

        } else if (ortyo>=65) {
            ortYo2=1*1.50;
            System.out.println("Yazılım mühendisliği oryantasyonu  ortalamanız:"+ortyo+" \nNotunuz:DC"+"\nGeçtiniz.");

        } else if (ortyo>=60) {
            ortYo2=1*1;
            System.out.println("Yazılım mühendisliği oryantasyonu  ortalamanız:"+ortyo+" \nNotunuz:DD"+"\nGeçtiniz.");

        } else if (ortyo>=55) {
            ortYo2=1*0.50;
            System.out.printf("Yazılım mühendisliği oryantasyonu  ortalamanız:"+ortyo+" \nNotunuz:FD"+"\nGeçtiniz.");

        }else if(ortyo>=0){
            ortYo2=1*0;
            System.out.println("Yazılım mühendisliği oryantasyonu  ortalamanız:"+ortyo+" \nNotunuz:FF"+"\nKaldınız.");
        }else {
            System.out.println("Bir hata oluştu lütfen girdiğiniz değerleri kontrol ediniz.");

            return;
        }



        double genelort=(ortFlKr+ortAplKr+ortBgKr+ortFizKR+ortİngKr+ortApKr+ortMatKr+ortTurKr+ortYoKr)/21;
        double genelort2=(ortAp2+ortBg2+ortApl2+ortfiz2+ortFl2+ortIng2+ortTur2+ortYo2)/21;

        if (genelort>100){

            System.out.println("Bir hata oluştu lütfen girdiğiniz değerleri kontrol ediniz");

            return;
        }

        else if (genelort>=90){
            System.out.println("Genel ortalamanız:"+genelort+" \nNotunuz:AA"+"\nGeçtiniz.Harf ortalamanız:"+genelort2);
        } else if (genelort>=85) {
            System.out.println("Genel ortalamanız:"+genelort+" \nNotunuz:BA"+"\nGeçtiniz.Harf ortalamanız:"+genelort2);

        }else if (genelort>=80){
            System.out.println("Genel ortalamanız:"+genelort+" \nNotunuz:BB"+"\nGeçtiniz.Harf ortalamanız:"+genelort2);

        } else if (genelort>=75) {
            System.out.println("Genel ortalamanız:"+genelort+" \nNotunuz:CB"+"\nGeçtiniz.Harf ortalamanız:"+genelort2);
        } else if (genelort>=70) {

            System.out.println("Genel ortalamanız:"+genelort+" \nNotunuz:CC"+"\nGeçtiniz.Harf ortalamanız:"+genelort2);

        } else if (genelort>=65) {

            System.out.println("Genel ortalamanız:"+genelort+" \nNotunuz:DC"+"\nGeçtiniz.Harf ortalamanız:"+genelort2);

        } else if (genelort>=60) {

            System.out.println("Genel ortalamanız:"+genelort+" \nNotunuz:DD"+"\nGeçtiniz.Harf ortalamanız:"+genelort2);

        } else if (genelort>=55) {

            System.out.printf("Genel ortalamanız:"+genelort+" \nNotunuz:FD"+"\nGeçtiniz.Harf ortalamanız:"+genelort2);

        }else if(genelort>=0){
            System.out.println("Genel ortalamanız:"+genelort+" \nNotunuz:FF"+"\nKaldınız.Harf ortalamanız:"+genelort2);
        }
        else System.out.println("Bir hata oluştu lütfen girdiğiniz değerleri kontrol ediniz.");
        return;

    }

}
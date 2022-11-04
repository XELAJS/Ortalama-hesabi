
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner girdi=new Scanner(System.in);
        System.out.print("Fizik vize notunuzu giriniz:");
        double vizefiz= girdi.nextDouble();
        System.out.print("Fizik final notunuzu giriniz:");
        double Finalfiz=girdi.nextDouble();
        double vizeortfiz=vizefiz*0.4;
        double finalortfiz=Finalfiz*0.6;
        double ortfiz=finalortfiz+vizeortfiz;

        if (ortfiz>100){

            System.out.println("Bir hata oluştu lütfen girdiğiniz değerleri kontrol ediniz");
        return;

        }

        else if (ortfiz>=90){
           System.out.println("Fizik ortalamanız:"+ortfiz+" \nNotunuz:AA"+"\nGeçtiniz.");
       } else if (ortfiz>=85) {
           System.out.println("Fizik ortalamanız:"+ortfiz+" \nNotunuz:BA"+"\nGeçtiniz.");

       }else if (ortfiz>=80){
           System.out.println("Fizik ortalamanız:"+ortfiz+" \nNotunuz:BB"+"\nGeçtiniz.");

    } else if (ortfiz>=75) {
           System.out.println("Fizik ortalamanız:"+ortfiz+" \nNotunuz:CB"+"\nGeçtiniz.");
       } else if (ortfiz>=70) {
           System.out.println("Fizik ortalamanız:"+ortfiz+" \nNotunuz:CC"+"\nGeçtiniz.");
           
       } else if (ortfiz>=65) {
           System.out.println("Fizik ortalamanız:"+ortfiz+" \nNotunuz:DC"+"\nGeçtiniz.");

       } else if (ortfiz>=60) {
           System.out.println("Fizik ortalamanız:"+ortfiz+" \nNotunuz:DD"+"\nGeçtiniz.");

       } else if (ortfiz>=55) {
           System.out.printf("Fizik ortalamanız:"+ortfiz+" \nNotunuz:FD"+"\nGeçtiniz.");

       }else if(ortfiz>=0){
           System.out.println("Fizik ortalamanız:"+ortfiz+" \nNotunuz:FF"+"\nKaldınız.");
       }else {
            System.out.println("Bir hata oluştu lütfen girdiğiniz değerleri kontrol ediniz.");

            return;
        }
        System.out.print("Mat vize notunuzu giriniz:");
        double vizemat= girdi.nextDouble();
        System.out.print("Mat final notunuzu giriniz:");
        double Finalmat=girdi.nextDouble();
        double vizeortmat=vizemat*0.4;
        double finalortmat=Finalmat*0.6;
        double ortmat=finalortmat+vizeortmat;

        if (ortmat>100){

            System.out.println("Bir hata oluştu lütfen girdiğiniz değerleri kontrol ediniz");

            return;
        }

        else if (ortmat>=90){
            System.out.println("Matematik ortalamanız:"+ortmat+" \nNotunuz:AA"+"\nGeçtiniz.");
        } else if (ortmat>=85) {
            System.out.println("Matematik ortalamanız:"+ortmat+" \nNotunuz:BA"+"\nGeçtiniz.");

        }else if (ortmat>=80){
            System.out.println("Matematik ortalamanız:"+ortmat+" \nNotunuz:BB"+"\nGeçtiniz.");

        } else if (ortmat>=75) {
            System.out.println("Matematik ortalamanız:"+ortmat+" \nNotunuz:CB"+"\nGeçtiniz.");
        } else if (ortmat>=70) {
            System.out.println("Matematik ortalamanız:"+ortmat+" \nNotunuz:CC"+"\nGeçtiniz.");

        } else if (ortmat>=65) {
            System.out.println("Matematik ortalamanız:"+ortmat+" \nNotunuz:DC"+"\nGeçtiniz.");

        } else if (ortmat>=60) {
            System.out.println("Matematik ortalamanız:"+ortmat+" \nNotunuz:DD"+"\nGeçtiniz.");

        } else if (ortmat>=55) {
            System.out.printf("Matematik ortalamanız:"+ortmat+" \nNotunuz:FD"+"\nGeçtiniz.");

        }else if(ortmat>=0){
            System.out.println("Matematik ortalamanız:"+ortmat+" \nNotunuz:FF"+"\nKaldınız.");
        }else {
            System.out.println("Bir hata oluştu lütfen girdiğiniz değerleri kontrol ediniz.");

            return;
        }
        System.out.print("Türkçe vize notunuzu giriniz:");
        double vizetur= girdi.nextDouble();
        System.out.print("Türkçe final notunuzu giriniz:");
        double Finaltur=girdi.nextDouble();
        double vizeorttur=vizetur*0.4;
        double finalorttur=Finaltur*0.6;
        double orttur=finalorttur+vizeorttur;

        if (orttur>100){

            System.out.println("Bir hata oluştu lütfen girdiğiniz değerleri kontrol ediniz");
        return;
        }


        else if (orttur>=90){
            System.out.println("Türkçe ortalamanız:"+orttur+" \nNotunuz:AA"+"\nGeçtiniz.");
        } else if (orttur>=85) {
            System.out.println("Türkçe ortalamanız:"+orttur+" \nNotunuz:BA"+"\nGeçtiniz.");

        }else if (orttur>=80){
            System.out.println("Türkçe ortalamanız:"+orttur+" \nNotunuz:BB"+"\nGeçtiniz.");

        } else if (orttur>=75) {
            System.out.println("Türkçe ortalamanız:"+orttur+" \nNotunuz:CB"+"\nGeçtiniz.");
        } else if (orttur>=70) {
            System.out.println("Türkçe ortalamanız:"+orttur+" \nNotunuz:CC"+"\nGeçtiniz.");

        } else if (orttur>=65) {
            System.out.println("Türkçe ortalamanız:"+orttur+" \nNotunuz:DC"+"\nGeçtiniz.");

        } else if (orttur>=60) {
            System.out.println("Türkçe ortalamanız:"+orttur+" \nNotunuz:DD"+"\nGeçtiniz.");

        } else if (orttur>=55) {
            System.out.printf("Türkçe ortalamanız:"+orttur+" \nNotunuz:FD"+"\nGeçtiniz.");

        }else if(orttur>=0){
            System.out.println("Türkçe ortalamanız:"+orttur+" \nNotunuz:FF"+"\nKaldınız.");
        }else {
            System.out.println("Bir hata oluştu lütfen girdiğiniz değerleri kontrol ediniz.");

            return;
        }
        System.out.print("İngilizce vize notunuzu giriniz:");
        double vizeing= girdi.nextDouble();
        System.out.print("İngilizce final notunuzu giriniz:");
        double Finaling=girdi.nextDouble();
        double vizeorting=vizeing*0.4;
        double finalorting=Finaling*0.6;
        double orting=finalorting+vizeorting;

         if (orting>100){

            System.out.println("Bir hata oluştu lütfen girdiğiniz değerleri kontrol ediniz");

            return;
         }



        else if (orting>=90){
            System.out.println("İngilizce ortalamanız:"+orting+" \nNotunuz:AA"+"\nGeçtiniz.");
        } else if (orting>=85) {
            System.out.println("İngilizce ortalamanız:"+orting+" \nNotunuz:BA"+"\nGeçtiniz.");

        }else if (orting>=80){
            System.out.println("İngilizce ortalamanız:"+orting+" \nNotunuz:BB"+"\nGeçtiniz.");

        } else if (orting>=75) {
            System.out.println("İngilizce ortalamanız:"+orting+" \nNotunuz:CB"+"\nGeçtiniz.");
        } else if (orting>=70) {
            System.out.println("İngilizce ortalamanız:"+orting+" \nNotunuz:CC"+"\nGeçtiniz.");

        } else if (orting>=65) {
            System.out.println("İngilizce ortalamanız:"+orting+" \nNotunuz:DC"+"\nGeçtiniz.");

        } else if (orting>=60) {
            System.out.println("İngilizce ortalamanız:"+orting+" \nNotunuz:DD"+"\nGeçtiniz.");

        } else if (orting>=55) {
            System.out.printf("İngilizce ortalamanız:"+orting+" \nNotunuz:FD"+"\nGeçtiniz.");

        }else if(orting>=0){
            System.out.println("İngilizce ortalamanız:"+orting+" \nNotunuz:FF"+"\nKaldınız.");
        }else {
             System.out.println("Bir hata oluştu lütfen girdiğiniz değerleri kontrol ediniz.");

             return;
        }

        System.out.print("Algoritma ve Programlama vize notunuzu giriniz:");
        double vizeap= girdi.nextDouble();
        System.out.print("Algoritma ve Programlama final notunuzu giriniz:");
        double Finalap=girdi.nextDouble();
        double vizeortap=vizeap*0.4;
        double finalortap=Finalap*0.6;
        double ortap=finalortap+vizeortap;

        if (ortap>100){

            System.out.println("Bir hata oluştu lütfen girdiğiniz değerleri kontrol ediniz");

            return;
        }



        else if (ortap>=90){
            System.out.println("Algoritma ve Programlama ortalamanız:"+ortap+" \nNotunuz:AA"+"\nGeçtiniz.");
        } else if (ortap>=85) {
            System.out.println("Algoritma ve Programlama ortalamanız:"+ortap+" \nNotunuz:BA"+"\nGeçtiniz.");

        }else if (ortap>=80){
            System.out.println("Algoritma ve Programlama ortalamanız:"+ortap+" \nNotunuz:BB"+"\nGeçtiniz.");

        } else if (ortap>=75) {
            System.out.println("Algoritma ve Programlama ortalamanız:"+ortap+" \nNotunuz:CB"+"\nGeçtiniz.");
        } else if (ortap>=70) {
            System.out.println("Algoritma ve Programlama ortalamanız:"+ortap+" \nNotunuz:CC"+"\nGeçtiniz.");

        } else if (ortap>=65) {
            System.out.println("Algoritma ve Programlama ortalamanız:"+ortap+" \nNotunuz:DC"+"\nGeçtiniz.");

        } else if (ortap>=60) {
            System.out.println("Algoritma ve Programlama ortalamanız:"+ortap+" \nNotunuz:DD"+"\nGeçtiniz.");

        } else if (ortap>=55) {
            System.out.printf("Algoritma ve Programlama ortalamanız:"+ortap+" \nNotunuz:FD"+"\nGeçtiniz.");

        }else if(ortap>=0){
            System.out.println("Algoritma ve Programlama ortalamanız:"+ortap+" \nNotunuz:FF"+"\nKaldınız.");
        }else {
            System.out.println("Bir hata oluştu lütfen girdiğiniz değerleri kontrol ediniz.");

            return;
        }

        System.out.print("Bilgisayar bilimlerine giriş vize notunuzu giriniz:");
        double vizebg= girdi.nextDouble();
        System.out.print("Bilgisayar bilimlerine giriş  final notunuzu giriniz:");
        double Finalbg=girdi.nextDouble();
        double vizeortbg=vizebg*0.4;
        double finalortbg=Finalbg*0.6;
        double ortbg=finalortbg+vizeortbg;

        if (ortbg>100){

            System.out.println("Bir hata oluştu lütfen girdiğiniz değerleri kontrol ediniz");

            return;
        }

        else if (ortbg>=90){
            System.out.println("Bilgisayar bilimlerine giriş  ortalamanız:"+ortbg+" \nNotunuz:AA"+"\nGeçtiniz.");
        }else if (ortbg>=85) {
            System.out.println("Bilgisayar bilimlerine giriş  ortalamanız:"+ortbg+" \nNotunuz:BA"+"\nGeçtiniz.");

        }else if (ortbg>=80){
            System.out.println("Bilgisayar bilimlerine giriş  ortalamanız:"+ortbg+" \nNotunuz:BB"+"\nGeçtiniz.");

        } else if (ortbg>=75) {
            System.out.println("ABilgisayar bilimlerine giriş  ortalamanız:"+ortbg+" \nNotunuz:CB"+"\nGeçtiniz.");
        } else if (ortbg>=70) {
            System.out.println("Bilgisayar bilimlerine giriş  ortalamanız:"+ortbg+" \nNotunuz:CC"+"\nGeçtiniz.");

        } else if (ortbg>=65) {
            System.out.println("Bilgisayar bilimlerine giriş  ortalamanız:"+ortbg+" \nNotunuz:DC"+"\nGeçtiniz.");

        } else if (ortbg>=60) {
            System.out.println("Bilgisayar bilimlerine giriş  ortalamanız:"+ortbg+" \nNotunuz:DD"+"\nGeçtiniz.");

        } else if (ortbg>=55) {
            System.out.printf("Bilgisayar bilimlerine giriş  ortalamanız:"+ortbg+" \nNotunuz:FD"+"\nGeçtiniz.");

        }else if(ortbg>=0){
            System.out.println("Bilgisayar bilimlerine giriş  ortalamanız:"+ortbg+" \nNotunuz:FF"+"\nKaldınız.");
        }else {
            System.out.println("Bir hata oluştu lütfen girdiğiniz değerleri kontrol ediniz.");

            return;
        }
        System.out.print("Algoritma ve programlama labaratuar labaratuar vize notunuzu giriniz:");
        double vizeapl= girdi.nextDouble();
        System.out.print("Algoritma ve programlama labaratuar labaratuar final notunuzu giriniz:");
        double Finalapl=girdi.nextDouble();
        double vizeortapl=vizeapl*0.4;
        double finalortapl=Finalapl*0.6;
        double ortapl=finalortapl+vizeortapl;

        if (ortapl>100){

            System.out.println("Bir hata oluştu lütfen girdiğiniz değerleri kontrol ediniz");
        return;
        }

        else if (ortapl>=90){
            System.out.println("Algoritma ve programlama labaratuar  ortalamanız:"+ortapl+" \nNotunuz:AA"+"\nGeçtiniz.");
        } else if (ortapl>=85) {
            System.out.println("Algoritma ve programlama labaratuar labaratuar  ortalamanız:"+ortapl+" \nNotunuz:BA"+"\nGeçtiniz.");

        }else if (ortapl>=80){
            System.out.println("Algoritma ve programlama labaratuarlabaratuar ortalamanız:"+ortapl+" \nNotunuz:BB"+"\nGeçtiniz.");

        } else if (ortapl>=75) {
            System.out.println("Algoritma ve programlama labaratuar labaratuar  ortalamanız:"+ortapl+" \nNotunuz:CB"+"\nGeçtiniz.");
        } else if (ortapl>=70) {
            System.out.println("Algoritma ve programlama labaratuar labaratuar ortalamanız:"+ortapl+" \nNotunuz:CC"+"\nGeçtiniz.");

        } else if (ortapl>=65) {
            System.out.println("Algoritma ve programlama labaratuar labaratuar  ortalamanız:"+ortapl+" \nNotunuz:DC"+"\nGeçtiniz.");

        } else if (ortapl>=60) {
            System.out.println("Algoritma ve programlama labaratuar labaratuar  ortalamanız:"+ortapl+" \nNotunuz:DD"+"\nGeçtiniz.");

        } else if (ortapl>=55) {
            System.out.printf("Algoritma ve programlama labaratuar labaratuar  ortalamanız:"+ortapl+" \nNotunuz:FD"+"\nGeçtiniz.");

        }else if(ortapl>=0){
            System.out.println("Algoritma ve programlama labaratuar labaratuar  ortalamanız:"+ortapl+" \nNotunuz:FF"+"\nKaldınız.");
        }else {System.out.println("Bir hata oluştu lütfen girdiğiniz değerleri kontrol ediniz.");

            return;
        }

        System.out.print("Fizik labaratuar vize notunuzu giriniz:");
        double vizefl= girdi.nextDouble();
        System.out.print("Fizik labaratuar final notunuzu giriniz:");
        double Finalfl=girdi.nextDouble();
        double vizeortfl=vizefl*0.4;
        double finalortfl=Finalfl*0.6;
        double ortfl=finalortfl+vizeortfl;

        if (ortfl>100){

            System.out.println("Bir hata oluştu lütfen girdiğiniz değerleri kontrol ediniz");

            return;

        }

        else if (ortfl>=90){
            System.out.println("Fizik labaratuar  ortalamanız:"+ortfl+" \nNotunuz:AA"+"\nGeçtiniz.");
        } else if (ortfl>=85) {
            System.out.println("Fizik labaratuar  ortalamanız:"+ortfl+" \nNotunuz:BA"+"\nGeçtiniz.");

        }else if (ortfl>=80){
            System.out.println("Fizik labaratuar ortalamanız:"+ortfl+" \nNotunuz:BB"+"\nGeçtiniz.");

        } else if (ortfl>=75) {
            System.out.println("Fizik labaratuar  ortalamanız:"+ortfl+" \nNotunuz:CB"+"\nGeçtiniz.");
        } else if (ortfl>=70) {
            System.out.println("Fizik labaratuar ortalamanız:"+ortfl+" \nNotunuz:CC"+"\nGeçtiniz.");

        } else if (ortfl>=65) {
            System.out.println("Fizik labaratuar  ortalamanız:"+ortfl+" \nNotunuz:DC"+"\nGeçtiniz.");

        } else if (ortfl>=60) {
            System.out.println("Fizik labaratuar  ortalamanız:"+ortfl+" \nNotunuz:DD"+"\nGeçtiniz.");

        } else if (ortfl>=55) {
            System.out.printf("Fizik labaratuar  ortalamanız:"+ortfl+" \nNotunuz:FD"+"\nGeçtiniz.");

        }else if(ortfl>=0){
            System.out.println("Fizik labaratuar  ortalamanız:"+ortfl+" \nNotunuz:FF"+"\nKaldınız.");
        }else {
            System.out.println("Bir hata oluştu lütfen girdiğiniz değerleri kontrol ediniz.");

            return;
        }double genelort=(ortfl+ortapl+ortbg+ortfiz+orting+ortap+ortmat+orttur)/8;

        if (genelort>100){

            System.out.println("Bir hata oluştu lütfen girdiğiniz değerleri kontrol ediniz");

            return;
        }

        else if (genelort>=90){
            System.out.println("Genel ortalamanız:"+genelort+" \nNotunuz:AA"+"\nGeçtiniz.");
        } else if (genelort>=85) {
            System.out.println("Genel ortalamanız:"+genelort+" \nNotunuz:BA"+"\nGeçtiniz.");

        }else if (genelort>=80){
            System.out.println("Genel ortalamanız:"+genelort+" \nNotunuz:BB"+"\nGeçtiniz.");

        } else if (genelort>=75) {
            System.out.println("Genel ortalamanız:"+genelort+" \nNotunuz:CB"+"\nGeçtiniz.");
        } else if (genelort>=70) {
            System.out.println("Genel ortalamanız:"+genelort+" \nNotunuz:CC"+"\nGeçtiniz.");

        } else if (genelort>=65) {
            System.out.println("Genel ortalamanız:"+genelort+" \nNotunuz:DC"+"\nGeçtiniz.");

        } else if (genelort>=60) {
            System.out.println("Genel ortalamanız:"+genelort+" \nNotunuz:DD"+"\nGeçtiniz.");

        } else if (genelort>=55) {
            System.out.printf("Genel ortalamanız:"+genelort+" \nNotunuz:FD"+"\nGeçtiniz.");

        }else if(genelort>=0){
            System.out.println("Genel ortalamanız:"+genelort+" \nNotunuz:FF"+"\nKaldınız.");
        }else System.out.println("Bir hata oluştu lütfen girdiğiniz değerleri kontrol ediniz.");
        return;
    }
    }
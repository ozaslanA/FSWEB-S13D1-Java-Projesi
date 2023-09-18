import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 1));  // true
        System.out.println(shouldWakeUp(false, 2));  // false
        System.out.println(shouldWakeUp(true, 8));  // false
        System.out.println(shouldWakeUp(true, -1));  // false
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));
        System.out.println(isCatPlaying(true,10));
        System.out.println(isCatPlaying(false,36));
        System.out.println(isCatPlaying(false,35));
        System.out.println("-----------------");
        Scanner scanner = new Scanner(System.in);

try{
    System.out.println("Enter width of rectangle ");
    double width = scanner.nextDouble();
    System.out.println("Enter height of rectangle ");
    double height = scanner.nextDouble();
    System.out.println("Area = " + area(width,height));
} catch (Exception ex) {
    System.out.println("Invalid Input");

}


    }
    // Havlayan Köpeğimiz
    public static boolean shouldWakeUp(boolean havlıyor, int GününSaati) {
        if (GününSaati < 0 || GününSaati > 23) {   // || işareti || Mantıksal Operatörü koşullu “veya” anlamına gelmektedir. Karşılaştırma yapılan değerlerden en az biri true olduğu sürece true değer döndürür.
            return false;
        }

        return havlıyor && (GününSaati < 8 || GününSaati > 22);
    }

    //Yaş Tespiti

    public static boolean hasTeen(int age1, int age2, int age3) {
        return (age1 >= 13 && age1 <= 19) || (age2 >= 13 && age2 <= 19) || (age3 >= 13 && age3 <= 19);


    }


    //Oyuncu Kedi

    public static boolean isCatPlaying(boolean yaz , int sıcaklık) {
        int upperLimit = yaz ? 45 : 35;

        int lowerLimit =25;
        return sıcaklık >= lowerLimit && sıcaklık <=upperLimit;
    }
            // ALAN HESAPLAMA
    public static double area (double width, double height){
        if(width<0 || height < 0 ){
            System.out.println("0 dan büyük olmalı ");
            return -1;
        }
        return width * height;
    }
    public static double area(double radius) {
        if (radius < 0) {
            System.out.println("radius değeri 0 dan küçük olamaz");
            return -1;
        }
        return radius * radius * Math.PI;
    }



}




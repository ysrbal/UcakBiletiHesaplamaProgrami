import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int km, flytype, age;
        double perKm = 0.10;
        double total, indTotal, sDis, yDis;


        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi KM olarak giriniz:");
        km = input.nextInt();
        if (km < 1) {
            System.out.print("Hatali bir değer girdiniz!");
        } else {
            System.out.print("Yolcunun yasini giriniz: ");
        }
        age = input.nextInt();
        if (age > 0){
            if (age <= 1){
                System.out.print("Hatalı bir değer girdiniz!");
            }
            else if (age >= 1 && age <= 12) {
            System.out.print("1= Tek Yön 2=Gidiş Dönüş:");
            flytype = input.nextInt();
            switch (flytype) {
                case 1:
                    total = km*perKm;
                    yDis = total*0.50;
                    indTotal = total - yDis;
                    sDis = indTotal;
                    System.out.print("Toplam Tutar:" + indTotal);
                    break;
                case 2:
                    total = km*perKm;
                    yDis = total*0.50;
                    indTotal = total - yDis;
                    sDis = indTotal * 0.20;
                    indTotal = (indTotal - sDis)*2;
                    System.out.print("Toplam Tutar:" + indTotal);
                    break;
                default:
                    System.out.print("Hatalı bir değer girdiniz!");
            }
        } else if (age >= 13 && age <= 24) {
            System.out.print("1= Tek Yön 2=Gidiş Dönüş:");
            flytype = input.nextInt();
            switch (flytype) {
                case 1:
                    total = km*perKm;
                    yDis = total*0.10;
                    indTotal = total - yDis;
                    System.out.print("Toplam Tutar:" + indTotal);
                    break;
                case 2:
                    total = km*perKm;
                    yDis = total*0.10;
                    indTotal = total - yDis;
                    sDis = indTotal * 0.20;
                    indTotal = (indTotal - sDis)*2;
                    System.out.print("Toplam Tutar:" + indTotal);
                    break;
                default:
                    System.out.print("Hatalı bir değer girdiniz!");
            }
        } else if (age >= 25 && age <= 65) {
            System.out.print("1= Tek Yön 2=Gidiş Dönüş:");
            flytype = input.nextInt();
            switch (flytype) {
                case 1:
                    total = km*perKm;
                    System.out.print("Toplam Tutar:" + total);
                    break;
                case 2:
                    total = km*perKm;
                    sDis = total * 0.20;
                    indTotal = (total - sDis)*2;
                    System.out.print("Toplam Tutar:" + sDis);
                    break;
                default:
                    System.out.print("Hatalı bir değer girdiniz!");
            }
        } else if (age > 65) {
            System.out.print("1= Tek Yön 2=Gidiş Dönüş:");
            flytype = input.nextInt();
            switch (flytype) {
                case 1:
                    total = km*perKm;
                    yDis = total*0.30;
                    indTotal = total - yDis;
                    System.out.print("Toplam Tutar:" + indTotal);
                    break;
                case 2:
                    total = km*perKm;
                    yDis = total*0.30;
                    indTotal = total - yDis;
                    sDis = indTotal * 0.20;
                    indTotal = (indTotal - sDis)*2;
                    System.out.print("Toplam Tutar:" + indTotal);
                    break;
                default:
                    System.out.print("Hatalı bir değer girdiniz!");
            }
        } else {
            System.out.print("Hatalı bir değer girdiniz!");
        }


    }

    }

}
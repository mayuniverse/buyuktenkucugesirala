import java.util.Scanner;

public class buyuktenkucugesira {
    public static void main(String[] args) {
        
        // değişkenleri tanımlayalım 
        double a,b,c;

        // import sınıfını tanımla
        Scanner inp = new Scanner(System.in);

        // kullanıcıdan input al
        System.out.println("1.sayıyı giriniz");
        a = inp.nextDouble();

        System.out.println("2.sayıyı giriniz");
        b = inp.nextDouble();

        System.out.println("3.sayıyı giriniz");
        c = inp.nextDouble();

        // işlemleri yapalım
        if(a>b && a>c){
            if(b>c){
                System.out.println(a+">"+b+">"+c);
            }else{System.out.println(a+">"+c+">"+b);};
        }else if(b>a && b>c){
            if(a>c){
                System.out.println(b+">"+a+">"+c);
            }else{System.out.println(b+">"+c+">"+a);};
        }else if(c>a && c>b){
            if(a>b){
                System.out.println(c+">"+a+">"+b);
            }else{System.out.println(c+">"+b+">"+a);}
        };
    }
    
}

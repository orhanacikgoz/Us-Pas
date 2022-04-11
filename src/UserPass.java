import  java.util.Scanner;


public class UserPass {
    public static void main(String[] args) {
        String userName, pas;


        Scanner inp = new Scanner(System.in);
        System.out.print("Kullanici Adiizi Giriniz: ");
        userName = inp.nextLine();
        System.out.print("Sifrenizi Giriniz: ");
        pas=inp.nextLine();


        if (userName.equals("orhanacikgoz") && pas.equals("patika1234")){
            System.out.println("Giris Yapilmistir Tebrikler");
        }else {
            System.out.println("Hatali Kullanici Adi veya Sifre Giris Yapilamadi");
            System.out.println("Sifrenizi Degistirmek İstiyor Musunuz?");
            String cevap;
            cevap =inp.nextLine();
            if (cevap.equals("evet")){
                String newpas;
                System.out.println("Yeni sifrenizi giriniz: ");
                newpas=inp.nextLine();
                if (newpas.equals("patika1234")){
                    System.out.println("Yeni sifreniz eskisi ile ayni olmamalidir!");
                    System.out.println("Yeni Sifrenizi Tekrar Giriniz(Son 2 Deneme Hakkiniz): ");
                    newpas=inp.nextLine();
                    if (newpas.equals("patika1234")){
                        System.out.println("Yeni sifreniz eskisi ile ayni olmamalidir!(Son 1 Deneme Hakkiniz)");


                }else{
                    System.out.println("Yeni Sifreniz Olusturuldu");
                };
            }else {
                System.out.println("Yeni sifre olusturulmadi");
        }
    }
} } }

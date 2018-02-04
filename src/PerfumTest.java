import java.util.Scanner;

public class PerfumTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Perfum[] data = new Perfum[3];

        for (int i = 0; i < data.length; i++) {
            data[i] = new Perfum();
            System.out.println("Podaj nazwę perfum");
            data[i].setName(input.nextLine());
            System.out.println("Podaj cenę perfum");
            data[i].setPrice(input.nextInt());
            input.nextLine();
            if (data[0].equals(data[1])){
                System.out.println("Taki produkt już istnieje w bazie-nowy produkt nie został utworzony");
            } else {
                System.out.println("Nowy produkt o nazwie " + data[i].getName() + " i cenie " + data[i].getPrice() + " został utworzony");
            }
        }
    }
}


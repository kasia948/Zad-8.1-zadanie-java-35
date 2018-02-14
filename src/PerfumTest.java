import java.util.Scanner;
public class PerfumTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Perfum[] data = new Perfum[3];

        int index = 0;
        Perfum temp = new Perfum();

        for (int i = 0; i <data.length ; i++) {
            do {
                System.out.println("Podaj nazwę perfum");
                temp.setName(input.nextLine());
                System.out.println("Podaj cenę perfum");
                temp.setPrice(input.nextInt());
                input.nextLine();

                if (!temp.equals(data[index])) {
                    data[index] = temp;
                    System.out.println("Nowy produkt o nazwie " + data[index].getName() + " i cenie "
                            + data[index].getPrice() + " został utworzony");
                } else {
                    System.out.println("Taki produkt już istnieje, podaj inny");
                }
            }
            while (temp.equals(data[index]));
            index++;
        }
    }
}
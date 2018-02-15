import java.util.Scanner;

public class PerfumTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Perfum[] data = new Perfum[3];

        while (data[data.length-1] == null) { // dopóki ostatni element tablicy nie jest nullem (while)
            Perfum temp = new Perfum();
            System.out.println("Podaj nazwę perfum");
            temp.setName(input.nextLine());
            System.out.println("Podaj cenę perfum");
            temp.setPrice(input.nextInt());
            input.nextLine();

            for (int j = 0; j < data.length; j++) {
                if (!temp.equals(data[j]) && data[j] == null) {
                    data[j] = temp;
                    System.out.println("Nowy produkt o nazwie " + data[j].getName() + " i cenie "
                            + data[j].getPrice() + " został utworzony");
                    break;
                } else if (temp.equals(data[j])) {
                    System.out.println("Taki produkt już istnieje, podaj inny");
                    break;
                }
            }
        }
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Menu {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("Выберите действие  введя его номер");
            System.out.println("1. Зашифровать текст");
            System.out.println("2. Расшифровать текст");
            System.out.println("3. Брутфорс");
            System.out.println("4. Стат. анализ");
            System.out.println("5. Выход из программы");


            String answer = reader.readLine();

            switch (answer) {
                case ("1") -> new EncryptedMyReleased().encrypted();
                case ("2") -> new Decrypted().decrypted();
                case ("3") -> System.out.println("3. Брутфорс");
                case ("4") -> System.out.println("4. Стат. анализ");

                case ("5") -> {
                    return;
                }

            }
        }
    }
}
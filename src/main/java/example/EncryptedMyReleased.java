/*package main.java.example;

import main.java.CesarCipher;

import java.io.*;

public class EncryptedMyReleased {
    public static CesarCipher cesarCipher = new CesarCipher();

    public static void main(String[] args) throws IOException {

    }

    public void encrypted() throws IOException { // Нужно ли делать этот метод статическим?
        //String src = "/Users/dmitriy/Desktop/stream/info.txt";
        //String dec = "/Users/dmitriy/Desktop/stream/finish.txt";

        String src = null;
        int key = 0;
        String dest = null;

        System.out.println("Введите адрес файла с текстом для шифрования");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        src = reader.readLine();

        System.out.println("Введите ключ для шифрования в формате целого числа");
        key = Integer.parseInt(reader.readLine());

        System.out.println("Введите адрес файла для записи результата шифрования");
        dest = reader.readLine();


        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(src));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(dest))) {
            while (bufferedReader.ready()) {
                String line = bufferedReader.readLine();
                String end = cesarCipher.encrypt(line, key);
                bufferedWriter.write(end + System.lineSeparator());
                //bufferedWriter.newLine();
            }
        }
    }
}


 */
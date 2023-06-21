/*
package main.java.example;

import main.java.CesarCipher;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;


public class Encrypted {

    private final CesarCipher cesarCipher = new CesarCipher();
    private final BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

    public String encrypted(String path, int key, String newPath) throws IOException {

        String content = Files.readString(Path.of(path));//сделать через тернарник
        String encrypt = cesarCipher.encrypt(content, key);////сделать через тернарник
        Files.writeString(Path.of(newPath), encrypt);// //сделать через тернарник
        return "Содержимое файла зашифрованно" + System.lineSeparator();



        /*System.out.println("Введите адрес файла с текстом для шифрования");
        String path = console.readLine();

        System.out.println("Введите ключ для шифрования в формате целого числа");
        int key = Integer.parseInt(console.readLine());

        System.out.println("Введите адрес файла для записи результата шифрования");
        String newPath = console.readLine();



        String content = Files.readString(Path.of(path));//сделать через тернарник
        String encrypt = cesarCipher.encrypt(content, key);////сделать через тернарник
        Files.writeString(Path.of(newPath), encrypt);// //сделать через тернарник
        System.out.println("Содержимое файла зашифрованно" + System.lineSeparator());



    }
}

 */
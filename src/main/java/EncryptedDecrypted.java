
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class EncryptedDecrypted {

    private final CesarCipher cesarCipher = new CesarCipher();

    public void encryptedDecrypted(boolean flag) throws IOException {

        Util.writeMessage("Введите адрес файла с текстом для его " + (flag ? "шифровки" : "расшифровки"));
        String path = Util.readString();

        Util.writeMessage("Введите ключ");
        int key = Util.readInt();

        Path newPath = Util.buildFileName(path, flag ? "_encrypted" : "_decrypted");

        String content = Files.readString(Path.of(path));
        String encryptedDecrypted = flag ? cesarCipher.encrypt(content, key) : cesarCipher.decrypt(content, key);
        Files.writeString(newPath, encryptedDecrypted);

        Util.writeMessage("Содержимое файла " + newPath.getFileName() + (flag ? " зашифрованно" : " расшифрованно")
                + System.lineSeparator());
    }
}

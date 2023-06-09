

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Bruteforce {

    private final CesarCipher cesarCipher = new CesarCipher();
    private static final int MAX_LENGTHS_WORD = 28;

    public void bruteForce() throws IOException {
        Util.writeMessage("Введите путь для его расшифровки");
        String path = Util.readString();
        Path bruteforce = Util.buildFileName(path, "_bruteforce");

        String content = Files.readString(Path.of(path));


        for (int i = 0; i < cesarCipher.getLength(); i++) {
            String decrypt = cesarCipher.decrypt(content, i);
            if (isValidateText(decrypt)) {
                Files.writeString(bruteforce, decrypt);
                Util.writeMessage("Успешно!" + "файл находится в:" + bruteforce.getFileName());
                Util.writeMessage("Ключ равен " + i);
                break;
            }
        }
    }

    private boolean isValidateText(String text) throws IOException {
        boolean isValidate = false;
        for (String word : text.split(" ")) {
            if (word.length() > MAX_LENGTHS_WORD) {
                return false;
            }
        }

        if (text.contains(". ") || text.contains(", ") || text.contains("! ") || text.contains("? ")) {
            isValidate = true;
        }

        while (isValidate) {
            Util.writeMessage(text.substring(0, 20));
//понять какой кусок текста предоставить пользователю. Первые 100 символов (например)

            Util.writeMessage("Понятен ли этот текст? Y/N");
            String answer = Util.readString();
            if (answer.equalsIgnoreCase("Y")) {
                return true;
            } else if (answer.equalsIgnoreCase("N")) {
                isValidate = false;
            } else {
                Util.writeMessage("Выбрать только Y или N");
            }
        }
        return false;
    }
}

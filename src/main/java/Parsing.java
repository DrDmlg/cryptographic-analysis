import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Parsing {
    Map<Character, Integer> mapEncrypted = new HashMap<>();
    Map<Character, Integer> mapOriginal = new HashMap<>();
    Map<Character, Character> mapDecrypted = new HashMap<>();

    public void parse() throws IOException {
        Util.writeMessage("Введите путь к зашифрованному файлу");
        String passEncrypted = Util.readString();

        Util.writeMessage("Введите путь к оригинальному файлу для набора статистики");
        String passOriginal = Util.readString();

        Path parsing = Util.buildFileName(passEncrypted, "_parsing");

        List<Map.Entry<Character, Integer>> listEncrypted = fillMapAndConvertToLIst(mapEncrypted, passEncrypted);
        List<Map.Entry<Character, Integer>> listOriginal = fillMapAndConvertToLIst(mapOriginal, passOriginal);

        if (listEncrypted.size() <= listOriginal.size()) {
            for (int i = 0; i < listEncrypted.size(); i++) {
                mapDecrypted.put(listEncrypted.get(i).getKey(), listOriginal.get(i).getKey());
            }
        } else {
            Util.writeMessage("Длины файл статистики недостаточно для расшифровки");
        }
        String content = Files.readString(Path.of(passEncrypted));
        StringBuilder sb = new StringBuilder();
        for (char encryptedChar : content.toCharArray()) {
            sb.append(mapDecrypted.get(encryptedChar));
        }
        Files.writeString(parsing, sb);
        Util.writeMessage("Файл расшифрован");
    }

    public List<Map.Entry<Character, Integer>> fillMapAndConvertToLIst(Map<Character, Integer> map, String path) throws IOException {
        for (char aChar : Files.readString(Path.of(path)).toCharArray()) {
            map.merge(aChar, 1, Integer::sum);
        }
        return map.entrySet().stream().sorted(Map.Entry.<Character, Integer>comparingByValue().reversed()).toList();
    }
}

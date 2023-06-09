

public class CesarCipher {

    private static final String ALPHABET =
              "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"
            + "абвгдеёжзийклмнопрстуфхцчшщъыьэюяАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ"
            + ".,\":!? +-*/\\@#$%^&(){}[];'|`~=_©«»—"
            + "0123456789";

    public String encrypt(String message, int key) {

        StringBuilder result = new StringBuilder();

        for (char aChar : message.toCharArray()) {
            int index = ALPHABET.indexOf(aChar);
            if (index >= 0) {
                int newIndex = (index + key) % ALPHABET.length();
                char newChar = newIndex < 0 ? ALPHABET.charAt(ALPHABET.length() + newIndex) : ALPHABET.charAt(newIndex);
                result.append(newChar);
            }
        }
        return result.toString();
    }

    public String decrypt(String message, int key) {
        return encrypt(message, key * -1);
    }

    public int getLength(){
        return ALPHABET.length();
    }

    public char[] getCharArray(){
        return ALPHABET.toCharArray();
    }
}




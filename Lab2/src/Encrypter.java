import java.util.Locale;

public class Encrypter {

    public static String encryptRowColumn(String plaintext, int numColumns){
        plaintext = plaintext.replaceAll(" ", "").toUpperCase();
        int numRow = Math.ceilDiv(plaintext.length(),numColumns); //Just Divide Function

        if(plaintext.length() < numRow * numColumns){
            while (plaintext.length() < numRow * numColumns){
                StringBuilder str = new StringBuilder(plaintext);
                str.append("X");
                plaintext = str.toString();
            }
        }

        StringBuilder Cipertext = new StringBuilder();
        for (int col = 0; col < numColumns; col++){
            int index = col;
            for (int row = 0; row < numRow; row++){
                Cipertext.append(plaintext.toCharArray()[index]);
                index += numColumns;
            }
        }

        return Cipertext.toString();
    }


    public static String decryptRowColumn(String plaintext, int numColumns){
        int Key = Math.ceilDiv(plaintext.length(),numColumns);
        return encryptRowColumn(plaintext,Key);
    }



    public static String encryptCaesarCipher(String plaintext, int shift){

        if(shift >= 26) shift/=26;

        char[] chararr = plaintext.replaceAll(" ", "").toUpperCase().toCharArray();
        StringBuilder cipertext = new StringBuilder();
        for (char chr : chararr) {
            cipertext.append((char) (chr + shift));
        }

        return cipertext.toString();
    }


    public static String decryptCaesarCipher(String plaintext, int shift){

        if(shift >= 26) shift/=26;

        char[] chararr = plaintext.replaceAll(" ", "").toUpperCase().toCharArray();
        StringBuilder cipertext = new StringBuilder();
        for (char chr : chararr) {
            cipertext.append((char) (chr - shift));
        }

        return cipertext.toString();

    }
}

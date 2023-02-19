public class TestEncrypter {
    public static void main(String[] args) {
        System.out.println(Encrypter.encryptRowColumn("Secret Message", 3));
        System.out.println(Encrypter.decryptRowColumn("SRMSEEEEAXCTSGX", 3));



        System.out.println(Encrypter.encryptCaesarCipher("ABCD", 3));
        System.out.println(Encrypter.decryptCaesarCipher("DEFG", 3));

        System.out.println(Math.ceilDiv(12,3));
    }
}

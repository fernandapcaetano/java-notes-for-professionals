package cap11Strings;

public class ComparandoSwitch {

    public static void main(String[] args) {
        String compara = "A";
        switch (compara) {
            case "a":
                System.out.println("Não é essa");
                break;
            case "A":
                System.out.println("Você acertou");
                break;
            default:
                System.out.println("está bem longe!");
                break;
        }

        String strObj = new String("Oi!");
        String str = "Oi!";
        if (strObj.equals(str)) {
        System.out.println("As strings são iguais");
        }
        // The two string references do not point to the same object
        if (strObj != str) {
        System.out.println("Não são o mesmo objeto");
        }
        String internedStr = strObj.intern();
        if (internedStr == str) {
        System.out.println("Os valores do abjeto e a váriavel são iguais");
        }
    }
    
    
}

package cap11Strings;

public class ComparandoStrings {
    
    public static void main(String[] args) {

        String a = "Bom dia123";
        String b = "Bom dia" + 123;
        
        //comparando ignorando se são maiusculas ou minúsculas
        if (a.equalsIgnoreCase(b)){
            System.out.println("São iguais");
        }else{
            System.out.println("Não são iguais");
        }

    }
}

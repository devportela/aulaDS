import java.util.Scanner;
public class animais {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite o animal cachorro,gato,peixe ou cobra:");
        String animalEscolha = sc.next();

        switch (animalEscolha) {
            case  "cachorro":
                System.out.println("mamifero");
                break;
        case "gato":
        System.out.println("mamifero");
        break;
        case "cobra":
        System.out.println("reptil");
        break;
        case "peixe":
        System.out.println("peixe");
        break;
            default:
            System.out.println("digite um animal valido");
                break;
        }
    }
    
}

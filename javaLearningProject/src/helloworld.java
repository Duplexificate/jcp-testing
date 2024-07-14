package src;

public class helloworld{

    static <String> void genericFunc(String element) {
        System.out.println(element);
    }

    public static void main(String[] args) {

        genericFunc("Bonjour, Je suis juste un ninja avec des salutations!");

    }
}
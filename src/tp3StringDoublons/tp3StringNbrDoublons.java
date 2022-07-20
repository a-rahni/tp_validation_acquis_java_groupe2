package TPsValidationAcquis.tp3StringDoublons;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/**
Ecrire un programme Java qui demande à l’utilisateur d’entrer une phase à partir du clavier.
 Ensuite, le programme va retirer tous les doublons de la phase, puis à la fin le programme va afficher:
 La chaîne de départ fournie par l’utilisateur
 La chaîne après suppression des doublons
 Une liste contenant tous les doublons et le nombre de fois que ceux-ci figuraient dans l’ancienne chaîne
*/
public class tp3StringNbrDoublons {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Entrez une chaine de caractère: ");
        String chaine = input.nextLine();

        String[] tab = chaine.split("\\ ");
        Map<String, Integer> mapOccurence = new HashMap<>();

        StringBuffer sb = new StringBuffer();
        for (String s : tab) {
            if (!s.isEmpty()) {
                if (mapOccurence.containsKey(s)) {
                    mapOccurence.replace(s, mapOccurence.get(s) + 1);
                } else {
                    sb.append(s).append(" ");
                    mapOccurence.put(s, 1);
                }
            }
        }
        System.out.printf("Chaine: %s\n", chaine);
        System.out.printf("Chaine sans doublons: %s\n", sb.toString().trim());
        System.out.println("liste de doublons:");
        for(Map.Entry m: mapOccurence.entrySet()){
            if((Integer)m.getValue()>1) {
                System.out.printf("%s : %d fois\n", m.getKey(), m.getValue());
            }
        }
    }
}

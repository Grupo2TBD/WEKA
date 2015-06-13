
package weka;

import java.util.Locale;
import java.util.Scanner;


public class main {
    
    public static void main(String[] args) throws Exception{
        
        TrainModelForSerialize tmfs = new TrainModelForSerialize();
        CommentClassifier cs;
        String comment;
        Tokenizer tokenizer = new SimpleTokenizer(new Locale("ES"));
        StopWordsRemoval stopWordsRemoval = new StopWordsRemoval();
        double classif;
        Scanner sc = new Scanner(System.in);
        String opc;
        
        System.out.print("¿Entrenar?: ");
        opc = sc.nextLine();
        
        if (opc.equals("si")) {
            tmfs.train();
        } else {
            cs = new CommentClassifier("C:/Users/Fernando/Desktop/weka/svm.model", "C:/Users/Fernando/Desktop/weka/attrs.dat", tokenizer,
                    stopWordsRemoval);
            comment = "no me gusto la foto, esperaba mas de ti";
            classif = cs.classify(comment);

            if (classif == 0.0) {
                System.out.println("POSITIVO");
            } else {
                if (classif == 1.0) {

                    System.out.println("NEGATIVO");
                } else {
                    System.out.println("NEUTRAL");
                }
            }

        }
        //negativos
        //"no me gusto la foto, esperaba mas de ti"

        
        //positivos
        //"te felicito por tu captura, muy bien"


    }
}

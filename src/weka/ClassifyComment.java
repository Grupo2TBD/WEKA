
package weka;

import java.util.Locale;

public class ClassifyComment {
    
    public ClassifyComment(){};

    public String classify(String comment) throws Exception {

        TrainModelForSerialize tmfs = new TrainModelForSerialize();
        CommentClassifier cs;
        Tokenizer tokenizer = new SimpleTokenizer(new Locale("ES"));
        StopWordsRemoval stopWordsRemoval = new StopWordsRemoval();
        double classif;

        cs = new CommentClassifier("C:/Users/Fernando/Desktop/weka/svm.model", "C:/Users/Fernando/Desktop/weka/attrs.dat", tokenizer, stopWordsRemoval);
        classif = cs.classify(comment);

        if (classif == 0.0) {
            return "Positivo";
        } else {
            if (classif == 1.0) {
                return "Negativo";
            } else {
                return "Neutral";
            }
        }

    }

}

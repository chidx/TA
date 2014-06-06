/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testa;

import IndonesianPreProcessor.IndonesianPOSTagger;
import IndonesianPreProcessor.IndonesianSentenceFormalization;
import java.util.ArrayList;

/**
 *
 * @author Wachid
 */
public class TesTA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        IndonesianSentenceFormalization formalizer = new IndonesianSentenceFormalization();
        String threadTitle = "Hotel Termahal di Dunia Tarifnya 6 Miliyar Untuk Semalam";
        threadTitle = threadTitle.toLowerCase();
        threadTitle = formalizer.formalizeSentence(threadTitle);
        ArrayList<String[]> posTag = IndonesianPOSTagger.doPOSTag(threadTitle);
        for (String[] s : posTag){
            System.out.print(s[0] + " - ");   
        }
        System.out.println("");
        for (String[] s : posTag){
            System.out.print(s[1] + " - ");   
        }
    }
}

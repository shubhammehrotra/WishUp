/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wishdetector;

/**
 *
 * @author shubham_15294
 */
public class WishDetector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String input = "give a string";
        String[] wishKeywords = {".*would like.*(if).*", ".*i wish.*",".*i hope.*",".*i want.*",".*hopefully.*",".*if only.*",".*would be better if.*", ".*(should).*",".*would that.*",".*(can't believe).*(didn't).*",".*(don't believe).*(didn't).*",".*(do want).*",".*i can has.*"};
        for (int i = 0; i < wishKeywords.length; i++) {
            if (input.toLowerCase().matches(wishKeywords[i])) {
                System.out.println("Wish Detected!");
                break;
            } 
        }
    }        // TODO code application logic here

    
}

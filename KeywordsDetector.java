public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market",
            "Programming is both painful and engaging",
            "This has nothing to do with machine learning",
            "We need to leverage our core competencies",
            "Let's talk about data and algorithms",
            "Chatbots are great but must be used carefully",
            "This blockchain-based solution will disrupt the industry",
            "The team showed great Synergy in the last project",
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift",
            "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business presentations 
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
        detectAndPrint(sentences, keywords);
    }

    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords) {
        
        String[] newSentence = new String[sentences.length];

        for (int i = 0; i < sentences.length; i++) {
            newSentence[i] = sentences[i].toLowerCase(); }

        for (int j = 0; j < keywords.length; j++) {
            keywords[j] = keywords[j].toLowerCase(); }

            for (int currentSen = 0; currentSen < sentences.length; currentSen++) {

            boolean match1 = false;

        for (int a = 0; a < newSentence[currentSen].length(); a++) {
            
            for (int b = 0; b < keywords.length; b++) {

                boolean match = false;
            
                if (a + keywords[b].length() <= newSentence[currentSen].length()) {
                    
                if (keywords[b].charAt(0) == newSentence[currentSen].charAt(a)) {
                    
                match = true;
                    
            for (int i = 1; i < keywords[b].length(); i++) {
                if (keywords[b].charAt(i) != newSentence[currentSen].charAt(i + a)) {
                    match = false;
                    break; }

                }
            }

                if (match) {
                    match1 = true;
                    break; }

            }
         }
     }
      
            if (match1) {
                System.out.println(sentences[currentSen]); }

            }
        


    }
}

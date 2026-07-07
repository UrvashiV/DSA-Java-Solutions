class Solution {

    public String findRoot(String word, HashSet<String> set){
        for(int i =0; i<word.length(); i++){
            String root =word.substring(0,i);
            if(set.contains(root)){
                return root;
            }
        }
        return word;
    }

    public String replaceWords(List<String> dictionary, String sentence) {
        HashSet<String> set = new HashSet<>();
        String[] words = sentence.split(" ");
        String resultSentence="";
        for(int i =0; i<dictionary.size();i++){
            set.add(dictionary.get(i));
        }

        for(int i=0; i<words.length; i++){
            String word =words[i];
            resultSentence = resultSentence + findRoot(word,set) +" ";
        }
        return resultSentence.substring(0,resultSentence.length()-1);

    }
}
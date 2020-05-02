/*
 * Group Anagrams
Solution
Given an array of strings, group anagrams together.

Example:

Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
Output:
[
  ["ate","eat","tea"],
  ["nat","tan"],
  ["bat"]
]
Note:

All inputs will be in lowercase.
The order of your output does not matter.*/
public class GroupAnagrams {
	 public List<List<String>> groupAnagrams(String[] strs) {
         HashMap<String,ArrayList<String>> tokenToAnagramsMap = new HashMap<>();
        int len = strs.length;
        for(int i=0;i<len;++i){
            String str = strs[i];
            char[] charArr = str.toCharArray();
            Arrays.sort(charArr);
            String strCpy = String.valueOf(charArr);
            if(tokenToAnagramsMap.get(strCpy)==null){
                tokenToAnagramsMap.put(strCpy,new ArrayList<>());
            }
            tokenToAnagramsMap.get(strCpy).add(str);
        }
        List<List<String>> outputList = new ArrayList<>();
        for(ArrayList<String> anagramsList : tokenToAnagramsMap.values()){
            outputList.add(anagramsList);
        }
        return outputList;
        
    }
}

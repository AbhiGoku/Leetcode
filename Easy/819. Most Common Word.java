import java.util.*;
class Solution {
  public String mostCommonWord(String paragraph, String[] banned) {
      HashMap<String,Integer> map=new HashMap<>();
      //regrex expression to replace all the non alphabetic char to " " and 
      //convert to lowercase and finally convert to string array
      String[] para=paragraph.replaceAll("[^a-zA-Z ]", " ").toLowerCase().split("\\s+");
      for(String p:para){
          map.put(p,map.getOrDefault(p,0)+1);
      }

      String maxOccurence="";
      int maxOccurenceValue=0;
      Set<String> set= map.keySet();
      for(String s:set){
          if(map.get(s)>maxOccurenceValue){
              boolean isPresent=false;
              for(String ban:banned){
                  
                  if(ban.equalsIgnoreCase(s)){
                      isPresent=true;
                      break;
                  }
              }
              if(!isPresent){
                  maxOccurence=s;
                  maxOccurenceValue=map.get(s);
              }
              isPresent=false;
          }
      }

      return maxOccurence;

  }
}
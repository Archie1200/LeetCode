package Jan15;

import java.util.List;

public class ReplaceWords {
    public static String replaceWords(List<String> arr, String s) {
            String str[]=s.split(" ");
            for(int i=0;i<str.length;i++){
                for(int j=0;j<arr.size();j++){
                    if(str[i].contains(arr.get(j))) {
                        str[i] = arr.get(j);
                        j= arr.size();
                    }
                }
            }
            String p="";
            for(int i=0;i<str.length-1;i++){
                p+=str[i]+" ";
            }
            p+=str[str.length-1];

            return p;
    }

}

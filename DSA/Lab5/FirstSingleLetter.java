
public class FirstSingleLetter{
     char firstletter(String text, int n) {
        for (int i = 0; i < n; i++) {
            char current = text.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < n; j++) {
                if (i != j && current == text.charAt(j)) {
                    isUnique = false;
                    break;

            }
        }
        if(isUnique){
            return current;
        }
    }
    return '\0';
}

    public static void main(String args[]){
        FirstSingleLetter s= new  FirstSingleLetter();
        String text = "aaya";
        int n= text.length();
        char result = s.firstletter(text , n );
        if (result != '\0') {
            System.out.println("First unique letter: " + result);
        } else {
            System.out.println("No unique letter found.");
        }

    
     }}



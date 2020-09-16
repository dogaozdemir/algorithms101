package algorithms;

public class Recursion {


  /*  public String stripZeros(String text) {
  long startTime = System.currentTimeMillis();
        if (text.startsWith("0")) {
            String substring = text.substring(1);
            String newString = stripZeros(substring);
            return newString;
        }
        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println(elapsedTime);
        return text; // nothing left to strip. Return!
    }*/


    public String stripZeros(String text) {

        if(text.startsWith("0")){
            String withoutZero=text.substring(1);
             text=stripZeros(withoutZero);
        }

        return text;
    }

}

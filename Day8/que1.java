package Day8;

public class que1 {
    public static void main(String[] args) {
        String str = "Rahul Somase";
        String[] strArray = str.split("\n");
        for (String temp: strArray){
            System.out.println("Original String:"+ temp);
        }
        for(int i=0; i< strArray.length; i++)
        { char[] s1 = strArray[i].toCharArray();
            for (int j = s1.length-1; j>=0; j--)
        {
            System.out.print(""+s1[j]);
        }
            System.out.print(" ");
        }
    }
}

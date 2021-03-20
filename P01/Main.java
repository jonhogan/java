public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Hello");
        System.out.println("Yo");

        int myNum = 15;
        System.out.println(myNum);

        int x = 4;
        int y = 3;
        System.out.println(x + y);


        /*
        int myNum2 = 5;
        float myFloat = 5.99f;
        char myChar = 'D';
        boolean myBool = true;
       
        Different variable types
        */

        String myText = "What up, dawg?";
        System.out.println("Index of \"d\": " + myText.indexOf("d"));
        
        int max = Math.max(x,y);
        int min = Math.min(x,y);
        System.out.println(max);
        System.out.println(min);
        double root = Math.sqrt(64);
        System.out.println(root);

        double ran1 = Math.random();
        System.out.println(ran1);

        int ran2 = (int)(Math.random() * 101);
        System.out.println(ran2);

        
    }
}
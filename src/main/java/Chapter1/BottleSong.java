package Chapter1;


public class BottleSong {

    public static void main(String[] args) {
        int bottleNum = 10;
        String word = "bottles";



            while (bottleNum > 0) {


                System.out.println(bottleNum + " green " + word + ", hanging on the wall");
                System.out.println(bottleNum + " green " + word + ", hanging on the wall");
                System.out.println("And if one green bottle should accidentally fall,");
                bottleNum--;

                if (bottleNum == 1) { word = "bottle";}

                if(bottleNum > 0 ) {
                    System.out.println("There'll be " + bottleNum + " green " + word + ", hanging on the wall");

                } else {
                    System.out.println("There'll be no green bottle, hanging on the wall");
                }



            }

    }
}

package Chapter1;

public class PhraseOMatic {
    public static void main(String[] args) {
        String[] wordListOne ={"agnostic", "opinionated", "voice activated", "haptically driven", "extensible", "reactive", "agent based", "functional", "AI enabled","strongly typed"};
        String[] wordListTwo = {"loosely coupled", "six sigma",
                "asynchronous", "event driven", "pub-sub", "IoT", "cloud native", "service oriented", "containerized", "serverless",
        "microservices", "distributed ledger"};
        String[] wordListThree = {"framework", "library",
                "DSL", "REST API", "repository", "pipeline", "service mesh", "architecture", "perspective", "design",
                "orientation"};

        int oneLength = wordListOne.length;
        int twolength = wordListTwo.length;
        int threeLength = wordListThree.length;

        System.out.println(oneLength);
        System.out.println(twolength);
        System.out.println(threeLength);

        //generate three random numbers
        java.util.Random randomGenerator = new java.util.Random();
        int rand1 = randomGenerator.nextInt(oneLength);
        int rand2 = randomGenerator.nextInt(twolength);
        int rand3 = randomGenerator.nextInt(threeLength);

        //build  phrase
        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        System.out.println("what we need is a "+ phrase);

        int x = randomGenerator.nextInt(5);
        System.err.println(x);


    }
}

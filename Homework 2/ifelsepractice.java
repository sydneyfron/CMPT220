import java.util.Scanner;


    /* our first practice file!
     * create a 3 question quiz game (lots of if/else likely)
     * requirements: keep track of the user's score, has to have at least 3 questions, use if/else
     * can be any topic you pick :) feel free to pick some obscure or niche topics!
     * good luck!
     * */
    public class ifelsepractice {
        public static void main(String[] args) {
            int score=0;
            Scanner scan=new Scanner(System.in);
            System.out.println("Type ur answer as just the lowercase letter that corresponds to ur answer");
            System.out.println("What the only thing im like kinda allergic to a-cold saltwater " +
                    "b-frog slime c-leather cleaner");
            String q1= scan.nextLine();
            if (q1.equals("a")){
                score++;
                System.out.println("Correct");

            }
            else{
                System.out.println("Incorrect");
            }
            System.out.println("What food is better a-funnel cake or b-kiwi");
            String q2=scan.nextLine();
            if (q2.equals("a")){
                score++;
                System.out.println("Corrrect");
            }
            else{
                System.out.println("Incorrect");
            }
            System.out.println("What's my least favorite sport I've tried a- soccer b-basketball c-lax");
            String q3=scan.nextLine();
            if (q3.equals("b")){
                score++;
                System.out.println("Corrrect");
            }
            else{
                System.out.println("Incorrect");
            }
            System.out.println("Score: "+score);


        }
}

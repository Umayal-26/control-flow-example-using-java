import java.util.Scanner;

class Sample{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();
       if(N > 0){
        System.out.println("Positive");
       } 
       else if(N == 0){
        System.out.println("Zero");
       }
       else{
        System.out.println("Negative");
       }

       //switch case
       switch(N){
        case 1: System.out.println("Sunday");break;
        case 2: System.out.println("Monday");break;
        case 3: System.out.println("Tuesday");break;
        case 4: System.out.println("Wednesday");break;
        case 5: System.out.println("Thursday");break;
        case 6: System.out.println("Friday");break;
        case 7: System.out.println("Saturday");break;
        default: System.out.println("Your selection is invalid");
       }

       //looping
       for(int i = 1; i <= N; i++){
        System.out.print(i);
        System.out.println();
       }

       //printing numbers in descending order using while loop
       while (N >= 1) {
        System.out.println(N);
        N--;
       }

       //do...while loop
       do{
        System.out.println(N);
        N++;
       }
       while(N < 6);
    }
}
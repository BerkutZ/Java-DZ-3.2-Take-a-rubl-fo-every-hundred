import java.util.Scanner;

public class Main {
    public static void main(String[]args) {
        Scanner num = new Scanner(System.in);
        int current_account, refill_customer_account, sum_of_bonus;
        int bonus_for_client = 1;
        System.out.print("Input current account ");
        current_account = num.nextInt();
        System.out.print("Input sum of refill ");
        refill_customer_account = num.nextInt();
        if(refill_customer_account >= 1000) {
            sum_of_bonus = refill_customer_account/100 * bonus_for_client;
            current_account += refill_customer_account + sum_of_bonus;
            System.out.print(current_account);
        } else{
            sum_of_bonus = 0;
            current_account += refill_customer_account + sum_of_bonus;
            System.out.print(current_account);}

                }
    }

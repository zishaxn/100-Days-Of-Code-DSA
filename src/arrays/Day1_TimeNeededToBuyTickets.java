package arrays;

public class Day1_TimeNeededToBuyTickets {
    //2073. Time Needed to Buy Tickets
    public static void main(String[] args) {
        int[] arr = {2, 3,5, 2, 4, 6, 1};         //4 ;3 2 1 0 =4 second                  //6 :5 4 3
        System.out.println(timeToBuy(arr, 4));

    }


    public static int timeToBuy(int[] tickets, int k) {
        int pers = tickets[k];
        int time = 0;
        for (int i = 0; i < tickets.length; i++) {
            if (i <= k) {
                time += Math.min(pers, tickets[i]);
            } else {
                time += Math.min(pers - 1, tickets[i]);
            }
        }
        return time;

    }
}

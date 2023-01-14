package arrays;

public class Day1_TimeNeededToBuyTickets {
    //2073. Time Needed to Buy Tickets
    public static void main(String[] args) {
        int[] arr = {5, 1, 1, 1};
        System.out.println(timeToBuy(arr, 2));

    }

    public static int timeRequiredToBuy(int[] tickets, int k) {
        int time = 0;
        for (int i = 0; i < tickets.length; i++) {
            if (tickets[i] <= tickets[k]) {
                time += tickets[i];
            } else {
                time += tickets[k];
            }
            if (i > k && tickets[i] >= tickets[k]) {
                time--;
            }
        }
        return time;

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

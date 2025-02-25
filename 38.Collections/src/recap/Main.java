package recap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Theatre theatre = new Theatre("Olympian", 8, 12);
////        theatre.getSeats();
////        if(theatre.reserveSeat("H11")){
////            System.out.println("Please pay");
////        } else {
////            System.out.println("Sorry! Seat is taken");
////        }
////
////        if(theatre.reserveSeat("H11")){
////            System.out.println("Please pay");
////        } else {
////            System.out.println("Sorry! Seat is taken");
////        }
//
//        List<Theatre.Seat> seatCopy = new ArrayList<Theatre.Seat>(theatre.seats);
//        printList(seatCopy);
//
//        seatCopy.get(1).reserve();
//        if(theatre.reserveSeat("A02")){
//            System.out.println("Please pay");
//        } else {
//            System.out.println("Sorry! Seat is taken");
//        }
//
//        System.out.println(Collections.max(theatre.seats).getSeatNumber());
//
//        Collections.shuffle(seatCopy);
////        sortList(seatCopy);
////        printList(seatCopy);
//
//        List<Theatre.Seat> newList = new ArrayList<Theatre.Seat>(theatre.seats);
//        Collections.copy(newList, seatCopy);
//        printList(newList);


        if (theatre.reserveSeat("D12")) {
            System.out.println("Please pay");
        } else {
            System.out.println("Sorry! Seat is taken");
        }

        if (theatre.reserveSeat("D12")) {
            System.out.println("Please pay");
        } else {
            System.out.println("Sorry! Seat is taken");
        }

        if (theatre.reserveSeat("B13")) {
            System.out.println("Please pay");
        } else {
            System.out.println("Sorry! Seat is taken");
        }

        List<Theatre.Seat> reverseSeats = new ArrayList<>(theatre.getSeats());
        Collections.reverse(reverseSeats);
        printList(reverseSeats);


        List<Theatre.Seat> priceSeats = new ArrayList<>(theatre.getSeats());
        priceSeats.add(theatre.new Seat("B00", 13.00));
        priceSeats.add(theatre.new Seat("A00", 13.00));
        Collections.sort(priceSeats, Theatre.PRICE_ORDER);
        printList(priceSeats);
    }

    public static void printList(List<Theatre.Seat> list) {
        for (Theatre.Seat seat : list) {
            System.out.print(" " + seat.getSeatNumber() + " $" + seat.getPrice());
        }
        System.out.println();
        System.out.println("=================================");
    }

//    public static void sortList(List<? extends Theatre.Seat> list){
//        for(int i = 0; i < list.size()-1; i++){
//            for(int j = i+1; j< list.size(); j++){
//                if(list.get(i).compareTo(list.get(j)) > 0) {
//                    Collections.swap(list, i, j);
//                }
//            }
//        }
//    }
}

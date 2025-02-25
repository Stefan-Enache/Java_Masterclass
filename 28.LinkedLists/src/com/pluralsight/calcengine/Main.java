package com.pluralsight.calcengine;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {
//        Customers customer = new Customers("tim", 54.96);
//        Customers anotherCustomer;
//        anotherCustomer = customer;
//        anotherCustomer.setBalance(12.18);
//        System.out.println("balance for " + customer.getName() + " is " + customer.getBalance());
//
//        ArrayList<Integer> intList = new ArrayList<Integer>();
//        intList.add(1);
//        intList.add(3);
//        intList.add(4);
//
//        for (int i = 0; i < intList.size(); i++){
//            System.out.println(i + ": " + intList.get(i));
//        }
//
//        intList.add(1,2);
//
//        for (int i = 0; i < intList.size(); i++){
//            System.out.println(i + ": " + intList.get(i));
//        }

        Album album = new Album("Stormbringer", "Deep Purple");
        album.addSong("Stormbringer", 4.6);
        album.addSong("love don't mean a thing", 4.22);
        album.addSong("Holy man", 4.22);
        album.addSong("Hold on", 4.3);
        album.addSong("You can do it", 3.4);
        album.addSong("High ball shooter", 3.6);
        album.addSong("The Gypsy", 2.7);
        album.addSong("Soldier of fortune", 4.8);
        albums.add(album);

        album = new Album("For those about ot rock", "AC/DC");
        album.addSong("For those about ot rock", 4.6);
        album.addSong("I put my gfinger on you", 4.22);
        album.addSong("let's go", 4.22);
        album.addSong("Venom", 4.3);
        album.addSong("C O D", 3.4);
        album.addSong("breaking the rule", 3.6);
        albums.add(album);

        LinkedList<Song> playlist = new LinkedList<Song>();
        albums.get(0).addToPlaylist("You can do it", playlist);
        albums.get(0).addToPlaylist("Holy man", playlist);
        albums.get(0).addToPlaylist("Ysssfaa", playlist); // does not exist
        albums.get(0).addToPlaylist(8, playlist);
        albums.get(1).addToPlaylist(1, playlist);
        albums.get(1).addToPlaylist(3, playlist);
        albums.get(1).addToPlaylist(4, playlist);
        albums.get(1).addToPlaylist(24, playlist); // does not exist

        play(playlist);
    }

    private static void play(LinkedList<Song> playlist) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playlist.listIterator();
        if (playlist.size() == 0) {
            System.out.println("No songs in playlist");
        } else {
            System.out.println("Now playing: " + listIterator.next().toString());
            printMenu();
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Quitting");
                    quit = true;
                case 1:
                    if (!forward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now playing: " + listIterator.next().toString());
                    } else {
                        System.out.println("End of playlist reached");
                        forward = false;
                    }
                    break;
                case 2:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now playing: " + listIterator.previous().toString());
                    } else {
                        System.out.println("Start of playlist reached");
                        forward = true;
                    }
                    break;
                case 3:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            System.out.println("Now replaying " + listIterator.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("We are at the start of the list");
                        }
                    } else {
                        if (listIterator.hasNext()) {
                            System.out.println("Now replaying " + listIterator.next().toString());
                            forward = true;
                        } else {
                            System.out.println("We are at the end of the list");
                        }
                    }
                    break;
                case 4:
                    printList(playlist);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if (playlist.size() > 0) {
                        listIterator.remove();
                        if (listIterator.hasNext()) {
                            System.out.println("Now playing " + listIterator.next());
                        } else if (listIterator.hasPrevious()) {
                            System.out.println("Now playing " + listIterator.previous());
                        }
                    }
                    break;
            }
        }
    }

    private static void printList(LinkedList<Song> playlist) {
        Iterator<Song> iterator = playlist.iterator();
        System.out.println("==================");
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
        System.out.println("==================");
    }

    private static void printMenu() {
        System.out.println("Available actions\npress\n" +
                "0 - quit\n" +
                "1 - play next\n" +
                "2 - play previous\n" +
                "3 - replay song\n" +
                "4 - List songs\n" +
                "5 - menu\n" +
                "6 - delete current song from playlist");
    }


}

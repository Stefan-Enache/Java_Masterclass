package com.pluralsight.calcengine.recap;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<>();

    public static void main(String[] args) {

        Album stormbringerAlbum = new Album("Stormbringer", "Deep Purple");
        stormbringerAlbum.addSong("Stormbringer", 4.6);
        stormbringerAlbum.addSong("love don't mean a thing", 4.22);
        stormbringerAlbum.addSong("Holy man", 4.22);
        stormbringerAlbum.addSong("Hold on", 4.3);
        stormbringerAlbum.addSong("You can do it", 3.4);
        stormbringerAlbum.addSong("High ball shooter", 3.6);
        stormbringerAlbum.addSong("The Gypsy", 2.7);
        stormbringerAlbum.addSong("Soldier of fortune", 4.8);

        albums.add(stormbringerAlbum);

        Album album = new Album("For those about ot rock", "AC/DC");
        album.addSong("For those about ot rock", 4.6);
        album.addSong("I put my finger on you", 4.22);
        album.addSong("let's go", 4.22);
        album.addSong("Venom", 4.3);
        album.addSong("C O D", 3.4);
        album.addSong("breaking the rule", 3.6);
        albums.add(album);

        LinkedList<com.pluralsight.calcengine.recap.Song> playlist = new LinkedList<>();
        albums.get(0).addToPlaylist("You can do it", playlist);
        albums.get(0).addToPlaylist("Holy man", playlist);
        albums.get(0).addToPlaylist("Ysssfaa", playlist); // does not exist
        albums.get(0).addToPlaylist(8, playlist);
        albums.get(1).addToPlaylist(6, playlist);
        albums.get(1).addToPlaylist(3, playlist);
        albums.get(1).addToPlaylist(4, playlist);
        albums.get(1).addToPlaylist(24, playlist); // does not exist

        play(playlist);
    }

    private static void play(LinkedList<com.pluralsight.calcengine.recap.Song> playlist) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<com.pluralsight.calcengine.recap.Song> listIterator = playlist.listIterator();
        if (playlist.size() == 0) {
            System.out.println("No songs in playlist");
//            return;
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
                        System.out.println("Now playing " + listIterator.next().toString());
                    } else {
                        System.out.println("reached the end");
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
                        System.out.println("Now playing " + listIterator.previous().toString());
                    } else {
                        System.out.println("reached the start");
                        forward = true;
                    }
                    break;
                case 3:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            System.out.println("Now replaying " + listIterator.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("We are at the start");
                        }

                    } else {
                        if (listIterator.hasNext()) {
                            System.out.println("Now replaying " + listIterator.next().toString());
                            forward = true;
                        } else {
                            System.out.println("We are at the end");
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
                    } else {
                        System.out.println("all songs removed");
                    }
                    break;
            }
        }
    }

    private static void printList(LinkedList<Song> playlist) {
        Iterator<com.pluralsight.calcengine.recap.Song> iterator = playlist.iterator();
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

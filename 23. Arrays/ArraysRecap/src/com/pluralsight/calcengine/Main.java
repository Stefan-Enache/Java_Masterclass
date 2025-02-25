package com.pluralsight.calcengine;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<Album>();


    public static void main(String[] args) {
        Album album = new Album("Stormbringer", "Deep purple");
        album.addSong("stormbringer", 4.6);
        album.addSong("aaa", 2.6);
        album.addSong("bbb", 3.6);
        album.addSong("ccc", 4.4);
        album.addSong("ddd", 5.6);
        album.addSong("eee", 2.6);

        albums.add(album);

        Album album2 = new Album("ftatr", "ac/dc");
        album2.addSong("zzz", 3.67);
        album2.addSong("yy", 5.2);
        album2.addSong("xxx", 3.4);
        album2.addSong("tt", 2.67);

        albums.add(album2);

        LinkedList<Song> playlist = new LinkedList<Song>();
        albums.get(0).addToPlaylist("stormbringer", playlist);
        albums.get(0).addToPlaylist("aaa", playlist);
        albums.get(0).addToPlaylist("speaking", playlist); //n
        albums.get(0).addToPlaylist(3, playlist);
        albums.get(1).addToPlaylist(1, playlist);
        albums.get(1).addToPlaylist(2, playlist);
        albums.get(1).addToPlaylist(3, playlist);
        albums.get(1).addToPlaylist(10, playlist); //n

        play(playlist);


    }

    private static void play(LinkedList<Song> playlist) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;

        ListIterator<Song> listIterator = playlist.listIterator();
        if (playlist.size() == 0) {
            System.out.println("no songs");
        } else {
            System.out.println("Playing " + listIterator.next().toString());
        }

        while (!quit) {
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    System.out.println("Quitting");
                    quit = true;
                    break;
                case 1:
                    //forward
                    if (!forward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Playing " + listIterator.next().toString());
                    } else {
                        System.out.println("reached end of playlist");
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
                        System.out.println("Playing " + listIterator.previous().toString());
                    } else {
                        System.out.println("reached start of playlist");
                        forward = true;
                    }
                    break;
                case 3:
                    //replay
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            System.out.println("Playing " + listIterator.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("reached start of playlist");
                        }
                    } else {
                        if (listIterator.hasNext()) {
                            System.out.println("Playing " + listIterator.next().toString());
                            forward = true;
                        } else {
                            System.out.println("reached end of playlist");

                        }
                    }
                    break;
                case 4:
                    printList(playlist);
                    break;
                case 6:
                    //remove
                    if (playlist.size() > 0) {
                        listIterator.remove();
                        if (listIterator.hasNext()) {
                            System.out.println("Playing " + listIterator.next().toString());
                        } else if (listIterator.hasPrevious()) {
                            System.out.println("Playing " + listIterator.previous().toString());
                        }
                    }
                    break;
            }
        }
    }

    private static void printList(LinkedList<Song> playlist) {
        Iterator<Song> iterator = playlist.iterator();
        System.out.println("=========");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("=========");
    }

}

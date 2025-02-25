package com.pluralsight.calcengine.recap;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public static class SongList {
        private ArrayList<Song> songs;

        public SongList() {
            this.songs = new ArrayList<>();
        }

        private boolean add(Song song) {
            if (songs.contains(song)) {
                return false;
            }

            this.songs.add(song);
            return true;
        }

        private Song findSong(String title) {
            for (int i = 0; i < songs.size(); i++) {
                if (title.equals(songs.get(i).getTitle())) {
                    return songs.get(i);
                }
            }
            return null;
        }

        private Song findSong(int trackNumber) {
            for (int i = 0; i < songs.size(); i++) {
                if (i == (trackNumber - 1)) {
                    return songs.get(i);
                }
            }
            return null;
        }
    }


    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }


    public boolean addSong(String title, double duration) {
        if (findSong(title) == null) {
            this.songs.add(new Song(title, duration));
            return true;
        }
        return false;
    }

    private Song findSong(String title) {
        for (int i = 0; i < this.songs.size(); i++) {
            Song searchedSong = this.songs.get(i);
            if (searchedSong.getTitle() == title) {
                return searchedSong;
            }
        }
        return null;
    }

    private Song findSong(int trackNumber) {
        for (int i = 0; i < this.songs.size(); i++) {
            Song searchedSong = this.songs.get(i);
            if (i == trackNumber) {
                return searchedSong;
            }
        }
        return null;
    }


    public boolean addToPlaylist(int trackNumber, LinkedList<Song> playList) {
        int index = trackNumber - 1;
        if ((index >= 0) && (index <= this.songs.size())) {
            playList.add(this.songs.get(index));
            return true;
        }
        return false;


//        Song song = findSong(index);
//        if(song != null){
//             playList.add(song);
//            return true;
//        }
//        return false;
    }

    public boolean addToPlaylist(String title, LinkedList<Song> playList) {
        Song songToAdd = findSong(title);
        if (songToAdd == null) {
            return false;
        }
        playList.add(songToAdd);
        return true;
    }


}

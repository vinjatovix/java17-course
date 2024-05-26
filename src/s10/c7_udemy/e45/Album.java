package s10.c7_udemy.e45;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
	private String name;
	private String artist;
	private ArrayList<Song> songs;

	public Album(String name, String artist) {
		this.name = name;
		this.artist = artist;
		this.songs = new ArrayList<Song>();
	}

	public boolean addSong(String title, double duration) {
		Song existingSong = findSong(title);
		if (existingSong != null) {
			return false;
		}
		this.songs.add(new Song(title, duration));
		return true;
	}

	private Song findSong(String title) {
		for (Song song : this.songs) {
			if (song.getTitle().equals(title)) {
				return song;
			}
		}
		return null;
	}

	public boolean addToPlayList(String title, LinkedList<Song> playlist) {
		Song existingSong = findSong(title);
		if (existingSong != null) {
			playlist.add(existingSong);
			return true;
		}
		return false;

	}

	public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist) {
		int index = trackNumber - 1;
		if (index < 0 || index >= this.songs.size()) {
			return false;
		}

		Song existingSong = this.songs.get(index);
		if (existingSong != null) {
			playlist.add(existingSong);
			return true;
		}
		return false;
	}
}


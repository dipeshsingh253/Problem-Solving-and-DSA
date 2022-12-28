package oops;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class SongChartList {
    class song {
        // complete the class as mentioned in the problem statement above

        static String name;
        int duration;

        int popularity;

        public song(String name, int duration, int popularity) {
            song.name = name;
            this.duration = duration;
            this.popularity = popularity;
        }
    }

    class chartlist {
        // complete the class as mentioned in the problem statement above

        int n;

        song[] arr;

        public chartlist(int n, song[] arr) {
            this.n = n;
            this.arr = arr;
        }

        String[] top_five() {

            String[] res = new String[5];

            song[] sorted = Arrays.copyOf(arr, arr.length);

            Arrays.sort(sorted, new Comparator<song>() {
                @Override
                public int compare(song s1, song s2) {

//                    return s1.popularity > s2.popularity ? 1 : s1.popularity < s2.popularity ? -1 : 0;

                    return Integer.compare(s1.popularity, s2.popularity); // this works same as above statement
                }
            });

            for (int i = 0; i < 5; i++) {
                res[i] = song.name;
            }

            return res;
        }


        String leastPopular() {

            song leastPopularSong = Collections.min(Arrays.asList(arr), new Comparator<song>() {
                @Override
                public int compare(song s1, song s2) {
                    return Integer.compare(s1.popularity, s2.popularity);
                }
            });

            return song.name;


//            song leastPopularSong = Arrays.stream(arr)
//                    .min(Comparator.comparingInt(s -> s.popularity))
//                    .orElse(null);
//
//            return song.name;
        }

        String mostPopular() {

            song mostPopularSong = Collections.max(Arrays.asList(arr), new Comparator<song>() {
                @Override
                public int compare(song s1, song s2) {
                    return Integer.compare(s1.popularity, s2.popularity);
                }
            });

            return song.name;


//            song mostPopularSong = Arrays.stream(arr)
//                    .max(Comparator.comparingInt(s -> s.popularity))
//                    .orElse(null);
//
//            return song.name;
        }

        String longestSong() {

            song longestSong = Collections.max(Arrays.asList(arr), new Comparator<song>() {
                @Override
                public int compare(song s1, song s2) {
                    return Integer.compare(s1.duration, s2.duration);
                }
            });

            return song.name;


//            song longestSong = Arrays.stream(arr)
//                    .max(Comparator.comparingInt(s -> s.duration))
//                    .orElse(null);
//
//            return song.name;
        }

        String shortestSong() {

            song shortestSong = Collections.min(Arrays.asList(arr), new Comparator<song>() {
                @Override
                public int compare(song s1, song s2) {
                    return Integer.compare(s1.popularity, s2.popularity);
                }
            });

            return song.name;

//
//            song shortestSong = Arrays.stream(arr)
//                    .min(Comparator.comparingInt(s -> s.popularity))
//                    .orElse(null);
//
//            return song.name;
        }

    }


}

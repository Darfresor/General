package SecondChapter;

public class MovieTestDrive {
    public static void main(String[] args) {
        Movie one  = new Movie();
        one.tititle="Как прогореть на акциях";
        one.genre="Трагедия";
        one.rating=-2;

        Movie two  = new Movie();
        two.tititle="Потерянные в офисе";
        two.genre="Комедия";
        two.rating=5;
        two.playIt();

        Movie three  = new Movie();
        three.tititle="Байт-клуб";
        three.genre="Трагедия, но в целом веселая";
        three.rating=127;
    }
}

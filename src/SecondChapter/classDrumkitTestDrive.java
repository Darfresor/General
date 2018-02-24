package SecondChapter;

public class classDrumkitTestDrive {
    public static void main(String[] args) {
        DrumKit d= new DrumKit();

        d.playSnape();
        d.snare= false;
        if (d.snare==true){
            d.playSnape();
        }

        d.playTopHat();

    }
}

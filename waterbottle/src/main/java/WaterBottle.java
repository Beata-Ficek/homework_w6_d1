//Water Bottle
//        Create a water bottle class with a volume property.
//        The volume should start at 100.
//        Add a drink function that takes 10 from the volume each time it is called.
//        Create an empty function that brings the volume down to 0.
//        Create a fill function that fills the volume back to 100.


public class WaterBottle {
    private int volume;

        public int getVolume (){
            return this.volume;
        }

        public void setVolume(){
            this.volume = volume;
        }

        public int drink(int volume, int value) {
            int volume  =- value;
            return volume;
        }

        public int empty(int volume, int value) {
            int volume = 0;
            return volume;
        }


}

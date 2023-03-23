public class ClassDetails{
    private String name;
    private String roomNumber;

    public class TimeTable {
        private final int HOURS = 9;
        private final int DAYS = 5;

        private ClassDetails[][] grid;

        public TimeTable() {
            grid = new ClassDetails[HOURS][DAYS];
        }

        public void set(int hour, int day, ClassDetails details) {

        }

        public void display() {

        }

        public ClassDetails get(int hour, int day){
            return null;
        }

        public int getNumberOfClassesFor(String name){
            return 0;
        }

        public int getNumberOfFreeSlots(){
            return 0;
        }

    }

}


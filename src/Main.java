public class Main {
    public static void main(String[] args) {
        Hotel hilton = new Hotel(20);
        System.out.println(hilton.getRooms());
        hilton.setRooms(6);
        System.out.println(hilton.getRooms());
        hilton.setRooms(30);
        System.out.println(hilton.getRooms());
    }

    public static class Hotel {
        int rooms;
        Hotel(int rooms) {
            this.rooms = rooms;
        }
        // getter
        int getRooms() {
            return rooms;
        }
        //setter
        void setRooms(int rooms) {
            if (rooms < this.rooms) {
                this.rooms -= rooms;
            } else {
                System.out.println("Sorry, we don't have so many rooms");
            }
        }
    }
}

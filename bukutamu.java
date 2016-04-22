package latihan5;
public class bukutamu {
    private final String nama, asal;
    private static int noID = 15500;
    public static final int jumlah = 2;
    public bukutamu(String nama, String asal) {
        this.nama = nama;
        this.asal = asal;
        noID++;
    }
    public String getNama(){
        return nama;
    }
    public String getAsal(){
        return asal;
    }
    public static int getnoID() {
        return noID;
    }
    public void showMessages() {
        System.out.println("No ID anda:" + getnoID());
    }
    public void showMessage(){
        System.out.println("=====Data Para Tamu====");
        System.out.println("Nama: " + getNama());
        System.out.println("Asal: " + getAsal());
        System.out.println("No ID: " +noID++);
    }
}
//make class for create user
public class CreateUser {

    public static void main(String[] args) {
        int umur = 10;
        double gravitasi = 9.8;
        String nama = "Peter Parker";
        Boolean bukan_dosen = false;
        String[] User = new String[]{"Ant Man", "Captain America", "Spiderman"};

        System.out.println("umur: " + umur);
        System.out.println("gravitasi: " + gravitasi);

        System.out.println(nama instanceof String);
        System.out.println("nama: " + nama);

        System.out.println(superhero instanceof String[]);
        System.out.println("User 1: " + User[0]);
        System.out.println("User 2: " + User[1]);
        System.out.println("User 3: " + User[2]);
        
    }

}

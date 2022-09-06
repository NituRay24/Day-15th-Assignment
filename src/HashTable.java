import java.util.Hashtable;
import java.util.HashMap;
public class HashTable {
    Hashtable<String, Integer> friendsTable = new Hashtable<>();

    public void defineHashTable() {
// insert values into the hashtable
        friendsTable.put("Nitu", 25);
        friendsTable.put("Archana",26 );
        friendsTable.put("Kritika", 27);
        System.out.println(friendsTable);
    }

    // update values into the hashtable
    public void updateHashTable() {
        defineHashTable();
        friendsTable.put("Nitu", 25);
        System.out.println(friendsTable);
    }

    // To remove a value
    public void removeAnElement() {
        updateHashTable();
        friendsTable.remove("Nitu");
        System.out.println(friendsTable);
    }

    public static void main(String[] args) {
        HashTable htd = new HashTable();
        htd.defineHashTable();
        htd.updateHashTable();

    }
}

import java.util.*;
class Hashmap{
    public static void main(String args[]) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Yaman", 10);
        map.put("Yash", 11);

        System.out.println(map.get("Yaman"));
        System.out.println(map.get("Yash"));
    }
}
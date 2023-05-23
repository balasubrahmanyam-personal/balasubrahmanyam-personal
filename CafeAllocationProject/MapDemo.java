public class MapDemo {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(2,"B");
        map.put(4,"A");
        map.put(6,"C");
        map.put(8,"D");
        map.put(10,"E");

        Map.Entry<Integer,String> entry = map.entrySet();
        for(Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.println(entry.getKey()+"===="+entry.getValue());
        }
    }
}

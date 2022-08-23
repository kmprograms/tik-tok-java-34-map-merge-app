import java.util.HashMap;

public class App {
    public static void main(String[] args) {

        // Wstawiamy do mapy parę klucz-wartość.
        // Jeżeli klucza nie było w mapie, wstawiamy go z nową wartością.
        // Jeżeli klucz był w mapie, dodajemy do wartości pod tym kluczem nową wartość.

        var m = new HashMap<String, Integer>();
        m.put("A", 20);

        var key = "A";
        var value = 10;

        /*if (m.containsKey(key)) {
            m.put(key, m.get(key) + value);
        } else {
            m.put(key, value);
        }
        System.out.println(m);*/

        /*m.put(key, m.containsKey(key) ? m.get(key) + value : value);
        System.out.println(m);*/

        /*m.compute(key, (k, v) -> v == null ? value : v + value);
        System.out.println(m);*/

        m.merge(key, value, (oldValue, newValue) -> oldValue + newValue);
        System.out.println(m);


    }
}

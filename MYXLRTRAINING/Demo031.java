import java.util.*;
class HashSetDemo1 {
    void demonstrateHashSet() {
        HashSet<Object> hashSet = new HashSet<>();
        hashSet.add(100);           
        hashSet.add("PRASUNAMBA");   
        hashSet.add(9999.99);        
        System.out.println("HashSet contents: " + hashSet);
        for (Object x : hashSet) {
            System.out.println(x);   
        }
    }
}
public class Demo031 {
    public static void main(String[] args){
        HashSetDemo1 obj = new HashSetDemo1();
        obj.demonstrateHashSet();
    }
}

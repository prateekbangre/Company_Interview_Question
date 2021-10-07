package company_interview_questions;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

/**
 * @author prateek.bangre on 20/09/21.
 * @Project DataStructure_Algorithms
 */
/*
implement LRUCache
0 1 2 3
2 0 1 3
*/
interface LRUCache{
    int get(int key);
    void put(int key);
    void display();
}

public class Inviz_Question_LRU implements LRUCache{

    Set<Integer> cache;
    int capacity;

    Inviz_Question_LRU(int capacity){
        this.cache = new LinkedHashSet<>();
        this.capacity = capacity;
    }

    @Override
    public int get(int key) {

        if (cache.isEmpty()|| !cache.contains(key) ){
            return 0;
        }

        cache.remove(key);
        cache.add(key);
        return key;
    }



    @Override
    public void put(int key) {
        if (capacity == cache.size()){
            int tempKey = cache.iterator().next();
            cache.remove(tempKey);
        }
        cache.add(key);
    }

    @Override
    public void display() {
        LinkedList<Integer> list = new LinkedList<>(cache);

        Iterator<Integer> iterator = list.descendingIterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + "  ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Inviz_Question_LRU test = new Inviz_Question_LRU(4);
        test.put(1);
        test.put(2);
        test.put(3);
        test.put(4);
        test.display();

        test.put(9);
        test.display();

        test.get(2);
        test.display();
    }

}

package company_interview_questions;

import java.util.*;
/**
 * @author prateek.bangre on 01/12/21.
 * @Project Company_Interview_Question
 */
/**
 Design a Least Frequently Used (LFU) cache. Has a fixed size of N elements. When full and adding a new element, evict the least frequently used element.
 Two methods:
 1. get(key) -> returns the value
 2. put(key, value)

 Both methods count as one access.
 */
public class VMWare_Question1 {
    int capacity = 10;
    HashMap<Integer, Integer> values;
    HashMap<Integer, Integer> counts;
    HashMap<Integer, LinkedHashSet<Integer>> lists;
    int min = -1;


    VMWare_Question1(int cap){
        capacity = cap;
        values = new HashMap<>();
        counts = new HashMap<>();
        lists  = new HashMap<>();
        lists.put(1, new LinkedHashSet<>());
    }

    private int get(int key){

        if(!values.containsKey(key)){
            return -1;
        }

        int count = counts.get(key);
        counts.put(key, count+1);
        lists.get(count).remove(key);

        if(min == count && lists.get(count).size() == 0){
            min++;
        }

        if(!lists.containsKey(count+1)){
            lists.put(count+1, new LinkedHashSet<>());
        }

        lists.get(count+1).add(key);
        return values.get(key);
    }

    private void put(int key, int value){

        if(values.containsKey(key)){
            values.put(key, value);
            get(key);
            return;
        }

        if(values.size() >= capacity){
            int evict = lists.get(min).iterator().next();
            lists.get(min).remove(evict);
            values.remove(evict);
            counts.remove(evict);
        }

        values.put(key, value);
        counts.put(key, 1);
        lists.get(1).add(key);
        min = 1;
    }



    public static void main(String[] args) {

        VMWare_Question1 lfu = new VMWare_Question1(5);
        lfu.put(1, 10);
        lfu.put(2, 20);
        lfu.put(3, 30);

        int val = lfu.get(1);
    }
}


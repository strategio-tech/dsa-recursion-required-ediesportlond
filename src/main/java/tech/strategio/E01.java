package tech.strategio;

import java.util.*;

public class E01 {

    private HashMap<Integer, Integer> results = new HashMap<>();

    public E01(){
        results.put(1, 0);
        results.put(2, 1);
    }

    public int getNthFib(int n) {

        if(results.containsKey(n)){
            return results.get(n);
        }

        return getNthFib(n-1) + getNthFib( n-2);
    }
}

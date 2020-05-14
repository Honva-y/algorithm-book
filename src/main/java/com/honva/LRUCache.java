package com.honva;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Description LRU缓存，最少使用淘汰
 *
 * @Author honva
 * @Date 2020/5/11
 **/
public class LRUCache extends LinkedHashMap<Integer,Integer> {
    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(2);
        lruCache.put(1,1);
        lruCache.put(2,2);
        System.out.println(lruCache.get(1));
        lruCache.put(3,3);
        System.out.println(lruCache.get(2));
    }

    int capacity;

    public LRUCache(int initialCapacity) {
        super(initialCapacity, 0.75F, true);
        capacity = initialCapacity;
    }
    public int get(Integer key){
        return super.getOrDefault(key,-1);
    }
    public void put(int key,int value){
        super.put(key,value);
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
        return size()>capacity;
    }
}

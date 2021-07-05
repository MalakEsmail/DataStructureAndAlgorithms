/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HashTable;

/**
 *
 * @author malak
 */
public class Entry {

    int key;
    Object value;
    Entry next;

    public Entry(int key, Object value) {
        this.key = key;
        this.value = value;
        next = null;
    }

    public Entry() {
        next = null;
    }

    public int getKey() {
        return key;
    }

    public Object getValue() {
        return value;
    }
    
}

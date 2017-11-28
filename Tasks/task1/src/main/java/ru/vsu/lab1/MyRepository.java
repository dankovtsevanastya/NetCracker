package ru.vsu.lab1;

/**
 * Created by 1 on 23.11.2017.
 */
public class MyRepository {
    int count = 0;
    Person[] arr = null;

    

    public MyRepository(int startLen) {
        arr = new Person[startLen];
    }

    public int count() {
        return count;
    }

    public boolean empty() {
        return count == 0;
    }

    public void put(Person p) {
        if (count == arr.length) {
            System.arraycopy(arr, 0, arr.length - 1, 0, 2 * arr.length);
        } else {
            arr[count] = p;
            count++;
        }
    }

    public int findById() {
        return -1;
    }


    public void remove(Person p) {

    }

    public void clear() {
        for (int i = 0; i < count; i++) {
            arr[i] = null;
        }
        count = 0;
    }

}

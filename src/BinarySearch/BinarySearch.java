package BinarySearch;

import java.util.ArrayList;
import java.util.Collections;

public class BinarySearch {
    private ArrayList<Integer> data = new ArrayList<>();
    public BinarySearch(ArrayList<Integer> data) {
        this.data = data;
    }

    private void bubbleSort() {
        while(true) {
            boolean swapped = false;
            for (int i = 0; i < this.data.size() - 1; i++) {
                if (this.data.get(i) > this.data.get(i + 1)) {
                    Integer temp = this.data.get(i);
                    this.data.set(i, this.data.get(i + 1));
                    this.data.set(i + 1, temp);
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    private void sort() {
        Collections.sort(this.data);
    }
    
    public void binarySearch(Integer num) {
        this.bubbleSort();
        boolean found = false;
        int left = 0;
        int right = this.data.size() - 1;
        int step = 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (this.data.get(mid).equals(num)) {
                System.out.println("index: " + mid + " step: " + step);
                found = true;
                break;
            }
            if (this.data.get(mid) < num) {
                left = mid + 1;
            } 
            else {
                right = mid - 1;
            }
            step++;
        }
        System.out.println(!found ? "Not found" : "");
    }

    @Override
    public String toString() {
        return this.data.toString();
    }
}

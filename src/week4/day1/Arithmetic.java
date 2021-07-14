package week4.day1;

import java.util.Arrays;

public class Arithmetic {
    int[] array;
    boolean sorted;

    public Arithmetic() {
    }

    public Arithmetic(int[] array) {
        this.array = array;
    }

    public int binarySearch(int[] arr, int key, int left, int right) {
        if (!sorted) {
            bubbleSort(arr);
        }
        if (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] < key) {
                return binarySearch(arr, key, mid + 1, right);
            }
            if (arr[mid] > key) {
                return binarySearch(arr, key, left, mid - 1);
            }
        }
        return -1;
    }

    public int max(int[] arr) {
        if (sorted) {
            return arr[arr.length - 1];
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public int min(int[] arr) {
        if (sorted) {
            return arr[0];
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public double avg(int[] arr) {
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        return (double) sum / arr.length;
    }

    public boolean checkArithmeticProgression(int[] arr) {
        int difference = arr[1] - arr[0];
        for (int i = 1; i < arr.length - 1; i++) {
            if (difference != arr[i + 1] - arr[i]) {
                return false;
            }
        }
        return true;
    }

    public void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j + 1] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        sorted = true;
    }

    public int partition(int[] arr, int left, int right) {
        int pivot = arr[right];
        int index = left - 1;

        for (int i = left; i < right; i++) {
            if (arr[i] < pivot) {
                index++;
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
            }
        }
        int temp = arr[index + 1];
        arr[index + 1] = arr[right];
        arr[right] = temp;

        return index + 1;

    }

    public void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int p = partition(arr, left, right);
            quickSort(arr, left, right - 1);
            quickSort(arr, left + 1, right);
        }
        sorted = true;
    }

    public void option() {
        System.out.println("press 1->bubble sort");
        System.out.println("press 2->quick sort");
        System.out.println("press 3->binary search");
        System.out.println("press 4->min");
        System.out.println("press 5->max");
        System.out.println("press 6->avg");
        System.out.println("press 7->check arithmetic progression");
        System.out.println("press 0->exit");
        Menu menu = new Menu();
        int choice = menu.scanner.nextInt();
        while (choice != 0) {
            switch (choice) {
                case 1: {
                    bubbleSort(array);
                    System.out.println(Arrays.toString(array));
                    break;
                }
                case 2: {
                    quickSort(array, 0, array.length - 1);
                    System.out.println(Arrays.toString(array));
                    break;
                }
                case 3: {
                    System.out.println("please enter the key");
                    int key = menu.scanner.nextInt();
                    System.out.println(binarySearch(array, key, 0, array.length - 1));
                    break;
                }
                case 4: {
                    System.out.println(min(array));
                    break;
                }
                case 5: {
                    System.out.println(max(array));
                    break;
                }
                case 6: {
                    System.out.println(avg(array));
                    break;
                }
                case 7: {
                    if (checkArithmeticProgression(array)) {
                        System.out.println("arithmetic progression");
                    } else {
                        System.out.println("not arithmetic progression");
                    }
                    break;
                }
            }
            choice = menu.scanner.nextInt();
        }
    }
}

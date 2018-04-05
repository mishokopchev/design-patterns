package com.company;

import java.util.*;

public class Main {

    public static void quickSort(int[] array, int low, int high) {
        if (high > low) {
            int p = partition(array, low, high);
            quickSort(array, low, p - 1);
            quickSort(array, p + 1, high);
        }

    }

    // 1 1 1 2 2 2  3 3 3 4 7 7 10 12 14

    public static int[] shrink(int[] array) {
        int[] shrinked = new int[array.length];
        int i = 0;
        shrinked[i] = array[i];
        for (int index = 1; index < array.length; index++) {
            if (array[index] != shrinked[i]) {
                ++i;
                shrinked[i] = array[index];
            }
        }
        ArrayList list;
        return shrinked;
    }

    public static int partition(int[] array, int low, int high) {

        int pivot = array[high];

        int index;
        int pivotIndex = low;

        for (index = low; index < high; index++) {
            if (array[index] <= pivot) {
                swap(array, index, pivotIndex);
                pivotIndex++;
            }
        }
        swap(array, pivotIndex, high);
        return pivotIndex;


    }

    public static void swap(int[] array, int index, int index1) {

    }


    public static void main(String[] args) {
//RRRR

//        String a = "misho";
//        String a1 = new String("misho").intern();
//        System.out.println(a == a1);


        int[] array = {1,1,1,1,2,2,2,3,3,3,4,5,6,7,8};
        System.out.println(Arrays.toString(shrink(array)));

//        int[] array = {1, 23, 4, 5, 2, 2, 2, 1, 3, 4};
//        quickSort(array, 0, array.length - 1);
        //System.out.println(Arrays.toString(array));


//        String b = "dsadsa";
//        String a = new String("dsadsa").intern();
//
//        System.out.println("Equal");
//        System.out.println(a == b);
//        System.out.println(replace("mosho", 'o', 'g'));
//
//        System.out.println(findPerm("ABC"));
//
        // substring
//
//        final String a = "Mihail Kopchev";
//        System.out.println(a.substring(1, 2));
//
//        String start = "start";
//
//
//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println(start);
//            }
//        };
//
//        Runnable runnable1 = () -> System.out.println(start);

//
//        Model model = new Model("aaaa", 1);
//        Model model1 = new Model("bbbb", 1);
//
//        HashSet<String> strings = new HashSet<>();
//        strings.add("putkite");
//
//        HashSet<Model> hashSet = new HashSet<>();
//        hashSet.add(model);
//        hashSet.add(model1);
//
//        model.name = "nov string";
//        hashSet.add(model);
//
//        for (Model m : hashSet) {
//            System.out.println(m);
//        }
//
//
//        HashMap<Model, String> hashMap = new HashMap<>();
//        hashMap.put(model, "abc");
//        hashMap.put(model1, "abc");
//
//        model.name = "cccc";
//        hashMap.put(model, "eqw");
//
//        for (Model key : hashMap.keySet()) {
//            System.out.println(key + " " + hashMap.get(key));
//        }
//
//        List<String> list = new ArrayList<>();
//        ListIterator<String> iterator = list.listIterator();
//        Iterator<String> iterator1 = (ListIterator)iterator();
//        ListIterator iterator2 = (ListIterator) iterator();
//        iterator2.add(null);


        /*List<String> misho = new ArrayList<>();
        misho.add("w");
        misho.add("ewqeqw");
        Iterator<String> iterator = misho.iterator() ;

        for (String s:misho
             ) {
            System.out.println(s);
            misho.add(s);
        }
*/

    }

    public static Iterator iterator() {

        return new ListIterator() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Object next() {
                return null;
            }

            @Override
            public boolean hasPrevious() {
                return false;
            }

            @Override
            public Object previous() {
                return null;
            }

            @Override
            public int nextIndex() {
                return 0;
            }

            @Override
            public int previousIndex() {
                return 0;
            }

            @Override
            public void remove() {

            }

            @Override
            public void set(Object o) {

            }

            @Override
            public void add(Object o) {

            }
        };
//        return new Iterator() {
//            @Override
//            public boolean hasNext() {
//                return false;
//            }
//
//            @Override
//            public Object next() {
//                return null;
//            }
//        };
//

    }

    public static boolean isPalindrome(final String palindrome) {
        if (palindrome == null) {
            return false;
        }

        for (int index = 0; index < palindrome.length() / 2; index++) {
            if (palindrome.charAt(index) != palindrome.length() - index - 1) {
                return false;
            }

        }
        return true;
    }

    public static String replace(String str, char oldSymbol, char newSymbol) {
        if (oldSymbol != newSymbol) {
            int len = str.length();
            char[] buf = new char[len];
            int index = -1;

            while (++index < len) {
                if (str.charAt(index) == oldSymbol) break;
            }

            if (index < len) {
                for (int j = 0; j < index; j++) {
                    buf[j] = str.charAt(j);
                }

                for (int i = index; i < len; i++) {
                    char serialChar = str.charAt(i);
                    buf[i] = serialChar == oldSymbol ? newSymbol : serialChar;
                }
                return new String(buf);
            }

        }

        return str;
    }

    public static Set<String> findPerm(String str) {
        Set<String> permSet = new HashSet<>();
        if (str == null) {
            return null;
        }
        if (str.length() == 0) {
            permSet.add("");
            return permSet;
        }

        char initial = str.charAt(0);
        String rem = str.substring(1);
        Set<String> words = findPerm(rem);

        for (String word : words) {
            for (int i = 0; i <= word.length(); i++) {
                permSet.add(initialPerm(word, initial, i));
            }
        }

        return permSet;
    }

    public static String initialPerm(String str, char initial, int index) {
        String begin = str.substring(0, index);
        String end = str.substring(index);
        return begin + initial + end;
    }


}
public class RadixSort {

    public String[] RadixSort(String[] arr) {
        int greatestString = -1;
        String[][] sorted = new String[38][arr.length];
        String[] temparr = arr.clone();

        for (String i : arr) {
            if (i.length() > greatestString)
                greatestString = i.length();
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = arr[i].length(); j < greatestString; j++) {
                arr[i] = arr[i] + " ";
            }
        }

        for (int i = greatestString - 1; i > -1; i--) {
            for (String j : arr) {
                if (j == null) {
                    continue;
                } else {
                    char letter = j.charAt(i);
                    int value = Character.getNumericValue(letter) + 2;
                    int count = 0;
                    while (sorted[value][count] != null) {
                        count++;
                    }
                    sorted[value][count] = j;
                }
            }
            int m = 0;
            for (String[] k : sorted) {
                for (String l : k) {
                    if (l == null) {

                    } else {
                        arr[m] = l;
                        m++;
                    }
                }
            }
            sorted = new String[38][arr.length];
        }

        for (int i = 0; i < arr.length; i++) {
            boolean notFound = true;
            int k = 0;
            while (notFound) {
                if (arr[i].contains(temparr[k])) {
                    arr[i] = temparr[k];
                    notFound = false;
                }
                else {
                    k++;
                }
            }
        }
        return arr;
    }

}

# 배열에서 최소값과 최대값 구하기

+ 배열 index 0 부터 끝까지 비교해가면서 최소값과 최대값 구하는 방법

    ```java
        public int max(int[] arr) {
            int max = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (max < arr[i]) {
                    max = arr[i];
                }

            }
            return max;
        }

        public int min(int[] arr) {
            int min = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (min > arr[i]) {
                    min = arr[i];
                }

            }
            return min;
        }
    ```
    + 

+ 

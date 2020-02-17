
## 배열에 중복없는 난수 집어넣기

+ Math.random()
  + java.lang 안에 (import java.util.Random)으로 들어있기에 별도로 import 하지 않고  Math.random() 메소드를 사용가능하다.

  + Math.random() 의 범위 : 0 <= Math.random() < 1 의 double 형 난수 값 리턴

 + ▶ **int형 배열에 minNum 에서 maxNum 까지 범위의 난수를 중복값 없이 집어넣는 프로그램을 구현 하시오 !)**

    + 1) 배열크기보다 난수범위가 더 작으면
          + 모든 배열원소에 중복없이 값을 전부 집어넣는것이 불가능하기에 false 반환

    + 2) 배열크기와 난수범위가 같거나 큰 경우
          + for문을 이용해서 중복없이 난수를 집어넣고 true 반환.


 + 예시)

      ```java
      import java.util.arrays;
      public static void main(String[] args) {
          final String ERR_STR = "Fail - 난수생성 범위가 배열크기보다 같거나 커야합니다."

          int[] arr = new int[10];
          if(inputRandomNumber(arr, 1, 10)){
            System.out.println(Arrays.toString(arr));
          }else{
            System.out.println(ERR_STR);
          }
      }
      ```

      RESULT : [6, 10, 7, 3, 8, 2, 9, 4, 1, 5]
      (매회마다 달라진다.)

      ```java
      import java.util.arrays;
      public static void main(String[] args) {
          final String ERR_STR = "Fail - 난수생성 범위가 배열크기보다 같거나 커야합니다."

          int[] arr = new int[10];
          if(inputRandomNumber(arr, 2, 8)){
            System.out.println(Arrays.toString(arr));
          }else{
            System.out.println(ERR_STR);
          }
      }
      ```
      RESULT : Fail - 난수생성 범위가 배열크기보다 같거나 커야합니다.

    + ### **inputRandomNumber(arr : int[],minNum : int, maxNum int) : boolean** 메소드 구현

    + **방법 1)**

      ```java
        public boolean inputRandomNumber(int[] arr, int minNum, int maxNum) {

            // 난수 범위가 배열사이즈보다 작을시
            if (arr.length > maxNum - minNum + 1) {
              return false;
            }
            int random = 0;
            int f = 0; // 중복체크를 위한 변수

            // 배열에 minNum 에서 ~ maxNum 까지의 난수를 (중복없이) 집어넣음
            for (int i = 0; i < arr.length; i++) {

              f = 0;
              random = (int) (Math.random() * (maxNum - minNum + 1)) + minNum;

              // 중복 검사
              for (int j = 0; j < i; j++) {
                if (arr[j] == random) {
                  i--; // 중복이 검출되면 i 값을 1감소시켜서 상위 포문을 다시 돌게하고
                  f = 1;
                  break; // 중복검사를 위한 반복문 종료.
                }
              }

              // 중복이 없으면 배열에 집어넣기
              if (f == 0){
                arr[i] = random;
              } 
            }
            return true;
          }

      ```
    + **방법 2)** 
      + 방법 1) 코드에서 불필요한 코드를 제거하여 간략화

      ```java
      public boolean inputRandomNumber(int[] arr, int minNum, int maxNum) {

          // 난수 범위가 배열사이즈보다 작을시
          if (arr.length > maxNum - minNum + 1) 
          return false;

          // 배열에 minNum 에서 ~ maxNum 까지의 난수를 (중복없이) 집어넣음
          for (int i = 0; i < arr.length; i++) {

            arr[i] = (int) (Math.random() * (maxNum - minNum + 1)) + minNum;

            // 중복 검사
            for (int j = 0; j < i; j++) {
              if (arr[j] == arr[i]) {
                i--; // 중복이 검출되면 i 값을 1감소시켜서 상위 포문을 다시 돌게하고
                break; // 중복검사를 위한 반복문 종료.
              }
            }
          }
          return true;
        }
      ```
    + **방법 3)**
  
   

# 1차 및 2차 배열 선언
## 1차원 배열
```JAVA
class ArrayExample {
	public static void main(String[] args) {
        //1차원 배열
        int[] oneDimensionArrayEx1 = {1, 2, 3, 4, 5};
        int[] oneDimensionArrayEx2;
        oneDimensionArrayEx2 = new int[10];
    }
}
```
* 배열의 초기화는 실제 값들을 넣어서 초기화도 가능하고, 배열의 크기를 넣어 초기화도 가능하다.
* 인덱스 (위치)는 0부터 시작. (메모리 주소가 0부터 시작하기 때문에)
* Reference 타입이기 때문에 RunTime Stack 영역에는 주소값을, Heap 영역에는 실제 값들을 저장.

## 2차원 배열
```JAVA
class ArrayExample {
	public static void main(String[] args) {
        //2차원 배열
        int[][] twoDimensionArrayEx1 = {{1, 2}, {3, 4}};
        int[][] twoDimensionArrayEx2;
        twoDimensionArrayEx2 = new int[10][10];
    }
}
```

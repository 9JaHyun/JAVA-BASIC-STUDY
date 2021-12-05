# 참조 타입과 참조 변수
## 참조타입?
* 기본형 타입을 제외한 타입
* 리터럴을 가지고 있는 기본형 타입과 다르게 참조형 타입은 그 데이터에 대한 참조 주소를 가지고 있다.

<img src = "https://github.com/9JaHyun/JAVA-BASIC-STUDY/blob/main/CH5/img/2.png">

# 배열
* `[]`만 붙이면 장땡이다.
* int[] : int 타입이 요소(element)로 들어가는 배열
* short[] : short 타입이 요소로 들어가는 배열
* String[] : String 타입이 요소로 들어가는 배열
* Member[] : Member 타입이 요소로 들어가는 배열
* Car[] : Car 타입이 요소로 들어가는 배열


## 생성 방식
### 크기를 지정
```java
int[] arr1 = new int[5]; // 크기가 5인 int 배열 생성
Member[] arr2 = new Member[10]; // 크기가 10인 Member 배열 생성
```

### 아예 요소를 미리 집어넣는 방식
```java
int[] arr1 = {1, 2, 3, 4, 5};

Member member1 = new Member();
Member member2 = new Member();
Member member3 = new Member();
Member[] arr2 = {member1, member2, member3};
```

## 1차원 배열
* 

## 2차원 배열
* [[1차원배열 주소], [1차원배열 주소], [1차원배열 주소]]
# 열거형 타입(Enum)



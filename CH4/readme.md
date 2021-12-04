# 제어문

## 조건문
* 의사결정을 할 때 쓰이는 statements. 어느 코드 블럭을 실행해야 할 지 선택할때 쓰임.

### If/then
* if문에 들어가는 조건식이 참인 경우 if문 내 블록 코드를 실행.
```java
int a = 5;
if(a < 10){
    System.out.println("a는 10보다 작습니다.");
}
```
* 실행할 코드가 한줄이라면 블록을 안씌워도 된다.

```java
int a = 5;
if(a < 10) System.out.println("a는 10보다 작습니다.");
```

### If/ElseIf
* 만약 조건식이 거짓인 경우 else if문의 조건을 또는 else문의 코드를 실행.
```java
int  a = 5;
if(a > 5) {
	System.out.println("a가 5보다 큰 경우 코드 실행");
}else if(a < 5) {
	System.out.println("a가 5보다 작은 경우 코드 실행");
}else {
	System.out.println("a가 5인경우 코드 실행");
}
```

* 중첩해서 실행도 가능!
```java
int a = 8;
if(a > 5) {
	if(a < 10) {
		System.out.println("a가 5보다 크고 10보다 작으면 코드 실행");
	}else{
		System.out.println("a가 10이상이면 코드 실행");
	}
}
```


## 선택문
### Switch-Case
* 입력값이 정형화된 경우 다중 if문보다는 Switch-Case 문을 사용하는 것이 가독성이나, 성능면으로나 유리하다. (보통 5개부터 차이가 보임)
```java
int month;
switch(month){
	case: 1			// Case는 리터럴 또는 상수여야 한다.
		...
		break;		// case 1 연산만 끝나면 switch문 종료
	case: 2
					// break문이 없기 때문에 case 3까지 계속 진행
	case: 3
		break;
	...
	default:		// 모두 해당되지 않는 경우 default가 실행
}
```
* Switch문의 표현식은 기본형 타입이나, 일부 래퍼 유형일 수 있다.
* 케이스 값은 리터럴 또는 상수여야 한다.
* `break`문을 통해 각 case의 연산이 끝나면 Switch 표현식을 스킵할지, 다음 Case도 실행할지 결정을 할 수 있다.

### Switch문 발전과정

#### JAVA 12
* case 라벨을 쉼표를 사용해 구분할 수 있도록 지원
```java
public static String monthCheck(int num){ 
	int days = switch (num) { 
		case 1, 3, 5, 7, 8, 10, 12 :
			break 31; 
		case 4, 6, 9, 11 :
			break 30; 
		case 2 : 
			break 28;
		default:
			break -1; 
		}; 
	return "입력하신 달은 "+days+"일 입니다."; 
}
```
* 람다식 또한 지원
```java
public static String monthCheck(int num){
	int days = switch (num) {
		case 1, 3, 5, 7, 8, 10, 12 -> 31; 
		case 4, 6, 9, 11 -> 30;
		 case 2 -> 28; 
		 default -> -1; 
	}; 
	return "입력하신 달은 "+days+"일 입니다."; 
}
```
* Oracle 공식문서에서도 colon(:) 보다는 arrow case(->) 방식을 권장.
    * 가독성
    * 의도치 않는 fall through 방지

#### JAVA 13
* JAVA 13부터는 Switch Operator로 탄생되었다.
https://velog.io/@nunddu/Java-Switch-Expression-in-Java-14
```JAVA
switch(expression){
	case expression:
		expression;
		yield expression;
	...
	default:
		expression;
		yield expression;
};

switch(expression){
	case expression -> expression;
	...
	default -> expression
};
```
* 기존에는 branch fall-through가 일어나지 않도록 break를 사용해왔으나 개선된 switch문에서는 yield를 사용한다. 



## 반복문
* 조건이 참인 동안 계속해서 블록을 반복적으로 실행하는데 사용.

### for문
* 변수가 조건식에 만족할 때 해당 실행문을 실행하고, 만족하지 않을 경우 증감식을 통해 변수를 변화
* 반복 횟수가 고정되어 있는 것이 특징.

```java
for(초기화; 조건식; 증감식){
	실행 블록
}
```

* 예시
```java
for (int i = 0; i < 10; i++) {
    System.out.println("i = " + i);
}
```
* 배열
```java
String[] array = {"이것은", "배열", "입니다."};
for (int i = 0; i < array.length; i++) {
    System.out.println(array[i]);
}
```
* 향상된 for문
* 배열을 **순회**해야 하는 경우 사용되는 방식
```java
String[] array = {"이것은", "배열", "입니다."};
for (String str : array) {	// for(int i = 0; i < array.length; i++)와 같다.
    System.out.println(str);
}
```
#### 추가1. 무한루프
* 아무 조건식을 쓰지 않으면 무한루프
```java
for( ; ;){
	System.out.println("무한루프");
}
```


### while문
* 괄호안에 주어진 boolean값의 상태 변화에 따라, 반복문을 제어.
* 괄호안의 조건식이 거짓이 될 때까지 계속 반복문을 실행.
```JAVA
while(표현식) {
	실행 블록
}
```

* 예시1
```JAVA
int i = 0;
int sum = 0;
while(i < 5){
	i++;
	sum += i;
	System.out.printf("%d 번째 반복문 : sum = %d \n", i, sum);
}
```
### do-while문
* while문의 방식을 살짝 수정한 방식
* 특징으로는 조건식이 참이든 아니든 먼저 실행을 함.
```JAVA
boolean condition = false;
do {
    System.out.println("Do는 조건문이 어찌되든 일단 실행");
} while(condition);
```


### break
* 반복을 종료할 수 있는 키워드
* `while`. `for`, `switch문` 모두 사용가능하다.
```java
    public static void main(String[] args) {
        int num = 0;
        while(true){
            num++;
			if(num == 25) break;        // 25가 되면 반복문 종료
            System.out.println(num);
        }
    }
```

### continue
* 반복문을 종료하지는 않고, 반복 한번을 skip하는 키워드
 ```java
    public static void main(String[] args) {
        int num = 0;
        while(num < 30){
            num++;
			if(num == 25) continue;        // 25는 출력하지 않음!
            System.out.println(num);
        }
    }
```
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


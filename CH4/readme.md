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
### (optional) Java 13. switch 연산자
https://velog.io/@nunddu/Java-Switch-Expression-in-Java-14
* 입력값이 정형화되어있는 경우에는, if문보다 switch/case 문을 사용하는 것이 가독성면에서 유리할 수 있다.
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
* branch fall-through가 일어나지 않도록 break; 

* Oracle 공식문서에서도 colon(:) 보다는 arrow case(->) 방식을 권장.
    * 가독성
    * 의도치 않는 fall through 방지


## 반복문


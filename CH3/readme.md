# 연산자
## 연산자와 연산식
* 연산자    : 연산에 사용되는 기호를 말함.
* 피연산자  : 연산의 대상.
```JAVA
int a = 1;
int b = 2;

// 연산자: '+' 피연산자 : a, b
a + b;

// 연산자: '*+*' 피연산자 : a, b
a * b;

// 연산자: '+' 피연산자 : a, 1
int c = a + 1;
```

# 연산자의 종류
## 단항 연산자
* 피연산자가 하나뿐인 연산자
* 부호연산자, 증감 연산자, 논리 부정 연산자가 있다.

### 부호 연산자
* 양수 음수를 표시하는 연산자
* boolean, char 타입을 제외한 모든 기본형 타입에 사용 가능,

### 증감 연산자
* 피연산자를 1 증가시키거나 1 감소시키는 연산자.
* 연산자의 위치에 따라 연산의 순서가 바뀐다.

#### 피연산자 앞에 있는 경우 (전위 증감 연산자)
* 단항연산을 가장 먼저 실시해 메모리상에 값을 업데이트 후 연산 시작
```JAVA
int a = 5;
int b = 7;
int c;

c = ++a;    // 결과: c = 6, a = 6
```

#### 피연산자 뒤에 있는 경우 (후위 증감 연산자)
* 먼저 연산을 실시한 후 가장 마지막에 증감 연산을 실시.
* 구체적으로는 임시 변수를 만들어 해당 값을 복사한 뒤 전달하고, 그 후 증감연산자 실시
```JAVA
int a = 5;
int b = 7;
int c;

c = a++;    // 결과: c = 5, a = 6
```

### 논리 부정 연산자
* 변수 앞에 `!`를 붙여 true -> false, false -> true로 변환



## 이항 연산자
* 피연산자가 2개 존재

### 산술 연산자 ( +, -, *, /, % )
* `+`, `-`, `*`, `/`, `%` 연산자를 사용
* 나눗셈 연산자의 경우 주의가 필요하다.
    * 두 피연산자가 정수인 경우 정수형 나눗셈, 실수인 경우 실수형 나눗셈이 진행.
    * `ArithmeticException`이 발생할 수 있다.
        * Divide by Zero : 0으로 나누는 경우
    * 정수타입끼리 나눗셈을 진행하는 경우 소수가 나오면 버림을 진행한다(반올림 X)
    * 실수형을 0.0으로 나눗셈을 수행하면, Infinity, -Infinity, NaN(숫자가 아님) 값을 가진다.

* Char타입도 산술연산이 가능하다.
    * 유니코드를 가지고 있기 때문에 연산이 가능하다.
    ```JAVA
    System.out.println('c' - 'b'); // 1

    char c = 'c';
    System.out.println((char)(c + 1)); //d
    ```

```JAVA
public class ArithmeticOperator {
	int a = 10;
    int b = 4;

    System.out.printf("%d + %d = %d%n", a, b, a + b);
    System.out.printf("%d - %d = %d%n", a, b, a - b);
    System.out.printf("%d * %d = %d%n", a, b, a * b);
    System.out.printf("%d / %d = %d%n", a, b, a / b);               // 버림으로 인해 결과: 2
    System.out.printf("%d / %f = %f%n", a, (float)b, a / (float)b); //---(2)
}
```

#### 연산 중 타입 승격
* 타입에서도 말했다시피 서로 다른 타입을 연산한다면, 더 큰 범위의 타입으로 Promotion이 발생한다. (값의 변형을 막기위한 최소한의 안전장치)
* 나눗셈을 한다면 더 적은 범위로 변환(Casting)을 고려할 수 있다.
* 연산 전 충분히 큰 자료형을 사용해 오버플로우를 막아야 한다.
```JAVA
public static void main(String[] args) {
    int a = 1_000_000;
    int b = 2_000_000;

    long value = a * b;

    System.out.println(value);  // overflow : -1454759936
```

### 비트 연산자
* 비트를 대상으로 연산을 진행하는 연산자. 
* 피연산자는 반드시 정수여야 한다.

#### 종류
* `&`   : AND
    * 비트들이 모두 1이어야 1

* `|`   : OR
    * 비트들 중 하나라도 1이라면 1

* `^`   : XOR
    * 비트들 중 하나만 1이어야 1

* `~`   : NOT (보수 연산자)
    * 1을 0, 0을 1로 변한

* `>>`  : Right Shift
    * 제공된 수 만큼 오른쪽으로 n칸 이동
    * 이동해서 생긴 빈공간은 양수일 경우 0 음수일 경우 1이 채워짐.

* `<<`  : Left Shift
    * 제공된 수 만큼 왼쪽으로 n칸 이동
        * 이동해서 생긴 빈공간은 양수일 경우 0 음수일 경우 1이 채워짐.

* `>>>` : unsigned right shift
    * 부호를 변환해주는 시프트 여난자.
    * 제공된 수만큼 오른쪽으로 n칸 이동하나, 왼쪽 공간은 0으로 채움. (unsigned)

```JAVA
int a = 3 & 1;  // 0011 & 0001 = 1(0001)
int b = 2 | 1;  // 0010 | 0001 = 3(0011)
int c = 3 ^ 1;  // 0011 ^ 0001 = 2(0010)
int d = b >> 1; // 0011 에서 왼쪽으로 1칸 이동, 1(0001)
int e = b << 1; // 0011 에서 오른쪽으로 1칸 이동, 6(0110)
int f = ~a;     // 0001 -> 1111 1111 1111 1111 1111 1111 1111 1110

int g = -2147483648 >>> 1;
// 1000 0000 0000 0000 0000 0000 0000 0000
// ->
// 0100 0000 0000 0000 0000 0000 0000 0000
```


### 관계 연산자 (<, <=,>,> ==, !=)
* 숫자 유형을 비교하기 위한 연산자.
* 결과는 모두 boolean을 반환한다.

```JAVA
int a = 1;
int b = 2;

boolean result;
result = a < b;     // true
result = a <= b;    // true
result = a > b;     // false
result = a >= b;    // false

result = a == b;    // false
result = a != b;    // true
```
* 만약 타입이 동일하지 않으면, 더 작은 유형의 피연산자가 더 큰 유형으로 승격
    (큰 타입의 피연산자가 작은 타입으로 된다면, 손해를 봄)


### 논리 연산자 (&&, ||, &, |, ^, !)
* 피연산자와 결과 타입 모두 `boolean`이어야 한다.
* &&, & : AND
* ||, | : OR
* ^     : XOR
* !     : NOT
```JAVA
boolean a = false;
boolean b = true;

boolean result;

result = a && b;        // a에서 바로 false
result = a & b;         // a, b 모두 연산하고 false
result = a || b;        // b까지 와서 true (a가 false기 때문)
result = b || a;        // 이처럼 b가 앞에 나온다면 b까지만 연산하고 true 반환
result = a | b;         // a, b 모두 연산하고 true
result = a ^ b;         // true
result = !a;            // true
result = !b;            // false
```
#### &&와 &, ||와 | 차이
* 자바에는 쇼트서킷이라는 기능을 지원한다.
* 가령 AND의 경우 앞의 조건이 false가 나오면 뒤의 조건을 계산하지 않고 false를 반환하는 방식.
* 이는 `&&`, `||`의 경우 쇼트서킷을 지원하고, `&`, `|`에서는 지원하지 않는다.
* 빠른 연산이 필요하면 전자를, 혹시나 두 연산 모두 실시해야 하는 경우라면 후자를 선택하자.

### instanceof
* 객체가 특정 클래스 or 인터페이스 유형인지에 대한 여부를 물어봄.
* 연산의 결과는 `boolean` 타입으로 반화된다.
* 주로 부모 객체의 인스턴스인지 자식 객체인지를 알때 사용

```JAVA
// 객체 instanceof 클래스or인터페이스

class A{}
class B extends A{}

public static void main(String[] args){
    A a = new A();
    B b = new B();

    System.out.println(a instanceof A); // true
    System.out.println(b instanceof A); // true
    System.out.println(a instanceof B); // false
    System.out.println(b instanceof B); // true
}
```

### assignment(=) operator : 대입(할당) 연산자
* 값을 변수에 할당할 때 쓰는 연산자

```JAVA
int num01 = 7;
int num02 = 7;
int num03 = 7;  

num01 = num01 - 5;
num02 -= 5;
num03 =- 5;  

printf("- 연산자에 의한 결괏값은 %d입니다.\n", num01);
printf("-= 연산자에 의한 결괏값은 %d입니다.\n", num02);
printf("=- 연산자에 의한 결괏값은 %d입니다.\n", num03);  
```

#### 주의사항
* 참조타입의 경우 조금 얘기가 달라진다. 주소 값을 할당하기 때문이다!
```JAVA
Member member1 = new Member("member1");
Member member2 = new Member("member2");

member1 = member2
member2.setName("newMember1");
System.out.println(member1.getName());  // newMember1
```
* 이렇게 주소값을 할당하는 경우를 얕은 복사라고 한다.
* `A = B`라고 하면 B를 수정하면 그대로 A 역시 수정된다는 말!
* 이 경우 깊은 복사를 통해 이러한 참사를 막아야 한다.
    * `clone()` 사용을 통한 깊은복사.
    ```JAVA
    Member member1 = new Member("member1");
    Member member2 = new Member("member2");

    member1 = member2.clone();
    member2.setName("newMember1");
    System.out.println(member1.getName());  // member2;
    ```
    * 내부 값들을 그대로 복사. (get, set)


### 3항 연산자
* 유일하게 피연산자를 3개를 가지는 연산자.
* `?` 앞의 조건식이 참이라면 반환값1을, 거짓이라면 반환값2를 반환
`조건식 ? 반환값1 : 반환값2`


### 연산자 우선 순위
[!Operitor_priority](\img\operatorPriority.png)
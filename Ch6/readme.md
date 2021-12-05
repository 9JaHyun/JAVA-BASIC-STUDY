# 클래스
## 객체 지향 프로그래밍
* 모든 데이터를 객체(Object)로 취급해, 각 객체들간의 역할, 책임, 협력을 서술하는 방식으로 프로그래밍.
* 객체지향의 특징
  * 캡슐화
  * 다형성
  * 정보은닉

* 카페에서 손님이 커피를 주문하면, 바리스타는 커피를 만들어서 제공한다.
  * 손님과 바리스타는 협력하는 관계
  * 손님은 바리스타가 누가 되었던 간에 상관하지 않는다. 커피만 받아서 마시면 된다.
    * 다형성의 특징
  * 손님은 커피를 어떻게 만드는지에는 관심이 없다. 정상적으로 만들어지기만 하면 된다.
    * 정보 은닉과 캡슐화

## 클래스란?
* 객체를 만드는 방식 중 하나로 `청사진` 혹은 `프로토타입` 역할과 비슷하다.

## 클래스의 요소
* 필드 : 해당 클래스가 가지고 있는 **상태 정보**
  * 클래스 변수   : `static` 키워드를 사용해 선언 (클래스가 로드될 때 생성)
  * 인스턴스 변수 : 일반적인 선언 (인스턴스가 생성될 때 생성)
* 메서드 : 클래스가 할 수 있는 **행동**
* 생성자 : 인스턴스 변수를 **초기화**하기 위한 메서드
* this 참조변수 : 파라미터와, Instance 변수명이 같은 경우 구분을 위해 사용하는 참조 변수.

* 인스턴스 : 클래스로 부터 만들어낸, 메모리 상에 존재하는 실제 객체
  * 붕어빵 틀 = 클래스  / 붕어빵 = 인스턴스
* new 키워드 : 인스턴스를 만들 때 **생성자**를 호출하기 위해 사용하는 키워드.

```java
public class 붕어빵 {
    private Sauce sauce;
    private int 소스량;
    private String 굽기정도;

    public 붕어빵(Sauce sauce, int amount, String cookStatus){
        this.sauce = sauce;     // 파라미터와, 필드의 이름이 같은 경우 구분을 위해 this 사용
        소스량 = amount;        // 아래부터는 구분이 가능하기 때문에 굳이 this를 사용하지 않는다.
        굽기정도 = cookStatus;
    }
    
    public static void main(String[] args) {
        붕어빵 붕어빵1 = new 붕어빵(Sauce.슈크림, 15, "잘굽혔다");
        붕어빵 붕어빵2 = new 붕어빵(Sauce.슈크림, 20, "덜익었다");
        붕어빵 붕어빵3 = new 붕어빵(Sauce.팥, 15, "잘굽혔다");
        붕어빵 붕어빵4 = new 붕어빵(Sauce.팥, 20, "탔다");
    }

    public void 굽기(){
        System.out.println("잘 굽히고 있습니다.");
    }

    public void 뒤집기(){
        System.out.println("붕어빵을 뒤집습니다.");
    }
}
```


### 필드
* 클래스가 가지고 있는 상태정보를 의미
* 변수에서도 설명했듯이 사용범위와, 수명에 따라 나뉘어진다.
```java
public class ClassField {

    // 인스턴스 필드
    public String field1;
    public String field2;
    public String field3;

    // 정적(클래스, Static) 필드
    public static String staticField1;
    public static String staticField2;

    // 파라미터
    void method1(String parameter){
        System.out.println(parameter);
    }

    public static void main(String[] args) {
        // 인스턴스 필드는 인스턴스를 만들어야 사용할 수 있다.
        String usingField1 = field1; // 사용 불가

        ClassField instance = new ClassField(); // 인스턴스 생성...
        ClassField instance1 = new ClassField(); // 인스턴스 생성...
        String usingField2 = instance.field1;   // 사용 가능!

        // 정적 필드는 클래스 로드 시점에 메모리에 올라가기 때문에 사용이 가능하다.
        String usingField3 = ClassField.staticField1;
        String usingField4 = ClassField.staticField2;
    }
}
```
<img src = "https://github.com/9JaHyun/JAVA-BASIC-STUDY/blob/main/Ch6/img/field.png">
#### 인스턴스 필드
* 인스턴스를 생성해야만 사용할 수 있는 필드.

#### 정적(클래스, static) 필드
* JVM의 클래스로딩 시점에 메모리에 올라가는 필드.
* 인스턴스를 따로 생성하지 않아도 사용이 가능하다.

#### 파라미터
* 메서드 안에 있는 변수

#### 필드의 초기화
* 필드의 초기화 방식은 여러가지가 있다
    * 필드 선언시 초기화
    * 생성자를 통한 초기화
    * 블록을 통한 초기화

```java
public class InitField{
    //방법1 . 선언과 함께 초기화
    String field1 = "Hello"; 

    String field2;
    String field3;

    // 방법2. 생성자를 통한 초기화
    public InitField(String field2){
        this.field2 = field2;
        this.field3 = "HelloField3";
    }

    String field4;
    String field5;
    // 방법3. 초기화 블록을 통한 초기화 (보통 static 블록을 사용하지 그냥 블록은 생성자로 대체한다.)
    {
        this.field4 = "HelloField4";
        this.field5 = "HelloField5";
        System.out.println(field4);
    }

    // 문제 : 생성자 vs 초기화 블록
    // 생성자와 초기화블록이 겹치면 어느 것이 실행될까?
    // 정답은 new HelloField4 (오버라이딩 된다.)
    public InitField(){
        field4 = "new HelloField4";
    }

    public static void main(String[] args) {
        InitField initField = new InitField();
        System.out.println(initField.field4);
    }
}
```
#### 초기화 블록
* 필드에서는 조건문 또는 반복문을 실행하지 못하는 것을 극복하기위해 탄생
* 인스턴스 필드는 생성자에서 사용을 하면 되나, 정적 필드는 이를 못하기 때문에 초기화블록을 따로 만들어서 진행해주어야 한다.
```java
static field1;
static {
    field1 = ...
}
```
* 적용 순서
  * 클래스 변수 : 선언시 기본값 -> 명시적 초기화 -> 클래스 초기화 블록
  * 인스턴스 변수 : 기본값 -> 명시적 초기화 -> 인스턴스 초기화 블록 -> 생성자

### 생성자
* 객체가 생성된 직후 초기화하는데 사용되는 코드 블록.
* 메소드와 달리 리턴 타입이 없는 것이 특징
* 모든 클래스에는 생성자가 반드시 존재한다.
#### 종류
* **기본(default) 생성자**
  * 아무 내용도 적혀있지 않은 생성자. 빈 인스턴스를 생성하는데 사용된다.
  * 클래스에 아무 생성자가 명시되어 있지 않다면, 기본 생성자가 자동으로 들어가 있다.
```java
public class ConstructorSample {
    private String field1;

    // 기본(default) 생성자
    // 이 생성자 코드가 없어도 생성이 가능하다.
    public ConstructorSample() {}

    public static void main(String[] args) {
        // field1이 비어있는 인스턴스 생성
        ConstructorSample instance = new ConstructorSample();
    }   
}
```
* **생성자**
  * 빈 인스턴스가 아닌, 필드를 채우고 싶을 경우 사용되는 인스턴스.
```JAVA
public class ConstructorSample {
    private String field1;

    public ConstructorSample(String field){
        field1 = field;
    }

    public static void main(String[] args) {
        String sayHello = "hello";
        // field1 = "hello"로 차있는 인스턴스 생성.
        ConstructorSample instance = new ConstructorSample(sayHello);
    }
    
}
```
#### 주의사항
* 생성자를 작성하면 default 생성자는 없어진다.
```JAVA
public class ConstructorSample {
    private String field1;

    public ConstructorSample(String field){
        field1 = field;
    }

    public static void main(String[] args) {
        String sayHello = "hello";
        // field1 = "hello"로 차있는 인스턴스 생성.
        ConstructorSample instance = new ConstructorSample(sayHello);

        // 에러발생!
        ConstructorSample instance1 = new ConstructorSample();
    }
    
}
```
* 이 경우에는 클래스에 기본 생성자를 따로 명시해야 사용할 수 있다.
* 생성자에는 `super();`가 숨어있다. -> 상속에서 계속.

### 메소드
* 객체가 할 수 있는 행동을 말한다.
#### 분류
* 행동 종류
  * 명령(프로세스)
        * 상태 변경
  * 쿼리(함수)
        * 조회 및 반환.

* **사용 범위**
  * 클래스 메서드
    * `static` 키워드를 가지는 메서드
    * **인스턴스 생성 없이 사용**이 가능하다! (static field 참고)
    * 내부에서 인스턴스변수를 사용하지 못한다. 오직 클래스 변수만 사용이 가능하다.

  * 인스턴스 메서드
    * `static` 키워드를 가지지 않는 메서드
    * **인스턴스 생성 후 사용**이 가능하다.
    * 클래스변수, 인스턴스변수 모두 사용이 가능하다.

```java
public class MethodSample {
    // 클래스 필드
    private static String staticField1;

    // 인스턴스 필드
    private String field1;

    // 클래스(정적) 메서드는 클래스(정적) 필드만 사용 가능.
    public static void staticMethod1(){
        System.out.println(staticField1);
        // System.out.println(field1);  컴파일 에러
    }

    // 인스턴스 메서드는 모두 사용 가능.
    public void method1(){
        System.out.println(field1);
        System.out.println(staticField1);
    }
}
```
<img src = "https://github.com/9JaHyun/JAVA-BASIC-STUDY/blob/main/Ch6/img/staticMethod.png">

## 클래스 생성 방법
### 선언
* 변수선언과 동일한 방식으로 `타입 이름` 방식.
* 매커니즘도 똑같다. 메모리의 공간을 할당받아 사람이 부르기 쉽게 이름을 붙인 것.
* 변수선언과 마찬가지로 선언 이후에도 초기화가 필요하다.
```java
public class CreateClass {
    public static void main(String[] args) {
        // 선언
        CreateClass class1;

        // 초기화 -> 반드시 필요하다,
        System.out.println(class1); // 컴파일 에러 (에러 내용 : 초기화 필요)
    }
}
```
### 초기화 (인스턴스화)
* `new` 키워드를 통해 클래스로부터 객체를 생성한다. 이를 **인스턴스화**라고 부른다.
* `new`를 사용하기 위해서는 `생성자`라고 불리는 요소가 필요하다.
* `new`를 사용하면 새로운 인스턴스를 위해 메모리가 할당되고, 그 메모리에 대한 주소값을 반환하게 된다.
* https://ahnyezi.github.io/java/javastudy-5/ 참고.
```java
public class CreateClass {
    public String field1;

    public CreateClass() {}

    public CreateClass(String par1) {
        field1 = par1;
    }
    
    public static void main(String[] args) {
        // 선언
        CreateClass class1;

        // 초기화 -> 반드시 필요하다,
        System.out.println(class1); // 컴파일 에러 (에러 내용 : 초기화 필요)

        class1 = new CreateClass();
        CreateClass class2 = new CreateClass();
        System.out.println(class1); // 정상 작동

        // new를 통한 객체를 생성하는 방식을 인스턴스화라고 한다.
        CreateClass instance1 = new CreateClass("내용1");
        CreateClass instance2 = new CreateClass("내용2");
        CreateClass instance3 = new CreateClass("내용3");
        
    }
}
```

### this 키워드
* 사실 this 키워드의 사용처는 여러가지이다.
#### 참조 변수로써의 this
* 파라미터와, Instance 변수명이 같은 경우 구분을 위해 사용된다.
```java
public class thisSample{
    private String field1

    public thisSample(String field1) {
        this.field1 = filed1  // 파라미터의 field1과 필드의 field1이 겹치기 때문에 this를 이용
    }
}
```
#### 생성자 재사용을 위한 this
* 생성자를 재사용하기 위해서도 this를 사용한다.
```java
```java
public class thisSample{
    private String field1
    private int field2

    public thisSample(String field1) {
        this.field1 = filed1  // 파라미터의 field1과 필드의 field1이 겹치기 때문에 this를 이용
    }
    public thisSample(int field2){
        this("Hello"); // thisSample(String field1)을 호출
        this.field2 = field2; 
    }
}
```

## 패키지와 접근 제한자
<img src = "https://github.com/9JaHyun/JAVA-BASIC-STUDY/blob/main/Ch6/img/access.png">

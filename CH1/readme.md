# CH1. The JAVA

프로그래밍 언어 -> 컴파일러 -> 기계어 (10101010101010)


JAVA
어떤 OS든 작동
자바코드 -> (자바 바이트코드) -> 기계어 



메모리
---------------------------------------------------------
|  메소드 영역, 힙 영역, 스택영역,                    |
--------------------------------------------------------
Memory             : 속도는 빨라, 그런데 용량적어.
하드드라이브 SSD,   : 용량은커, 속도가 느려.


스택 : 
힙   :



## JVM?
* JAVA 
* Java Virtual Machine의 약자로 Java ByteCode를 각 OS에 맞게 해석해주는 역할을 함.
* JAVA Compiler는 .java 파일을 .class라는 Java ByteCode로 변환
    * Java ByteCode는 기계어가 아니기 때문에, OS에서 바로 실행이 되지 않음.
    * 대신 Java ByteCode는 JVM이 이해할 수 있는 언어.

* JVM은 OS가 ByteCode를 이해할 수 있도록 해석해주는 역할을 함.
    * 중요한 점은 OS에 상관없이 실행이 가능하다는 점이다. (독립적이지만, 의존적)
    * 이러한 추가 기능을 하기 때문에, c언어와 같은 네이티브 언어에 비해 속도가 느리지만 JIT(Just in Time) 컴파일러 구현을 통해 극복중.

* Class Loader
    * 런타임 시점에 .class에서 바이트코드를 읽고 메모리에 저장
    * 링크 : 레퍼런스를 연결하는 과정
    * 초기화 : static 값들을 초기화하고 변수에 할당.

* Runtime Data Areas
    * Heap 과 Method는 모든 쓰레드가 공유 나머지는 쓰레드 마다 생성
    * JVM이 프로그램을 수행하기 위해 OS로 부터 별도로 할당받은 메모리 공간
        * PC Register: CPU가 Instruction을 수행하는 동한 필요한 정보를 저장
        * JVM Stack: Thread가 시작될 때 생성되며 Method와 Method 정보 저장
        * Navtive Method Stack: Java 이외의 언어로 작성된 native 코드를 위한 Stack(JNI)
        * Method Area: 모든 쓰레드가 공유하는 메모리 영역(클래스, 인터페이스, 메소드, 필드, Static 변수등의 바이트 코드 등을 보관)
        * Heap: 런타임시 동적으로 할당하여 사용하는 영역 class를 통해 instance를 생성하면 Heap에 저장됨
            * Heap의 경우 명시적으로 만든 class와 암묵적인 static 클래스(.class 파일의 class)가 담긴다.
            * 또한 암묵적인 static 클래스의 경우 클래스 로딩 시 class 타입의 인스턴스를 만들어 힙에 저장한다. 이는 Reflection에 등장한다.



* Execution Engine
    * Load된 Class의 ByteCode를 실행하는 Runtime Module
    * Class Loader를 통해 JVM 내의 Runtime Data Areas에 배치된 바이트 코드는 Execution Engine에 의해 실행(바이트 코드를 명령어 단위로 읽어서 실행)

## Class Loader
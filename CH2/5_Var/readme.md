# 타입추론과 Var
* JAVA 10 이상부터 타입 추론 기능이 추가됨
* 타입 추론이란 코드 작성 당시에는 타입이 정해져있지 않지만, 컴파일러가 그 타입을 유추하는 것.
* method 호출 및 선언과 variable 혹은 object 선언을 통해 실제 타입을 추론하는 형식
* generic, lamda식에서 타입추론을 지원했지만, JAVA 10이상부터는 `var`키워드를 통해 지원
* 비슷한 방법으로 Generic가 있음
    * 단, Generic는 기본형 타입 사용이 불가능하다.
    * type-erasure 개념이 적용되어 type safe를 최대한 보장.
        * type-erasure : 컴파일러가 parameterized type 에서 새로운 클래스들이 생성되지 않는걸 보장,
        * 컴파일러가 언바운드 타입 T를 Object로 변환
        ```java
        public static <T> boolean hasElement(T[] elements, T element){
            for(T e : elements){
                if(e.equals(element){
                    return true;
                }
            }
            return false;
        }
        ```

        ⇒

        ```java
        public static boolean hasElement(Object[] elements, Object element){
            for(Object e : elements){
                if(e.equals(element){
                    return true;
                }
            }
            return false;
        }
        ```
        * 이 기능을 통해 생성된 바이트코드에서는 원래의 class, interface, method만 포함하고 있다.

## Var
* var 라는 type keyword 를 사용하여 실제 타입을 추론

```java
var url = new URL("http://www.naver.com"); // var is URL type
var list = new ArrayList<String>(); // var is ArrayList<String> type
```
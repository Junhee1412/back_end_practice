## 표현

- Content-Type : 표현 데이터의 형식
- Content-Encoding : 표현 데이터의 압축 방식
- Content-Language : 표현 데이터의 자연 언어
- Content-Length : 표현 데이터의 길이
- 표현 헤더는 전송, 응답 둘 다 사용한다.

아래 HTTP 응답 메시지를 보면

```
HTTP/1.1 200 OK
Content-Type: text/html;charset=UTF-8
Content-Length: 3423
<html>
  <body>...</body>
</html>  
```

하나하나 해석해보자
HTTP 1.1 버전, 200(요청이 성공했음), 알아볼 수 있는 문구 OK
이 아래부터 표현헤더라고 보면된다.

Content-Type -> 표현 데이터의 형식은 text형식의 html이고 UTF-8을 사용하여 인코딩 하였다.
Content-Length -> 표현 데이터의 byte단위 길이이다. 3423 byte이다.
위에 응답메시지에서는 이 두 가지가 나왔으나 4가지 모두에 대해 알아보고
표현 헤더를 통해 표현 데이터의 형식을 알 수 있도록 학습해보겠다!

---

## Content-Type

- 표현 데이터의 형식을 설명한다.
- 미디어 타입과 문자 인코딩 방식이 있으며 
  - text/html; charset=UTF-8
  - application/json
  - image/png
- 위와 같은 예시가 있다.

---

## Content-Encoding

- 표현 데이터의 인코딩에 대한 설명이다.
- 표현 데이터를 압축하기 위해 사용한다.
- 데이터를 전달하는 곳에서 압축 후 인코딩 헤더를 추가한다.
- 데이터를 읽는 쪽에서는 인코딩 헤더의 정보를 통해 압축을 해제한다.

```
HTTP/1.1 200 OK
Content-Type: text/html;charset=UTF-8
Content-Encoding: gzip
Content-Length: 521
lkj123kljoiasudlkjaweioluywlnfdo912u34ljko98udkl
```

위의 메시지에서는 Encoding 타입은 gzip을 이용한 것을 알 수 있다.
gzip 이외에도 deflate, identity 등이 있다.

---

## Content-Language
- 표현 언어의 자연 언어를 표현한다.
- 단순히 메시지 본문이 어떤 형식으로 이루어져 있는지 알려준다.

```
HTTP/1.1 200 OK
Content-Type: text/html;charset=UTF-8
Content-Language: ko
Content-Length: 521
<html>
  <body>안녕하세요?</body>
</html>  
```
위의 응답메시지에는 한국어로 되어있기 때문에 ko를 이용하여 표현헤더에 표시가 되어있다.
en, ko, en-US 등 다양한 언어가 표시되어지며
외국 사이트에 접속했을 때 클라이언트가 직접 한국어를 선택한다면 
해당 Content-Lenguage가 변경되도록 개발할 수 있다.

---

## Content-Length
- 표현 데이터의 길이이다.
- 바이트 단위로 표시되며
- Transfer-Encoding(전송 코딩)을 사용하면 Content-Length를 사용하면 안된다.
- 전송 코딩 안에는 이미 해당 정보가 들어있기 때문에 사용하면 안된다.

```
HTTP/1.1 200 OK
Content-Type: text/html;charset=UTF-8
Content-Length: 5

hello
```

---

**다음은 콘텐츠 네고시에이션이라고 하는 콘텐츠 협상에 대해 설명하겠다.**

> 출처 : 모든 개발자를 위한 HTTP 웹 기본 지식(김영한 강사님 인프런 강의)
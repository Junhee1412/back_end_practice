## HTTP 헤더

- header-field = field-name ":" OWS field-value OWS(OWS: 띄어쓰기 허용)
- field-name은 대소문자 구분이 없다.

예시로 들면 붉은색 글씨가 HTTP 헤더이다.

### 요청메시지

GET /search?q=hello&hl=ko HTTP/1.1<br>
<span style="color: red">Host: www.google.com</span>

### 응답메시지

HTTP/1.1 200 OK<br>
<span style="color: red">Content-Type: text/html;charset=UTF-8
Content-Length: 3423</span>

```
<html>
  <body>...</body>
</html>
```

---

### HTTP 헤더의 용도

- HTTP 전송에 필요한 모든 부가정보
  - 예) 메시지 바디의 내용, 크기, 압축, 인증 등.. 다양하다.
- 표준 헤더가 너무 많음
- 필요시 임의의 헤더 추가도 가능하다!

### HTTP 헤더 분류

- General 헤더 : 메시지 전체에 적용되는 정보, 예) Connection: close
- Request 헤더 : 요청 정보, 예) User-Agent: Mozilla/5.0(Macintosh;..)
- Response 헤더: 응답 정보, 예) Server: Apache
- Entity 헤더: 엔티티 바디 정보, 예) Content-Type: text/html, Content-Length: 3423

---

### HTTP BODY

**RFC2616(과거)**

- 메시지 본문은 엔티티 본문을 전달하는데 사용한다.
- 엔티티 본문은 요청이나 응답에서 전달할 실제 데이터 위에서 html을 뜻한다.
- 엔티티 헤더는 엔티티 본문의 데이터를 해석할 수 있는 정보 제공
  - 데이터 유형(html, json), 데이터 길이, 압축정보 등등

**RFC7230~7235(현재)**

- 엔티티(Entity) -> 표현(Representation)
- Representation = representataion Metadata + Representataion Data
- 표현 = 표현 메타데이터+표현 데이터를 뜻한다.
- 메시지 본문(message body)을 통해 표현 데이터를 전달한다.
- 메시지 본문 = 페이로드(Payload)
- 표현은 요청이나 응답에서 전달할 실제 데이터를 뜻한다.
- 표현 헤더는 표현 데이터를 해석할 수 있는 정보 제공
  - 데이터 유형(html, json), 데이터 길이, 압축정보 등등
- 참고 : 표현 헤더는 표현 메타데이터와 페이로드 메시지를 구분해야 하지만, 여기서는 생략한다.

**다음엔 표현이라는 개념에 대해 정리해보겠다!
6월 10일.. sqld 시험이 딱 10일 남아서 조금씩 꾸준히 해보도록 하겠다..**

> 출처 : 모든 개발자를 위한 HTTP 웹 기본 지식(김영한 강사님 인프런 강의)
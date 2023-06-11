## 콘텐츠 협상

- 클라이언트가 선호하는 표현을 요청한다.
- 클라이언트의 요청 우선순위에 맞춰서 서버는 노력한다. 하지만, 없다면 기본값을 내놓는다.

### 요청의 종류

- Accept : 클라이언트가 선호하는 미디어 타입 전달
- Accept-Charset : 클라이언트가 선호하는 문자 인코딩
- Accept-Encoding : 클라이언트가 선호하는 압축 인코딩
- Accept-Language : 클라이언트가 선호하는 자연 언어
- 협상 헤더는 요청시에만 사용한다.

---

### 설명

- 한국어 브라우저를 사용하고 있는 클라이언트가 GET방식으로 요청을 했다.
- 다중언어 지원 서버에서 기본값으로 Content-Language : en을 적용해두었기 때문에 영어로 된 페이지를 보여준다.
- 그러나 이 때 Accept-Language:ko라고 클라이언트가 HTTP헤더에서 요청했다면
  Content-Language:ko로 한국어 페이지를 보여준다.

---

### 협상과 우선순위 1(Quality Values(q))

- Quality Values(q)값 사용
- 0~1 클수록 높은 우선순위이다.
- 생략하면 1로 적용된다. 아래의 형식으로 요청한다면

```
Accept-Language: ko-KR,ko;q=0.9,en-US;q=0.8,en;q=0.7
```

- 위의 요청에 따른 우선순위는 아래와 같다.
  - ko-KR : 1
  - ko : 0.9
  - en-US : 0.8
  - en : 0.7
  - 만약 서버에 한국어 페이지가 없고 기본 값이 독일어일 경우에 독일어 페이지를 보여주는 것이 아니라 en-US를 찾아보고 영어 페이지가 있다면 영어 페이지를 보여주는 형식이다.

---

### 협상과 우선순위 2(Quality Values(q))

- 구체적인 것이 우선한다.

```
Accept:text/*, text/plain, text/plain;format=flowed, */*
```

- 위와 같은 우선순위를 갖게 된다.
  - 1. text/plain;format=flowed
  - 2. text/plain
  - 3. text/\*
  - 4. \*/\*

---

### 협상과 우선순위 3(Quality Values(q))

- 구체적인 것을 기준으로 미디어 타입을 맞춘다.

```
Accpet: text/*;q=0.3;text/html;q=0.7,text/html;level=1,text/html;level=2;q=0.4,*/*;q=0.5
```

- 우선순위는 아래와 같다.
  - text/html;level=1 (q=1)
  - text/html (q=0.7)
  - text/plain (q=0.3) text/\*과 매칭되기 때문에(구체적인 것 우선이므로 \*/\*과는 매칭이 안된다.)
  - image/jpeg (q=0.5) \*/\*과 매칭되기 때문에 0.5다.
  - text/html;level=2 (q=0.4)
  - text/html;level=3 (q=0.7)

---

#### 위와 같은 콘텐츠 협상방식을 통해 원하는 데이터를 클라이언트가 조금 더 용이하게 받을 수 있다!

**내일은 전송 방식과 일방정보, 특별한 정보까지 정리해보겠다.**

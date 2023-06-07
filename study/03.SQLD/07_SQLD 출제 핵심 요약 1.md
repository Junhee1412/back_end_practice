### SQL 연산 순서

- FROM, WHERE, GROUP BY, HAVING, SELECT, ORDER BY

---

### DML, DDL, DCL

- DML
  - SELECT, INSERT, UPDATE, DELETE
- DDL
  - ALTER, CREATE, MODIFY, DROP
- TCL(DCL에 포함으로 보기도한다.)
  - ROLLBACK, COMMIT
- DCL
  - GRNAT, REVOKE
  
---

### DISTINCT

- 컬럼의 중복값을 없앤다.
- SELECT DISTINCT COL FROM TABLE;
  - COL의 중복값만 출력하지 않는다.
- SELECT DISTINCT COL1, COL2 FROM TABLE;
  - COL1과 COL2 값이 모두 같지 않은 것을 출력한다.
- DISTINCT의 실행순서가 ORDER BY 직전이기 때문에 모든 값의 중복을 없앤다고 생각하자.
  
---

### ALIAS

- AS를 이용하기도 하지만 AS를 생략하기도 한다.
- AS의 인식 순서는 WHERE다음이기 때문에 WHERE에서는 사용하지 못한다.
(먼저 인식하고 난 뒤 AS를 인식하므로 별칭을 모른채로 WHERE이 먼저 실행된다.) 그러나 WHERE다음에 AS가 인식되어지므로 GROUP BY, HAVING, SELECT, ORDER BY에서는 쓰일 수 있다.

---

### CONCAT

- 문자열을 붙여서 출력하기 위함
- oracle에서의 CONCAT은 연산자가 2개이다.(2개만 붙일 수 있다.)
- oracle에서 CONCAT을 사용할 수 있고 ||도 사용이 가능하다.
- SQL server에서는 +로 표현한다.

---

### 논리연산자

- NOT, AND, OR 순으로 실행된다.
- NOT : ~가 아니다.
- AND : A 그리고 B(둘 다 만족)
- OR : A 또는 B(둘 중 하나만 만족해도 가능하다.)

---

### SQL 연산자

- A BETWEEN B AND C : B<=A<=C
- A IN(1,2,3) : A=1 OR A=2 OR A=3
- A LIKE '_BLE*' : A의 값 중 2, 3, 4번째 값이 BLE인 모든 데이터를 출력한다.
  - 예를 들면 ABLEA, BBLE, CBLEY 등
  - _는 한글자를 뜻한다.
  
---

### ESCAPE

- 특수문자를 문자열로 인식할 수 있게 해준다.
- LIKE절에 '%%%'와 같이 %를 포함한 문자열을 검색하고 싶다면
  - SELECT * FROM TABLE WHERE COL1 LIKE '%#%%' ESCAPE '#' 쿼리문을 이렇게 작성하면 # 뒤의 문자를 특수문자가 아닌 문자로 인식하게 해준다.
  
---

### ROWNUM, TOP

- 순위를 나타나는 함수
- oracle에선 where절 옆에 rownum
- SQL server의 경우 select 옆에 top

---

### NULL의 정의

- NULL은 모르는 값이다.
- 값은 있다. 다만 알 수 없다.
- 산술 연산으로 NULL에 어떠한 값을 더하거나 빼도 답은 NULL이다.
- 혹시라도 NULL+2가 NULL+1보다 크다 라는 지문이 나온다면 거짓이다. NULL은 모르는 값이기 때문에 NULL+2와 NULL+1은 NULL로 같다.
- 집계함수(SUM, COUNT, MIN, MAX)에서 NULL은 대상에서 제외된다.
  - 열 기준으로 집계함수를 쓰면 NULL을 더하면 NULL이다.
  - NULL을 집계하게되면 없는 값으로 생각한다.
- oracle에선 가장 큰 값, SQL server에서는 가장 작은 값으로 인식한다. 그러므로 정렬방식(ASC, DESC)에 따라 다르다.

---

### NVL

NVL(COL1, 0) : COL1이 NULL이면 0 반환, 아니면 COL1반환
NVL2(COL1, 1, 0) : COL1이 NULL이면 0, NULL이 아니면 1 반환
ISNULL(COL1, 0) : COL1이 NULL이면 0 반환, 아니면 COL1반환
NULLIF(COL1, 0) : COL1이 0이면 NULL반환, 아니면 COL1반환
COALESCE(COL1, COL2, COL3) : NULL이 아닌 가장 처음 값을 반환

---

### 정렬

- 느려질 수 있다.
- 가장 마지막에 실행한다.
- NULL이 어디에 오는가 oracle은 가장 큰 값, SQL server는 가장 작은 값이다.
- order by절에서는 asc(오름차순)이 기본정렬이다.
- 2가지 이상의 order by도 가능한데 이럴 경우 순서대로 정렬한 뒤 같은 값이 출력된다면 2번째 order by 조건으로 우선순위 정렬을 정할 수 있다.
- order by col1, col2 decs 라고 되어있다면 col1을 오름차순 정렬한 뒤 같은 값이 있다면 col2에서는 내림차순으로 정렬하라는 뜻이다.

---

### 숫자함수

- Round(251.111, 1) 두번째 자리에서 반올림해서 1번째짜리까지 출력
- Ceil(올림), truncate(내림), Floor(소수점 내림)
- 파라미터 모두 같음

---

### 문자함수

- Lower, upper : 문자 변환, 소문자, 대문자
- Trim, ltrim, rtrim : 양쪽 공백 제거, 왼쪽 공백제거, 오른쪽 공백 제거
- Lpad, rpad : 특정 자리를 정하고 남는자리는 특정 문자로 채우는 것이 가능
  - select lpad('A', 5, '*') from dual;
  - ****A 출력
- substr : 특정 문자열에서 몇번째부터 몇개의 문자열을 출력
- instr : 특정 문자열에서 특정 문자가 포함되어있는것을 찾을 때 
  - select instr('CCCCCC PPCC', 'PPC') from daul;
  - 공백 포함 8번째에서 시작하므로 8이 출력됨.
  - 기준 문자열에서 포함이 되지 않으경우 0이 출력됨.

---

### 날짜함수

- to_char() : 날짜형 데이터를 문자로 출력
  - Select to_char(sysdate, 'YYYY MM DD') from dual;
- to_date() : 문자형 데이터를 날짜형으로 출력
  - select to_date('2022-09-22') from dual;
- sysdate - oracle, getdate() - SQL server
  
---

### 조건문

- decode
  - select decode(col1, 'A', 1, 'B', 2, 3) from dual;
  - col1의 값이 A면 1, B면 2, 아무것도 해당하지 않으면 3
- case
  - case when col='A' then 1
 		 when col='B' then 2
         else 3 end;
  - case col when 'A' then 1
             when 'B' then 2
             else 3 end;
- 위의 3개 쿼리문이 모두 같은 것을 의미한다.
- case는 마지막에 end로 마무리지어준다.

---

### 집계함수

- count, min, sum, max 등
- null은 포함하지 않는다.
- 컬럼 전체를 묶는다, 행을 묶지 않는다.
- (1, null, 2, 3, null)이라면?
  - count() : 3
  - sum() : 6
  - avg() : 2
  - min() : 1
  - max() : 3
- 행끼리 데이터를 합친 후 sum을 하는 경우도 있다. 그 때는 행끼리 null을 더하면 null이 반환되고 sum에서는 null은 없는 데이터로 취급한다.

---

### GROUP BY

- 집약기능(다수의 행을 하나로 합침)
- group by 절에 온 컬럼만 select 절에 올 수 있음.(집계함수도 가능하다.)
- 값이 같은 것을 하나만 보이게 한다.
- 그룹함수와 집계함수는 결이 같다. 그러나 그룹함수와 다른 여러 행이 출력되는 함수들은 값을 표현할 수 없다. 그러므로 같이 쓰일 경우에는 오류가 발생한다.

---

### JOIN

- Natural join
  - 반드시 두 테이블 간의 동일한 이름 타입을 가진 컬럼이 필요하다.
  - 조인에 이용되는 컬럼은 명시하지 않아도 자동으로 조인에 사용된다.
  - 동일한 이름을 갖는 컬럼이 있지만 데이터 타입이 다르면 에러가 발생한다.
- Using
  - using절은 조인에 사용될 컬럼을 사용한다.
  - natural 절과 using절은 같이 사용될 수 없다.
  - 조인에 이용되지 않은 동일 이름 컬럼은 컬럼명 앞에 테이블명을 기술해야한다.
  - 조인 컬럼은 괄호로 묶어서 기술한다.
- left outer join
  - A가 기준 테이블이라고하면 B가 서브 테이블이다.
  - A를 왼쪽에 기술하고 B를 다음에 기술한다.
  - A는 모두 출력, B는 A 값과 동일한 값만 출력하고 나머지는 null로 출력된다.
  - B가 딸려온다고 생각하면된다.
- join절은 반드시 연결하고자 하는 테이블의 테이블 수-1만큼 써야 모두 연결할 수 있다.
- join순서는 먼저 기술한 것에서부터 순차적으로 처리한다.

---

### 서브쿼리

- 서브쿼리는 select로 시작하는 쿼리문을 하나 더 작성해서 메인쿼리문을 보조해주는 역할을 한다.
- select : 스칼라 서브쿼리
- from : 인라인 뷰(메인쿼리의 컬럼 사용 가능)
- where : 중첩 서브쿼리
- group by : 사용 불가
- having : 중첩 서브쿼리
- order by : 스칼라서브쿼리
- in : 서브쿼리출력값들 or 조건
- Any / some : 서브쿼리 출력값들 중 가장 작거나 큰 값을 비교
- All : any/some과 반대 개념이다.
- Exists : 서브쿼리 내 select절엔 뭐가 와도 상관없다. Row가 있으면 true, 없으면 false

---

### 집합연산자

- union : 정렬, 합집합, 중복제거, 느리다.
- intersect : 정렬, 교집합, 느리다.
- minus : 정렬, 차집합, 느리다.
- union all : 정렬X, 중복제거X, 빠르다.

**추가로 25개의 핵심포인트는 또 정리할 예정**
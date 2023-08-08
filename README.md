# backend

---

### Coding Covention

네이버 캠퍼스 핵데이 코딩 컨벤션 적용

https://naver.github.io/hackday-conventions-java

Formatter :

https://github.com/naver/hackday-conventions-java/blob/master/rule-config/naver-intellij-formatter.xml

checkstyle rule :

https://github.com/naver/hackday-conventions-java/blob/master/rule-config/naver-checkstyle-rules.xml

checkstyle suppression :

https://github.com/naver/hackday-conventions-java/blob/master/rule-config/naver-checkstyle-suppressions.xml

---
코드 스타일 적용법 (InteliJ)

- File &rarr; Settings &rarr; Editor &rarr; Code Style &rarr; Java 이동
- Schema 옆 톱니바퀴 클릭 &rarr; Import Scheme &rarr; InteliJ IDEA Code Style XML 선택
- 위에서 다운받은 naver-intelij-formatter.xml 선택 후 저장
- File &rarr; Settings &rarr; Tools &rarr; Actions on Save 에서 원하는 옵션 선택
- 저장 시 마다 자동으로 코딩 컨벤션 적용

---
코드 스타일 체크 (InteliJ)

- File &rarr; Settings &rarr; Plugins의 Marketplace에서 CheckStyle-IDEA 다운로드
- InteliJ 재시작
- File &rarr; Settings &rarr; Tools &rarr; Checkstyle 선택
- Scan Scope 설정 및 Treat Checkstyle errors as warnings 체크
- Configuration File에 checkstyle rule 추가
    - +버튼 클릭 &rarr; Use a Local Checkstyle File 선택
    - 위에서 다운받은 naver-checkstyle-rules.xml 선택
    - suppressionFile 변수에 naver-checkstyle-suppressions.xml 입력
- 추가한 checkstyle rule 활성화

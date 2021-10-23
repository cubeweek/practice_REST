# practice_RESTful
 RESTful API 연습/공부용 repo입니다.
- - -
#

### RESTful(REpresentational State Transfer + ful)이란?
- - -
- WWW와 같은 분산 하이퍼미디어 시스템을 위한 소프트웨어 아키텍처의 형식을 일컬음
- 요청 수행 시 RESTful API는 리소스 상태에 대한 표현을 요청자에게 전송함
#
### API가 Restful하기 위한 6가지 조건
- - -
#### 인터페이스 일관성 
정보가 표준 형식으로 전송되도록 하기 위한 구성요소 간 통합 인터페이스로서 아래 조건을 만족해야 합니다.

> - 요청된 리소스가 식별 가능하고, 클라이언트에 전송된 표현과 분리되어야 함 
> - 수신된 표현으로 클라이언트가 리소스를 조작할 수 있어야 합니다
> - 클라이언트에 반환되는 자기 기술적(self-descriptive) 메시지에 클라이언트가 정보를 어떻게 처리해야 할지 설명하는 정보가 충분히 포함되어야 함.
> - 하이퍼미디어: 클라이언트가 리소스에 액세스한 후 하이퍼링크를 사용해 현재 수행 가능한 기타 모든 작업을 찾을 수 있어야 함.

#### Stateless(무상태)
요청 간에 클라이언트 정보가 저장되지 않으며, 각 요청이 분리되어 있고 서로 연결되어 있지 않음

#### Cacheable(캐시 처리 기능)
클라이언트-서버 상호 작용을 간소화하는 캐시 처리가 가능한 데이터

#### 계층화(Layerd System)
요청된 정보를 검색하는 데 관련된 서버(보안, 로드 밸런싱 등을 담당)의
각 유형을 클라이언트가 볼 수 없는 계층 구조로 체계화하는 계층화된 시스템.
            
#### 클라이언트-서버 구조
클라이언트,서버,리소스로 구성되어 있으며 요청이 HTTP를 통해 관리되는 클라이언트-서버 아키텍처

#### Code on demand (선택 사항)
요청을 받으면 서버에서 클라이언트로 실행 가능한 코드를 전송하여 클라이언트 기능을 확장할 수 있는 기능.
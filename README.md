# androidStudy
androidStudy

### 안드로이드의 주요 기능

안드로이드의 주요 기능

- 애플리케이션 프레임워크가 제공하는 API를 사용 → 코드를 재사용하여 효율적이고 빠른 애플리케이션 개발 가능
- 모바일 기기에 최적화된 달빅 또는 아트
- 2D 그래픽 및 3차원 그래픽을 최적화하여 표현
- 모바일용 데이터베이스인 SQLite를 제공
- 각종 오디오, 비디오 및 이미지 형식을 지원
- 각종 하드웨어(블루투스, 카메라, 나침반, WIFI 등) 지원
- Android Studio를 통해 강력하고 빠른 개발환경 제공 → 단점 : 새롭게 업그레이드 될 때 불안정함. 기존 버전에서 개발한 앱이 빌드 안될 수 있음.

초창기 안드로이드 무겁고 느리고 그랬는데, JVM 안드로이드 CPU로 바꿔서 실행하다보니 과부하가 증가.

자바를 생성하면 Object를 만듦. JVM 가비지 컬렉션 동작 때문에 성능이 저하됨. 하지만 지금은 관련없음.

### 안드로이드의 특징

- 안드로이드의 핵심 커널은 리눅스로 구성
- 안드로이드 애플리케이션 개발 언어는 Java를 사용
- 안드로이드 SDK에서 많은 라이브러리를 포함하고 있어 개발이 용이
- 오픈 소스를 지향하기 때문에 운영체제부터 관련 문서, 개발 도구 등 거의 모든 것을 무료로 사용 가능
- 지속적인 업그레이드를 제공
    - 장점 : 기능, 보안 업그레이드
    - 단점 : 기존 API 삭제 또는 동작 안됨 → 기존 개발된 앱 실행(X), 개발자 고통


### 안드로이드의 앱 구성

안드로이드의 응용 프로그램

- 안드로이드 응용 프로그램은 4개의 컴포넌트로 구성된다.

4대 컴포넌트(중요)

- Activity : 전체 화면 들을 액티비티라고 함.
    - 사용자 인터페이스를 구성하는 기본 단위
    - 눈에 보이는 화면 하나가 액티비티이며 여러 개의 뷰(위젯)들로 구성된다.
    - 응용 프로그램은 필요한 만큼의 액티비티를 가질 수 있으며, 그 중 어떤 것을 먼저 띄울지 지정.
- Service
    - UI가 없어 사용자 눈에 직접적으로 보이지 않으며 백그라운드에서 무한히 실행되는 컴포넌트
    - 미디어 플레이어를 들 수 있는데 비활성화된 상태라도 노래는 계속 재생
    - UI가 없으므로 사용자의 명령을 받아들일 수 있는 액티비티와 연결해서 사용된다.
- Broadcast Receiver : **일종의 이벤트 전달 수단**
    - 시스템 또는 앱으로부터 전달되는 방송을 대기하고 신호 전달시 수신하는 역할을 한다.
    - 예를 들어 배터리가 떨어졌다거나, 전화가 왔다던가, 네트워크 전송이 완료되었다 등의 신호를 받는다.
    - 신호만 대기할 뿐 UI를 따로 가지지는 않으므로 방송 수신 시 방송의 의미를 해석하고 적절한 액티비티를 띄우는 역할.
    - 이벤트 - Broadcast / 이벤트 헨들러 - Broadcast Receiver
- Content Provider
    - 다른 응용 프로그램을 위해 자신의 데이터를 제공한다.
    - 안드로이드는 보안이 엄격하여 다른 응용 프로그램의 데이터를 함부로 엑세스 하지 못하도록 되어 있다.
    - 응용 프로그램 간에 데이터를 공유할 수 있는 합법적인 유일한 장치가 바로 콘텐트 제공자이다.

응용 프로그램은 액티비티, 서비스, 방송 수신자, 콘텐트 제공자 중 일부만을 가질 수도 있고 여러 개를 가질 수도 있다.

### 뷰에 대해서

뷰 == 위젯

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/94393af1-0df9-4ba3-aedb-1eb0abad6872/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/989a2ac3-1475-47be-89c2-bbc6f50105f2/Untitled.png)

### 뷰그룹

<aside>
💡 뷰 그룹은 여러 자식 뷰를 담을 수 있으며,  뷰는 반드시 뷰그룹에 포함되어야지만 화면에 그려진다.

</aside>

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/9e39726d-985e-4ee6-9a77-4c03b105424e/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/3487655d-3cf7-489b-bf3b-f46edb37dbe2/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/290c78df-eb6f-46ca-8c81-f0465b505ca0/Untitled.png)

- LinearLayout
- RelativeLayout
- TableLayout
- FrameLayout

---

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/8c2ea90f-3d78-40fa-bd7f-82cb354de73d/Untitled.png)

### 뷰의 배치 정보를 활용

- 화면 배치 정보 LayoutParams
- 뷰가 가지는 다양한 LayoutParams 정보
- 최상위 뷰그룹의 LayoutParams 정보
- 뷰그룹의 파생된 클래스와 LayoutParams 정보

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/e1f3190a-d249-4435-a554-088278c5a255/Untitled.png)

### 화면 배치 정보

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/e127c74b-a0f2-4d7d-8059-c37fa77aac2d/Untitled.png)

LinearLayout은 기본적으로 Vertical

### 최상위 뷰그룹의 LayoutParams 정보

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/cec8fdad-8f45-4a99-a0d9-2123aad1e0c6/Untitled.png)

결국 모든 종류의 뷰그룹은 최상위 ViewGroup 클래스에서 파생 클래스로 정의된다.

즉, LayoutParams, MarginLayoutParams를 상속받는다.

### 뷰그룹의 파생된 크래스와 LayoutParams 정보

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/f72eedd2-c102-412e-9a06-c3cfc288c438/Untitled.png)

### activity_main.xml

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/c614f9f9-373f-461f-ba3d-ddb786168d0e/Untitled.png)

부모와 동일하게 설정하겠다.

`match_parent` 

뷰 스스로 적당한 크기에 맞춘다(**일반적으로 문자열의 크기에 맞춰진다**)

`wrap_content`

### 레이아웃의 유연성 속성

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/a2bd415d-c064-4633-85d6-945dd2e41277/Untitled.png)

match_parent 값은 부모 뷰그룹에 크기를 맞추기 때문에 화면 크기가 다른 단말에서도 유연하게 레이아웃을 유지할 수 있다.

# 5. 대표적인 뷰그룹에 대해서

### LinearLayout

<aside>
💡 자식 뷰들을 수평 혹은 수직으로 배치하는 뷰그룹

</aside>

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/1f8d2685-2c6c-47d5-8176-dd0269e97077/Untitled.png)

---

**Orientation 속성**

- Vertical : 수직 배치
- Horizontal : 수평 배치

---

**Gravitiy 속성** : LinearLayout 내에서 자식뷰들이 배치 위치(중력 방향)를 지정함.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/c896f4e0-04b9-493c-acd8-701f5e32dd47/Untitled.png)

top | left 가 디폴트 값이다.

- top : 상단에 배치
- bottom : 하단에 배치
- left : 좌측에 배치
- right : 우측에 배치
- center_vertical : 수직 중앙에 배치
- center_horizontal : 수평 중앙에 배치
- center : 정 중앙에 배치

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/23b61475-41d2-4c61-97d4-c345b78b8fdf/Untitled.png)

---

**baselineAligend 속성** : 텍스트가 포함된 자식 뷰 중 가장 높이가 긴 뷰를 기준으로 정렬할 지 설정함.

- True
- False

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/b0465f77-7e33-4109-b8cf-d493ec750135/Untitled.png)

---

**baselineAlignedChildIndex 속성** : 뷰그룹안에 뷰그룹이 존재할 때 View3의 문자열을 어디에 맞출 지 정해주는 옵션. 제일 첫번째 뷰부터 0번이 된다.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/6c5dcdf1-0910-4c64-a771-802543fe70f2/Untitled.png)

---

**Layout의 Gravity가 아닌 각 View의 Gravity 속성**

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/dab2ba2e-17d2-4d4a-8b6f-63168059a0b2/Untitled.png)

Layout gravity가 right라서 오른쪽에 배치

순서대로 bottom, center_vertical, top이기 떄문에 다음과 같이 배치.

---

layout_weight 속성 : 자식 뷰에 가중치를 지정해서 그 크기를 결정함.

**layout_width = 0dp 또는 wrap_content로 설정해야함.**

### 레이아웃의 유연성 속성

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/f88ae800-4d53-490b-a588-35f580c54d84/Untitled.png)

LinearLayout LayoutParmas의 layout_weight 속성은 특정 자식뷰의 크기를 가변적으로 조절할 수 있기 때문에 다양한 화면 크기의 단말에서 유연하게 레이아웃을 유지할 수 있다.

---

layout_weight 속성과 LinearLayout의 measureWithLargestChild 속성

measureWithLargestChild 속성이 True이면 레이아웃 내 layout_weight를 가지는 모든 자식 뷰를 가장 큰 자식 뷰의 크기로 조정됨.

이때, layout_weight는 0 이상의 임의의 값도 가능함.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/d66b4197-77c5-434d-9aea-78d8c051bfbb/Untitled.png)

## 3주차 21.09.15

### RelativeLayout

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/20aca7ee-f6d2-43fd-824b-60b5b7f876cb/Untitled.png)

각 뷰들의 관계에 따라 배치하는 방법

---

**gravity 속성과 ignoreGravity 속성**

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/548ffef1-835e-4e96-9fa9-b61dac73af2a/Untitled.png)

---

**이밖의 여러가지 속성들**

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/5e19bed0-55f9-447b-9921-13d90b4bddbb/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/3ec04c36-229e-4f98-88f9-91d4a89692f6/Untitled.png)

다음과 같은 특성을 true로 설정하면 됨.

### 자식 뷰 간의 관계 배치 속성들

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/79b68ddd-0065-4291-9b95-dc18012613ea/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/ac5e0b85-57a1-4d35-a8a8-1affb7396889/Untitled.png)

---

### 자식 뷰 배치 예시

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/91d3b842-0f56-4f03-8b5c-1cb6053a0fd5/Untitled.png)

---

### 레이아웃의 유연성 속성

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/e0e73bb5-4eac-4214-86dc-a921457f6a93/Untitled.png)

**매우 빈번히 사용되므로 기억할 것**

이렇게 만들게 되면 View2는

View1의 오른쪽 + View3의 왼족에 배치되게 된다.

---

### FrameLayout

겹쳐서 배치하는 것.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/e8e06f10-bf77-4870-9401-b53631f80d62/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/1bf90a8b-8616-4151-aaf2-9e5582030eff/Untitled.png)

---

**foreground와 foregroundGravity 속성**

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/653964ce-9121-4384-a142-856a6f22ce10/Untitled.png)

이미지 하나 올리는데, 이것을 right|bottom 설정.

---

**measureAllChildren 속성**

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/286bd8a5-23aa-4b8f-96ac-5d7febb18f40/Untitled.png)

디폴트 : Visible

Visible : 보이는 상태

Invisible : 보이지 않으나 FrameLayout 영역을 차지하고 있음.

Gone : 보이지 않고, FrameLayout 영역을 차지하지 않음.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/5f31bfaf-ec4a-4c12-ac96-7ce20d2fab4e/Untitled.png)

measureAllChildren = true 이면 gone을 invisible처럼 적용.

---

**layout_gravity 속성**

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/d21a5f38-216e-4863-8580-6074914c0651/Untitled.png)

---

### TableLayout(많이 사용함)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/f650523a-93fc-4cb6-b0c5-784d2234a6a8/Untitled.png)

---

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/ee65902d-6344-4abb-9120-3210442f4fba/Untitled.png)

TableLayout과 TableRow는 LinearLayout을 상속받은 것이다.

---

**collapseColums 속성**

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/baa62bdd-2891-491b-9467-65528d1e384d/Untitled.png)

해당 열을 숨김.

---

**shrinkColumns 속성**

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/e4a8a22b-6ad8-447b-bba0-d086922b918c/Untitled.png)

지정한 열의 공간을 줄이고 나머지 공간을 확보함.

---

**stretchColumns 속성**

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/81a1b5cf-3949-42d6-9e0e-8e10c2e2fe7d/Untitled.png)

공간이 남을 때 특정 열이 늘어나서 공간을 채우라는 의미.

---

**layout_colums 속성**

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/4343b802-9103-4866-8e11-43c02dcc8d65/Untitled.png)

자식 뷰의 시작 열을 지정한다.

---

**layout_span 속성**

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/2161269b-5a0b-489c-8695-e61fa3d21c3b/Untitled.png)

하나의 뷰가 하나 이상의 열을 차지하게 만듦.

---

## 대표적인 뷰

- 뷰의 파생 클래스
- 최상위 뷰 속성 - id
- 최상위 뷰 속성 - background
- 최상위 뷰 속성 - padding
- 최상위 뷰 속성 - visibility

---

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/c108f6ee-ba17-4499-be6f-11f1d47e8666/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/1727c309-8ed0-4f02-9817-2ea302d6151a/Untitled.png)

---

### 최상위 뷰 속성 - id

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/490ad752-7ba4-4296-96b2-a8861f4da6be/Untitled.png)

`findViewById()` 함수를 사용하여 해당 뷰를 참조할 수 있다.

---

### 최상위 뷰 속성 - background

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/f9bfe187-1c29-47e1-b046-9ac8b8b78af6/Untitled.png)

`@drawable` 폴더 안에 이미지 저장해서 이미지 지정 가능.

---

### 최상위 뷰 속성 - padding

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/23783a5e-39b6-45a3-8457-9cfe7677a9be/Untitled.png)

---

### TextView

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/2deea1ae-b6a5-4278-92da-53e9301a961d/Untitled.png)

---

**textColor 속성**

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/06c5a320-b423-47e8-8a49-998eb13740c3/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/354cfbca-634e-4694-9d45-f648259dc878/Untitled.png)

**이외에 글꼴에 관련된 속성들**

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/949c1163-e953-4b07-9d40-6afda26cd4f7/Untitled.png)

---

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/5de1aba3-6ec2-430c-b5ee-2d69e7d2c9e3/Untitled.png)

---

**singleLine 속성**

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/540d56cd-40bc-46ae-a9c0-b550f91cdc6f/Untitled.png)

singleLine 속성을 True로 하면 `닳..` 이런식으로 나오게 된다.

**ellipsize 속성 (중요한 게 아니라고 하심)**

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/ebbbdb42-5063-49c4-af60-3c8b0cad20a0/Untitled.png)

**ellipsize 속성과 marquee와 marqueeRepeatLimit 속성 (집에서 해보라고 하심 중요하지 않음)**

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/921b0243-d781-4fa1-aa4b-4dfed3fb5df7/Untitled.png)

**gravity 속성**

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/a50005df-d7d8-45f9-a6e2-bbd8f8c0b3b9/Untitled.png)

**lines, minLines, maxLines 속성**

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/7a335f23-f6f2-4502-aa36-61b308fb7c3f/Untitled.png)

lines : 라인을 고정으로 픽스

minLines : 최소 라인 수(글자가 적어도 지정한 라인을 디폴트로 표시)

maxLines : 최대 라인 수(설정한 라인 이하로 변경될 수 있음)

**lineSpacingExtra, lineSpacingMultiplier 속성**

줄간격 관련 속성

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/4f46f76d-833e-4ed0-8354-68b4f925ac25/Untitled.png)

## EditText - TextView를 상속받음.

**editable, enabled 속성**

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/639a3748-00a1-438d-897b-a8ca3a87ecfe/Untitled.png)

editable을 false로 설정하면 검은색 글자로 뜨며 입력하고 수정할 수 없음.

enabled를 false로 설정하면 회색 글자로 뜨며 입력 불가하게 만듦.

**digits 속성**

원하는 글자만 선택적으로 입력받을 수 있음.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/d24026b5-437b-484a-9ebe-8dfb623b6191/Untitled.png)

**hint, textColorHint 속성**

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/6880655e-41ff-42ae-acf5-70f441b24697/Untitled.png)

hint : EditText 배경에 특정 문자열 표시

textColorHint : hint 문자열 색상 변경.

**selectAllOnFocus, textColorHighlight 속성**

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/c9992856-1955-48c4-81fb-158798be17b2/Untitled.png)

글자 전체가 포커스 됨.

포커스 컬러도 설정해줄 수 있음.

**inputType 속성 (중요함)**

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/423129cd-8ae4-4f1a-a68c-2739e07cfae0/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/1efeca55-302d-46c9-8e86-475ad7175a4a/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/3e91b9fe-b180-42e1-85b7-16845f4b3fe6/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/526be561-d234-40af-951f-47ba1ab1a8b1/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/4459644f-0545-4d2b-b242-f65cf73186c0/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/7daacc6a-3316-44fe-9510-fdee8fccb520/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/3a8d7628-7dc2-4623-a6d8-998f2b208d94/Untitled.png)

**Button**

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/3d68694a-65aa-489b-be73-686c09a40925/Untitled.png)

**버튼의 콜백함수 명을 onClick에 등록 가능**

Toast 화면 상에 한번 올라왔다가 사라지는 것.

**교수님 : 콜백함수 부분 알아둘 필요가 있음!**

### ImageView 간단하게 설명하고 넘어갈 것.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/4a732def-696b-4c49-b345-f29897f8e8e9/Untitled.png)

drawable 폴더, mipmap 폴더에 넣어주면 됨.

 **src 속성**

이미지의 주소값 입력

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/e17b96bd-7c78-44e3-82c3-f6673a5303b2/Untitled.png)

이미지는 그냥 넘어갈 거에요. 여러분들이 잘 읽어보세요

이미지 배치 어떻게 하는지 비율 유지 어떻게 하는지 한번 보세요.

## 이벤트

### 터치 이벤트

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/ba77e1a5-b87b-43bf-a366-b4854f1f8bfa/Untitled.png)

제어 흐름이 결정되어 동작을 처리하는 것.

터치 이벤트

- Down
- Move
- Up

### 터치 이벤트 전달 과정

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/593a76ba-fbb3-4fcc-931f-4835b1875603/Untitled.png)

### 터치 이벤트 수신 함수

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/800f9680-5866-4b66-904d-a959a7de8b42/Untitled.png)

액티비티 안에 뷰그룹이 있고,

뷰그룹 안에 뷰가 있음.

터치 이벤트는 액티비티를 통해 최초 전달

`dispatchTouchEvent()` 함수와 `onTouchEvent()` 함수를 오버라이드 하여 사용함.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/ef2abb06-a3d5-4eef-83fa-6c08032edc55/Untitled.png)

---

## 4주차 21.09.22

### 터치 이벤트 수신 함수

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/8ab7b905-7514-4fec-8e29-f055ece6877f/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/a8dac32e-8920-4c20-af7c-05588e441445/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/e6f43d85-5a22-4ed6-9933-a41aba312fce/Untitled.png)

`onTouchEvent()` 는 뷰 → 뷰그룹 → 액티비티 순으로 소비된다.

### 터치 이벤트 수신 함수의 역할

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/3bc3d4a4-ceae-4458-9f5f-98e7ea2948ec/Untitled.png)

### 터치 이벤트 리스너

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/25e43247-b7ee-4874-968e-5cdc94966dbd/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/731d690b-b0ee-4be0-a472-25975dcab87f/Untitled.png)

View를 상속 받아서 onTouchEvent를 오버라이딩 해야하는데 이것은 불편하고 번거롭다.

### 터치 이벤트 리스너란?

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/d4ffbec8-cf82-4c9e-b163-0662e2b50c9c/Untitled.png)

만약 OnTouchListener 인터페이스가 구현이 되어 있다면, onTouchEvent 함수를 호출하기 앞서

인터페이스 내에 onTouch 함수를 실행시킴.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/ddf19303-82e9-4469-aca9-2efb3bf30245/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/e7e41807-6ac1-4909-a858-ab04eb9049a9/Untitled.png)

제일 처음 실행되는 것이 `onCreate()` 

1. id값으로 button 객체 얻어옴
2. 터치 이벤트 리스너를 설정하고, 객체를 생성한다.
3. 클래스로 View.OnTouchListener를 구현한다.
4. onTouch 내에서 event.getAction() 으로 터치 이벤트 액션 정보를 얻어올 수 있음.
    - ACTION_DOWN : 0
    - ACTION_UP : 1
    - ACTION_MOVE : 2
5. onTouchEvent() 이벤트를 호출하기 위해서 return 값을 false로 설정.
6. onTouch에선 무조건 false로 리턴을 해야한다.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/d1e78f3f-fa4f-4b2d-93a7-26a05ded19d5/Untitled.png)

액티비티에 바로 View.OnTouchListener를 상속받아 바로 구현하는 법

1. onTouch를 바로 오버라이드 해준다.
2. setOnTouchListener(this)에서 this를 해줘도 문제가 안되는 것이, 터치 리스너를 상속받기 때문이다.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/8c47329b-3a7c-4af1-8970-a7f9a0ebf50b/Untitled.png)

View.OnTouchListener() 객체 자체를 익명 클래스를 만들어서 onTouch 재정의.

### 익명 클래스

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/86cf7fca-8c03-4efe-86f6-6a66e02e90e3/Untitled.png)

### 터치 이벤트 확장 - 클릭 리스너

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/59d3d2eb-63da-42d5-9b11-7d6fdb39f3f3/Untitled.png)

단순히 클릭했을 때 이벤트를 발생시키고 싶다면 onClickListener를 사용하면 된다.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/c3aa6675-ab1a-4283-bfa9-be78b4e9ced4/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/62e37ebc-bedb-4eb2-b917-d85199f4720a/Untitled.png)

특이한 부분은 switch 문에 v.getId()를 하게 되면 id 값을 가져온다.

### 더 편리한 클릭 리스너

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/430277f8-3a6c-48ae-8a87-360743edf33a/Untitled.png)

onClick 속성에 메소드를 등록하면 됨.

이렇게 하면 상속받을 필요 없다.

clickable : 클릭 리스너의 호출 여부, 기본 true임.

onClick 속성을 사용할 때는 clickable 속성 필요 없음.

### 한 개의 클릭 핸들러를 사용하여 다중 버튼의 클릭을 처리하는 방법

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/42e60b45-1c8f-4c92-bae6-10204f0fc8b9/Untitled.png)

버튼 id에 따라서 case 문을 다르게 처리하면 됨.

### 터치 이벤트 확장 - 롱클릭 리스너

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/713e339a-1119-4c64-8154-4f6edc439089/Untitled.png)

버튼을 0.5초 이상 누르고 있을 때, 쓰는 리스너

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/55b1bc57-b02b-48a1-8826-d1515eebfde8/Untitled.png)

구현하는 방법은 다음과 같다.

사실상 버튼이 하나밖에 없다면 switch 문이 필요가 없다.

---

### 키 이벤트란?

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/e182551c-91aa-4545-a585-8925e9d84692/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/2bf25e3f-ee9e-4e45-ac5f-00a5bd7c6ef5/Untitled.png)

포커스 : 키 이벤트를 전달받을 수 있음을 나타내는 시각적인 표시.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/9da40c7b-a149-4ce7-87c9-6aaeae863304/Untitled.png)

focusable 속성이 false 이면 포커스를 받을 수 있지만, 키 이벤트가 오지 않는다.

대부분의 뷰들은 focusable 속성이 true이다.

**키 누르면 포커스 되는 예제 그냥 넘어가심**

### onBackPressed 재정의 함수

뒤로가기 키를 눌렀을 때 앱이 종료되거나, 액티비티가 종료되는데 이것을 onBackPressed를 재정의 할 수 있음.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/256e7832-5aab-4a67-8ff5-53ad03844e3a/Untitled.png)

**onBackPressed 재정의 함수는 액티비티만 지원한다.**

### 키 이벤트 리스너

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/c186c0bd-16b0-4541-89d2-0d8f6e166bdd/Untitled.png)

키를 눌렀을 때 키에 대한 정교한 동작을 실행하고 싶을 때

OnKeyListener 상속 받아서 onKey 구현

ACTION_DOWN 인지,

KEYCODE_B인지

isLongPress()인지

조건문으로 구별 가능.

이벤트를 처리하고 나면 true값을 리턴.

아니라면 false를 리턴.

### Dimension 리소스 - 길이, 치수

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/21ab3a9b-f563-49ac-a0dc-6ede30adfd9b/Untitled.png)

px : 화면이나 이미지를 구성하는 하나의 점 단위

dp : 해상도와 관련한 밀도 독립 픽셀 단위

sp : 글자 크기와 관련한 밀도독립 픽셀 단위

in : 물리적 단위 2.54 센티미터를 1인치라고 함. 일반적인 길이 단위

pt : 물리적 단위 화면 1/72 인치를 1포인트라고 함. 인쇄 관련 단위

mm : 물리적 단위 1 센티미터는 10밀리미터. 일반적인 길이의 단위

### 픽셀

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/0a6ea270-bf1d-4a7d-9faa-72dce1d99184/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/2c2cc4bb-87cf-4132-9c60-32dacc71f1be/Untitled.png)

픽셀은 웬만하면 사용해서는 안됨.

### in, pt, mm

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/1c837baf-fe62-41d3-8439-d743d03a02e9/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/479562f7-5f60-40da-9904-5df0d66c5fc6/Untitled.png)

물리적 단위도 웬만해서 사용해서는 안 된다.

### dp

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/20db2f7b-72bc-47ed-ad84-be45170bf342/Untitled.png)

- dp는 밀도독립 픽셀 단위이다.
- dp는 화면 밀도 또는 해상도에 따라 각자의 픽셀 수를 달리하는 단위이다.
- 화면 밀도 또는 해상도에 의존하지 않는다.

픽셀에 대해서 유연하다.

### dp의 단위

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/f5ced274-7e18-4ed2-8ebc-de318c502479/Untitled.png)

1인치 160개의 픽셀이 배치되는 단말기 환경을 기준 밀도로 둔다.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/6d2c95e8-5acb-493a-b88f-46dc5f8b1423/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/64186437-0bb1-45ba-9ecb-1d0324805599/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/5888d7d6-04ea-4cdc-84bb-20cda3ad1e3a/Untitled.png)

320dip가 무너져 버림.

유연한 레이아웃을 생성하는 것이 중요하다.

---

### sp

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/85996a52-3639-4941-a998-0e19675c5125/Untitled.png)

글자의 크기. 10sp = 10dip 동일하다. 글의 대각선 길이.

### Drawable 리소스

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/634a3ed8-03ed-4d72-91cf-8b986ecf32af/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/a08dde19-8e1f-4d84-a2e7-48b104855036/Untitled.png)

비트맵 파일 리소스 사용하기

### 액티비티 실행과 인텐트

4대 컴포넌트 중에 아주 중요한 액티비티에 대해서 배움.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/e0f00ba8-854c-48f4-af8c-2f0b16ba79bc/Untitled.png)

화면 전체가 액티비티임.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/f84212b8-7dce-477c-ac72-1d3d75687896/Untitled.png)

맨 밑에 네모처럼 액티비티를 등록시켜줘야함.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/4d44f8ed-4191-4c58-b7f3-170b781aa7d8/Untitled.png)

새로운 프로젝트로 A앱을 만든다.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/0d20409f-38ce-4c1e-8cf4-61e699a4e1d5/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/ef879db1-1685-4f9d-acb5-b10d59b16954/Untitled.png)

### 인텐트란? 컴포넌트 간에 통신을 위해 주고 받는 메세지 또는 데이터 덩어리.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/38891516-05c3-43ac-998b-d5c8eb480bef/Untitled.png)

1. 인텐트를 생성
2. 액티비티 정보(패키지 이름, 액티비티 이름)을 설정
3. intent.setComponent로 설정해 줌.
4. startActivity(intent)로 B액티비티를 실행함.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/65211bb5-7bf6-474b-9ce6-2a7c85981601/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/253e5e47-ddd2-4432-beab-aa0e6cbb48c5/Untitled.png)

액티비티 이름을 넣거나 클래스 이름을 넣어도 무방하다.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/5260c392-bd7b-44fb-aac2-cb07d691f4fa/Untitled.png)

### 과제 1번

각각에 대해서 xml 파일을 만들어야 함.

터치에 대한 스켈레톤 코드를 줄 것임.

이번 과제는 `.xml` 파일만 잘 구현하면 됨.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/ca4b2d2e-3c09-4aad-9534-c753bc57d7bc/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/36b73525-d7a7-4087-9682-8026528e5aae/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/d18c7a8f-22a1-4fb7-a774-1dee25c5b70c/Untitled.png)

확인, 취소는TextView

나머지는 EditText

유의사항

1. project 파일 압축
2. apk 파일 제공

---

## 5주차 21.09.29

### 인텐트, 패키지 매니저, 액티비티 매니저

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/df002b2f-b4a9-45f0-9168-c089c1d48439/Untitled.png)

패키지 매니저 : 앱을 설치하고 삭제하며, 설치된 모든 패키지 정보를 수집

액티비티 매니저 : 안드로이드의 4대 컴포넌트들을 관리하며, 그 중 액티비티를 실행하는 기능도 가진다.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/f49b9500-e901-43b3-a56f-51bdaa3b5357/Untitled.png)

인텐트 : 앱과 통신할 수 있는 데이터 덩어리. (실행할 액티비티 정보)

### 실행될 액티비티에게 데이터 전달하기

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/a1016476-9b15-46ca-b053-91dfb67042fb/Untitled.png)

첫번째 인자는 전달하고자 하는 데이터 이름 Key 값

두번째 인자는 전달하고자 하는 데이터 Value 값

B액티비티에서 받아서 출력 가능.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/0ec48b59-ec74-412e-a3bc-30ecb4c86465/Untitled.png)

서로 다른 프로세스는 서로의 메모리를 절대 참조할 수 없음.

안드로이드에서 하나의 패키지가 실행되면 하나의 프로세스가 생성되며, 패키지의 모든 처리는 생성된 프로세스에서 돌아간다.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/53104bac-cdd1-406a-8447-7514c2b970ab/Untitled.png)

안드로이드에서는 IPC를 위해 Binder 제공.

통신 성능이 좋음. 리눅스 내부에서 커널 메모리에 있는 Shared Memory로 사용됨.

**핵심 : 서로 다른 두 앱은 Binder IPC를 통해서 데이터를 주고 받는다**

### 프로세스 간 데이터 전달

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/157f314c-9f12-4b15-865c-35219489b1ee/Untitled.png)

바인더(Binder)? : IPC 프로토콜

직렬화? : 여러 데이터를 메모리;에 직렬로 할당하는 동작.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/5ed39947-481e-4993-926d-7b0aea49cf52/Untitled.png)

데이터 타입의 종류가 다양하다.

**Parcel, Pacelable은 대충 설명하고 넘어갈게요 앱 개발할 때 사용되지 않아요**

### 데이터 덩어리 인텐트

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/4a431f47-e0cd-475f-8e1f-9da7acc45dad/Untitled.png)

**데이터를 직렬화해서 보내게 된다.**

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/db405bd1-2f39-4c41-9ce4-9083203b4825/Untitled.png)

Primitive 타입 : 가공되지 않은 순수 자료형

- boolean
- byte
- char
- short
- int
- long
- float
- String

프리미티브 타입의 변수를 클래스 내에 정의하고 객체화한다.

그런데 이렇게 보내면 데이터가 직렬화되지가 않음. 그렇기 때문에 Serializable 인터페이스를 사용해야함.

### 자바의  Serializable 인터페이스를 상속받은 직렬화 객체

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/cbbda15a-2f00-4a7f-a8af-0cc07f510497/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/cb77a18b-e89b-41f5-91c1-9075c1a86419/Untitled.png)

데이터 직렬화를 위해 버전을 넣어줌.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/8c5c6e9b-e519-4c8e-b1e8-83cdbb2c6ad2/Untitled.png)

Serializable 인터페이스를 그냥 알리는 용도일 뿐.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/d3e78a95-b6a1-4020-a05f-afee48524c13/Untitled.png)

Serializable이 정의된 클래스를 동일하게 넣어줘야함.

### 발신자 쪽 AActivity

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/cb167df7-57ac-4da6-af85-85ef3776f1d5/Untitled.png)

인텐트에 Serializable로 객체를 전달.

### 수신자 쪽  BActivity

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/1bce2629-3a01-4c6b-93cf-25a59e598cce/Untitled.png)

객체를 받음. 전달 받은 직렬화 객체 내용을 출력.

### Serializable 활용

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/4e15a732-d77f-4e32-9870-3ba7e5037e76/Untitled.png)

데이터를 주고받을 떄 효율적으로 하기 위해서 직렬화를 사용함.

- 파일로 저장
- 네트워크 이용해 서버 전송

### Parcel

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/833fea87-d008-48b9-8076-cc5a6d88767b/Untitled.png)

 Serializble보다 조금 더 진화된 형태의 직렬화 매커니즘이다.

성능이 더 좋아지는 장점이 있지만 사용하기 불편하다. **그래서 넘어간다**

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/ca24de30-4f64-475a-9c02-2666d4fa453a/Untitled.png)

### Bundle

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/d856119d-1d07-4d38-afec-7b499822ada5/Untitled.png)

- 번들은 클래스 파일 자체를 배포할 필요가 없다!
- 번들 클래스 자체로 통신하기 때문에.
- 번들은  Map과 같은 형식으로 사용된다. Key-Value 형태

### 번들 예제 : 송수신측에 번들 클래스를 넣어줄 필요가 없이 그냥 생성하면 됨.

발신자 측

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/c8879634-3360-4cb5-b2db-4845be4091a3/Untitled.png)

수신자 측

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/fd889156-ca59-4b8f-85f4-3aa5d1bea7c5/Untitled.png)

인텐트를 받아서 번들을 받음.

### 인텐트

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/d0525693-4293-4774-bf9a-7d03e0fe75f2/Untitled.png)

**저 변수들 + Component의 정보 = Intent**

인텐트 안에 이런 맴버 변수들이 존재함.

직렬화해서 다른 프로세스나 앱으로 전달됨.

`private Bundle mExtras` : 인텐트도 Bundle과 같이 각종 직렬화 객체를 포함시킬 수 있다. 바로 내부에 mExtras Bundle 객체가 있기 때문이다.

### 인텐트에 의미를 부여하는 여섯 가지 정보

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/986e92f4-0955-4a8a-b8fc-b98963fb8817/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/7ea131e9-8ff6-4c06-99fa-dc4f3e81a845/Untitled.png)

**인텐트의 주 목적은 특정 컴포넌트에 대한 실행 정보를 넣어서 해당 컴포넌트를 실행하고, 실행되는 컴포넌트에 원하는 데이터를 전달하는 것이다.**

### 인텐트

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/4a378186-082f-4476-a655-e5481ddb8752/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/c901aaf6-14e7-48dd-a42c-c459803efdbd/Untitled.png)

### 명시적 인텐트

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/4bff7edc-3d17-4b38-ae99-612eee30a786/Untitled.png)

pakage name과 activity name을 명시적으로 기술하고 인텐트에 컴포넌트 등록.

**A 앱이 외부 B앱을 실행할 때 명시적 인텐트를 사용하는 경우가 거의 없다.**

1. 외부 패키지는 정확한 패키지명과 컴포넌트 명을 미리 알고 있는 경우가 드물다.
2. 알고 있더라도 해당 단말기에 실행될 앱이 설치되어 있지 않을 수도 있다.
3. 외부 앱들도 보안상 자신의 액티비티를 외부에 공개하지 않는다.

따라서 명시적 인텐트는 **패키지 내부(하나의 앱 내부)의 다른 액티비티를 실행할 때**만 사용하는 것이 맞다. **외부 패키지의 액티비티는 암시적 인텐트를 사용**해야한다.

### 예시 : A app앱(패키지)에 A1, A2 액티비티를 추가한다.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/ff7420fa-a8c9-4bb0-8d07-c692faf4b695/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/217ccb84-9dff-4eb0-b6a0-bb130f359d48/Untitled.png)

`.xml` 에 등록해줘야함. application 태그 안에 activity 태그

패키지 네임 name에 생략 가능.

### A1 액티비티에서 A2 액티비티 실행 (명시적)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/015ef981-d313-492d-95e4-bdbc64466267/Untitled.png)

- 첫번째 인자 this : package 객체 자기자신
- 두번째 인자 class 이름.

두번째 방법이 더 좋다.

### 액티비티 컴포넌트의 공개 비공개

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/fa01c68e-1553-4ed3-bcac-2298ebe2bcec/Untitled.png)

**exported 속성**

- true 하면 외부에 공개 가능
- false 하면 외부에 공개 불가

암시적인 방법은 디폴트 값이 true로 되어 있다. 왜냐하면 암시적 컴포넌트의 경우 외부에 공개 목적으로 등록된 컴포넌트이기 때문이다.

### 암시적 인텐트

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/e8ad9759-b915-4ecc-a01d-857ae6744991/Untitled.png)

이렇게 외부앱 뭐 쓸지 물어보는 것이 암시적 인텐트.

어떤 의도만으로 원하는 컴포넌트를 실행할 수 있기 때문이다.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/aac560d5-cd8a-4d0e-b609-4e93d7c6fae2/Untitled.png)

A앱이 있는데 브라우저가 없어서 다른 웹 브라우저를 통해서 위 기능을 활용할 것임.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/2aa79f8b-cacf-4d12-9077-b5e47b642d39/Untitled.png)

## 6주차 21.10.06

### 의도 정보는 인텐트의 네 가지 정보를 통해 설정

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/17cfa5ad-e9a5-43a9-8fa3-9d76fc4b6fd9/Untitled.png)

1. 액션 : SMS 발송, 메일을 보낸다 등의 동작을 나타냄
2. 카테고리 : 액티비티의 분류를 나타냄. 
3. 데이터 위치 : 액션이 음악을 재생한다면 데이터는 음악 파일의 경로가 될 수 있음.
4. 데이터 타입 : mp3, wav, mov 등등 타입 지정

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/9acf7e67-9e3c-4c59-8c73-a193b615ebe4/Untitled.png)

### 액션과 카테고리를 이용하여 외부 계산기 컴포넌트를 실행해보자

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/a25f28db-690a-41f0-bd80-2721f21fe182/Untitled.png)

1. 인텐트 하나 생성
2. 액션 설정 ACTION_MAIN : 앱을 실행할 때 가장 첫번쨰로 실행하는 액티비티를 보여달라는 동작.
3. 카테고리가 계산기인 앱을 실행해달라는 것.
4. 액티비티 실행을 요청함.

### 액션과 데이터 위치

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/54ab024a-9ef3-4b6f-a378-e729598ae0e4/Untitled.png)

액션과 데이터 위치를 이용해 암시적 인텐트 유청하는 것.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/88020193-aabb-4501-98b5-681149291f23/Untitled.png)

ACTION_VEIW : 무엇을 보여달라는 액션.

네이버 URI를 보여달라는 액션.

---

### 암시적 인텐트

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/ba522985-6984-450e-9d11-a852d05862f9/Untitled.png)

- ACTION_MAIN : 모든 앱들이 다 나옴.
- ACTION_MAIN에서 BROWSABLE 카테고리 넣으면, 브라우저 카테고리인 앱만 나옴.
- ACTION_MAIN에서 CALCULATAOR 카테고리 넣으면, 계산기 앱만 나옴.

### 액션과 데이터 위치 및 타입

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/a1d27b66-a168-405c-8c5d-1a9f6c5722b7/Untitled.png)

버추얼 디바이스에 파일을 넣을 수 있음.

### 액션과 데이터 위치에 대한 명세 방법

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/c5bbb601-081e-43f8-b344-3da2980b8ab8/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/af2e2d7e-bf0a-455d-adbf-05ef073355e7/Untitled.png)

URI 클래스를 제공

### 안드로이드는 MIME 데이터 타입을 사용함.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/d121dd27-4068-441e-b027-a3df288bfb00/Untitled.png)

EX) 앞쪽 Type 뒤는 Sub Type

안드로이드는 MIME 형식의 규정을 따르고 있음.

---

### SDCARD에 MP3 파일을 넣음

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/ed14b1e8-eda3-4b76-be59-701642297a64/Untitled.png)

**데이터 타입을 따로 분리하면 안됨. 같이 써야함.**

### 데이터 위치 전달의 필요성

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/76534fbd-2825-43c8-be80-005198c1f2c6/Untitled.png)

데이터 위치를 사용해야하는 이유

1. 이미지 데이터 용량이 크고 다른 앱 프로세스에게 전달하려면 직렬화 객체를 사용해야함. 직렬화 번거롭기 때문에.
2. 이미지 데이터 자체를 전달하는 것은 리소스 낭비가 너무 심하고 성능이 좋지 않음. CPU 또는 메모리에 성능저하 발생.

**데이터를 전달하지 않고 인텐트를 통해 데이터가 존재하는 위치 정보만 전달한다.**

### 액션과 데이터 위치 설정에 따른 실행 예제

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/8cae6c54-0606-4ca7-b99b-c6e2fc388b03/Untitled.png)

### 암시적 액티비티 등록하는 법

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/a4356809-07dd-4b1e-86a7-448452f6d1ce/Untitled.png)

만약 A앱에서 암시적 인텐트 요청함. B앱에서 어떤 액티비티를 처리할지 등록하는 것.

B앱에 <intent-filter> 안에 액션에 동작을 정의 하고 카테고리에 DEFAULT 설정.

DEFAULT를 넣어줘야 암시적 인텐트.

DEFAULT가 없다면 명시적 인텐트임.

### 인텐트 필터

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/eed8dec0-ec54-4c60-9e71-5ab38d593368/Untitled.png)

필터링 조건

- 액션
- 카테고리
- 데이터 위치
- 데이터 타입

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/f14ad6b2-b474-4c66-90fa-1db1f3074629/Untitled.png)

이미지를 보여달라는 액션

암시적 인텐트를 실행하고 싶을 때 카테고리를 추가로 설정하지 않아도 된다.

왜냐면 startActivity에서 내부적으로 추가되기 때문에.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/0013676a-c62b-4609-bb7b-3643bd1c1994/Untitled.png)

암시적 액티비티로 등록된  <intent-filter>

위에 2개는 B앱 밑에 2개는 A앱

B앱에서 설정한 action을 A에서 setAction해준다.

그리고 startActivity 하면 강제로 카테고리를 DEFAULT로 넣어서 암시적 인텐트 전달.

두 개의 값은 서로 동일해야함.

**핵심 : 카테고리 DEFAULT는 암시적 인텐트 사용을 위한 카테고리이다**

---

### 카테고리 활용 방법

앱이 어떤 그룹에 속할지 지정.

그룹은 어떤 기능적 속성을 가지는지 지정.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/323a9947-3329-49c0-a1c4-e2e39e0b3bf2/Untitled.png)

카테고리 DEFAULT 설정 + 카테고리 APP_CALCULATOR 설정

### 카테고리와 데이터 위치의 활용 예제

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/0806e325-ec0b-4316-a43e-9c3d57895908/Untitled.png)

APP Indexing : 웹 사이트의 링크를 클릭했을 때 "내가 구현한 앱"으로 연결함.

### 카테고리 : BROWSABLE

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/1046da67-1be0-4767-b096-a437cba88fd2/Untitled.png)

웹 브라우저가 "내가 구현한 앱"을 접근할 수 있도록 허락함.

data 태그 안에

scheme : http 프로토콜

host : m.youtube.com

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/ccae69be-c3ee-453d-a0b4-c5adb96fd6bb/Untitled.png)

웹 브라우저에 있는 링크가 아니고 임의의 앱(이메일, 메모장)이기 때문에 BROWSABLE 카테고리에 추가되지 않음.

**어딘가에서 http이고 [twitter.com](http://twitter.com) 이면, 반드시 이 앱을 실행할 수 있도록 intent-filter를 걸어놓은 것.**

### 공유 버튼 클릭했을 때 AppCelerator란 앱이 인텐트 리스트에 나타나게 해고 싶다면?

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/fa4367d5-bd66-4c08-9b9f-b6f9d9482312/Untitled.png)

### 데이터를 누군가와 공유하고 싶다면

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/cce05940-4a30-4840-a82f-955868422700/Untitled.png)

label : 인텐트 리스트 안에 찍힌 글자

ACTION_SEND : 데이터를 누군가에게 전달한다 즉, 공유하는 동작.

mineType : 데이터 타입이 일반 텍스트

### 웹 브라우저로 등록하고 싶다면?

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/d385c508-a520-475d-ac73-ea265d71fe0a/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/5ccd48ed-b9a5-41a0-9ab2-a507fd6b386e/Untitled.png)

ACTION_VEIW와 http만 설정하면 웹 브라우저로 등록 가능.

밑에는 동영상 타입일 때만 MyWebBrowser 실행.

### 복잡한 URI 예제

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/d064f292-5b47-46cc-8789-b2b216be750b/Untitled.png)

A앱에서 ACTION_IMAGE_VIEW 설정.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/553e342c-91ef-480c-849d-2a3c1ea054d0/Untitled.png)

이런 요청의 암시적 요청에 대해서만 인텐트를 실행하겠다는 것.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/57956954-41e7-4e19-bffa-83a3594f7aa3/Untitled.png)

A 액티비티가 보낸 인텐트 받은 다음.

StringBuilder를 사용해서 정보들을 넣고 출력.

---

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/a994efb2-e796-4b55-b52b-f6070a358456/Untitled.png)

위는 A 액티비티, 밑은 B 액티비티

보내는 쪽에 액티비티와 인텐트 필터 안에 데이터 내용과 완전히 일치해야함.

하나라도 다르면 암시적 인텐트는 실행되지 않는다.

### 암시적 인텐트 VS 암시적 컴포넌트 인텐트 필터 비교

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/49ec076b-4787-4082-b3e8-e929629fc286/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/65eb71b8-f387-4563-ba46-af265ac832f3/Untitled.png)

### 인텐트 엑스트라

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/2ec4029b-25df-478f-81cb-55fb6ca1560e/Untitled.png)

엑스트라는 실행되는 액티비티에 전달할 순수 데이터다.

명시적, 암시적 인텐트 모두 사용할 수 있다.

putExtra 함수를 사용하면됨. 받을 때는 get'Type'Extra 사용하면 됨.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/747c4a0a-2d7e-4cea-8f60-264802a6687c/Untitled.png)

**이건 뒤에서 더 자세하게 설명할 것이기 때문에 넘어감**

setPackage는 잘 안쓰기 떄문에 넘어감.

---

### 액티비티 생명주기

# 아주 중요한 내용 꼭 기억할 필요가 있음 시험 100%

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/13d42bd0-6e69-4e85-af15-1e23f670b57d/Untitled.png)

### 액티비티 생명주기 함수

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/e656d739-4bbb-47d7-9ae1-72cc334f85f6/Untitled.png)

액티비티 상태 변화에 따라 적절히 대비를 해야하고 어떤 환경에서도 정상적으로 동작시켜야 함.

이 함수는 바로 액티비티 생명주기 함수.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/ea5c3993-ae75-41ad-afc9-f8b19f17258d/Untitled.png)

### 생명주기 함수들 오버라이드

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/28af255d-1ca2-4bb0-9a87-562299ef0c52/Untitled.png)

로그를 찍음.

### 재정의 함수 단축키

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/8c96abd6-7a0c-4d04-b417-f8ab3956ba36/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/71e343cc-6e4e-44e8-8143-b7306ade9df9/Untitled.png)

### 액티비티 실행과 종료 상태

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/8bc4dca0-f16e-4be0-806b-723206b1503c/Untitled.png)

액티비티 실행시

1. onCreate()
2. onStart()
3. onResume()

액티비티 종료

1. onPause()
2. onStop()
3. onDestroy()

### onCreate와 짝을 이루는 onDestroy

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/e40c09f3-6b3b-4caa-a30a-13738db372cf/Untitled.png)

onCreate : 레이아웃을 생성 및 설정, 액티비티 실행하기 위한 객체 생성 및 초기화

onDestroy : 오픈한 파일을 닫는 동작, **객체의 메모리 반환은 하지 않음 Dalvik JVM이 해제함.**

### onResume과 onPause

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/55a719fd-a807-4bd1-bd13-42c9040e8f2e/Untitled.png)

일시정지한 것 재실행.

onPause로 화면이 정지됨. 만약 '이전 키'를 누르면 다시 돌아와서 onResume 함수가 실행되며 재시작됨.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/bd5df678-c151-4678-8c52-0a2b06abbc31/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/6246bd22-0e3b-4833-8910-d6adf2edc901/Untitled.png)

**B 액티비티 등록**

**자신의 액티비티와, 실행할 액티비티 인자로 넣고 `startActivity()`**

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/d5ddad01-6448-47f9-a5dc-dc6fe635ee96/Untitled.png)

onPause는 현재 액티비티가 다른 액티비티로부터 부분적으로 가려져 방해를 받는 상태.

onResume은 현재 액티비티가 온전히 보이는 상태이다.

### 액티비티 정지와 재실행

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/167d7364-e554-48fc-a620-55eebb79f716/Untitled.png)

정지 상태 : 새로운 액티비티로 인해 현재 액티비티가 보이지 않는 상태 `onStop()` 함수.

가린 액티비티가 종료되면 onRestart → onStart → onResume

일시정지와 공통점 : 복귀할 때는 무조건 onResume 함수를 호출함.

## 7주차 21.10.13

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/624e37c3-635e-412e-a7ff-46ed132c44cb/Untitled.png)

1. A 액티비티에서 B 액티비티 실행
2. `onPause()` `onStop()` 실행됨.
3. Back 버튼을 눌러 A 액티비티로 복귀하게 되면
4. `onRestart()` `onStart()` `onResume()` 실행

### 화면 잠금에 의한 정지

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/014d487b-7acd-4c6d-bbb6-837ff059481d/Untitled.png)

Screen Off 되면 액티비티는 화면에서 보이지 않기 때문에 정지 상태임

화면 잠금을 해제하면 다시 원래 액티비티로 복귀함.

### 홈키에 의한 정지

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/51628d42-c92b-43cf-9d2f-e80dc9273bcd/Untitled.png)

홈키를 누르면 액티비티 정지됨. onStop 호출

그러고 재실행하면 onRestart, onStart 등등 호출함.

**화면이 가려진 액티비티가 정지되지 않는 경우 : 알림창이 화면을 완전히 가리는 경우는 어떤 생명 주기 함수도 호출되지 않는다. 이거는 기억하길 바라요**

### onStart와 짝을 이루는 onStop

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/5f95e444-7e7f-4d41-9389-30c739b92c4e/Untitled.png)

onStop은 현재 액티비티가 다른 액티비티로부터 완전히 가려진 상태.

onStart는 현재 액티비티가 온전히 보이는 상태이다.

onStart가 호출된다는 것은 정지된 액티비티가 실행된다는 것.

### 액티비티 강제 종료와 재실행 상태

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/128705a6-e3e0-48e1-8025-f307d1030bf4/Untitled.png)

화면을 돌리는 경우

`onPause()` `onStop()` `onDestroy()` 모두 거쳐서 강제 종료되었다가 다시 `onCreate()` `onStart()` `onResume()` 다시 실행됨.

SetContextView 함수가 호출되어야 한다. 이것이 호출되려면 onCreate 불러야 함.

### 가로 전용 레이아웃 / 세로 전용 레이아웃

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/1d9f3477-39c0-44fd-aee7-567c562965fd/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/591f7371-a3b7-4da3-977b-64e176773716/Untitled.png)

### 세로에서 가로로 화면 회전되면 onCreate에서 다시 setContentView (port → land)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/c52d0623-ff5e-4e3a-841c-a88acb4483d3/Untitled.png)

### onDestroy → onCreate 이런 것들을 호출하는 것은 성능을 저하

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/1baedcde-d73a-4dc8-88b6-e20d49671a14/Untitled.png)

`configChanges` 속성을 사용하면 화면 바꾸게 할 수 있음. 그럼 onCreate 기능 안해도 됨.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/87fea3f0-8d37-4d0b-90a8-d2109b0fa9f7/Untitled.png)

onDestroy 없이 onConfigurationChanged() 함수 호출

### 강제 종료와 재실행 상태

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/383c328c-21e5-4432-baac-5af0ba7d81a0/Untitled.png)

실행중이다가  다른 앱 실행시키면 onPause() onStop() 거쳐서 백그라운드 형태가 됨. 

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/5e2f82b6-7930-4b25-83b6-608ca5bc151b/Untitled.png)

홈버튼 누르면 백그라운드로 돌아감.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/7f234c2a-8367-40a9-b829-e2ad5f92d757/Untitled.png)

 강제종료 후 다시 실행되면 기존에 타이핑 해놓은 글자 다 사라진 상태.

### 액티비티 데이터 복원

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/e80d3078-bf02-496e-a9d7-e8ecc982a396/Untitled.png)

- onStart와 onResume 사이에 onRestoreInstanceState() 라는 함수 호출
- onPause()와 onStop() 사이에 onSaveInstanceState() 라는 함수가 호출.

백그라운드로 넘어가기 전에 위 함수에서 원하는 데이터를 백업시킴.

onStart 이후 백업된 데이터를 가져올 수 있음.

백업은 액티비티 매니저가 함.

onCreate 함수에서 읽어오는 방법도 있음.
  
### 데이터 복원

### 방법1 Restore/Save 메소드

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/d5a012ea-79bb-4b3d-bb0b-367184df1b5b/Untitled.png)

### 방법 2 onCreate

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/e1087bab-08d4-4c58-9872-8d51ae46b377/Untitled.png)

백업해둔 데이터가 이쪽으로 전달됨.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/64d7c93f-124e-4008-bb50-09e7d80497be/Untitled.png)

### 액티비티 간 데이터 주고받기

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/d67dbdaf-3fd2-4cfc-81df-b0c1d4daa58d/Untitled.png)

### 액티비티 간에는 서로 데이터를 주고 받아야 하는 경우가 많음.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/528e849c-f8e4-4155-ac36-843baa916033/Untitled.png)

### 액티비티에 데이터 전달하기

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/6d0c4346-4de5-4ca4-9c9a-20ade008ba15/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/c45d83ad-e6c5-46f5-94ee-91ee6192416c/Untitled.png)

### A 액티비티 설정

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/68ff0232-e5ff-4ba4-acf2-3093f49d4bb1/Untitled.png)

B액티비티도 하나 만듦.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/7333ccd3-6c30-47a4-b4c8-c088c3152303/Untitled.png)

B액티비티 .xml

### A 액티비티

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/701d79e4-430f-49e4-b5f5-7085da9766ea/Untitled.png)

A 액티비티에서 버튼을 누르면

1. 인텐트 생성
2. 실생하고자 하는 B액티비티 설정
3. Url puExtra로 넣어주기
4. startActivity

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/92e57e87-e4bb-4140-9ce5-34ecd0153870/Untitled.png)

버튼이 클릭되어 B 액티비티가 실행되면

1. getIntent로 받아옴
2. bundle에다가 intent.getExtras()
3. bundle.getString("키값") 하면 데이터 받음

**위 2번 3번 과정을 intent.getStringExtra("키값")으로 단축 가능**

### 실행된 액티비티의 결과 받기 과정

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/373ae5d5-9c12-45c9-936d-eeb4a44c39d3/Untitled.png)

특정 액티비티를 실행하고 그 결과를 다시 본래 액티비티에 받을 수 있음.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/9eb53de8-814f-40d8-9de3-52ecdd2ac08d/Untitled.png)

1. 사진 경로를 전달
2. 임의의 사진을 선택
3. 선택한 사진 경로를 다시 A액티비티로 전달

이때 startActivityForResult가 사용됨.

### startActivityForResult가 사용됐을 때 액티비티 B .java 설정

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/9e68c4c8-9425-4c7e-8dad-0bcf1827f2ff/Untitled.png)

1. 인텐트 새로 만들고
2. 인텐트 안에 파일의 URL 값을 putExtra로 전달
3. setResult 함수에 RESULT_OK를 인자로 넣고, 인텐트 셋팅
4. finish() 호출

실패했다면 RESULT_CANCELED 설정하면 됨.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/094e6f69-cabe-4d39-974c-603bc2b69e00/Untitled.png)

### B 액티비티 데이터 수신하는 onActivityResult()

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/c46ed73e-a8cd-47c6-aba6-a6f3c5a3ea09/Untitled.png)

resultCode 값이 RESULT_OK 라면

B 액티비티가 보낸 데이터 수신

### 전체적인 Flow

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/223e4d1a-310f-4e35-bc5e-34aa61a782a2/Untitled.png)

### 어떤 액티비티에서 받은 데이터인지 구분하기

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/ce92452b-e039-4c29-8089-ddfca098d96c/Untitled.png)

startActivityForResult 두번째 인자로 호출하면

나중에 받을 때 onActivityResult에서 requestCode로 다시 전달 받음.

그렇기에 어떤 액티비티의 결과인지 확인 가능.

### 액티비티 A에서 REQUEST_CODE

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/43a581e3-da91-43fe-9015-070443108fb6/Untitled.png)

REQUEST_CODE에 따라 처리하면 됨.

# 이거는 쓸 일이 없어서 그냥 넘어감@@@@@@@@

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/92187241-bea6-4aba-94c2-d95432992bb8/Untitled.png)

### 안드로이드 프로세스와 스레드

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/492ee7ec-5a89-4193-9bc7-99ca4e505640/Untitled.png)

### 안드로이드 프로세스와 스레드

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/4dcdad91-caed-40da-8045-bb3fb8d38d49/Untitled.png)

각 프로세스간에는 자원을 공유할 수 없다.

- 프로세스는 다른 프로세스 간섭 없이 완벽하게 독립적으로 처리된다.
- 만일 특정 프로세스에 문제가 발생하더라도 다른 프로세스에 영향을 주지 않고 자신만 종료하게 된다.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/3d13b782-1b22-4449-b2f3-a6e9babaf7b6/Untitled.png)

프로세스 내 쓰레드는 동시적인 실행을 하게된다.

**Concurrent 동시에 발생하는**

### 쓰레드 생성 방법

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/3b680fc5-9bf1-425c-8ca3-ece826862b92/Untitled.png)

쓰레드를 생성하고 처리할 코드를 추가하면 된다. run 함수 처리가 끝나면 쓰레드는 사라진다.

thread.start();

### 쓰레드 내부 클래스로 작성

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/9b71d989-7e36-4ca5-9b9a-34031904161c/Untitled.png)

### 쓰레드 익명 클래스로 작성

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/9b957adb-322b-41c8-8399-615b1c8a05f4/Untitled.png)

### 쓰레드 생성된 객체를 변수 할당 없이

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/9476c8cc-021b-46a8-b5d7-d2298e82e144/Untitled.png)

### Runnable 인터페이스를 구현 후에 Thread 객체를 전달하는 법 : 내부 클래스로 작성

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/54cb6eb7-93e3-48df-a602-d9d5d2e4a852/Untitled.png)

굳이 Runnable 인터페이스를 사용할 필요는 없음

### Runnable 익명 클래스

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/797c60e1-996e-4998-99f5-f52f77143c6c/Untitled.png)

### Runnable 생성된 객체 변수로 할당 없이.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/05c44be2-4927-48ba-9ba9-8667bcf7400b/Untitled.png)

### 동기화 문제 Race Condition

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/30e93605-e689-4015-b8a6-2929b701cd9d/Untitled.png)

자바에서 제공하는 synchronized 구문을 이용하여 공유되는 자원 사용 시 동시 접근 막을 수 있음.

### 프로세스와 쓰레드의 관계

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/589c22d9-ac64-4a9d-9c29-066dac7f501e/Untitled.png)

메인 쓰레드가 종료되면 종료됨.

메인 스레드는 각종 생명주기 함수들을 처리하고 화면에 그림을 그리는 등 역할을 함.

### ThreadActivity

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/bbeec03e-044d-4b5b-ba31-b5f40a172017/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/0da3d57d-bf2a-43b9-a1d0-383076fd7b97/Untitled.png)

onCreate 동작은 메인 쓰레드에 의해서 일어남.
  
---

## 9주차 21.10.27

개발자가 별도의 작업 스레드를 만들지 않는 이상 구현되는 모든 코드느는 메인 스레드에서 동작한다. 그러나 아쉽게도 모든 작업을 메인 스레드에서 처리할 수는 없다.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/56a41a40-0c81-4f29-acfc-f22f2dd55b62/Untitled.png)

1초 기다리고 4번 반복

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/b3b2abc5-5aa3-4fe2-92a9-aacf33a38997/Untitled.png)

4초전까진 메인 화면에 아무것도 안 찍힘.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/fecdd1b9-0dce-483b-9374-e96e13551b8e/Untitled.png)

onCreate 4초간 Sleep 하게 됨.

실제로는 onResume에서 뷰를 그리는데 onCreate가 4초동안 Lock이 걸려있기 때문에 화면 상에 아무것도 나오지 않음.

onClick에서 긴 작업을 수행한다면, 이것이 완료되어야지만 다른 버튼을 클릭할 수 있음.

# 메인 스레드에서 작업을 오래 처리하면 다른 뷰에서 반응이 느려지는 문제가 발생

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/db439dcf-7b27-4c74-ad78-fd0360146724/Untitled.png)

메인 스레드가 오랫동안 잠겨있는 것을 허용하지 않음.

메인 스레드가 5초 이상 잠기면 앱을 강제 종료시키기 위한 팝업 구동

이것은 ANR(Application Not Responding) 팝업이라고 한다.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/521495bc-f4ce-4e69-b64f-953bc4b57afa/Untitled.png)

터치 이벤트를 앱에 전달했으나 5초동안 받지 못함.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/87d75e2a-c98a-4a23-be30-4f6f3ab46e38/Untitled.png)

메인스레드에서

1. 디스크에서 파일 쓰기
2. 디스크에서 파일 읽기
3. **네트워크 사용**

**1번 2번은 가급적이면 하지마라, 3번은 아예 금지**

## 위 3가지 위반을 스트릭트 모드 위반이라고 함.

### Android Permission

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/e4554138-79f9-4441-97e2-804b101b9041/Untitled.png)

위 코드는 인터넷(네트워크) 권한 사용

### 여러가지 권한 종류

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/bfc93013-41c6-457d-9b63-a0d1aeb2d311/Untitled.png)

패키지 매니저가 .xml에 정의된 퍼미션을 살펴본다.

### 스트릭트 모드 예제

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/d35fdfc9-7302-4f60-92ab-f0e4485ea397/Untitled.png)

 메인 쓰레드 안에 google에 있는 내용 데이터 요청

### 런타임 권한 요청

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/f6ec6aac-ced0-48ac-a804-5fad5cc9f49a/Untitled.png)

앱 실행되는 중에 앱 권한 부여.

거부하면 앱 자체를 사용할 수가 없음.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/776a5c02-0e4d-481a-9007-d109a3692ef8/Untitled.png)

이 앱이 Call Phone 권한을 승인 받지 않았다면 if 문 안으로 들어감

if문 내에서 권한을 요청하게 됨.

한번에 많은 권한을 요청하기 보단 액티비티 별로 필요한 권한을 요청하는 것이 안드로이드 정책.

한번에 다 요청하면 보안 상에 좋지 않다.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/d72f437f-bbbf-40a8-9a2a-7575d3478586/Untitled.png)

requestCode별로 switch문 구성

사용자가 승인 버튼을 클릭했을 때. 클릭하지 않았을 때 if-else

### 여러 개의 권한을 요청하고 onRequestPermissionResult 구현 안함. 나쁜 방법

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/e67e639f-7337-4165-a8b1-a154c23e10d6/Untitled.png)

모든 권한을 한번에 요청시키는 방법. 이런 방법 비추

### 메인스레드에서 네트워크 사용 요청

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/2d3468d0-9a25-4864-8dd9-e5e3d1205932/Untitled.png)

메인 스레드는 스트릭트 모드로 절대 사용x

### 오래 걸리는 작업은 작업 스레드에서 처리하면 됨.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/00795af4-39ae-40ec-9864-d6a295f221f1/Untitled.png)

버튼을 클릭할 때마다 mCount 값을 화면 상에 출력.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/e88c1ca8-ae5f-4104-bd34-e435fcf1a5b6/Untitled.png)

이렇게 구현하게 되면 main 쓰레드의 ID 는 943 워크 쓰레드의 ID는 960

워크 스레드가 오랫동안 걸리는 작업을 하기 때문에 메인스레드 강제종료되지 않음.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/f3fdd062-5ea1-47d7-ab8f-798f788e8c87/Untitled.png)

### 메인스레드만 화면에 그리는 작업을 할 수 있음.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/76871a10-0405-4a28-ad9d-8a49cdc27076/Untitled.png)

### 작업 스레드 화면 구성?

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/7fe6b54b-c4ba-4fe9-9928-752104cafe11/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/8d3ccf32-be36-45f3-83ec-175940551894/Untitled.png)

UI 출력 안됨. UI쓰레드와 메인쓰레드만 UI를 조작할 수 있다.

### Handler에 넣어줌.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/af03fdfb-4e2d-478d-8e69-a76ecf7598ca/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/d2a1e8ce-9b3e-486c-9e92-caaef64c312a/Untitled.png)

이렇게 해서 작업 쓰레드에서 화면에 출력할 수 있는 임시방법을 사용함.

### 메인 스레드의 구조

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/cafb0f1c-855a-4047-967f-5313430458d1/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/e58b5c3e-6704-4541-b4e3-b99474e62a98/Untitled.png)

메인 쓰레드에서 run이라는 함수가 실행되면 Looper라는 객체에서 loop라는 함수가 실행되면 무한 반복함.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/4ad7e190-b475-4e46-8115-e4e2516ff94f/Untitled.png)

메인 스레드가 생성되면 Looper 객체를 만듦.

loop 함수를 실행함. 루퍼 객체는 메시지 큐 한개를 만듦.

loop 함수는 메시지 큐에서 하나씩 추출하고 추출한 메시지를 처리함.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/a53adb78-08b4-44a4-aa09-be6b20fadaf0/Untitled.png)

작업 쓰레드는 Hanlder 객체를 만들어서 Main Looper 객체를 참조하게끔 만듦.

해당 핸들러에서 Message를 생성.

생성한 Message 안에 실행할 코드를 담아서 메인 스레드의 메시지 큐에 넣는다.

### Looper 객체

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/ca5fc4ba-3059-43d7-a558-113b738ab58b/Untitled.png)

 loop 에서는 메시지를 빼서 처리함. 메시지가 없다면 메인 스레드는 Sleep 상태로 전환

### Handler 생성 예제

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/e1917c38-97d1-4f2e-aa36-7d2e81a40b00/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/2b282b5b-693d-48ba-86ee-3f7762172b9d/Untitled.png)

Message 객체에다가 mHandler, callback(Runnable) 을 담음

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/710b15fa-921e-4e19-81c6-88369d04d485/Untitled.png)

워크스레드에서 UI 처리하는 코드를 구현했지만 강제종료 하지 않고 메인 스레드에서 실행됨

### 메시지를 설정하는 방법 2가지

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/dffed773-e492-4f04-b7ba-36f4bec1ca47/Untitled.png)

1. Runnable 객체로 메시지 구성
2. 개발자가 직접 메시지를 구성하는 변수들을 설정함.

### 루퍼는 메시지 큐에서 하나의 메시지를 꺼내 두 가지 동작을 선택적으로 실행

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/29cbaf97-2140-47ec-82f6-b97737824460/Untitled.png)

### handleMessage

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/2506f38a-4b5f-49e9-a934-43d497cfa900/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/7136a202-8bc3-46c7-a596-705e603f16b5/Untitled.png)

onCreate 바깥에 mHandler 정의되어 있음.

handleMessage는 메인 쓰레드가 받는 리시버 메소드 역할.

msg.what으로 switch문 구성.

작업 스레드에서 설정한 message 값으로 mHandler.sendMessage 전달.

### 스케줄링이 가능한 메시지

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/0a5d28b3-c920-43cd-bb2d-5fa9ed1e5491/Untitled.png)

특정 시간 지나고 보내게끔 할 수 있음.

### 무엇을 사용해야하나?

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/913abfb3-ad13-4a35-a494-ea953f982b04/Untitled.png)

### 메시지를 생성하는 함수

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/2ac90a7f-253a-45c8-b44d-cd4d92174da4/Untitled.png)

### 핸들러를 통해서 생성 가능

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/05c61024-b581-4516-90cb-57ede7b8ae24/Untitled.png)

### 핸들러에 post로 시작하는 함수는 모두 Runnable 객체를 이용하는 메시지 추가 함수

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/1b8285e1-d56b-4c3a-9804-d3cab586726d/Untitled.png)

post 안에는 항상 Runnable 객체를 넣어야 한다.

### 핸들러에 send로 시작하는 함수

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/0d9dab01-9a38-4643-aafd-5e7525281d85/Untitled.png)

# 이런 것도 한번 쭉 훑어보길 바라요.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/78f869f6-dcbc-4057-b7d5-7d96f83df745/Untitled.png)

### 핸들러는 뷰와 액티비티 자체에 포함되어 있음.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/1f70266c-a3e0-4a5b-b274-f743cfbf4ba0/Untitled.png)

### 뷰의 post와 postDelayed 함수

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/67fa796c-f759-4346-b8ef-ff2af8153160/Untitled.png)

mCountTextView에 핸들러가 있기 때문에 post 메소드 사용 가능.

### 액티비티의 runOnUiThread 함수

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/b9ba5a11-7e86-4bd8-bcca-82ce2902d930/Untitled.png)

## 10주차 21.11.03

## 과제2번

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/a4513cd4-6bed-4c83-a55b-1aa91c9ad36b/Untitled.png)

HW2.apk 액티비티 2개

MyMemo.apk 액티비 1개

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/7445a59a-28c7-42d6-b0f8-c161c4c2ac70/Untitled.png)

텍스트 뷰

버튼을 누를 때마다 수식과 숫자가 업데이트 되어야 함.

'='을 누르면 계산 결과값이 나옴.

A+B-C*D= 할 수 있음.

가로 세로 4 * 4 테이블 레이아웃으로 구성

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/945013cc-ed23-4ccc-8b04-8a98b5fa3d5e/Untitled.png)

웹뷰 액티비티 실행

MyWebBrowser 액티비티 실행

화면 상에 웹을 보여줌.

EditText로 URL을 입력 받음.

WebView로 받음. 인터넷을 사용해야해서 INTERNET 퍼미션을 설정해야 함.

각 버튼을 누르면 이전페이지 다음페이지로 이동.

게산기 누르면 다시 Activity로 전환.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/1bf341c3-b916-45cc-b3ca-dbed5a1c8e44/Untitled.png)

1. EditText에 URL을 입력하면 해당 페이지로 이동.
2. 이동시  상단의 EditText의 주소 값을 이동된 URL로 변경해야 함.
3. 이전 페이지와 다음 페이지가 존재할 경우 이동할 수 있도록 + URL 변경 되어야 함.
4. 계산기 실행 버튼 클릭 시 계산기 액티비티 화면에 띄움.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/53ee547b-87ae-4650-b16b-a3e9aeaaf456/Untitled.png)

메모 전체로 구성.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/e362ebe3-76ef-4a68-ba4b-5507015319e8/Untitled.png)

1. Memo에서 URL 입력 후 길게 클릭하여 영역 지정 후 상단의 공유버튼 클릭
2. 암시적 인텐트 이용하여 MyWebBroweser 클릭
3. MyMemo에 입력한 URL 값으로 MyWebBrowser 실행

공유 버튼을 클릭하면 MyMemo는 선택한 문장을 MyWebBrowser로 암시적 인텐트 전달.

실행된 MyWebBrowser는 getIntent로 전달된 인텐트를 받아야 함.

Manifest.xml 액티비티의 특성을 적절히 설정해야한다.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/80ca056b-04d2-4de3-b14b-61b4b693a04e/Untitled.png)

MyCaculator를 이용하여 MyCalculator 클릭

getIntent로 데이터 받음.

= 입력 없이 자동으로 계산되도록 해야 함.

---

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/1b54922b-be9a-4931-b2f2-81f4d2055edd/Untitled.png)

HandlerThread는 다루지 않음

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/bfa69161-6f19-48d3-8285-eb7c8287e4f2/Untitled.png)

Helper 클래스 제공

AsyncTask

AsyncTask 재정의 가능한 함수 5개

- onPreExecute()
- doInBackground()
- onProgressUpdate()
- onCancelled()
- onPostExecute()

**doInBackground() 반드시 구현**

AsyncTask는 내부적으로 작업 스레드 하나 생성함.

시간이 오래 걸리는 작업을 doInBackground 함수에서 하면 됨.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/a38f45dd-d73f-4870-ab21-64c5c6fdd516/Untitled.png)

### AsyncTask Flow

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/d2df5932-53c4-4e66-8c88-62fbcbaad9e1/Untitled.png)

10개의 파일을 차례로 다운로드 하는 것.

1. onPreExecute는 UI를 보여주는 작업을 함.
2. doInBackground는 파일을 다운로드 하는 작업을 진행함.
3. onProgressUpdate는 다운로드 끝난 파일을 업데이트 해주는 기능.
4. 10개의 파일을 모두 다운 받았다면 onPostExecute 실행
5. 실행 도중에 중단되었다면 onCancelled 함수 자동으로 호출

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/e6ab315a-f5db-46e5-8bbc-59324b6f0d93/Untitled.png)

1. 액티비티 시작 - 파일다운로드 - onPreExecute
2. 다운로드 될 때마다 숫자 올라감. - onProgressUpdate
3. 다운 끝나면 Download Finish - onPostExecute
4. 다운 중단시키면 Download cancel - onCancelled

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/36704834-9663-42e6-82fd-51d3f5a13f46/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/749e608f-f9ce-4c3d-a88e-6daeebf4ee93/Untitled.png)

publishProgress 함수가 onProgressUpdate를 호출함.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/494d1839-719f-47a2-9109-4803a9daa42b/Untitled.png)

execute의 파라미터는 doInBackground 파라미터가 됨.

onClick 호출하면 파일 다운로드를 취소하겠다는 것임.

doInBackground 함수가 중단되는 것이 아님.

publishProgress 호출하더라도 onProgressUpdate가 실행되지 않음.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/bbbb264d-b392-4ceb-b4d7-9ef81e65a5d3/Untitled.png)

템플릿의 순서가 각 메소드의 파라미터를 결정한다.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/316af23a-7c8a-4ca3-8594-b29a94edd0ac/Untitled.png)

제네릭 문법

과제3은 AsyncTask를 사용함.

### CountDownTimer

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/5f1a9c63-9d72-4f2a-9dcb-2d305e2572f4/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/0e1d0441-e954-409b-95af-f8bf94ae0e46/Untitled.png)

millisInFuture → 최종 몇초

countDownInterval → 간격

1초마다 onTick이 호출됨. 

onTick의 millisUntilFinished는 남은 시간.(millisInFuture)

카운트다운 끝나면 0초로

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/aaed9b18-16eb-4fc1-9e80-ef11e714f48d/Untitled.png)

### 로그캣

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/d3cf9830-39e0-4dbe-b199-4bcdcd686f40/Untitled.png)

### Timer / TimerTask

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/a236f26f-aed9-4ac6-805f-169d36e05f5c/Untitled.png)

Timer 동작

Thread를 상속받은 클래스

TimeTask를 배열로 관리함.

### Broadcast Receiver

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/622221d6-bca6-40d7-a5c3-2a1fb5ba793f/Untitled.png)

가장 간단하고 쉽다.

전화가 오면 전화 받는 앱이 실행되어야 하고

배터리가 부족하면 실행 중인 앱들의 중요한 정보 미리 저장.

안드로이드는 시스템에서 벌어지는 일 중 앱들이 알아야 할 상황이 발생하면

방송 Broadcast 해주고 앱들이 수신기 Receiver를 통해 해당 상황을 감지.

Event → Event Hanlder(Callback)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/a2b0c98b-2fdb-4263-a98c-a60e1bc3b98e/Untitled.png)

방송을 보내는 주체

앱은 자신이 관심 있는 수신자(BroadcastReceiver) 일종의 event hanlder를 미리 달아두고

그에 맞는 처리를 수행함

Broadcast Event는 전체 방송이라고 보면 됨.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/918c774b-fd2d-4c07-9c48-0793efd20ecc/Untitled.png)

송신측 : 파일 다운로드에 대한 방송 보냄.

수신측 : 파일 다운로드에 대한 방송을 받으면 "다운로드된 파일명"을 토스트로 화면에 출력.

### 방송하는 액티비티 등록

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/2a83da76-f166-4e83-8f96-38db5ce082dc/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/f2d6e217-e611-46e8-bfcb-8171d8b88aef/Untitled.png)

### 액티비티 상속받은 방송

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/ad75b29c-c3ba-4c3d-a8d5-ae5a64903fe5/Untitled.png)

브로드 케스트를 보낼 때도 인텐트를 통해서 보냄.

setAction에서 앞에는 패키지명 뒤에는 action_방송명

파일 이름 인텐트에 포함.

**sendBroadcast 메소드로 인텐트를 전송**

### 리시버는 정적, 동적 리시버가 있다.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/a64b51e7-fa39-4f0b-a9ae-cea002af7d23/Untitled.png)

- 정적 리시버는 한번 등록하면 해제할 수 없고,
- 동적 리시버는 등록과 해제가 자유롭다.

리시버 등록

- 리시버 이름
- 인텐트 필터안에 리시버가 관심 있어하는 브로드 케스트 명을 넣어주면 됨.

**지금 A라는 앱에서 브로드케스트를 다른 앱도 보내고 자기 자신에게도 보내는데, 우리는 자기 자신에게 보내는 브로드케스트를 리시버로 받는 코드를 구현할 것임**

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/586c23c7-6c72-4b70-88df-f3b4753cfa07/Untitled.png)

1. BroadcastReceiver 클래스 상속 받음.
2. 클래스 정의
3. onReceive() 오버라이드 - 원하는 액션을 받게되면 이것이 자동 호출

onReceive는 event Hanlder라고 보면되고, 메인쓰레드 안에서 실행된다.

그렇기 때문에 onReceiver Function에서는 오래 걸리는 동작을 하면 안됨. 메인 쓰레드가 강제종료되기 때문.

sendBroadcast 메소드가 전달되면 onReceive 함수가 호출됨.

파라미터로 받은 intent 데이터에서 fileName 추출.

### 정적 리시버

.xml에 설정 해주면 앱 설치 시에 시스템이 자동으로 리시버를 등록해준다.

### 동적 리시버

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/ad027b92-9780-4955-9c43-acaf68154000/Untitled.png)

.xml에 등록 없이 런타임으로 등록함.

### 동적 리시버 등록 방법

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/64779c09-f06f-4200-898d-091db49b4ab4/Untitled.png)

1. 방송을 보내는 액티비티 안에  onCreate 메소드 내에 인텐트 필터 객체 생성
2. addAction을 통해서 관심있는 방송의 액션명 설정.
3. 브로드케스트 리시버를 객체를 생성하고 onReceiver 오버라이드
4. registerReceiver 메소드로 동적 등록

### 동적 리시버의 해제

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/cdcd1aa1-d6d8-4758-8e69-2dfa38e918b4/Untitled.png)

생명 주기 내에서 unregisterReceiver 함수로 해제해야 함. 아니면 메모리 누수가 발생함.

동적 리시버는 다른 컴포넌트에 귀속되기 때문에 다른 컴포넌트의 생명주기가 끝나면 동작하지 않는다.

# 동적 리시버를 등록한 액티비티가 종료되면 onReceive 호출 안됨

## 11주차 21.11.10

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/c15f6f96-1409-4257-b88c-7775afba585f/Untitled.png)

사용자가 스미싱 앱을 실수로 다운 받았을 때 앱이 실행되는지 모름.

리시버가 문자내용을 받아서 유출.

방송될 때마다 리시버가 동작하여 부하를 줌.

### 해결방법

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/7d80958b-d908-4552-8b51-7e2fafe26945/Untitled.png)

방송하는 인텐트 안에 플래그 설정. `FLAG_EXCLUDE_STOPPED_PACKAGES` 플래그 설정

**한 번이라도 앱이 실행되어야 정적 리시버가 동작할 수 있도록**

스미싱 앱 깔리고 한번도 실행 안됐는데 리시버로 정보 유출되는 것을 막기 위해

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/940ca642-8f83-4148-96b6-b67f9aeb30ca/Untitled.png)

No Activity 선택 후 receiver 추가

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/7020b23f-fb4a-4b6b-a6be-21787fc4782b/Untitled.png)

1. setAction 브로드케스트 FILE_DOWNLOADED
2. sendBroadcast

새로운 앱

1. onReceive 함수에서 intent 받음.

**방송 송신앱 : FLAG_EXCLUDE_STOPPED_PACKAGES를 자동으로 설정하여 인텐트 송신**

**사용자가 한번이라도 수신측(정적리시버) 앱을 실행하지 않으면 정적 리시버를 실행할 수 없다.**

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/27c7eca1-dc1f-4ae1-9ba4-3e1a160c4ecd/Untitled.png)

**FLAG_INCLUDE_STOPPED_PACKAGES << 실행하지 않은 앱이라도 정적 리시버 방송을 받아서 처리한다**

아주 위험함.

# 이거는 그냥 넘어갈 것임.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/c0270a78-3ee7-4d93-a5f6-a044405ce0c1/Untitled.png)

앱을 한번이라도 실행해야 방송을 받을 수 있음.

시스템에서 보내는 브로드케스트가 있음

- 스크린 온오프
- sms
- 전화
- 베터리

이것들은 정적 리시버를 많이 사용함

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/554684b6-67a9-4b42-a82f-a90bff72db81/Untitled.png)

오직 동적 리시버만 방송을 수신할 수 있는 인텐트 플래그

`FLAG_RECEIVER_REGISTERED_ONLY` 

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/05292540-60b8-4c7a-bf9f-53733875faaa/Untitled.png)

### 동적 리시버 추가

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/4056025d-1150-45c3-9f57-a265e131ceb0/Untitled.png)

인텐트 필터 생성

1. FILE_DOWNLOADED 액션 등록
2. 브로드케스트 리시버 등록
3. registerReceiver 

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/70bc734e-b9eb-4dc3-bb7e-52f0a71bb7d4/Untitled.png)

1. 리시버만 등록하면 부하가 큼
2. 빈번한 리시버 실행을 막는 법(안드로이드 시스템에서 발송하는 방송들은 이 두 가지 플래그를 많이 포함)

`**FLAG_EXCLUDE_STOPPED_PACKAGES` : 무조건 앱이 한번 실행되어야 리시버 작동하게**

`**FLAG_RECEIVER_REGISTERED_ONLY` : 동적 리시버만 동작하게 한다.**

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/0dd97895-25c4-4bf9-be03-c50395475000/Untitled.png)

`FLAG_RECEIVER_REPLACE_PENDING` : 동일한 액션으로 방송될 경우 중복된 방송을 제거하는 기능

3개의 브로드케스트가 하나의 앱에서 반복해서 방송되는 상황이 발생

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/1e3c5bb4-f62d-4225-bde8-e9b653381138/Untitled.png)

설정하지 않는다면 1, 2, 3 순차적으로 실행됨.

플래그 설정 해준다면 하나만 호출될 것임.

1, 2, 3 순차적으로 온 것 중에서 앞에 2개는 날라가고 3번만 수신

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/c55913fd-cbf3-47d3-858a-e1d1ff93c1a2/Untitled.png)

# 그냥 넘어가는 걸로 할게요.

### 리시버 제한시간

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/1fa1aa07-66cc-4f05-a6e2-a20330f0fbd3/Untitled.png)

메인 스레드에서 처리되기 때문에 제한시간이 존재.

10초 이상의 리시버가 동작하면 ANR 발생

버전에 따라 다르다.

**포그라운드 10초, 백그라운드 60초로 설정**

### 포그라운드 백그라운드 방송

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/6680a79a-30be-45bb-af2f-9c160726c2af/Untitled.png)

액티비티 매니저 서비스

- 방송큐가 두개 있는데 포르가운드 방송들을 우선적으로 처리한다.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/a32a8d0a-4e7d-475d-8b3a-5b09ef56d61d/Untitled.png)

방송큐에서 포그라운드 방송으로 설정.

리시버 수신측 앱에서 62초 동안 슬립함.

이렇게 되면 62초가 지나서 ANR(Application Not Responding)이 발생함.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/64c7f517-96e8-4faf-9fb5-70e59b2f6f49/Untitled.png)

60초 동안 처리가 안됨.

onReceive 안에서 웬만하면 짧은 동작을 하자 event hanlder이기 때문에.

브로드케스트 리시버를 work thread를 만들어서 실행해도 됨.

---

### 리시버 호술 순서 우선순위

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/a7829399-906e-48ba-a29e-b43ca07af146/Untitled.png)

보통 호출 순위는 무작위 순서

정적 리시버 같은 경우는 설치하고 먼저 실행한 앱이 우선적으로 실행

특정 리시버의 우선순위 변경.

### 정적 리시버 여러개

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/992a7757-d8f3-42f2-a66c-6f595db9668b/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/59fcfd40-9a00-49e7-888a-7d3e0598af10/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/457d2db8-069c-42fb-9ea5-b1c67c3459f1/Untitled.png)

**설치하고 실행한 순서대로 로그가 출력된다.**

정적 리시버는 동시에 처리되지 않는다.

하나의 리시버 처리의 지연이 발생되면 이후 다른 리시버가 늦어지는 구조이다.

### 동적 리시버 호출 순서

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/509a4b25-d426-4601-b989-01d26764f746/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/5a932730-8bba-4036-918f-07ddd59204d0/Untitled.png)

# 정적 리시버와 달리 모든 리시버가 동시에 실행. 순서대로 실행되는 정적 리시버보다 빨리 처리된다.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/3b7fb8d4-f953-44f7-aaeb-5f57822fbeba/Untitled.png)

동적 리시버에서 인텐트 필터에 setPriority 1로 설정

0이 Default이고 숫자가 높을 수록 우선 순위가 높다.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/5bd3c157-5e3e-4b18-936b-c37987a7115b/Untitled.png)

# 실행은 우선순위로 되나 실행 종료는 랜덤이다.

### 정적 리시버 우선순위

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/d968202c-149b-42cb-93a1-8a8f1b65ab2c/Untitled.png)

### 동적 리시버처럼 순서대로 처리하도록 하는 방법

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/189da0d3-75c2-496a-a611-3e60ba9bb9db/Untitled.png)

**sendBroadcast 대신 sendOrderedBroadcast를 사용하면 순서대로 처리됨.**

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/d3ba885d-4c27-47ef-a26e-83c545cda0b4/Untitled.png)

이것을 사용하면 동적 리시버도 정적 리시버처럼 순차적으로 실행 가능.

### sendOrderedBroadcast의 특별한 기능

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/2c8858d0-5003-42c5-a6b3-cba45c3cb6ee/Untitled.png)

**특정 리시버가 방송을 수신했을 때 다른 리시버가 방송을 받지 못하도록 중단함.**

**abortBroadcast 를 걸어버리면 이후 뒤 따르는 동적 리시버 더 이상 실행 안됨.**

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/15f07764-39f2-4ffc-85b2-0adada15f93d/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/d202d3c8-8aaf-401c-829d-35ba0edf51d7/Untitled.png)

메시지 앱 3가지가 설치되어있다고 가정.

가장 먼저 SMS를 받은 앱이 리시버를 처리하고 나머지 앱은 처리하지 않도록 중단할 수 있음.

### 특정 패키지에만 방송

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/18d3daad-d591-4476-8fdf-a815b50347da/Untitled.png)

Receiver3에만 방송하기.

### 방송 수신

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/67b77d5d-5a15-4698-baf6-13c21882d37f/Untitled.png)

### 시스템이 하는 방송 수신하기

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/29a0d851-1420-4299-b7f2-ff0dadf9f2a3/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/3e7788ff-e73b-491d-b7b7-af562efaa41f/Untitled.png)

1. 리시버 구현한 앱을 정적 리시버니까 한번 실행시킴.
2. 화면을 오프
3. 화면을 다시 On
4. 화면 상에 아무것도 출력이 안됨? 리시버가 수신 못함.

시스템이 화면 켜짐 방송을 할 때 FLAG_RECEIVER_REGISTERED_ONLY가 자동으로 설정되어 있음.

정적 리시버는 이것을 받을 수가 없음. 동적 리시버만 받을 수 있음.

### 동적 리시버로 변경

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/7ccc0052-012b-4808-b4ba-8ae88b6d8f8d/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/8b1cad67-132b-4f96-a893-c09eda371607/Untitled.png)

인텐트 플래그 정보를 공식적으로 기술하지 않음.

### 시스템 방송 정보 알아내기

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/9bec9116-097b-46c4-a9de-7ad7326b89a6/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/b08fd075-4e73-4683-89ad-75e7dac0a661/Untitled.png)

# 그냥 넘어갈게요. 어떤 플래그가 들어있는지 확인할 수 있음. 여러분들 읽어보세요.

### 베터리 감시

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/2d1dcd98-28ac-4b33-9bcb-d44c9222c419/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/93748853-b671-4433-bf1f-54334a6b0213/Untitled.png)

### 베터리 감시 예제

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/7bfb4e87-f369-4e34-8894-7bc56123827b/Untitled.png)

- onResume에서 동적 인텐트 필터 등록
- onPasue에서 unregisterReceiver 하는 코드
- onReceive에서 전달된 액션명을 인텐트를 통해서 확인할 수 있음.

배터리 충전상태가 변경되었다는 ACTION_BATTERY_CHANGED 메소드 안에 아주 많은 정보가 들어있음.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/66ce29db-4b8a-4c20-8412-a242d67adfc0/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/d733759c-627b-4347-b60a-6c6f3ad7358c/Untitled.png)

에뮬레이터를 통해서 베터리 상태를 인위적으로 변경할 수 있음.

### Local Broadcast

이때까지 배웠던 것은 Global Broadcast

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/015ef956-4c3b-4499-91e7-a99fe1f3241b/Untitled.png)

한 앱에서 액티비티1, 액티비티2, 브로드케스트 리시버가 있음.

액티비티1에서 A 이벤트를 발생해서 리시버에서 처리하고

액티비티2에서 B 이벤트를 발생해서 리시버에서 처리하고

한 앱 내에서만 이벤트를 발생하고 처리 가능한 브로드케스트 리시버를 구현하고 싶음.

이것이 Local Broadcast

Global Broadcast의 문제점

⇒ 프로세스의 경계를 무시하고 안드로이드 시스템에 등록된 모든 리시버에게 전달. 행동을 제3자가 알 수 있기 때문에 보안 상의 문제가 될 수 있다.

앱의 리시버는 브로드케스트가 전송될 때마다 리소스를 소비함.

만약 악성앱이 이 유명한 앱을 디컴파일하면?

앱이 발생시키는 브로드케스트 액션을 일일히 확인함. 각각의 액션 명에 대해서 구현을 함.

악성 앱이 공격할 수 있는 시발점이 될 수 있음.

어떤 앱의 내부 행위를 알 수 없도록 하는 것이 중요.

## Local Broadcast는 브로드케스트를 발생시킨 앱 밖으로 전달되지 않음.

### Local Broadcast 보내는 방법

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/0d4cef11-8e12-46d1-883b-814b8775db1a/Untitled.png)

`broadcastManager.sendBroadcast(intent);`

### Local Broadcast 수신하는 방법

**동적 Broadcast로만 받을 수 있음!! 정적 브로드케스트로는 수신 불가**

1. 액션명 삽입
2. 브로드케스트 리시버 객체에서 onReceive 구현하고
3. 기존의  Global 브로드케스트는 registerReceiver만 있었지만 로컬은 LocalBroadcastManager.getInstance(this).registerReceiver(구현한 객체, 인텐트 필터);

---

### 서비스 컴포넌트안에 동적 브로드케스트 리시버를 등록하면?

LocalBroadcast에서 Send를 하면, 서비스 안에 등록된 것도 전달됨.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/f9155137-d918-446c-aa1f-41b2558392e3/Untitled.png)

서비스를 상속받음.

onReceive로 전달된 인텐트를 processCommand에다가 전달

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/f90ad821-b818-4da8-acfe-ab231d1084cd/Untitled.png)

어떤 동작을 실행할 수 있음.

## 12주차 21.11.17

## 서비스

- 안드로이드 4대 컴포넌트 중 제일 어렵고 중요한 컴포넌트
- 개발시에는 액티비티가 가장 많이 쓰이지만, 시스템 측면에서는 서비스가 가장 많음.
- 안드로이드 시스템 자체가 대부분 서비스로 이루어져 있고, 심지어 액티비티 실행을 위해ㅑ서도 서비스를 사용하고 있음.
- 눈에 보이지 않고 백그라운드에서 동작함
- 액티비티와 달리 화면을 가지지 않고 백그라운드에서 동작
- 특정 기능을 제공하는 컴포넌트라서 서비스라고 불림.

### 초당 1씩 증가하는 카운터 기능

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/b8b597c6-55a4-41b4-b58b-e752b3d9d9cc/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/10c06a30-8b3c-4b8a-96e6-caad8b4c79b2/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/f2e85143-4c01-44b8-97bd-1a5c642d4f9d/Untitled.png)

- start_count_btn : 1초 자다가 1씩 증가시킴
- stop_count_btn : 현재 count 0되는
- show_cur_number_btn : 현재까지 카운트된 수치 보여줌

카운트 시작을 쓰레드로 구현해야함.

### 쓰레드로 구현한 예제

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/1d0ce6ab-54fa-47d5-872d-7bc1cee6b257/Untitled.png)

interrupt 실행중인 스레드를 종료시킴.

### 액티비티 종료

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/1d3f31c5-a58e-4385-8d10-c0b2d94f2753/Untitled.png)

액티비티가 종료된다고 해서 메인 스레드가 종료되는 것은 아님.

루퍼 객체의 loop에서 대기중.

APP의 강제종료가 있어야 메인 스레드가 종료된다.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/1aec2ba5-e89a-4358-a27d-f598f07df45a/Untitled.png)

종료하고 다시 실행하면 Current Number는 0임. 근데 CountThread는 계속 돌고 있음.

메인 스레드가 생성한 자식 스레드는 계속 실행 중임.

다시 앱을 실행하게 되면 mCurNum이 0으로, mCountThread가 null로 초기화 된다.

새로 액티비티 실행하면서 nCountThread가 null로 됨. 그래서 이전에 생성했던 자식 스레드 컨트롤 불가. interrupt로 종료도 못함.

### 이런 문제를 해결하기 위해서 서비스가 필요하다.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/080e8114-fe12-4265-93d4-30f6a6260a3a/Untitled.png)

- 다른 컴포넌트(액티비티 등등)가 종료되더라도 백그라운드에서 독립된 동작을 수행한다.
- 다른 외부 앱에게도 그 기능을 제공하고 싶을 때 IPC, RPC 사용 가능.
- 서비스는 2가지 종류가 있는데 스타티트 모드와 바운드 모드가 있음.

### Open API 사용법

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/02843e1a-7dab-4479-91d6-d6210ccbc367/Untitled.png)

개발자들을 위한 Open API

데이터 제공 방법

- 웹 서비스를 통한 데이터 전달방법 : XML, JSON, RDF
- 프로그래밍을 위한 라이브러리 제공 : 클래스 또는 프로그래밍 API

 

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/f6108189-03ed-4893-9cab-2287b900cc9c/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/493ec32c-705b-4184-acfe-dcbafba96c55/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/6652a3d3-b467-4745-8c69-79200d5ca780/Untitled.png)

인덱스 1번부터 10번까지 데이터를 요청함

측정장소인 7번은 선택이어서 안넣었음.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/0231d409-4990-4308-b092-d477291ff559/Untitled.png)

### Json 형태로 받는다면?

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/f9b4463f-8835-4422-b16f-32fe66c6fc19/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/e0d2cddd-6d46-4a25-bdd4-70a759b14b90/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/f8ccd5ae-0d20-443c-ad7f-ea90ffdb2341/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/f4d1589f-2b71-409e-88f0-ecde49912b5f/Untitled.png)

### 안드로이드에서 JSON 데이터 파싱할 때 jsonreader 를 사용함.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/777776b3-9fc1-49cc-b98a-e8db867ab39f/Untitled.png)

1. **Url을 통해서 InputStream 객체를 얻음.**

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/684f147b-7689-4f47-9706-1ca5eb79dd9f/Untitled.png)

1. readJsonStream 메소드를 통해서 가져옴.
2. reader.beginArray와 reader.endArray로 배열의 끝과 끝을 소비.
3. 그리고 readMessage로 전부 읽어냄.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/224e6fee-d3cb-4fae-988b-ac6342e2fd34/Untitled.png)

reader.beginObject를 하게 되면 객체를 소비

이후에 hasNext를 통해서 while문을 돌리고

reader.nextName으로 String 값을 가지고 옴.

내부 객체 데이터를 얻기 위해서 readUser() 함수 호출

### readUser()

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/595fb7fb-912a-4940-8322-721b7bbc9fee/Untitled.png)

### 스타티드 서비스

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/1117e3c5-2db9-4042-b9cd-ed1391757848/Untitled.png)

음악을 다른 앱 하면서 들을 수 있는 이유 : 음악 재생 서비스가 계속 백그라운드로 실행됨.

음악 파일 재생 서비스는 앱 내/외부에서 독립적

### 바운드 서비스

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/c078ee07-65e2-4bd1-a02a-eb21783dcc67/Untitled.png)

바운드는 외부 라이브러리를 사용하는 것과 매우 유사함.

서비스로 연결될 컴포넌트는 서비스의 함수들을 마치 라이브러리를 가져다 사용하듯이 쓸 수 있음.

내/외부 앱과 계산 서비스의 관계는 서로 의존적임.

서비스를 요청한 컴포넌트가 종료되면 서비스 연결도 끊어진다.

- 내부에 있는 액티비티가 내부에 있는 서비스에 요청할 수 있고
- A 앱에 있는 액티비티가 B 앱에 있는 서비스에 요청할 수도 있음.

### 스타티드 서비스와 바운드 서비스의 조합 형태 서비스

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/475489f3-7bb3-4c1e-8f1c-0bed4b08c4de/Untitled.png)

- 스타디드 서비스를 이용해서 재생 정지를 할 수 있음
- 바운드 서비스를 이용해서 앱의 일시정지 등의 서비스 제어

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/b7b2394c-7c31-4327-be04-f44a712f5842/Untitled.png)

### 스타디드 서비스의 생명주기

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/cfe30353-f9cb-43df-8bb7-4322b7fd6c33/Untitled.png)

스타디드 서비스와 바운드 서비스의 생명주기가 다르다.

### 서비스 시작 중에 다른 컴포넌트가 서비스를 실행하면 onCreate()가 다시 시작되는 것이 아닌 onStartCommand 함수 다시 호출

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/b0f9f37c-ae72-43c3-b158-913c47c70b44/Untitled.png)

onBind 함수는 바운드서비스에서 사용되는데 스타디드 서비스에서 사용되지 않으나 구현이 되어야 해서 비워둠.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/72b23baa-107e-4c72-ad5d-e2471454e02c/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/9b6f6b07-44c4-41b4-b058-4bc26c9d3fbd/Untitled.png)

start 버튼을 누르면 서비스가 실행되고

stop 버튼을 누르면 서비스가 종료됨.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/9f757452-54fd-462f-ba06-cc083a8b489c/Untitled.png)

### 만약 onStartCommand를 실행했고 그 다음에 onStartCommand를 다시 실행하면 onCreate는 실행되지 않고 onStartCommand가 한번 더 실행됨.

### CountService

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/5b888520-e01a-4927-9d10-319f3a7ffa38/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/e5724891-ead5-4c14-8ae1-4dfc1fc927ba/Untitled.png)

# 서비스는 기본적으로 메인 스레드에서 실행

서비스의 특징이 백그라운드에서 돌아가는 거라고 생각하기 때문에 작업 스레드와 유사하다고 착각함. 하지만 이는 메인 스레드에서 실행된다.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/b8e3bafd-2a53-46d7-a9b6-41cb5eaebd72/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/d9ca8580-0cc5-4b5b-83ce-33cf11e0c750/Untitled.png)

main 쓰레드가 814인데 전부 TID가 814임

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/d8914f69-f8be-414a-899f-0fb1ee44224f/Untitled.png)

스타티드 서비스의 목적이 백그라운드에서 오랜 시간이 걸리는 작업을 처리하는 것.

이것은 작업 스레드에서 별도로 처리되도록 만들어야 함.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/747faa29-1c56-40f2-866c-b58485fbd566/Untitled.png)

작업스레드를 사용한 경우

## 13주차 21.11.24

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/8288918e-d79d-463b-b298-5887e64eb121/Untitled.png)

백그라운드에서 동작 중인 서비스 stopService 함수를 통하지 않고도 죽을 수 있음.

앱 하나를 실행하다 홈 화면으로 나가면 백그라운드에서 서비스 실행 중.

시간이 지나서 앱을 실행하면 메모리 때문에 강제종료를 시켜버림. 그래서 처음부터 실행됨.

**예전의 상태가 사라지게 된다**

swap space는 메모리에 데이터를 Disk로 넘겨서 저장하는 방법.

안드로이드는 이것을 사용하지 않는다. 하지만 enable 시킬 수 있다. << 이것은 여러분들이 찾아보기 바래요.

### 안드로이드 시스템의 정책

메모리가 부족할 때 시스템은 다른 앱의 프로세스를 주깅고 메모리를 확보하게 된다. LMK가 담당

**LMK(Low Memory Killer)**

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/de5b9ad2-632f-48be-bbc7-41497c571182/Untitled.png)

### LMK의 앱 종료 정책

우선 순위를 매기고 가장 우선순위가 높은 앱 프로세스부터 죽여서 메모리 확보

커널에서 프로세스 종료 정책 : OOM Killer(Out of Memory Killer) << 커널 내용은 언급안할 것임.

User process든 Kernel process든 적절한 프로세스들을 종료시킨다.

OOM Killer의 동작 시점은 이미 swap space를 포함한 전체 메모리가 거의 full 상태가 되었다는 것을 의미

안드로이드 커널에 LMK의 추가

LMK은 커널에 있지 않기 때문에 USER SPACE에 실행되는 것들만 종료시킨다.

LMK의 실행에도 불구하고 극도로 메모리가 부족할 경우 OOM Killer가 실행되어 user + kernel 프로세스 전부 종료.

### LMK의 대상이 되는 우선 순위 : OOM ADJ

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/fb48e484-12f4-4773-b6c8-245ad161607d/Untitled.png)

**백키를 눌러서 종료된 앱이 제일 우선 순위가 높게 종료시킨다.**

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/cbca9ccd-9a7b-4e72-bd92-a87160cee731/Untitled.png)

순위가 높을 수록 가장 빨리 종료됨.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/d5090753-03f7-4cc6-81c2-30b2565dc14a/Untitled.png)

스타티드 서비스가 시작한지 30분 정도 되어야 강제종료할 수 있게 어느정도 INTERVAL을 준다. 그 이야기를 하는 것임.

### 강제 종료를 막을 순 없지만 메모리의 여유가 생기면 재실행 시켜줄 순 있음.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/0d5acae2-8365-42bf-84c7-e151295c0c56/Untitled.png)

START_STICKY 반환값을 넣어주면 됨.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/5c075aae-2fa3-4b2e-a1a2-df0ef88f888d/Untitled.png)

**다시 실행을 원치 않을 때는 START_NOT_STICKY를 반환시켜주면 됨.**

### 스타티트 서비스에 대해서는 요정도 설명하고 넘어갈게요

### 인텐트 서비스(많이 사용됨)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/b858636a-8c1b-4f45-86bd-44f20c97b202/Untitled.png)

스타티트 서비스의 파생 클래스

클라이언트 앱이 서비스 앱에 인텐트를 전달하게 됨. 그럼 서비스앱이 그것을 받아서 처리함.

**인텐트 서비스의 역할은 순차적으로 인텐트를 실행하도록 해주는 것이 역할임.**

### 인텐트 서비스를 이용하지 않는 카운트다운 서비스

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/6bcaf802-d2ae-4bf9-ae8b-71abda6cc470/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/5f361390-3e4d-4b24-b2b7-6e7c4e4d1e55/Untitled.png)

### CountDownService 코드

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/183a46c3-1bf1-475f-952b-f12929cd3134/Untitled.png)

1. 인텐트로 전달된 mCountdownNum을 받음.
2. mCountdownNum에 따라 쓰레드 내에서 처리됨.
3. 이때 서비스 종료하는 방법은 stopSelf라는 함수를 사용함.

클라이언트의 stopService 호출 없이 서비스 스스로  종료 가능.

또 다른 서비스 요청에서 onStartCommand가 한번더 실행

제일 처음 것은 1, 두번째는 2

종료할 때 인자로 startId를 넣음.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/d4a902f5-fca5-45da-a9a2-eea1edeb9dd4/Untitled.png)

**동시에 버튼을 빠르게 눌렀을 때**

mCountdownNum이 여러개의 워크쓰레드에서 공유되고 서비스가 날라올 때마다 오버라이트 됨.

동기화 문제.

### 동기화 문제를 해결하기 위해서 IntentService

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/985f7423-15b4-4d71-a525-2da22e8cef7b/Untitled.png)

onStartCommand를 onHandIntent로 교체해주면 됨!

**주의 : 쓰레드 생성하지 않고 쓰레드 내에서 돌아갈 코드만 생성**

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/418334b3-7ed7-437c-b5fa-5ad034b198bb/Untitled.png)

각각 전달된 인텐트를 동시에 실행하지 않고 차례차례 실행한다.

1. onHandleIntent 함수는 별도의 워커 스레드에서 동작해서 ANR 걱정할 필요 없음.
2. 동기화 문제가 자동으로 해결

### 활용도가 아주 높음

스타티드 서비스 구현 시 인텐트 서비스를 사용하는 것이 구현이 간단함.

기존 스타티드 서비스 구현 시 발생할 수 있는 동기화 문제 해결 가능

### 바운드 서비스

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/f8d366d4-74b4-4b40-a1a2-f34ee3780ead/Untitled.png)

`onBind` : 특정 앱에서 서비스를 연결할 때 호출됨

`onUnbind` : 서비스를 해제할 때 호출됨.

### 바운드 서비스로 1초씩 증가하는 수를 받아오는 것.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/b7328b2c-207a-4519-994e-50bf7c7b3c43/Untitled.png)

### **바운디드 서비스를 사용할 클라이언트 앱을 구현함**

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/d25ba713-0742-4812-ae6e-49dd11c1dcab/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/dcc6507e-30ff-4d63-95b2-ab67e5f0f43b/Untitled.png)

onClick을 하게 되면 startService / stopService 호출

`onServiceConnected` 클라이언트와 서비스가 연결되면 함수 호출

`onServiceDisconnected` 클라이언트와 서비스 연결 해제되면 함수 호출

onCreate 함수에서 연결 시도함.

`bindService` 함수를 호출하면서 인텐트, mConnection, BIND_AUTO_CREATE 넣어줌

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/b0eb1c3e-eecf-4eda-b661-227e359af332/Untitled.png)

### 그치만 onServiceConnected가 호출되지 않았다. 왜 ??

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/6482ec53-7b8f-4e3e-a3da-b124dd8867ca/Untitled.png)

내용을 전달할 매개체인 바인더가 필요하다

### 바인더와 AIDL

바인더 : 클라이언트와 서버가 데이터를 주고받을 때 필요한 인터페이스

AIDL(Android Interface Definition Language) : AIDL언어로 인터페이스를 작성하면 자동으로 바인더를 생성해줌.

### 인터페이스 만드는 방법

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/9effc55e-653d-40bd-87a8-5e6b869dde61/Untitled.png)

인터페이스 만들어서 서비스 안에다가 넣어주고 빌드하면 AIDL 파일로 인식. 어렵지 않음.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/e7b1c198-e09a-4e2e-ba28-13b5514ffe3c/Untitled.png)

Stub 함수를 구현한 적 없지만 자동으로 추가가 된다.

바인더 객체를 생성한 후에 `onBind` 메소드에서 바인더 객체를 리턴해주면 됨

### 클라이언트에서 바인더 설정

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/b2f2d2c5-e1ef-4a35-b0d6-8d2281ff5d33/Untitled.png)

클라이언트에서 동일한 뎁스에 바인더 설정.

### 클라이언트 MainActivity

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/ce986197-fe4a-46f2-b9de-02be6bacb002/Untitled.png)

1. ServiceConnection 객체 생성
2. onServiceConnected 메소드 오버라이드
3. mBinder에다가 ICountService.Stub.asInterface 인자로 서비스 넘김.

인터페이스만 정의해주면 자동으로 읽어줌.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/49bb539f-fb4a-415e-9470-9a63abf93ce0/Untitled.png)

서버 단에 있는 `mBinder.getCurCountNumber` 메소드를 호출 할 수 있음.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/1db6d0f2-3a38-4d93-9bca-d21d51ab475f/Untitled.png)

1. 스타트 카운트 서비스 버튼
2. 카운트 서비스 앱 실행
3. getCoundNumber 호출

### Content Provider

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/c0bd4a95-deb5-4392-a42a-3bd746eb0701/Untitled.png)

A앱에서 파일과 데이터베이스를 관리하고 있는데 이것을 B, C, D에서 접근 불가능

하지만 컨텐트 프로바이더를 이용하여 B C D 앱에 데이터 제공 가능

- 컨텐트 프로바이더 인터페이스 제공

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/1ee22943-02bc-4806-acdf-ff0f4614d940/Untitled.png)

콘텐트 프로바이더는 외부에 데이터를 공유할 때만 사용한다. 자기 앱 내에서는 X

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/0829c791-c8b9-4ee8-87e2-dd15bf5f626e/Untitled.png)

콘텐트 프로바이더의 사용절차

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/0c70c6c2-2bba-4729-a81f-67e3dec53be1/Untitled.png)

- ContentProvider 클래스 상속받는다.
- 제공하는 함수를 재정의한다.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/df78d029-94c2-43c0-a604-77e6fd4484de/Untitled.png)

- bulkInsert는 여러 개의 값을 집어넣는 함수.
- query, update, delete 거의 동일

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/7b47e8cf-1172-4d38-ad7d-e83f3c80d378/Untitled.png)

- name : 프로바이더 클래스
- authorites : 프로바이더의 주소 사용
- exported : 외부 공개

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/17470926-229c-4e38-a48e-4adba5b7d21a/Untitled.png)

- 콘텐트 프로바이더 : 서버
- 콘텐트 리졸버 : 클라이언트
- Resolver의 특징
    - 동일한 인터페이스 제공한다.
    - Resolver를 통해서 Provider에 데이터 요청.
    - RPC 기술처럼 외부 앱이 Resolver 함수를 호출하면 마치 자신의 내부 함수를 호출하듯 프로바이더의 함수들을 호출
- A앱의 Student DB가 있음
- 외부 앱은 Resolver 객체를 획득한 후 insert, bulkInsert, query 함수를 호출하기만 하면 된다.

### 콘텐트 리졸버 앱 구현

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/33604a31-3ed2-4a1d-b76a-0c663b0a4937/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/352bb59e-6f58-4ed5-ad59-200fc49a8cc6/Untitled.png)

- PROVIDER_URI에 아까 프로바이더 .xml 파일에 등록했던 주소를 저장
    - 형식 "content:// + 주소(authorities)"
- 이후 insert를 하여 레코드 추가

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/24830b87-73b6-4ee3-94f7-698e1bd935fc/Untitled.png)

- 쿼리 사용하기

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/e10166ff-fdac-4eea-b203-8915e3dd9551/Untitled.png)

- update도 마찬가지
- delete도 동일함.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/817ad875-e5ea-4f1c-adcf-1c2110b96b36/Untitled.png)

- 프로바이더가 사용중인 DB를 초기화하고 싶다면?
- 방법 1) DDMS 파일 탐색기를 이용하여 앱 내장 폴더에 DB파일을 삭제할 수 있다.
- 방법 2) 안드로이드 기본 설정 앱을 이용하는 방법도 있음.

### 파일과 데이터베이스

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/cf5cab0a-9c1a-49a6-9f19-77f010250e60/Untitled.png)

내부 메모리 / 외부 메모리

# 책에서는 데이터 저장하는 예시를 보여주는데 예제 자세하게 설명하지 않을 거고 어떤 api가 있는지만 설명할게요

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/8bfcd9b2-3d0d-4cba-8843-2f429ea1f316/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/b9701979-7737-415c-9f04-e0c9c410d776/Untitled.png)

FileOutputStream 객체에 `openFileOutput()`

FileInputStream 객체에 `openFileInput()`

데이터 배열 형태로 읽고 close한 다음 파일 삭제할 수 있다.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/fd7aba5c-f706-4fcd-9480-776054eb75bb/Untitled.png)

보안상의 문제 때문에 다 막아놓음.

- MODE_PRIVATE : 파일 권한을 외부 패키지에서 접근할 수 없도록 한다.
- MODE_APPEND : 파일의 끝에 데이터 추가하기 위함.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/81c05e66-842a-496f-92b7-dd61e2a2b0a1/Untitled.png)

객체 자체를 파일로 읽고/쓰기 가능

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/0b10ff2a-659e-449f-b80f-48813642d07d/Untitled.png)

FileInputStream에서 fis를 획득하고 그것을 ObjectInputStream에다가 넣어주면 됨.

ois의 readObject 메소드를 통해서 파일에 존재하는 객체 전체를 통채로 읽을 수가 있음.

FileOutputStream에서 fos를 획득하고 그것을 ObjectOutputStream에 넣어줌.

writeObject를 사용해서 oos를 사용.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/7a11d819-a9dc-46b1-9aa7-fffb079a6358/Untitled.png)

files 폴더 : 파일을 생성하면 기본적으로 저장되는 경로

cache 폴더 : 임시로 저장한 파일이 존재하는 폴더이다.

### 경로정보를 참조하는 함수와 설명

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/ab9cebc1-b303-4a8d-bc44-1012977b4931/Untitled.png)

외장메모리 루트 경로를 얻어오는 함수. 이는 제조사마다 달라질 수 있음.

### 공유 프레퍼런스

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/ac1cfa87-21d1-41c1-a322-ecf1db9c9b61/Untitled.png)

앱 개발 시 각종 환경 설정 값들을 보관해야 할 경우가 있음.

### AppSetting

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/ba555a2c-1135-45d7-8209-db509f8133f1/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/cf342699-17be-4889-939d-4d965f9cea6f/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/94b16e60-91cc-4cbe-a9d3-d614a0309f33/Untitled.png)

SharedPreferences listener 클래스. 공유 프리퍼런스가 바뀔 때 실행된다.

키 값에 대해서 값을 읽어옴.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/ef945fda-e681-4bf5-bcac-a3eaf7b112b9/Untitled.png)

1. 공유 프레퍼런스 객체를 얻어온다.
2. SOUND_SET 이라는 키 값에 대해서 값을 읽어온다.
3. 공유 프레퍼런스 값이 변경되었을 떄 호출되는 리스너 등록(위에서 정의한 것)
4. 체크박스 안에 읽어온 isSoundOn 읽어옴.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/19ebae17-7546-476c-b147-36ee0783ba5c/Untitled.png)

사용자가 체크박스 클릭하면 체크박스에 있는 값을 받아옴.

그 값을 isSoundOn에 저장한다음

1. 공유 프레퍼런스에 Editor 객체를 받아온다.
2. putBoolean에 해당 값 SOUND_SET 키로 넣는다.
3. `apply()` 를 실행해서 변경된 데이터를 파일에 저장한다.

이후 key값에 대해서 `onSharedPreferenceChanged` 함수가 호출될 것임.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/527fdd69-b4b2-4661-a8f9-f4e22397823c/Untitled.png)

`getPreference` 함수 호출 시 파일에 저장된 모든 값들을 메모리로 로드함

Setting 파일이 내용이 많을 수록 시간이 오래 걸린다.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/6099bff5-1d10-4ce7-9256-f9fb2ad16353/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/5c05ab43-8bcf-4726-9f7b-86dc5bbdec2e/Untitled.png)

1. 최초 getSharedPreferences 호출 시에 파일에서 메모리 상으로 업로드 함
2. 이후 다시 getSharedPreferences 호출 시에 기존 메모리 상의 데이터를 참조하기 때문에 속도가 빠름

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/43bef06d-e0b2-4e4b-8bdc-2458eba7777a/Untitled.png)

**`commit()`**

- putXXX 하면 값들이 메모리 상에서 변경됨.
- 시스템이 죽어버리면 공유 프레퍼런스가 사라지기 때문에 데이터를 파일에 저장하는 것이다.
- putXXX는 DRAM 상의 데이터 업데이트, Commit은 DRAM 상의 데이터를 저장장치에 저장시킴.

**`apply()`**

- 커밋처럼 한번에 저장하는 것이 아니라 OS에 들어가는 작업스레드가 주기적으로 업로드 함.

**시스템이 갑자기 죽지 않는 이상 commit과 apply의 동작은 똑같다.**

### SQLiteDatabase 클래스

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/b2278f52-f7e2-4a72-aa51-d53ca787eca9/Untitled.png)

- SQLite는 소규모 DB에 적합
- 라이브러리 형식으로 지원됨.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/3eec24e6-86ae-4c84-a26a-02de4f2d78b7/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/37016cd9-7737-4ac5-baa8-cfbe53399665/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/884cfab8-0b84-457a-8801-c4dc744df769/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/b1ec0e4d-b19c-4c49-9e07-9831b7701fbd/Untitled.png)

- SQLiteDatabase를 담는 객체 mDatabase 생성
- DB 매니저 객체는 싱글톤으로 구현하기 위해 static으로 구현하고 getInstance 메소드 구현

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/969e668d-094a-4772-acfc-08fb13a5fb3e/Untitled.png)

- context.openOrCreateDatabase() 메소드 사용하여 디비 생성
- 테이블 생성. 존재하지 않으면 Table 생성

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/1f65ac4f-b187-4556-b324-099ffb148af9/Untitled.png)

onCreate 시에 mDbmanger에 객체를 얻어온다.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/affe3368-4827-4580-a65a-f1f18fdced84/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/c7e3e5f5-e458-4c4e-aa6f-47ba4a698f02/Untitled.png)

ContentValues 라는 형식의 변수에 put 메소드로 key-value 입력 가능

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/5e2202d8-896e-49cd-a713-c3c18f966d73/Untitled.png)

앱 밑에 DB 폴더 안에 만들어지게 된다.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/13c0f0e8-fa06-47fd-8590-2b2b9fbab940/Untitled.png)

두가지 방법 중 하나 사용하면 된다.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/175235c4-ad01-49a6-b8d2-e85b27a4611c/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/c3ce6d1d-39ff-47e8-9c8c-413586d0747f/Untitled.png)

쿼리를 눌렀을 때

1. 쿼리를 string 배열로 만들어 줌.
2. Cursor c를 선언하고 query.를 해줌
3. 만약 null이 아니라면
4. c를 통해서 값을 가져와 mDisplayDBEt에 삽입해준다.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/cfffb13b-45e7-4588-ab92-3db5377ad9ba/Untitled.png)

cursor에 다양한 함수들이 제공되고 있음.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/0defc062-34a9-4404-b8b6-805fe5a45ecb/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/39f3c656-bd91-44e8-9b78-bccbafcb126f/Untitled.png)

# 과제3 Homework3

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/d2a5f85d-45dd-41ee-9d1a-2d13090313d7/Untitled.png)

- MainActivity 노래 클릭 시
- 뮤직 플에이어로 가고
- Home 화면으로 돌아가면  재생중이라고 떠야하고
- Notification Bar 화면에 해당 곡에 대한 상태바가 떠야함

## MainActivity

- 리스트뷰로 표현
- 클릭하면 음악 재생하는 페이지로 넘어감.
- 음악 목록을 출력하기 위해 MediaStore Content Provider 사용
- 이것을 사용하려면 ContentResolver를 사용해야함
- adb로 넣어주면 MediaStore가 인식할 수 없음. 그렇기에 MediaScannerConnection을 사용해야함. 그래야 MediaStore 사용 가능

## PlayMusicActivity

- 타이틀 이미지
- 제목
- 이전 음악 재생 버튼, 다음 음악 재생 버튼, 만약 첫번째에서 이전을 누르면 마지막, 마지막에서 다음을 누르면 첫번째로 가게 만들어야 함.
- 재생 및 일시정지 버튼 : 재생 중이라면 일시정지 아이콘, 일시 정지 중이라면 재생 아이콘
- 음악 재생하는 ProgressBar 음악 재생되는 것 분과 초로 몇 분 몇 초 진행되었는지 보여줘야함.

## Home

홈 버튼을 눌렀을 때에도

- 음악이 재생 중이면 재생 버튼
- 음악이 일시정지이면 일시 정지 버튼

## Scroll Bar

스크롤바를 내렸을 때 다음과 같은 화면이 나와야 함.

- 이미지
- 제목
- 일시정지 버튼
- 이전 다음 버튼
- 만약 사진을 누르게 되면 PlayMusicActivity로 전환된다.
- RemoteViews 사용(Custom Notification View)

## 멀티미디어

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/bbe66aa0-7df1-4baf-add5-60dee0c044a5/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/de2d6b7f-01a9-4598-ad0a-1c7a67aad849/Untitled.png)

1. 디폴트 생성자로 생성
2. setDataSource로 재생할 미디어를 지정
3. prepare
4. start
5. release

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/dcc4ee68-dfc1-4cd1-a816-7ad45cf60e82/Untitled.png)

- prepare를 하면 미디어를 open 하는 동작임. 끝날 때까지 기다려야하는 일이 발생할 수 있음. 이것보다 prepareAsync를 사용하면 콜백 함수가 호출됨.
- start, stop, pause
- release 재생 중에 호출 되면 음악이 멈추고 해제된다.
- reset은 setDataSource 함수 호출 이전으로 초기화.

## 미디어 플레이어의 상태

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/28fe2157-5ec4-462e-ae40-97e24ef18475/Untitled.png)

getDuration : 총  재생 길이

getCurrentPosition : 현재 재생 위치

seekTo : 재생 위치를 변경한다.

## MediaPlayer의 리스너 인터페이스

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/1df795ea-a424-4a46-aa11-19cdd3998d1a/Untitled.png)

- 에러 발생했을 때
- prepare 동작이 완료되었을 때
- 끝까지 재생했을 때 호출
- Streaming 시에 버퍼에 새로운 데이터가 들어왔을 때
- 재생 위치 변경이 완료되었을 때.

## 음악 재생 예제

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/b42dfd15-5e25-4933-8355-c25b48e93982/Untitled.png)

## 앞 예제에서 발생할 수 있는 문제점

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/aa8552f4-abb5-4565-b0cf-5fe783edd88e/Untitled.png)

- 백 버튼 → 액티비티 제거 → 미디서 플레이어 객체 해제 → 음악 재생 정지
- 해결책 : 서비스 사용해야함.

**음악재생은 ANR이 발생하지 않는다!!!**

메인 스레드에서 음악 재생이 되는 것이 아니라 mediaserver가 음악을 재상한다.

## 서비스를 사용한 MediaPlayer 구현

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/c83beabf-bc39-484d-bffd-e95a4159893f/Untitled.png)

맨 밑에 player는 mMediaPlay가 되어야 함.

setOnPrepared 함수에다가 this 등록

## 서비스 종료시에 객체 해제

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/c4e036ba-0bd0-4ade-932b-3158e1def588/Untitled.png)

## Foreground 서비스로 실행하기

startForeground 함수를 사용하면 된다.

## MediaPlayer 예제

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/aad0dff6-761b-47f1-9545-bca26549f68a/Untitled.png)

create 메소드는 setDataSource과 prepare 동작을 한번에 함.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/5ebc54b6-d736-4499-bd71-df02d31bc7ec/Untitled.png)

# 과제를 위한 예제

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/a147ca93-333f-42ea-a7e1-de58190b7f2c/Untitled.png)

음악 앱 목록을 받음.

손가락을 seekBar를 seek 할 수 있음.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/1756c1a2-cc56-48a7-b973-8e10a459068f/Untitled.png)

- ArrayList에 확장자가 mp3인 파일을 모두 등록. FilenameFilter로 받음
- arrayList에 .mp3 추가

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/99704b2f-f94e-41a8-868e-d096f84c18a4/Untitled.png)

- 여러가지 리스너 등록
- LoadMedia 메소드 : 각각의 음악 파일 명을 받아서 재생할 음악파일을 지정하는 함수.
- Prepare() 함수는 그냥 mPlayer.prepare()만 호출한다.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/6e7257f9-e849-4331-b800-792cf4667c32/Untitled.png)

id.prev와 id.next를 누를 때 해당 음악 목록에서 다음 음악 목록 선택하기

onCompleteListener는 음악 재생 끝나면 다음 음악 재생함.

- reset후
- 다음꺼 load
- mPlayer.start

onSeekCompleteListener 에서 위치 이동 완료 되면 

- mPlayer.start 호출

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/2f1e53f6-0fcd-4295-8cda-44ca35fc575b/Untitled.png)

- SeekBar인 Progressbar
- setOnSeekBarChangeListener << 손가락으로 seekbar 움직일 때 호출됨

**0.2초 동안 이동시키는 방법 : 핸들러 사용**

Handler 핸들러 생성

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/a49a2aa6-724e-422a-84b2-82dbcb973df3/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/592737b5-268c-4b67-9dd5-57f0882431cf/Untitled.png)

- 음악 재생할 때 위치를 setProgress로 전달

## 알림 소개

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/dbdf0355-6009-4817-81e9-a2d110229aad/Untitled.png)

1. Notification 생성
2. 알림 세팅 객체 생성
3. 알림창의 알림을 탭했을 때 원하는 컴포넌트를 실행하기 위해 Intent 생성하고 설정
4. PendingIntent
5. Notification manager를 통해 알림 등록

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/ad793e59-34f3-4ad4-88b3-f6568c11f7f0/Untitled.png)

알림 채널 등록해야함

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/6fdd3f1d-d179-4cef-ad06-a23f6af4d0bc/Untitled.png)

1. NotificationChannel 생성 1.채널아이디 2.네임 3.중요도
2. Builder 생성하는데 채널 아이디가 들어감.
3. 빌더 설정
4. PendingIntent 설정
5. NotificationManger가 채널을 받아서 해당 노티를 등록.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/b8c6fd5c-4175-4f34-85a1-2e40047f7b71/Untitled.png)

notiBuilder로 이런 것들을 설정할 수 있다. 알림창 UI를 구성할 수 있다.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/b10ab4cd-a138-41b9-993f-87557edf9ba8/Untitled.png)

클릭했을 때 특정 액티비티 혹은 특정 브로드캐스트 혹은 특정 서비스를 실행하도록 생성할 수 있다.

Pending 세팅을 완료후 매니저에 등록이 되어야 해당 액티비티,브로드케스트,서비스 호출 가능.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/78ce7245-a936-433b-a13b-92f9e1f7e0d6/Untitled.png)

액티비티로 가게끔 실행하면 될듯?

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/a8962f23-5734-4651-af0d-95e53b445789/Untitled.png)

Notification Manager는 시스템이 제공하는 서비스이다.

객체를 직접 생성하지 않아도 됨.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/b135d4d7-bc46-4658-989c-1b9fe445725f/Untitled.png)

sendNotification 함수 onClick으로 등록하면 알림이 생성됨.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/b66a1d31-12c4-4511-ad68-99ca8f8a7419/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/2306391d-1492-4a98-8896-243965467515/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/19c031b9-05c1-4c9a-b061-bd6d752f7e9b/Untitled.png)

인텐트에 foregroundService.class 포그라운드 서비스 시작하게끔.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/0d4e8b8c-8552-4b1c-86e6-4b6da9ab71b7/Untitled.png)

startIntent 세팅

startService 실행

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/cd024a2a-67ea-4bcd-86d7-2858f90fc33e/Untitled.png)

onStartCommand

액션 명이 STARTFOREGROUND_ACTION인지 확인한다.

이후 초기화 하는 코드 실행

1) 사진 누르면 MAIN_ACTION 실행

2) PLAY 버튼 누르면 PLAY 실행

3) NEXT 버튼 누르면 NEXT 실행

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/0fcc8bb6-9ce2-4742-9c80-f07b779c4222/Untitled.png)

UI를 구성하고 startForeground 함수 실행.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/90ef4d6f-7355-4632-a8bd-8af8dafe6aea/Untitled.png)

음악을 재생하는 코드

음악을 일시정지하는 코드 넣어주면 됨.

메인에도 똑같은 STATIC STRING ACTION을 설정해야한다.

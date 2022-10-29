package com.example.a2022_10_09
/* 첫 줄은 항상 PKG 정보로 해당 Line이 뜻하는 점은 PKG Heirarchy를 가르키며 이는 아래와 같다.
1. Com PKG
2. Example PKG
3. 2022-10-09 PKG
4. MainActivity.kt */
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
/* 다음 Line은 Import 기술
* 일반적인 타 프로그래밍 처럼 동일하다
* ... 은 생략이다. 물론, 클릭하면 extend 가능 */

class MainActivity : AppCompatActivity() {
/* MainActivity Class는 AppCompatActivity를 상속 받는다(Ctrl 누르고 클래스 누르면 설명 확인 가능)
* AppCompatActivity = 기존의 Activity 클래스 + 호환성 기능
* 즉, 예전에 나온 API 버젼들과 잘 호환되게하기 위해 등장한 Class
* 따라서 전체 상속 구조는
* Activity 상속 to AppCompatActivity 상속 to MainActivity
* Activity의 의미는 하나하나의 Screen이다.
* 즉, 앱의 각각의 Screen, Imgae 등의 모든 자원은 Resource에서 작성되며,
* MainActivuty에서 끌어다가 구성 및 연결등 모듈화 된 Resource를 제어한다. */
    override fun onCreate(savedInstanceState: Bundle?) {
/* Bundle: 여러데이터를 저장하는 상자와 같은 것
* 따로 지정이 없을 시, savedInstanceState는 Null로 지정 됨 */
        super.onCreate(savedInstanceState)
/* 상속 받은 AppCompatActivity 의 onCreate 실행
* 해당 문구가 없으면 다음과 같은 경고 및 에러 문구 확인 가능
* 'android.until.SuperNotCalledException: Activity' */
        setContentView(R.layout.activity_main)
/* setContentView는 보여 줄 Layout 지정
* 'R' 자동 생성되는 클래스, 모든 Resoure 식별가능하게 변수가 정의된 Class
* 아래와 같이 res -> layout에 activity_jay 만들고 추가할 수 있음 */
   //    setContentView(R.layout.activity_jay)
    }
}
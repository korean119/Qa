package Hanwhatribes_automation;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class _4_MyTribes extends _0_Automation_Main { 
	public static void MyTribes() throws MalformedURLException, InterruptedException  {
		
		System.out.println("<<Tribes_list 진행>>");
		
		WebDriverWait wait = new WebDriverWait(driver.get(), 10);
		
		//@ 닫기 버튼으로 정합성 필요 -- id 없음
		MobileElement 바텀시트영역외닫기 = driver.get().findElementByAccessibilityId("시트 닫기");
		wait.until(ExpectedConditions.visibilityOf(바텀시트영역외닫기)).click();    
		System.out.println("P# My 트라이브 화면_시트 닫기 동작");
		
		
		Thread.sleep(2000); 
		MobileElement 트라이브목록버튼 = driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]");
		wait.until(ExpectedConditions.visibilityOf(트라이브목록버튼)).click();	
		System.out.println("P# My 트라이브 화면_트라이브 목록 버튼 탭");
		
		
		MobileElement 트라이브홈버튼 = driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]");
		wait.until(ExpectedConditions.visibilityOf(트라이브홈버튼)).click();	
		System.out.println("P# 트라이브 목록 화면_트라이브 홈 버튼 탭");
	
	
		if (driver.get().findElementsByAccessibilityId("시트 닫기").isEmpty())
		{System.out.println("M# My 트라이브 화면_바텀 시트 미노출 노출");
 			
		}else{
			System.out.println("M# My 트라이브 화면_바텀 시트 노출 노출 --FAIL");  
			driver.get().close();
	
		}
		
		
		MobileElement 알림함버튼 = driver.get().findElementByAccessibilityId("notification in TopBar");
		wait.until(ExpectedConditions.visibilityOf(알림함버튼)).click();
		System.out.println("P# 트라이브 목록 화면_[알림함] 버튼 입력"); 
		

		MobileElement 알림함텍스트찾기 = driver.get().findElement(By.xpath ("//*[contains( @text , '알림')]"));
		 if (알림함텍스트찾기.isDisplayed())
			{System.out.println("M# 알림함 화면_'알림' 텍스트 존재 확인" + 알림함텍스트찾기.getText());
	 			
			}else{
				System.out.println("M# 알림함 화면_" + 알림함텍스트찾기.getText() + "텍스트 찾기 실패 진입 실패-- FAIL"); 
				driver.get().close();
		
			}
		 
		 
		MobileElement 헤더영역백버튼 = driver.get().findElementByAccessibilityId("Up button in TopBar");
		헤더영역백버튼.click();
		System.out.println("P# 알림함 화면_[Back] 버튼 입력"); 
		
		MobileElement MY트라이브텍스트찾기 = driver.get().findElement(By.xpath ("//*[contains( @text , '알림')]"));
		 if (MY트라이브텍스트찾기.isDisplayed())
			{System.out.println("M# My 트라이브 화면_'응모 현황' 텍스트 존재 확인" + MY트라이브텍스트찾기.getText());
	 			
			}else{
				System.out.println("M# My 트라이브 화면_" + MY트라이브텍스트찾기.getText() + "텍스트 찾기 실패 진입 실패-- FAIL");  //@ xpath.isDisplayed로 하면 xpath 자체가 없는걸로 인식되어 fail 됨 = else 미출력 후 에러 상태 
				driver.get().close();
				
			}
	
	
	
		MobileElement 트라이브둘러보기버튼 = driver.get().findElementByXPath(null);
		
		
		
		
		
		MobileElement 나의트라이브텍스트확인 = driver.get().findElement(By.xpath ("//*[contains( @text , '반가워요! 트라이브를 시작해보세요')]"));
		
		if (나의트라이브텍스트확인.isDisplayed())
		{System.out.println("M# My 트라이브 화면_'반가워요~' 텍스트 존재 확인" + 나의트라이브텍스트확인.getText());

		}else{
			System.out.println("M# My 트라이브 화면_" + 나의트라이브텍스트확인.getText() + "텍스트 찾기 실패 - Fail");			
			driver.get().close();
			
		}


driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.TextView[1]")
.click(); 
System.out.println("[종료] 탭 입력");
Thread.sleep(2000);


driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[2]/android.view.View[3]/android.view.View/android.widget.TextView")
.click(); 
System.out.println("[당첨] 탭 입력");
Thread.sleep(2000);


driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.view.View/android.widget.TextView")
.click(); 
System.out.println("[진행중] 탭 입력");
Thread.sleep(2000);


driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[3]/android.widget.TextView[6]")
.click(); 
System.out.println("진행중 [당첨 확률] 버튼 입력 -> 당첨확률 바텀시트 출력");
Thread.sleep(4000);


driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[2]/android.widget.ImageView")
.click(); 
System.out.println("당첨확률 바텀시트 [x]버튼 입력");
Thread.sleep(2000);


driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[3]/android.widget.TextView[6]")
.click(); 
System.out.println("진행중 [당첨 확률] 버튼 입력 -> 당첨확률 바텀시트 출력");
Thread.sleep(4000);


driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.Button")
.click(); 
System.out.println("당첨확률 바텀시트 [확인]버튼 입력");
Thread.sleep(2000);


driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[3]/android.widget.TextView[6]")
.click(); 
System.out.println("진행중 [당첨 확률] 버튼 입력 -> 당첨확률 바텀시트 출력");
Thread.sleep(4000);


MobileElement sheetclose = driver.get().findElementByAccessibilityId("시트 닫기");
sheetclose.click(); 
System.out.println("바텀시트 시트 닫기(외부터치)");


driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.view.View")
.click(); 
System.out.println("나의 트라이브 첫번째 트라이브 진입");
Thread.sleep(3000);


MobileElement tribesout = driver.get().findElementByAccessibilityId("out in TopBar");
tribesout.click();
System.out.println("[트라이브 나가기]버튼-> 나가기 컨펌 팝업 출력"); 


driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.view.View[2]/android.widget.Button")
.click(); 
System.out.println("컨펌 팝업 유지하기");
Thread.sleep(3000);


tribesout.click();
System.out.println("[트라이브 나가기]버튼-> 나가기 컨펌 팝업 출력"); 
Thread.sleep(3000);


driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.view.View[1]/android.widget.Button")
.click(); 
System.out.println("컨펌 팝업 나가기");
Thread.sleep(3000);
	

MobileElement back = driver.get().findElementByAccessibilityId("Up button in TopBar");
back.click();
System.out.println("TopBar Back"); 


driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.view.View")
.click(); 
System.out.println("나의 트라이브 첫번째 트라이브 진입");
Thread.sleep(3000);


MobileElement tribesout1 = driver.get().findElementByAccessibilityId("out in TopBar");
tribesout1.click();
System.out.println("[트라이브 나가기]버튼-> 나가기 컨펌 팝업 출력"); 


driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.view.View[1]/android.widget.Button")
.click(); 
System.out.println("컨펌 팝업 나가기");
Thread.sleep(3000);


MobileElement back1 = driver.get().findElementByAccessibilityId("Up button in TopBar");
back1.click();
System.out.println("TopBar Back"); 

}

}

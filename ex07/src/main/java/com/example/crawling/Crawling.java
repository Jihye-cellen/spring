package com.example.crawling;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.QueryVO;

import org.openqa.selenium.*;

@RestController
@RequestMapping("/crawl")
public class Crawling {
	
	@GetMapping("/cgv")
	public List<HashMap<String, Object>> cgv(){
		List<HashMap<String, Object>> list= new ArrayList<>();
		try {
			Document doc = Jsoup.connect("http://www.cgv.co.kr/movies/?lt=1&ft=0").get();
			Elements es = doc.select(".sect-movie-chart ol");
			for(Element e:es.select("li")) {
				String title=e.select(".title").text();
				String image=e.select("img").attr("src");
				String date = e.select(".txt-info strong").text();
				String percent=e.select(".score .percent span").text();
				
				System.out.println("title........"+ title);
				System.out.println("image........" + image);
				System.out.println("date......." + date);
				System.out.println("percent......." + percent);
				
				HashMap<String, Object> map = new HashMap<String, Object>();
				
				if(title!="") {
					map.put("title", title);
					map.put("image", image);
					map.put("date", date);
					map.put("percent", percent);
					
					list.add(map);
				}
			}
			
		}catch(Exception e) {
			System.out.println("cgv오류" + e.toString());
		}
		return list;
	}
	
	
	@PostMapping("/cgv/download")
	public void download(@RequestParam("image") String image) {
		try{
		URL url= new URL(image);
		InputStream in = url.openStream();
		FileOutputStream out = new FileOutputStream("c:/download/poster/" + System.currentTimeMillis()+ ".jpg");
		FileCopyUtils.copy(in, out);
		}catch(Exception e) {
			System.out.println("이미지다운로드" + e.toString());
		}
	}
	
	@GetMapping("/finance")
	public List<HashMap<String, Object>> finance(){
		List<HashMap<String, Object>> list = new ArrayList<>();
			try {
				Document doc = Jsoup.connect("https://finance.naver.com/").get();
				Elements es= doc.select("#_topItems1 tr");
				for(Element e:es) {
					String title=e.select("a").text();
					String price= e.select("td").get(0).text();
					String range=e.select("td").get(1).text();
					System.out.println(title + ":" + price + ":" + range);
					
					HashMap<String, Object> map = new HashMap<>();
					map.put("title", title);
					map.put("price", price);
					map.put("range", range);
				
					list.add(map);
				}
				
			}catch(Exception e) {
				System.out.println("증권오류....." + e.toString());
			}
		return list;
	}
	
	@GetMapping("/gmarket")
	public List<HashMap<String, Object>> gmarket(@RequestParam("query") String query){
		List<HashMap<String, Object>> list = new ArrayList<>();
		try {
			ChromeOptions options=new ChromeOptions();
			options.addArguments("headless");
			WebDriver driver = new ChromeDriver(options);
			driver.get("https://www.gmarket.co.kr/");
			WebElement input = driver.findElement(By.name("keyword"));
			input.sendKeys(query);
			WebElement search=driver.findElement(By.className("button__search"));
			search.click();
			((JavascriptExecutor)driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
			List<WebElement> es = driver.findElements(By.className("box__item-container"));
			int index = 0;
			
			for(WebElement e : es) {
				index ++;
				String title = e.findElement(By.className("text__item")).getAttribute("title");
				String price = e.findElement(By.className("text__value")).getText();
				String img = e.findElement(By.className("image__item")).getAttribute("src");
				String code = e.findElement(By.className("link__item")).getAttribute("data-montelena-goodscode");
				System.out.println(index + "............" + title + "----------" + price);
				System.out.println(img);
				System.out.println("....idx" + code);
				
				HashMap<String, Object> map =new HashMap<>();
				map.put("title", title);
				map.put("price", price);
				map.put("image", img);
				map.put("code", code);
				
				list.add(map);
				
			}
			driver.quit();
		}catch(Exception e) {
			System.out.println("지마켓오류:" +e.toString());
		}
		return list;
	}
}

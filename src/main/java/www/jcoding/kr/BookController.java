package www.jcoding.kr;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.Header;
import org.apache.http.HttpHeaders;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicHeader;
import org.springframework.http.client.HttpComponentsAsyncClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

public class BookController {
	public List<BookInfo> getBookList(String query){
		final String APP_KEY = "KakaoAK ece304dbeafa53fa1dd2b75bb135a52d";
		StringBuilder sb = new StringBuilder();
		sb.append("https://dapi.kakao.com");
		sb.append("/v3/search/book");
		sb.append("?query=").append(query);
		
		
		//System.out.println(sb.toString());
		Header jsonHeader = new BasicHeader(HttpHeaders.CONTENT_TYPE, "application/json");
		Header authHeader = new BasicHeader(HttpHeaders.AUTHORIZATION, APP_KEY);
		List<Header> headers = new ArrayList<Header>();
		headers.add(jsonHeader);
		headers.add(authHeader);
		
		HttpClient httpClient = HttpClientBuilder.create()
				.setMaxConnTotal(100)
				.setMaxConnPerRoute(5)
				.setDefaultHeaders(headers)
				.build();
		
		HttpComponentsClientHttpRequestFactory factory = new HttpComponentsClientHttpRequestFactory();
		factory.setReadTimeout(5000); // 읽기 시간 초과
		factory.setConnectTimeout(3000); // 연결 시간 초과 3초
		factory.setHttpClient(httpClient);
		
		RestTemplate restTemplate = new RestTemplate(factory);
		
		String response = restTemplate.getForObject(sb.toString(), String.class);
		System.out.println(response);
		List<BookInfo> result = new ArrayList<BookInfo>();
		
		return result;
	}
}

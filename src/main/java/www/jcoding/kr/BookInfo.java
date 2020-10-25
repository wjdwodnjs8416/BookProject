package www.jcoding.kr;

import java.time.LocalDateTime;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class BookInfo {
	String title; // 도서 제목
	String contents; // 도서 소개
	String url; // 도서 상세 URL
	String isbn; // 국제 표준 도서번호
	LocalDateTime datetime; // 도서 출판날짜 [YYYY]-[MM]-[DD]T[hh]:[ss].000+[tz]
	String[] authors; // 도서 저자 리스트
	String publisher; // 도서 출판사
	String[] translators; // 도서 번역자 리스트
	int price; // 도서 정가
	int sale_price; // 도서 판매가
	String thumbnail; // 도서 표지 미리보기 URL
	String status; // 도서 판매 상태 정보 (정상, 품절, 절판)
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public LocalDateTime getDatetime() {
		return datetime;
	}
	public void setDatetime(LocalDateTime datetime) {
		this.datetime = datetime;
	}
	public String[] getAuthors() {
		return authors;
	}
	public void setAuthors(String[] authors) {
		this.authors = authors;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String[] getTranslators() {
		return translators;
	}
	public void setTranslators(String[] translators) {
		this.translators = translators;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getSale_price() {
		return sale_price;
	}
	public void setSale_price(int sale_price) {
		this.sale_price = sale_price;
	}
	public String getThumbnail() {
		return thumbnail;
	}
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
	}
}

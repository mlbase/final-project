package mul.com.a.dto;

public class BookDto {

	private int seq;
	private String title;
	private String filename;
	private String writer;
	private String publisher;
	private int price;
	private String isbn;
	private String content;
	private String regDate;
	private String publishDate;
	private String sort;
	private String genre;
	private int deliveryFee;
	private int amount;
	
	public BookDto() {
		
	}

	public BookDto(int seq, String title, String filename, String writer, String publisher, int price, String isbn,
			String content, String regDate, String publishDate, String sort, String genre, int deliveryFee,
			int amount) {
		super();
		this.seq = seq;
		this.title = title;
		this.filename = filename;
		this.writer = writer;
		this.publisher = publisher;
		this.price = price;
		this.isbn = isbn;
		this.content = content;
		this.regDate = regDate;
		this.publishDate = publishDate;
		this.sort = sort;
		this.genre = genre;
		this.deliveryFee = deliveryFee;
		this.amount = amount;
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	public String getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getDeliveryFee() {
		return deliveryFee;
	}

	public void setDeliveryFee(int deliveryFee) {
		this.deliveryFee = deliveryFee;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "BookDto [seq=" + seq + ", title=" + title + ", filename=" + filename + ", writer=" + writer
				+ ", publisher=" + publisher + ", price=" + price + ", isbn=" + isbn + ", content=" + content
				+ ", regDate=" + regDate + ", publishDate=" + publishDate + ", sort=" + sort + ", genre=" + genre
				+ ", deliveryFee=" + deliveryFee + ", amount=" + amount + "]";
	}

	

	

	
	
	
	
	
}

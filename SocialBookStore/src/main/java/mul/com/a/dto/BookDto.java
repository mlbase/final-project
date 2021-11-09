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
	private String reg_date;
	private String publish_date;
	private String sort;
	private String genre;
	private int delivery_fee;
	private int amount;
	
	public BookDto() {
		
	}

	

	public BookDto(int seq, String title, String filename, String writer, String publisher, int price, String isbn,
			String content, String reg_date, String publish_date, String sort, String genre, int delivery_fee,
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
		this.reg_date = reg_date;
		this.publish_date = publish_date;
		this.sort = sort;
		this.genre = genre;
		this.delivery_fee = delivery_fee;
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

	public String getReg_date() {
		return reg_date;
	}

	public void setReg_date(String reg_date) {
		this.reg_date = reg_date;
	}

	public String getPublish_date() {
		return publish_date;
	}

	public void setPublish_date(String publish_date) {
		this.publish_date = publish_date;
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

	public int getDelivery_fee() {
		return delivery_fee;
	}

	public void setDelivery_fee(int delivery_fee) {
		this.delivery_fee = delivery_fee;
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
				+ ", reg_date=" + reg_date + ", publish_date=" + publish_date + ", sort=" + sort + ", genre=" + genre
				+ ", delivery_fee=" + delivery_fee + ", amount=" + amount + "]";
	}

	
	
	
	
	
}

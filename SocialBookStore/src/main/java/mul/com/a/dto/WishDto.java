package mul.com.a.dto;

public class WishDto {

	private int seq;
	private String id;
	private int bookSeq;
	private int deliveryFee;
	private int bookCount;
	private int price;
	private String filename;
	private String writer;
	private String title;
	
	public WishDto() {}

	

	public WishDto(int seq, String id, int bookSeq, int deliveryFee, int bookCount, int price, String filename,
			String writer, String title) {
		super();
		this.seq = seq;
		this.id = id;
		this.bookSeq = bookSeq;
		this.deliveryFee = deliveryFee;
		this.bookCount = bookCount;
		this.price = price;
		this.filename = filename;
		this.writer = writer;
		this.title = title;
	}



	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getBookSeq() {
		return bookSeq;
	}

	public void setBookSeq(int bookSeq) {
		this.bookSeq = bookSeq;
	}

	public int getDeliveryFee() {
		return deliveryFee;
	}

	public void setDeliveryFee(int deliveryFee) {
		this.deliveryFee = deliveryFee;
	}

	public int getBookCount() {
		return bookCount;
	}

	public void setBookCount(int bookCount) {
		this.bookCount = bookCount;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
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



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	@Override
	public String toString() {
		return "WishDto [seq=" + seq + ", id=" + id + ", bookSeq=" + bookSeq + ", deliveryFee=" + deliveryFee
				+ ", bookCount=" + bookCount + ", price=" + price + ", filename=" + filename + ", writer=" + writer
				+ ", title=" + title + "]";
	}

	
	
	
}

package mul.com.a.dto;

public class WishDto {

	private int seq;
	private String id;
	private int bookSeq;
	private int deliveryFee;
	private int bookCount;
	private int price;
	
	public WishDto() {}

	public WishDto(int seq, String id, int bookSeq, int deliveryFee, int bookCount, int price) {
		super();
		this.seq = seq;
		this.id = id;
		this.bookSeq = bookSeq;
		this.deliveryFee = deliveryFee;
		this.bookCount = bookCount;
		this.price = price;
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

	@Override
	public String toString() {
		return "WishDto [seq=" + seq + ", id=" + id + ", bookSeq=" + bookSeq + ", deliveryFee=" + deliveryFee
				+ ", bookCount=" + bookCount + ", price=" + price + "]";
	}
	
	
}

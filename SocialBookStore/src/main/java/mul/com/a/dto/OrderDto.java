package mul.com.a.dto;

public class OrderDto {

	private int seq;
	private String id;
	private int bookSeq;
	private String orderDate;
	private String address;
	private int deliveryFee;
	private int bookCount;
	private int price;
	private String cardNum;
	
	public OrderDto() {}

	public OrderDto(int seq, String id, int bookSeq, String orderDate, String address, int deliveryFee, int bookCount,
			int price, String cardNum) {
		super();
		this.seq = seq;
		this.id = id;
		this.bookSeq = bookSeq;
		this.orderDate = orderDate;
		this.address = address;
		this.deliveryFee = deliveryFee;
		this.bookCount = bookCount;
		this.price = price;
		this.cardNum = cardNum;
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

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	public String getCardNum() {
		return cardNum;
	}

	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}

	@Override
	public String toString() {
		return "OrderDto [seq=" + seq + ", id=" + id + ", bookSeq=" + bookSeq + ", orderDate=" + orderDate
				+ ", address=" + address + ", deliveryFee=" + deliveryFee + ", bookCount=" + bookCount + ", price="
				+ price + ", cardNum=" + cardNum + "]";
	}
	
	
	
}

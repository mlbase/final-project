package mul.com.a.dto;

public class OrderDto {

	private int seq;
	private String id;
	private int book_seq;
	private String order_date;
	private String address;
	private int delivery_fee;
	private int book_count;
	private int price;
	private String card_num;
	
	public OrderDto() {}

	public OrderDto(int seq, String id, int book_seq, String order_date, String address, int delivery_fee,
			int book_count, int price, String card_num) {
		super();
		this.seq = seq;
		this.id = id;
		this.book_seq = book_seq;
		this.order_date = order_date;
		this.address = address;
		this.delivery_fee = delivery_fee;
		this.book_count = book_count;
		this.price = price;
		this.card_num = card_num;
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

	public int getBook_seq() {
		return book_seq;
	}

	public void setBook_seq(int book_seq) {
		this.book_seq = book_seq;
	}

	public String getOrder_date() {
		return order_date;
	}

	public void setOrder_date(String order_date) {
		this.order_date = order_date;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getDelivery_fee() {
		return delivery_fee;
	}

	public void setDelivery_fee(int delivery_fee) {
		this.delivery_fee = delivery_fee;
	}

	public int getBook_count() {
		return book_count;
	}

	public void setBook_count(int book_count) {
		this.book_count = book_count;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCard_num() {
		return card_num;
	}

	public void setCard_num(String card_num) {
		this.card_num = card_num;
	}

	@Override
	public String toString() {
		return "OrderDto [seq=" + seq + ", id=" + id + ", book_seq=" + book_seq + ", order_date=" + order_date
				+ ", address=" + address + ", delivery_fee=" + delivery_fee + ", book_count=" + book_count + ", price="
				+ price + ", card_num=" + card_num + "]";
	}

	
	
	
}

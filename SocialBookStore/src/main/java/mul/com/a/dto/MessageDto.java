package mul.com.a.dto;

public class MessageDto {

	private int seq;
	private String sendId;
	private String receiveId;
	private String content;
	private String regDate;
	
	public MessageDto(){}

	
	
	public MessageDto(int seq, String sendId, String receiveId, String content, String regDate) {
		super();
		this.seq = seq;
		this.sendId = sendId;
		this.receiveId = receiveId;
		this.content = content;
		this.regDate = regDate;
	}



	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getSendId() {
		return sendId;
	}

	public void setSendId(String sendId) {
		this.sendId = sendId;
	}

	

	public String getReceiveId() {
		return receiveId;
	}



	public void setReceiveId(String receiveId) {
		this.receiveId = receiveId;
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



	@Override
	public String toString() {
		return "MessageDto [seq=" + seq + ", sendId=" + sendId + ", receiveId=" + receiveId + ", content=" + content
				+ ", regDate=" + regDate + "]";
	}

	
	
	
}

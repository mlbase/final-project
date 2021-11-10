package mul.com.a.dto;

public class CommentDto {

	private int seq;
	private String nickname;
	private String content;
	private int feedSeq;
	private String regDate;
	
	public CommentDto() {}

	public CommentDto(int seq, String nickname, String content, int feedSeq, String regDate) {
		super();
		this.seq = seq;
		this.nickname = nickname;
		this.content = content;
		this.feedSeq = feedSeq;
		this.regDate = regDate;
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getFeedSeq() {
		return feedSeq;
	}

	public void setFeedSeq(int feedSeq) {
		this.feedSeq = feedSeq;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	@Override
	public String toString() {
		return "CommentDto [seq=" + seq + ", nickname=" + nickname + ", content=" + content + ", feedSeq=" + feedSeq
				+ ", regDate=" + regDate + "]";
	}
	
	
}

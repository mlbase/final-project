package mul.com.a.dto;

public class FeedDto {

	private int seq;
	private String nickname;
	private String content;
	private String filename;
	private String tag;
	private String regDate;
	
	public FeedDto(){}

	public FeedDto(int seq, String nickname, String content, String filename, String tag, String regDate) {
		super();
		this.seq = seq;
		this.nickname = nickname;
		this.content = content;
		this.filename = filename;
		this.tag = tag;
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

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	@Override
	public String toString() {
		return "FeedDto [seq=" + seq + ", nickname=" + nickname + ", content=" + content + ", filename=" + filename
				+ ", tag=" + tag + ", regDate=" + regDate + "]";
	}
	
	
}

package mul.com.a.dto;

public class LikeDto {
	private int seq;
	private String nickname;
	private byte isLike;
	private int commentSeq;
	private int feedSeq;
	
	public LikeDto() {}

	public LikeDto(int seq, String nickname, byte isLike, int commentSeq, int feedSeq) {
		super();
		this.seq = seq;
		this.nickname = nickname;
		this.isLike = isLike;
		this.commentSeq = commentSeq;
		this.feedSeq = feedSeq;
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

	public byte getIsLike() {
		return isLike;
	}

	public void setIsLike(byte isLike) {
		this.isLike = isLike;
	}

	public int getCommentSeq() {
		return commentSeq;
	}

	public void setCommentSeq(int commentSeq) {
		this.commentSeq = commentSeq;
	}

	public int getFeedSeq() {
		return feedSeq;
	}

	public void setFeedSeq(int feedSeq) {
		this.feedSeq = feedSeq;
	}

	@Override
	public String toString() {
		return "LikeDto [seq=" + seq + ", nickname=" + nickname + ", isLike=" + isLike + ", commentSeq=" + commentSeq
				+ ", feedSeq=" + feedSeq + "]";
	}

	
	
	

}

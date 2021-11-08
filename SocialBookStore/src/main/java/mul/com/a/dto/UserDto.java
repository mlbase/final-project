package mul.com.a.dto;

public class UserDto {

	private int seq;
	private String id;
	private String pwd;
	private String email;
	private String following;
	private String follower;
	private String nickname;
	private String birth;
	private String name;
	private String address;
	private String reg_date;
	private int auth;
	
	public UserDto() {
		
	}

	public UserDto(int seq, String id, String pwd, String email, String following, String follower, String nickname,
			String birth, String name, String address, String reg_date, int auth) {
		super();
		this.seq = seq;
		this.id = id;
		this.pwd = pwd;
		this.email = email;
		this.following = following;
		this.follower = follower;
		this.nickname = nickname;
		this.birth = birth;
		this.name = name;
		this.address = address;
		this.reg_date = reg_date;
		this.auth = auth;
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

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFollowing() {
		return following;
	}

	public void setFollowing(String following) {
		this.following = following;
	}

	public String getFollower() {
		return follower;
	}

	public void setFollower(String follower) {
		this.follower = follower;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getReg_date() {
		return reg_date;
	}

	public void setReg_date(String reg_date) {
		this.reg_date = reg_date;
	}

	public int getAuth() {
		return auth;
	}

	public void setAuth(int auth) {
		this.auth = auth;
	}

	@Override
	public String toString() {
		return "UserDto [seq=" + seq + ", id=" + id + ", pwd=" + pwd + ", email=" + email + ", following=" + following
				+ ", follower=" + follower + ", nickname=" + nickname + ", birth=" + birth + ", name=" + name
				+ ", address=" + address + ", reg_date=" + reg_date + ", auth=" + auth + "]";
	}
	
	
}

package phase1_A;


	public class User {

		private int userId;
		private String userName;
		private String password;
		private String emailId;
		private String userDOB;
		private String address;

		// All args constructure
		public User(int userId, String userName, String password, String emailId, String userDOB, String address) {
			super();
			this.userId = userId;
			this.userName = userName;
			this.password = password;
			this.emailId = emailId;
			this.userDOB = userDOB;
			this.address = address;
		}

		// No Arg Constructure
		public User() {

		}

		public int getUserId() {
			return userId;
		}

		public void setUserId(int userId) {
			this.userId = userId;
		}

		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getEmailId() {
			return emailId;
		}

		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}

		public String getUserDOB() {
			return userDOB;
		}

		public void setUserDOB(String userDOB) {
			this.userDOB = userDOB;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		@Override
		public String toString() {
			return "User [userId=" + userId + ", userName=" + userName + ", password=" + password + ", emailId=" + emailId
					+ ", userDOB=" + userDOB + ", address=" + address + "]";
		}

	}


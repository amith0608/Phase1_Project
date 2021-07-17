package phase1_A;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class UserRepo {

	static Map<Integer, String> userfileMap = new HashMap<>();

	public boolean addFile(Integer userId, String fileName) {

		StringBuilder sb = new StringBuilder();

		if (userId != null && (fileName != null && fileName.length() != 0)) {

			if (userfileMap.containsKey(userId)) {
				sb.append(userfileMap.get(userId)).append(", ").append(fileName);
				userfileMap.put(userId, sb.toString());
			} else {

				userfileMap.put(userId, fileName);
			}
			return true;
		} else {

			return false;
		}

	}

	public String deleteFile(Integer userId, String fileName) {
		String fileNameVal = null;
		String[] filerArr = null;
		StringBuilder sb = new StringBuilder();

		if (userId != null && (fileName != null && fileName.length() != 0)) {

			if (userfileMap.containsKey(userId)) {
				fileNameVal = userfileMap.get(userId);
				filerArr = fileNameVal.split(",");
				boolean isDelete = false;
				for (String str : filerArr) {
					if (str.trim().equalsIgnoreCase(fileName)) {
						// nothing
						isDelete = true;
						sb.append("");
					} else {
						sb.append(str).append(", ");

					}

				}
				userfileMap.put(userId, sb.toString());
				if (isDelete == true) {
					return "file : " + fileName + " has been sucessfullly deleted +++ ";
				} else {
					return "file not exists with userId : " + userId;
				}

			} else {

				System.out.println("User Id doesn't exist !!! ");

			}

		}
		return "User Id or fileName can't be Null or Empty !!!";

	}

	public String getAllFileByUserID(Integer userId) {

		if (userId != null) {

			if (userfileMap.containsKey(userId)) {
				return "File Names : " + userfileMap.get(userId);
			} else {
				return "User Id doesn't exist";
			}

		}
		return "User Id Shouldn't be null";

	}

	public ArrayList<String> getAllfilesNameAscOder() {

		ArrayList<String> listArr = new ArrayList<String>();

		userfileMap.entrySet().stream().sorted(Map.Entry.comparingByValue())
				.forEachOrdered(x -> userfileMap.put(x.getKey(), x.getValue()));

		userfileMap.forEach((k, v) -> listArr.add(v));

		return listArr;

	}

}

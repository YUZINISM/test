package p14;

import java.util.ArrayList;

public class MapExam {

	public ArrayList<String> alKey;
	public ArrayList<String> alValue;

	public MapExam() {
		alKey = new ArrayList<String>();
		alValue = new ArrayList<String>();
	}

	public void put(String key, String value) {
		int index = alKey.indexOf(key);
		if (index == -1) {
			alKey.add(key);
			alValue.add(value);
		} else {

			alValue.set(index, value);

		}
	}

	public int size() {
		return alKey.size();
	}

	public String toString() {
		String result = "";
		for(String key : alKey) {
			int valueIdx = alKey.indexOf(key);
			result += key + "=" + alValue.get(valueIdx) + ",";	
			}
		return "{" + result.substring(0,result.length()-1) + "}"; //{name = Tom, age = 21, height = 180}	
	}

	public String get(String key) {
		int idx = alKey.indexOf(key);
		if (idx == -1) {
			return null;
		}
		return alValue.get(idx);
	}
}

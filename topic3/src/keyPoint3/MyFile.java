package keyPoint3;

import java.io.File;

public class MyFile extends File {

	private static final long serialVersionUID = 5001355090499376961L;
	private int timestamp;

	public MyFile(String fileName) {
		super(fileName);
	}

	public int getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(int timestamp) {
		this.timestamp = timestamp;
	}
	

}

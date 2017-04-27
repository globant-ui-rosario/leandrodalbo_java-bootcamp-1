package keyPoint3;

import org.junit.Test;

public class FileSystemTester {

	@Test
	public void testEmptyList() {

		FileSystem fileSystem = new FileSystem();

		if (fileSystem.getRecentFileList().isEmpty()) {

			System.out.println("definitely it is empty, trust my word");

		}

	}

	@Test
	public void testAddingAfile() {

		FileSystem fileSystem = new FileSystem();

		fileSystem.openFile("fileName");
		fileSystem.openFile("fileName2");
		fileSystem.openFile("fileName3");
		fileSystem.showRecentFileList();
	}

	@Test
	public void testOpenAfileWhenItIsAlreadyInTheList() {

		FileSystem fileSystem = new FileSystem();

		fileSystem.openFile("fileName");
		fileSystem.openFile("fileName2");
		fileSystem.openFile("fileName3");
		fileSystem.showRecentFileList();
		fileSystem.openFile("fileName3");
		fileSystem.showRecentFileList();

	}

	@Test
	public void testListIsFullAndTheOldestIsRemoved() {

		FileSystem fileSystem = new FileSystem();

		fileSystem.openFile("fileName1");
		fileSystem.openFile("fileName2");
		fileSystem.openFile("fileName3");
		fileSystem.openFile("fileName5");
		fileSystem.openFile("fileName4");
		fileSystem.openFile("fileName6");
		fileSystem.openFile("fileName7");
		fileSystem.openFile("fileName8");
		fileSystem.openFile("fileName9");
		fileSystem.openFile("fileName10");
		fileSystem.openFile("fileName11");
		fileSystem.openFile("fileName12");
		fileSystem.openFile("fileName13");
		fileSystem.openFile("fileName14");
		fileSystem.openFile("fileName15");
		fileSystem.openFile("fileName16");
		fileSystem.showRecentFileList();

	}

}

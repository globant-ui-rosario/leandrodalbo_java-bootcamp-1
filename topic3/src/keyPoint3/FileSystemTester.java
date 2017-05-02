package keyPoint3;

import static org.junit.Assert.assertEquals;

import java.io.File;

import org.junit.Test;

public class FileSystemTester {

	@Test
	public void testEmptyList() {

		FileSystem fileSystem = new FileSystem();
		assertEquals(fileSystem.getRecentFileList().isEmpty(), true);

	}

	@Test
	public void testAddingAfile() {

		FileSystem fileSystem = new FileSystem();
		fileSystem.openFile("fileName");
		MyFile file = fileSystem.getRecentFileList().getFile("fileName");
		assertEquals(fileSystem.getRecentFileList().contains(file), true);

	}

	@Test
	public void testOpenAfileWhenItIsAlreadyInTheList() {

		FileSystem fileSystem = new FileSystem();

		fileSystem.openFile("fileName");
		fileSystem.openFile("fileName2");
		fileSystem.openFile("fileName2");
		MyFile file = fileSystem.getRecentFileList().getFile("fileName2");
		assertEquals(file, fileSystem.getRecentFileList().getFiles().get(0));

	}

	@Test
	public void testListIsFullAndTheOldestIsRemoved() {

		FileSystem fileSystem = new FileSystem();

		fileSystem.openFile("fileName1");
		fileSystem.openFile("fileName2");
		fileSystem.openFile("fileName3");
		fileSystem.openFile("fileName4");
		MyFile oldestFile = fileSystem.getRecentFileList().getFile("fileName1");
		assertEquals(oldestFile, null);

	}

}

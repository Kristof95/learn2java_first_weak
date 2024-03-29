package task;

import java.awt.Component;
import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import exceptions.NotDirectoryException;

public class DirectoryScanner
{
	List<File> mp3Files;

	public DirectoryScanner(File directory, String extension) throws FileNotFoundException, NotDirectoryException
	{
		if (!directory.exists())
		{
			throw new FileNotFoundException();
		}
		if (directory.isFile())
		{
			throw new NotDirectoryException();
		}
		if (directory.isDirectory())
		{
			mp3Files = new ArrayList<File>();
			collect(directory);
		}
	}

	public List<File> getMP3Files()
	{
		return mp3Files;
	}

	public void collect(File directory)
	{
		File[] fileList = directory.listFiles(new MP3Filter());
		if (fileList != null)
		{
			for (File file : fileList)
			{
				if (file.isDirectory())
				{
					collect(file);
				} else
				{
					mp3Files.add(file);
				}
			}
		}
	}

	class MP3Filter extends Component implements FileFilter
	{
		private static final long serialVersionUID = 3318547019903835268L;

		@Override
		public boolean accept(File pathname)
		{
			if (pathname.isFile())
			{
				String extension;
				int lastPointIndex = pathname.getName().lastIndexOf('.');
				if (lastPointIndex > -1)
				{
					extension = pathname.getName().substring(lastPointIndex + 1);
					return extension.toLowerCase().equals("mp3");
				} else
				{
					return false;
				}
			}
			return true;
		}
	}

	public static void main(String[] args)
	{
		File file = new File("c:\\");
		String extension = "mp3";
		try
		{
			DirectoryScanner ds = new DirectoryScanner(file, extension);
			List<File> mp3Files = ds.getMP3Files();
			for (File file2 : mp3Files)
			{
				System.out.println(file2.getAbsolutePath());
			}
		} catch (FileNotFoundException e)
		{
			e.printStackTrace();
		} catch (NotDirectoryException e)
		{
			e.printStackTrace();
		}
	}

}
package filestreams;

import java.io.IOException;
import java.io.FileOutputStream;
/*
 * If you use an asterisk (*) with an import statement, this indicates
 * the use of a wildcard. This means that you want to, as an umbrella,
 * import/reference all classes within a package. Note, you should usually
 * just reference the specific classes, as above, instead of a general
 * reference like below, though it can be useful if you are expecting to use
 * a lot of classes from a particular package
 */
import java.io.*;

/*
 * Although we only examined FileInput/FileOutput streams, we have access
 * to many types of I/O streams in Java. FileReader/FileWriter are the
 * same as FileInput/FileOutput, except they read/write at 16 bit values
 * instead of 8 bit. 'Regular' Input Stream/Output streams can support a
 * wider variety of source/target locations, and provide a framework in
 * which other streams can be generated.
 */
public class StreamSimulator {
	/*
	 * General : Stream is an entity that can read data from a 'source'
	 * location. Perform certain actions/operations with that data. Then
	 * output a new Stream to a 'target' location. Note that intermediate
	 * operations (actions between reading/writing) do not affect the 
	 * original stream for most cases.
	 * 
	 * Java Specific : "Stream API" - Streams are a sequence of objects 
	 * that support intermediate and terminal operations. Intermediate
	 * operations will result in a new Stream which is altered based on
	 * the source data, whereas the terminal operation will generate a 
	 * final result based on the Stream data. The Stream API in Java
	 * pipelines these entities to produce a result from the source to
	 * the desired target.
	 */
	private static FileOutputStream fos = null;
	private static FileInputStream fis = null;
	private static final String FILE_NAME = "files/myFile.txt"; 
	
	public static void main(String[] args) {
		System.out.println("::: START OF APPLICATION :::");
		/*
		 * All Exception Handling done here:
		 */
		try {
			fosExample();
			fisExample();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("::: END OF APPLICATION :::");
	}
	
	public static void fosExample() throws IOException {
		/*
		 * FileOutputStream in java will not create the folders/directories
		 * for your target location, but it will create the target file 
		 */
		fos = new FileOutputStream(FILE_NAME);
		for (int rowCount = 0; rowCount < 5; rowCount++) {
			for (char letter = 'A'; letter <= 'Z'; letter++) {
				fos.write(letter);
				
				if (letter == 'Z')
					fos.write('\n');
			}
		}
		
		/*
		 * Streams are a pretty resource intensive process. As such
		 * it is best practice to close a Stream when you no longer
		 * need it.
		 */
		if (fos != null) {
			fos.close();
		}
	}
	
	public static void fisExample() throws IOException {
		fis = new FileInputStream(FILE_NAME);
		byte in;
		while((in = (byte)fis.read())!= -1) {
			System.out.print((char)in);
		}
		
		if (fis != null) {
			fis.close();
		}
	}
}

import java.io.FileInputStream;
import java.io.IOException;
class FilePortionRead
{
  public static void main(String args[]) throws IOException
  {
	  if(args.length!=1)
	  {
		  System.out.println("File read");
		  System.exit(0);
	  }
	  FileInputStream fis = new FileInputStream(args[0]);
      int size;
      size= fis.available();
	  byte [] buffer = new byte[20];
      System.out.println("The File"+args[0]+"has"+size+"bytes");
	  System.out.println("The first 20 bytes of file are::");
	  fis.read(buffer);
	   for(int i=0; i<20; i++)
        {
	      System.out.print((char)buffer[i]);
        }
	  System.out.println();
	  System.out.println("The last 20 bytes of file::");
	  fis.skip(size-10-20);
	  fis.read(buffer);
	   for(int i=0; i<20; i++)
        {
	      System.out.print((char)buffer[i]);
        }
  }
}
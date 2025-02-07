import java.io.*;
class RandomAccess
{
  public static void main(String[] args) throws IOException
   {
	   RandomAccessFile raf = new RandomAccessFile("C:\Users\Administrator\Desktop\java\FormattedWrite.java","rw");
	   raf.seek(5);
	   raf.writeChar('W');
	   raf.skipBytes(5);
	   raf.writeChar('H');
   }
} 
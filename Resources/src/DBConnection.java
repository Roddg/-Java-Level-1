import java.io.Closeable;
import java.io.IOException;


public class DBConnection implements Closeable
{
	
	public DBConnection() {
		System.out.println("open connection");
		isClosed = false;
	}
	
	public void execute() {
		System.out.println("execute commands");
	}

	boolean isClosed = true;
	@Override
	public void close() {
		
		if (!isClosed) {
			System.out.println("close connections");
			isClosed = true;
		}
		
	}
	
/*	@Override
	protected void finalize() throws Throwable {
		System.out.println("close connections");
		super.finalize();
	}*/

}

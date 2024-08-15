package Single;

	public class Logger {

	    private static Logger single_instance = null;

	    private Logger() {}

	    public static Logger getInstance() {

	                if (single_instance == null) {

	                    single_instance = new Logger();
	            }
	        return single_instance;
	    }

	    public void log(String message) {
	        System.out.println("Log message: " + message);
	    }
	}

	

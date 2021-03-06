package utilities;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import gui.Login;


public class Loggin {

	private final static Logger log = Logger.getLogger(Login.class);

	private static Loggin instance = new Loggin();

	public static Loggin getInstance() {
		return instance;
	}

	private Loggin() {
		log.setLevel(Level.ALL);
		PropertyConfigurator.configure("src/main/resources/log4j.properties");
	}

	public void info(String m) {
		log.info(m);
	}

	public void error(String m) {
		log.error(m);
	}
}

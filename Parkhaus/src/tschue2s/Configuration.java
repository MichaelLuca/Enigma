/**
 *
 * @author tschue2s
 *
 */
package tschue2s;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Scanner;

public class Configuration {
	private String filename = "config.properties";
	private int anz_etagen;
	private int anz_plaetze;
	
	public void startConfiguration() {
		Properties prop = new Properties();
		Scanner s = new Scanner(System.in);
		
		System.out.println("Richten sie Ihr Parkhaus ein!");
		System.out.println("Wie viele Etagen soll das Parkhaus besitzen? (1 - 26)");
		anz_etagen = s.nextInt();
		while(anz_etagen < 1 || anz_etagen > 26) {
			System.out.println("Ungültige Eingabe! Wählen Sie eine Zahl zwischen 1 und 26!");
			anz_etagen = s.nextInt();
		}
		System.out.println("Wie viele Parkplätze soll das Parkhaus insgesamt haben? (1 - 800)");
		anz_plaetze = s.nextInt();
		while(anz_plaetze < 1 || anz_plaetze > 800) {
			System.out.println("Ungültige Eingabe! Wählen Sie eine Zahl zwischen 1 und 800");
			anz_plaetze = s.nextInt();
		}
		System.out.println("Danke für die Konfiguration! Ihre Daten werden gespeichert.");
		s.close();
		try {
			prop.setProperty("anz_etagen", anz_etagen + "");
			prop.setProperty("anz_plaetze", anz_plaetze + "");
			
			prop.store(new FileOutputStream(filename), "Parkhaus konfiguration");
		} catch (IOException ioex) {
			ioex.printStackTrace();
		}
	}
	
	public void loadConfiguration() {
		File f = new File(filename);
		if(f.exists()) {
			Properties prop = new Properties();
			
			try (InputStream input = new FileInputStream(filename)){
				prop.load(input);
				
				anz_etagen = Integer.parseInt(prop.getProperty("anz_etagen"));
				anz_plaetze = Integer.parseInt(prop.getProperty("anz_plaetze"));
				
				System.out.println("anz_etagen = " + anz_etagen);
				System.out.println("anz_plaetze = " + anz_plaetze);
				
			} catch (IOException ioex) {
				ioex.printStackTrace();
			}
		} else {
			startConfiguration();
		}
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public int getAnz_etagen() {
		return anz_etagen;
	}

	public void setAnz_etagen(int anz_etagen) {
		this.anz_etagen = anz_etagen;
	}

	public int getAnz_plaetze() {
		return anz_plaetze;
	}

	public void setAnz_plaetze(int anz_plaetze) {
		this.anz_plaetze = anz_plaetze;
	}
}

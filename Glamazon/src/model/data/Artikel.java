package model.data;

import java.util.HashSet;
import java.util.Set;

public class Artikel {
	// Attribute (immer private!)
	private int artikelId;
	private String artName;
	private String artBeschreibung;
	private double preis;
	// private ImageIcon icon;
	private String bild; // Wird spaeter ImageIcon
	private Set<String> kategorien;
	private int mwst;

	// getter & setter (Stichwort: Encapsulation / Information Hiding,
	// Datenkapselung)
	public int getArtikelId() {
		return artikelId;
	}

	public void setArtikelId(int artikelId) {
		this.artikelId = artikelId;
	}

	public String getArtName() {
		return artName;
	}

	public void setArtName(String artName) {
		this.artName = artName;
	}

	public String getArtBeschreibung() {
		return artBeschreibung;
	}

	public void setArtBeschreibung(String artBeschreibung) {
		this.artBeschreibung = artBeschreibung;
	}

	public double getPreis() {
		return preis;
	}

	public void setPreis(double preis) {
		this.preis = preis;
	}

	public String getBild() {
		return bild;
	}

	public void setBild(String bild) {
		this.bild = bild;
	}

	public Set<String> getKategorien() {
		return kategorien;
	}

	public void setKategorien(Set<String> kategorien) {
		this.kategorien = kategorien;
	}

	public int getMwst() {
		return mwst;
	}

	public void setMwst(int mwst) {
		this.mwst = mwst;
	}

	// Konstruktor(en) / Kaskadierender Aufruf
	// Maximal-Konstruktor
	public Artikel(int id, String name, String beschreibung, double preis, 
			String bild, Set<String> kategorien, int mwst) {
		this.setArtikelId(id);
		this.setArtName(name);
		this.setArtBeschreibung(beschreibung);
		this.setPreis(preis);
		this.setBild(bild);
		this.setKategorien(kategorien);
		this.setMwst(mwst);
	}
	
	public Artikel(int id, String name, String beschreibung, double preis, int mwst) {
		this(id, name, beschreibung, preis, "", new HashSet<String>(), mwst);
	}
	
	public Artikel(String name) {
		this(-1, name, "", 0.0, 0);
	}
	
	public Artikel() {
		this("");
	}
	
	// Standard-Methoden
	@Override
	public String toString() {
		return "Artikel [getArtikelId()=" + getArtikelId() + ", getArtName()=" + getArtName()
				+ ", getArtBeschreibung()=" + getArtBeschreibung() + ", getPreis()=" + getPreis() + ", getBild()="
				+ getBild() + ", getKategorien()=" + getKategorien() + ", getMwst()=" + getMwst() + "]";
	}

	public boolean equals(Artikel artikel) {
		boolean ergebnis = false;
		if(
			this.getArtikelId() == artikel.getArtikelId() &&
			this.getArtName().equals(artikel.getArtName()) &&
			this.getArtBeschreibung().equals(artikel.getArtBeschreibung()) &&
			this.getMwst() == artikel.getMwst()
		) {
			ergebnis = true;
		}
		return ergebnis;
	}
	
	public Artikel clone() {
		return new Artikel(
				this.getArtikelId(), 
				this.getArtName(), 
				this.getArtBeschreibung(),
				this.getPreis(),
				this.getBild(),
				this.getKategorien(),
				this.getMwst()
		);
	}
	
	
//	@Override
//	public boolean equals(Object obj) {
//		boolean ergebnis = false;
//		if(this == obj) {
//			return true;
//		}
//		
//		if(obj instanceof Artikel) {
//			
//			Artikel artikel = (Artikel) obj;
//			if(
//					this.getArtikelId() == artikel.getArtikelId() &&
//					this.getArtName().equals(artikel.getArtName()) &&
//					this.getArtBeschreibung().equals(artikel.getArtBeschreibung()) &&
//					this.getMwst() == artikel.getMwst()
//				) {
//					ergebnis = true;
//				}
//		}
//		
//		return ergebnis;
//	}
	
	// Funktionalit??t
	
}

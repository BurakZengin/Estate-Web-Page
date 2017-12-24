/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.com.emlak.domain;

import java.sql.Blob;

/**
 *
 * @author ELIDOR
 */
public class Emlak {

    private String konum;
    private String tip;
    private String fiyat;
    private int evlerId;
    private String bolge;
    private String aciklama;
    private String metreKare;
    private String odaSayisi;
    private String binaYasi;
    private String bulunduguKat;
    private String katSayisi;
    private String isinma;
    private String banyoSayisi;
    private String esyali;
    private String kullanimDurumu;
    private String siteIcerisinde;
    private String aidat;
    private String krediyeUygun;
    private String kimden;
    private String takas;
    private String adres;
    private byte[] photo;

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getBulunduguKat() {
        return bulunduguKat;
    }

    public void setBulunduguKat(String bulunduguKat) {
        this.bulunduguKat = bulunduguKat;
    }

    public String getBolge() {
        return bolge;
    }

    public void setBolge(String bolge) {
        this.bolge = bolge;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public String getMetreKare() {
        return metreKare;
    }

    public void setMetreKare(String metreKare) {
        this.metreKare = metreKare;
    }

    public String getOdaSayisi() {
        return odaSayisi;
    }

    public void setOdaSayisi(String odaSayisi) {
        this.odaSayisi = odaSayisi;
    }

    public String getBinaYasi() {
        return binaYasi;
    }

    public void setBinaYasi(String binaYasi) {
        this.binaYasi = binaYasi;
    }

    public String getKatSayisi() {
        return katSayisi;
    }

    public void setKatSayisi(String katSayisi) {
        this.katSayisi = katSayisi;
    }

    public String getIsinma() {
        return isinma;
    }

    public void setIsinma(String isinma) {
        this.isinma = isinma;
    }

    public String getBanyoSayisi() {
        return banyoSayisi;
    }

    public void setBanyoSayisi(String banyoSayisi) {
        this.banyoSayisi = banyoSayisi;
    }

    public String getEsyali() {
        return esyali;
    }

    public void setEsyali(String esyali) {
        this.esyali = esyali;
    }

    public String getKullanimDurumu() {
        return kullanimDurumu;
    }

    public void setKullanimDurumu(String kullanimDurumu) {
        this.kullanimDurumu = kullanimDurumu;
    }

    public String getSiteIcerisinde() {
        return siteIcerisinde;
    }

    public void setSiteIcerisinde(String siteIcerisinde) {
        this.siteIcerisinde = siteIcerisinde;
    }

    public String getAidat() {
        return aidat;
    }

    public void setAidat(String aidat) {
        this.aidat = aidat;
    }

    public String getKrediyeUygun() {
        return krediyeUygun;
    }

    public void setKrediyeUygun(String krediyeUygun) {
        this.krediyeUygun = krediyeUygun;
    }

    public String getKimden() {
        return kimden;
    }

    public void setKimden(String kimden) {
        this.kimden = kimden;
    }

    public String getTakas() {
        return takas;
    }

    public void setTakas(String takas) {
        this.takas = takas;
    }

    public int getEvlerId() {
        return evlerId;
    }

    public void setEvlerId(int evlerId) {
        this.evlerId = evlerId;
    }

    public String getKonum() {
        return konum;
    }

    public void setKonum(String konum) {
        this.konum = konum;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public String getFiyat() {
        return fiyat;
    }

    public void setFiyat(String fiyat) {
        this.fiyat = fiyat;
    }

}

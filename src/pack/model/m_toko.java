/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack.model;

/**
 *
 * @author MaulanaFH
 */
public class m_toko {
    public String Nama_Barang, Jenis, Harga, Kategori;
    public String Kode_barang;
    
    public String getkode ()
    {
    return Kode_barang;
    }
    public String getnama ()
    {
    return Nama_Barang;
    }
    public String getkategori ()
    {
    return Kategori;
    }
    public String getjenis ()
    {
    return Jenis;
    }
    public String getharga ()
    {
    return Harga;
    }
    
    //method set
    public void setkode (String kode)
    {
    this.Kode_barang = kode;
    }
    public void setnama (String nama)
    {
    this.Nama_Barang = nama;
    }
    public void setjenis (String jenis)
    {
    this.Jenis = jenis;
    }
    public void setkategori (String kategori)
    {
    this.Kategori = kategori;
    }
    public void setharga (String harga)
    {
    this.Harga = harga;
    }
}

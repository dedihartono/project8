package com.example.aninuryani.siobat.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ModelData {

    @SerializedName("obat_id")
    @Expose
    private String obatID;

    @SerializedName("obat_nama")
    @Expose
    private String nama;


    public static final String obat_id = "OBAT_ID";
    public static final String obat_nama = "OBAT_ID";

    public ModelData(String id, String nama) {
        this.obatID = id;
        this.nama = nama;
    }

    /**
     *
     * @return
     *     The obatID
     */
    public String getObatID() {
        return obatID;
    }

    /**
     *
     * @param obatID
     *     The obat_id
     */
    public void setObatID(String obatID) {
        this.obatID = obatID;
    }

    /**
     *
     * @return
     *     The nama
     */
    public String getNama() {
        return nama;
    }

    /**
     *
     * @param nama
     *     The Nama
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

}

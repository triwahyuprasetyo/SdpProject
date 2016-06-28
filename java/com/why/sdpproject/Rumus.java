package com.why.sdpproject;

/**
 * Created by sdp03 on 6/28/16.
 */

public class Rumus {
    private double a, b;
    protected double diskon, potongan;

    public Rumus() {

    }

    public Rumus(double b, double a) {
        this.b = b;
        this.a = a;
    }

    public double getDiskon() {
        return diskon;
    }

    public void setDiskon(double diskon) {
        if (diskon < 0) {
            this.diskon = 0;
        } else if (diskon > 100) {
            this.diskon = 100;
        } else {
            this.diskon = diskon;
        }
    }

    public double didiskon(double harga) {
        return (harga - ((this.diskon / 100) * harga) - this.potongan);
    }

    public double getPotongan() {
        return potongan;
    }

    public void setPotongan(double potongan) {
        this.potongan = potongan;
    }

    public double tambah(double aa, double bb) {
        return aa + bb;
    }

    public double tambahkan(double aa, double bb) {
        double cc = 0;
        cc = aa + bb;
        return cc;
    }
}

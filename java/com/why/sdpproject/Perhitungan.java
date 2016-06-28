package com.why.sdpproject;

/**
 * Created by sdp03 on 6/28/16.
 */

public class Perhitungan extends Rumus {
    public Perhitungan() {

    }

    public double obral(double harga) {
        double total = super.didiskon(harga * 0.5);
        return total;
    }

    @Override
    public double didiskon(double harga) {
        double diskon2 = (super.diskon / 100);
        return (harga - (diskon2 * harga) - super.getPotongan());
    }
}

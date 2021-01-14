package X;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* renamed from: X.1BQ  reason: invalid class name */
public final class AnonymousClass1BQ {
    public double A00 = Double.POSITIVE_INFINITY;
    public double A01 = Double.NEGATIVE_INFINITY;
    public double A02 = Double.NaN;
    public double A03 = Double.NaN;

    public final LatLngBounds A00() {
        C001801b.A1b(!Double.isNaN(this.A02), "no included points");
        return new LatLngBounds(new LatLng(this.A00, this.A02), new LatLng(this.A01, this.A03));
    }

    public final void A01(LatLng latLng) {
        double d = this.A00;
        double d2 = latLng.A00;
        this.A00 = Math.min(d, d2);
        this.A01 = Math.max(this.A01, d2);
        double d3 = latLng.A01;
        double d4 = this.A02;
        if (Double.isNaN(d4)) {
            this.A02 = d3;
        } else {
            double d5 = this.A03;
            if (d4 <= d5) {
                if (d4 <= d3 && d3 <= d5) {
                    return;
                }
            } else if (d4 <= d3 || d3 <= d5) {
                return;
            }
            if (((d4 - d3) + 360.0d) % 360.0d < ((d3 - d5) + 360.0d) % 360.0d) {
                this.A02 = d3;
                return;
            }
        }
        this.A03 = d3;
    }
}

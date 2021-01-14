package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0Vr  reason: invalid class name and case insensitive filesystem */
public final class C07040Vr implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C19610vJ();
    public final double A00;
    public final double A01;

    public int describeContents() {
        return 0;
    }

    public C07040Vr(double d, double d2) {
        this.A00 = d;
        this.A01 = d2;
    }

    public C07040Vr(Parcel parcel) {
        this.A00 = parcel.readDouble();
        this.A01 = parcel.readDouble();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C07040Vr)) {
            return false;
        }
        C07040Vr r7 = (C07040Vr) obj;
        if (Math.abs(this.A00 - r7.A00) >= 0.002d || Math.abs(this.A01 - r7.A01) >= 2.0E-4d) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (int) (((527.0d + this.A00) * 31.0d) + this.A01);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LatLng");
        sb.append("{latitude=");
        sb.append(this.A00);
        sb.append(", longitude=");
        sb.append(this.A01);
        sb.append("}");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.A00);
        parcel.writeDouble(this.A01);
    }
}

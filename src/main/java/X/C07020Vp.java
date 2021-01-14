package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0Vp  reason: invalid class name and case insensitive filesystem */
public final class C07020Vp implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C19600vI();
    public final float A00;
    public final float A01;
    public final float A02;
    public final C07040Vr A03;

    public int describeContents() {
        return 0;
    }

    public C07020Vp(C07040Vr r1, float f, float f2, float f3) {
        this.A03 = r1;
        this.A02 = f;
        this.A01 = f2;
        this.A00 = f3;
    }

    public C07020Vp(Parcel parcel) {
        this.A03 = (C07040Vr) parcel.readParcelable(C07040Vr.class.getClassLoader());
        this.A02 = parcel.readFloat();
        this.A01 = parcel.readFloat();
        this.A00 = parcel.readFloat();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C07020Vp)) {
            return false;
        }
        C07020Vp r4 = (C07020Vp) obj;
        if (this.A00 != r4.A00) {
            return false;
        }
        C07040Vr r1 = this.A03;
        if (r1 == null) {
            if (r4.A03 == null) {
                return true;
            }
            return false;
        } else if (r1.equals(r4.A03) && this.A01 == r4.A01 && this.A02 == r4.A02) {
            return true;
        } else {
            return false;
        }
    }

    public int hashCode() {
        C07040Vr r0 = this.A03;
        float f = 17.0f;
        if (r0 != null) {
            f = 527.0f + ((float) r0.hashCode());
        }
        return (int) ((((((f * 31.0f) + this.A02) * 31.0f) + this.A01) * 31.0f) + this.A00);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CameraPosition");
        sb.append("{target=");
        sb.append(this.A03);
        sb.append(", zoom=");
        sb.append(this.A02);
        sb.append(", tilt=");
        sb.append(this.A01);
        sb.append(", bearing=");
        sb.append(this.A00);
        sb.append("}");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A03, i);
        parcel.writeFloat(this.A02);
        parcel.writeFloat(this.A01);
        parcel.writeFloat(this.A00);
    }
}

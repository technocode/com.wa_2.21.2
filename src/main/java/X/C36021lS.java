package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.Arrays;

/* renamed from: X.1lS  reason: invalid class name and case insensitive filesystem */
public final class C36021lS extends AnonymousClass066 {
    public static final Parcelable.Creator CREATOR = new AnonymousClass1BX();
    public final LatLng A00;
    public final LatLng A01;
    public final LatLng A02;
    public final LatLng A03;
    public final LatLngBounds A04;

    public C36021lS(LatLng latLng, LatLng latLng2, LatLng latLng3, LatLng latLng4, LatLngBounds latLngBounds) {
        this.A02 = latLng;
        this.A03 = latLng2;
        this.A00 = latLng3;
        this.A01 = latLng4;
        this.A04 = latLngBounds;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36021lS)) {
            return false;
        }
        C36021lS r5 = (C36021lS) obj;
        return this.A02.equals(r5.A02) && this.A03.equals(r5.A03) && this.A00.equals(r5.A00) && this.A01.equals(r5.A01) && this.A04.equals(r5.A04);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A02, this.A03, this.A00, this.A01, this.A04});
    }

    public final String toString() {
        AnonymousClass185 r2 = new AnonymousClass185(this);
        r2.A00("nearLeft", this.A02);
        r2.A00("nearRight", this.A03);
        r2.A00("farLeft", this.A00);
        r2.A00("farRight", this.A01);
        r2.A00("latLngBounds", this.A04);
        return r2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A032 = C008805h.A03(parcel, 20293);
        C008805h.A0z(parcel, 2, this.A02, i, false);
        C008805h.A0z(parcel, 3, this.A03, i, false);
        C008805h.A0z(parcel, 4, this.A00, i, false);
        C008805h.A0z(parcel, 5, this.A01, i, false);
        C008805h.A0z(parcel, 6, this.A04, i, false);
        C008805h.A0r(parcel, A032);
    }
}

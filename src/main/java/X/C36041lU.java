package X;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: X.1lU  reason: invalid class name and case insensitive filesystem */
public class C36041lU extends AnonymousClass066 {
    public static final Parcelable.Creator CREATOR = new C24501Bf();
    public long A00;
    public ParcelFileDescriptor A01;
    public DataHolder A02;
    public String A03;
    public byte[] A04;

    public C36041lU(String str, DataHolder dataHolder, ParcelFileDescriptor parcelFileDescriptor, long j, byte[] bArr) {
        this.A03 = str;
        this.A02 = dataHolder;
        this.A01 = parcelFileDescriptor;
        this.A00 = j;
        this.A04 = bArr;
    }

    public C36041lU() {
        this.A03 = null;
        this.A02 = null;
        this.A01 = null;
        this.A00 = 0;
        this.A04 = null;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A032 = C008805h.A03(parcel, 20293);
        C008805h.A10(parcel, 2, this.A03, false);
        C008805h.A0z(parcel, 3, this.A02, i, false);
        C008805h.A0z(parcel, 4, this.A01, i, false);
        C008805h.A0w(parcel, 5, this.A00);
        C008805h.A14(parcel, 6, this.A04, false);
        C008805h.A0r(parcel, A032);
        this.A01 = null;
    }
}

package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1yv  reason: invalid class name and case insensitive filesystem */
public final class C43771yv extends AnonymousClass1VM {
    public static final Parcelable.Creator CREATOR = new AnonymousClass2LS();
    public String A00;

    public int describeContents() {
        return 0;
    }

    public C43771yv(C05870Qv r2, String str, String str2, AbstractC43781yw r5) {
        this.A00 = str2;
        if (r2 != null) {
            this.A05 = r2;
            this.A07 = str;
            this.A06 = r5;
            this.A0A = "";
            return;
        }
        throw null;
    }

    public C43771yv(Parcel parcel) {
        A08(parcel);
        this.A00 = parcel.readString();
    }

    @Override // X.AnonymousClass1VM
    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("[ MERCHANT: ");
        A0S.append(super.toString());
        A0S.append(" merchantId: ");
        return AnonymousClass008.A0O(A0S, this.A00, " ]");
    }

    @Override // X.AnonymousClass1VM
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A00);
    }
}

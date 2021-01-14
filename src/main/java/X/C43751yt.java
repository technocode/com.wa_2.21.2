package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1yt  reason: invalid class name and case insensitive filesystem */
public final class C43751yt extends AnonymousClass1VM {
    public static final Parcelable.Creator CREATOR = new AnonymousClass2LM();

    public int describeContents() {
        return 0;
    }

    public C43751yt(C05870Qv r4) {
        if (r4 != null) {
            this.A05 = r4;
            this.A03 = -1;
            this.A04 = -1;
            this.A00 = 0;
            this.A01 = 0;
            return;
        }
        throw null;
    }

    public C43751yt(C05870Qv r2, String str, long j, long j2, int i, int i2, String str2, String str3, byte[] bArr, AbstractC43781yw r13) {
        if (r2 != null) {
            this.A05 = r2;
            this.A03 = j;
            this.A04 = j2;
            this.A00 = i2;
            this.A01 = i;
            this.A07 = str;
            this.A0A = str2;
            this.A08 = str3;
            this.A0B = bArr;
            this.A06 = r13;
            return;
        }
        throw null;
    }

    public C43751yt(Parcel parcel) {
        A08(parcel);
    }

    @Override // X.AnonymousClass1VM
    public String toString() {
        return AnonymousClass008.A0O(AnonymousClass008.A0S("[ BANK:"), super.toString(), " ]");
    }
}

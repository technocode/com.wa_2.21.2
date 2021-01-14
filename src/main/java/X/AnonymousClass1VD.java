package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1VD  reason: invalid class name */
public class AnonymousClass1VD implements Parcelable, Comparable {
    public static final Parcelable.Creator CREATOR = new AnonymousClass2L8();
    public C28481Um A00;
    public final String A01;
    public transient AnonymousClass02N A02;

    public int describeContents() {
        return 0;
    }

    public AnonymousClass1VD(AnonymousClass02N r2, C28481Um r3) {
        this.A02 = r2;
        this.A01 = r2.getRawString();
        this.A00 = r3;
    }

    public AnonymousClass1VD(Parcel parcel) {
        String readString = parcel.readString();
        if (readString != null) {
            this.A01 = readString;
            C28481Um r0 = (C28481Um) parcel.readParcelable(C28481Um.class.getClassLoader());
            if (r0 != null) {
                this.A00 = r0;
                return;
            }
            throw null;
        }
        throw null;
    }

    /* renamed from: A00 */
    public int compareTo(AnonymousClass1VD r7) {
        C28481Um r5 = r7.A00;
        long j = r5.A0G;
        C28481Um r2 = this.A00;
        int signum = (int) Math.signum((float) (j - r2.A0G));
        return signum == 0 ? (int) Math.signum((float) (r5.A06 - r2.A06)) : signum;
    }

    public synchronized AnonymousClass02N A01() {
        AnonymousClass02N r3;
        r3 = this.A02;
        if (r3 == null) {
            String str = this.A01;
            r3 = AnonymousClass02N.A01(str);
            StringBuilder sb = new StringBuilder();
            sb.append("contactRawJid = ");
            sb.append(str);
            AnonymousClass00E.A04(r3, sb.toString());
            this.A02 = r3;
        }
        return r3;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeParcelable(this.A00, i);
    }
}

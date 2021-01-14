package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1m1  reason: invalid class name and case insensitive filesystem */
public final class C36341m1 extends AnonymousClass066 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new AnonymousClass1CC();
    public final String A00;
    public final String A01;
    public final String A02;

    public C36341m1(String str, String str2, String str3) {
        C001801b.A1Q(str);
        this.A00 = str;
        C001801b.A1Q(str2);
        this.A02 = str2;
        C001801b.A1Q(str3);
        this.A01 = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C36341m1)) {
            return false;
        }
        C36341m1 r5 = (C36341m1) obj;
        return this.A00.equals(r5.A00) && AnonymousClass05S.A0H(r5.A02, this.A02) && AnonymousClass05S.A0H(r5.A01, this.A01);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        String str = this.A00;
        int i = 0;
        for (char c : str.toCharArray()) {
            i += c;
        }
        String trim = str.trim();
        int length = trim.length();
        if (length > 25) {
            String substring = trim.substring(0, 10);
            String substring2 = trim.substring(length - 10, length);
            StringBuilder sb = new StringBuilder(AnonymousClass008.A00(substring2, AnonymousClass008.A00(substring, 16)));
            sb.append(substring);
            sb.append("...");
            sb.append(substring2);
            sb.append("::");
            sb.append(i);
            trim = sb.toString();
        }
        String str2 = this.A02;
        String str3 = this.A01;
        StringBuilder sb2 = new StringBuilder(AnonymousClass008.A00(str3, AnonymousClass008.A00(str2, AnonymousClass008.A00(trim, 31))));
        sb2.append("Channel{token=");
        sb2.append(trim);
        sb2.append(", nodeId=");
        sb2.append(str2);
        return AnonymousClass008.A0P(sb2, ", path=", str3, "}");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = C008805h.A03(parcel, 20293);
        C008805h.A10(parcel, 2, this.A00, false);
        C008805h.A10(parcel, 3, this.A02, false);
        C008805h.A10(parcel, 4, this.A01, false);
        C008805h.A0r(parcel, A03);
    }
}

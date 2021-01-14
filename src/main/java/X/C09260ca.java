package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.whatsapp.jid.UserJid;

/* renamed from: X.0ca  reason: invalid class name and case insensitive filesystem */
public class C09260ca implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C674238n();
    public final int A00;
    public final UserJid A01;
    public final String A02;
    public final boolean A03;

    public int describeContents() {
        return 0;
    }

    public C09260ca(Parcel parcel) {
        this.A01 = (UserJid) parcel.readParcelable(UserJid.class.getClassLoader());
        this.A03 = parcel.readInt() > 0;
        String readString = parcel.readString();
        if (readString != null) {
            this.A02 = readString;
            this.A00 = parcel.readInt();
            return;
        }
        throw null;
    }

    public C09260ca(UserJid userJid, boolean z, String str, int i) {
        this.A01 = userJid;
        this.A03 = z;
        this.A02 = str;
        this.A00 = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C09260ca.class != obj.getClass()) {
            return false;
        }
        C09260ca r5 = (C09260ca) obj;
        if (!this.A01.equals(r5.A01) || this.A03 != r5.A03 || !TextUtils.equals(this.A02, r5.A02) || this.A00 != r5.A00) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = (this.A01.hashCode() + 31) * 31;
        int i = 1237;
        if (this.A03) {
            i = 1231;
        }
        return ((this.A02.hashCode() + ((hashCode + i) * 31)) * 31) + this.A00;
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("CallLog.Key[jid=");
        A0S.append(this.A01);
        A0S.append("; fromMe=");
        A0S.append(this.A03);
        A0S.append("; callId=");
        A0S.append(this.A02);
        A0S.append("; transactionId=");
        return AnonymousClass008.A0N(A0S, this.A00, "]");
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A01, i);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A00);
    }
}

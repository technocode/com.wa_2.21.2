package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.Jid;

/* renamed from: X.0OS  reason: invalid class name */
public final class AnonymousClass0OS implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C64222xp();
    public final byte A00;
    public final Jid A01;
    public final String A02;
    public final String A03;

    public int describeContents() {
        return 0;
    }

    public AnonymousClass0OS(Parcel parcel) {
        String readString;
        Jid jid;
        this.A02 = parcel.readString();
        byte readByte = parcel.readByte();
        this.A00 = readByte;
        if (readByte == 1) {
            jid = (Jid) parcel.readParcelable(Jid.class.getClassLoader());
            readString = jid.getRawString();
        } else {
            readString = parcel.readString();
            jid = null;
        }
        this.A03 = readString;
        this.A01 = jid;
    }

    public AnonymousClass0OS(String str, int i) {
        this(str, String.valueOf(i), null, (byte) 0);
    }

    public AnonymousClass0OS(String str, long j) {
        this(str, String.valueOf(j), null, (byte) 0);
    }

    public AnonymousClass0OS(String str, Jid jid) {
        this(str, jid.getRawString(), jid, (byte) 1);
    }

    public AnonymousClass0OS(String str, String str2) {
        this(str, str2, null, (byte) 0);
    }

    public AnonymousClass0OS(String str, String str2, Jid jid, byte b) {
        if (jid != null) {
            boolean z = false;
            z = (AnonymousClass1VY.A0Z(jid) || jid.getType() == 8) ? true : z;
            StringBuilder A0S = AnonymousClass008.A0S("Jid: ");
            A0S.append(AnonymousClass1VY.A0D(jid));
            A0S.append(" is not protocol compliant");
            AnonymousClass00E.A09(z, A0S.toString());
        }
        if (str != null) {
            this.A02 = str;
            if (str2 != null) {
                this.A03 = str2;
                this.A01 = jid;
                this.A00 = b;
                return;
            }
            throw null;
        }
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AnonymousClass0OS.class != obj.getClass()) {
            return false;
        }
        AnonymousClass0OS r5 = (AnonymousClass0OS) obj;
        if (!this.A02.equals(r5.A02) || !this.A03.equals(r5.A03)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.A03.hashCode() + ((this.A02.hashCode() + 31) * 31);
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("KeyValue{key='");
        AnonymousClass008.A1W(A0S, this.A02, '\'', ", value='");
        AnonymousClass008.A1W(A0S, this.A03, '\'', ", type='");
        A0S.append((int) this.A00);
        A0S.append('\'');
        A0S.append('}');
        return A0S.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        byte b = this.A00;
        parcel.writeByte(b);
        if (b == 1) {
            parcel.writeParcelable(this.A01, i);
        } else {
            parcel.writeString(this.A03);
        }
    }
}

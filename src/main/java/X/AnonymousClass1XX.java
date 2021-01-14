package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1XX  reason: invalid class name */
public class AnonymousClass1XX implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C64312xy();
    public final long A00;
    public final Jid A01;
    public final Jid A02;
    public final UserJid A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final List A09;

    public int describeContents() {
        return 0;
    }

    public AnonymousClass1XX(AnonymousClass1XX r3) {
        this.A01 = r3.A01;
        this.A05 = "call";
        this.A07 = r3.A07;
        this.A08 = r3.A08;
        this.A04 = null;
        this.A02 = r3.A02;
        this.A03 = r3.A03;
        this.A06 = null;
        this.A00 = 0;
        List list = r3.A09;
        this.A09 = list != null ? new ArrayList(list) : null;
    }

    public AnonymousClass1XX(Parcel parcel) {
        this.A01 = (Jid) parcel.readParcelable(Jid.class.getClassLoader());
        this.A05 = parcel.readString();
        this.A07 = parcel.readString();
        this.A08 = parcel.readString();
        this.A02 = (Jid) parcel.readParcelable(Jid.class.getClassLoader());
        this.A03 = (UserJid) parcel.readParcelable(UserJid.class.getClassLoader());
        this.A06 = parcel.readString();
        this.A09 = parcel.createTypedArrayList(AnonymousClass0OS.CREATOR);
        this.A04 = parcel.readString();
        this.A00 = parcel.readLong();
    }

    public AnonymousClass1XX(Jid jid, String str, String str2, String str3, String str4, Jid jid2, UserJid userJid, String str5, long j, List list) {
        this.A01 = jid;
        this.A05 = str;
        this.A07 = str2;
        this.A08 = str3;
        this.A04 = str4;
        this.A02 = jid2;
        this.A03 = userJid;
        this.A06 = str5;
        this.A00 = j;
        this.A09 = list;
    }

    public UserJid A00() {
        return UserJid.of(AnonymousClass1VY.A09(this.A02));
    }

    public AnonymousClass0M5 A01() {
        if (!(this instanceof C70083Jr)) {
            return null;
        }
        C70083Jr r9 = (C70083Jr) this;
        long j = r9.A00;
        if (j <= 0 && r9.A01 <= 0) {
            return null;
        }
        DeviceJid deviceJid = r9.A02;
        int i = 1;
        int i2 = 0;
        if (deviceJid != null) {
            i2 = 1;
        }
        int i3 = i2 + 1;
        int i4 = 0;
        if (j > 0) {
            i4 = 1;
        }
        int i5 = i3 + i4;
        long j2 = r9.A01;
        int i6 = 0;
        if (j2 > 0) {
            i6 = 1;
        }
        AnonymousClass0OS[] r6 = new AnonymousClass0OS[(i5 + i6)];
        r6[0] = new AnonymousClass0OS("call-id", r9.A03, null, (byte) 0);
        if (deviceJid != null) {
            r6[1] = new AnonymousClass0OS("call-creator", deviceJid);
            i = 2;
        }
        if (j > 0) {
            r6[i] = new AnonymousClass0OS("audio_duration", String.valueOf(j), null, (byte) 0);
            i++;
        }
        if (j2 > 0) {
            r6[i] = new AnonymousClass0OS("video_duration", String.valueOf(j2), null, (byte) 0);
        }
        return new AnonymousClass0M5("terminate", r6, null, null);
    }

    public AnonymousClass1XW A02() {
        AnonymousClass1XW r4 = new AnonymousClass1XW();
        r4.A00 = this.A01;
        r4.A04 = this.A05;
        r4.A06 = this.A07;
        r4.A07 = this.A08;
        r4.A03 = this.A04;
        r4.A01 = this.A02;
        r4.A02 = this.A03;
        r4.A05 = this.A06;
        List<AnonymousClass0OS> list = this.A09;
        if (list != null) {
            for (AnonymousClass0OS r2 : list) {
                r4.A08.put(r2.A02, r2);
            }
        }
        return r4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AnonymousClass1XX r4 = (AnonymousClass1XX) obj;
        String str = this.A05;
        if (str == null) {
            if (r4.A05 != null) {
                return false;
            }
        } else if (!str.equals(r4.A05)) {
            return false;
        }
        Jid jid = this.A01;
        if (jid == null) {
            if (r4.A01 != null) {
                return false;
            }
        } else if (!jid.equals(r4.A01)) {
            return false;
        }
        String str2 = this.A07;
        if (str2 == null) {
            if (r4.A07 != null) {
                return false;
            }
        } else if (!str2.equals(r4.A07)) {
            return false;
        }
        Jid jid2 = this.A02;
        if (jid2 == null) {
            if (r4.A02 != null) {
                return false;
            }
        } else if (!jid2.equals(r4.A02)) {
            return false;
        }
        UserJid userJid = this.A03;
        if (userJid == null) {
            if (r4.A03 != null) {
                return false;
            }
        } else if (!userJid.equals(r4.A03)) {
            return false;
        }
        String str3 = this.A08;
        if (str3 == null) {
            if (r4.A08 != null) {
                return false;
            }
        } else if (!str3.equals(r4.A08)) {
            return false;
        }
        String str4 = this.A06;
        if (str4 == null) {
            if (r4.A06 != null) {
                return false;
            }
        } else if (!str4.equals(r4.A06)) {
            return false;
        }
        List list = this.A09;
        if (list == null) {
            if (r4.A09 != null) {
                return false;
            }
        } else if (!list.equals(r4.A09)) {
            return false;
        }
        return C006803i.A0q(this.A04, r4.A04);
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        String str = this.A05;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode + 31) * 31;
        Jid jid = this.A01;
        if (jid == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = jid.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str2 = this.A07;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        Jid jid2 = this.A02;
        if (jid2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = jid2.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        UserJid userJid = this.A03;
        if (userJid == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = userJid.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        String str3 = this.A08;
        if (str3 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str3.hashCode();
        }
        int i7 = (i6 + hashCode6) * 31;
        String str4 = this.A06;
        if (str4 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str4.hashCode();
        }
        int i8 = (i7 + hashCode7) * 31;
        List list = this.A09;
        if (list == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = list.hashCode();
        }
        int i9 = (i8 + hashCode8) * 31;
        String str5 = this.A04;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return i9 + i;
    }

    public String toString() {
        String obj;
        String obj2;
        String obj3;
        String obj4;
        String obj5;
        String obj6;
        String obj7;
        StringBuilder A0S = AnonymousClass008.A0S("[StanzaKey");
        Jid jid = this.A01;
        String str = "";
        if (jid == null) {
            obj = str;
        } else {
            StringBuilder A0S2 = AnonymousClass008.A0S(" from=");
            A0S2.append(jid);
            obj = A0S2.toString();
        }
        A0S.append(obj);
        String str2 = this.A05;
        if (str2 == null) {
            obj2 = str;
        } else {
            StringBuilder A0S3 = AnonymousClass008.A0S(" cls=");
            A0S3.append(str2);
            obj2 = A0S3.toString();
        }
        A0S.append(obj2);
        String str3 = this.A07;
        if (str3 == null) {
            obj3 = str;
        } else {
            StringBuilder A0S4 = AnonymousClass008.A0S(" id=");
            A0S4.append(str3);
            obj3 = A0S4.toString();
        }
        A0S.append(obj3);
        String str4 = this.A08;
        if (str4 == null) {
            obj4 = str;
        } else {
            StringBuilder A0S5 = AnonymousClass008.A0S(" type=");
            A0S5.append(str4);
            obj4 = A0S5.toString();
        }
        A0S.append(obj4);
        String str5 = this.A04;
        if (str5 == null) {
            obj5 = str;
        } else {
            StringBuilder A0S6 = AnonymousClass008.A0S(" category=");
            A0S6.append(str5);
            obj5 = A0S6.toString();
        }
        A0S.append(obj5);
        Jid jid2 = this.A02;
        if (jid2 == null) {
            obj6 = str;
        } else {
            StringBuilder A0S7 = AnonymousClass008.A0S(" participant=");
            A0S7.append(jid2);
            obj6 = A0S7.toString();
        }
        A0S.append(obj6);
        UserJid userJid = this.A03;
        if (userJid == null) {
            obj7 = str;
        } else {
            StringBuilder A0S8 = AnonymousClass008.A0S(" recipient=");
            A0S8.append(userJid);
            obj7 = A0S8.toString();
        }
        A0S.append(obj7);
        String str6 = this.A06;
        if (str6 != null) {
            StringBuilder A0S9 = AnonymousClass008.A0S(" editVersion=");
            A0S9.append(str6);
            str = A0S9.toString();
        }
        A0S.append(str);
        A0S.append(" loggableStanzaId=");
        A0S.append(this.A00);
        A0S.append("]");
        return A0S.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A05);
        parcel.writeString(this.A07);
        parcel.writeString(this.A08);
        parcel.writeParcelable(this.A02, i);
        parcel.writeParcelable(this.A03, i);
        parcel.writeString(this.A06);
        parcel.writeTypedList(this.A09);
        parcel.writeString(this.A04);
        parcel.writeLong(this.A00);
    }
}

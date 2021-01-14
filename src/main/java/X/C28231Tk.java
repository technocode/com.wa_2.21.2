package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.1Tk  reason: invalid class name and case insensitive filesystem */
public final class C28231Tk implements Parcelable {
    public static final String[] A0D = {"category_id", "category_name"};
    public static final String[] A0E = {"time_zone", "hours_note", "day_of_week", "mode", "open_time", "close_time"};
    public static final Parcelable.Creator CREATOR = new C46982Fz();
    public C28211Ti A00;
    public C28281Ts A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public boolean A08;
    public boolean A09;
    public final UserJid A0A;
    public final List A0B = new ArrayList();
    public final List A0C = new ArrayList();

    public int describeContents() {
        return 0;
    }

    public C28231Tk(Parcel parcel) {
        this.A0A = (UserJid) parcel.readParcelable(UserJid.class.getClassLoader());
        this.A06 = parcel.readString();
        ArrayList createTypedArrayList = parcel.createTypedArrayList(C28201Th.CREATOR);
        List list = this.A0B;
        if (list != createTypedArrayList) {
            list.clear();
            if (createTypedArrayList != null) {
                this.A0B.addAll(createTypedArrayList);
            }
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        List list2 = this.A0C;
        if (list2 != createStringArrayList) {
            list2.clear();
            if (createStringArrayList != null) {
                list2.addAll(createStringArrayList);
            }
        }
        this.A04 = parcel.readString();
        this.A03 = parcel.readString();
        C28281Ts r0 = (C28281Ts) parcel.readParcelable(C28281Ts.class.getClassLoader());
        this.A01 = r0 == null ? C28281Ts.A04 : r0;
        this.A00 = (C28211Ti) parcel.readParcelable(C28211Ti.class.getClassLoader());
        boolean z = false;
        this.A09 = parcel.readByte() != 0;
        this.A07 = parcel.readString();
        this.A02 = parcel.readString();
        this.A05 = parcel.readString();
        this.A08 = parcel.readByte() != 0 ? true : z;
    }

    public C28231Tk(UserJid userJid) {
        this.A0A = userJid;
        this.A01 = C28281Ts.A04;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C28231Tk)) {
            return false;
        }
        C28231Tk r9 = (C28231Tk) obj;
        if (!C006803i.A0q(this.A0A, r9.A0A) || !C003701u.A0F(this.A06, r9.A06) || !this.A0B.equals(r9.A0B)) {
            return false;
        }
        List list = this.A0C;
        List list2 = r9.A0C;
        ArrayList arrayList = new ArrayList(list);
        ArrayList arrayList2 = new ArrayList(list2);
        arrayList.removeAll(Arrays.asList("", null));
        arrayList2.removeAll(Arrays.asList("", null));
        if (!arrayList.equals(arrayList2) || !C003701u.A0F(this.A04, r9.A04) || !C003701u.A0F(this.A03, r9.A03) || !C006803i.A0q(this.A01, r9.A01) || !C006803i.A0q(this.A00, r9.A00) || this.A09 != r9.A09 || !C003701u.A0F(this.A02, r9.A02) || !C003701u.A0F(this.A05, r9.A05) || this.A08 != r9.A08 || !C003701u.A0F(this.A07, r9.A07)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        UserJid userJid = this.A0A;
        int i9 = 0;
        if (userJid != null) {
            i = userJid.hashCode();
        } else {
            i = 0;
        }
        int i10 = i * 31;
        String str = this.A06;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i11 = (i10 + i2) * 31;
        String str2 = this.A07;
        if (str2 != null) {
            i3 = str2.hashCode();
        } else {
            i3 = 0;
        }
        int hashCode = (this.A0C.hashCode() + ((this.A0B.hashCode() + ((i11 + i3) * 31)) * 31)) * 31;
        String str3 = this.A04;
        if (str3 != null) {
            i4 = str3.hashCode();
        } else {
            i4 = 0;
        }
        int i12 = (hashCode + i4) * 31;
        String str4 = this.A03;
        if (str4 != null) {
            i5 = str4.hashCode();
        } else {
            i5 = 0;
        }
        int i13 = (i12 + i5) * 31;
        C28281Ts r0 = this.A01;
        if (r0 != null) {
            i6 = r0.hashCode();
        } else {
            i6 = 0;
        }
        int i14 = (i13 + i6) * 31;
        C28211Ti r02 = this.A00;
        if (r02 != null) {
            i7 = r02.hashCode();
        } else {
            i7 = 0;
        }
        int i15 = (((i14 + i7) * 31) + (this.A09 ? 1 : 0)) * 31;
        String str5 = this.A02;
        if (str5 != null) {
            i8 = str5.hashCode();
        } else {
            i8 = 0;
        }
        int i16 = (i15 + i8) * 31;
        String str6 = this.A05;
        if (str6 != null) {
            i9 = str6.hashCode();
        }
        return ((i16 + i9) * 31) + (this.A08 ? 1 : 0);
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("BusinessProfile{jid='");
        A0S.append(this.A0A);
        A0S.append('\'');
        A0S.append(", tag='");
        AnonymousClass008.A1W(A0S, this.A06, '\'', ", websites=");
        A0S.append(this.A0C);
        A0S.append(", email='");
        AnonymousClass008.A1W(A0S, this.A04, '\'', ", description='");
        AnonymousClass008.A1W(A0S, this.A03, '\'', ", address='");
        A0S.append(this.A01);
        A0S.append('\'');
        A0S.append(", vertical='");
        AnonymousClass008.A1W(A0S, this.A07, '\'', ", categories='");
        A0S.append(this.A0B.size());
        A0S.append('\'');
        A0S.append(", hours='");
        A0S.append(this.A00);
        A0S.append('\'');
        A0S.append(", has_catalog='");
        A0S.append(this.A09);
        A0S.append('\'');
        A0S.append(", commerceExperience='");
        AnonymousClass008.A1W(A0S, this.A02, '\'', ", shopUrl='");
        AnonymousClass008.A1W(A0S, this.A05, '\'', ", cart_enabled='");
        A0S.append(this.A08);
        A0S.append('\'');
        A0S.append('}');
        return A0S.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A0A, i);
        parcel.writeString(this.A06);
        parcel.writeTypedList(this.A0B);
        parcel.writeStringList(this.A0C);
        parcel.writeString(this.A04);
        parcel.writeString(this.A03);
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A00, i);
        parcel.writeByte(this.A09 ? (byte) 1 : 0);
        parcel.writeString(this.A07);
        parcel.writeString(this.A02);
        parcel.writeString(this.A05);
        parcel.writeByte(this.A08 ? (byte) 1 : 0);
    }
}

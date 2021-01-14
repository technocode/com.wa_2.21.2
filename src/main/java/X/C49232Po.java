package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.File;
import java.util.Arrays;

/* renamed from: X.2Po  reason: invalid class name and case insensitive filesystem */
public class C49232Po implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C49222Pn();
    public int A00;
    public int A01;
    public int A02;
    public String A03;
    public String A04;

    public int describeContents() {
        return 0;
    }

    public C49232Po() {
    }

    public C49232Po(Parcel parcel) {
        if (parcel != null) {
            this.A04 = parcel.readString();
            this.A03 = parcel.readString();
            this.A01 = parcel.readInt();
            this.A02 = parcel.readInt();
            this.A00 = parcel.readInt();
        }
    }

    public C49232Po(String str, String str2, int i, int i2, int i3) {
        this.A04 = str;
        this.A03 = str2;
        this.A01 = i;
        this.A02 = i2;
        this.A00 = i3;
    }

    public static C49232Po A00(AnonymousClass0ZB r3) {
        C49232Po r2 = new C49232Po();
        AnonymousClass0M4 r1 = ((AnonymousClass0M3) r3).A02;
        if (r1 != null) {
            File file = r1.A0F;
            if (file == null || !file.exists()) {
                String str = ((AnonymousClass0M3) r3).A08;
                if (str != null) {
                    r2.A03 = str;
                }
            } else {
                r2.A03 = r1.A0F.getAbsolutePath();
            }
            r2.A04 = ((AnonymousClass0M3) r3).A06;
            r2.A02 = r1.A08;
            r2.A01 = r1.A06;
            r2.A00 = r1.A05;
        }
        return r2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C49232Po)) {
            return false;
        }
        C49232Po r4 = (C49232Po) obj;
        if (r4.A04.equals(this.A04) && r4.A03.equals(this.A03) && r4.A01 == this.A01 && r4.A02 == this.A02 && r4.A00 == this.A00) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A04, this.A03, Integer.valueOf(this.A01), Integer.valueOf(this.A02), Integer.valueOf(this.A00)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A04);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A00);
    }
}

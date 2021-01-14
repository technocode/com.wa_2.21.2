package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1Tj  reason: invalid class name and case insensitive filesystem */
public class C28221Tj implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C46972Fy();
    public final int A00;
    public final int A01;
    public final Integer A02;
    public final Integer A03;

    public int describeContents() {
        return 0;
    }

    public C28221Tj(int i, int i2, Integer num, Integer num2) {
        this.A00 = i;
        this.A01 = i2;
        this.A03 = num;
        this.A02 = num2;
    }

    public C28221Tj(Parcel parcel) {
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
        if (parcel.readByte() == 0) {
            this.A03 = null;
        } else {
            this.A03 = Integer.valueOf(parcel.readInt());
        }
        if (parcel.readByte() == 0) {
            this.A02 = null;
        } else {
            this.A02 = Integer.valueOf(parcel.readInt());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0024 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof X.C28221Tj
            r2 = 0
            if (r0 != 0) goto L_0x0006
            return r2
        L_0x0006:
            X.1Tj r4 = (X.C28221Tj) r4
            int r1 = r3.A00
            int r0 = r4.A00
            if (r1 != r0) goto L_0x0025
            int r1 = r3.A01
            int r0 = r4.A01
            if (r1 != r0) goto L_0x0025
            java.lang.Integer r1 = r3.A03
            if (r1 != 0) goto L_0x002d
            java.lang.Integer r0 = r4.A03
            if (r0 != 0) goto L_0x0025
        L_0x001c:
            java.lang.Integer r1 = r3.A02
            java.lang.Integer r0 = r4.A02
            if (r1 != 0) goto L_0x0026
            if (r0 != 0) goto L_0x0025
        L_0x0024:
            r2 = 1
        L_0x0025:
            return r2
        L_0x0026:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0025
            goto L_0x0024
        L_0x002d:
            java.lang.Integer r0 = r4.A03
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0025
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28221Tj.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i;
        int i2 = ((this.A00 * 31) + this.A01) * 31;
        Integer num = this.A03;
        int i3 = 0;
        if (num != null) {
            i = num.hashCode();
        } else {
            i = 0;
        }
        int i4 = (i2 + i) * 31;
        Integer num2 = this.A02;
        if (num2 != null) {
            i3 = num2.hashCode();
        }
        return i4 + i3;
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("dayOfWeek: ");
        A0S.append(this.A00);
        A0S.append(", mode: ");
        A0S.append(this.A01);
        A0S.append(", openTime: ");
        A0S.append(this.A03);
        A0S.append(", closeTime: ");
        A0S.append(this.A02);
        return A0S.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        Integer num = this.A03;
        if (num == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.A02;
        if (num2 == null) {
            parcel.writeByte((byte) 0);
            return;
        }
        parcel.writeByte((byte) 1);
        parcel.writeInt(num2.intValue());
    }
}

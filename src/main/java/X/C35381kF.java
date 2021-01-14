package X;

import android.os.Parcel;

/* renamed from: X.1kF  reason: invalid class name and case insensitive filesystem */
public class C35381kF extends AnonymousClass066 {
    public static final C239118b CREATOR = new C239118b();
    public AnonymousClass18Z A00;
    public C35401kH A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final Class A06;
    public final String A07;
    public final String A08;
    public final boolean A09;
    public final boolean A0A;

    public C35381kF(int i, int i2, boolean z, int i3, boolean z2, String str, int i4, String str2, C35371kE r11) {
        this.A02 = i;
        this.A03 = i2;
        this.A09 = z;
        this.A04 = i3;
        this.A0A = z2;
        this.A07 = str;
        this.A05 = i4;
        if (str2 == null) {
            this.A06 = null;
            this.A08 = null;
        } else {
            this.A06 = AnonymousClass26C.class;
            this.A08 = str2;
        }
        if (r11 == null) {
            this.A00 = null;
            return;
        }
        C35361kD r0 = r11.A01;
        if (r0 != null) {
            this.A00 = r0;
            return;
        }
        throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
    }

    public C35381kF(int i, boolean z, int i2, boolean z2, String str, int i3, Class cls) {
        this.A02 = 1;
        this.A03 = i;
        this.A09 = z;
        this.A04 = i2;
        this.A0A = z2;
        this.A07 = str;
        this.A05 = i3;
        this.A06 = cls;
        if (cls == null) {
            this.A08 = null;
        } else {
            this.A08 = cls.getCanonicalName();
        }
        this.A00 = null;
    }

    public static C35381kF A00(String str, int i) {
        return new C35381kF(7, true, 7, true, str, i, null);
    }

    public String toString() {
        AnonymousClass185 r2 = new AnonymousClass185(this);
        r2.A00("versionCode", Integer.valueOf(this.A02));
        r2.A00("typeIn", Integer.valueOf(this.A03));
        r2.A00("typeInArray", Boolean.valueOf(this.A09));
        r2.A00("typeOut", Integer.valueOf(this.A04));
        r2.A00("typeOutArray", Boolean.valueOf(this.A0A));
        r2.A00("outputFieldName", this.A07);
        r2.A00("safeParcelFieldId", Integer.valueOf(this.A05));
        String str = this.A08;
        if (str == null) {
            str = null;
        }
        r2.A00("concreteTypeName", str);
        Class cls = this.A06;
        if (cls != null) {
            r2.A00("concreteType.class", cls.getCanonicalName());
        }
        AnonymousClass18Z r0 = this.A00;
        if (r0 != null) {
            r2.A00("converterName", r0.getClass().getCanonicalName());
        }
        return r2.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A032 = C008805h.A03(parcel, 20293);
        C008805h.A0u(parcel, 1, this.A02);
        C008805h.A0u(parcel, 2, this.A03);
        C008805h.A13(parcel, 3, this.A09);
        C008805h.A0u(parcel, 4, this.A04);
        C008805h.A13(parcel, 5, this.A0A);
        C008805h.A10(parcel, 6, this.A07, false);
        C008805h.A0u(parcel, 7, this.A05);
        String str = this.A08;
        C35371kE r3 = null;
        if (str == null) {
            str = null;
        }
        C008805h.A10(parcel, 8, str, false);
        AnonymousClass18Z r1 = this.A00;
        if (r1 != null) {
            if (r1 instanceof C35361kD) {
                r3 = new C35371kE((C35361kD) r1);
            } else {
                throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
            }
        }
        C008805h.A0z(parcel, 9, r3, i, false);
        C008805h.A0r(parcel, A032);
    }
}

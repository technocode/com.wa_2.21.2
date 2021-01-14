package X;

import android.database.Cursor;
import android.location.Location;
import android.text.TextUtils;
import com.whatsapp.PlaceInfo;

/* renamed from: X.0Or  reason: invalid class name and case insensitive filesystem */
public class C05470Or extends AbstractC02860Dt implements AbstractC02870Du, AbstractC02880Dv, AnonymousClass0M0 {
    public String A00;
    public String A01;
    public String A02;

    public C05470Or(C007303n r2, long j) {
        super(r2, j, (byte) 5);
    }

    public C05470Or(C007303n r2, long j, byte b) {
        super(r2, j, (byte) 30);
    }

    public C05470Or(C007303n r2, long j, C76313eL r5, boolean z) {
        super(r2, j, (byte) 5);
        A0z(r5, z);
    }

    public C05470Or(C007303n r3, long j, Location location) {
        super(r3, j, (byte) 5);
        if (location != null) {
            ((AbstractC02860Dt) this).A00 = location.getLatitude();
            ((AbstractC02860Dt) this).A01 = location.getLongitude();
        }
        A0T(1);
    }

    public C05470Or(C007303n r3, long j, PlaceInfo placeInfo) {
        super(r3, j, (byte) 5);
        A0T(1);
        ((AbstractC02860Dt) this).A00 = placeInfo.lat;
        ((AbstractC02860Dt) this).A01 = placeInfo.lon;
        this.A01 = placeInfo.name;
        this.A00 = placeInfo.address;
        this.A02 = placeInfo.url;
    }

    public C05470Or(C05470Or r9, C007303n r10, long j) {
        super(r9, r10, j, false, (byte) 5);
        this.A01 = r9.A01;
        this.A00 = r9.A00;
        this.A02 = r9.A02;
    }

    public C05470Or(C05470Or r9, C007303n r10, long j, boolean z) {
        super(r9, r10, j, z, r9.A0m);
        this.A01 = r9.A01;
        this.A00 = r9.A00;
        this.A02 = r9.A02;
    }

    @Override // X.AbstractC02860Dt
    public void A0u(Cursor cursor) {
        super.A0u(cursor);
        this.A01 = cursor.getString(cursor.getColumnIndexOrThrow("place_name"));
        this.A00 = cursor.getString(cursor.getColumnIndexOrThrow("place_address"));
        this.A02 = cursor.getString(cursor.getColumnIndexOrThrow("url"));
    }

    @Override // X.AbstractC02860Dt
    public void A0v(Cursor cursor, AnonymousClass01I r3) {
        super.A0v(cursor, r3);
        this.A01 = cursor.getString(cursor.getColumnIndexOrThrow("place_name"));
        this.A00 = cursor.getString(cursor.getColumnIndexOrThrow("place_address"));
        this.A02 = cursor.getString(cursor.getColumnIndexOrThrow("url"));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001a, code lost:
        if (r1.startsWith(r2) != false) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A0w() {
        /*
        // Method dump skipped, instructions count: 101
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05470Or.A0w():java.lang.String");
    }

    public String A0x() {
        String str = this.A01;
        String str2 = this.A00;
        if (str2 == null) {
            return str;
        }
        StringBuilder A0Y = AnonymousClass008.A0Y(str, "\n");
        A0Y.append(str2);
        return A0Y.toString();
    }

    public void A0y(AnonymousClass01I r6, boolean z, C007103l r8, byte[] bArr, C76303eK r10) {
        C05440On A0B = A0B();
        double d = ((AbstractC02860Dt) this).A00;
        r10.A02();
        C76313eL r3 = (C76313eL) r10.A00;
        r3.A04 |= 1;
        r3.A00 = d;
        double d2 = ((AbstractC02860Dt) this).A01;
        r10.A02();
        C76313eL r32 = (C76313eL) r10.A00;
        r32.A04 |= 2;
        r32.A01 = d2;
        if (!TextUtils.isEmpty(this.A02)) {
            String str = this.A02;
            r10.A02();
            C76313eL r1 = (C76313eL) r10.A00;
            if (str != null) {
                r1.A04 |= 16;
                r1.A0B = str;
            } else {
                throw null;
            }
        }
        if (!TextUtils.isEmpty(this.A01)) {
            String str2 = this.A01;
            r10.A02();
            C76313eL r12 = (C76313eL) r10.A00;
            if (str2 != null) {
                r12.A04 |= 4;
                r12.A0A = str2;
            } else {
                throw null;
            }
        }
        if (!TextUtils.isEmpty(this.A00)) {
            String str3 = this.A00;
            r10.A02();
            C76313eL r13 = (C76313eL) r10.A00;
            if (str3 != null) {
                r13.A04 |= 8;
                r13.A08 = str3;
            } else {
                throw null;
            }
        }
        if (!z && A0B.A08() != null) {
            byte[] A08 = A0B.A08();
            AnonymousClass071 A002 = AnonymousClass071.A00(A08, 0, A08.length);
            r10.A02();
            C76313eL r14 = (C76313eL) r10.A00;
            r14.A04 |= 1024;
            r14.A06 = A002;
        }
        if (AnonymousClass0ZG.A0M(this, r8, bArr)) {
            C75423cu A022 = AnonymousClass0ZG.A02(r6, this, z, r8, bArr);
            r10.A02();
            C76313eL r15 = (C76313eL) r10.A00;
            if (A022 != null) {
                r15.A07 = A022;
                r15.A04 |= 2048;
                return;
            }
            throw null;
        }
    }

    public void A0z(C76313eL r5, boolean z) {
        ((AbstractC02860Dt) this).A00 = r5.A00;
        ((AbstractC02860Dt) this).A01 = r5.A01;
        int i = r5.A04;
        boolean z2 = false;
        if ((i & 16) == 16) {
            z2 = true;
        }
        if (z2) {
            this.A02 = r5.A0B;
        }
        boolean z3 = false;
        if ((i & 4) == 4) {
            z3 = true;
        }
        if (z3) {
            this.A01 = r5.A0A;
        }
        boolean z4 = false;
        if ((i & 8) == 8) {
            z4 = true;
        }
        if (z4) {
            this.A00 = r5.A08;
        }
        boolean z5 = false;
        if ((i & 1024) == 1024) {
            z5 = true;
        }
        if (z5) {
            A0B().A04(r5.A06.A01(), z);
            ((AbstractC02860Dt) this).A02 = 2;
        }
    }

    @Override // X.AbstractC02880Dv
    public void A2N(C64552yN r12) {
        AnonymousClass078 r0;
        if (!(this instanceof AnonymousClass2A7)) {
            C04970Mo r1 = r12.A01;
            C76313eL r02 = ((C02840Dr) r1.A00).A0N;
            if (r02 == null) {
                r02 = C76313eL.A0D;
            }
            C76303eK r7 = (C76303eK) r02.AQb();
            A0y(r12.A00, r12.A03, r12.A02, r12.A05, r7);
            r1.A02();
            C02840Dr r13 = (C02840Dr) r1.A00;
            if (r13 != null) {
                r13.A0N = (C76313eL) r7.A01();
                r13.A00 |= 16;
                return;
            }
            throw null;
        }
        AnonymousClass2A7 r5 = (AnonymousClass2A7) this;
        C04970Mo r4 = r12.A01;
        C76523eg r3 = (C76523eg) r4.A04().AQb();
        AnonymousClass0OH r2 = r4.A04().A03;
        if (r2 == null) {
            r2 = AnonymousClass0OH.A07;
        }
        if (r2.A01 == 5) {
            r0 = (AnonymousClass078) r2.A03;
        } else {
            r0 = C76313eL.A0D;
        }
        C76303eK r10 = (C76303eK) r0.AQb();
        r5.A0y(r12.A00, r12.A03, r12.A02, r12.A05, r10);
        AnonymousClass0OF r03 = r5.A00;
        if (r03 != null) {
            AnonymousClass0OI A0x = C002001d.A0x(r4, r03);
            A0x.A02();
            AnonymousClass0OH r14 = (AnonymousClass0OH) A0x.A00;
            if (r14 != null) {
                r14.A03 = r10.A01();
                r14.A01 = 5;
                r3.A05(A0x);
                r3.A04(A0x);
                r4.A0A(r3);
                return;
            }
            throw null;
        }
        AnonymousClass008.A1M(AnonymousClass008.A0S("FMessageTemplateLocation/buildE2eMessage/Error: cannot send encrypted template location message, "), r5.A0m);
    }

    @Override // X.AnonymousClass0M0
    public /* bridge */ /* synthetic */ AbstractC007503q A2m(C007303n r7, long j) {
        if (this instanceof AnonymousClass2A7) {
            return new C05470Or(this, r7, j);
        }
        if (!(this instanceof AnonymousClass2A7)) {
            return new C05470Or(this, r7, j, false);
        }
        return new C05470Or(this, r7, j);
    }

    @Override // X.AbstractC02870Du
    public /* bridge */ /* synthetic */ AbstractC007503q A2n(C007303n r9) {
        if (this instanceof AnonymousClass2A7) {
            AnonymousClass2A7 r3 = (AnonymousClass2A7) this;
            return new AnonymousClass2A7(r3, r9, r3.A0E);
        } else if (!(this instanceof AnonymousClass2A7)) {
            return new C05470Or(this, r9, this.A0E, true);
        } else {
            AnonymousClass2A7 r32 = (AnonymousClass2A7) this;
            return new AnonymousClass2A7(r32, r9, r32.A0E);
        }
    }
}

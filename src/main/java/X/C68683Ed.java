package X;

import com.whatsapp.util.Log;

/* renamed from: X.3Ed  reason: invalid class name and case insensitive filesystem */
public class C68683Ed implements AbstractC61782tj {
    public static volatile C68683Ed A04;
    public Integer A00;
    public final AnonymousClass00Y A01;
    public final C68393Da A02;
    public final C61772ti A03;

    public C68683Ed(AnonymousClass00Y r1, C61772ti r2, C68393Da r3) {
        this.A01 = r1;
        this.A03 = r2;
        this.A02 = r3;
    }

    public static C68683Ed A00() {
        if (A04 == null) {
            synchronized (C68683Ed.class) {
                if (A04 == null) {
                    A04 = new C68683Ed(AnonymousClass00Y.A00(), C61772ti.A00(), C68393Da.A00());
                }
            }
        }
        return A04;
    }

    public AnonymousClass208 A01(int i) {
        C61772ti r3 = this.A03;
        String str = r3.A02;
        if (str == null) {
            str = r3.A02();
        }
        AnonymousClass208 r2 = new AnonymousClass208();
        r2.A00 = this.A00;
        r2.A07 = str;
        r2.A03 = Long.valueOf(r3.A01());
        r2.A02 = Integer.valueOf(i);
        return r2;
    }

    public final AnonymousClass208 A02(int i, C61072sS r4) {
        int i2;
        AnonymousClass208 A012 = A01(i);
        A04(this.A02.A04());
        if (r4 != null) {
            A012.A05 = String.valueOf(r4.code);
            A012.A06 = r4.text;
            i2 = 2;
        } else {
            i2 = 1;
        }
        A012.A01 = Integer.valueOf(i2);
        return A012;
    }

    public void A03(int i, AnonymousClass1VM r6, C61072sS r7) {
        String str;
        AnonymousClass208 A022 = A02(i, r7);
        AbstractC43781yw r0 = r6.A06;
        if (r0 == null) {
            str = "";
        } else {
            str = ((C74463ay) r0).A09;
        }
        A022.A04 = str;
        StringBuilder A0S = AnonymousClass008.A0S("PAY: PaymentWamEvent event:");
        A0S.append(A022.toString());
        Log.i(A0S.toString());
        this.A01.A0B(A022, null, false);
    }

    public void A04(String str) {
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != 81882) {
                if (hashCode != 2023329) {
                    if (hashCode == 2212537 && str.equals("HDFC")) {
                        this.A00 = 2;
                        return;
                    }
                } else if (str.equals("AXIS")) {
                    this.A00 = 3;
                    return;
                }
            } else if (str.equals("SBI")) {
                this.A00 = 4;
                return;
            }
            this.A00 = 1;
            return;
        }
        this.A00 = 1;
    }

    @Override // X.AbstractC61782tj
    public void ABo(int i, C61072sS r6) {
        AnonymousClass208 A022 = A02(i, r6);
        StringBuilder A0S = AnonymousClass008.A0S("PAY: PaymentWamEvent event: ");
        A0S.append(A022.toString());
        Log.i(A0S.toString());
        this.A01.A0B(A022, null, false);
    }

    @Override // X.AbstractC61782tj
    public void AGT(C61072sS r2) {
        ABo(12, r2);
    }

    @Override // X.AbstractC61782tj
    public void AGY(C61072sS r2) {
        ABo(10, r2);
    }

    @Override // X.AbstractC61782tj
    public void AGZ(C61072sS r2) {
        ABo(11, r2);
    }

    @Override // X.AbstractC61782tj
    public void AQ7() {
        C61772ti r3 = this.A03;
        r3.A04.A07(null, "PaymentWamEvent timer reset.", null);
        r3.A00 = r3.A01.A05();
    }

    @Override // X.AbstractC61782tj
    public void reset() {
        C61772ti r2 = this.A03;
        r2.A02 = null;
        r2.A00 = 0;
    }
}

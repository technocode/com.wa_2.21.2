package X;

import com.whatsapp.util.Log;

/* renamed from: X.37E  reason: invalid class name */
public class AnonymousClass37E {
    public static volatile AnonymousClass37E A0A;
    public C72403Ss A00;
    public final AnonymousClass02M A01;
    public final AnonymousClass03P A02;
    public final AnonymousClass00S A03;
    public final AnonymousClass00G A04;
    public final AnonymousClass01X A05;
    public final AnonymousClass00Y A06;
    public final C04420Kh A07;
    public final C02560Co A08;
    public final AnonymousClass00T A09;

    public AnonymousClass37E(AnonymousClass00G r1, AnonymousClass00S r2, AnonymousClass02M r3, AnonymousClass00T r4, AnonymousClass00Y r5, AnonymousClass03P r6, AnonymousClass01X r7, C02560Co r8, C04420Kh r9) {
        this.A04 = r1;
        this.A03 = r2;
        this.A01 = r3;
        this.A09 = r4;
        this.A06 = r5;
        this.A02 = r6;
        this.A05 = r7;
        this.A08 = r8;
        this.A07 = r9;
    }

    public static AnonymousClass37E A00() {
        if (A0A == null) {
            synchronized (AnonymousClass37E.class) {
                if (A0A == null) {
                    A0A = new AnonymousClass37E(AnonymousClass00G.A01, AnonymousClass00S.A00(), AnonymousClass02M.A00(), C002101e.A00(), AnonymousClass00Y.A00(), AnonymousClass03P.A00(), AnonymousClass01X.A00(), C02560Co.A01, C04420Kh.A00());
                }
            }
        }
        return A0A;
    }

    public static boolean A01(AnonymousClass0M4 r4, C60602pn r5) {
        StringBuilder sb = new StringBuilder("ReusableVideoPlayer/isDownloadActive/");
        sb.append("mediaDataV2.transferring=");
        sb.append(r4.A0a);
        sb.append(",downloader is not null=");
        boolean z = false;
        if (r5 != null) {
            z = true;
        }
        sb.append(z);
        if (r5 != null) {
            sb.append(",downloader.context is not null=");
            boolean z2 = false;
            if (r5.A0h != null) {
                z2 = true;
            }
            sb.append(z2);
        }
        Log.d(sb.toString());
        if (!r4.A0a || r5 == null || r5.A0h == null) {
            return false;
        }
        return true;
    }
}

package X;

import android.net.Uri;
import android.os.SystemClock;

/* renamed from: X.3ME  reason: invalid class name */
public abstract class AnonymousClass3ME {
    public long A00;
    public C09960do A01;
    public AnonymousClass0QJ A02;
    public boolean A03;
    public final int A04;
    public final AnonymousClass0EW A05;
    public final AnonymousClass02M A06;
    public final AnonymousClass01A A07;
    public final AnonymousClass0XN A08;
    public final AnonymousClass00Y A09;
    public final AnonymousClass09H A0A;
    public final AnonymousClass0IA A0B;
    public final AnonymousClass00T A0C;
    public final String A0D;

    public AnonymousClass3ME(AnonymousClass02M r1, AnonymousClass00T r2, AnonymousClass00Y r3, AnonymousClass09H r4, AnonymousClass01A r5, AnonymousClass0EW r6, AnonymousClass0XN r7, AnonymousClass0IA r8, String str, int i) {
        this.A06 = r1;
        this.A0C = r2;
        this.A09 = r3;
        this.A0A = r4;
        this.A07 = r5;
        this.A05 = r6;
        this.A08 = r7;
        this.A04 = i;
        this.A0B = r8;
        this.A0D = str;
    }

    public void A00() {
        this.A03 = true;
        C09960do r0 = this.A01;
        if (r0 != null) {
            ((AnonymousClass0JW) r0).A00.cancel(false);
            this.A01 = null;
        }
        AbstractC07560Ye r02 = (AbstractC07560Ye) ((AnonymousClass3ZB) this).A03.get();
        if (r02 != null) {
            r02.A0D = false;
        }
    }

    public void A01() {
        String substring;
        this.A00 = SystemClock.elapsedRealtime();
        AnonymousClass3MI r12 = new AnonymousClass3MI(this.A06, this.A0A, this);
        String str = this.A0D;
        int i = this.A04;
        if (i != 0) {
            substring = "";
            if (i != 2) {
                AnonymousClass008.A0u("ContactQrUtils/getUniqueIdFromContactQrCode/invalid code type", i);
            } else {
                String lastPathSegment = Uri.parse(str).getLastPathSegment();
                if (lastPathSegment != null) {
                    substring = lastPathSegment;
                }
            }
        } else {
            substring = str.substring(17);
        }
        AnonymousClass09H r8 = r12.A01;
        String A022 = r8.A02();
        AnonymousClass0M5 r4 = new AnonymousClass0M5("qr", new AnonymousClass0OS[]{new AnonymousClass0OS("code", substring, null, (byte) 0)}, null, null);
        r8.A07(216, A022, new AnonymousClass0M5("iq", new AnonymousClass0OS[]{new AnonymousClass0OS("id", A022, null, (byte) 0), new AnonymousClass0OS("xmlns", "w:qr", null, (byte) 0), new AnonymousClass0OS("type", "get", null, (byte) 0)}, r4), r12, 32000);
    }

    public void A02(AnonymousClass0QK r8) {
        long j;
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.A00;
        AnonymousClass02M r4 = this.A06;
        RunnableEBaseShape9S0200000_I1_4 runnableEBaseShape9S0200000_I1_4 = new RunnableEBaseShape9S0200000_I1_4(this, r8, 6);
        if (elapsedRealtime < 500) {
            j = 500 - elapsedRealtime;
        } else {
            j = 0;
        }
        r4.A02.postDelayed(runnableEBaseShape9S0200000_I1_4, j);
    }
}

package X;

import android.net.Uri;

/* renamed from: X.1i1  reason: invalid class name and case insensitive filesystem */
public final class C34171i1 implements AnonymousClass15P {
    public long A00 = -1;
    public long A01;
    public AnonymousClass15G A02;
    public boolean A03 = true;
    public final Uri A04;
    public final AnonymousClass13C A05;
    public final AnonymousClass13F A06;
    public final C228813n A07;
    public final C34491iZ A08;
    public final C232715b A09;
    public volatile boolean A0A;
    public final /* synthetic */ AnonymousClass25V A0B;

    public C34171i1(AnonymousClass25V r9, Uri uri, AnonymousClass15E r11, C228813n r12, AnonymousClass13C r13, C232715b r14) {
        this.A0B = r9;
        this.A04 = uri;
        this.A08 = new C34491iZ(r11);
        this.A07 = r12;
        this.A05 = r13;
        this.A09 = r14;
        AnonymousClass13F r2 = new AnonymousClass13F();
        this.A06 = r2;
        this.A02 = new AnonymousClass15G(uri, r2.A00, -1);
    }
}

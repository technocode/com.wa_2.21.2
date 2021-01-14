package X;

import android.app.Application;
import android.os.SystemClock;
import com.whatsapp.jid.UserJid;
import com.whatsapp.jobqueue.job.GetVNameCertificateJob;

/* renamed from: X.2nW  reason: invalid class name and case insensitive filesystem */
public class C59362nW extends C30231ay {
    public C27241Os A00;
    public final C02270Bi A01 = new C02270Bi();
    public final AbstractC03680Hf A02;
    public final AnonymousClass02M A03;
    public final C000300f A04;
    public final AnonymousClass01J A05;
    public final C017009c A06;
    public final C017109d A07;
    public final AnonymousClass0HL A08;
    public final AnonymousClass1S0 A09;
    public final AnonymousClass1S3 A0A;
    public final AnonymousClass08B A0B;
    public final AnonymousClass01X A0C;
    public final AnonymousClass01P A0D;
    public final C06190Sd A0E;
    public final C002701k A0F;
    public final AnonymousClass09H A0G;
    public final AnonymousClass00T A0H;

    public C59362nW(Application application, C002701k r3, AnonymousClass02M r4, AnonymousClass00T r5, C000300f r6, AnonymousClass01J r7, AnonymousClass09H r8, AnonymousClass1S3 r9, C06190Sd r10, AnonymousClass01X r11, AnonymousClass08B r12, AnonymousClass1S0 r13, AnonymousClass0HL r14, AnonymousClass01P r15, C017109d r16, C017009c r17, AbstractC03680Hf r18) {
        super(application);
        this.A0F = r3;
        this.A03 = r4;
        this.A02 = r18;
        this.A0H = r5;
        this.A04 = r6;
        this.A05 = r7;
        this.A0G = r8;
        this.A0A = r9;
        this.A0E = r10;
        this.A0C = r11;
        this.A0B = r12;
        this.A09 = r13;
        this.A0D = r15;
        this.A08 = r14;
        this.A07 = r16;
        this.A06 = r17;
    }

    public final void A02(UserJid userJid) {
        if (this.A00 != null) {
            C017009c r8 = this.A06;
            String A012 = r8.A01(userJid);
            if (A012 != null) {
                this.A00.A0A = A012;
                A03(userJid);
                return;
            }
            new C40141sh(this.A07.A01(), userJid, null, this.A03, this.A0G, this.A0B, r8).A00(this.A02);
        }
    }

    public final void A03(UserJid userJid) {
        if (this.A00 != null) {
            AnonymousClass0J9 A0C2 = this.A0D.A02.A0C(userJid);
            if (A0C2 != null) {
                C27241Os r1 = this.A00;
                r1.A0C = A0C2.A08;
                this.A01.A07(r1);
                return;
            }
            AnonymousClass01J r0 = this.A05;
            r0.A00.A01(new GetVNameCertificateJob(userJid));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003d, code lost:
        if (r2.A00 != false) goto L_0x003f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04(com.whatsapp.jid.UserJid r7, java.lang.String r8) {
        /*
            r6 = this;
            X.01k r1 = r6.A0F
            X.1rW r0 = new X.1rW
            r0.<init>(r1, r8, r7)
            r6.A00 = r0
            android.app.Application r0 = r6.A00
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131166082(0x7f070382, float:1.79464E38)
            int r3 = r1.getDimensionPixelSize(r0)
            X.0HL r0 = r6.A08
            X.2Ku r1 = r0.A03(r7)
            if (r1 == 0) goto L_0x002c
            X.1S0 r0 = r6.A09
            X.2aZ r3 = new X.2aZ
            r3.<init>(r6, r7)
            r2 = 2
            r4 = 0
            r5 = r4
            r0.A01(r1, r2, r3, r4, r5)
            return
        L_0x002c:
            X.1S3 r2 = r6.A0A
            X.0HL r0 = r2.A04
            X.2KY r0 = r0.A01(r7)
            if (r0 == 0) goto L_0x003a
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x003f
        L_0x003a:
            boolean r1 = r2.A00
            r0 = 1
            if (r1 == 0) goto L_0x0040
        L_0x003f:
            r0 = 0
        L_0x0040:
            if (r0 == 0) goto L_0x0052
            X.01I r0 = r2.A02
            boolean r1 = r0.A09(r7)
            r0 = 1
            if (r1 == 0) goto L_0x004c
            r0 = 4
        L_0x004c:
            int r0 = r0 * 6
            r2.A04(r7, r3, r0)
            return
        L_0x0052:
            r6.A02(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59362nW.A04(com.whatsapp.jid.UserJid, java.lang.String):void");
    }

    public final void A05(String str) {
        C27261Ou.A01(this.A0F, this.A03, this.A0H, this.A0C, str, new C52082aY(this, SystemClock.elapsedRealtime()));
    }
}

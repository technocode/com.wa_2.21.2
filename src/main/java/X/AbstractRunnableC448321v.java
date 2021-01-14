package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.util.concurrent.Executor;

/* renamed from: X.21v  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractRunnableC448321v implements Runnable, AnonymousClass1W9, AnonymousClass1WD {
    public AbstractC50012Tb A00;
    public boolean A01;
    public final C57222ju A02;

    public AbstractRunnableC448321v(Executor executor) {
        this.A02 = new C57222ju(executor);
    }

    public AnonymousClass2TY A00() {
        AnonymousClass2TY r4;
        C49982Sy r2;
        Object obj;
        AbstractC50012Tb r3;
        try {
            if (this instanceof AnonymousClass2A3) {
                AnonymousClass2A3 r0 = (AnonymousClass2A3) this;
                Log.d("ProfilePicturePlainFileDownload/createRequest");
                r0.A0D = true;
                AnonymousClass1WL r5 = r0.A08;
                AnonymousClass28H r6 = new AnonymousClass28H(null, "ppic", null, r5.A04, null);
                File A012 = AnonymousClass0EX.A01(r0.A05.A00, r5.A05);
                r0.A0C = A012;
                obj = new C50052Tf(r6, A012, AnonymousClass1XO.A0A);
            } else if (!(this instanceof C75043c2)) {
                C60312pC r02 = (C60312pC) this;
                AnonymousClass1XO r15 = AnonymousClass1XO.A0E;
                String str = r02.A04;
                String str2 = r02.A03;
                if (str != null) {
                    obj = new C50032Td(new AnonymousClass28H(str, "md-app-state", null, str2, null), r02.A00, r02.A02, r02.A05, r15);
                } else {
                    throw null;
                }
            } else {
                C75043c2 r03 = (C75043c2) this;
                AnonymousClass0B3 r42 = r03.A03.A01;
                C29241Xq r52 = r03.A00;
                String str3 = r52.A0A;
                if (r42 != null) {
                    File A013 = r42.A01();
                    StringBuilder sb = new StringBuilder();
                    sb.append(str3.replace('/', '-'));
                    sb.append(".tmp");
                    new File(A013, sb.toString());
                    AnonymousClass1XO r152 = AnonymousClass1XO.A0I;
                    String str4 = r52.A06;
                    String str5 = r52.A05;
                    if (str4 != null) {
                        obj = new C50032Td(new AnonymousClass28H(str4, "sticker", null, str5, null), r03.A02, r52.A08, r52.A0A, r152);
                    } else {
                        throw null;
                    }
                } else {
                    throw null;
                }
            }
            if (!(this instanceof AbstractC60272p5)) {
                AnonymousClass2A3 r04 = (AnonymousClass2A3) this;
                C50052Tf r10 = (C50052Tf) obj;
                r3 = new CallableC57232jv(r04.A02, r04.A01, r04.A09, r04.A07, new C50042Te(r10.A01, new C57252jx(r04.A04, r10.A02)), this, new C50002Ta(r10.A00.A00));
            } else {
                AbstractC60272p5 r05 = (AbstractC60272p5) this;
                C50032Td r102 = (C50032Td) obj;
                r3 = new C57212jt(r05.A01, r05.A00, r05.A04, r05.A03, new C50022Tc(r102.A02, new C57252jx(r05.A02, r102.A03), r102.A04, r102.A05, r102.A01), this, r102.A00);
            }
            synchronized (this) {
                if (this.A01) {
                    r4 = new AnonymousClass2TY(new AnonymousClass1W8(13));
                } else if (this.A00 != null) {
                    Log.e("Attempt to run same download multiple times");
                    r4 = new AnonymousClass2TY(new AnonymousClass1W8(13));
                } else {
                    this.A00 = r3;
                    r4 = r3.A3u();
                }
            }
        } catch (AnonymousClass2TZ e) {
            r4 = new AnonymousClass2TY(new AnonymousClass1W8(e.downloadStatus));
        }
        AnonymousClass1W8 r32 = r4.A00;
        if (r32.A01 == 13) {
            this.A02.AFF(r32.A04);
            return r4;
        }
        C57222ju r53 = this.A02;
        if (this instanceof AnonymousClass2A3) {
            r2 = new C49982Sy();
        } else if (!(this instanceof C75043c2)) {
            r2 = new C49982Sy();
            boolean A022 = r32.A02();
            synchronized (r2) {
                r2.A05 = Boolean.valueOf(A022);
            }
            synchronized (r2) {
                r2.A06 = Boolean.FALSE;
            }
        } else {
            r2 = new C49982Sy();
            C29241Xq r1 = ((C75043c2) this).A00;
            int i = r1.A03;
            synchronized (r2) {
                r2.A0C = Integer.valueOf(i);
            }
            int i2 = r1.A02;
            synchronized (r2) {
                r2.A0B = Integer.valueOf(i2);
            }
            boolean A023 = r32.A02();
            synchronized (r2) {
                r2.A05 = Boolean.valueOf(A023);
            }
            synchronized (r2) {
                r2.A06 = Boolean.FALSE;
            }
        }
        r53.AFG(r32, r2);
        return r4;
    }

    public void A01() {
        AbstractC50012Tb r0;
        synchronized (this) {
            this.A01 = true;
            r0 = this.A00;
        }
        if (r0 != null) {
            r0.cancel();
        }
    }

    @Override // X.AnonymousClass1W9
    public void A1j(AnonymousClass1W7 r5) {
        C57222ju r3 = this.A02;
        C03140Ey r1 = r3.A00;
        C57202js r0 = new C57202js(r5);
        Executor executor = r3.A02;
        r1.A03(r0, executor);
        r3.A01.A03(new C57192jr(r5), executor);
    }

    @Override // X.AnonymousClass1W9
    public void A2Z(boolean z) {
        if (!(this instanceof C75043c2)) {
            A01();
            return;
        }
        Log.i("StickerBitmapNetworkFetcher/StickerDownload/cancelMediaDownload attempted to cancel download");
        A01();
    }

    @Override // X.AnonymousClass1WD
    public void AFH(int i) {
        AnonymousClass008.A0t("basefiledownload/progress=", i);
    }

    public void run() {
        A00();
    }
}

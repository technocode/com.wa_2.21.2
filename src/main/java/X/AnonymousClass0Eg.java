package X;

import com.whatsapp.Mp4Ops;
import com.whatsapp.gif_search.GifCacheItemSerializable;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: X.0Eg  reason: invalid class name */
public final class AnonymousClass0Eg {
    public static final AbstractC02970Eh A0C = new C54412es();
    public static volatile AnonymousClass0Eg A0D;
    public C664334g A00;
    public ThreadPoolExecutor A01;
    public final AnonymousClass009 A02;
    public final AnonymousClass088 A03;
    public final AnonymousClass02M A04;
    public final Mp4Ops A05;
    public final AnonymousClass08D A06;
    public final AnonymousClass00C A07;
    public final AnonymousClass00S A08;
    public final AnonymousClass00G A09;
    public final C02660Cy A0A;
    public final AnonymousClass00T A0B;

    public AnonymousClass0Eg(AnonymousClass00G r1, AnonymousClass00S r2, AnonymousClass08D r3, Mp4Ops mp4Ops, AnonymousClass02M r5, AnonymousClass009 r6, AnonymousClass00T r7, AnonymousClass088 r8, AnonymousClass00C r9, C02660Cy r10) {
        this.A09 = r1;
        this.A08 = r2;
        this.A06 = r3;
        this.A05 = mp4Ops;
        this.A04 = r5;
        this.A02 = r6;
        this.A0B = r7;
        this.A03 = r8;
        this.A07 = r9;
        this.A0A = r10;
    }

    public static AnonymousClass0Eg A00() {
        if (A0D == null) {
            synchronized (AnonymousClass0Eg.class) {
                if (A0D == null) {
                    A0D = new AnonymousClass0Eg(AnonymousClass00G.A01, AnonymousClass00S.A00(), AnonymousClass08D.A00(), Mp4Ops.A00(), AnonymousClass02M.A00(), AnonymousClass009.A00(), C002101e.A00(), AnonymousClass088.A00(), AnonymousClass00C.A00(), C02660Cy.A00());
                }
            }
        }
        return A0D;
    }

    public final C664334g A01() {
        AnonymousClass00E.A01();
        C664334g r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        File file = new File(this.A09.A00.getCacheDir(), "GifsCache");
        if (!file.mkdirs() && !file.isDirectory()) {
            Log.w("gif/cache/unable to create gifs directory");
        }
        C664234e r2 = new C664234e(this.A04, this.A0A, file);
        r2.A01 = (int) (C002301g.A0K.A00 * 48.0f);
        C664334g A002 = r2.A00();
        this.A00 = A002;
        return A002;
    }

    public final byte[] A02(String str) {
        AnonymousClass00E.A01();
        GifCacheItemSerializable A002 = this.A06.A06().A00(str);
        if (A002 != null) {
            return A002.A00;
        }
        return null;
    }
}

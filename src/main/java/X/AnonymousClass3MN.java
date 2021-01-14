package X;

import java.io.File;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3MN  reason: invalid class name */
public class AnonymousClass3MN {
    public static final long A07 = TimeUnit.DAYS.toMillis(5);
    public static volatile AnonymousClass3MN A08;
    public final AnonymousClass00S A00;
    public final AnonymousClass00G A01;
    public final AnonymousClass3MM A02;
    public final AnonymousClass3MO A03;
    public final AnonymousClass3MP A04;
    public final Semaphore A05 = new Semaphore(1);
    public volatile File A06 = null;

    public AnonymousClass3MN(AnonymousClass00G r3, AnonymousClass00S r4, AnonymousClass3MP r5, AnonymousClass3MM r6, AnonymousClass3MO r7) {
        this.A01 = r3;
        this.A00 = r4;
        this.A04 = r5;
        this.A02 = r6;
        this.A03 = r7;
    }

    public static AnonymousClass3MN A00() {
        if (A08 == null) {
            synchronized (AnonymousClass3MN.class) {
                if (A08 == null) {
                    A08 = new AnonymousClass3MN(AnonymousClass00G.A01, AnonymousClass00S.A00(), C64892yy.A00(), AnonymousClass3MM.A00(), AnonymousClass3MO.A00());
                }
            }
        }
        return A08;
    }

    public void A01(File file) {
        if (file.exists()) {
            try {
                file.delete();
            } catch (Exception e) {
                this.A04.A00(11, "errorString:%s", e.getMessage());
            }
        }
    }

    public final File[] A02(String str) {
        File file = new File(this.A01.A00.getCacheDir(), "qpl");
        if (!file.exists()) {
            return new File[0];
        }
        return file.listFiles(new C64872yw(str));
    }
}

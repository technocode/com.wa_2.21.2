package X;

import android.content.Context;
import android.os.Build;
import java.io.File;

/* renamed from: X.1bv  reason: invalid class name and case insensitive filesystem */
public class C30771bv implements AbstractC17030qr {
    public C17080qw A00;
    public boolean A01;
    public final Context A02;
    public final AbstractC17000qo A03;
    public final Object A04 = new Object();
    public final String A05;
    public final boolean A06;

    public C30771bv(Context context, String str, AbstractC17000qo r4, boolean z) {
        this.A02 = context;
        this.A05 = str;
        this.A03 = r4;
        this.A06 = z;
    }

    public final C17080qw A00() {
        C17080qw r0;
        C17080qw r3;
        String str;
        synchronized (this.A04) {
            if (this.A00 == null) {
                C30761bu[] r5 = new C30761bu[1];
                if (Build.VERSION.SDK_INT < 23 || (str = this.A05) == null || !this.A06) {
                    r3 = new C17080qw(this.A02, this.A05, r5, this.A03);
                    this.A00 = r3;
                } else {
                    Context context = this.A02;
                    r3 = new C17080qw(context, new File(context.getNoBackupFilesDir(), str).getAbsolutePath(), r5, this.A03);
                    this.A00 = r3;
                }
                r3.setWriteAheadLoggingEnabled(this.A01);
            }
            r0 = this.A00;
        }
        return r0;
    }

    @Override // X.AbstractC17030qr
    public AbstractC16990qn A9w() {
        return A00().A01();
    }

    @Override // X.AbstractC17030qr
    public void APP(boolean z) {
        synchronized (this.A04) {
            C17080qw r0 = this.A00;
            if (r0 != null) {
                r0.setWriteAheadLoggingEnabled(z);
            }
            this.A01 = z;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        A00().close();
    }
}

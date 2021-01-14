package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;

/* renamed from: X.2PY  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2PY extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ C03400Ga A04;
    public final /* synthetic */ File A05;

    public /* synthetic */ AnonymousClass2PY(C03400Ga r1, File file, int i, int i2, int i3, long j) {
        this.A04 = r1;
        this.A05 = file;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A03 = j;
    }

    public final void run() {
        C03400Ga r4 = this.A04;
        File file = this.A05;
        int i = this.A00;
        int i2 = this.A01;
        int i3 = this.A02;
        long j = this.A03;
        try {
            String A1P = C002001d.A1P(r4.A01, file);
            if (A1P != null) {
                C49232Po r5 = new C49232Po(A1P, file.getPath(), i, i2, i3);
                if (r4.A02(r5)) {
                    r4.A09.A01(r5, j);
                }
            }
        } catch (IOException unused) {
            Log.e("GifManager/add/error saving gif to disk");
        }
    }
}

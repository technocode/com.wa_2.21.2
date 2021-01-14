package X;

import com.whatsapp.GifVideoPreviewActivity;
import java.io.File;
import java.lang.ref.WeakReference;

/* renamed from: X.1si  reason: invalid class name and case insensitive filesystem */
public class C40151si implements AbstractC02970Eh {
    public final int A00;
    public final C49182Pi A01;
    public final C03400Ga A02;
    public final C02220Bc A03;
    public final AnonymousClass00T A04;
    public final WeakReference A05;

    @Override // X.AbstractC02970Eh
    public void AFt(Exception exc) {
    }

    public C40151si(GifVideoPreviewActivity gifVideoPreviewActivity, AnonymousClass00T r3, C49182Pi r4, C02220Bc r5, C03400Ga r6, int i) {
        this.A05 = new WeakReference(gifVideoPreviewActivity);
        this.A04 = r3;
        this.A01 = r4;
        this.A03 = r5;
        this.A02 = r6;
        this.A00 = i;
    }

    @Override // X.AbstractC02970Eh
    public void AG3(String str, File file, byte[] bArr) {
        GifVideoPreviewActivity gifVideoPreviewActivity = (GifVideoPreviewActivity) this.A05.get();
        if (file != null) {
            this.A04.ANF(new RunnableEBaseShape1S1200000_I1(this, file, str, 9));
            if (gifVideoPreviewActivity != null) {
                gifVideoPreviewActivity.A02.postDelayed(new RunnableEBaseShape6S0200000_I1_1(gifVideoPreviewActivity, file, 7), 50);
            }
        } else if (gifVideoPreviewActivity != null) {
            gifVideoPreviewActivity.A00.setVisibility(8);
        }
    }
}

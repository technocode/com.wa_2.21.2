package X;

import android.media.audiofx.Visualizer;

/* renamed from: X.2Ii  reason: invalid class name and case insensitive filesystem */
public class C47532Ii implements Visualizer.OnDataCaptureListener {
    public final /* synthetic */ C28301Tu A00;

    public void onFftDataCapture(Visualizer visualizer, byte[] bArr, int i) {
    }

    public C47532Ii(C28301Tu r1) {
        this.A00 = r1;
    }

    public void onWaveFormDataCapture(Visualizer visualizer, byte[] bArr, int i) {
        AbstractC47582In r0 = this.A00.A0F;
        if (r0 != null) {
            r0.ALn(bArr);
        }
    }
}

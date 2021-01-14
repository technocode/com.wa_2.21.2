package X;

import android.media.MediaRecorder;

/* renamed from: X.1g9  reason: invalid class name and case insensitive filesystem */
public class C33071g9 implements AbstractC21160yH {
    public final /* synthetic */ C33081gA A00;

    @Override // X.AbstractC21160yH
    public void AKL(MediaRecorder mediaRecorder) {
    }

    public C33071g9(C33081gA r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractC21160yH
    public void AK3(MediaRecorder mediaRecorder) {
        C33081gA r1 = this.A00;
        r1.A0W.unlock();
        mediaRecorder.setCamera(r1.A0W);
        mediaRecorder.setVideoSource(1);
    }
}

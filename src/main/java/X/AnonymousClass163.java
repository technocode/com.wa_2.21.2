package X;

import android.media.MediaCodec;
import android.os.Handler;

/* renamed from: X.163  reason: invalid class name */
public final class AnonymousClass163 implements MediaCodec.OnFrameRenderedListener {
    public final /* synthetic */ AnonymousClass2AM A00;

    public AnonymousClass163(AnonymousClass2AM r2, MediaCodec mediaCodec) {
        this.A00 = r2;
        mediaCodec.setOnFrameRenderedListener(this, new Handler());
    }

    public void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
        AnonymousClass2AM r3 = this.A00;
        if (this == r3.A0P) {
            AnonymousClass126 A06 = r3.A06(j);
            if (A06 != null) {
                r3.A0O(((AbstractC461628i) r3).A08, A06.A0F, A06.A08);
            }
            r3.A0K();
            r3.A0H();
            r3.A0E(j);
        }
    }
}

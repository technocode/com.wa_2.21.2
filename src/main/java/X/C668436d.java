package X;

import android.media.MediaPlayer;

/* renamed from: X.36d  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C668436d implements MediaPlayer.OnCompletionListener {
    public final /* synthetic */ AnonymousClass3T5 A00;

    public /* synthetic */ C668436d(AnonymousClass3T5 r1) {
        this.A00 = r1;
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        AnonymousClass3T5 r1 = this.A00;
        AnonymousClass37I r0 = r1.A01;
        if (r0 != null) {
            r0.AEU(r1);
        }
    }
}

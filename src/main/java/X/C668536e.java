package X;

import android.media.MediaPlayer;

/* renamed from: X.36e  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C668536e implements MediaPlayer.OnCompletionListener {
    public final /* synthetic */ AnonymousClass3T7 A00;

    public /* synthetic */ C668536e(AnonymousClass3T7 r1) {
        this.A00 = r1;
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        AnonymousClass3T7 r1 = this.A00;
        AnonymousClass37I r0 = r1.A01;
        if (r0 != null) {
            r0.AEU(r1);
        }
    }
}

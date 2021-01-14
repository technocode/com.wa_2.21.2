package X;

import android.media.MediaPlayer;

/* renamed from: X.36h  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C668836h implements MediaPlayer.OnCompletionListener {
    public final /* synthetic */ AnonymousClass37V A00;

    public /* synthetic */ C668836h(AnonymousClass37V r1) {
        this.A00 = r1;
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        AnonymousClass37V r2 = this.A00;
        r2.A00 = 5;
        r2.A03 = 5;
        MediaPlayer.OnCompletionListener onCompletionListener = r2.A06;
        if (onCompletionListener != null) {
            onCompletionListener.onCompletion(r2.A09);
        }
    }
}

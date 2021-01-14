package X;

import android.media.MediaPlayer;

/* renamed from: X.36g  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C668736g implements MediaPlayer.OnErrorListener {
    public final /* synthetic */ AnonymousClass37V A00;

    public /* synthetic */ C668736g(AnonymousClass37V r1) {
        this.A00 = r1;
    }

    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        AnonymousClass37V r2 = this.A00;
        r2.A00 = -1;
        r2.A03 = -1;
        MediaPlayer.OnErrorListener onErrorListener = r2.A07;
        if (onErrorListener == null) {
            return true;
        }
        onErrorListener.onError(r2.A09, i, i2);
        return true;
    }
}

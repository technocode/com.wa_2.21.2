package X;

import android.media.MediaPlayer;

/* renamed from: X.36i  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C668936i implements MediaPlayer.OnPreparedListener {
    public final /* synthetic */ AnonymousClass37V A00;

    public /* synthetic */ C668936i(AnonymousClass37V r1) {
        this.A00 = r1;
    }

    public final void onPrepared(MediaPlayer mediaPlayer) {
        AnonymousClass37V r2 = this.A00;
        r2.A00 = 2;
        if (r2.A0G) {
            mediaPlayer.setVolume(0.0f, 0.0f);
        }
        if (r2.A0F) {
            mediaPlayer.setLooping(true);
        }
        r2.A0E = true;
        r2.A0D = true;
        r2.A0C = true;
        int i = r2.A02;
        if (i >= 0) {
            r2.seekTo(i);
        }
        if (r2.A03 == 3) {
            r2.start();
        }
        MediaPlayer.OnPreparedListener onPreparedListener = r2.A08;
        if (onPreparedListener != null) {
            onPreparedListener.onPrepared(mediaPlayer);
        }
    }
}

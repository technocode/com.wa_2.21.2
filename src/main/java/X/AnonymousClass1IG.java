package X;

import android.media.MediaPlayer;

/* renamed from: X.1IG  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1IG implements MediaPlayer.OnPreparedListener {
    public static final /* synthetic */ AnonymousClass1IG A00 = new AnonymousClass1IG();

    public final void onPrepared(MediaPlayer mediaPlayer) {
        mediaPlayer.setLooping(true);
        mediaPlayer.setVolume(0.0f, 0.0f);
    }
}

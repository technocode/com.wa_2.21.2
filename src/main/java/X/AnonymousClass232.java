package X;

import android.media.MediaPlayer;
import android.os.Handler;
import android.os.Looper;

/* renamed from: X.232  reason: invalid class name */
public final class AnonymousClass232 extends AnonymousClass1Y0 {
    public final MediaPlayer A00;
    public final Handler A01;

    public AnonymousClass232(int i) {
        Looper myLooper = Looper.myLooper();
        this.A01 = new Handler(myLooper == null ? Looper.getMainLooper() : myLooper);
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.A00 = mediaPlayer;
        mediaPlayer.setAudioStreamType(i);
    }
}

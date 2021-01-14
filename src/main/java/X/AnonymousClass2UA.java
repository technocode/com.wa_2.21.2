package X;

import android.media.MediaPlayer;
import com.whatsapp.util.Log;

/* renamed from: X.2UA  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2UA implements MediaPlayer.OnErrorListener {
    public static final /* synthetic */ AnonymousClass2UA A00 = new AnonymousClass2UA();

    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        StringBuilder sb = new StringBuilder("mediaview/error: what:");
        sb.append(i);
        sb.append("  extra:");
        sb.append(i2);
        Log.e(sb.toString());
        return false;
    }
}

package X;

import android.media.MediaPlayer;
import com.whatsapp.util.Log;

/* renamed from: X.36f  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C668636f implements MediaPlayer.OnErrorListener {
    public final /* synthetic */ AnonymousClass3T7 A00;

    public /* synthetic */ C668636f(AnonymousClass3T7 r1) {
        this.A00 = r1;
    }

    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        AnonymousClass3T7 r3 = this.A00;
        StringBuilder sb = new StringBuilder("VideoPlayerOnTextureView/error ");
        sb.append(i);
        sb.append(" ");
        sb.append(i2);
        Log.e(sb.toString());
        AnonymousClass37J r0 = r3.A02;
        if (r0 == null) {
            return false;
        }
        r0.AFe(null, true);
        return false;
    }
}

package X;

import android.media.MediaPlayer;
import com.whatsapp.util.Log;

/* renamed from: X.36c  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C668336c implements MediaPlayer.OnErrorListener {
    public final /* synthetic */ AnonymousClass3T5 A00;

    public /* synthetic */ C668336c(AnonymousClass3T5 r1) {
        this.A00 = r1;
    }

    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        AnonymousClass3T5 r3 = this.A00;
        StringBuilder sb = new StringBuilder("VideoPlayerOnSurfaceView/error ");
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

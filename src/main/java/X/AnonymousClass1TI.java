package X;

import android.media.MediaPlayer;
import android.view.View;

/* renamed from: X.1TI  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1TI implements MediaPlayer.OnPreparedListener {
    public final /* synthetic */ View A00;

    public /* synthetic */ AnonymousClass1TI(View view) {
        this.A00 = view;
    }

    public final void onPrepared(MediaPlayer mediaPlayer) {
        this.A00.setVisibility(8);
    }
}

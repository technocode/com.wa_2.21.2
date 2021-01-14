package X;

import android.media.MediaPlayer;
import android.view.View;

/* renamed from: X.1TH  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1TH implements MediaPlayer.OnCompletionListener {
    public final /* synthetic */ View A00;

    public /* synthetic */ AnonymousClass1TH(View view) {
        this.A00 = view;
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        this.A00.setVisibility(0);
    }
}

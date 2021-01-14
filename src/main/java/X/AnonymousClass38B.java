package X;

import android.media.AudioManager;

/* renamed from: X.38B  reason: invalid class name */
public final /* synthetic */ class AnonymousClass38B implements AudioManager.OnAudioFocusChangeListener {
    public static final /* synthetic */ AnonymousClass38B A00 = new AnonymousClass38B();

    public final void onAudioFocusChange(int i) {
        AnonymousClass008.A0v("voip audio focus changed: ", i);
    }
}

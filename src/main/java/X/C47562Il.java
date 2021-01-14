package X;

import android.media.AudioManager;
import com.whatsapp.util.Log;

/* renamed from: X.2Il  reason: invalid class name and case insensitive filesystem */
public class C47562Il implements AudioManager.OnAudioFocusChangeListener {
    public void onAudioFocusChange(int i) {
        C28301Tu r1;
        StringBuilder A0T = AnonymousClass008.A0T("messageaudioplayer/onaudiofocuschanged ", i, " current player:");
        boolean z = false;
        if (C28301Tu.A0i != null) {
            z = true;
        }
        A0T.append(z);
        Log.i(A0T.toString());
        if (C003701u.A0D() && (r1 = C28301Tu.A0i) != null) {
            if (i == -2 || i == -1) {
                if (r1.A0P()) {
                    C28301Tu.A0i.A0A();
                }
            } else if (i == 1 && r1.A0O) {
                r1.A0B();
            }
        }
    }
}

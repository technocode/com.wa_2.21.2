package X;

import android.media.AudioManager;
import com.google.android.search.verification.client.R;

/* renamed from: X.35I  reason: invalid class name */
public class AnonymousClass35I {
    public static volatile AnonymousClass35I A04;
    public long A00;
    public AudioManager.OnAudioFocusChangeListener A01;
    public final AnonymousClass02M A02;
    public final AnonymousClass03P A03;

    public AnonymousClass35I(AnonymousClass02M r1, AnonymousClass03P r2) {
        this.A02 = r1;
        this.A03 = r2;
    }

    public static AnonymousClass35I A00() {
        if (A04 == null) {
            synchronized (AnonymousClass35I.class) {
                if (A04 == null) {
                    A04 = new AnonymousClass35I(AnonymousClass02M.A00(), AnonymousClass03P.A00());
                }
            }
        }
        return A04;
    }

    public boolean A01() {
        AudioManager A09 = this.A03.A09();
        if (A09 == null || A09.getStreamVolume(3) != 0) {
            return true;
        }
        if (System.currentTimeMillis() - this.A00 > 2000) {
            this.A00 = System.currentTimeMillis();
            this.A02.A06(R.string.please_turn_volume_up, 0);
        }
        return false;
    }
}

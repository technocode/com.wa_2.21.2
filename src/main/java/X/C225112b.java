package X;

import android.content.Context;
import android.media.AudioManager;

/* renamed from: X.12b  reason: invalid class name and case insensitive filesystem */
public final class C225112b {
    public float A00 = 1.0f;
    public int A01;
    public final AudioManager A02;
    public final AnonymousClass12Z A03;
    public final AbstractC225012a A04;

    public C225112b(Context context, AbstractC225012a r4) {
        this.A02 = context != null ? (AudioManager) context.getApplicationContext().getSystemService("audio") : null;
        this.A04 = r4;
        this.A03 = new AnonymousClass12Z(this);
        this.A01 = 0;
    }

    public final void A00() {
        if (this.A01 != 0) {
            if (AnonymousClass0W2.A00 < 26) {
                AudioManager audioManager = this.A02;
                if (audioManager != null) {
                    audioManager.abandonAudioFocus(this.A03);
                } else {
                    throw null;
                }
            }
            this.A01 = 0;
        }
    }
}

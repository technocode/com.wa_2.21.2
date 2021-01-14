package X;

import android.media.AudioManager;

/* renamed from: X.12Z  reason: invalid class name */
public class AnonymousClass12Z implements AudioManager.OnAudioFocusChangeListener {
    public final /* synthetic */ C225112b A00;

    public AnonymousClass12Z(C225112b r1) {
        this.A00 = r1;
    }

    public void onAudioFocusChange(int i) {
        C225112b r2;
        if (i == -3) {
            r2 = this.A00;
            if (r2 != null) {
                r2.A01 = 3;
            } else {
                throw null;
            }
        } else if (i == -2) {
            r2 = this.A00;
            r2.A01 = 2;
            AnonymousClass25O r1 = ((SurfaceHolder$CallbackC33831hS) r2.A04).A00;
            r1.A08(r1.A8P(), 0);
        } else if (i == -1) {
            r2 = this.A00;
            r2.A01 = -1;
            AnonymousClass25O r12 = ((SurfaceHolder$CallbackC33831hS) r2.A04).A00;
            r12.A08(r12.A8P(), -1);
            r2.A00();
        } else if (i != 1) {
            AnonymousClass008.A0x("Unknown focus change type: ", i, "AudioFocusManager");
            return;
        } else {
            r2 = this.A00;
            r2.A01 = 1;
            AnonymousClass25O r13 = ((SurfaceHolder$CallbackC33831hS) r2.A04).A00;
            r13.A08(r13.A8P(), 1);
        }
        float f = 1.0f;
        if (r2.A01 == 3) {
            f = 0.2f;
        }
        if (r2.A00 != f) {
            r2.A00 = f;
            ((SurfaceHolder$CallbackC33831hS) r2.A04).A00.A02();
        }
    }
}

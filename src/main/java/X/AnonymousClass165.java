package X;

import android.hardware.display.DisplayManager;

/* renamed from: X.165  reason: invalid class name */
public final class AnonymousClass165 implements DisplayManager.DisplayListener {
    public final DisplayManager A00;
    public final /* synthetic */ AnonymousClass167 A01;

    public void onDisplayAdded(int i) {
    }

    public void onDisplayRemoved(int i) {
    }

    public AnonymousClass165(AnonymousClass167 r1, DisplayManager displayManager) {
        this.A01 = r1;
        this.A00 = displayManager;
    }

    public void onDisplayChanged(int i) {
        if (i == 0) {
            this.A01.A00();
        }
    }
}

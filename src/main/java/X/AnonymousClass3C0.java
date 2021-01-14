package X;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.Surface;
import android.view.SurfaceHolder;

/* renamed from: X.3C0  reason: invalid class name */
public class AnonymousClass3C0 implements SurfaceHolder {
    public final Surface A00;

    public void addCallback(SurfaceHolder.Callback callback) {
    }

    public Rect getSurfaceFrame() {
        return null;
    }

    public boolean isCreating() {
        return false;
    }

    public Canvas lockCanvas() {
        return null;
    }

    public Canvas lockCanvas(Rect rect) {
        return null;
    }

    public void removeCallback(SurfaceHolder.Callback callback) {
    }

    public void setFixedSize(int i, int i2) {
    }

    public void setFormat(int i) {
    }

    public void setKeepScreenOn(boolean z) {
    }

    public void setSizeFromLayout() {
    }

    public void setType(int i) {
    }

    public void unlockCanvasAndPost(Canvas canvas) {
    }

    public AnonymousClass3C0(Surface surface) {
        this.A00 = surface;
    }

    public Surface getSurface() {
        return this.A00;
    }
}

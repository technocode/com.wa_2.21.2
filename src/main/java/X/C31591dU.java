package X;

import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.view.Surface;

/* renamed from: X.1dU  reason: invalid class name and case insensitive filesystem */
public class C31591dU extends C18320tA {
    public Surface A00;
    public boolean A01;

    public C31591dU(C18310t9 r6, Surface surface, boolean z) {
        super(r6);
        if (this.A02 == EGL14.EGL_NO_SURFACE) {
            C18310t9 r4 = this.A03;
            if (r4 == null) {
                throw null;
            } else if (surface == null) {
                StringBuilder sb = new StringBuilder("invalid surface: ");
                sb.append(surface);
                throw new RuntimeException(sb.toString());
            } else {
                EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(r4.A02, r4.A00, surface, new int[]{12344}, 0);
                C18310t9.A00("eglCreateWindowSurface");
                if (eglCreateWindowSurface != null) {
                    this.A02 = eglCreateWindowSurface;
                    this.A00 = surface;
                    this.A01 = z;
                    return;
                }
                throw new RuntimeException("surface was null");
            }
        } else {
            throw new IllegalStateException("surface already created");
        }
    }

    public void A02() {
        C18310t9 r0 = this.A03;
        EGL14.eglDestroySurface(r0.A02, this.A02);
        this.A02 = EGL14.EGL_NO_SURFACE;
        super.A00 = -1;
        super.A01 = -1;
        Surface surface = this.A00;
        if (surface != null) {
            if (this.A01) {
                surface.release();
            }
            this.A00 = null;
        }
    }
}

package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1hS  reason: invalid class name and case insensitive filesystem */
public final class SurfaceHolder$CallbackC33831hS implements AnonymousClass16A, AbstractC225612g, AnonymousClass14I, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, AbstractC225012a, AbstractC228213h {
    public final /* synthetic */ AnonymousClass25O A00;

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public SurfaceHolder$CallbackC33831hS(AnonymousClass25O r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractC225612g
    public void AD1(String str, long j, long j2) {
        Iterator it = this.A00.A0L.iterator();
        while (it.hasNext()) {
            ((AbstractC225612g) it.next()).AD1(str, j, j2);
        }
    }

    @Override // X.AbstractC225612g
    public void AD2(C227412z r4) {
        AnonymousClass25O r2 = this.A00;
        Iterator it = r2.A0L.iterator();
        while (it.hasNext()) {
            ((AbstractC225612g) it.next()).AD2(r4);
        }
        r2.A07 = null;
        r2.A01 = 0;
    }

    @Override // X.AbstractC225612g
    public void AD3(C227412z r3) {
        AnonymousClass25O r0 = this.A00;
        r0.A09 = r3;
        Iterator it = r0.A0L.iterator();
        while (it.hasNext()) {
            ((AbstractC225612g) it.next()).AD3(r3);
        }
    }

    @Override // X.AbstractC225612g
    public void AD4(AnonymousClass126 r3) {
        AnonymousClass25O r0 = this.A00;
        r0.A07 = r3;
        Iterator it = r0.A0L.iterator();
        while (it.hasNext()) {
            ((AbstractC225612g) it.next()).AD4(r3);
        }
    }

    @Override // X.AbstractC225612g
    public void AD6(int i) {
        AnonymousClass25O r3 = this.A00;
        if (r3.A01 != i) {
            r3.A01 = i;
            Iterator it = r3.A0M.iterator();
            while (it.hasNext()) {
                AbstractC225212c r1 = (AbstractC225212c) it.next();
                if (!r3.A0L.contains(r1)) {
                    r1.AD6(i);
                }
            }
            Iterator it2 = r3.A0L.iterator();
            while (it2.hasNext()) {
                ((AbstractC225612g) it2.next()).AD6(i);
            }
        }
    }

    @Override // X.AbstractC225612g
    public void AD7(int i, long j, long j2) {
        Iterator it = this.A00.A0L.iterator();
        while (it.hasNext()) {
            ((AbstractC225612g) it.next()).AD7(i, j, j2);
        }
    }

    @Override // X.AnonymousClass14I
    public void AEn(List list) {
        AnonymousClass25O r0 = this.A00;
        r0.A0C = list;
        Iterator it = r0.A0O.iterator();
        while (it.hasNext()) {
            ((AnonymousClass14I) it.next()).AEn(list);
        }
    }

    @Override // X.AnonymousClass16A
    public void AFM(int i, long j) {
        Iterator it = this.A00.A0P.iterator();
        while (it.hasNext()) {
            ((AnonymousClass16A) it.next()).AFM(i, j);
        }
    }

    @Override // X.AnonymousClass16A
    public void AJJ(Surface surface) {
        AnonymousClass25O r2 = this.A00;
        if (r2.A04 == surface) {
            Iterator it = r2.A0Q.iterator();
            while (it.hasNext()) {
                ((AnonymousClass168) it.next()).AJI();
            }
        }
        Iterator it2 = r2.A0P.iterator();
        while (it2.hasNext()) {
            ((AnonymousClass16A) it2.next()).AJJ(surface);
        }
    }

    @Override // X.AnonymousClass16A
    public void ALf(String str, long j, long j2) {
        Iterator it = this.A00.A0P.iterator();
        while (it.hasNext()) {
            ((AnonymousClass16A) it.next()).ALf(str, j, j2);
        }
    }

    @Override // X.AnonymousClass16A
    public void ALg(C227412z r4) {
        AnonymousClass25O r2 = this.A00;
        Iterator it = r2.A0P.iterator();
        while (it.hasNext()) {
            ((AnonymousClass16A) it.next()).ALg(r4);
        }
        r2.A08 = null;
    }

    @Override // X.AnonymousClass16A
    public void ALh(C227412z r3) {
        AnonymousClass25O r0 = this.A00;
        r0.A0A = r3;
        Iterator it = r0.A0P.iterator();
        while (it.hasNext()) {
            ((AnonymousClass16A) it.next()).ALh(r3);
        }
    }

    @Override // X.AnonymousClass16A
    public void ALi(AnonymousClass126 r3) {
        AnonymousClass25O r0 = this.A00;
        r0.A08 = r3;
        Iterator it = r0.A0P.iterator();
        while (it.hasNext()) {
            ((AnonymousClass16A) it.next()).ALi(r3);
        }
    }

    @Override // X.AnonymousClass16A
    public void ALj(int i, int i2, int i3, float f) {
        AnonymousClass25O r3 = this.A00;
        Iterator it = r3.A0Q.iterator();
        while (it.hasNext()) {
            AnonymousClass168 r1 = (AnonymousClass168) it.next();
            if (!r3.A0P.contains(r1)) {
                r1.ALj(i, i2, i3, f);
            }
        }
        Iterator it2 = r3.A0P.iterator();
        while (it2.hasNext()) {
            ((AnonymousClass16A) it2.next()).ALj(i, i2, i3, f);
        }
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        AnonymousClass25O r2 = this.A00;
        r2.A06(new Surface(surfaceTexture), true);
        r2.A05(i, i2);
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        AnonymousClass25O r2 = this.A00;
        r2.A06(null, true);
        r2.A05(0, 0);
        return true;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.A00.A05(i, i2);
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.A00.A05(i2, i3);
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.A00.A06(surfaceHolder.getSurface(), false);
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        AnonymousClass25O r2 = this.A00;
        r2.A06(null, false);
        r2.A05(0, 0);
    }
}

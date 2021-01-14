package X;

import android.content.Context;
import android.view.OrientationEventListener;

/* renamed from: X.2EF  reason: invalid class name */
public class AnonymousClass2EF extends OrientationEventListener {
    public int A00;
    public final /* synthetic */ SurfaceHolder$CallbackC50852Wi A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2EF(SurfaceHolder$CallbackC50852Wi r2, Context context) {
        super(context);
        this.A01 = r2;
        this.A00 = r2.A0B.getRotation();
    }

    public void enable() {
        super.enable();
        this.A00 = this.A01.A0B.getRotation();
    }

    public void onOrientationChanged(int i) {
        int i2;
        SurfaceHolder$CallbackC50852Wi r3 = this.A01;
        int rotation = r3.A0B.getRotation();
        if (!(rotation == -1 || rotation == (i2 = this.A00) || Math.abs(i2 - rotation) % 2 != 0)) {
            r3.surfaceChanged(r3.A0C, 0, 0, 0);
        }
        this.A00 = rotation;
    }
}

package X;

import android.content.Context;
import android.graphics.Point;
import android.view.OrientationEventListener;
import com.whatsapp.camera.CameraLayout;

/* renamed from: X.2E7  reason: invalid class name */
public class AnonymousClass2E7 extends OrientationEventListener {
    public int A00;
    public final /* synthetic */ CameraLayout A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2E7(CameraLayout cameraLayout, Context context) {
        super(context);
        this.A01 = cameraLayout;
        this.A00 = cameraLayout.A00.getRotation();
    }

    public void onOrientationChanged(int i) {
        int i2;
        CameraLayout cameraLayout = this.A01;
        int rotation = cameraLayout.A00.getRotation();
        if (rotation != -1 && (((i2 = this.A00) == 1 && rotation == 3) || (i2 == 3 && rotation == 1))) {
            Point point = new Point();
            cameraLayout.A00.getSize(point);
            cameraLayout.A00(rotation, 0, 0, point.x, point.y);
        }
        this.A00 = rotation;
    }
}

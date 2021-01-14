package X;

import android.graphics.Point;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: X.2Sl  reason: invalid class name and case insensitive filesystem */
public class C49852Sl {
    public C19250ui A00;
    public AnonymousClass1B9 A01;

    public C49852Sl(C19250ui r10) {
        this.A00 = r10;
        float[] fArr = r10.A02;
        r10.A07((double) C19250ui.A02(0.0d), (double) C19250ui.A01(0.0d), fArr);
        new Point((int) fArr[0], (int) fArr[1]);
    }

    public C49852Sl(AnonymousClass1B9 r4) {
        this.A01 = r4;
        r4.A00(new LatLng(0.0d, 0.0d));
    }

    public Point A00(LatLng latLng) {
        AnonymousClass1B9 r0 = this.A01;
        if (r0 != null) {
            return r0.A00(latLng);
        }
        C19250ui r4 = this.A00;
        double d = latLng.A00;
        double d2 = latLng.A01;
        r4.A07((double) C19250ui.A02(d2), (double) C19250ui.A01(d), r4.A02);
        float[] fArr = r4.A02;
        return new Point((int) fArr[0], (int) fArr[1]);
    }

    public LatLng A01(Point point) {
        AnonymousClass1B9 r0 = this.A01;
        if (r0 != null) {
            try {
                return r0.A00.A4U(new BinderC04800Lv(point));
            } catch (RemoteException e) {
                throw new AnonymousClass06B(e);
            }
        } else {
            C19250ui r2 = this.A00;
            if (r2 != null) {
                C07040Vr A05 = r2.A05((float) point.x, (float) point.y);
                return new LatLng(A05.A00, A05.A01);
            }
            throw null;
        }
    }
}

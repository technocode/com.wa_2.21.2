package X;

import android.graphics.Matrix;
import android.graphics.Point;
import android.hardware.Camera;

/* renamed from: X.0yi  reason: invalid class name and case insensitive filesystem */
public class C21420yi {
    public Camera A00;
    public AbstractC21140yF A01;
    public C21390yf A02;
    public AnonymousClass0VV A03;
    public final C21950zb A04;
    public final C22170zz A05;
    public volatile boolean A06;
    public volatile boolean A07;
    public volatile boolean A08;

    public C21420yi(C22170zz r1, C21950zb r2) {
        this.A05 = r1;
        this.A04 = r2;
    }

    public void A00(AbstractC21140yF r7, EnumC21130yE r8, Point point) {
        if (r7 != null) {
            C21390yf r5 = this.A02;
            if (!(point == null || r5 == null)) {
                float[] fArr = {(float) point.x, (float) point.y};
                if (r5.A00 != null) {
                    Matrix matrix = new Matrix();
                    r5.A00.invert(matrix);
                    matrix.mapPoints(fArr);
                }
                point.set((int) fArr[0], (int) fArr[1]);
            }
            AnonymousClass100.A00(new RunnableEBaseShape2S0300000_I1(r7, r8, point));
        }
    }
}

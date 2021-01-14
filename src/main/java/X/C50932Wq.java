package X;

import android.graphics.Point;
import com.whatsapp.camera.litecamera.LiteCameraView;

/* renamed from: X.2Wq  reason: invalid class name and case insensitive filesystem */
public class C50932Wq implements AbstractC19770va {
    public final /* synthetic */ LiteCameraView A00;

    public C50932Wq(LiteCameraView liteCameraView) {
        this.A00 = liteCameraView;
    }

    @Override // X.AbstractC19770va
    public void AGF() {
        LiteCameraView liteCameraView = this.A00;
        liteCameraView.A0B.A05 = null;
        AnonymousClass2E5 r1 = liteCameraView.A00;
        if (r1 != null) {
            ((AnonymousClass2WY) r1).A04(false);
        }
    }

    @Override // X.AbstractC19770va
    public void AGG() {
        LiteCameraView liteCameraView = this.A00;
        liteCameraView.A0B.A05 = null;
        AnonymousClass2E5 r1 = liteCameraView.A00;
        if (r1 != null) {
            ((AnonymousClass2WY) r1).A04(false);
        }
    }

    @Override // X.AbstractC19770va
    public void AGH(Point point) {
        LiteCameraView liteCameraView = this.A00;
        liteCameraView.A0B.A05 = null;
        AnonymousClass2E5 r1 = liteCameraView.A00;
        if (r1 != null) {
            ((AnonymousClass2WY) r1).A04(true);
        }
    }

    @Override // X.AbstractC19770va
    public void AGI(Point point) {
        AnonymousClass2E5 r5 = this.A00.A00;
        if (r5 != null) {
            float f = (float) point.x;
            float f2 = (float) point.y;
            AnonymousClass2WY r52 = (AnonymousClass2WY) r5;
            AnonymousClass02M r2 = r52.A01.A0s;
            r2.A02.post(new RunnableEBaseShape0S0100002_I1(r52, f, f2, 0));
        }
    }
}

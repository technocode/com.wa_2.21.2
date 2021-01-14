package X;

import android.graphics.Rect;
import android.hardware.camera2.params.MeteringRectangle;
import java.util.List;

/* renamed from: X.0zR  reason: invalid class name and case insensitive filesystem */
public class C21860zR {
    public Rect A00;
    public Rect A01;
    public AnonymousClass0VM A02;
    public C33341ga A03;
    public AnonymousClass0VO A04;
    public List A05;
    public MeteringRectangle[] A06;
    public MeteringRectangle[] A07;

    public int A00() {
        AnonymousClass0VM r1 = this.A02;
        if (r1 == null) {
            return 0;
        }
        return ((Number) r1.A00(AnonymousClass0VN.A0k)).intValue();
    }

    public Rect A01(Rect rect) {
        Rect rect2;
        if (this.A01 == null || (rect2 = this.A00) == null) {
            return rect;
        }
        float width = ((float) rect2.width()) / ((float) this.A01.width());
        float height = ((float) this.A00.height()) / ((float) this.A01.height());
        int width2 = (this.A01.width() - this.A00.width()) >> 1;
        int height2 = (this.A01.height() - this.A00.height()) >> 1;
        int centerX = (int) ((((float) rect.centerX()) * width) + ((float) width2));
        int centerY = (int) ((((float) rect.centerY()) * height) + ((float) height2));
        Rect rect3 = new Rect(centerX, centerY, centerX, centerY);
        rect3.inset((-rect.width()) >> 1, (-rect.height()) >> 1);
        return rect3;
    }

    public final MeteringRectangle[] A02(MeteringRectangle[] meteringRectangleArr) {
        AnonymousClass0VM r1 = this.A02;
        if (r1 == null || this.A00 == null) {
            throw new IllegalStateException("Creating Metering Rects for zoom with mCameraSettings or mCropRectangle null.");
        } else if (((Number) r1.A00(AnonymousClass0VN.A0k)).intValue() == 0) {
            return meteringRectangleArr;
        } else {
            return new MeteringRectangle[]{new MeteringRectangle(new Rect(0, 0, this.A00.width(), this.A00.height()), 0)};
        }
    }
}

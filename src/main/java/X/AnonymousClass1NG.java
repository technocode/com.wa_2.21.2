package X;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import com.whatsapp.QrImageView;
import java.util.ArrayList;

/* renamed from: X.1NG  reason: invalid class name */
public class AnonymousClass1NG extends Animation {
    public final /* synthetic */ QrImageView A00;

    public AnonymousClass1NG(QrImageView qrImageView) {
        this.A00 = qrImageView;
    }

    public void applyTransformation(float f, Transformation transformation) {
        float f2;
        QrImageView qrImageView = this.A00;
        AnonymousClass1GJ r3 = qrImageView.A04;
        if (r3 != null) {
            if (f != 1.0f) {
                if (f > 0.25f) {
                    f2 = (f - 0.25f) / 0.75f;
                } else {
                    f2 = 0.0f;
                }
                AnonymousClass05j r0 = r3.A04;
                int i = (int) ((1.0f - f2) * ((float) (r0.A01 * r0.A00)));
                while (true) {
                    ArrayList arrayList = qrImageView.A05;
                    if (arrayList.size() <= i) {
                        break;
                    }
                    arrayList.remove(QrImageView.A07.nextInt(arrayList.size()));
                }
            } else {
                qrImageView.A05.clear();
            }
            qrImageView.invalidate();
        }
    }
}

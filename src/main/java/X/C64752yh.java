package X;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import com.whatsapp.qrcode.QrEducationView;

/* renamed from: X.2yh  reason: invalid class name and case insensitive filesystem */
public class C64752yh extends Animation {
    public final QrEducationView A00;

    public C64752yh(QrEducationView qrEducationView) {
        this.A00 = qrEducationView;
    }

    public void applyTransformation(float f, Transformation transformation) {
        QrEducationView qrEducationView = this.A00;
        if (f < qrEducationView.A00) {
            qrEducationView.A0B = true;
        }
        if (qrEducationView.A0B) {
            qrEducationView.A00 = f + 1.0f;
        } else {
            qrEducationView.A00 = f;
        }
        qrEducationView.invalidate();
    }
}

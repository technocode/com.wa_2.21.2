package X;

import android.view.animation.Animation;
import com.whatsapp.QrImageView;

/* renamed from: X.1NE  reason: invalid class name */
public class AnonymousClass1NE implements Animation.AnimationListener {
    public final /* synthetic */ AnonymousClass1NF A00;
    public final /* synthetic */ QrImageView A01;

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }

    public AnonymousClass1NE(QrImageView qrImageView, AnonymousClass1NF r2) {
        this.A01 = qrImageView;
        this.A00 = r2;
    }

    public void onAnimationEnd(Animation animation) {
        this.A00.AET(this.A01);
    }
}

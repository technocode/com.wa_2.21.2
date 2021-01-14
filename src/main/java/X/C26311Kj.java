package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.whatsapp.CodeInputField;

/* renamed from: X.1Kj  reason: invalid class name and case insensitive filesystem */
public class C26311Kj extends AnimatorListenerAdapter {
    public final /* synthetic */ float A00;
    public final /* synthetic */ CodeInputField A01;

    public C26311Kj(CodeInputField codeInputField, float f) {
        this.A01 = codeInputField;
        this.A00 = f;
    }

    public void onAnimationCancel(Animator animator) {
        this.A01.setX(this.A00);
    }

    public void onAnimationEnd(Animator animator) {
        this.A01.setX(this.A00);
    }
}

package X;

import android.graphics.drawable.Drawable;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import com.whatsapp.Conversation;

/* renamed from: X.1L2  reason: invalid class name */
public class AnonymousClass1L2 extends Animation {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Drawable A01;
    public final /* synthetic */ AnonymousClass1L3 A02;

    public boolean willChangeBounds() {
        return false;
    }

    public AnonymousClass1L2(AnonymousClass1L3 r1, int i, Drawable drawable) {
        this.A02 = r1;
        this.A00 = i;
        this.A01 = drawable;
    }

    public void applyTransformation(float f, Transformation transformation) {
        int i = this.A00;
        int i2 = i - ((int) (((float) i) * f));
        Conversation conversation = this.A02.A03;
        Drawable background = conversation.A0F.getBackground();
        if (!(background instanceof AnonymousClass2NM)) {
            return;
        }
        if (f == 1.0f) {
            conversation.A11(this.A01);
            return;
        }
        AnonymousClass2NM r1 = (AnonymousClass2NM) background;
        r1.A00 = i2;
        r1.invalidateSelf();
    }
}

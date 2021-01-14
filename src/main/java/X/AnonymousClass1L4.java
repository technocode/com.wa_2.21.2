package X;

import android.graphics.drawable.Drawable;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import com.whatsapp.Conversation;

/* renamed from: X.1L4  reason: invalid class name */
public class AnonymousClass1L4 extends Animation {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Conversation A01;

    public boolean willChangeBounds() {
        return false;
    }

    public AnonymousClass1L4(Conversation conversation, int i) {
        this.A01 = conversation;
        this.A00 = i;
    }

    public void applyTransformation(float f, Transformation transformation) {
        int i = (int) (((float) this.A00) * f);
        Drawable background = this.A01.A0F.getBackground();
        if (background instanceof AnonymousClass2NM) {
            AnonymousClass2NM r1 = (AnonymousClass2NM) background;
            r1.A00 = i;
            r1.invalidateSelf();
        }
    }
}

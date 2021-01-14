package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;

/* renamed from: X.0rV  reason: invalid class name and case insensitive filesystem */
public class C17420rV extends AnimatorListenerAdapter {
    public final /* synthetic */ AnonymousClass24Q A00;

    public C17420rV(AnonymousClass24Q r1) {
        this.A00 = r1;
    }

    public void onAnimationEnd(Animator animator) {
        AnonymousClass24Q r4 = this.A00;
        ArrayList arrayList = new ArrayList(r4.A04);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC17400rT) arrayList.get(i)).A00(r4);
        }
    }

    public void onAnimationStart(Animator animator) {
        ArrayList arrayList = new ArrayList(this.A00.A04);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i);
        }
    }
}

package X;

import android.app.Activity;
import android.content.Context;
import android.widget.FrameLayout;

/* renamed from: X.2HB  reason: invalid class name */
public class AnonymousClass2HB extends FrameLayout {
    public int A00 = -1;
    public final /* synthetic */ Activity A01;
    public final /* synthetic */ AnonymousClass2HD A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2HB(AnonymousClass2HD r2, Context context, Activity activity) {
        super(context);
        this.A02 = r2;
        this.A01 = activity;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int rotation = this.A01.getWindowManager().getDefaultDisplay().getRotation();
        int i5 = this.A00;
        if (!(i5 == -1 || i5 == rotation)) {
            AnonymousClass2HD r2 = this.A02;
            if (!r2.A03 || r2.A04) {
                AnonymousClass2HD.A01(r2);
            } else {
                r2.A04 = true;
                r2.A09.getViewTreeObserver().addOnGlobalLayoutListener(r2.A02);
            }
        }
        this.A00 = rotation;
        super.onLayout(z, i, i2, i3, i4);
    }
}

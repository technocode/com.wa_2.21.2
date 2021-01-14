package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.2EB  reason: invalid class name */
public class AnonymousClass2EB extends View {
    public final int[] A00 = new int[2];
    public final int[] A01 = new int[2];
    public final /* synthetic */ AnonymousClass0YW A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2EB(AnonymousClass0YW r3, Context context) {
        super(context);
        this.A02 = r3;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        AnonymousClass0YW r5 = this.A02;
        View view = r5.A07;
        if (view == null) {
            return super.onTouchEvent(motionEvent);
        }
        int[] iArr = this.A00;
        view.getLocationOnScreen(iArr);
        int[] iArr2 = this.A01;
        getLocationOnScreen(iArr2);
        motionEvent.offsetLocation((float) (iArr2[0] - iArr[0]), (float) (iArr2[1] - iArr[1]));
        return r5.A07.dispatchTouchEvent(motionEvent);
    }
}

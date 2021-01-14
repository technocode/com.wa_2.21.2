package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.3J0  reason: invalid class name */
public class AnonymousClass3J0 extends AbstractC16380pi {
    public final /* synthetic */ C64022xO A00;

    public AnonymousClass3J0(C64022xO r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractC16380pi
    public void A00(Rect rect, View view, RecyclerView recyclerView, AnonymousClass0VR r10) {
        C64022xO r5 = this.A00;
        if (r5.A00 != 0) {
            int A002 = RecyclerView.A00(view);
            int i = r5.A00;
            int i2 = A002 % i;
            int i3 = (r5.A04 - (r5.A01 * i)) / (i + 1);
            rect.left = i3 - ((i2 * i3) / i);
            rect.right = ((i2 + 1) * i3) / i;
            if (A002 < i) {
                rect.top = r5.A02;
            }
            rect.bottom = r5.A02;
        }
    }
}

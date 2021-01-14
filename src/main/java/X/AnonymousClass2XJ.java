package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.2XJ  reason: invalid class name */
public class AnonymousClass2XJ extends AbstractC16380pi {
    public int A00;
    public AnonymousClass3RH A01;

    public AnonymousClass2XJ(AnonymousClass3RH r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    @Override // X.AbstractC16380pi
    public void A00(Rect rect, View view, RecyclerView recyclerView, AnonymousClass0VR r10) {
        AbstractC16300pa r0;
        int i;
        int A002 = RecyclerView.A00(view);
        if (A002 >= 0 && (r0 = recyclerView.A0N) != null && A002 <= r0.A05() && (i = this.A01.A00.A00) > 0) {
            int width = recyclerView.getWidth();
            AnonymousClass3RI r2 = this.A01.A00;
            int i2 = A002 % i;
            int i3 = (width - (r2.A08 * i)) / (i + 1);
            rect.left = i3 - ((i2 * i3) / i);
            rect.right = ((i2 + 1) * i3) / i;
            if (A002 < r2.A00) {
                rect.top = this.A00;
            }
            rect.bottom = this.A00;
        }
    }
}

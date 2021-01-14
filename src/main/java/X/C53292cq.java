package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.2cq  reason: invalid class name and case insensitive filesystem */
public final class C53292cq extends AbstractC16380pi {
    public boolean A00;
    public final int A01;
    public final int A02;

    public C53292cq(int i, int i2) {
        this.A01 = i;
        this.A02 = i2;
    }

    @Override // X.AbstractC16380pi
    public void A00(Rect rect, View view, RecyclerView recyclerView, AnonymousClass0VR r9) {
        int i;
        int length;
        view.getLayoutParams();
        rect.set(0, 0, 0, 0);
        int A002 = RecyclerView.A00(view);
        if (this.A00) {
            int width = recyclerView.getWidth();
            int i2 = this.A01;
            length = C53302cr.A01.length;
            i = (width - (i2 * length)) >> 1;
        } else {
            int width2 = recyclerView.getWidth();
            i = this.A02;
            length = C53302cr.A01.length;
            int width3 = ((width2 - (i << 1)) - (view.getWidth() * length)) / ((length << 1) - 2);
            rect.left = width3;
            rect.right = width3;
        }
        if (A002 == 0) {
            rect.left = i;
        } else if (A002 == length - 1) {
            rect.right = i;
        }
    }
}

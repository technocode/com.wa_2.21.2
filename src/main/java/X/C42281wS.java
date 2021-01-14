package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.1wS  reason: invalid class name and case insensitive filesystem */
public class C42281wS extends AbstractC16380pi {
    public int A00 = 0;
    public int A01;
    public final int A02;

    public C42281wS(int i, int i2) {
        this.A02 = i;
        this.A01 = i2;
    }

    @Override // X.AbstractC16380pi
    public void A00(Rect rect, View view, RecyclerView recyclerView, AnonymousClass0VR r7) {
        int A002 = RecyclerView.A00(view);
        if (A002 == 0) {
            rect.set(0, this.A01, 0, 0);
        } else if (A002 == this.A02 - 1) {
            rect.set(0, 0, 0, this.A00);
        }
    }
}

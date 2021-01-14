package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.1wN  reason: invalid class name and case insensitive filesystem */
public class C42241wN extends AbstractC16380pi {
    public final int A00;

    public C42241wN(int i) {
        this.A00 = i;
    }

    @Override // X.AbstractC16380pi
    public void A00(Rect rect, View view, RecyclerView recyclerView, AnonymousClass0VR r6) {
        int A002 = RecyclerView.A00(view);
        rect.top = 0;
        rect.bottom = 0;
        if (A002 == 0) {
            rect.left = 0;
        } else {
            rect.left = this.A00;
        }
    }
}

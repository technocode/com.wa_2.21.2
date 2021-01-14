package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.3aF  reason: invalid class name and case insensitive filesystem */
public class C74153aF extends C30421bK {
    public C74153aF(Context context, int i) {
        super(context, i);
    }

    @Override // X.C30421bK, X.AbstractC16380pi
    public void A00(Rect rect, View view, RecyclerView recyclerView, AnonymousClass0VR r6) {
        if (RecyclerView.A00(view) == recyclerView.A0N.A05() - 1) {
            rect.set(0, 0, 0, 0);
        } else {
            super.A00(rect, view, recyclerView, r6);
        }
    }
}

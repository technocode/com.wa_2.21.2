package X;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.search.verification.client.R;

/* renamed from: X.2aX  reason: invalid class name and case insensitive filesystem */
public class C52072aX extends AbstractC16380pi {
    @Override // X.AbstractC16380pi
    public void A00(Rect rect, View view, RecyclerView recyclerView, AnonymousClass0VR r10) {
        view.getLayoutParams();
        rect.set(0, 0, 0, 0);
        int A00 = RecyclerView.A00(view);
        AbstractC16300pa r0 = recyclerView.A0N;
        if (r0 != null) {
            int A002 = r0.A00(A00);
            if (A00 == 0 && A002 == 0) {
                int A07 = AnonymousClass0Q7.A07(view);
                int dimension = (int) view.getResources().getDimension(R.dimen.select_list_header_top_padding);
                int A06 = AnonymousClass0Q7.A06(view);
                int paddingBottom = view.getPaddingBottom();
                if (Build.VERSION.SDK_INT >= 17) {
                    view.setPaddingRelative(A07, dimension, A06, paddingBottom);
                } else {
                    view.setPadding(A07, dimension, A06, paddingBottom);
                }
            }
        }
    }
}

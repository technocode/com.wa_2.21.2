package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.whatsapp.StickyHeadersRecyclerView;

/* renamed from: X.1O1  reason: invalid class name */
public class AnonymousClass1O1 extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ StickyHeadersRecyclerView A00;

    public AnonymousClass1O1(StickyHeadersRecyclerView stickyHeadersRecyclerView) {
        this.A00 = stickyHeadersRecyclerView;
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        StickyHeadersRecyclerView stickyHeadersRecyclerView = this.A00;
        return ((AnonymousClass1O2) ((C40891u0) stickyHeadersRecyclerView.A0N).A00).AKa(stickyHeadersRecyclerView.A08, stickyHeadersRecyclerView.A02, motionEvent);
    }
}

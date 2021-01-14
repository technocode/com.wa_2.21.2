package X;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.StickyHeadersRecyclerView;

/* renamed from: X.1tw  reason: invalid class name and case insensitive filesystem */
public class C40851tw implements AbstractC16440po {
    public final /* synthetic */ StickyHeadersRecyclerView A00;

    @Override // X.AbstractC16440po
    public void AJO(boolean z) {
    }

    public C40851tw(StickyHeadersRecyclerView stickyHeadersRecyclerView) {
        this.A00 = stickyHeadersRecyclerView;
    }

    @Override // X.AbstractC16440po
    public boolean AGn(RecyclerView recyclerView, MotionEvent motionEvent) {
        StickyHeadersRecyclerView stickyHeadersRecyclerView = this.A00;
        AbstractC11910hD r0 = stickyHeadersRecyclerView.A08;
        if (r0 == null || r0.A0H == null) {
            return false;
        }
        float y = motionEvent.getY();
        int height = stickyHeadersRecyclerView.A08.A0H.getHeight();
        int i = stickyHeadersRecyclerView.A04;
        if (i >= 0) {
            i = 0;
        }
        if (y > ((float) (height + i))) {
            return false;
        }
        stickyHeadersRecyclerView.A07.A00.AL5(motionEvent);
        return true;
    }

    @Override // X.AbstractC16440po
    public void AL4(RecyclerView recyclerView, MotionEvent motionEvent) {
        this.A00.A07.A00.AL5(motionEvent);
    }
}

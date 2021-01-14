package X;

import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.2xM  reason: invalid class name and case insensitive filesystem */
public class ViewTreeObserver$OnGlobalLayoutListenerC64002xM implements ViewTreeObserver.OnGlobalLayoutListener {
    public RecyclerView A00;
    public C71933Qw A01;
    public boolean A02;

    public ViewTreeObserver$OnGlobalLayoutListenerC64002xM(RecyclerView recyclerView, C71933Qw r2) {
        this.A00 = recyclerView;
        this.A01 = r2;
    }

    public void onGlobalLayout() {
        if (this.A02) {
            this.A01.A02(this.A00);
            this.A02 = false;
        }
    }
}

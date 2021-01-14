package X;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: X.1ZV  reason: invalid class name */
public class AnonymousClass1ZV extends FrameLayout implements AnonymousClass0YO {
    public final CollapsibleActionView A00;

    public AnonymousClass1ZV(View view) {
        super(view.getContext());
        this.A00 = (CollapsibleActionView) view;
        addView(view);
    }

    @Override // X.AnonymousClass0YO
    public void onActionViewCollapsed() {
        this.A00.onActionViewCollapsed();
    }

    @Override // X.AnonymousClass0YO
    public void onActionViewExpanded() {
        this.A00.onActionViewExpanded();
    }
}

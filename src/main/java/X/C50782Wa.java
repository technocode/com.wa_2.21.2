package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.2Wa  reason: invalid class name and case insensitive filesystem */
public class C50782Wa extends AbstractC16380pi {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass0YW A01;

    public C50782Wa(AnonymousClass0YW r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    @Override // X.AbstractC16380pi
    public void A00(Rect rect, View view, RecyclerView recyclerView, AnonymousClass0VR r6) {
        if (this.A01.A16.A0M()) {
            rect.set(0, 0, this.A00, 0);
        } else {
            rect.set(this.A00, 0, 0, 0);
        }
    }
}

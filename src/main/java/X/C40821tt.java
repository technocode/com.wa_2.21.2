package X;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.1tt  reason: invalid class name and case insensitive filesystem */
public class C40821tt implements AbstractC16440po {
    public final /* synthetic */ AnonymousClass1O0 A00;
    public final /* synthetic */ C40841tv A01;

    @Override // X.AbstractC16440po
    public void AJO(boolean z) {
    }

    @Override // X.AbstractC16440po
    public void AL4(RecyclerView recyclerView, MotionEvent motionEvent) {
    }

    public C40821tt(C40841tv r1, AnonymousClass1O0 r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    @Override // X.AbstractC16440po
    public boolean AGn(RecyclerView recyclerView, MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        C40841tv r3 = this.A01;
        if (r3.A04) {
            return false;
        }
        if (!Boolean.TRUE.equals(((AnonymousClass3ZP) this.A00).A0d.A08.A01()) || actionMasked == 2 || actionMasked == 8 || actionMasked == 1 || motionEvent.getY() > ((float) r3.A00)) {
            return false;
        }
        return true;
    }
}

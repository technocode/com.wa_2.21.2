package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.1ob  reason: invalid class name and case insensitive filesystem */
public class C37671ob extends AbstractC16380pi {
    public final float A00;
    public final float A01;
    public final float A02;
    public final int A03;

    public C37671ob(float f, float f2, float f3, int i) {
        this.A01 = f;
        this.A02 = f2;
        this.A00 = f3;
        this.A03 = i;
    }

    @Override // X.AbstractC16380pi
    public void A00(Rect rect, View view, RecyclerView recyclerView, AnonymousClass0VR r7) {
        int A002 = RecyclerView.A00(view);
        if (A002 == 0) {
            if (this.A03 == 1) {
                rect.top = (int) this.A01;
            } else {
                rect.left = (int) this.A01;
            }
        }
        if (A002 < recyclerView.A0N.A05() - 1) {
            if (this.A03 == 1) {
                rect.bottom = (int) this.A02;
            } else {
                rect.right = (int) this.A02;
            }
        }
        if (A002 != recyclerView.A0N.A05() - 1) {
            return;
        }
        if (this.A03 == 1) {
            rect.bottom = (int) this.A00;
        } else {
            rect.right = (int) this.A00;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof C37671ob)) {
            return false;
        }
        C37671ob r4 = (C37671ob) obj;
        if (r4.A03 == this.A03 && r4.A00 == this.A00 && r4.A01 == this.A01 && r4.A02 == this.A02) {
            return true;
        }
        return false;
    }
}

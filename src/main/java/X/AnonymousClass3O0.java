package X;

import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.3O0  reason: invalid class name */
public class AnonymousClass3O0 extends AbstractC16380pi {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final Paint A04;
    public final AnonymousClass3ZP A05;

    public AnonymousClass3O0(AnonymousClass3ZP r3, int i, int i2, int i3, int i4) {
        this.A05 = r3;
        this.A03 = i3;
        this.A01 = i4;
        this.A02 = i;
        this.A00 = i2;
        Paint paint = new Paint();
        this.A04 = paint;
        paint.setAntiAlias(true);
        ((AbstractC16300pa) r3).A01.registerObserver(new C71203Nz(r3));
    }

    @Override // X.AbstractC16380pi
    public void A00(Rect rect, View view, RecyclerView recyclerView, AnonymousClass0VR r6) {
        int i;
        int A012 = A01(RecyclerView.A00(view));
        if (A012 != 0) {
            if (A012 == 1) {
                i = this.A01;
            } else if (A012 != 2) {
                i = 0;
            } else {
                i = this.A03;
            }
            rect.bottom = i;
        }
    }

    public final int A01(int i) {
        int intValue;
        int i2 = i + 1;
        if (i2 > 0) {
            AnonymousClass3ZP r1 = this.A05;
            if (i2 < r1.A05() && r1.A09(i2)) {
                return 2;
            }
        }
        AnonymousClass3ZP r2 = this.A05;
        Integer num = null;
        if (r2 != null) {
            if (i != -1) {
                num = Integer.valueOf(r2.A0c.A00(i));
            }
            if (i > r2.A05() || i < 0 || num == null || (intValue = num.intValue()) == 4 || intValue == 13) {
                return 0;
            }
            if (Boolean.TRUE.equals(r2.A0d.A08.A01()) || r2.A0A(i)) {
                return 0;
            }
            return (i2 >= r2.A05() || !r2.A09(i2)) ? 1 : 0;
        }
        throw null;
    }
}

package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.doodle.shapepicker.ShapePickerRecyclerView;

/* renamed from: X.2cK  reason: invalid class name and case insensitive filesystem */
public final class C53052cK extends AbstractC16380pi {
    public final int A00;
    public final int A01;
    public final boolean A02;
    public final /* synthetic */ C48522Mp A03;

    public C53052cK(C48522Mp r1, boolean z, int i, int i2) {
        this.A03 = r1;
        this.A02 = z;
        this.A01 = i;
        this.A00 = i2;
    }

    @Override // X.AbstractC16380pi
    public void A00(Rect rect, View view, RecyclerView recyclerView, AnonymousClass0VR r9) {
        view.getLayoutParams();
        rect.set(0, 0, 0, 0);
        AnonymousClass00E.A06(recyclerView instanceof ShapePickerRecyclerView);
        ShapePickerRecyclerView shapePickerRecyclerView = (ShapePickerRecyclerView) recyclerView;
        int A002 = RecyclerView.A00(view);
        if (A002 != -1) {
            C48472Mj A08 = this.A03.A0X.A08(A002);
            shapePickerRecyclerView.A11();
            int i = shapePickerRecyclerView.A03;
            int shapePickerV2Spacing = shapePickerRecyclerView.getShapePickerV2Spacing();
            int i2 = A08.A02;
            if (i2 == 0) {
                int i3 = A08.A01 % i;
                int i4 = (i3 * shapePickerV2Spacing) / i;
                int i5 = shapePickerV2Spacing - (((i3 + 1) * shapePickerV2Spacing) / i);
                boolean z = this.A02;
                int i6 = i4;
                if (z) {
                    i6 = i5;
                }
                rect.left = i6;
                if (!z) {
                    i4 = i5;
                }
                rect.right = i4;
                rect.top = this.A01;
            } else if (i2 == 1) {
                rect.top = this.A00;
            }
        }
    }
}

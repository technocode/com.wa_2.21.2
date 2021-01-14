package X;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.search.verification.client.R;
import com.whatsapp.doodle.shapepicker.ShapePickerRecyclerView;

/* renamed from: X.2ND  reason: invalid class name */
public abstract class AnonymousClass2ND {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public final LinearLayoutManager A03;
    public final AbstractC16450pp A04 = new C53312cs(this);
    public final AbstractC16520pw A05;
    public final RecyclerView A06;
    public final AnonymousClass01X A07;
    public final ShapePickerRecyclerView A08;
    public final C53322ct A09;

    public AnonymousClass2ND(AnonymousClass01X r3, RecyclerView recyclerView, ShapePickerRecyclerView shapePickerRecyclerView, boolean z) {
        this.A07 = r3;
        C53322ct r0 = new C53322ct(this);
        this.A09 = r0;
        r0.A04(z);
        recyclerView.setItemAnimator(null);
        this.A08 = shapePickerRecyclerView;
        shapePickerRecyclerView.A0l(this.A04);
        recyclerView.getContext();
        this.A03 = new LinearLayoutManager(0);
        this.A05 = new C59492nl(recyclerView.getContext());
        this.A06 = recyclerView;
        recyclerView.setAdapter(this.A09);
        this.A06.setLayoutManager(this.A03);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (r3.A09.A05() <= 0) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00() {
        /*
            r3 = this;
            androidx.recyclerview.widget.RecyclerView r2 = r3.A06
            boolean r0 = r3.A01
            if (r0 == 0) goto L_0x000f
            X.2ct r0 = r3.A09
            int r1 = r0.A05()
            r0 = 0
            if (r1 > 0) goto L_0x0011
        L_0x000f:
            r0 = 8
        L_0x0011:
            r2.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2ND.A00():void");
    }

    public void A01(C53332cu r5, boolean z) {
        View view = r5.A00;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Resources resources = this.A06.getContext().getResources();
        int i = R.dimen.shape_picker_subcategory_selected_portrait_dimen;
        if (z) {
            i = R.dimen.shape_picker_subcategory_selected_landscape_dimen;
        }
        int dimensionPixelSize = resources.getDimensionPixelSize(i);
        layoutParams.width = dimensionPixelSize;
        layoutParams.height = dimensionPixelSize;
        view.setLayoutParams(layoutParams);
    }

    public void A02(boolean z) {
        RecyclerView recyclerView = this.A06;
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        Resources resources = recyclerView.getContext().getResources();
        int i = R.dimen.shape_picker_subcategories_portrait_height;
        if (z) {
            i = R.dimen.shape_picker_subcategories_landscape_height;
        }
        layoutParams.height = resources.getDimensionPixelSize(i);
        recyclerView.setLayoutParams(layoutParams);
        for (int i2 = 0; i2 < this.A09.A05(); i2++) {
            C53332cu r0 = (C53332cu) recyclerView.A0C(i2);
            if (r0 != null) {
                A01(r0, z);
            }
        }
        this.A00 = z;
    }
}

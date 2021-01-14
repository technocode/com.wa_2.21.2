package com.whatsapp.doodle.shapepicker;

import X.AbstractC000400g;
import X.AbstractC16300pa;
import X.AbstractC16520pw;
import X.AnonymousClass0VT;
import X.AnonymousClass2cQ;
import X.AnonymousClass2cV;
import X.C000300f;
import X.C59442ng;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.Pair;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.search.verification.client.R;

public class ShapePickerRecyclerView extends RecyclerView {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public GridLayoutManager A06;
    public AbstractC16520pw A07;
    public final C000300f A08 = C000300f.A00();

    public ShapePickerRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A01 = context.getResources().getDimensionPixelSize(R.dimen.doodle_shape_picker_grid_size);
        this.A00 = context.getResources().getDimensionPixelSize(R.dimen.doodle_shape_picker_large_grid_size);
        this.A04 = context.getResources().getDimensionPixelOffset(R.dimen.shape_picker_new_shape_size);
        setShapeSpacing(getContext().getResources().getConfiguration().orientation == 1);
        this.A02 = -1;
        this.A03 = -1;
        this.A0i = true;
        this.A07 = new C59442ng(context);
    }

    public Pair A10() {
        if (this.A08.A0D(AbstractC000400g.A2J)) {
            A11();
            Integer valueOf = Integer.valueOf(this.A03);
            return new Pair(valueOf, valueOf);
        }
        int measuredWidth = getMeasuredWidth();
        int i = this.A01;
        int max = Math.max(1, ((i >> 1) + measuredWidth) / i);
        int measuredWidth2 = getMeasuredWidth();
        int i2 = this.A00;
        return new Pair(Integer.valueOf(max), Integer.valueOf(Math.max(1, ((i2 >> 1) + measuredWidth2) / i2)));
    }

    public final void A11() {
        if (this.A03 == -1) {
            int measuredWidth = getMeasuredWidth();
            int i = this.A04;
            int i2 = i + this.A05;
            int i3 = measuredWidth / i2;
            if ((i2 * i3) + i <= getMeasuredWidth()) {
                i3++;
            }
            this.A03 = Math.max(1, i3);
        }
    }

    public int getAdapterItemCount() {
        AbstractC16300pa r0 = this.A0N;
        if (r0 != null) {
            return r0.A05();
        }
        throw new IllegalStateException("Must set adapter first");
    }

    public int getShapePickerV2ColumnCount() {
        A11();
        return this.A03;
    }

    public int getShapePickerV2Spacing() {
        int i = this.A02;
        if (i != -1) {
            return i;
        }
        A11();
        if (this.A03 > 1) {
            int measuredWidth = getMeasuredWidth();
            int i2 = this.A03;
            int i3 = (measuredWidth - (this.A04 * i2)) / (i2 - 1);
            this.A02 = i3;
            return i3;
        }
        this.A02 = 0;
        return 0;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        boolean z = true;
        if (configuration.orientation != 1) {
            z = false;
        }
        setShapeSpacing(z);
        this.A02 = -1;
        this.A03 = -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.A01 > 0 && this.A00 > 0) {
            this.A02 = -1;
            this.A03 = -1;
            Pair A10 = A10();
            int intValue = ((Number) A10.first).intValue();
            int intValue2 = ((Number) A10.second).intValue();
            GridLayoutManager gridLayoutManager = (GridLayoutManager) this.A0S;
            gridLayoutManager.A1N(intValue * intValue2);
            AbstractC16300pa r1 = this.A0N;
            if (r1 instanceof AnonymousClass2cQ) {
                AnonymousClass2cQ r12 = (AnonymousClass2cQ) r1;
                gridLayoutManager.A01 = new AnonymousClass2cV(r12, intValue2, intValue, gridLayoutManager);
                if (r12.A00 != intValue2) {
                    r12.A00 = intValue2;
                    if (r12.A02 == null) {
                        r12.A0A();
                    }
                }
            }
            if (this.A14.size() != 0) {
                AnonymousClass0VT r13 = this.A0S;
                if (r13 != null) {
                    r13.A0c("Cannot invalidate item decorations during a scroll or layout");
                }
                A0N();
                requestLayout();
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(AbstractC16300pa r5) {
        super.setAdapter(r5);
        this.A02 = -1;
        this.A03 = -1;
        Pair A10 = A10();
        int intValue = ((Number) A10.first).intValue();
        int intValue2 = ((Number) A10.second).intValue();
        getContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(intValue * intValue2);
        this.A06 = gridLayoutManager;
        if (r5 instanceof AnonymousClass2cQ) {
            AnonymousClass2cQ r52 = (AnonymousClass2cQ) r5;
            gridLayoutManager.A01 = new AnonymousClass2cV(r52, intValue2, intValue, gridLayoutManager);
            if (r52.A00 != intValue2) {
                r52.A00 = intValue2;
                if (r52.A02 == null) {
                    r52.A0A();
                }
            }
        }
        setLayoutManager(this.A06);
    }

    private void setShapeSpacing(boolean z) {
        Resources resources = getContext().getResources();
        int i = R.dimen.shape_picker_shape_landscape_spacing;
        if (z) {
            i = R.dimen.shape_picker_shape_portrait_spacing;
        }
        this.A05 = resources.getDimensionPixelSize(i);
    }
}

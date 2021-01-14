package com.whatsapp;

import X.AbstractC11910hD;
import X.AbstractC16300pa;
import X.AnonymousClass01X;
import X.AnonymousClass1O1;
import X.AnonymousClass1O2;
import X.C06140Ry;
import X.C14890n3;
import X.C40181sl;
import X.C40851tw;
import X.C40861tx;
import X.C40871ty;
import X.C40891u0;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class StickyHeadersRecyclerView extends RecyclerView {
    public int A00 = -1;
    public int A01;
    public int A02 = -1;
    public int A03;
    public int A04;
    public long A05;
    public long A06;
    public C14890n3 A07;
    public AbstractC11910hD A08;
    public final Rect A09 = new Rect();
    public final AnonymousClass01X A0A = AnonymousClass01X.A00();

    public static boolean A09(long j) {
        return (j & 4294967295L) == 4294967295L;
    }

    public StickyHeadersRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i = 0;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C06140Ry.A1k);
            this.A03 = obtainStyledAttributes.getDimensionPixelSize(0, this.A03);
            i = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            obtainStyledAttributes.recycle();
        }
        if (this.A03 > 0) {
            A0j(new C40181sl(this.A0A, i));
        }
        this.A0i = true;
        this.A07 = new C14890n3(context, new AnonymousClass1O1(this));
        this.A15.add(new C40851tw(this));
    }

    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.A0S;
        C40891u0 r5 = (C40891u0) this.A0N;
        int A0s = linearLayoutManager.A0s();
        if (A0s != -1) {
            if (A0s != this.A00) {
                this.A00 = A0s;
                long A082 = r5.A08(A0s);
                this.A05 = A082;
                int i = (int) (A082 >> 32);
                if (this.A02 != i) {
                    this.A02 = i;
                    ((AnonymousClass1O2) r5.A00).ADX(this.A08, i);
                    View view = this.A08.A0H;
                    view.measure(View.MeasureSpec.makeMeasureSpec(getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                    view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                }
            }
            this.A04 = 0;
            if (!A09(this.A05)) {
                int A0r = linearLayoutManager.A0r();
                if (this.A01 != A0r) {
                    this.A01 = A0r;
                    this.A06 = r5.A08(A0r);
                }
                if (A09(this.A06)) {
                    View A0H = linearLayoutManager.A0H(A0r);
                    this.A04 = A0H.getTop() - this.A08.A0H.getMeasuredHeight();
                    Rect rect = this.A09;
                    linearLayoutManager.A0R(A0H, rect);
                    int i2 = this.A04 - rect.top;
                    this.A04 = i2;
                    if (i2 > 0) {
                        this.A04 = 0;
                    }
                }
            }
            canvas.save();
            canvas.clipRect(0, this.A04, this.A08.A0H.getMeasuredWidth(), this.A08.A0H.getMeasuredHeight() + this.A04);
            canvas.translate(0.0f, (float) this.A04);
            this.A08.A0H.draw(canvas);
            canvas.restore();
        }
    }

    public static C40891u0 getStickyHeadersAdapter(StickyHeadersRecyclerView stickyHeadersRecyclerView) {
        return (C40891u0) stickyHeadersRecyclerView.A0N;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void onMeasure(int i, int i2) {
        View view;
        super.onMeasure(i, i2);
        if (this.A03 > 0) {
            int measuredWidth = getMeasuredWidth();
            int i3 = this.A03;
            ((GridLayoutManager) this.A0S).A1N(Math.max(1, ((i3 >> 1) + measuredWidth) / i3));
        }
        AbstractC11910hD r0 = this.A08;
        if (r0 != null && (view = r0.A0H) != null) {
            view.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(AbstractC16300pa r5) {
        super.setAdapter(new C40891u0(r5));
        AbstractC16300pa r0 = this.A0N;
        r0.A01.registerObserver(new C40861tx(this));
        if (this.A03 > 0) {
            int measuredWidth = getMeasuredWidth();
            int i = this.A03;
            int max = Math.max(1, ((i >> 1) + measuredWidth) / i);
            getContext();
            GridLayoutManager gridLayoutManager = new GridLayoutManager(max);
            gridLayoutManager.A01 = new C40871ty(this, gridLayoutManager);
            setLayoutManager(gridLayoutManager);
        } else {
            getContext();
            setLayoutManager(new LinearLayoutManager(1));
        }
        this.A08 = this.A0N.A06(this, -1000);
    }
}

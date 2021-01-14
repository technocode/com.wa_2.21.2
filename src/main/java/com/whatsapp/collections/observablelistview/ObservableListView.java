package com.whatsapp.collections.observablelistview;

import X.AbstractC07300Wx;
import X.AbstractC07350Xf;
import X.AnonymousClass2F1;
import X.C09560d9;
import X.C09570dA;
import X.C09580dB;
import X.EnumC12590iL;
import android.content.Context;
import android.graphics.Canvas;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListView;

public class ObservableListView extends ListView implements AbstractC07350Xf {
    public int A00 = -1;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public SparseIntArray A05 = new SparseIntArray();
    public MotionEvent A06;
    public ViewGroup A07;
    public AbsListView.OnScrollListener A08;
    public AbstractC07300Wx A09;
    public C09570dA A0A = new C09570dA();
    public EnumC12590iL A0B;
    public C09580dB A0C = new C09580dB();
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public final AbsListView.OnScrollListener A0G = new C09560d9(this);

    public ObservableListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setOnScrollListener(this.A0G);
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        this.A0C.A00();
    }

    public int getCurrentScrollY() {
        return this.A04;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.A09 != null) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.A0D = true;
                this.A0E = true;
                if (this.A09 == null) {
                    throw null;
                }
            } else if (actionMasked == 1 || actionMasked == 3) {
                this.A0D = false;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.A0A.A01();
        super.onLayout(z, i, i2, i3, i4);
        this.A0A.A00();
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        AnonymousClass2F1 r2 = (AnonymousClass2F1) parcelable;
        this.A01 = r2.A01;
        this.A00 = r2.A00;
        this.A03 = r2.A03;
        this.A02 = r2.A02;
        this.A04 = r2.A04;
        this.A05 = r2.A05;
        super.onRestoreInstanceState(r2.getSuperState());
    }

    public Parcelable onSaveInstanceState() {
        AnonymousClass2F1 r1 = new AnonymousClass2F1(super.onSaveInstanceState());
        r1.A01 = this.A01;
        r1.A00 = this.A00;
        r1.A03 = this.A03;
        r1.A02 = this.A02;
        r1.A04 = this.A04;
        r1.A05 = this.A05;
        return r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0010, code lost:
        if (r1 != 3) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r9) {
        /*
        // Method dump skipped, instructions count: 147
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.collections.observablelistview.ObservableListView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setOnScrollListener(AbsListView.OnScrollListener onScrollListener) {
        this.A08 = onScrollListener;
    }

    public void setScrollViewCallbacks(AbstractC07300Wx r1) {
        this.A09 = r1;
    }

    public void setTouchInterceptionViewGroup(ViewGroup viewGroup) {
        this.A07 = viewGroup;
    }
}

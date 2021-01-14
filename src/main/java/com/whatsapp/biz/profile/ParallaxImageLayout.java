package com.whatsapp.biz.profile;

import X.AnonymousClass01X;
import X.AnonymousClass0SE;
import X.AnonymousClass1ST;
import X.AnonymousClass1SU;
import X.C002001d;
import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ListView;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.Toolbar;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;

public class ParallaxImageLayout extends RelativeLayout {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public View.OnClickListener A04;
    public View A05;
    public View A06;
    public ViewGroup A07;
    public ViewGroup A08;
    public ListView A09;
    public Toolbar A0A;
    public AnonymousClass1SU A0B;
    public boolean A0C = false;
    public boolean A0D;
    public final ViewTreeObserver.OnGlobalLayoutListener A0E = new AnonymousClass1ST(this);
    public final AnonymousClass01X A0F = AnonymousClass01X.A00();

    public ParallaxImageLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater.from(context).inflate(R.layout.merge_parallax_image_layout, (ViewGroup) this, true);
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true)) {
            this.A02 = TypedValue.complexToDimensionPixelSize(typedValue.data, getResources().getDisplayMetrics());
        }
        View findViewById = findViewById(R.id.photo_overlay);
        if (findViewById != null) {
            this.A06 = findViewById;
            View findViewById2 = findViewById(R.id.subject_layout);
            if (findViewById2 != null) {
                this.A07 = (ViewGroup) findViewById2;
                View findViewById3 = findViewById(16908298);
                if (findViewById3 != null) {
                    this.A09 = (ListView) findViewById3;
                    View findViewById4 = findViewById(R.id.header);
                    if (findViewById4 != null) {
                        this.A05 = findViewById4;
                        View findViewById5 = findViewById(R.id.parallax_image_layout_upper_right_container);
                        if (findViewById5 != null) {
                            this.A08 = (ViewGroup) findViewById5;
                            View findViewById6 = findViewById(R.id.toolbar);
                            if (findViewById6 != null) {
                                this.A0A = (Toolbar) findViewById6;
                                return;
                            }
                            throw null;
                        }
                        throw null;
                    }
                    throw null;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    public ListView getListView() {
        return this.A09;
    }

    public Toolbar getToolbar() {
        return this.A0A;
    }

    public int getToolbarColor() {
        return this.A03;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int paddingTop = getPaddingTop();
        int paddingBottom = i6 - getPaddingBottom();
        int paddingLeft = getPaddingLeft();
        int paddingRight = i5 - getPaddingRight();
        if (i6 > i5) {
            View view = this.A05;
            view.layout(paddingLeft, paddingTop, paddingRight, view.getMeasuredHeight() + paddingTop);
            this.A09.layout(paddingLeft + 0, paddingTop, paddingRight - 0, paddingBottom);
        } else if (this.A0F.A02().A06) {
            ListView listView = this.A09;
            listView.layout(0 + paddingLeft, paddingTop, listView.getMeasuredWidth() + paddingLeft, paddingBottom);
            this.A05.layout(this.A09.getMeasuredWidth() + paddingLeft + 0, paddingTop, paddingRight, paddingBottom);
        } else {
            View view2 = this.A05;
            view2.layout(paddingLeft, paddingTop, view2.getMeasuredWidth() + paddingLeft, paddingBottom);
            this.A09.layout(this.A05.getMeasuredWidth() + paddingLeft + 0, paddingTop, paddingRight - 0, paddingBottom);
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        if (getResources().getConfiguration().orientation != 2) {
            if (!this.A0C) {
                this.A0C = true;
                this.A06.setOnClickListener(null);
                this.A06.setClickable(false);
                this.A09.getViewTreeObserver().addOnGlobalLayoutListener(this.A0E);
            }
            this.A05.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(this.A02, this.A01), 1073741824));
            this.A09.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824) - 0, i2);
            return;
        }
        if (this.A0C) {
            this.A0C = false;
            this.A06.setOnClickListener(this.A04);
            C002001d.A2w(this.A0F, this.A06, R.string.action_open_image);
            this.A06.setClickable(true);
            this.A09.post(new RunnableEBaseShape7S0100000_I1_2(this, 46));
        }
        int i3 = (int) (((float) measuredWidth) * 0.618f);
        this.A05.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth - i3, 1073741824), i2);
        this.A09.measure(View.MeasureSpec.makeMeasureSpec(i3 - 0, 1073741824), i2);
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        this.A04 = onClickListener;
    }

    public void setOnPhotoClickListener(View.OnClickListener onClickListener) {
        this.A04 = onClickListener;
    }

    public void setOnScrollPositionChangedListener(AnonymousClass1SU r1) {
        this.A0B = r1;
    }

    public final void setScrollPos(int i) {
        if (getResources().getConfiguration().orientation != 2) {
            if (this.A0D) {
                Log.d("chatinfolayout/portrait");
                this.A01 = 0;
            }
            this.A0D = false;
            this.A0C = true;
            int max = Math.max(this.A02, getWidth() + i);
            int width = (int) (((float) getWidth()) * 0.5625f);
            float max2 = Math.max(0.0f, ((float) (width - max)) / ((float) (width - this.A02)));
            this.A00 = max2;
            if (this.A01 != max) {
                this.A01 = max;
                int i2 = (int) (((float) 0) * max2 * max2);
                int i3 = (((int) (255.0f * max2)) << 24) | (this.A03 & 16777215);
                this.A03 = i3;
                this.A06.setBackgroundColor(i3);
                AnonymousClass0SE.A06(this.A0F, this.A07, i2, i2);
                float f = 1.0f - this.A00;
                if (f > 0.0f && this.A08.getChildCount() > 0) {
                    this.A08.setVisibility(0);
                }
                if (this.A08.getVisibility() != 8) {
                    this.A08.setAlpha(f);
                    if (this.A08.getAlpha() == 0.0f) {
                        this.A08.setVisibility(8);
                    }
                }
                requestLayout();
            }
        } else if (!this.A0D) {
            this.A0D = true;
            this.A0C = false;
            this.A06.setBackgroundColor(0);
            AnonymousClass0SE.A06(this.A0F, this.A07, 0, 0);
        }
    }

    public void setToolbarColor(int i) {
        int i2 = (i & 16777215) | (this.A03 & -16777216);
        this.A03 = i2;
        this.A06.setBackgroundColor(i2);
    }

    public void setUpperRightView(View view) {
        this.A08.removeAllViews();
        if (view == null) {
            this.A08.setVisibility(8);
            return;
        }
        this.A08.addView(view);
        this.A08.setVisibility(0);
    }
}

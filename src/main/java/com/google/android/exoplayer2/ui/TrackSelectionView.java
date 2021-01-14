package com.google.android.exoplayer2.ui;

import X.AnonymousClass156;
import X.C231814s;
import X.C34391iO;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import com.facebook.redex.ViewOnClickEBaseShape2S0100000_I1_0;
import com.google.android.search.verification.client.R;

public class TrackSelectionView extends LinearLayout {
    public C231814s A00;
    public AnonymousClass156 A01 = new C34391iO(getResources());
    public boolean A02;
    public boolean A03;
    public final int A04;
    public final LayoutInflater A05;
    public final CheckedTextView A06;
    public final CheckedTextView A07;
    public final ViewOnClickEBaseShape2S0100000_I1_0 A08 = new ViewOnClickEBaseShape2S0100000_I1_0(this);

    public TrackSelectionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{16843534});
        this.A04 = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        this.A05 = LayoutInflater.from(context);
        CheckedTextView checkedTextView = (CheckedTextView) this.A05.inflate(17367055, (ViewGroup) this, false);
        this.A07 = checkedTextView;
        checkedTextView.setBackgroundResource(this.A04);
        this.A07.setText(R.string.exo_track_selection_none);
        this.A07.setEnabled(false);
        this.A07.setFocusable(true);
        this.A07.setOnClickListener(this.A08);
        this.A07.setVisibility(8);
        addView(this.A07);
        addView(this.A05.inflate(R.layout.exo_list_divider, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) this.A05.inflate(17367055, (ViewGroup) this, false);
        this.A06 = checkedTextView2;
        checkedTextView2.setBackgroundResource(this.A04);
        this.A06.setText(R.string.exo_track_selection_auto);
        this.A06.setEnabled(false);
        this.A06.setFocusable(true);
        this.A06.setOnClickListener(this.A08);
        addView(this.A06);
    }

    public void setAllowAdaptiveSelections(boolean z) {
        if (this.A02 != z) {
            this.A02 = z;
            int childCount = getChildCount();
            while (true) {
                childCount--;
                if (childCount >= 3) {
                    removeViewAt(childCount);
                } else {
                    this.A07.setEnabled(false);
                    this.A06.setEnabled(false);
                    return;
                }
            }
        }
    }

    public void setShowDisableOption(boolean z) {
        CheckedTextView checkedTextView = this.A07;
        int i = 8;
        if (z) {
            i = 0;
        }
        checkedTextView.setVisibility(i);
    }

    public void setTrackNameProvider(AnonymousClass156 r3) {
        if (r3 != null) {
            this.A01 = r3;
            int childCount = getChildCount();
            while (true) {
                childCount--;
                if (childCount >= 3) {
                    removeViewAt(childCount);
                } else {
                    this.A07.setEnabled(false);
                    this.A06.setEnabled(false);
                    return;
                }
            }
        } else {
            throw null;
        }
    }
}

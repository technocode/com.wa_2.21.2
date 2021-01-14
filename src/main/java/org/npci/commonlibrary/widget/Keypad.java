package org.npci.commonlibrary.widget;

import X.AnonymousClass01X;
import X.AnonymousClass2R7;
import X.AnonymousClass3BY;
import X.C004302a;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape1S0101000_I1;
import com.facebook.redex.ViewOnClickEBaseShape9S0100000_I1_7;
import com.google.android.search.verification.client.R;

public class Keypad extends TableLayout {
    public float A00;
    public int A01;
    public int A02 = 61;
    public int A03;
    public AnonymousClass3BY A04;
    public final AnonymousClass01X A05 = AnonymousClass01X.A00();

    public Keypad(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AnonymousClass2R7.A1G, 0, 0);
        this.A03 = obtainStyledAttributes.getColor(3, C004302a.A00(getContext(), R.color.npci_keypad_bg_color));
        this.A01 = obtainStyledAttributes.getColor(0, C004302a.A00(getContext(), R.color.npci_key_digit_color));
        this.A00 = (float) obtainStyledAttributes.getDimensionPixelSize(2, 36);
        this.A02 = obtainStyledAttributes.getDimensionPixelSize(1, 61);
        obtainStyledAttributes.recycle();
        setBackgroundColor(this.A03);
        TableLayout.LayoutParams layoutParams = new TableLayout.LayoutParams(-1, 0, 1.0f);
        int i = 1;
        for (int i2 = 0; i2 < 3; i2++) {
            TableRow tableRow = new TableRow(getContext());
            tableRow.setLayoutParams(layoutParams);
            tableRow.setWeightSum(3.0f);
            int i3 = 0;
            do {
                TextView textView = new TextView(getContext());
                textView.setGravity(17);
                textView.setLayoutParams(getItemParams());
                textView.setTextColor(this.A01);
                textView.setTextSize(2, this.A00);
                textView.setText(String.valueOf(i));
                textView.setClickable(true);
                setClickFeedback(textView);
                textView.setOnClickListener(new ViewOnClickEBaseShape1S0101000_I1(this, i, 11));
                tableRow.addView(textView);
                i++;
                i3++;
            } while (i3 < 3);
            addView(tableRow);
        }
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R.drawable.ic_action_backspace);
        imageView.setLayoutParams(getItemParams());
        imageView.setClickable(true);
        setClickFeedback(imageView);
        imageView.setOnClickListener(new ViewOnClickEBaseShape9S0100000_I1_7(this, 39));
        TextView textView2 = new TextView(getContext());
        textView2.setLayoutParams(getItemParams());
        textView2.setGravity(17);
        textView2.setText(String.valueOf(0));
        textView2.setTextColor(this.A01);
        textView2.setTextSize(2, this.A00);
        textView2.setClickable(true);
        setClickFeedback(textView2);
        textView2.setOnClickListener(new ViewOnClickEBaseShape9S0100000_I1_7(this, 40));
        ImageView imageView2 = new ImageView(getContext());
        imageView2.setImageResource(R.drawable.ic_action_submit);
        imageView2.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView2.setAdjustViewBounds(true);
        TableRow.LayoutParams itemParams = getItemParams();
        itemParams.height = (int) (((float) ((int) (((float) this.A02) * ((float) (getResources().getDisplayMetrics().densityDpi / 160))))) * 1.25f);
        imageView2.setLayoutParams(itemParams);
        imageView2.setClickable(true);
        imageView2.setContentDescription(this.A05.A06(R.string.cl_done));
        setClickFeedback(imageView2);
        imageView2.setOnClickListener(new ViewOnClickEBaseShape9S0100000_I1_7(this, 41));
        TableRow tableRow2 = new TableRow(getContext());
        tableRow2.setLayoutParams(layoutParams);
        tableRow2.setWeightSum(3.0f);
        tableRow2.addView(imageView);
        tableRow2.addView(textView2);
        tableRow2.addView(imageView2);
        addView(tableRow2);
    }

    private TableRow.LayoutParams getItemParams() {
        return new TableRow.LayoutParams(0, (int) (((float) this.A02) * ((float) (getResources().getDisplayMetrics().densityDpi / 160))), 1.0f);
    }

    private void setClickFeedback(View view) {
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(R.attr.selectableItemBackground, typedValue, true);
        view.setBackgroundResource(typedValue.resourceId);
    }

    public void setOnKeyPressCallback(AnonymousClass3BY r1) {
        this.A04 = r1;
    }
}

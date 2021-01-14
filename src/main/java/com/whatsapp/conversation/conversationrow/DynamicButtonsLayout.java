package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass00E;
import X.AnonymousClass1XM;
import X.AnonymousClass2ZL;
import X.C002301g;
import X.C004302a;
import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.redex.ViewOnClickEBaseShape0S0201000_I1;
import com.google.android.search.verification.client.R;
import java.util.ArrayList;
import java.util.List;

public class DynamicButtonsLayout extends ViewGroup {
    public final List A00 = new ArrayList();
    public final View[] A01 = new View[3];
    public final View[] A02 = new View[3];

    public DynamicButtonsLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        ViewGroup.inflate(context, R.layout.template_quick_reply_buttons, this);
    }

    public int A00(int i) {
        View[] viewArr;
        int i2;
        int applyDimension = (int) TypedValue.applyDimension(1, 16.0f, getResources().getDisplayMetrics());
        int i3 = 0;
        do {
            viewArr = this.A01;
            if (viewArr[i3] != null) {
                View[] viewArr2 = this.A02;
                if (viewArr2[i3] != null && viewArr[i3].getVisibility() == 0) {
                    viewArr[i3].measure(View.MeasureSpec.makeMeasureSpec(i - (applyDimension << 1), EditorInfoCompat.IME_FLAG_FORCE_ASCII), View.MeasureSpec.makeMeasureSpec(0, 0));
                    viewArr2[i3].measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                }
            }
            i3++;
        } while (i3 < 3);
        int size = this.A00.size();
        View view = viewArr[0];
        if (view != null) {
            i2 = (((int) TypedValue.applyDimension(1, 11.0f, view.getResources().getDisplayMetrics())) << 1) + ((int) ((TextView) view).getTextSize());
        } else {
            i2 = 0;
        }
        int i4 = i2 * size;
        if (i4 != 0) {
            i4 += (int) TypedValue.applyDimension(1, 8.0f, getResources().getDisplayMetrics());
        }
        measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(i4, 1073741824));
        return i4;
    }

    public void A01(AnonymousClass2ZL r11, List list) {
        List list2 = this.A00;
        list2.clear();
        int min = Math.min(3, list.size());
        for (int i = 0; i < min; i++) {
            list2.add(list.get(i));
        }
        for (int i2 = 0; i2 < list2.size(); i2++) {
            boolean z = false;
            if (i2 < 3) {
                z = true;
            }
            AnonymousClass00E.A06(z);
            View[] viewArr = this.A01;
            if (viewArr[i2] == null) {
                if (i2 == 0) {
                    viewArr[i2] = findViewById(R.id.quick_reply_btn_1);
                } else if (i2 == 1) {
                    viewArr[i2] = findViewById(R.id.quick_reply_btn_2);
                } else if (i2 == 2) {
                    viewArr[i2] = findViewById(R.id.quick_reply_btn_3);
                }
                C002301g.A03((TextView) viewArr[i2]);
            }
            TextView textView = (TextView) viewArr[i2];
            textView.setVisibility(0);
            textView.setText(((AnonymousClass1XM) list2.get(i2)).A01);
            Context context = textView.getContext();
            boolean z2 = ((AnonymousClass1XM) list2.get(i2)).A00;
            int i3 = R.color.conversation_template_row_button_text_color;
            if (z2) {
                i3 = R.color.conversation_template_used_button_text_color;
            }
            textView.setTextColor(C004302a.A00(context, i3));
            boolean z3 = false;
            if (i2 < 3) {
                z3 = true;
            }
            AnonymousClass00E.A06(z3);
            View[] viewArr2 = this.A02;
            if (viewArr2[i2] == null) {
                if (i2 == 0) {
                    viewArr2[i2] = findViewById(R.id.quick_reply_btn_background_1);
                } else if (i2 == 1) {
                    viewArr2[i2] = findViewById(R.id.quick_reply_btn_background_2);
                } else if (i2 == 2) {
                    viewArr2[i2] = findViewById(R.id.quick_reply_btn_background_3);
                }
                View view = viewArr2[i2];
                if (view != null) {
                    view.setBackgroundDrawable(C004302a.A03(getContext(), R.drawable.balloon_incoming_normal_stkr));
                } else {
                    throw null;
                }
            }
            View view2 = viewArr2[i2];
            view2.setVisibility(0);
            view2.setOnClickListener(new ViewOnClickEBaseShape0S0201000_I1(this, r11, i2, 2));
            view2.setContentDescription(((AnonymousClass1XM) list2.get(i2)).A01);
            view2.setLongClickable(true);
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int applyDimension = (int) TypedValue.applyDimension(1, 16.0f, getResources().getDisplayMetrics());
        int applyDimension2 = (int) TypedValue.applyDimension(1, 2.0f, getResources().getDisplayMetrics());
        int right = getRight() - getLeft();
        View[] viewArr = this.A01;
        View view = viewArr[0];
        if (view != null) {
            i5 = (((int) TypedValue.applyDimension(1, 11.0f, view.getResources().getDisplayMetrics())) << 1) + ((int) ((TextView) view).getTextSize());
        } else {
            i5 = 0;
        }
        int i6 = applyDimension2 >> 1;
        int i7 = 0;
        while (viewArr[i7] != null) {
            View[] viewArr2 = this.A02;
            if (viewArr2[i7] != null && viewArr[i7].getVisibility() == 0) {
                int width = getWidth();
                View view2 = viewArr[i7];
                View view3 = viewArr2[i7];
                int max = Math.max((right - view2.getMeasuredWidth()) >> 1, applyDimension);
                int measuredHeight = (i5 - view2.getMeasuredHeight()) >> 1;
                int i8 = i5 + i6;
                view3.layout(-applyDimension2, i6, width + applyDimension2, i8 + applyDimension2);
                int i9 = i6 + measuredHeight;
                view2.layout(max, i9, width - max, view2.getMeasuredHeight() + i9 + applyDimension2);
                i7++;
                i6 = i8;
                if (i7 >= 3) {
                    return;
                }
            } else {
                return;
            }
        }
    }
}

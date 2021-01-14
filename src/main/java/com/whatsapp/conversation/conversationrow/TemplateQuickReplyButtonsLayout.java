package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass00E;
import X.AnonymousClass0OJ;
import X.AnonymousClass2ZN;
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

public class TemplateQuickReplyButtonsLayout extends ViewGroup {
    public List A00;
    public View[] A01 = new View[3];
    public View[] A02 = new View[3];

    public TemplateQuickReplyButtonsLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ViewGroup.inflate(context, R.layout.template_quick_reply_buttons, this);
    }

    public int A00(int i) {
        int size;
        int i2;
        int applyDimension = (int) TypedValue.applyDimension(1, 16.0f, getResources().getDisplayMetrics());
        int i3 = 0;
        do {
            View[] viewArr = this.A01;
            if (!(viewArr[i3] == null || this.A02[i3] == null || viewArr[i3].getVisibility() != 0)) {
                this.A01[i3].measure(View.MeasureSpec.makeMeasureSpec(i - (applyDimension << 1), EditorInfoCompat.IME_FLAG_FORCE_ASCII), View.MeasureSpec.makeMeasureSpec(0, 0));
                this.A02[i3].measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            }
            i3++;
        } while (i3 < 3);
        if (A02(i, applyDimension) || A03(i, applyDimension)) {
            size = this.A00.size() - 1;
        } else {
            size = this.A00.size();
        }
        View view = this.A01[0];
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

    public void A01(AnonymousClass2ZN r9, List list) {
        View view;
        View view2;
        ViewOnClickEBaseShape0S0201000_I1 viewOnClickEBaseShape0S0201000_I1;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (int i = 0; i < list.size() && arrayList.size() < 3; i++) {
                if (((AnonymousClass0OJ) list.get(i)).A03 == 1) {
                    arrayList.add(list.get(i));
                }
            }
        }
        this.A00 = arrayList;
        boolean z = !arrayList.isEmpty();
        int i2 = 8;
        if (z) {
            i2 = 0;
        }
        setVisibility(i2);
        if (z) {
            int i3 = 0;
            do {
                boolean z2 = false;
                if (this.A00.size() > i3) {
                    z2 = true;
                }
                if (z2) {
                    boolean z3 = false;
                    if (i3 < 3) {
                        z3 = true;
                    }
                    AnonymousClass00E.A06(z3);
                    View[] viewArr = this.A01;
                    if (viewArr[i3] == null) {
                        if (i3 == 0) {
                            viewArr[i3] = findViewById(R.id.quick_reply_btn_1);
                        } else if (i3 == 1) {
                            viewArr[i3] = findViewById(R.id.quick_reply_btn_2);
                        } else if (i3 == 2) {
                            viewArr[i3] = findViewById(R.id.quick_reply_btn_3);
                        }
                        C002301g.A03((TextView) this.A01[i3]);
                    }
                    view = this.A01[i3];
                } else {
                    view = this.A01[i3];
                }
                TextView textView = (TextView) view;
                if (z2) {
                    boolean z4 = false;
                    if (i3 < 3) {
                        z4 = true;
                    }
                    AnonymousClass00E.A06(z4);
                    View[] viewArr2 = this.A02;
                    if (viewArr2[i3] == null) {
                        if (i3 == 0) {
                            viewArr2[i3] = findViewById(R.id.quick_reply_btn_background_1);
                        } else if (i3 == 1) {
                            viewArr2[i3] = findViewById(R.id.quick_reply_btn_background_2);
                        } else if (i3 == 2) {
                            viewArr2[i3] = findViewById(R.id.quick_reply_btn_background_3);
                        }
                        View view3 = this.A02[i3];
                        if (view3 != null) {
                            view3.setBackgroundDrawable(C004302a.A03(getContext(), R.drawable.balloon_incoming_normal_stkr));
                        } else {
                            throw null;
                        }
                    }
                    view2 = this.A02[i3];
                } else {
                    view2 = this.A02[i3];
                }
                if (!(textView == null || view2 == null)) {
                    int i4 = 8;
                    if (z2) {
                        i4 = 0;
                    }
                    textView.setVisibility(i4);
                    int i5 = 8;
                    if (z2) {
                        i5 = 0;
                    }
                    view2.setVisibility(i5);
                }
                if (z2) {
                    if (textView == null) {
                        throw null;
                    } else if (view2 != null) {
                        boolean z5 = ((AnonymousClass0OJ) this.A00.get(i3)).A01;
                        textView.setText(((AnonymousClass0OJ) this.A00.get(i3)).A04);
                        Context context = textView.getContext();
                        int i6 = R.color.conversation_template_row_button_text_color;
                        if (z5) {
                            i6 = R.color.conversation_template_used_button_text_color;
                        }
                        textView.setTextColor(C004302a.A00(context, i6));
                        if (!z5) {
                            viewOnClickEBaseShape0S0201000_I1 = new ViewOnClickEBaseShape0S0201000_I1(this, r9, i3, 3);
                        } else {
                            viewOnClickEBaseShape0S0201000_I1 = null;
                        }
                        view2.setOnClickListener(viewOnClickEBaseShape0S0201000_I1);
                        view2.setContentDescription(((AnonymousClass0OJ) this.A00.get(i3)).A04);
                        view2.setClickable(!z5);
                        view2.setLongClickable(true);
                    } else {
                        throw null;
                    }
                }
                i3++;
            } while (i3 < 3);
        }
    }

    public final boolean A02(int i, int i2) {
        int i3;
        if (this.A00.size() <= 1 || this.A01[0].getMeasuredWidth() > (i3 = (i >> 1) - (i2 << 1)) || this.A01[1].getMeasuredWidth() > i3) {
            return false;
        }
        return true;
    }

    public final boolean A03(int i, int i2) {
        int i3;
        if (A02(i, i2) || this.A00.size() <= 2 || this.A01[1].getMeasuredWidth() > (i3 = (i / 2) - (i2 << 1)) || this.A01[2].getMeasuredWidth() > i3) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0026, code lost:
        if (r21 == false) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r24, int r25, int r26, int r27, int r28) {
        /*
        // Method dump skipped, instructions count: 320
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.conversationrow.TemplateQuickReplyButtonsLayout.onLayout(boolean, int, int, int, int):void");
    }
}

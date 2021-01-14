package com.whatsapp.chatinfo;

import X.AnonymousClass01X;
import X.AnonymousClass0SE;
import X.AnonymousClass31y;
import X.C002001d;
import X.C014308b;
import X.C02590Cr;
import X.C02780Dk;
import X.C11930hF;
import X.ViewTreeObserver$OnGlobalLayoutListenerC46622Ee;
import X.ViewTreeObserver$OnGlobalLayoutListenerC46722Eo;
import X.ViewTreeObserver$OnGlobalLayoutListenerC46752Es;
import android.content.Context;
import android.graphics.Point;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Adapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.components.ScalingFrameLayout;
import com.whatsapp.util.Log;
import java.util.Arrays;

public class ChatInfoLayout extends ViewGroup {
    public float A00;
    public float A01;
    public float A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public View.OnClickListener A08;
    public View A09;
    public View A0A;
    public View A0B;
    public View A0C;
    public ListView A0D;
    public TextView A0E;
    public TextEmojiLabel A0F;
    public C11930hF A0G;
    public ScalingFrameLayout A0H;
    public CharSequence A0I;
    public CharSequence A0J;
    public String A0K;
    public boolean A0L;
    public final ViewTreeObserver.OnGlobalLayoutListener A0M = new ViewTreeObserver$OnGlobalLayoutListenerC46752Es(this);
    public final C014308b A0N = C014308b.A00();
    public final AnonymousClass01X A0O = AnonymousClass01X.A00();
    public final C02590Cr A0P = C02590Cr.A00();
    public final AnonymousClass31y A0Q = AnonymousClass31y.A00();

    public ChatInfoLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true)) {
            this.A07 = TypedValue.complexToDimensionPixelSize(typedValue.data, getResources().getDisplayMetrics());
        }
        this.A02 = (float) getResources().getDimensionPixelSize(R.dimen.condensed_title_text_size);
    }

    public static void A00(ChatInfoLayout chatInfoLayout) {
        int i;
        View childAt = chatInfoLayout.A0D.getChildAt(0);
        if (childAt != null) {
            if (chatInfoLayout.A0D.getFirstVisiblePosition() == 0) {
                i = childAt.getTop();
            } else {
                i = -chatInfoLayout.getHeight();
            }
            chatInfoLayout.setScrollPos(i);
        }
    }

    public void A01() {
        this.A0B = findViewById(R.id.photo_overlay);
        this.A0C = findViewById(R.id.subject_layout);
        C014308b r6 = this.A0N;
        AnonymousClass01X r7 = this.A0O;
        this.A0G = new C11930hF(this, R.id.conversation_contact_name, r6, r7, this.A0Q);
        C002001d.A2w(r7, findViewById(R.id.conversation_contact_name), R.string.action_open_image);
        this.A0H = (ScalingFrameLayout) findViewById(R.id.conversation_contact_name_scaler);
        TextView textView = (TextView) findViewById(R.id.conversation_contact_status);
        this.A0E = textView;
        textView.setClickable(false);
        this.A0F = (TextEmojiLabel) findViewById(R.id.push_name);
        this.A09 = findViewById(R.id.header);
        this.A0D = (ListView) findViewById(16908298);
        this.A0A = findViewById(R.id.header_placeholder);
        this.A01 = this.A0G.A00.getTextSize();
        Display defaultDisplay = C02780Dk.A00(getContext()).getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        this.A0A.setLayoutParams(new LinearLayout.LayoutParams(-1, Math.min(point.x, point.y)));
        this.A0D.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC46722Eo(this));
    }

    public final void A02() {
        CharSequence charSequence = this.A0J;
        if (charSequence != null) {
            this.A0A.setContentDescription(C002001d.A1g(this.A0O, false, Arrays.asList(charSequence.toString(), this.A0K)));
        }
        C002001d.A2w(this.A0O, this.A0A, R.string.action_open_image);
    }

    public void A03(int i, int i2) {
        this.A04 = i;
        this.A03 = i2;
        if (getWidth() < getHeight()) {
            float f = this.A00;
            if (f > 0.0f) {
                AnonymousClass0SE.A06(this.A0O, this.A0C, (int) (((float) this.A04) * f * f), (int) (((float) this.A03) * f * f));
            }
        }
    }

    public void A04(View view, View view2, View view3, Adapter adapter) {
        this.A0D.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC46622Ee(this, view, adapter, view2, view3));
    }

    public int getColor() {
        return this.A05;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int paddingTop = getPaddingTop();
        int paddingBottom = i6 - getPaddingBottom();
        int paddingLeft = getPaddingLeft();
        int paddingRight = i5 - getPaddingRight();
        if (i6 > i5) {
            View view = this.A09;
            view.layout(paddingLeft, paddingTop, paddingRight, view.getMeasuredHeight() + paddingTop);
            this.A0D.layout(paddingLeft + 0, paddingTop, paddingRight - 0, paddingBottom);
        } else if (this.A0O.A02().A06) {
            ListView listView = this.A0D;
            listView.layout(0 + paddingLeft, paddingTop, listView.getMeasuredWidth() + paddingLeft, paddingBottom);
            this.A09.layout(this.A0D.getMeasuredWidth() + paddingLeft + 0, paddingTop, paddingRight, paddingBottom);
        } else {
            View view2 = this.A09;
            view2.layout(paddingLeft, paddingTop, view2.getMeasuredWidth() + paddingLeft, paddingBottom);
            this.A0D.layout(this.A09.getMeasuredWidth() + paddingLeft + 0, paddingTop, paddingRight - 0, paddingBottom);
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        if (getMeasuredHeight() >= measuredWidth) {
            View view = this.A0A;
            if (!(view == null || view.getVisibility() == 0)) {
                this.A0B.setOnClickListener(null);
                this.A0B.setClickable(false);
                this.A0A.setVisibility(0);
                this.A0D.getViewTreeObserver().addOnGlobalLayoutListener(this.A0M);
            }
            this.A09.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(this.A07, this.A06), 1073741824));
            this.A0D.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824) - 0, i2);
            return;
        }
        if (this.A0A.getVisibility() != 8) {
            this.A0B.setOnClickListener(this.A08);
            C002001d.A2w(this.A0O, this.A0B, R.string.action_open_image);
            this.A0B.setClickable(true);
            C11930hF r0 = this.A0G;
            r0.A00.setOnClickListener(this.A08);
            this.A0A.setVisibility(8);
            this.A0D.post(new RunnableEBaseShape8S0100000_I1_3(this, 14));
        }
        int i3 = (int) (((float) measuredWidth) * 0.618f);
        this.A09.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth - i3, 1073741824), i2);
        this.A0D.measure(View.MeasureSpec.makeMeasureSpec(i3 - 0, 1073741824), i2);
    }

    public void setColor(int i) {
        int i2 = (i & 16777215) | (this.A05 & -16777216);
        this.A05 = i2;
        this.A0B.setBackgroundColor(i2);
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        setOnPhotoClickListener(onClickListener);
    }

    public void setOnPhotoClickListener(View.OnClickListener onClickListener) {
        this.A08 = onClickListener;
        this.A0A.setOnClickListener(onClickListener);
    }

    public void setPushName(String str) {
        this.A0I = str;
        if (this.A0F != null) {
            if (TextUtils.isEmpty(str)) {
                this.A0F.setVisibility(8);
            } else {
                this.A0F.setVisibility(0);
                this.A0F.A04(str, null, false, 0);
            }
            this.A0F.setOnClickListener(this.A08);
            C002001d.A2w(this.A0O, this.A0F, R.string.action_open_image);
        }
    }

    public void setScrollPos(int i) {
        if (getWidth() < getHeight()) {
            if (this.A0L) {
                Log.d("chatinfolayout/portrait");
                this.A06 = 0;
            }
            this.A0L = false;
            if (this.A0A.getVisibility() != 0) {
                this.A0A.setVisibility(0);
            }
            int max = Math.max(this.A07, getWidth() + i);
            int width = (int) (((float) getWidth()) * 0.5625f);
            this.A00 = Math.max(0.0f, ((float) (width - max)) / ((float) (width - this.A07)));
            TextUtils.TruncateAt ellipsize = this.A0G.A00.getEllipsize();
            if (max < (this.A07 << 1)) {
                this.A0G.A00.setSingleLine(true);
                C11930hF r0 = this.A0G;
                r0.A00.setEllipsize(TextUtils.TruncateAt.END);
                this.A0E.setSingleLine(true);
                ((ViewGroup.MarginLayoutParams) this.A0G.A00.getLayoutParams()).setMargins(0, 0, 0, 0);
                TextEmojiLabel textEmojiLabel = this.A0F;
                if (textEmojiLabel != null) {
                    textEmojiLabel.setVisibility(8);
                }
            } else {
                this.A0G.A00.setSingleLine(false);
                this.A0G.A00.setEllipsize(null);
                this.A0E.setSingleLine(false);
                int i2 = this.A07;
                ((ViewGroup.MarginLayoutParams) this.A0G.A00.getLayoutParams()).setMargins(0, Math.min(i2, max - (i2 << 1)), 0, 0);
                if (this.A0F != null && !TextUtils.isEmpty(this.A0I)) {
                    this.A0F.setVisibility(0);
                }
            }
            if (ellipsize != this.A0G.A00.getEllipsize()) {
                C11930hF r02 = this.A0G;
                r02.A00.setText(this.A0J);
                A02();
            }
            if (this.A06 != max) {
                this.A06 = max;
                int i3 = this.A05 >> 24;
                if (max == this.A07) {
                    if (i3 != -1) {
                        this.A0G.A00.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                        this.A0E.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                    }
                } else if (i3 == -1) {
                    this.A0G.A00.setShadowLayer(1.0f, 1.0f, 1.0f, -10066330);
                    this.A0E.setShadowLayer(1.0f, 1.0f, 1.0f, -10066330);
                }
                float f = this.A00;
                int i4 = (int) (((float) this.A04) * f * f);
                int i5 = (int) (((float) this.A03) * f * f);
                float f2 = this.A01;
                this.A0H.A00 = (f2 - ((f2 - this.A02) * f)) / f2;
                int i6 = (((int) (255.0f * f)) << 24) | (this.A05 & 16777215);
                this.A05 = i6;
                this.A0B.setBackgroundColor(i6);
                AnonymousClass0SE.A06(this.A0O, this.A0C, i4, i5);
                requestLayout();
            }
        } else if (!this.A0L) {
            Log.d("chatinfolayout/landscape");
            this.A0L = true;
            this.A0A.setVisibility(8);
            this.A0B.setBackgroundColor(0);
            this.A0H.A00 = 1.0f;
            this.A0G.A00.setSingleLine(false);
            this.A0G.A00.setEllipsize(null);
            this.A0E.setSingleLine(false);
            AnonymousClass0SE.A06(this.A0O, this.A0C, 0, 0);
            if (this.A0F != null && !TextUtils.isEmpty(this.A0I)) {
                this.A0F.setVisibility(0);
            }
        }
    }

    public void setSubtitleText(String str) {
        this.A0K = str;
        this.A0E.setText(str);
        TextView textView = this.A0E;
        int i = 0;
        if (TextUtils.isEmpty(str)) {
            i = 8;
        }
        textView.setVisibility(i);
        A02();
    }

    public void setTitleText(String str) {
        CharSequence charSequence = str;
        CharSequence A0g = C002001d.A0g(charSequence, getContext(), this.A0G.A00.getPaint(), 0.9f, null, this.A0P);
        if (A0g != null) {
            charSequence = A0g;
        }
        this.A0J = charSequence;
        this.A0G.A00.setText(charSequence);
        C11930hF r0 = this.A0G;
        r0.A00.setOnClickListener(this.A08);
        A02();
    }

    public void setTitleVerified(boolean z) {
        C11930hF r1 = this.A0G;
        int i = 0;
        if (z) {
            i = 2;
        }
        r1.A01(i);
    }
}

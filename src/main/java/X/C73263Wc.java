package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import org.npci.commonlibrary.widget.FormItemEditText;

/* renamed from: X.3Wc  reason: invalid class name and case insensitive filesystem */
public class C73263Wc extends LinearLayout implements AnonymousClass3BR {
    public int A00;
    public int A01;
    public Button A02;
    public ImageView A03;
    public LinearLayout A04;
    public ProgressBar A05;
    public TextView A06;
    public Object A07;
    public String A08;
    public String A09 = "";
    public FormItemEditText A0A;
    public AnonymousClass3BX A0B;
    public boolean A0C = false;
    public boolean A0D = false;
    public boolean A0E;

    public C73263Wc(Context context) {
        super(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, AnonymousClass2R7.A13);
        if (obtainStyledAttributes != null) {
            this.A08 = obtainStyledAttributes.getString(2);
            this.A00 = obtainStyledAttributes.getInteger(1, 6);
            this.A0E = obtainStyledAttributes.getBoolean(0, false);
            obtainStyledAttributes.recycle();
        }
        LinearLayout.inflate(context, R.layout.npci_layout_form_item, this);
        this.A04 = (LinearLayout) findViewById(R.id.form_item_action_bar);
        this.A06 = (TextView) findViewById(R.id.form_item_title);
        this.A0A = (FormItemEditText) findViewById(R.id.form_item_input);
        this.A02 = (Button) findViewById(R.id.form_item_button);
        this.A05 = (ProgressBar) findViewById(R.id.form_item_progress);
        this.A03 = (ImageView) findViewById(R.id.form_item_image);
        this.A0A.setInputType(0);
        setTitle(this.A08);
        setInputLength(this.A00);
        this.A0A.addTextChangedListener(new C73253Wb(this));
        this.A0A.setOnTouchListener(new AnonymousClass3BQ(this));
        setActionBarPositionTop(this.A0E);
    }

    public final C06330Su A00(View view, boolean z) {
        C06330Su A0E2 = AnonymousClass0Q7.A0E(view);
        float f = 0.0f;
        float f2 = 1.0f;
        float f3 = 0.0f;
        if (z) {
            f3 = 1.0f;
        }
        View view2 = (View) A0E2.A01.get();
        if (view2 != null) {
            view2.animate().scaleY(f3);
        }
        if (z) {
            f = 1.0f;
        }
        View view3 = (View) A0E2.A01.get();
        if (view3 != null) {
            view3.animate().scaleX(f);
        }
        AccelerateInterpolator accelerateInterpolator = new AccelerateInterpolator();
        View view4 = (View) A0E2.A01.get();
        if (view4 != null) {
            view4.animate().setInterpolator(accelerateInterpolator);
        }
        C74413aq r1 = new C74413aq(z);
        View view5 = (View) A0E2.A01.get();
        if (view5 != null) {
            A0E2.A05(view5, r1);
        }
        if (!z) {
            f2 = 0.5f;
        }
        A0E2.A02(f2);
        return A0E2;
    }

    public void A01(String str, boolean z) {
        if (!TextUtils.isEmpty(str)) {
            this.A02.setText(str);
        }
        A00(this.A02, z);
        this.A02.setEnabled(false);
        this.A02.setOnClickListener(null);
    }

    public void A02(boolean z) {
        C06330Su A002 = A00(this.A05, z);
        AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = new AccelerateDecelerateInterpolator();
        View view = (View) A002.A01.get();
        if (view != null) {
            view.animate().setInterpolator(accelerateDecelerateInterpolator);
        }
        A002.A01();
    }

    @Override // X.AnonymousClass3BR
    public boolean A4L() {
        this.A0A.requestFocus();
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
        if (r10 != 3) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        r5.setCompoundDrawablesWithIntrinsicBounds(r3, r2, r1, r8);
        r6.A02.setOnClickListener(r9);
        r6.A02.setEnabled(r12);
        A00(r6.A02, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0031, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0014, code lost:
        if (r10 != 1) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        if (r10 != 2) goto L_0x001b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
        r1 = null;
     */
    @Override // X.AnonymousClass3BR
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AQf(java.lang.String r7, android.graphics.drawable.Drawable r8, android.view.View.OnClickListener r9, int r10, boolean r11, boolean r12) {
        /*
            r6 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L_0x000b
            android.widget.Button r0 = r6.A02
            r0.setText(r7)
        L_0x000b:
            android.widget.Button r5 = r6.A02
            r4 = 0
            r3 = r8
            if (r10 == 0) goto L_0x0016
            r3 = r4
            r0 = 1
            r2 = r8
            if (r10 == r0) goto L_0x001b
        L_0x0016:
            r2 = r4
            r0 = 2
            r1 = r8
            if (r10 == r0) goto L_0x0032
        L_0x001b:
            r1 = r4
            r0 = 3
            if (r10 != r0) goto L_0x0032
        L_0x001f:
            r5.setCompoundDrawablesWithIntrinsicBounds(r3, r2, r1, r8)
            android.widget.Button r0 = r6.A02
            r0.setOnClickListener(r9)
            android.widget.Button r0 = r6.A02
            r0.setEnabled(r12)
            android.widget.Button r0 = r6.A02
            r6.A00(r0, r11)
            return
        L_0x0032:
            r8 = r4
            goto L_0x001f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73263Wc.AQf(java.lang.String, android.graphics.drawable.Drawable, android.view.View$OnClickListener, int, boolean, boolean):void");
    }

    @Override // X.AnonymousClass3BR
    public boolean AQg() {
        if (!this.A0D) {
            this.A0D = true;
            setText(this.A09);
        } else {
            this.A0D = false;
            this.A0A.setText(this.A09.replaceAll(".", "●"));
        }
        return this.A0D;
    }

    @Override // X.AnonymousClass3BR
    public Object getFormDataTag() {
        return this.A07;
    }

    public FormItemEditText getFormInputView() {
        return this.A0A;
    }

    public AnonymousClass3BX getFormItemListener() {
        return this.A0B;
    }

    public int getInputLength() {
        return this.A00;
    }

    @Override // X.AnonymousClass3BR
    public String getInputValue() {
        if (this.A0C || this.A0D) {
            return this.A0A.getText().toString();
        }
        return this.A09;
    }

    public void setActionBarPositionTop(boolean z) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.A04.getLayoutParams();
        if (z) {
            layoutParams.addRule(10);
            layoutParams.addRule(8, 0);
        } else {
            layoutParams.addRule(10, 0);
            layoutParams.addRule(8, R.id.form_item_input);
        }
        this.A04.setLayoutParams(layoutParams);
    }

    public void setFormDataTag(Object obj) {
        this.A07 = obj;
    }

    public void setFormItemListener(AnonymousClass3BX r1) {
        this.A0B = r1;
    }

    public void setFormItemTag(int i) {
        this.A01 = i;
    }

    public void setInputLength(int i) {
        this.A0A.setMaxLength(i);
        this.A00 = i;
    }

    @Override // X.AnonymousClass3BR
    public void setText(String str) {
        this.A0A.setText(str);
        this.A0A.setSelection(str.length());
    }

    public void setTitle(String str) {
        this.A06.setText(str);
        this.A08 = str;
    }
}

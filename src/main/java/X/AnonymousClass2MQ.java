package X;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import com.facebook.redex.ViewOnClickEBaseShape1S0200000_I1_0;
import com.facebook.redex.ViewOnClickEBaseShape5S0100000_I1_3;
import com.google.android.search.verification.client.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.doodle.ColorPickerComponent;
import com.whatsapp.doodle.DoodleEditText;

/* renamed from: X.2MQ  reason: invalid class name */
public class AnonymousClass2MQ extends Dialog {
    public float A00 = Float.MIN_VALUE;
    public float A01 = Float.MIN_VALUE;
    public float A02;
    public int A03;
    public int A04;
    public int A05;
    public View A06;
    public WaImageView A07;
    public WaTextView A08;
    public ColorPickerComponent A09;
    public DoodleEditText A0A;
    public AnonymousClass2MU A0B;
    public String A0C;
    public boolean A0D;
    public int[] A0E;
    public final ValueAnimator A0F = ValueAnimator.ofFloat(0.8f, 1.0f);
    public final AnonymousClass03P A0G = AnonymousClass03P.A00();
    public final C02590Cr A0H = C02590Cr.A00();
    public final boolean A0I;

    public AnonymousClass2MQ(Activity activity, String str, int i, float f, int i2, boolean z, int[] iArr) {
        super(activity, R.style.DoodleTextDialog);
        this.A0C = str;
        this.A03 = i;
        this.A0E = iArr;
        this.A02 = f;
        this.A04 = i2;
        this.A0I = z;
    }

    public final void A00(CharSequence charSequence) {
        int width = this.A0A.getWidth();
        int i = 25;
        int i2 = 50;
        while (true) {
            int i3 = i2 - i;
            if (i3 > 1) {
                float f = (float) ((i3 >> 1) + i);
                this.A02 = f;
                this.A0A.setTextSize(f);
                if (Layout.getDesiredWidth(charSequence, this.A0A.getPaint()) >= ((float) width)) {
                    i2 = (int) this.A02;
                } else {
                    i = (int) this.A02;
                }
            } else {
                this.A0A.setTextSize(this.A02 - 1.0f);
                return;
            }
        }
    }

    public void dismiss() {
        if (this.A0D) {
            this.A09.A01(R.anim.color_picker_animate_out);
        }
        super.dismiss();
    }

    public void onCreate(Bundle bundle) {
        ColorPickerComponent colorPickerComponent;
        View view;
        super.onCreate(bundle);
        setContentView(R.layout.doodle_text_entry);
        getWindow().setLayout(-1, -1);
        getWindow().setFlags(1024, 1024);
        getWindow().clearFlags(256);
        C006803i.A0W(this.A0G, getWindow(), findViewById(R.id.main));
        this.A0B = new AnonymousClass2MU(getContext(), 0);
        this.A08 = (WaTextView) findViewById(R.id.font_picker_preview);
        this.A09 = (ColorPickerComponent) findViewById(R.id.color_picker_component);
        View findViewById = findViewById(R.id.picker_button_container);
        this.A06 = findViewById;
        int[] iArr = this.A0E;
        findViewById.setPadding(iArr[0], iArr[1], iArr[2], iArr[3]);
        int i = this.A05;
        if (i > 0) {
            this.A09.setMaxHeight(i);
        }
        if (this.A0D) {
            this.A09.A01(R.anim.color_picker_animate_in);
        }
        this.A09.setColorAndInvalidate(this.A03);
        boolean z = this.A0I;
        if (!z && (view = (colorPickerComponent = this.A09).A02) != null) {
            view.setVisibility(8);
            View view2 = colorPickerComponent.A01;
            view2.setPadding(view2.getPaddingLeft(), view2.getPaddingTop(), view2.getPaddingRight(), (int) colorPickerComponent.getResources().getDimension(R.dimen.color_picker_text_entry_bottom_padding));
        }
        if (z) {
            ValueAnimator valueAnimator = this.A0F;
            valueAnimator.setInterpolator(AnonymousClass0N2.A0a(0.5f, 1.35f, 0.4f));
            valueAnimator.setDuration(400L);
            valueAnimator.addUpdateListener(new AnonymousClass2M4(this));
            valueAnimator.addListener(new AnonymousClass2MP(this));
            valueAnimator.start();
        } else {
            AnonymousClass2MU r1 = this.A0B;
            r1.A03 = this.A03;
            r1.A01 = 1.0f;
            r1.invalidateSelf();
        }
        DoodleEditText doodleEditText = (DoodleEditText) findViewById(R.id.text);
        this.A0A = doodleEditText;
        doodleEditText.setTextColor(this.A03);
        this.A0A.setText(this.A0C);
        this.A0A.setFontStyle(this.A04);
        DoodleEditText doodleEditText2 = this.A0A;
        int length = this.A0C.length();
        doodleEditText2.setSelection(length, length);
        this.A0A.setOnEditorActionListener(new AnonymousClass2M3(this));
        DoodleEditText doodleEditText3 = this.A0A;
        doodleEditText3.A01 = new C52882bu(this);
        doodleEditText3.addTextChangedListener(new AnonymousClass2c3(this));
        WaImageView waImageView = (WaImageView) findViewById(R.id.font_picker_btn);
        this.A07 = waImageView;
        waImageView.setOnClickListener(new ViewOnClickEBaseShape5S0100000_I1_3(this, 37));
        this.A07.setOnLongClickListener(new AnonymousClass2M2(this));
        this.A09.A03(null, null, new AnonymousClass2c4(this));
        this.A07.setImageDrawable(this.A0B);
        AnonymousClass2MO r3 = new AnonymousClass2MO();
        findViewById(R.id.main).setOnClickListener(new ViewOnClickEBaseShape1S0200000_I1_0(this, r3, 42));
        findViewById(R.id.main).setOnTouchListener(r3);
        getWindow().setSoftInputMode(5);
        this.A0A.post(new RunnableEBaseShape9S0100000_I1_4(this, 29));
        this.A0A.A01(false);
    }
}

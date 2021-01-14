package X;

import android.app.Activity;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape5S0100000_I1_3;
import com.google.android.search.verification.client.R;
import com.whatsapp.KeyboardPopupLayout;
import com.whatsapp.WaEditText;
import com.whatsapp.emoji.search.EmojiSearchContainer;
import java.util.ArrayList;

/* renamed from: X.2d6  reason: invalid class name */
public class AnonymousClass2d6 extends DialogC26681Ly {
    public int A00;
    public WaEditText A01;
    public C53392d8 A02;
    public CharSequence A03;
    public boolean A04 = true;
    public boolean A05;
    public boolean A06 = true;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final Activity A0D;
    public final AbstractC26561Lk A0E = new AnonymousClass2d4(this);
    public final AnonymousClass02M A0F;
    public final AnonymousClass03P A0G;
    public final AnonymousClass00D A0H;
    public final C02600Cs A0I;
    public final AnonymousClass2NW A0J;
    public final C02590Cr A0K;
    public final C03930Ii A0L;
    public final C53492dM A0M;
    public final AnonymousClass0Eg A0N;
    public final AnonymousClass022 A0O;
    public final C06170Sb A0P;
    public final String A0Q;

    public AnonymousClass2d6(Activity activity, AnonymousClass0Eg r4, AnonymousClass02M r5, C06170Sb r6, C02590Cr r7, C02600Cs r8, C03930Ii r9, AnonymousClass03P r10, AnonymousClass01X r11, C53492dM r12, AnonymousClass00D r13, AnonymousClass022 r14, int i, int i2, String str, AnonymousClass2NW r18, int i3, int i4, int i5, int i6) {
        super(activity, r11, R.layout.emoji_edittext_dialog, false);
        this.A0N = r4;
        this.A0F = r5;
        this.A0P = r6;
        this.A0K = r7;
        this.A0I = r8;
        this.A0L = r9;
        this.A0G = r10;
        this.A0M = r12;
        this.A0H = r13;
        this.A0O = r14;
        this.A07 = i;
        this.A0A = i6;
        this.A0D = activity;
        this.A0J = r18;
        this.A0C = i2;
        this.A0B = i3;
        this.A09 = i4;
        this.A08 = i5;
        this.A0Q = str;
    }

    public void onBackPressed() {
        if (this.A02.isShowing()) {
            this.A02.dismiss();
        } else {
            super.onBackPressed();
        }
    }

    @Override // X.DialogC26681Ly
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AnonymousClass01X r7 = super.A02;
        int i = this.A0C;
        ((TextView) findViewById(R.id.dialog_title)).setText(r7.A06(i));
        setTitle(r7.A06(i));
        Button button = (Button) findViewById(R.id.ok_btn);
        button.setOnClickListener(new ViewOnClickEBaseShape5S0100000_I1_3(this, 44));
        findViewById(R.id.cancel_btn).setOnClickListener(new ViewOnClickEBaseShape5S0100000_I1_3(this, 45));
        ArrayList arrayList = new ArrayList();
        TextView textView = (TextView) findViewById(R.id.counter_tv);
        WaEditText waEditText = (WaEditText) findViewById(R.id.edit_text);
        this.A01 = waEditText;
        AnonymousClass0SE.A0A(r7, waEditText);
        int i2 = this.A0B;
        if (i2 > 0 && this.A00 == 0) {
            textView.setVisibility(0);
        }
        if (i2 > 0) {
            arrayList.add(new AnonymousClass1M3(i2));
        }
        if (!this.A06) {
            arrayList.add(new C26831Mu());
        }
        if (!arrayList.isEmpty()) {
            this.A01.setFilters((InputFilter[]) arrayList.toArray(new InputFilter[0]));
        }
        WaEditText waEditText2 = this.A01;
        C02590Cr r5 = this.A0K;
        AnonymousClass03P r0 = this.A0G;
        AnonymousClass022 r11 = this.A0O;
        waEditText2.addTextChangedListener(new C07850Zx(r5, r0, r7, r11, waEditText2, textView, i2, this.A00, this.A05));
        if (!this.A04) {
            this.A01.addTextChangedListener(new AnonymousClass2d5(button));
        }
        this.A01.setInputType(this.A0A);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = -1;
        attributes.gravity = 48;
        getWindow().setAttributes(attributes);
        Activity activity = this.A0D;
        AnonymousClass0Eg r13 = this.A0N;
        C06170Sb r12 = this.A0P;
        C02600Cs r10 = this.A0I;
        C03930Ii r9 = this.A0L;
        this.A02 = new C53392d8(activity, r13, r12, r5, r10, r9, r0, r7, this.A0M, this.A0H, r11, (KeyboardPopupLayout) findViewById(R.id.emoji_edit_text_layout), (ImageButton) findViewById(R.id.emoji_btn), this.A01);
        C48672Ng r8 = new C48672Ng((EmojiSearchContainer) findViewById(R.id.emoji_search_container), this.A02, activity, r5, r9, r7, r11);
        r8.A00 = new C53382cz(this);
        C53392d8 r2 = this.A02;
        r2.A08(this.A0E);
        r2.A0B = new RunnableEBaseShape7S0200000_I1_2(this, r8, 48);
        setOnCancelListener(new AnonymousClass2NR(this));
        TextView textView2 = (TextView) findViewById(R.id.dialog_subtitle);
        if (TextUtils.isEmpty(null)) {
            textView2.setVisibility(8);
        } else {
            textView2.setVisibility(0);
            textView2.setText((CharSequence) null);
        }
        TextView textView3 = (TextView) findViewById(R.id.dialog_footer);
        if (TextUtils.isEmpty(this.A03)) {
            textView3.setVisibility(8);
        } else {
            textView3.setVisibility(0);
            textView3.setText(this.A03);
        }
        int i3 = this.A09;
        if (i3 != 0) {
            this.A01.setHint(r7.A06(i3));
        }
        WaEditText waEditText3 = this.A01;
        String str = this.A0Q;
        waEditText3.setText(C002001d.A1J(str, activity, r5));
        if (!TextUtils.isEmpty(str)) {
            this.A01.selectAll();
        }
        this.A01.A01(false);
        getWindow().setSoftInputMode(5);
    }
}

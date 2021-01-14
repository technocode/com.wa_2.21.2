package com.whatsapp.emoji;

import X.AbstractC07640Yw;
import X.AbstractC26561Lk;
import X.ActivityC004902h;
import X.AnonymousClass008;
import X.AnonymousClass00D;
import X.AnonymousClass01X;
import X.AnonymousClass022;
import X.AnonymousClass02M;
import X.AnonymousClass037;
import X.AnonymousClass03P;
import X.AnonymousClass0Eg;
import X.AnonymousClass0SE;
import X.AnonymousClass1M3;
import X.AnonymousClass2NQ;
import X.AnonymousClass2d2;
import X.C002001d;
import X.C02590Cr;
import X.C02600Cs;
import X.C03930Ii;
import X.C06170Sb;
import X.C07850Zx;
import X.C48672Ng;
import X.C53372cy;
import X.C53392d8;
import X.C53492dM;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.facebook.redex.ViewOnClickEBaseShape5S0100000_I1_3;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.google.android.search.verification.client.R;
import com.whatsapp.KeyboardPopupLayout;
import com.whatsapp.WaButton;
import com.whatsapp.WaEditText;
import com.whatsapp.emoji.search.EmojiSearchContainer;
import java.util.ArrayList;

public class EmojiEditTextBottomSheetDialogFragment extends BottomSheetDialogFragment {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public ImageButton A06;
    public WaButton A07;
    public WaEditText A08;
    public AbstractC07640Yw A09;
    public C53392d8 A0A;
    public String A0B;
    public boolean A0C = true;
    public boolean A0D = true;
    public boolean A0E;
    public String[] A0F;
    public final AbstractC26561Lk A0G = new AnonymousClass2d2(this);
    public final AnonymousClass02M A0H = AnonymousClass02M.A00();
    public final AnonymousClass03P A0I = AnonymousClass03P.A00();
    public final AnonymousClass00D A0J = AnonymousClass00D.A00();
    public final AnonymousClass01X A0K = AnonymousClass01X.A00();
    public final C02600Cs A0L = C02600Cs.A00();
    public final C02590Cr A0M = C02590Cr.A00();
    public final C03930Ii A0N = C03930Ii.A00();
    public final C53492dM A0O = C53492dM.A00();
    public final AnonymousClass0Eg A0P = AnonymousClass0Eg.A00();
    public final AnonymousClass022 A0Q = AnonymousClass022.A00();
    public final C06170Sb A0R = C06170Sb.A00();

    public static EmojiEditTextBottomSheetDialogFragment A00(int i, int i2, int i3, String str, int i4, String[] strArr, int i5) {
        EmojiEditTextBottomSheetDialogFragment emojiEditTextBottomSheetDialogFragment = new EmojiEditTextBottomSheetDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("dialogId", i);
        bundle.putInt("titleResId", i2);
        bundle.putInt("hintResId", 0);
        bundle.putInt("emptyErrorResId", i3);
        bundle.putString("defaultStr", str);
        bundle.putInt("maxLength", i4);
        bundle.putInt("inputType", i5);
        bundle.putStringArray("codepointBlacklist", strArr);
        emojiEditTextBottomSheetDialogFragment.A0N(bundle);
        return emojiEditTextBottomSheetDialogFragment;
    }

    @Override // X.AnonymousClass037, androidx.fragment.app.DialogFragment
    public void A0Y() {
        super.A0Y();
        this.A09 = null;
    }

    @Override // X.AnonymousClass037
    public View A0Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LayoutInflater layoutInflater2 = A0A().getLayoutInflater();
        if (layoutInflater2 != null) {
            View inflate = layoutInflater2.inflate(R.layout.emoji_editext_bottomsheet_dialog, (ViewGroup) null, false);
            TextView textView = (TextView) inflate.findViewById(R.id.dialog_title_tv);
            int i = this.A05;
            if (i != 0) {
                textView.setText(this.A0K.A06(i));
            }
            this.A08 = (WaEditText) inflate.findViewById(R.id.edit_text);
            TextView textView2 = (TextView) inflate.findViewById(R.id.counter_tv);
            AnonymousClass01X r11 = this.A0K;
            AnonymousClass0SE.A0A(r11, this.A08);
            if (this.A04 > 0) {
                textView2.setVisibility(0);
            }
            ArrayList arrayList = new ArrayList();
            int i2 = this.A04;
            if (i2 > 0) {
                arrayList.add(new AnonymousClass1M3(i2));
            }
            if (!arrayList.isEmpty()) {
                this.A08.setFilters((InputFilter[]) arrayList.toArray(new InputFilter[0]));
            }
            WaEditText waEditText = this.A08;
            C02590Cr r10 = this.A0M;
            AnonymousClass03P r14 = this.A0I;
            AnonymousClass022 r0 = this.A0Q;
            waEditText.addTextChangedListener(new C07850Zx(r10, r14, r11, r0, waEditText, textView2, this.A04, 0, false));
            this.A07 = (WaButton) inflate.findViewById(R.id.save_button);
            this.A08.setInputType(this.A03);
            this.A08.A01(true);
            Window window = ((DialogFragment) this).A03.getWindow();
            if (Build.VERSION.SDK_INT >= 21) {
                window.getDecorView().setSystemUiVisibility(1280);
                window.setStatusBarColor(0);
            }
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            attributes.gravity = 48;
            ((DialogFragment) this).A03.getWindow().setAttributes(attributes);
            this.A07.setOnClickListener(new ViewOnClickEBaseShape5S0100000_I1_3(this, 42));
            inflate.findViewById(R.id.cancel_button).setOnClickListener(new ViewOnClickEBaseShape5S0100000_I1_3(this, 43));
            KeyboardPopupLayout keyboardPopupLayout = (KeyboardPopupLayout) inflate.findViewById(R.id.emoji_edit_text_layout);
            keyboardPopupLayout.A06 = true;
            ImageButton imageButton = (ImageButton) inflate.findViewById(R.id.emoji_btn);
            this.A06 = imageButton;
            ActivityC004902h A0A2 = A0A();
            AnonymousClass0Eg r6 = this.A0P;
            C06170Sb r5 = this.A0R;
            C02600Cs r4 = this.A0L;
            C03930Ii r15 = this.A0N;
            this.A0A = new C53392d8(A0A2, r6, r5, r10, r4, r15, r14, r11, this.A0O, this.A0J, r0, keyboardPopupLayout, imageButton, this.A08);
            new C48672Ng((EmojiSearchContainer) inflate.findViewById(R.id.emoji_search_container), this.A0A, A0A(), r10, r15, r11, r0).A00 = new C53372cy(this);
            C53392d8 r2 = this.A0A;
            r2.A08(this.A0G);
            r2.A0B = new RunnableEBaseShape9S0100000_I1_4(this, 31);
            int i3 = this.A02;
            if (i3 != 0) {
                this.A08.setHint(r11.A06(i3));
            }
            this.A08.setText(C002001d.A1J(this.A0B, A0A(), r10));
            if (!TextUtils.isEmpty(this.A0B)) {
                this.A08.selectAll();
            }
            ((DialogFragment) this).A03.setOnShowListener(new AnonymousClass2NQ(this));
            if (bundle == null) {
                this.A0E = true;
                return inflate;
            }
            this.A0E = bundle.getBoolean("is_keyboard_showing");
            return inflate;
        }
        throw null;
    }

    @Override // X.AnonymousClass037, androidx.fragment.app.DialogFragment
    public void A0a(Context context) {
        super.A0a(context);
        if (context instanceof AbstractC07640Yw) {
            this.A09 = (AbstractC07640Yw) context;
            return;
        }
        StringBuilder A0S = AnonymousClass008.A0S("Activity must implement ");
        A0S.append("EmojiEditTextBottomSheetDialogFragment$EmojiEditTextDialogListener");
        throw new IllegalStateException(A0S.toString());
    }

    @Override // X.AnonymousClass037
    public void A0e() {
        this.A0U = true;
        this.A08.requestFocus();
        if (this.A0E) {
            this.A08.A01(false);
        }
    }

    @Override // X.AnonymousClass037, androidx.fragment.app.DialogFragment
    public void A0i(Bundle bundle) {
        super.A0i(bundle);
        A0s(0, 2131952160);
        Bundle bundle2 = ((AnonymousClass037) this).A06;
        if (bundle2 != null) {
            this.A00 = bundle2.getInt("dialogId");
            this.A05 = bundle2.getInt("titleResId");
            this.A02 = bundle2.getInt("hintResId");
            this.A01 = bundle2.getInt("emptyErrorResId");
            this.A0B = bundle2.getString("defaultStr");
            this.A04 = bundle2.getInt("maxLength");
            this.A03 = bundle2.getInt("inputType");
            this.A0F = bundle2.getStringArray("codepointBlacklist");
            return;
        }
        throw null;
    }

    @Override // X.AnonymousClass037, androidx.fragment.app.DialogFragment
    public void A0j(Bundle bundle) {
        super.A0j(bundle);
        boolean A012 = C06170Sb.A01(this.A08);
        this.A0E = A012;
        bundle.putBoolean("is_keyboard_showing", A012);
    }
}

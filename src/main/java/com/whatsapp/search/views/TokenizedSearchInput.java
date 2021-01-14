package com.whatsapp.search.views;

import X.AbstractC005102k;
import X.AnonymousClass01A;
import X.AnonymousClass01X;
import X.AnonymousClass03P;
import X.AnonymousClass0Q0;
import X.AnonymousClass0Q7;
import X.C004302a;
import X.C004402b;
import X.C008805h;
import X.C014308b;
import X.C07780Zm;
import X.C28051Sr;
import X.C655630j;
import X.C656030n;
import X.C656330s;
import X.C71193Ny;
import X.View$OnFocusChangeListenerC656430t;
import X.View$OnKeyListenerC655930m;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape1S0100000_I0_1;
import com.google.android.material.chip.Chip;
import com.google.android.search.verification.client.R;
import com.whatsapp.WaImageButton;
import com.whatsapp.WaImageView;
import com.whatsapp.jid.UserJid;
import com.whatsapp.search.SearchViewModel;
import com.whatsapp.text.FinalBackspaceAwareEntry;

public class TokenizedSearchInput extends LinearLayout {
    public int A00 = 0;
    public int A01 = 0;
    public View.OnClickListener A02 = new ViewOnClickEBaseShape1S0100000_I0_1(this, 19);
    public View.OnKeyListener A03 = new View$OnKeyListenerC655930m(this);
    public TextView.OnEditorActionListener A04 = new C656330s(this);
    public AnonymousClass0Q0 A05 = new C07780Zm(this);
    public AbstractC005102k A06;
    public AnonymousClass01A A07 = AnonymousClass01A.A00();
    public C014308b A08 = C014308b.A00();
    public AnonymousClass03P A09 = AnonymousClass03P.A00();
    public AnonymousClass01X A0A = AnonymousClass01X.A00();
    public UserJid A0B;
    public SearchViewModel A0C;
    public C71193Ny A0D = new C71193Ny(this);
    public Integer A0E = 0;
    public Runnable A0F;
    public Runnable A0G;
    public String A0H = "";
    public boolean A0I;
    public boolean A0J = false;
    public final View.OnFocusChangeListener A0K = new View$OnFocusChangeListenerC656430t(this);
    public final View A0L;
    public final Chip A0M;
    public final Chip A0N;
    public final WaImageButton A0O;
    public final WaImageView A0P;
    public final FinalBackspaceAwareEntry A0Q;

    public TokenizedSearchInput(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater from = LayoutInflater.from(context);
        setOrientation(0);
        setGravity(16);
        from.inflate(R.layout.search_input, (ViewGroup) this, true);
        this.A0N = (Chip) AnonymousClass0Q7.A0D(this, R.id.type_token);
        this.A0M = (Chip) AnonymousClass0Q7.A0D(this, R.id.chat_token);
        this.A0Q = (FinalBackspaceAwareEntry) AnonymousClass0Q7.A0D(this, R.id.search_input);
        this.A0P = (WaImageView) AnonymousClass0Q7.A0D(this, R.id.search_clear_btn);
        this.A0L = AnonymousClass0Q7.A0D(this, R.id.focus_dummy);
        this.A0O = (WaImageButton) AnonymousClass0Q7.A0D(this, R.id.grid_list_toggle);
    }

    public static void A00(TokenizedSearchInput tokenizedSearchInput, View view) {
        SearchViewModel searchViewModel = tokenizedSearchInput.A0C;
        if (searchViewModel != null) {
            if (view == tokenizedSearchInput.A0N) {
                searchViewModel.A0H(0);
            } else if (view == tokenizedSearchInput.A0M) {
                searchViewModel.A0I(null);
            }
        }
        tokenizedSearchInput.postDelayed(new RunnableEBaseShape4S0100000_I0_4(tokenizedSearchInput, 15), 100);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0060, code lost:
        if (r4 == 8) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0076, code lost:
        if (r4 == 8) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
        if (r8.A0E.intValue() != 0) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01() {
        /*
        // Method dump skipped, instructions count: 192
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.search.views.TokenizedSearchInput.A01():void");
    }

    public final void A02() {
        if (this.A0B == null && TextUtils.isEmpty(this.A0H) && this.A0E.intValue() == 0) {
            this.A0P.setVisibility(4);
        } else {
            this.A0P.setVisibility(0);
        }
    }

    public final void A03() {
        if (this.A0B == null || this.A0E.intValue() == 0) {
            this.A0Q.setHint(this.A0A.A06(R.string.search_hint));
        } else {
            this.A0Q.setHint("");
        }
    }

    public final void A04() {
        if (this.A0B == null) {
            this.A0M.setVisibility(8);
            return;
        }
        Chip chip = this.A0M;
        if (chip.getVisibility() == 8) {
            A06(chip);
            return;
        }
        boolean z = true;
        boolean z2 = false;
        if (this.A00 == 2) {
            z2 = true;
        }
        int A002 = C004302a.A00(getContext(), R.color.search_input_token_selected);
        int A003 = C004302a.A00(getContext(), R.color.search_input_token);
        if (!z2) {
            A002 = A003;
        }
        chip.setChipBackgroundColor(ColorStateList.valueOf(A002));
        if (this.A00 != 2) {
            z = false;
        }
        A07(chip, z);
    }

    public final void A05() {
        C655630j r0 = (C655630j) C28051Sr.A0T().get(this.A0E.intValue());
        if (r0 == null) {
            this.A0N.setVisibility(8);
            return;
        }
        Chip chip = this.A0N;
        chip.setText(this.A0A.A06(r0.A05));
        C28051Sr.A1K(getContext(), chip, this.A0E.intValue(), R.color.white);
        boolean z = false;
        boolean z2 = false;
        if (this.A00 == 1) {
            z2 = true;
        }
        int A002 = C004302a.A00(getContext(), R.color.search_input_token_selected);
        int A003 = C004302a.A00(getContext(), R.color.search_input_token);
        if (!z2) {
            A002 = A003;
        }
        chip.setChipBackgroundColor(ColorStateList.valueOf(A002));
        if (this.A00 == 1) {
            z = true;
        }
        A07(chip, z);
        if (chip.getVisibility() == 8) {
            A06(chip);
        }
    }

    public final void A06(Chip chip) {
        int color = getResources().getColor(R.color.black_alpha_20);
        int color2 = getResources().getColor(R.color.search_input_token);
        int A022 = C004402b.A02(color, color2);
        if (this.A0J) {
            chip.setScaleX(1.0f);
            chip.setScaleY(1.0f);
            chip.setAlpha(1.0f);
            chip.setVisibility(0);
            chip.setChipBackgroundColor(ColorStateList.valueOf(color2));
            return;
        }
        ColorStateList valueOf = ColorStateList.valueOf(A022);
        chip.setScaleX(0.92f);
        chip.setScaleY(0.92f);
        chip.setAlpha(0.0f);
        chip.setChipBackgroundColor(valueOf);
        chip.setVisibility(0);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(chip, "scaleX", 0.92f, 1.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(chip, "scaleY", 0.92f, 1.0f);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(chip, "alpha", 0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat).with(ofFloat2).with(ofFloat3);
        animatorSet.setDuration(100L);
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(A022), Integer.valueOf(color2));
        ofObject.addUpdateListener(new C656030n(chip));
        ofObject.setDuration(100L);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.play(ofObject).after(animatorSet);
        animatorSet2.start();
    }

    public void A07(Chip chip, boolean z) {
        if (z) {
            chip.setChipStrokeColor(ColorStateList.valueOf(C004302a.A00(getContext(), R.color.search_input_token_selected_stroke)));
            chip.setChipStrokeWidth((float) C008805h.A02(getContext(), 1.0f));
            return;
        }
        chip.setChipStrokeColor(null);
        chip.setChipStrokeWidth((float) C008805h.A02(getContext(), 0.0f));
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int max = Math.max(getResources().getDimensionPixelSize(R.dimen.search_token_min_max), (int) Math.floor(((double) getWidth()) * 0.3d));
        this.A0N.setMaxWidth(max);
        this.A0M.setMaxWidth(max);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
        if (r4 != 3) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void setFocus(com.whatsapp.search.views.TokenizedSearchInput r3, int r4) {
        /*
            com.whatsapp.search.SearchViewModel r0 = r3.A0C
            if (r0 == 0) goto L_0x002c
            int r0 = r3.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            boolean r0 = X.C006803i.A0q(r1, r0)
            if (r0 != 0) goto L_0x002c
            r2 = 1
            if (r4 == 0) goto L_0x0037
            if (r4 == r2) goto L_0x002d
            r0 = 2
            if (r4 == r0) goto L_0x002d
        L_0x001c:
            r0 = 3
            if (r4 == r0) goto L_0x0024
        L_0x001f:
            com.whatsapp.search.SearchViewModel r0 = r3.A0C
            r0.A0L(r2)
        L_0x0024:
            r3.A00 = r4
            r3.A05()
            r3.A04()
        L_0x002c:
            return
        L_0x002d:
            com.whatsapp.text.FinalBackspaceAwareEntry r1 = r3.A0Q
            r0 = 0
            r1.setSelection(r0)
            r1.setCursorVisible(r0)
            goto L_0x001c
        L_0x0037:
            com.whatsapp.text.FinalBackspaceAwareEntry r0 = r3.A0Q
            r0.setCursorVisible(r2)
            goto L_0x001f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.search.views.TokenizedSearchInput.setFocus(com.whatsapp.search.views.TokenizedSearchInput, int):void");
    }

    public void setNoAnimateForTestsOnly(boolean z) {
        this.A0J = z;
    }
}

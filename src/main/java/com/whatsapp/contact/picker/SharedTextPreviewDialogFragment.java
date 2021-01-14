package com.whatsapp.contact.picker;

import X.AbstractC26561Lk;
import X.ActivityC004902h;
import X.AnonymousClass008;
import X.AnonymousClass00D;
import X.AnonymousClass00E;
import X.AnonymousClass00T;
import X.AnonymousClass01X;
import X.AnonymousClass022;
import X.AnonymousClass037;
import X.AnonymousClass03P;
import X.AnonymousClass0Eg;
import X.AnonymousClass0SE;
import X.AnonymousClass1Y8;
import X.AnonymousClass2GI;
import X.AnonymousClass2GJ;
import X.AnonymousClass2GK;
import X.AnonymousClass2Y8;
import X.AnonymousClass2Y9;
import X.AnonymousClass2YA;
import X.C000300f;
import X.C002001d;
import X.C002101e;
import X.C002701k;
import X.C02590Cr;
import X.C02600Cs;
import X.C02780Dk;
import X.C03930Ii;
import X.C06170Sb;
import X.C27231Or;
import X.C27241Os;
import X.C27261Ou;
import X.C48672Ng;
import X.C51292Yd;
import X.C51302Ye;
import X.C51322Yg;
import X.C51332Yh;
import X.C53392d8;
import X.C53492dM;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.TranslateAnimation;
import android.widget.ImageButton;
import androidx.fragment.app.DialogFragment;
import com.facebook.redex.ViewOnClickEBaseShape5S0100000_I1_3;
import com.google.android.search.verification.client.R;
import com.whatsapp.BaseSharedPreviewDialogFragment;
import com.whatsapp.HomeActivity;
import com.whatsapp.KeyboardPopupLayout;
import com.whatsapp.MentionableEntry;
import com.whatsapp.conversation.conversationrow.WebPagePreviewView;
import com.whatsapp.util.ViewOnClickCListenerShape12S0100000_I1_1;
import com.whatsapp.util.ViewOnClickCListenerShape4S0200000_I1;
import java.util.regex.Pattern;

public class SharedTextPreviewDialogFragment extends BaseSharedPreviewDialogFragment {
    public View A00;
    public ImageButton A01;
    public MentionableEntry A02;
    public C27241Os A03;
    public SharedTextPreviewScrollView A04;
    public C53392d8 A05;
    public Runnable A06 = null;
    public String A07;
    public String A08;
    public String A09;
    public boolean A0A;
    public boolean A0B = false;
    public boolean A0C = true;
    public final Handler A0D = new Handler(Looper.getMainLooper());
    public final C02780Dk A0E = C02780Dk.A02();
    public final AbstractC26561Lk A0F = new C51292Yd(this);
    public final C000300f A0G = C000300f.A00();
    public final AnonymousClass00D A0H = AnonymousClass00D.A00();
    public final C02600Cs A0I = C02600Cs.A00();
    public final C02590Cr A0J = C02590Cr.A00();
    public final C03930Ii A0K = C03930Ii.A00();
    public final C53492dM A0L = C53492dM.A00();
    public final C002701k A0M = C002701k.A00();
    public final AnonymousClass0Eg A0N = AnonymousClass0Eg.A00();
    public final AnonymousClass022 A0O = AnonymousClass022.A00();
    public final C06170Sb A0P = C06170Sb.A00();
    public final AnonymousClass00T A0Q = C002101e.A00();

    @Override // com.whatsapp.BaseSharedPreviewDialogFragment, X.AnonymousClass037
    public View A0Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z;
        int i;
        String replaceFirst;
        super.A0Z(layoutInflater, viewGroup, bundle);
        ActivityC004902h A0A2 = A0A();
        if (A0A2 != null) {
            ((BaseSharedPreviewDialogFragment) this).A04.addView(A0A2.getLayoutInflater().inflate(R.layout.shared_text_preview_relative_layout, (ViewGroup) null, false));
            this.A04 = (SharedTextPreviewScrollView) ((BaseSharedPreviewDialogFragment) this).A04.findViewById(R.id.subject_layout);
            this.A02 = (MentionableEntry) ((BaseSharedPreviewDialogFragment) this).A04.findViewById(R.id.mentionable_entry);
            this.A00 = ((BaseSharedPreviewDialogFragment) this).A04.findViewById(R.id.stub);
            AnonymousClass01X r14 = ((BaseSharedPreviewDialogFragment) this).A0F;
            MentionableEntry mentionableEntry = this.A02;
            if (r14.A02().A06) {
                mentionableEntry.setPadding(2, mentionableEntry.getPaddingTop(), mentionableEntry.getPaddingRight(), mentionableEntry.getPaddingBottom());
            } else {
                mentionableEntry.setPadding(mentionableEntry.getPaddingLeft(), mentionableEntry.getPaddingTop(), 2, mentionableEntry.getPaddingBottom());
            }
            this.A02.addTextChangedListener(new C51302Ye(this));
            this.A02.setInputType(131073);
            ImageButton imageButton = (ImageButton) ((BaseSharedPreviewDialogFragment) this).A04.findViewById(R.id.emoji_btn);
            this.A01 = imageButton;
            ActivityC004902h A0A3 = A0A();
            AnonymousClass0Eg r9 = this.A0N;
            C06170Sb r8 = this.A0P;
            C02590Cr r7 = this.A0J;
            C02600Cs r6 = this.A0I;
            C03930Ii r5 = this.A0K;
            AnonymousClass03P r4 = ((BaseSharedPreviewDialogFragment) this).A0E;
            C53492dM r3 = this.A0L;
            AnonymousClass00D r2 = this.A0H;
            AnonymousClass022 r1 = this.A0O;
            C53392d8 r15 = new C53392d8(A0A3, r9, r8, r7, r6, r5, r4, r14, r3, r2, r1, (KeyboardPopupLayout) ((BaseSharedPreviewDialogFragment) this).A00.findViewById(R.id.emoji_edit_text_layout), imageButton, this.A02);
            this.A05 = r15;
            C48672Ng r32 = new C48672Ng(((BaseSharedPreviewDialogFragment) this).A08, r15, A0A(), r7, r5, r14, r1);
            r32.A00 = new AnonymousClass2YA(this);
            C53392d8 r22 = this.A05;
            r22.A08(this.A0F);
            r22.A0B = new RunnableEBaseShape7S0200000_I1_2(this, r32, 18);
            String A012 = AnonymousClass1Y8.A01(this.A09);
            if (A012 == null || (replaceFirst = this.A09.replaceFirst(Pattern.quote(A012), "")) == null || !replaceFirst.trim().isEmpty()) {
                z = true;
            } else {
                StringBuilder A0S = AnonymousClass008.A0S("\n\n");
                A0S.append(this.A09);
                this.A09 = A0S.toString();
                z = false;
            }
            A0x();
            this.A02.setText(C002001d.A1J(this.A09, A0A(), r7));
            A10(this.A02.getText(), true);
            this.A02.requestFocus();
            Window window = ((DialogFragment) this).A03.getWindow();
            if (window != null) {
                window.setSoftInputMode(5);
                MentionableEntry mentionableEntry2 = this.A02;
                if (z) {
                    i = mentionableEntry2.getText().length();
                } else {
                    i = 0;
                }
                mentionableEntry2.setSelection(i);
                SharedTextPreviewScrollView sharedTextPreviewScrollView = this.A04;
                sharedTextPreviewScrollView.A00 = new AnonymousClass2Y9(this);
                sharedTextPreviewScrollView.getViewTreeObserver().addOnGlobalLayoutListener(new AnonymousClass2GK(this));
                this.A04.getViewTreeObserver().addOnScrollChangedListener(new AnonymousClass2GI(this));
                this.A04.setOverScrollMode(2);
                ((BaseSharedPreviewDialogFragment) this).A03.setOnClickListener(new ViewOnClickEBaseShape5S0100000_I1_3(this, 9));
                ((DialogFragment) this).A03.setOnKeyListener(new AnonymousClass2GJ(this));
                A0y();
                return ((BaseSharedPreviewDialogFragment) this).A00;
            }
            throw null;
        }
        throw null;
    }

    @Override // X.AnonymousClass037
    public void A0g(int i, int i2, Intent intent) {
        if (i == 27 && i2 == -1) {
            ActivityC004902h A0A2 = A0A();
            if (A0A2 != null) {
                this.A0E.A05(A0A(), new Intent(A0A2, HomeActivity.class));
                A0A().finish();
            }
            A0w(false, false);
        }
    }

    @Override // com.whatsapp.BaseSharedPreviewDialogFragment, X.AnonymousClass037
    public boolean A0m(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            if (this.A05.isShowing()) {
                this.A05.dismiss();
            }
            ActivityC004902h A0A2 = A0A();
            if (A0A2 != null) {
                A0A2.getWindow().setSoftInputMode(2);
            } else {
                throw null;
            }
        }
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        A0w(false, false);
        return true;
    }

    @Override // com.whatsapp.BaseSharedPreviewDialogFragment, androidx.fragment.app.DialogFragment
    public Dialog A0p(Bundle bundle) {
        Bundle bundle2 = ((AnonymousClass037) this).A06;
        AnonymousClass00E.A04(bundle2, "null arguments");
        String string = bundle2.getString("message");
        AnonymousClass00E.A04(string, "null message");
        this.A09 = string;
        Boolean valueOf = Boolean.valueOf(bundle2.getBoolean("has_text_from_url"));
        AnonymousClass00E.A04(valueOf, "null hasTextFromUrl");
        this.A0A = valueOf.booleanValue();
        return super.A0p(bundle);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (r0 != 0) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0y() {
        /*
        // Method dump skipped, instructions count: 121
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.contact.picker.SharedTextPreviewDialogFragment.A0y():void");
    }

    public final void A0z() {
        ViewGroup viewGroup;
        if (((BaseSharedPreviewDialogFragment) this).A07 != null && (viewGroup = ((BaseSharedPreviewDialogFragment) this).A02) != null && viewGroup.getVisibility() == 0 && !this.A0B) {
            this.A0B = true;
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, (float) ((BaseSharedPreviewDialogFragment) this).A02.getHeight());
            translateAnimation.setDuration(150);
            translateAnimation.setAnimationListener(new C51332Yh(this));
            ((BaseSharedPreviewDialogFragment) this).A07.startAnimation(translateAnimation);
        }
    }

    public final void A10(Editable editable, boolean z) {
        String A012 = AnonymousClass1Y8.A01(editable.toString());
        this.A08 = A012;
        if (A012 == null || A012.equals(this.A07)) {
            A11(null);
            return;
        }
        this.A07 = null;
        C27241Os r0 = this.A03;
        if (r0 == null || !TextUtils.equals(r0.A0G, A012)) {
            A11(C27261Ou.A00(A012));
            if (this.A03 == null) {
                Runnable runnable = this.A06;
                if (runnable != null) {
                    this.A0D.removeCallbacks(runnable);
                    this.A06 = null;
                }
                if (z) {
                    C27261Ou.A01(this.A0M, ((BaseSharedPreviewDialogFragment) this).A0B, this.A0Q, ((BaseSharedPreviewDialogFragment) this).A0F, A012, new AnonymousClass2Y8(this));
                    return;
                }
                RunnableEBaseShape1S1100000_I1 runnableEBaseShape1S1100000_I1 = new RunnableEBaseShape1S1100000_I1(this, A012, 20);
                this.A06 = runnableEBaseShape1S1100000_I1;
                this.A0D.postDelayed(runnableEBaseShape1S1100000_I1, 700);
            }
        }
    }

    public final void A11(C27241Os r12) {
        C27231Or r1;
        if (A0A() != null) {
            if (r12 == null) {
                this.A03 = null;
                A0z();
            } else if (!TextUtils.equals(this.A08, r12.A0G)) {
            } else {
                if (r12.A0A()) {
                    this.A03 = r12;
                    if (((BaseSharedPreviewDialogFragment) this).A07 == null) {
                        ActivityC004902h A0A2 = A0A();
                        if (A0A2 != null) {
                            WebPagePreviewView webPagePreviewView = new WebPagePreviewView(A0A2);
                            ((BaseSharedPreviewDialogFragment) this).A07 = webPagePreviewView;
                            View findViewById = webPagePreviewView.findViewById(R.id.link_preview_content);
                            ((BaseSharedPreviewDialogFragment) this).A07.setForeground(null);
                            ((BaseSharedPreviewDialogFragment) this).A07.setMinimumHeight(A02().getDimensionPixelSize(R.dimen.share_preview_footer_max_height));
                            findViewById.setBackgroundResource(0);
                            findViewById.setEnabled(false);
                            ((BaseSharedPreviewDialogFragment) this).A02.addView(((BaseSharedPreviewDialogFragment) this).A07);
                            AnonymousClass0SE.A06(((BaseSharedPreviewDialogFragment) this).A0F, ((BaseSharedPreviewDialogFragment) this).A07.findViewById(R.id.title), 0, A02().getDimensionPixelSize(R.dimen.link_preview_cancel_button_padding));
                            ((BaseSharedPreviewDialogFragment) this).A07.setProgressBarVisibility(false);
                            ((BaseSharedPreviewDialogFragment) this).A07.findViewById(R.id.link_preview_content).setMinimumHeight(A02().getDimensionPixelSize(R.dimen.link_preview_min_height));
                            View findViewById2 = ((BaseSharedPreviewDialogFragment) this).A07.findViewById(R.id.cancel);
                            findViewById2.setVisibility(0);
                            findViewById2.setOnClickListener(new ViewOnClickCListenerShape12S0100000_I1_1(this, 3));
                            View findViewById3 = ((BaseSharedPreviewDialogFragment) this).A07.findViewById(R.id.thumb);
                            C27241Os r0 = this.A03;
                            if (!(r0 == null || (r1 = r0.A07) == null || r1.A02 == null)) {
                                String str = r1.A01;
                                if ("video/mp4".equals(str) || "image/gif".equals(str)) {
                                    findViewById.setEnabled(true);
                                }
                            }
                            findViewById.setOnClickListener(new ViewOnClickCListenerShape4S0200000_I1(this, findViewById3, 17));
                        } else {
                            throw null;
                        }
                    }
                    A0y();
                    if (!(((BaseSharedPreviewDialogFragment) this).A02.getVisibility() == 0 || ((BaseSharedPreviewDialogFragment) this).A07 == null || this.A0B)) {
                        this.A0B = true;
                        int[] iArr = {0, 0};
                        this.A02.getLocationOnScreen(iArr);
                        int height = this.A02.getHeight() + iArr[1];
                        int[] iArr2 = {0, 0};
                        ((BaseSharedPreviewDialogFragment) this).A00.findViewById(R.id.recipients_container).getLocationOnScreen(iArr2);
                        int i = iArr2[1];
                        int abs = Math.abs(height - i);
                        int dimensionPixelSize = A02().getDimensionPixelSize(R.dimen.share_preview_footer_max_height) - A02().getDimensionPixelSize(R.dimen.share_preview_footer_min_height);
                        if (abs > dimensionPixelSize || (i == 0 && height == 0)) {
                            A0x();
                            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, (float) ((BaseSharedPreviewDialogFragment) this).A02.getHeight(), 0.0f);
                            translateAnimation.setDuration(150);
                            translateAnimation.setDuration(150);
                            ((BaseSharedPreviewDialogFragment) this).A02.setVisibility(0);
                            ((BaseSharedPreviewDialogFragment) this).A01.setVisibility(0);
                            ((BaseSharedPreviewDialogFragment) this).A07.startAnimation(translateAnimation);
                        } else {
                            TranslateAnimation translateAnimation2 = new TranslateAnimation(0.0f, 0.0f, 0.0f, (float) (-dimensionPixelSize));
                            translateAnimation2.setDuration(150);
                            translateAnimation2.setAnimationListener(new C51322Yg(this));
                            this.A04.startAnimation(translateAnimation2);
                        }
                        this.A0B = false;
                    }
                    this.A02.requestFocus();
                    WebPagePreviewView webPagePreviewView2 = ((BaseSharedPreviewDialogFragment) this).A07;
                    if (webPagePreviewView2 != null) {
                        webPagePreviewView2.A01(r12, null);
                        return;
                    }
                    throw null;
                }
                this.A03 = null;
                A0z();
            }
        }
    }

    @Override // com.whatsapp.BaseSharedPreviewDialogFragment, androidx.fragment.app.DialogFragment
    public void onDismiss(DialogInterface dialogInterface) {
        ActivityC004902h A0A2 = A0A();
        if (A0A2 != null) {
            A0A2.getWindow().setSoftInputMode(3);
        }
        super.onDismiss(dialogInterface);
    }
}

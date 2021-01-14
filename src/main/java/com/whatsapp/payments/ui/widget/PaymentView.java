package com.whatsapp.payments.ui.widget;

import X.AbstractC05890Qx;
import X.AbstractC24981Dz;
import X.AbstractC63522wY;
import X.AbstractC63672wp;
import X.AbstractC63682wq;
import X.AbstractC63732wv;
import X.AbstractC63782x0;
import X.ActivityC004802g;
import X.AnonymousClass00D;
import X.AnonymousClass01X;
import X.AnonymousClass022;
import X.AnonymousClass02M;
import X.AnonymousClass02N;
import X.AnonymousClass02U;
import X.AnonymousClass03P;
import X.AnonymousClass082;
import X.AnonymousClass0Eg;
import X.AnonymousClass0HJ;
import X.AnonymousClass0L2;
import X.AnonymousClass0N2;
import X.AnonymousClass0Q7;
import X.AnonymousClass0S2;
import X.AnonymousClass0S5;
import X.AnonymousClass0YX;
import X.AnonymousClass1E4;
import X.AnonymousClass1MI;
import X.AnonymousClass1VY;
import X.AnonymousClass2WC;
import X.AnonymousClass3II;
import X.AnonymousClass3IN;
import X.AnonymousClass3IQ;
import X.AnonymousClass3IR;
import X.AnonymousClass3Z1;
import X.C002001d;
import X.C004302a;
import X.C018609s;
import X.C02590Cr;
import X.C02600Cs;
import X.C03930Ii;
import X.C05900Qy;
import X.C06170Sb;
import X.C26621Lq;
import X.C48672Ng;
import X.C53392d8;
import X.C53492dM;
import X.C58762mT;
import X.C63692wr;
import X.C63702ws;
import X.C63712wt;
import X.C63742ww;
import X.C63792x1;
import X.View$OnFocusChangeListenerC63492wV;
import X.ViewTreeObserver$OnGlobalLayoutListenerC63662wo;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextSwitcher;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape2S0200000_I1_1;
import com.facebook.redex.ViewOnClickEBaseShape8S0100000_I1_6;
import com.google.android.material.tabs.TabLayout;
import com.google.android.search.verification.client.R;
import com.whatsapp.KeyboardPopupLayout;
import com.whatsapp.MentionableEntry;
import com.whatsapp.WaEditText;
import com.whatsapp.components.button.ThumbnailButton;
import com.whatsapp.emoji.search.EmojiSearchContainer;
import com.whatsapp.numberkeyboard.NumberEntryKeyboard;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class PaymentView extends KeyboardPopupLayout implements View.OnClickListener, AbstractC24981Dz {
    public int A00;
    public AutoTransition A01;
    public View A02;
    public ImageView A03;
    public LinearLayout A04;
    public LinearLayout A05;
    public LinearLayout A06;
    public LinearLayout A07;
    public TextSwitcher A08;
    public TextSwitcher A09;
    public TextView A0A;
    public TextView A0B;
    public TextView A0C;
    public TextView A0D;
    public TextView A0E;
    public TabLayout A0F;
    public KeyboardPopupLayout A0G;
    public ThumbnailButton A0H;
    public ThumbnailButton A0I;
    public AnonymousClass0YX A0J;
    public AbstractC05890Qx A0K;
    public AnonymousClass02N A0L;
    public AbstractC63522wY A0M;
    public PaymentAmountInputField A0N;
    public AnonymousClass3IN A0O;
    public AbstractC63672wp A0P;
    public AbstractC63682wq A0Q;
    public AbstractC63782x0 A0R;
    public C63792x1 A0S;
    public String A0T;
    public String A0U;
    public String A0V;
    public String A0W;
    public String A0X;
    public String A0Y;
    public String A0Z;
    public List A0a;
    public boolean A0b;
    public final AnonymousClass02M A0c = AnonymousClass02M.A00();
    public final AnonymousClass0HJ A0d = AnonymousClass0HJ.A02();
    public final AnonymousClass0L2 A0e = AnonymousClass0L2.A01();
    public final AnonymousClass03P A0f = AnonymousClass03P.A00();
    public final AnonymousClass00D A0g = AnonymousClass00D.A00();
    public final AnonymousClass01X A0h = AnonymousClass01X.A00();
    public final C018609s A0i = C018609s.A04();
    public final C02600Cs A0j = C02600Cs.A00();
    public final C02590Cr A0k = C02590Cr.A00();
    public final C03930Ii A0l = C03930Ii.A00();
    public final C53492dM A0m = C53492dM.A00();
    public final AnonymousClass0Eg A0n = AnonymousClass0Eg.A00();
    public final AnonymousClass022 A0o = AnonymousClass022.A00();
    public final C06170Sb A0p = C06170Sb.A00();

    public PaymentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater from = LayoutInflater.from(getContext());
        View inflate = from.inflate(R.layout.payment_view, (ViewGroup) this, true);
        this.A0B = (TextView) from.inflate(R.layout.payment_currency_symbol, (ViewGroup) null);
        this.A09 = (TextSwitcher) AnonymousClass0Q7.A0D(inflate, R.id.contact_name);
        this.A0A = (TextView) AnonymousClass0Q7.A0D(inflate, R.id.contact_aux_info);
        this.A0I = (ThumbnailButton) AnonymousClass0Q7.A0D(inflate, R.id.contact_photo);
        this.A0H = (ThumbnailButton) AnonymousClass0Q7.A0D(inflate, R.id.bank_logo);
        this.A03 = (ImageView) AnonymousClass0Q7.A0D(inflate, R.id.expand_details_button);
        this.A08 = (TextSwitcher) AnonymousClass0Q7.A0D(inflate, R.id.payment_contact_label);
        this.A05 = (LinearLayout) AnonymousClass0Q7.A0D(inflate, R.id.payment_method_container);
        this.A0D = (TextView) AnonymousClass0Q7.A0D(inflate, R.id.payment_method_details);
        this.A0N = (PaymentAmountInputField) AnonymousClass0Q7.A0D(inflate, R.id.send_payment_amount);
        this.A0E = (TextView) AnonymousClass0Q7.A0D(inflate, R.id.bank_account_name);
        this.A0C = (TextView) AnonymousClass0Q7.A0D(inflate, R.id.payments_send_payment_error_text);
        this.A0G = (KeyboardPopupLayout) AnonymousClass0Q7.A0D(inflate, R.id.send_payment_keyboard_popup_layout);
        LinearLayout linearLayout = (LinearLayout) AnonymousClass0Q7.A0D(inflate, R.id.send_payment_amount_error_text_container);
        this.A07 = linearLayout;
        linearLayout.setOnClickListener(this);
        this.A06 = (LinearLayout) AnonymousClass0Q7.A0D(inflate, R.id.send_payment_amount_container);
        this.A04 = (LinearLayout) AnonymousClass0Q7.A0D(inflate, R.id.payment_contact_container);
        this.A0F = (TabLayout) AnonymousClass0Q7.A0D(inflate, R.id.payment_tabs);
        C002001d.A2m(this.A03, C004302a.A00(getContext(), R.color.settings_icon));
        this.A0J = this.A0e.A03(getContext());
        this.A0G.setKeyboardPopupBackgroundColor(C004302a.A00(getContext(), R.color.emoji_popup_body));
        if (Build.VERSION.SDK_INT >= 19) {
            AutoTransition autoTransition = new AutoTransition();
            this.A01 = autoTransition;
            autoTransition.setDuration(100L);
        }
    }

    public void A00() {
        if (this.A00 == 1) {
            this.A08.setVisibility(0);
            this.A08.setText(this.A0h.A06(R.string.payments_request_payment_from));
            this.A0D.setVisibility(8);
            this.A03.setVisibility(8);
            if (this.A0b) {
                this.A09.setText(this.A0T);
            }
            if (this.A0Q.ABY()) {
                this.A0A.setText(this.A0Q.A8A());
                this.A0A.setVisibility(0);
                this.A09.setPadding(0, getResources().getDimensionPixelSize(R.dimen.payment_detail_text_extra_padding_top_with_payment_id), 0, 0);
            } else {
                this.A09.setPadding(0, getResources().getDimensionPixelSize(R.dimen.payment_detail_text_extra_padding_top_without_payment_id), 0, 0);
            }
            AnonymousClass3IN r1 = this.A0O;
            if (r1 != null) {
                r1.A05.A2F(2);
            }
            this.A0N.A03 = 1;
        } else {
            this.A08.setVisibility(8);
            TextSwitcher textSwitcher = this.A08;
            AnonymousClass01X r8 = this.A0h;
            textSwitcher.setText(r8.A06(R.string.payments_send_payment_to));
            this.A0A.setVisibility(8);
            if (this.A0b) {
                this.A09.setText(r8.A0D(R.string.payments_send_payment_contact_description, this.A0T));
                this.A09.setPadding(getResources().getDimensionPixelSize(R.dimen.payment_collapsed_detail_text_extra_padding_left), getResources().getDimensionPixelSize(R.dimen.payment_detail_text_extra_padding_top_without_payment_id), 0, 0);
                this.A03.setRotation(90.0f);
                this.A03.setVisibility(0);
                this.A0D.setVisibility(0);
                this.A0D.setText(r8.A0D(R.string.payments_send_payment_method_description, this.A0V));
            } else {
                A03(true);
            }
            AnonymousClass3IN r0 = this.A0O;
            if (r0 != null) {
                r0.A05.A2F(1);
            }
            this.A0N.A03 = 0;
        }
        this.A05.setVisibility(8);
        if (this.A0O == null) {
            return;
        }
        if (this.A0Q.ABY()) {
            this.A0O.A01.setVisibility(8);
            return;
        }
        this.A0O.A01.setVisibility(0);
        C63792x1 r13 = this.A0S;
        AnonymousClass3IN r02 = this.A0O;
        MentionableEntry mentionableEntry = r02.A03;
        ImageButton imageButton = r02.A02;
        EmojiSearchContainer emojiSearchContainer = r02.A04;
        if (r13 != null) {
            AnonymousClass3Z1 r16 = new AnonymousClass3Z1(r13.A00, r13.A09, r13.A0B, r13.A06, r13.A05, r13.A07, r13.A02, r13.A04, r13.A08, r13.A03, r13.A0A, r13.A01, imageButton, mentionableEntry, emojiSearchContainer);
            AnonymousClass3IR r6 = new AnonymousClass3IR(mentionableEntry);
            C48672Ng r14 = new C48672Ng(emojiSearchContainer, r16, r13.A00, r13.A06, r13.A07, r13.A04, r13.A0A);
            r14.A00 = new AnonymousClass3IQ(r6);
            ((C53392d8) r16).A05 = r6;
            C26621Lq r12 = ((C53392d8) r16).A06;
            if (r12 != null) {
                r12.A0B = r16.A0F;
            }
            r16.A0B = new RunnableEBaseShape8S0200000_I1_3(r13, r14, 48);
            r13.A0C.put(0, r16);
            return;
        }
        throw null;
    }

    public final void A01() {
        if (Build.VERSION.SDK_INT >= 19) {
            TransitionManager.beginDelayedTransition((ViewGroup) findViewById(R.id.send_payment_details), this.A01);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v3, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    public final void A02(AnonymousClass082 r30) {
        AnonymousClass3IN r0;
        int ordinal = r30.ordinal();
        if (ordinal == 0) {
            AbstractC63522wY r02 = this.A0M;
            if (r02 != null) {
                C63742ww r13 = (C63742ww) r02.AMC();
                AbstractC63682wq r1 = r13.A04;
                this.A0Q = r1;
                AbstractC63672wp r12 = r13.A03;
                this.A0P = r12;
                this.A0L = r13.A00;
                C63692wr r11 = r13.A05;
                C63702ws r10 = r11.A03;
                this.A0K = r10.A00;
                C63712wt r9 = r13.A06;
                this.A0a = r9.A01;
                this.A0W = r13.A08;
                this.A0X = r11.A07;
                this.A0Z = r13.A09;
                this.A0b = r13.A0A;
                this.A0O = r13.A02;
                AbstractC63782x0 r8 = r11.A04;
                this.A0R = r8;
                r1.A4g().setRequestedOrientation(1);
                this.A04.setOnClickListener(this);
                AnonymousClass0Eg r03 = this.A0n;
                C06170Sb r04 = this.A0p;
                C02590Cr r05 = this.A0k;
                C02600Cs r15 = this.A0j;
                C03930Ii r6 = this.A0l;
                AnonymousClass03P r06 = this.A0f;
                AnonymousClass01X r5 = this.A0h;
                this.A0S = new C63792x1(r03, r04, r05, r15, r6, r06, r5, this.A0m, this.A0g, this.A0o, this.A0Q.A4g(), this.A0G);
                if (this.A0b) {
                    this.A03.setOnClickListener(this);
                    this.A05.setOnClickListener(this);
                } else {
                    this.A03.setVisibility(8);
                    this.A05.setVisibility(8);
                    this.A0D.setVisibility(8);
                }
                AnonymousClass3IN r2 = this.A0O;
                if (r2 != null) {
                    ViewStub viewStub = (ViewStub) findViewById(R.id.payment_note_entry_stub);
                    if (viewStub != null) {
                        r2.AAV(viewStub);
                    } else {
                        r2.ALk(findViewById(R.id.payment_note_entry_inflated));
                    }
                    MentionableEntry mentionableEntry = r2.A03;
                    ViewGroup viewGroup = (ViewGroup) findViewById(R.id.mention_attach);
                    AnonymousClass02N r14 = this.A0L;
                    if (AnonymousClass1VY.A0Y(r14)) {
                        mentionableEntry.A0B(viewGroup, AnonymousClass02U.A02(r14), false, true);
                    }
                    String str = this.A0W;
                    if (str != null) {
                        mentionableEntry.setMentionableText(str, this.A0a);
                    }
                    r2.A00 = new View$OnFocusChangeListenerC63492wV(this, mentionableEntry);
                    r2.A05.A00 = new ViewOnClickEBaseShape8S0100000_I1_6(this, 4);
                }
                Context context = getContext();
                TabLayout tabLayout = this.A0F;
                int i = r13.A07.A00;
                if (i != 0) {
                    tabLayout.A06();
                    AnonymousClass1E4 A032 = tabLayout.A03();
                    A032.A01(r5.A06(R.string.payments_send_money_tab));
                    ArrayList arrayList = tabLayout.A0d;
                    tabLayout.A0E(A032, arrayList.isEmpty());
                    AnonymousClass1E4 A033 = tabLayout.A03();
                    A033.A01(r5.A06(R.string.payments_request_money_tab));
                    tabLayout.A0E(A033, arrayList.isEmpty());
                    ArrayList arrayList2 = tabLayout.A0c;
                    if (!arrayList2.contains(this)) {
                        arrayList2.add(this);
                    }
                    AnonymousClass0S2 A092 = ((ActivityC004802g) context).A09();
                    if (i == 1) {
                        this.A0G.removeView(tabLayout);
                        if (Build.VERSION.SDK_INT >= 21) {
                            tabLayout.setElevation(0.0f);
                        }
                        if (A092 != null) {
                            A092.A0D(false);
                            A092.A0B(true);
                            A092.A0A(true);
                            A092.A06(tabLayout, new AnonymousClass0S5(-1, -1));
                        }
                    } else if (A092 != null) {
                        A092.A02(0.0f);
                    }
                    tabLayout.setVisibility(0);
                    AnonymousClass1E4 A042 = tabLayout.A04(this.A00);
                    if (A042 != null) {
                        A042.A00();
                    } else {
                        throw null;
                    }
                }
                if (this.A0Q.ABP()) {
                    ArrayList arrayList3 = new ArrayList();
                    AnonymousClass3IN r07 = this.A0O;
                    if (r07 != null) {
                        arrayList3.add(r07.A03);
                    }
                    C63792x1 r16 = this.A0S;
                    AnonymousClass2WC r08 = r9.A00;
                    PaymentAmountInputField paymentAmountInputField = this.A0N;
                    if (r16 != null) {
                        r16.A0C.put(1, new C58762mT(r16.A00, r16.A0B, r16.A02, r16.A03, r16.A01, paymentAmountInputField, arrayList3, r08));
                    } else {
                        throw null;
                    }
                } else {
                    this.A0S.A00();
                    this.A0N.setFocusable(false);
                }
                PaymentAmountInputField paymentAmountInputField2 = this.A0N;
                paymentAmountInputField2.setSelection(0);
                paymentAmountInputField2.setLongClickable(false);
                paymentAmountInputField2.setErrorTextView((TextView) findViewById(R.id.payments_send_payment_error_text));
                AnonymousClass0N2.A1K(paymentAmountInputField2, R.style.SendPaymentAmountInput);
                paymentAmountInputField2.A0D = new AnonymousClass3II(r12);
                paymentAmountInputField2.setAutoScaleTextSize(r11.A09);
                boolean z = r11.A0B;
                paymentAmountInputField2.A0K = z;
                paymentAmountInputField2.setAllowDecimal(r11.A08);
                paymentAmountInputField2.A0E = r8;
                int i2 = 0;
                if (this.A0K.A9H(r5) == 2) {
                    i2 = 1;
                }
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                TextView textView = this.A0B;
                int i3 = R.style.SendPaymentCurrencySymbolBeforeAmount;
                if (i2 != 0) {
                    i3 = R.style.SendPaymentCurrencySymbolAfterAmount;
                }
                AnonymousClass0N2.A1K(textView, i3);
                View findViewById = this.A06.findViewById(R.id.payment_currency_symbol);
                if (findViewById != null) {
                    this.A06.removeView(findViewById);
                }
                this.A06.addView(this.A0B, i2, layoutParams);
                paymentAmountInputField2.A08 = this.A0B;
                paymentAmountInputField2.A0J = i2 ^ 1;
                setAmountInputData(r10);
                if (TextUtils.isEmpty(this.A0U)) {
                    if (!TextUtils.isEmpty(this.A0Y)) {
                        this.A0U = this.A0Y;
                    } else {
                        String str2 = r11.A05;
                        if (!TextUtils.isEmpty(str2)) {
                            this.A0U = str2;
                        } else {
                            String str3 = r11.A06;
                            if (!TextUtils.isEmpty(str3)) {
                                this.A0U = str3;
                            } else {
                                this.A0U = "0";
                            }
                        }
                    }
                }
                if (!TextUtils.isEmpty(this.A0U)) {
                    String str4 = this.A0U;
                    if (!"0".equals(str4)) {
                        if (r11.A0A) {
                            if (z) {
                                str4 = str4.replaceAll(PaymentAmountInputField.A00(r5), "");
                            }
                            C05900Qy A002 = C05900Qy.A00(str4, this.A0K.A5z());
                            if (A002 != null) {
                                this.A0U = this.A0K.A4P(r5, A002);
                            }
                        }
                        String obj = paymentAmountInputField2.getText().toString();
                        String str5 = this.A0U;
                        if (!obj.equals(str5)) {
                            paymentAmountInputField2.setText(str5);
                        }
                        if (!this.A0Q.ABP()) {
                            this.A0S.A00();
                            paymentAmountInputField2.setOnClickListener(new ViewOnClickEBaseShape2S0200000_I1_1(this, r11, 23));
                        }
                    }
                }
                paymentAmountInputField2.setHint(this.A0U);
                if (r11.A06 != null || r11.A05 == null || !this.A0Q.ABY()) {
                    View view = this.A02;
                    if (view == null || view.getId() == -1 || findViewById(this.A02.getId()) == null) {
                        this.A0N.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC63662wo(this));
                    } else {
                        this.A0S.A00();
                        findViewById(this.A02.getId()).requestFocus();
                        View view2 = this.A02;
                        if (view2 instanceof WaEditText) {
                            ((WaEditText) view2).A01(true);
                        } else if (view2.onCheckIsTextEditor()) {
                            InputMethodManager A0H2 = r06.A0H();
                            if (A0H2 != null) {
                                A0H2.showSoftInput(this.A02, 0);
                            } else {
                                throw null;
                            }
                        }
                    }
                } else {
                    this.A0Q.A4g().getWindow().setSoftInputMode(3);
                }
                if (!this.A0N.hasOnClickListeners()) {
                    this.A0N.setOnClickListener(new ViewOnClickEBaseShape8S0100000_I1_6(this, 3));
                }
                View A9k = ((AbstractC63732wv) r13.A01.AMC()).A9k(getContext());
                if (A9k != null) {
                    ((ViewGroup) AnonymousClass0Q7.A0D(this, R.id.branding_container)).addView(A9k);
                }
                A00();
            }
        } else if (ordinal == 5) {
            C63792x1 r3 = this.A0S;
            Iterator it = r3.A0C.entrySet().iterator();
            while (it.hasNext()) {
                PopupWindow popupWindow = (PopupWindow) r3.A0C.get(((Map.Entry) it.next()).getKey());
                if (popupWindow != null && popupWindow.isShowing()) {
                    popupWindow.dismiss();
                }
                it.remove();
            }
        } else if (ordinal == 2) {
            C63792x1 r09 = this.A0S;
            AnonymousClass01X r32 = this.A0h;
            AnonymousClass2WC A003 = NumberEntryKeyboard.A00(r32);
            HashMap hashMap = r09.A0C;
            if (hashMap.containsKey(1)) {
                AnonymousClass1MI r17 = (AnonymousClass1MI) hashMap.get(1);
                if (r17 instanceof C58762mT) {
                    ((C58762mT) r17).A01.setCustomKey(A003);
                }
            }
            if (this.A0N != null && !r32.A0I().equals(this.A0N.A0B.A0I())) {
                PaymentAmountInputField paymentAmountInputField3 = this.A0N;
                paymentAmountInputField3.A0B = r32;
                paymentAmountInputField3.setText((CharSequence) null);
            }
        } else if (ordinal == 3 && (r0 = this.A0O) != null && r0.A03.hasFocus()) {
            this.A0S.A00();
        }
    }

    public void A03(boolean z) {
        if (z) {
            if (this.A0b) {
                this.A03.setRotation(270.0f);
                this.A05.setVisibility(0);
                this.A09.setText(this.A0T);
            }
            this.A08.setVisibility(0);
            this.A0D.setText("");
            this.A0D.setVisibility(8);
            if (this.A0Q.ABY()) {
                this.A0A.setVisibility(0);
                this.A09.setPadding(0, getResources().getDimensionPixelSize(R.dimen.payment_detail_text_extra_padding_top_with_payment_id), 0, 0);
                return;
            }
            this.A09.setPadding(0, getResources().getDimensionPixelSize(R.dimen.payment_detail_text_extra_padding_top_without_payment_id), 0, 0);
            return;
        }
        this.A03.setRotation(90.0f);
        this.A05.setVisibility(8);
        this.A08.setVisibility(8);
        if (this.A0b) {
            this.A0D.setVisibility(0);
            TextView textView = this.A0D;
            AnonymousClass01X r7 = this.A0h;
            textView.setText(r7.A0D(R.string.payments_send_payment_method_description, this.A0V));
            this.A09.setText(r7.A0D(R.string.payments_send_payment_contact_description, this.A0T));
            this.A09.setPadding(getResources().getDimensionPixelSize(R.dimen.payment_collapsed_detail_text_extra_padding_left), getResources().getDimensionPixelSize(R.dimen.payment_detail_text_extra_padding_top_without_payment_id), 0, 0);
        }
        this.A0A.setVisibility(8);
    }

    public boolean A04() {
        C63792x1 r4 = this.A0S;
        for (Map.Entry entry : r4.A0C.entrySet()) {
            PopupWindow popupWindow = (PopupWindow) r4.A0C.get(entry.getKey());
            if (popupWindow.isShowing()) {
                popupWindow.dismiss();
                int intValue = ((Number) entry.getKey()).intValue();
                if (intValue == 0) {
                    this.A0S.A01();
                    return true;
                } else if (intValue == 1) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }

    @Override // X.AbstractC24981Dz
    public void AKu(AnonymousClass1E4 r2) {
        A01();
        this.A00 = r2.A00;
        A00();
    }

    public List getMentionedJids() {
        AnonymousClass3IN r0 = this.A0O;
        if (r0 != null) {
            return r0.A03.getMentions();
        }
        return new ArrayList();
    }

    public C05900Qy getPaymentAmount() {
        BigDecimal A4V;
        String paymentAmountString = getPaymentAmountString();
        if (TextUtils.isEmpty(paymentAmountString) || (A4V = this.A0K.A4V(this.A0h, paymentAmountString)) == null) {
            return null;
        }
        return new C05900Qy(A4V, this.A0K.A5z());
    }

    public String getPaymentAmountString() {
        Editable text = this.A0N.getText();
        if (text != null) {
            return text.toString();
        }
        return null;
    }

    public String getPaymentNote() {
        AnonymousClass3IN r0 = this.A0O;
        return r0 != null ? r0.A03.getStringText() : "";
    }

    public void onClick(View view) {
        boolean z = false;
        if (view.getId() == R.id.expand_details_button) {
            A01();
            if (this.A05.getVisibility() != 0) {
                z = true;
            }
            A03(z);
        } else if (view.getId() == R.id.payment_method_container) {
            this.A0P.AIM();
        } else if (view.getId() == R.id.payment_contact_container) {
            if (this.A00 == 1 || this.A05.getVisibility() == 0 || !this.A0b) {
                this.A0P.AIL();
                return;
            }
            A01();
            A03(true);
        } else if (view.getId() == R.id.send_payment_amount || view.getId() == R.id.send_payment_note) {
            A01();
            if (this.A05.getVisibility() == 0) {
                A03(false);
            }
            this.A0S.A00();
        } else if (view.getId() == R.id.send_payment_amount_error_text_container) {
            this.A0N.callOnClick();
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A0J.A00();
    }

    public void setAmountInputData(C63702ws r4) {
        AbstractC05890Qx r2 = r4.A00;
        this.A0K = r2;
        this.A0N.A0C = r2;
        this.A0B.setText(r2.A5i(this.A0h));
    }

    public void setBankLogo(Bitmap bitmap) {
        if (bitmap != null) {
            this.A0H.setImageBitmap(bitmap);
        } else {
            this.A0H.setImageResource(R.drawable.bank_logo_placeholder);
        }
    }

    public void setPaymentAmount(String str) {
        this.A0U = str;
    }

    public void setPaymentContactContainerVisibility(int i) {
        this.A04.setVisibility(i);
    }

    public void setPaymentMethodText(String str) {
        this.A0V = str;
        this.A0E.setText(str);
    }
}

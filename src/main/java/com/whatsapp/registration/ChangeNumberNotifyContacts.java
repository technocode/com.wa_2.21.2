package com.whatsapp.registration;

import X.ActivityC004602e;
import X.AnonymousClass008;
import X.AnonymousClass01A;
import X.AnonymousClass01X;
import X.AnonymousClass02N;
import X.AnonymousClass03S;
import X.AnonymousClass0GG;
import X.AnonymousClass0S2;
import X.AnonymousClass1VY;
import X.AnonymousClass2C0;
import X.AnonymousClass306;
import X.AnonymousClass307;
import X.AnonymousClass325;
import X.AnonymousClass3ZF;
import X.C004302a;
import X.C006903j;
import X.C007003k;
import X.C05720Pu;
import X.C65002z9;
import X.ViewTreeObserver$OnScrollChangedListenerC65522zz;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.RadioButton;
import android.widget.ScrollView;
import android.widget.Switch;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape8S0100000_I1_6;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ChangeNumberNotifyContacts extends ActivityC004602e {
    public int A00;
    public int A01;
    public View A02;
    public View A03;
    public View A04;
    public RadioButton A05;
    public RadioButton A06;
    public RadioButton A07;
    public ScrollView A08;
    public Switch A09;
    public TextEmojiLabel A0A;
    public List A0B;
    public final AnonymousClass0GG A0C = AnonymousClass0GG.A00();
    public final AnonymousClass01A A0D = AnonymousClass01A.A00();
    public final AnonymousClass03S A0E = AnonymousClass03S.A00();
    public final C006903j A0F = C006903j.A00();
    public final AnonymousClass325 A0G = AnonymousClass325.A00();

    public final void A0T() {
        if (this.A08.canScrollVertically(1)) {
            this.A02.setElevation((float) this.A00);
        } else {
            this.A02.setElevation(0.0f);
        }
    }

    public final void A0U() {
        this.A01 = 2;
        this.A03.setVisibility(0);
        this.A0B.clear();
        List list = this.A0B;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        A0W(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AnonymousClass02N r1 = (AnonymousClass02N) ((C007003k) it.next()).A02(UserJid.class);
            if (r1 != null && this.A0F.A0C(r1)) {
                hashSet.add(r1);
            }
        }
        list.addAll(hashSet);
    }

    public final void A0V() {
        boolean z = false;
        boolean z2 = true;
        if (this.A01 == 0) {
            this.A09.setChecked(false);
            this.A0A.setText(((AnonymousClass2C0) this).A01.A06(R.string.change_number_notify_none));
            this.A03.setVisibility(8);
            this.A06.setChecked(true);
            return;
        }
        this.A09.setChecked(true);
        int size = this.A0B.size();
        Spanned fromHtml = Html.fromHtml(((AnonymousClass2C0) this).A01.A0A(R.plurals.change_number_n_contacts, (long) size, Integer.valueOf(size)));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(fromHtml);
        URLSpan[] uRLSpanArr = (URLSpan[]) fromHtml.getSpans(0, fromHtml.length(), URLSpan.class);
        if (uRLSpanArr != null) {
            for (URLSpan uRLSpan : uRLSpanArr) {
                if ("contacts-link".equals(uRLSpan.getURL())) {
                    int spanStart = spannableStringBuilder.getSpanStart(uRLSpan);
                    int spanEnd = spannableStringBuilder.getSpanEnd(uRLSpan);
                    int spanFlags = spannableStringBuilder.getSpanFlags(uRLSpan);
                    spannableStringBuilder.removeSpan(uRLSpan);
                    spannableStringBuilder.setSpan(new AnonymousClass3ZF(this, this), spanStart, spanEnd, spanFlags);
                }
            }
        }
        AnonymousClass008.A0d(this.A0A);
        TextEmojiLabel textEmojiLabel = this.A0A;
        textEmojiLabel.setAccessibilityHelper(new C05720Pu(textEmojiLabel));
        this.A0A.setText(spannableStringBuilder);
        this.A03.setVisibility(0);
        RadioButton radioButton = this.A05;
        if (this.A01 != 1) {
            z2 = false;
        }
        radioButton.setChecked(z2);
        RadioButton radioButton2 = this.A06;
        boolean z3 = false;
        if (this.A01 == 2) {
            z3 = true;
        }
        radioButton2.setChecked(z3);
        RadioButton radioButton3 = this.A07;
        if (this.A01 == 3) {
            z = true;
        }
        radioButton3.setChecked(z);
    }

    public final void A0W(ArrayList arrayList) {
        this.A0D.A04.A0S(arrayList, 1, false, true);
        Set A022 = this.A0C.A02();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((AbstractCollection) A022).contains(((C007003k) it.next()).A02(UserJid.class))) {
                it.remove();
            }
        }
    }

    public void A0X(List list) {
        ArrayList arrayList = new ArrayList();
        A0W(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Jid A022 = ((C007003k) it.next()).A02(UserJid.class);
            if (A022 != null) {
                list.add(A022);
            }
        }
    }

    public /* synthetic */ void lambda$onCreate$2388$ChangeNumberNotifyContacts(View view) {
        Log.i("changenumbernotifycontacts/done");
        Intent intent = new Intent();
        intent.putStringArrayListExtra("selectedJids", AnonymousClass1VY.A0F(this.A0B));
        setResult(-1, intent);
        finish();
    }

    public /* synthetic */ void lambda$onCreate$2390$ChangeNumberNotifyContacts(View view) {
        this.A09.toggle();
    }

    @Override // X.ActivityC004902h
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 150) {
            if (i2 != -1) {
                Log.i("listmembersselector/permissions denied");
                this.A09.setChecked(false);
                return;
            }
            A0U();
            A0V();
        } else if (i == 1) {
            if (i2 == -1) {
                this.A0B = AnonymousClass1VY.A0G(UserJid.class, intent.getStringArrayListExtra("jids"));
                this.A01 = 3;
            }
            A0V();
        } else {
            super.onActivityResult(i, i2, intent);
        }
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (Build.VERSION.SDK_INT >= 21) {
            this.A08.getViewTreeObserver().addOnPreDrawListener(new AnonymousClass307(this));
        }
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AnonymousClass01X r8 = ((AnonymousClass2C0) this).A01;
        setTitle(r8.A06(R.string.change_number_title));
        AnonymousClass0S2 A092 = A09();
        if (A092 != null) {
            A092.A0A(true);
            A092.A0B(true);
            setContentView(R.layout.change_number_notify_contacts);
            findViewById(R.id.confirm_change_btn).setOnClickListener(new ViewOnClickEBaseShape8S0100000_I1_6(this, 21));
            Intent intent = getIntent();
            StringBuilder A0S = AnonymousClass008.A0S("+");
            A0S.append(intent.getStringExtra("oldJid"));
            String A0F2 = r8.A0F(A0S.toString());
            StringBuilder A0S2 = AnonymousClass008.A0S("+");
            A0S2.append(intent.getStringExtra("newJid"));
            String A0F3 = r8.A0F(A0S2.toString());
            String A0D2 = r8.A0D(R.string.change_number_confirm_old_new, A0F2, A0F3);
            int indexOf = A0D2.indexOf(A0F2);
            int indexOf2 = A0D2.indexOf(A0F3);
            SpannableString spannableString = new SpannableString(A0D2);
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(C004302a.A00(this, R.color.settings_item_title_text));
            int length = A0F2.length() + indexOf;
            spannableString.setSpan(foregroundColorSpan, indexOf, length, 17);
            spannableString.setSpan(new TypefaceSpan("sans-serif-medium"), indexOf, length, 17);
            ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(C004302a.A00(this, R.color.settings_item_title_text));
            int length2 = A0F3.length() + indexOf2;
            spannableString.setSpan(foregroundColorSpan2, indexOf2, length2, 17);
            spannableString.setSpan(new TypefaceSpan("sans-serif-medium"), indexOf2, length2, 17);
            ((TextView) findViewById(R.id.change_number_from_to)).setText(spannableString);
            this.A08 = (ScrollView) findViewById(R.id.scroll_view);
            this.A04 = findViewById(R.id.notify_contacts_container);
            Switch r1 = (Switch) findViewById(R.id.notify_contacts_switch);
            this.A09 = r1;
            r1.setOnCheckedChangeListener(new C65002z9(this));
            this.A04.setOnClickListener(new ViewOnClickEBaseShape8S0100000_I1_6(this, 22));
            View findViewById = findViewById(R.id.change_number_radio_buttons_container);
            this.A03 = findViewById;
            this.A05 = (RadioButton) findViewById.findViewById(R.id.change_number_all_btn);
            findViewById(R.id.change_number_all).setOnClickListener(new ViewOnClickEBaseShape8S0100000_I1_6(this, 29));
            this.A06 = (RadioButton) this.A03.findViewById(R.id.change_number_chats_btn);
            findViewById(R.id.change_number_chats).setOnClickListener(new ViewOnClickEBaseShape8S0100000_I1_6(this, 29));
            this.A07 = (RadioButton) this.A03.findViewById(R.id.change_number_custom_btn);
            findViewById(R.id.change_number_custom).setOnClickListener(new ViewOnClickEBaseShape8S0100000_I1_6(this, 29));
            this.A0A = (TextEmojiLabel) findViewById(R.id.change_number_notified_amount);
            this.A02 = findViewById(R.id.bottom_button_container);
            if (bundle != null) {
                int i = bundle.getInt("mode");
                this.A01 = i;
                if (i == 3) {
                    this.A0B = AnonymousClass1VY.A0G(UserJid.class, bundle.getStringArrayList("selectedJids"));
                }
            } else {
                int intExtra = intent.getIntExtra("mode", 2);
                this.A01 = intExtra;
                if (intExtra == 3) {
                    this.A0B = AnonymousClass1VY.A0G(UserJid.class, intent.getStringArrayListExtra("preselectedJids"));
                }
            }
            if (this.A0B == null) {
                this.A0B = new ArrayList();
            }
            if (!this.A0E.A03()) {
                this.A01 = 0;
                this.A03.setVisibility(8);
                this.A0B.clear();
            } else {
                int i2 = this.A01;
                if (i2 == 1) {
                    this.A01 = 1;
                    this.A0B.clear();
                    A0X(this.A0B);
                } else if (i2 == 2) {
                    A0U();
                } else if (i2 == 3) {
                    ArrayList arrayList = new ArrayList();
                    A0X(arrayList);
                    HashSet hashSet = new HashSet(arrayList);
                    Iterator it = this.A0B.iterator();
                    while (it.hasNext()) {
                        if (!hashSet.contains(it.next())) {
                            it.remove();
                        }
                    }
                }
            }
            A0V();
            if (Build.VERSION.SDK_INT >= 21) {
                this.A00 = getResources().getDimensionPixelSize(R.dimen.settings_bottom_button_elevation);
                this.A08.getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserver$OnScrollChangedListenerC65522zz(this));
                this.A08.getViewTreeObserver().addOnPreDrawListener(new AnonymousClass307(this));
                return;
            }
            return;
        }
        throw null;
    }

    public void onRadioButtonClicked(View view) {
        int id = view.getId();
        if (id == R.id.change_number_all) {
            if (this.A01 != 1) {
                this.A01 = 1;
                this.A0B.clear();
                A0X(this.A0B);
                A0V();
            }
        } else if (id == R.id.change_number_chats) {
            if (this.A01 != 2) {
                A0U();
                A0V();
            }
        } else if (id == R.id.change_number_custom) {
            startActivityForResult(new Intent(this, NotifyContactsSelector.class), 1);
        }
    }

    public void onRestoreInstanceState(Bundle bundle) {
        boolean isChecked = this.A09.isChecked();
        super.onRestoreInstanceState(bundle);
        this.A04.getViewTreeObserver().addOnPreDrawListener(new AnonymousClass306(this, isChecked));
    }

    @Override // X.ActivityC004802g, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putStringArrayList("selectedJids", AnonymousClass1VY.A0F(this.A0B));
        bundle.putInt("mode", this.A01);
    }
}

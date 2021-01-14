package com.whatsapp.account.delete;

import X.ActivityC004602e;
import X.ActivityC004702f;
import X.AnonymousClass01X;
import X.AnonymousClass037;
import X.AnonymousClass0MB;
import X.AnonymousClass0S2;
import X.AnonymousClass1P0;
import X.AnonymousClass1P1;
import X.AnonymousClass1P8;
import X.AnonymousClass2C0;
import X.C004302a;
import X.C06470Tj;
import X.C13380k9;
import X.C41121uV;
import X.C41131uW;
import X.DialogInterface$OnClickListenerC27301Oz;
import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.facebook.redex.ViewOnClickEBaseShape3S0100000_I1_1;
import com.google.android.search.verification.client.R;
import com.whatsapp.base.WaDialogFragment;

public class DeleteAccountFeedback extends ActivityC004602e {
    public static final int[] A08 = {R.string.delete_account_reason_changed_device, R.string.delete_account_reason_change_phone_number, R.string.delete_account_reason_temporarily, R.string.delete_account_reason_missing_feature, R.string.delete_account_reason_not_working, R.string.delete_account_reason_other};
    public int A00;
    public int A01 = -1;
    public View A02;
    public EditText A03;
    public ScrollView A04;
    public C13380k9 A05;
    public DialogFragment A06;
    public boolean A07 = false;

    public class ChangeNumberMessageDialogFragment extends WaDialogFragment {
        public final AnonymousClass01X A00 = AnonymousClass01X.A00();

        @Override // androidx.fragment.app.DialogFragment
        public Dialog A0p(Bundle bundle) {
            int i = ((AnonymousClass037) this).A06.getInt("deleteReason", -1);
            String string = ((AnonymousClass037) this).A06.getString("additionalComments");
            AnonymousClass0MB r3 = new AnonymousClass0MB(A0A());
            AnonymousClass01X r6 = this.A00;
            r3.A01.A0E = r6.A0D(R.string.delete_account_change_number_dialog_prompt, r6.A06(R.string.settings_change_number));
            r3.A07(r6.A06(R.string.settings_change_number), new DialogInterface$OnClickListenerC27301Oz(this));
            r3.A05(r6.A06(R.string.settings_delete_account_short), new AnonymousClass1P0(this, i, string));
            return r3.A00();
        }
    }

    public final void A0T() {
        if (this.A04.canScrollVertically(1)) {
            this.A02.setElevation((float) this.A00);
        } else {
            this.A02.setElevation(0.0f);
        }
    }

    public /* synthetic */ void lambda$onCreate$1517$DeleteAccountFeedback(View view) {
        this.A03.clearFocus();
        if (getCurrentFocus() != null) {
            ((ActivityC004602e) this).A0H.A02(getCurrentFocus());
        }
        this.A07 = true;
        this.A05.A00();
    }

    public void lambda$onCreate$1518$DeleteAccountFeedback(View view) {
        if (this.A03.getText().length() <= 0 || this.A03.getText().length() >= 5) {
            int i = this.A01;
            if (i == 1) {
                String obj = this.A03.getText().toString();
                ChangeNumberMessageDialogFragment changeNumberMessageDialogFragment = new ChangeNumberMessageDialogFragment();
                Bundle bundle = new Bundle();
                bundle.putInt("deleteReason", i);
                bundle.putString("additionalComments", obj);
                changeNumberMessageDialogFragment.A0N(bundle);
                this.A06 = changeNumberMessageDialogFragment;
                changeNumberMessageDialogFragment.A0u(A04(), null);
                return;
            }
            Intent intent = new Intent(this, DeleteAccountConfirmation.class);
            intent.putExtra("deleteReason", this.A01);
            intent.putExtra("additionalComments", this.A03.getText().toString());
            startActivity(intent);
            return;
        }
        ((ActivityC004702f) this).A0F.A0C(((AnonymousClass2C0) this).A01.A06(R.string.describe_problem_description_further), 0);
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (Build.VERSION.SDK_INT >= 21) {
            this.A04.getViewTreeObserver().addOnPreDrawListener(new AnonymousClass1P8(this));
        }
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AnonymousClass01X r6 = ((AnonymousClass2C0) this).A01;
        setTitle(r6.A06(R.string.settings_delete_account));
        AnonymousClass0S2 A09 = A09();
        if (A09 != null) {
            A09.A0A(true);
        }
        setContentView(R.layout.delete_account_feedback);
        this.A04 = (ScrollView) findViewById(R.id.scroll_view);
        this.A03 = (EditText) findViewById(R.id.delete_reason_additional_comments_edittext);
        this.A02 = findViewById(R.id.bottom_button_container);
        TextView textView = (TextView) findViewById(R.id.select_delete_reason);
        textView.setBackgroundDrawable(new C06470Tj(r6, C004302a.A03(this, R.drawable.abc_spinner_textfield_background_material)));
        this.A00 = getResources().getDimensionPixelSize(R.dimen.settings_bottom_button_elevation);
        if (bundle != null) {
            this.A01 = bundle.getInt("delete_reason_selected", -1);
            this.A07 = bundle.getBoolean("delete_reason_showing", false);
            EditText editText = this.A03;
            int i = this.A01;
            int i2 = R.string.delete_account_additional_comments_hint;
            if (i == 2) {
                i2 = R.string.delete_account_additional_comments_temporarily;
            }
            editText.setHint(r6.A06(i2));
        }
        int i3 = this.A01;
        int[] iArr = A08;
        int length = iArr.length;
        if (i3 >= length || i3 < 0) {
            textView.setText("");
        } else {
            textView.setText(r6.A06(iArr[i3]));
        }
        this.A05 = new C13380k9(this, findViewById(R.id.delete_reason_prompt), 0, R.attr.popupMenuStyle);
        for (int i4 = 0; i4 < length; i4++) {
            this.A05.A02.add(0, i4, 0, r6.A06(iArr[i4]));
        }
        C13380k9 r1 = this.A05;
        r1.A00 = new C41121uV(this);
        r1.A01 = new C41131uW(this, textView);
        textView.setOnClickListener(new ViewOnClickEBaseShape3S0100000_I1_1(this, 47));
        findViewById(R.id.delete_account_submit).setOnClickListener(new ViewOnClickEBaseShape3S0100000_I1_1(this, 46));
        ((ActivityC004702f) this).A04.post(new RunnableEBaseShape6S0100000_I1_1(this, 48));
        if (Build.VERSION.SDK_INT >= 21) {
            this.A00 = getResources().getDimensionPixelSize(R.dimen.settings_bottom_button_elevation);
            this.A04.getViewTreeObserver().addOnScrollChangedListener(new AnonymousClass1P1(this));
            this.A04.getViewTreeObserver().addOnPreDrawListener(new AnonymousClass1P8(this));
        }
    }

    @Override // X.ActivityC004802g, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("delete_reason_selected", this.A01);
        bundle.putBoolean("delete_reason_showing", this.A07);
        super.onSaveInstanceState(bundle);
    }

    @Override // X.ActivityC004802g, X.ActivityC004902h
    public void onStop() {
        super.onStop();
        C13380k9 r1 = this.A05;
        if (r1 != null) {
            r1.A00 = null;
            r1.A03.A01();
        }
    }
}

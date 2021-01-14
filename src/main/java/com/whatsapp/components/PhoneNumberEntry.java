package com.whatsapp.components;

import X.AbstractC06460Ti;
import X.AbstractC46882Fk;
import X.AnonymousClass03P;
import X.AnonymousClass0CO;
import X.AnonymousClass0Q7;
import X.AnonymousClass0SE;
import X.C07990aH;
import X.C46902Fm;
import X.C51232Xw;
import X.C51242Xy;
import X.C51252Xz;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.google.android.search.verification.client.R;
import com.whatsapp.WaEditText;
import com.whatsapp.util.Log;

public class PhoneNumberEntry extends LinearLayout implements AbstractC06460Ti {
    public TextWatcher A00;
    public WaEditText A01;
    public WaEditText A02;
    public AbstractC46882Fk A03;
    public String A04;
    public final AnonymousClass0CO A05 = AnonymousClass0CO.A00();
    public final AnonymousClass03P A06 = AnonymousClass03P.A00();

    public PhoneNumberEntry(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setSaveEnabled(true);
        AnonymousClass0Q7.A0X(this, 0);
        LinearLayout.inflate(context, R.layout.phone_number_entry, this);
        this.A01 = (WaEditText) findViewById(R.id.registration_cc);
        WaEditText waEditText = (WaEditText) findViewById(R.id.registration_phone);
        this.A02 = waEditText;
        waEditText.setSaveEnabled(false);
        this.A01.setSaveEnabled(false);
        this.A01.setFilters(new InputFilter[]{new InputFilter.LengthFilter(3)});
        this.A02.setFilters(new InputFilter[]{new InputFilter.LengthFilter(17)});
        AnonymousClass0SE.A03(this.A02);
        C51232Xw r2 = new C51232Xw(this);
        WaEditText waEditText2 = this.A01;
        waEditText2.A01 = r2;
        this.A02.A01 = r2;
        waEditText2.addTextChangedListener(new C51242Xy(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C07990aH.A1e);
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(0);
        if (colorStateList != null) {
            AnonymousClass0Q7.A0a(this.A02, colorStateList);
            AnonymousClass0Q7.A0a(this.A01, colorStateList);
        }
        obtainStyledAttributes.recycle();
    }

    public void A00(String str) {
        this.A04 = str;
        TextWatcher textWatcher = this.A00;
        if (textWatcher != null) {
            this.A02.removeTextChangedListener(textWatcher);
        }
        try {
            C51252Xz r1 = new C51252Xz(this, str);
            this.A00 = r1;
            this.A02.addTextChangedListener(r1);
        } catch (NullPointerException unused) {
            Log.e("PhoneNumberEntry/formatter exception");
        }
    }

    public WaEditText getCountryCodeField() {
        return this.A01;
    }

    public WaEditText getPhoneNumberField() {
        return this.A02;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        C46902Fm r3 = (C46902Fm) parcelable;
        super.onRestoreInstanceState(r3.getSuperState());
        this.A01.setText(r3.A00);
        this.A02.setText(r3.A01);
    }

    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        Editable text = this.A01.getText();
        if (text != null) {
            String obj = text.toString();
            Editable text2 = this.A02.getText();
            if (text2 != null) {
                return new C46902Fm(onSaveInstanceState, obj, text2.toString());
            }
            throw null;
        }
        throw null;
    }

    public void setOnPhoneNumberChangeListener(AbstractC46882Fk r1) {
        this.A03 = r1;
    }
}

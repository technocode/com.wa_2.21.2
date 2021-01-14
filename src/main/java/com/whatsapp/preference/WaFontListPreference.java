package com.whatsapp.preference;

import X.AnonymousClass01X;
import X.C64042xS;
import X.DialogInterface$OnClickListenerC64032xP;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;

public class WaFontListPreference extends WaListPreference {
    public static int A02;
    public int A00;
    public final AnonymousClass01X A01 = AnonymousClass01X.A00();

    public WaFontListPreference(Context context) {
        super(context);
    }

    public WaFontListPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onDialogClosed(boolean z) {
        int i;
        super.onDialogClosed(z);
        CharSequence[] entryValues = getEntryValues();
        if (z && (i = this.A00) >= 0 && entryValues != null) {
            String charSequence = entryValues[i].toString();
            if (callChangeListener(charSequence)) {
                setValue(charSequence);
            }
        }
    }

    public void onPrepareDialogBuilder(AlertDialog.Builder builder) {
        super.onPrepareDialogBuilder(builder);
        C64042xS r2 = new C64042xS(this, getEntries(), getEntryValues());
        int findIndexOfValue = findIndexOfValue(getValue());
        this.A00 = findIndexOfValue;
        builder.setSingleChoiceItems(r2, findIndexOfValue, new DialogInterface$OnClickListenerC64032xP(this));
        builder.setPositiveButton((CharSequence) null, (DialogInterface.OnClickListener) null);
    }

    public boolean persistString(String str) {
        A02 = Integer.parseInt(str);
        return super.persistString(str);
    }
}

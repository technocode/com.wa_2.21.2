package com.whatsapp.preference;

import X.DialogInterface$OnMultiChoiceClickListenerC64052xU;
import android.app.AlertDialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class WaMultiSelectListPreference extends WaListPreference {
    public String A00;
    public boolean[] A01;

    public WaMultiSelectListPreference(Context context) {
        this(context, null);
    }

    public WaMultiSelectListPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A01 = new boolean[getEntries().length];
        this.A00 = "OV=I=XseparatorX=I=VO";
    }

    public static String A00(Iterable iterable, String str) {
        if (iterable == null) {
            return "";
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return "";
        }
        StringBuilder sb = new StringBuilder(String.valueOf(it.next()));
        while (it.hasNext()) {
            sb.append(str);
            sb.append(it.next());
        }
        return sb.toString();
    }

    public final CharSequence A01(List list) {
        if (list.isEmpty() && !TextUtils.isEmpty(null)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        CharSequence[] entries = getEntries();
        CharSequence[] entryValues = getEntryValues();
        int size = list.size();
        int length = entryValues.length;
        if (size == length && !TextUtils.isEmpty(null)) {
            return null;
        }
        int i = 0;
        for (CharSequence charSequence : entryValues) {
            if (list.contains(charSequence)) {
                arrayList.add(entries[i]);
            }
            i++;
        }
        return A00(arrayList, ", ");
    }

    public final CharSequence[] A02(CharSequence charSequence) {
        return (charSequence == null || "".equals(charSequence)) ? new CharSequence[0] : ((String) charSequence).split(this.A00);
    }

    public void onDialogClosed(boolean z) {
        ArrayList arrayList = new ArrayList();
        CharSequence[] entryValues = getEntryValues();
        if (z && entryValues != null) {
            for (int i = 0; i < entryValues.length; i++) {
                if (this.A01[i]) {
                    arrayList.add(entryValues[i]);
                }
            }
            String A002 = A00(arrayList, this.A00);
            setSummary(A01(arrayList));
            if (callChangeListener(A02(A002))) {
                setValue(A002);
            }
        }
    }

    public Object onGetDefaultValue(TypedArray typedArray, int i) {
        return typedArray.getTextArray(i);
    }

    public void onPrepareDialogBuilder(AlertDialog.Builder builder) {
        CharSequence[] entries = getEntries();
        CharSequence[] entryValues = getEntryValues();
        if (entries == null || entryValues == null || entries.length != entryValues.length) {
            throw new IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array which are both the same length");
        }
        CharSequence[] entryValues2 = getEntryValues();
        List asList = Arrays.asList(A02(getValue()));
        for (int i = 0; i < entryValues2.length; i++) {
            this.A01[i] = asList.contains(entryValues2[i]);
        }
        builder.setMultiChoiceItems(entries, this.A01, new DialogInterface$OnMultiChoiceClickListenerC64052xU(this));
    }

    public void onSetInitialValue(boolean z, Object obj) {
        Object[] objArr;
        if (obj == null) {
            objArr = new CharSequence[0];
        } else {
            objArr = (Object[]) obj;
        }
        String A002 = A00(Arrays.asList(objArr), this.A00);
        if (z) {
            A002 = getPersistedString(A002);
        }
        setSummary(A01(Arrays.asList(A02(A002))));
        if (callChangeListener(A02(A002))) {
            setValue(A002);
        }
    }
}

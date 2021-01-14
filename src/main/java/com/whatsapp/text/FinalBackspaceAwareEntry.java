package com.whatsapp.text;

import X.AbstractC463429i;
import X.C71193Ny;
import X.C72073Rk;
import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.TextView;
import com.whatsapp.search.SearchViewModel;
import java.util.List;

public class FinalBackspaceAwareEntry extends AbstractC463429i {
    public static final char A03 = "​".charAt(0);
    public TextView.BufferType A00 = TextView.BufferType.EDITABLE;
    public List A01;
    public boolean A02 = false;

    public FinalBackspaceAwareEntry(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!A00(getText())) {
            A06(getText());
        }
        addTextChangedListener(new C72073Rk(this));
    }

    public static final boolean A00(CharSequence charSequence) {
        return !TextUtils.isEmpty(charSequence) && charSequence.charAt(0) == A03;
    }

    public final int A04(int i) {
        int length;
        if (TextUtils.isEmpty(getText())) {
            length = 0;
        } else {
            length = getText().length();
        }
        return Math.max(0, Math.min(i, length));
    }

    public final Editable A05(Editable editable) {
        if (!A00(editable)) {
            return editable;
        }
        Editable newEditable = Editable.Factory.getInstance().newEditable(editable);
        newEditable.replace(0, A00(newEditable) ? 1 : 0, "", 0, 0);
        return newEditable;
    }

    public final void A06(Editable editable) {
        Editable editable2;
        this.A02 = true;
        if (editable != null) {
            editable2 = Editable.Factory.getInstance().newEditable(editable);
            editable2.replace(0, 0, "​", 0, 1);
        } else {
            editable2 = null;
        }
        setText(editable2, this.A00);
        this.A02 = false;
    }

    public /* synthetic */ void A07(String str) {
        Editable A05 = A05(getText());
        if (str != null && A05 != null && !str.equals(A05.toString())) {
            setTextWithBsPrefix(str);
            setSelection(str.length());
        }
    }

    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        SearchViewModel searchViewModel;
        List<C71193Ny> list = this.A01;
        if (list != null) {
            for (C71193Ny r2 : list) {
                if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1 && (searchViewModel = r2.A00.A0C) != null) {
                    searchViewModel.A0L(false);
                }
            }
        }
        return super.onKeyPreIme(i, keyEvent);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSelectionChanged(int r4, int r5) {
        /*
            r3 = this;
            super.onSelectionChanged(r4, r5)
            int r1 = java.lang.Math.min(r4, r5)
            int r2 = java.lang.Math.max(r4, r5)
            android.text.Editable r0 = r3.getText()
            boolean r0 = A00(r0)
            if (r1 >= r0) goto L_0x0024
            int r0 = java.lang.Math.max(r1, r0)
            int r1 = r3.A04(r0)
            int r0 = r3.A04(r2)
            r3.setSelection(r1, r0)
        L_0x0024:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.text.FinalBackspaceAwareEntry.onSelectionChanged(int, int):void");
    }

    public void setSelection(int i) {
        super.setSelection(A04(i + (A00(getText()) ? 1 : 0)));
    }

    private void setTextWithBsPrefix(String str) {
        StringBuilder sb = new StringBuilder("​");
        sb.append(str);
        setText(sb.toString());
    }
}

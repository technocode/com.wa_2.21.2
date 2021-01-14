package X;

import android.text.Editable;

/* renamed from: X.3Wb  reason: invalid class name and case insensitive filesystem */
public class C73253Wb extends C07860Zy {
    public final /* synthetic */ C73263Wc A00;

    public C73253Wb(C73263Wc r1) {
        this.A00 = r1;
    }

    @Override // X.C07860Zy
    public void afterTextChanged(Editable editable) {
        C73263Wc r3 = this.A00;
        if (r3.A0C) {
            r3.A09 = editable.toString();
        } else if (r3.A0D) {
            r3.A09 = editable.toString();
        } else if (editable.length() == 0) {
            r3.A09 = "";
        } else if (r3.A09.length() > editable.length()) {
            String str = r3.A09;
            r3.A09 = str.substring(0, str.length() - 1);
        } else {
            char charAt = editable.toString().charAt(editable.length() - 1);
            if (charAt != 9679) {
                String str2 = r3.A09;
                StringBuilder sb = new StringBuilder();
                sb.append("");
                sb.append(charAt);
                String concat = str2.concat(sb.toString());
                r3.A09 = concat;
                r3.A0A.setText(concat.replaceAll(".", "●"));
                return;
            }
            r3.A0A.setSelection(editable.length());
        }
    }
}

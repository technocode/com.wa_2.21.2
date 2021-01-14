package X;

import android.os.Handler;
import android.text.Editable;
import android.text.TextUtils;
import android.text.style.UnderlineSpan;
import com.whatsapp.TextStatusComposerActivity;

/* renamed from: X.1u2  reason: invalid class name */
public class AnonymousClass1u2 extends C07860Zy {
    public boolean A00;
    public final /* synthetic */ TextStatusComposerActivity A01;

    public AnonymousClass1u2(TextStatusComposerActivity textStatusComposerActivity) {
        this.A01 = textStatusComposerActivity;
    }

    @Override // X.C07860Zy
    public void afterTextChanged(Editable editable) {
        for (UnderlineSpan underlineSpan : (UnderlineSpan[]) editable.getSpans(0, editable.length(), UnderlineSpan.class)) {
            editable.removeSpan(underlineSpan);
        }
        TextStatusComposerActivity textStatusComposerActivity = this.A01;
        C002001d.A2U(textStatusComposerActivity, textStatusComposerActivity.A0P, textStatusComposerActivity.A0N, textStatusComposerActivity.A0a, editable, textStatusComposerActivity.A08.getPaint(), 1.1f);
        String obj = editable.toString();
        boolean z = false;
        if (TextUtils.getTrimmedLength(obj) > 0) {
            z = true;
        }
        textStatusComposerActivity.A06.setEnabled(z);
        C008805h.A16(textStatusComposerActivity.A06, z, true);
        String A012 = AnonymousClass1Y8.A01(obj);
        String str = textStatusComposerActivity.A0G;
        textStatusComposerActivity.A0G = A012;
        Handler handler = textStatusComposerActivity.A0I;
        handler.removeCallbacks(textStatusComposerActivity.A0E);
        if (A012 == null || A012.equals(textStatusComposerActivity.A0F)) {
            textStatusComposerActivity.A0W(null);
        } else {
            textStatusComposerActivity.A0F = null;
            if (!TextUtils.equals(str, A012)) {
                textStatusComposerActivity.A0W(C27261Ou.A00(A012));
                if (textStatusComposerActivity.A0A == null) {
                    if (this.A00) {
                        C27261Ou.A01(textStatusComposerActivity.A0S, ((ActivityC004702f) textStatusComposerActivity).A0F, textStatusComposerActivity.A0c, ((AnonymousClass2C0) textStatusComposerActivity).A01, A012, new C39091qw(this));
                    } else {
                        RunnableEBaseShape1S1100000_I1 runnableEBaseShape1S1100000_I1 = new RunnableEBaseShape1S1100000_I1(this, A012, 8);
                        textStatusComposerActivity.A0E = runnableEBaseShape1S1100000_I1;
                        handler.postDelayed(runnableEBaseShape1S1100000_I1, 700);
                    }
                }
            }
        }
        if (TextStatusComposerActivity.A04(editable, 0, editable.length()) < 700 || textStatusComposerActivity.A02 != 0) {
            int i = textStatusComposerActivity.A02;
            if (i != 0) {
                textStatusComposerActivity.A08.setInputType(i);
                textStatusComposerActivity.A02 = 0;
                return;
            }
            return;
        }
        int inputType = textStatusComposerActivity.A08.getInputType();
        textStatusComposerActivity.A02 = inputType;
        if (inputType != 0) {
            textStatusComposerActivity.A08.setInputType(inputType | 524288);
            textStatusComposerActivity.A08.setText(obj);
            textStatusComposerActivity.A08.setSelection(obj.length());
        }
    }
}

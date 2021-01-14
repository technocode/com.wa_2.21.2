package X;

import android.text.Editable;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.search.verification.client.R;

/* renamed from: X.0Zx  reason: invalid class name and case insensitive filesystem */
public class C07850Zx extends C07860Zy {
    public int A00;
    public Runnable A01;
    public final int A02;
    public final int A03;
    public final EditText A04;
    public final TextView A05;
    public final AnonymousClass03P A06;
    public final AnonymousClass01X A07;
    public final C02590Cr A08;
    public final AnonymousClass022 A09;
    public final boolean A0A;

    public C07850Zx(C02590Cr r7, AnonymousClass03P r8, AnonymousClass01X r9, AnonymousClass022 r10, EditText editText, TextView textView, int i, int i2, boolean z) {
        this.A08 = r7;
        this.A06 = r8;
        this.A07 = r9;
        this.A09 = r10;
        this.A04 = editText;
        this.A05 = textView;
        this.A02 = i;
        this.A03 = i2;
        this.A0A = z;
        AnonymousClass0Q7.A0d(editText, new C07770Zl(this));
        if (textView != null) {
            long j = (long) i;
            textView.setContentDescription(r9.A0A(R.plurals.text_limit_characters_remaining_description, j, Integer.valueOf(i)));
            if (i != 0 && i2 == 0) {
                textView.setText(r9.A0G().format(j));
            }
        }
    }

    public final void A00(int i) {
        TextView textView = this.A05;
        RunnableEBaseShape0S0101000_I0 runnableEBaseShape0S0101000_I0 = new RunnableEBaseShape0S0101000_I0(this, i, 6);
        this.A01 = runnableEBaseShape0S0101000_I0;
        textView.postDelayed(runnableEBaseShape0S0101000_I0, 1000);
        textView.setVisibility(0);
        AnonymousClass01X r5 = this.A07;
        long j = (long) i;
        textView.setText(r5.A0G().format(j));
        textView.setContentDescription(r5.A0A(R.plurals.text_limit_characters_remaining_description, j, Integer.valueOf(i)));
    }

    @Override // X.C07860Zy
    public void afterTextChanged(Editable editable) {
        EditText editText;
        if (this.A0A) {
            editText = this.A04;
            C002001d.A2U(editText.getContext(), this.A08, this.A06, this.A09, editable, editText.getPaint(), 1.3f);
        } else {
            editText = this.A04;
            C002001d.A2f(editable, editText.getContext(), editText.getPaint(), 1.3f, this.A08);
        }
        int i = this.A02;
        if (i > 0) {
            Runnable runnable = this.A01;
            if (runnable != null) {
                this.A05.removeCallbacks(runnable);
            }
            String obj = editable.toString();
            int A0B = C28051Sr.A0B(obj);
            TextView textView = this.A05;
            if (textView != null) {
                int i2 = i - A0B;
                int i3 = this.A03;
                if (i3 > 0) {
                    if (i2 < i3) {
                        A00(i2);
                    } else {
                        textView.setVisibility(8);
                    }
                } else if (i2 == i) {
                    textView.setVisibility(4);
                } else {
                    A00(i2);
                }
            }
            if (A0B < i || this.A00 != 0) {
                int i4 = this.A00;
                if (i4 != 0) {
                    editText.setInputType(i4);
                    this.A00 = 0;
                    return;
                }
                return;
            }
            int inputType = editText.getInputType();
            this.A00 = inputType;
            if (inputType != 0) {
                editText.setInputType(inputType | 524288);
                editText.setText(obj);
                editText.setSelection(obj.length());
            }
        }
    }
}

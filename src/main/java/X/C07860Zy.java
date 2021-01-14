package X;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import com.whatsapp.picker.search.StickerSearchDialogFragment;

/* renamed from: X.0Zy  reason: invalid class name and case insensitive filesystem */
public class C07860Zy implements TextWatcher {
    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int codePointCount;
        int codePointCount2;
        int codePointCount3;
        if (this instanceof C73253Wb) {
            C73263Wc r3 = ((C73253Wb) this).A00;
            if (r3.A0B != null && r3.A0A.getText() != null && r3.A0A.getText().length() >= r3.A00) {
                r3.A0B.AGL(r3.A01, r3.A0A.getText().toString());
            }
        } else if (this instanceof C69893Iy) {
            C69893Iy r5 = (C69893Iy) this;
            StickerSearchDialogFragment stickerSearchDialogFragment = r5.A01;
            Runnable runnable = stickerSearchDialogFragment.A09;
            if (runnable != null) {
                stickerSearchDialogFragment.A05.removeCallbacks(runnable);
            }
            View view = r5.A00;
            RunnableEBaseShape2S0300000_I1 runnableEBaseShape2S0300000_I1 = new RunnableEBaseShape2S0300000_I1(r5, charSequence, view, 37);
            stickerSearchDialogFragment.A09 = runnableEBaseShape2S0300000_I1;
            stickerSearchDialogFragment.A05.postDelayed(runnableEBaseShape2S0300000_I1, 500);
            view.setVisibility(0);
        } else if (this instanceof C69863Iv) {
            C69863Iv r4 = (C69863Iv) this;
            Runnable runnable2 = r4.A00;
            if (runnable2 != null) {
                r4.A02.A04.removeCallbacks(runnable2);
            }
            RunnableEBaseShape8S0200000_I1_3 runnableEBaseShape8S0200000_I1_3 = new RunnableEBaseShape8S0200000_I1_3(r4, charSequence, 49);
            r4.A00 = runnableEBaseShape8S0200000_I1_3;
            r4.A02.A04.postDelayed(runnableEBaseShape8S0200000_I1_3, 500);
            View view2 = r4.A01;
            int i4 = 0;
            if (TextUtils.isEmpty(charSequence)) {
                i4 = 4;
            }
            view2.setVisibility(i4);
        } else if (this instanceof C55202gA) {
            Button button = ((C55202gA) this).A00;
            boolean z = false;
            if (charSequence.length() > 0) {
                z = true;
            }
            button.setEnabled(z);
        } else if (this instanceof C54532f4) {
            C54532f4 r42 = (C54532f4) this;
            Runnable runnable3 = r42.A00;
            if (runnable3 != null) {
                r42.A02.A05.removeCallbacks(runnable3);
            }
            RunnableEBaseShape8S0200000_I1_3 runnableEBaseShape8S0200000_I1_32 = new RunnableEBaseShape8S0200000_I1_3(r42, charSequence, 9);
            r42.A00 = runnableEBaseShape8S0200000_I1_32;
            r42.A02.A05.postDelayed(runnableEBaseShape8S0200000_I1_32, 500);
            View view3 = r42.A01;
            int i5 = 0;
            if (TextUtils.isEmpty(charSequence)) {
                i5 = 4;
            }
            view3.setVisibility(i5);
        } else if (this instanceof C53482dL) {
            C53482dL r43 = (C53482dL) this;
            Runnable runnable4 = r43.A00;
            if (runnable4 != null) {
                r43.A02.A04.removeCallbacks(runnable4);
            }
            RunnableEBaseShape7S0200000_I1_2 runnableEBaseShape7S0200000_I1_2 = new RunnableEBaseShape7S0200000_I1_2(r43, charSequence, 49);
            r43.A00 = runnableEBaseShape7S0200000_I1_2;
            r43.A02.A04.postDelayed(runnableEBaseShape7S0200000_I1_2, 500);
            View view4 = r43.A01;
            int i6 = 0;
            if (TextUtils.isEmpty(charSequence)) {
                i6 = 4;
            }
            view4.setVisibility(i6);
        } else if (this instanceof C53042cJ) {
            C53042cJ r2 = (C53042cJ) this;
            Runnable runnable5 = r2.A00;
            if (runnable5 != null) {
                r2.A01.A0R.removeCallbacks(runnable5);
            }
            RunnableEBaseShape7S0200000_I1_2 runnableEBaseShape7S0200000_I1_22 = new RunnableEBaseShape7S0200000_I1_2(r2, charSequence, 45);
            r2.A00 = runnableEBaseShape7S0200000_I1_22;
            r2.A01.A0R.postDelayed(runnableEBaseShape7S0200000_I1_22, 500);
        } else if (this instanceof C51302Ye) {
            C51302Ye r32 = (C51302Ye) this;
            boolean z2 = false;
            if (i3 > i2 && ((codePointCount = Character.codePointCount(charSequence, i, i3 + i)) > 1 || (codePointCount == 1 && Character.isWhitespace(Character.codePointAt(charSequence, i))))) {
                z2 = true;
            }
            r32.A00 = z2;
        } else if (this instanceof AnonymousClass1u2) {
            AnonymousClass1u2 r33 = (AnonymousClass1u2) this;
            boolean z3 = false;
            if (i3 > i2 && ((codePointCount2 = Character.codePointCount(charSequence, i, i3 + i)) > 1 || (codePointCount2 == 1 && Character.isWhitespace(Character.codePointAt(charSequence, i))))) {
                z3 = true;
            }
            r33.A00 = z3;
        } else if (this instanceof C39941sM) {
            Button button2 = ((C39941sM) this).A00;
            boolean z4 = false;
            if (charSequence.length() > 0) {
                z4 = true;
            }
            button2.setEnabled(z4);
        } else if (this instanceof C39591rm) {
            C39591rm r34 = (C39591rm) this;
            boolean z5 = false;
            if (i3 > i2 && ((codePointCount3 = Character.codePointCount(charSequence, i, i3 + i)) > 1 || (codePointCount3 == 1 && Character.isWhitespace(Character.codePointAt(charSequence, i))))) {
                z5 = true;
            }
            r34.A00 = z5;
        }
    }
}

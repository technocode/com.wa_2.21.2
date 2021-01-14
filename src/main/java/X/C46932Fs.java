package X;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.FrameLayout;
import android.widget.TextView;

/* renamed from: X.2Fs  reason: invalid class name and case insensitive filesystem */
public class C46932Fs implements TextWatcher {
    public final /* synthetic */ TextView A00;

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C46932Fs(TextView textView) {
        this.A00 = textView;
    }

    public void afterTextChanged(Editable editable) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        int i = 5;
        if (AnonymousClass0SE.A0D(editable)) {
            i = 3;
        }
        layoutParams.gravity = i;
        this.A00.setLayoutParams(layoutParams);
    }
}

package X;

import android.view.KeyEvent;
import android.widget.EditText;
import com.google.android.search.verification.client.R;

/* renamed from: X.2pA  reason: invalid class name and case insensitive filesystem */
public class C60302pA extends AbstractC58752mS {
    public C60302pA() {
        super(R.drawable.ic_key_decimal);
    }

    @Override // X.AnonymousClass2WC
    public void AIk(EditText editText) {
        editText.dispatchKeyEvent(new KeyEvent(0, 0, 0, 158, 0));
        editText.dispatchKeyEvent(new KeyEvent(0, 0, 1, 158, 0));
    }
}

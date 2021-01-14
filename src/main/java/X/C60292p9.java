package X;

import android.view.KeyEvent;
import android.widget.EditText;
import com.google.android.search.verification.client.R;

/* renamed from: X.2p9  reason: invalid class name and case insensitive filesystem */
public class C60292p9 extends AbstractC58752mS {
    public C60292p9() {
        super(R.drawable.ic_key_comma);
    }

    @Override // X.AnonymousClass2WC
    public void AIk(EditText editText) {
        editText.dispatchKeyEvent(new KeyEvent(0, 0, 0, 159, 0));
        editText.dispatchKeyEvent(new KeyEvent(0, 0, 1, 159, 0));
    }
}

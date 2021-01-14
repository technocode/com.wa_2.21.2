package X;

import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

/* renamed from: X.1ou  reason: invalid class name and case insensitive filesystem */
public class C37861ou implements AbstractC25331Gl {
    public static final C37861ou A00 = new C37861ou();

    @Override // X.AbstractC25331Gl
    public void A2E(Object obj, AnonymousClass05q r4, AbstractC009906e r5, AbstractC008905s r6) {
        EditText editText = (EditText) obj;
        AnonymousClass29U r52 = (AnonymousClass29U) r5;
        String str = r52.A01;
        if (str != null) {
            TextWatcher textWatcher = r52.A00;
            if (textWatcher == null) {
                textWatcher = new AnonymousClass1GY(str, editText);
                r52.A00 = textWatcher;
            }
            editText.removeTextChangedListener(textWatcher);
            editText.addTextChangedListener(r52.A00);
        }
    }

    @Override // X.AbstractC25331Gl
    public void AQk(Object obj, AnonymousClass05q r3, AbstractC009906e r4, AbstractC008905s r5) {
        TextView textView = (TextView) obj;
        TextWatcher textWatcher = ((AnonymousClass29U) r4).A00;
        if (textWatcher != null) {
            textView.removeTextChangedListener(textWatcher);
        }
    }
}

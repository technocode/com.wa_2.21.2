package X;

import android.os.Handler;
import android.os.Looper;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

/* renamed from: X.1dp  reason: invalid class name and case insensitive filesystem */
public class C31801dp implements AbstractC25331Gl {
    public static final Handler A00 = new Handler(Looper.getMainLooper());
    public static final C31801dp A01 = new C31801dp();

    @Override // X.AbstractC25331Gl
    public void A2E(Object obj, AnonymousClass05q r6, AbstractC009906e r7, AbstractC008905s r8) {
        EditText editText = (EditText) obj;
        AnonymousClass28T r72 = (AnonymousClass28T) r7;
        AbstractC009505y r1 = r72.A01;
        if ((r8 instanceof C46422Aa) && r1 != null) {
            RunnableEBaseShape1S0400000_I1 runnableEBaseShape1S0400000_I1 = new RunnableEBaseShape1S0400000_I1((C46422Aa) r8, editText, r1, r6);
            Thread currentThread = Thread.currentThread();
            Handler handler = A00;
            if (currentThread == handler.getLooper().getThread()) {
                runnableEBaseShape1S0400000_I1.run();
            } else {
                handler.post(runnableEBaseShape1S0400000_I1);
            }
        }
        AbstractC009505y r12 = r72.A02;
        if (r12 != null) {
            TextWatcher textWatcher = r72.A00;
            if (textWatcher == null) {
                textWatcher = new C18430tL(editText, r6, r12);
                r72.A00 = textWatcher;
            }
            editText.removeTextChangedListener(textWatcher);
            editText.addTextChangedListener(r72.A00);
        }
    }

    @Override // X.AbstractC25331Gl
    public void AQk(Object obj, AnonymousClass05q r3, AbstractC009906e r4, AbstractC008905s r5) {
        TextView textView = (TextView) obj;
        TextWatcher textWatcher = ((AnonymousClass28T) r4).A00;
        if (textWatcher != null) {
            textView.removeTextChangedListener(textWatcher);
        }
    }
}

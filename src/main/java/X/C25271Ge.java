package X;

import android.view.KeyEvent;
import android.widget.TextView;
import java.util.ArrayList;

/* renamed from: X.1Ge  reason: invalid class name and case insensitive filesystem */
public class C25271Ge implements TextView.OnEditorActionListener {
    public final /* synthetic */ AnonymousClass05q A00;
    public final /* synthetic */ C46422Aa A01;

    public C25271Ge(C46422Aa r1, AnonymousClass05q r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        ArrayList arrayList = new ArrayList();
        C46422Aa r1 = this.A01;
        if (arrayList.size() == 0) {
            arrayList.add(C008805h.A0T(r1));
            C008805h.A0P(r1.A06, new C010106g(arrayList), this.A00);
            return true;
        }
        throw new IllegalArgumentException("arguments have to be continuous");
    }
}

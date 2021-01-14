package X;

import android.widget.TextView;
import java.lang.ref.WeakReference;

/* renamed from: X.2XE  reason: invalid class name */
public class AnonymousClass2XE extends AnonymousClass0JW {
    public final C014308b A00 = C014308b.A00();
    public final AnonymousClass02U A01;
    public final WeakReference A02;

    public AnonymousClass2XE(AnonymousClass02U r2, TextView textView) {
        this.A01 = r2;
        this.A02 = new WeakReference(textView);
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        String str = (String) obj;
        TextView textView = (TextView) this.A02.get();
        if (textView != null && textView.getTag().equals(this.A01)) {
            textView.setText(str);
        }
    }
}

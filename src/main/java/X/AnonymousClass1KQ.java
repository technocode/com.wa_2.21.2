package X;

import android.text.Spannable;
import android.text.style.URLSpan;
import android.widget.TextView;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingDeque;

/* renamed from: X.1KQ  reason: invalid class name */
public class AnonymousClass1KQ {
    public AnonymousClass1KO A00;
    public final AnonymousClass08V A01 = new AnonymousClass08V(32);
    public final AnonymousClass1KN A02 = new AnonymousClass1KN();
    public final AnonymousClass02M A03;
    public final AnonymousClass00D A04;
    public final C02040Ak A05;
    public final C01970Ad A06;

    public AnonymousClass1KQ(AnonymousClass02M r3, AnonymousClass00D r4, C01970Ad r5, C02040Ak r6) {
        this.A03 = r3;
        this.A04 = r4;
        this.A06 = r5;
        this.A05 = r6;
    }

    public void A00(CharSequence charSequence, TextView textView, Object obj, AnonymousClass1KM r16) {
        textView.setTag(obj);
        Spannable spannable = (Spannable) this.A01.A03(charSequence.toString());
        if (spannable != null) {
            URLSpan[] uRLSpanArr = (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class);
            Spannable spannable2 = (Spannable) charSequence;
            if (uRLSpanArr != null) {
                for (URLSpan uRLSpan : uRLSpanArr) {
                    spannable2.setSpan(new URLSpan(uRLSpan.getURL()), spannable.getSpanStart(uRLSpan), spannable.getSpanEnd(uRLSpan), spannable.getSpanFlags(uRLSpan));
                }
            }
            r16.AMm(spannable2);
            return;
        }
        AnonymousClass1KN r8 = this.A02;
        LinkedBlockingDeque linkedBlockingDeque = r8.A00;
        Iterator it = linkedBlockingDeque.iterator();
        while (it.hasNext()) {
            AnonymousClass1KP r1 = (AnonymousClass1KP) it.next();
            if (r1.A00 == textView) {
                linkedBlockingDeque.remove(r1);
            }
        }
        linkedBlockingDeque.add(new AnonymousClass1KP(charSequence, textView, obj, r16));
        if (this.A00 == null) {
            AnonymousClass1KO r6 = new AnonymousClass1KO(this, r8, this.A04.A0F(), this.A06, this.A05);
            this.A00 = r6;
            r6.start();
        }
    }
}

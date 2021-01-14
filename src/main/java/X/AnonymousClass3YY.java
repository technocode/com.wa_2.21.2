package X;

import android.content.Context;
import android.text.Spannable;
import android.text.style.URLSpan;
import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.text.ReadMoreTextView;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.3YY  reason: invalid class name */
public class AnonymousClass3YY extends AbstractC69453Hc {
    public ReadMoreTextView A00;
    public final AnonymousClass1KQ A01;
    public final AnonymousClass02M A02;
    public final C06180Sc A03;
    public final AnonymousClass0Z6 A04;
    public final AnonymousClass03P A05;
    public final AnonymousClass00D A06;

    public AnonymousClass3YY(AnonymousClass02M r4, AnonymousClass0Z6 r5, C06180Sc r6, AnonymousClass03P r7, AnonymousClass00D r8, C01970Ad r9, C02040Ak r10, View view) {
        super(view);
        this.A02 = r4;
        this.A04 = r5;
        this.A03 = r6;
        this.A05 = r7;
        this.A06 = r8;
        this.A00 = (ReadMoreTextView) AnonymousClass0Q7.A0D(view, R.id.payment_note_text);
        this.A01 = new AnonymousClass1KQ(this.A02, this.A06, r9, r10);
    }

    public final void A0C(Spannable spannable, TextEmojiLabel textEmojiLabel, boolean z) {
        int i;
        Context context = textEmojiLabel.getContext();
        ArrayList A22 = C002001d.A22(spannable);
        if (A22 == null || A22.isEmpty()) {
            i = 0;
        } else {
            Iterator it = A22.iterator();
            i = 0;
            while (it.hasNext()) {
                URLSpan uRLSpan = (URLSpan) it.next();
                spannable.setSpan(new C05690Pr(context, this.A02, this.A05, this.A03, uRLSpan.getURL()), spannable.getSpanStart(uRLSpan), spannable.getSpanEnd(uRLSpan), spannable.getSpanFlags(uRLSpan));
                i++;
            }
            Iterator it2 = A22.iterator();
            while (it2.hasNext()) {
                spannable.removeSpan(it2.next());
            }
        }
        AnonymousClass0Pz r0 = textEmojiLabel.A06;
        if (i <= 0) {
            if (r0 != null) {
                textEmojiLabel.setFocusable(false);
                AnonymousClass0Q7.A0W(textEmojiLabel, 0);
            }
            textEmojiLabel.setAccessibilityHelper(null);
            if (!z) {
                return;
            }
        } else if (r0 == null) {
            textEmojiLabel.setAccessibilityHelper(new C05720Pu(textEmojiLabel));
        }
        textEmojiLabel.A04(spannable, null, false, 0);
    }
}

package X;

import android.os.Process;
import android.text.SpannableStringBuilder;
import android.text.util.Linkify;
import android.widget.TextView;
import java.util.ArrayList;

/* renamed from: X.1KO  reason: invalid class name */
public final class AnonymousClass1KO extends Thread {
    public final AnonymousClass1KN A00;
    public final C02040Ak A01;
    public final C01970Ad A02;
    public final String A03;
    public volatile boolean A04;
    public final /* synthetic */ AnonymousClass1KQ A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1KO(AnonymousClass1KQ r2, AnonymousClass1KN r3, String str, C01970Ad r5, C02040Ak r6) {
        super("LinkifierThread");
        this.A05 = r2;
        this.A00 = r3;
        this.A03 = str;
        this.A02 = r5;
        this.A01 = r6;
    }

    public void run() {
        Process.setThreadPriority(10);
        while (!this.A04) {
            try {
                AnonymousClass1KP r0 = (AnonymousClass1KP) this.A00.A00.takeLast();
                if (r0 != null) {
                    CharSequence charSequence = r0.A02;
                    TextView textView = r0.A00;
                    Object obj = r0.A03;
                    AnonymousClass1KM r9 = r0.A01;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
                    if (obj.equals(textView.getTag())) {
                        String str = this.A03;
                        C01970Ad r2 = this.A02;
                        C02040Ak r1 = this.A01;
                        try {
                            Linkify.addLinks(spannableStringBuilder, 2);
                            AnonymousClass1Y8.A06(spannableStringBuilder);
                            C28051Sr.A1O(spannableStringBuilder, str);
                            C28051Sr.A1N(spannableStringBuilder, r2, r1);
                        } catch (Exception unused) {
                        }
                        ArrayList A22 = C002001d.A22(spannableStringBuilder);
                        if (A22 != null && !A22.isEmpty() && obj.equals(textView.getTag())) {
                            AnonymousClass1KQ r3 = this.A05;
                            r3.A01.A07(charSequence.toString(), new SpannableStringBuilder(spannableStringBuilder));
                            AnonymousClass02M r02 = r3.A03;
                            r02.A02.post(new RunnableEBaseShape1S0500000_I1(this, spannableStringBuilder, textView, obj, r9));
                        }
                    }
                }
            } catch (InterruptedException unused2) {
                return;
            }
        }
    }
}

package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import java.util.ArrayList;

/* renamed from: X.05z  reason: invalid class name and case insensitive filesystem */
public class C009605z extends ClickableSpan {
    public final AnonymousClass05q A00;
    public final AnonymousClass05l A01;
    public final AbstractC009505y A02;

    public void updateDrawState(TextPaint textPaint) {
    }

    public C009605z(AbstractC009505y r1, AnonymousClass05l r2, AnonymousClass05q r3) {
        this.A02 = r1;
        this.A01 = r2;
        this.A00 = r3;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        AnonymousClass05l r1 = this.A01;
        if (arrayList.size() == 0) {
            arrayList.add(C008805h.A0T(r1));
            C008805h.A0P(this.A02, new C010106g(arrayList), this.A00);
            return;
        }
        throw new IllegalArgumentException("arguments have to be continuous");
    }
}

package X;

import android.content.Intent;
import android.text.style.ClickableSpan;
import android.view.View;
import com.whatsapp.util.Log;

/* renamed from: X.34c  reason: invalid class name and case insensitive filesystem */
public class C664034c extends ClickableSpan {
    public final Intent A00;

    public C664034c(Intent intent) {
        this.A00 = intent;
    }

    public void onClick(View view) {
        StringBuilder A0S = AnonymousClass008.A0S("activity-intent-span/go intent=");
        Intent intent = this.A00;
        A0S.append(intent);
        Log.i(A0S.toString());
        view.getContext().startActivity(intent);
    }
}

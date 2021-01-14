package X;

import android.view.View;
import com.whatsapp.conversationslist.ViewHolder;

/* renamed from: X.2JL  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2JL implements View.OnLongClickListener {
    public final /* synthetic */ C11980hM A00;
    public final /* synthetic */ AnonymousClass02N A01;

    public /* synthetic */ AnonymousClass2JL(C11980hM r1, AnonymousClass02N r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final boolean onLongClick(View view) {
        C11980hM r0 = this.A00;
        AnonymousClass02N r3 = this.A01;
        AnonymousClass0Y5 r2 = r0.A06;
        ViewHolder viewHolder = r0.A0C;
        r2.AHN(r3, viewHolder.A05, viewHolder.A0J);
        return true;
    }
}

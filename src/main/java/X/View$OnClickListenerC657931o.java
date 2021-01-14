package X;

import android.view.View;
import com.facebook.redex.ViewOnClickEmptyBase;

/* renamed from: X.31o  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class View$OnClickListenerC657931o extends ViewOnClickEmptyBase implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass31h A01;
    public final /* synthetic */ C08390b2 A02;

    public /* synthetic */ View$OnClickListenerC657931o(C08390b2 r1, AnonymousClass31h r2, int i) {
        this.A02 = r1;
        this.A01 = r2;
        this.A00 = i;
    }

    public final void onClick(View view) {
        C08390b2 r4 = this.A02;
        AnonymousClass31h r3 = this.A01;
        int i = this.A00;
        r4.A02.A00 = false;
        r4.A0F(r3, i);
    }
}

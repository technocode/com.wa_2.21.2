package X;

import android.view.View;
import com.facebook.redex.ViewOnClickEBaseShape6S0100000_I1_4;

/* renamed from: X.2os  reason: invalid class name and case insensitive filesystem */
public class C60142os extends AbstractC56102i4 {
    public final /* synthetic */ AbstractView$OnCreateContextMenuListenerC56112i5 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60142os(AbstractView$OnCreateContextMenuListenerC56112i5 r3, View view) {
        super(view);
        this.A00 = r3;
        view.setOnClickListener(new ViewOnClickEBaseShape6S0100000_I1_4(this, 40));
    }
}

package X;

import android.view.View;

/* renamed from: X.2Hn  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class View$OnLongClickListenerC47362Hn implements View.OnLongClickListener {
    public final /* synthetic */ AnonymousClass2IO A00;
    public final /* synthetic */ AbstractC43421yL A01;
    public final /* synthetic */ AnonymousClass0M3 A02;

    public /* synthetic */ View$OnLongClickListenerC47362Hn(AnonymousClass2IO r1, AbstractC43421yL r2, AnonymousClass0M3 r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    public final boolean onLongClick(View view) {
        AnonymousClass2IO r1 = this.A00;
        AbstractC43421yL r3 = this.A01;
        AnonymousClass0M3 r2 = this.A02;
        if (r3 == null) {
            return true;
        }
        r3.AQ6(r1.A03);
        r1.A00();
        r1.A01.setSelected(r3.ABK(r2));
        return true;
    }
}

package X;

import android.app.Dialog;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.0ME  reason: invalid class name */
public class AnonymousClass0ME extends Dialog implements AnonymousClass02s {
    public AbstractC003201p A00;
    public final AbstractC005202l A01;

    @Override // X.AnonymousClass02s
    public void AKm(AbstractC06110Rt r1) {
    }

    @Override // X.AnonymousClass02s
    public void AKn(AbstractC06110Rt r1) {
    }

    @Override // X.AnonymousClass02s
    public AbstractC06110Rt ALr(AbstractC06100Rs r2) {
        return null;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass0ME(android.content.Context r6, int r7) {
        /*
            r5 = this;
            r4 = 1
            if (r7 != 0) goto L_0x003f
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            android.content.res.Resources$Theme r1 = r6.getTheme()
            r0 = 2130968842(0x7f04010a, float:1.754635E38)
            r1.resolveAttribute(r0, r2, r4)
            int r0 = r2.resourceId
        L_0x0014:
            r5.<init>(r6, r0)
            X.1ZF r0 = new X.1ZF
            r0.<init>(r5)
            r5.A01 = r0
            X.01p r3 = r5.A00()
            if (r7 != 0) goto L_0x0035
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            android.content.res.Resources$Theme r1 = r6.getTheme()
            r0 = 2130968842(0x7f04010a, float:1.754635E38)
            r1.resolveAttribute(r0, r2, r4)
            int r7 = r2.resourceId
        L_0x0035:
            r0 = r3
            X.0MW r0 = (X.AnonymousClass0MW) r0
            r0.A02 = r7
            r0 = 0
            r3.A0B(r0)
            return
        L_0x003f:
            r0 = r7
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0ME.<init>(android.content.Context, int):void");
    }

    public AbstractC003201p A00() {
        AbstractC003201p r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass0MW r02 = new AnonymousClass0MW(getContext(), getWindow(), this, this);
        this.A00 = r02;
        return r02;
    }

    public boolean A01(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        A00().A0D(view, layoutParams);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return C14900n4.A00(this.A01, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public View findViewById(int i) {
        AnonymousClass0MW r0 = (AnonymousClass0MW) A00();
        r0.A0L();
        return r0.A08.findViewById(i);
    }

    public void invalidateOptionsMenu() {
        A00().A06();
    }

    public void onCreate(Bundle bundle) {
        A00().A05();
        super.onCreate(bundle);
        A00().A0B(bundle);
    }

    public void onStop() {
        super.onStop();
        A00().A08();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        A00().A09(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        A00().A0C(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        A00().A0E(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(int i) {
        super.setTitle(i);
        A00().A0G(getContext().getString(i));
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        A00().A0G(charSequence);
    }
}

package com.whatsapp.voipcalling;

import X.AbstractC07220Wk;
import X.AnonymousClass00D;
import X.AnonymousClass01A;
import X.AnonymousClass01X;
import X.AnonymousClass03S;
import X.AnonymousClass0IY;
import X.C014308b;
import android.app.Dialog;
import android.content.Context;
import android.os.Handler;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import com.whatsapp.base.WaFragment;
import com.whatsapp.util.Log;

public class PermissionDialogFragment extends WaFragment {
    public int A00;
    public Dialog A01;
    public Button A02;
    public TextView A03;
    public AbstractC07220Wk A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public String[] A08;
    public final AnonymousClass0IY A09 = AnonymousClass0IY.A00();
    public final AnonymousClass01A A0A = AnonymousClass01A.A00();
    public final C014308b A0B = C014308b.A00();
    public final AnonymousClass03S A0C = AnonymousClass03S.A00();
    public final AnonymousClass00D A0D = AnonymousClass00D.A00();
    public final AnonymousClass01X A0E = AnonymousClass01X.A00();

    @Override // X.AnonymousClass037
    public void A0Y() {
        this.A0U = true;
        this.A04 = null;
    }

    @Override // X.AnonymousClass037
    public void A0a(Context context) {
        super.A0a(context);
        this.A04 = (AbstractC07220Wk) context;
    }

    @Override // X.AnonymousClass037
    public void A0c() {
        this.A0U = true;
        Dialog dialog = this.A01;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    @Override // X.AnonymousClass037
    public void A0e() {
        this.A0U = true;
        if (this.A05) {
            Log.d("PermissionDialogFragment/handlePermissionChangesAfterReturningFromSettings ");
            AnonymousClass03S r0 = this.A0C;
            boolean A092 = r0.A09();
            boolean A072 = r0.A07();
            if ((!this.A06 || A072) && (!this.A07 || A092)) {
                this.A01.dismiss();
                if (this.A04 != null) {
                    new Handler().post(new RunnableEBaseShape13S0100000_I1_8(this, 39));
                }
            }
            this.A05 = false;
        }
    }

    @Override // X.AnonymousClass037
    public void A0f() {
        this.A0U = true;
        Window window = this.A01.getWindow();
        if (window != null) {
            window.setLayout(A02().getDisplayMetrics().widthPixels, A02().getDisplayMetrics().heightPixels);
            return;
        }
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0118, code lost:
        if (r7 != false) goto L_0x011a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002c, code lost:
        if (r10.A06 != false) goto L_0x002e;
     */
    @Override // X.AnonymousClass037
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0i(android.os.Bundle r11) {
        /*
        // Method dump skipped, instructions count: 632
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.PermissionDialogFragment.A0i(android.os.Bundle):void");
    }
}

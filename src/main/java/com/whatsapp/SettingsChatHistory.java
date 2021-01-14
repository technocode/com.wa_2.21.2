package com.whatsapp;

import X.AnonymousClass008;
import X.AnonymousClass00C;
import X.AnonymousClass00D;
import X.AnonymousClass00E;
import X.AnonymousClass00T;
import X.AnonymousClass01A;
import X.AnonymousClass01Q;
import X.AnonymousClass01X;
import X.AnonymousClass02N;
import X.AnonymousClass0MB;
import X.AnonymousClass0MD;
import X.AnonymousClass1J8;
import X.AnonymousClass27X;
import X.C000300f;
import X.C002001d;
import X.C002101e;
import X.C007003k;
import X.C02590Cr;
import X.C04360Kb;
import X.C28051Sr;
import X.C40641tb;
import X.C40651tc;
import X.C47242Ha;
import android.app.Dialog;
import android.content.Intent;
import com.google.android.search.verification.client.R;

public class SettingsChatHistory extends AnonymousClass27X {
    public AnonymousClass02N A00;
    public final C000300f A01 = C000300f.A00();
    public final C04360Kb A02 = C04360Kb.A00();
    public final AnonymousClass01A A03 = AnonymousClass01A.A00();
    public final C47242Ha A04 = C47242Ha.A00();
    public final AnonymousClass00C A05 = AnonymousClass00C.A00();
    public final AnonymousClass00D A06 = AnonymousClass00D.A00();
    public final AnonymousClass01Q A07 = AnonymousClass01Q.A00();
    public final C02590Cr A08 = C02590Cr.A00();
    public final AnonymousClass00T A09 = C002101e.A00();

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 10 && i2 == -1) {
            AnonymousClass02N A012 = AnonymousClass02N.A01(intent.getStringExtra("contact"));
            AnonymousClass00E.A04(A012, intent.getStringExtra("contact"));
            this.A00 = A012;
            C47242Ha r5 = this.A04;
            C007003k A092 = this.A03.A09(A012);
            if (r5.A05.A0B(A012, 1, null, 2).size() > 0) {
                C002001d.A2O(this, 10);
            } else {
                r5.A02(this, this, A092, false);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x005e, code lost:
        if (r1 == 0) goto L_0x0060;
     */
    @Override // X.AnonymousClass27X, X.C39951sN
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r6) {
        /*
        // Method dump skipped, instructions count: 163
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.SettingsChatHistory.onCreate(android.os.Bundle):void");
    }

    @Override // X.C39951sN
    public Dialog onCreateDialog(int i) {
        if (i == 3) {
            C40641tb r10 = new C40641tb(this);
            AnonymousClass01X r8 = this.A0D;
            AnonymousClass0MD A002 = C28051Sr.A0X(this, r8, r8.A06(R.string.clear_all_chats_dialog_message), r10, false, -1).A00();
            A002.show();
            return A002;
        } else if (i == 4) {
            C40651tc r4 = new C40651tc(this);
            C02590Cr r1 = this.A08;
            AnonymousClass01X r2 = this.A0D;
            return C28051Sr.A0Y(this, r1, r2, this.A06, r4, r2.A06(R.string.delete_all_chats_ask), false, R.string.delete, -1).A00();
        } else if (i == 5) {
            boolean z = false;
            if (this.A07.A03() > 0) {
                z = true;
            }
            AnonymousClass1J8 r42 = new AnonymousClass1J8(this, z);
            AnonymousClass0MB r3 = new AnonymousClass0MB(this);
            AnonymousClass01X r22 = this.A0D;
            int i2 = R.string.unarchive_all_chats_ask;
            if (z) {
                i2 = R.string.archive_all_chats_ask;
            }
            r3.A01.A0E = r22.A06(i2);
            r3.A07(r22.A06(R.string.ok), r42);
            return AnonymousClass008.A03(r22, R.string.cancel, r3);
        } else if (i != 10) {
            return super.onCreateDialog(i);
        } else {
            AnonymousClass02N r12 = this.A00;
            if (r12 == null) {
                return super.onCreateDialog(i);
            }
            return this.A04.A01(this, this, this.A03.A0A(r12));
        }
    }
}

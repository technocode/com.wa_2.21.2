package com.whatsapp.ephemeral;

import X.ActivityC004602e;
import X.ActivityC004702f;
import X.AnonymousClass008;
import X.AnonymousClass00Y;
import X.AnonymousClass01X;
import X.AnonymousClass02M;
import X.AnonymousClass02N;
import X.AnonymousClass02U;
import X.AnonymousClass08B;
import X.AnonymousClass0A5;
import X.AnonymousClass0A6;
import X.AnonymousClass0A8;
import X.AnonymousClass0AL;
import X.AnonymousClass0AR;
import X.AnonymousClass0BP;
import X.AnonymousClass0C4;
import X.AnonymousClass0EO;
import X.AnonymousClass0FI;
import X.AnonymousClass0GG;
import X.AnonymousClass0M9;
import X.AnonymousClass1VY;
import X.AnonymousClass21U;
import X.AnonymousClass2C0;
import X.C007103l;
import X.C04360Kb;
import X.C12190hh;
import X.C44321zr;
import X.C53502dN;
import X.C53522dP;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.UnblockDialogFragment;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

public class ChangeEphemeralSettingActivity extends ActivityC004602e {
    public int A00;
    public int A01;
    public AnonymousClass02N A02;
    public final AnonymousClass0GG A03 = AnonymousClass0GG.A00();
    public final C04360Kb A04 = C04360Kb.A00();
    public final AnonymousClass0BP A05 = new C53522dP(this);
    public final AnonymousClass08B A06 = AnonymousClass08B.A00;
    public final AnonymousClass0A5 A07 = AnonymousClass0A5.A00();
    public final AnonymousClass0A8 A08 = AnonymousClass0A8.A00;
    public final AnonymousClass0M9 A09 = AnonymousClass0M9.A01();
    public final AnonymousClass00Y A0A = AnonymousClass00Y.A00();
    public final AnonymousClass0EO A0B = AnonymousClass0EO.A00();
    public final AnonymousClass0AR A0C = AnonymousClass0AR.A00();
    public final AnonymousClass0C4 A0D = AnonymousClass0C4.A00();

    public static void A04(AnonymousClass01X r5, AnonymousClass0GG r6, ActivityC004702f r7, UserJid userJid, int i) {
        Intent intent = new Intent(r7, ChangeEphemeralSettingActivity.class);
        intent.putExtra("jid", userJid.getRawString());
        intent.putExtra("current_setting", i);
        if (r6.A0H(userJid)) {
            int i2 = R.string.ephemeral_unblock_to_turn_setting_on;
            if (i > 0) {
                i2 = R.string.ephemeral_unblock_to_turn_setting_off;
            }
            r7.APm(UnblockDialogFragment.A00(r5.A06(i2), R.string.blocked_title, false, new C53502dN(r7, r6, intent, userJid)));
            return;
        }
        r7.startActivity(intent);
    }

    public final void A0T() {
        AnonymousClass02N r1 = this.A02;
        if (r1 != null) {
            boolean A0e = AnonymousClass1VY.A0e(r1);
            if (!A0e || !this.A03.A0H((UserJid) r1)) {
                int i = this.A01;
                if (i != -1 && this.A00 != i) {
                    if (((ActivityC004702f) this).A0H.A05()) {
                        AnonymousClass02N r7 = this.A02;
                        boolean z = true;
                        if (r7 == null || r7.getType() != 1) {
                            z = false;
                        }
                        if (z) {
                            AnonymousClass02U r72 = (AnonymousClass02U) r7;
                            int i2 = this.A01;
                            this.A0C.A0E(r72, i2, new AnonymousClass21U(this.A0D, this.A0B, this.A08, r72, null, null, 224, null));
                            C44321zr r2 = new C44321zr();
                            r2.A00 = Long.valueOf((long) i2);
                            this.A0A.A0B(r2, null, false);
                        } else if (A0e) {
                            UserJid userJid = (UserJid) r7;
                            int i3 = this.A01;
                            C04360Kb r5 = this.A04;
                            C007103l A072 = r5.A0S.A07(userJid);
                            if (A072 == null || A072.expiration != i3) {
                                AnonymousClass0AL r12 = r5.A12;
                                long A052 = r5.A0L.A05();
                                AnonymousClass0A6 r0 = r12.A07;
                                C12190hh r13 = new C12190hh(AnonymousClass0FI.A07(r0.A01, r0.A00, userJid, true), i3, A052);
                                r13.A0G = userJid;
                                r13.A0d = null;
                                r5.A0W.A0J(r13);
                            }
                            C44321zr r3 = new C44321zr();
                            r3.A00 = Long.valueOf((long) i3);
                            this.A0A.A0B(r3, null, false);
                        } else {
                            StringBuilder A0S = AnonymousClass008.A0S("Ephemeral not supported for this type of jid, type=");
                            A0S.append(r7.getType());
                            Log.e(A0S.toString());
                        }
                    } else {
                        ((ActivityC004702f) this).A0F.A06(R.string.ephemeral_setting_internet_needed, 1);
                    }
                }
            } else {
                AnonymousClass02M r32 = ((ActivityC004702f) this).A0F;
                AnonymousClass01X r22 = ((AnonymousClass2C0) this).A01;
                int i4 = this.A01;
                int i5 = R.string.ephemeral_unblock_to_turn_setting_on;
                if (i4 == 0) {
                    i5 = R.string.ephemeral_unblock_to_turn_setting_off;
                }
                r32.A0C(r22.A06(i5), 1);
            }
        } else {
            throw null;
        }
    }

    public /* synthetic */ void lambda$onCreate$2052$ChangeEphemeralSettingActivity(View view) {
        onBackPressed();
    }

    @Override // X.ActivityC004702f, X.AnonymousClass02i
    public void onBackPressed() {
        A0T();
        super.onBackPressed();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00b0, code lost:
        if (X.AnonymousClass1VY.A0e(r5) != false) goto L_0x00b2;
     */
    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r20) {
        /*
        // Method dump skipped, instructions count: 380
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ephemeral.ChangeEphemeralSettingActivity.onCreate(android.os.Bundle):void");
    }

    @Override // X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onDestroy() {
        super.onDestroy();
        this.A06.A00(this.A05);
    }

    @Override // X.ActivityC004702f
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            A0T();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // X.ActivityC004802g, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("selected_setting", this.A01);
    }

    @Override // X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onStart() {
        super.onStart();
        EphemeralNUXDialog.A00(this.A0J, A04(), true);
    }
}

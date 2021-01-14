package com.whatsapp.voipcalling;

import X.ActivityC004802g;
import X.AnonymousClass008;
import X.AnonymousClass00E;
import X.AnonymousClass01A;
import X.AnonymousClass02M;
import X.AnonymousClass02N;
import X.AnonymousClass02Y;
import X.AnonymousClass03S;
import X.AnonymousClass0FS;
import X.AnonymousClass0QM;
import X.AnonymousClass1VY;
import X.C007003k;
import X.C09200cS;
import X.C09260ca;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;

public class VoipPermissionsActivity extends ActivityC004802g {
    public int A00;
    public GroupJid A01;
    public AnonymousClass0QM A02;
    public List A03 = new ArrayList();
    public boolean A04;
    public boolean A05;
    public final AnonymousClass02M A06 = AnonymousClass02M.A00();
    public final AnonymousClass01A A07 = AnonymousClass01A.A00();
    public final AnonymousClass03S A08 = AnonymousClass03S.A00();
    public final AnonymousClass0FS A09 = AnonymousClass0FS.A00();
    public final C09200cS A0A = C09200cS.A00();

    @Override // X.ActivityC004902h
    public void onActivityResult(int i, int i2, Intent intent) {
        StringBuilder A0U = AnonymousClass008.A0U("VoipPermissionsActivity onActivityResult got result: ", i2, " for request: ", i, " data: ");
        A0U.append(intent);
        Log.i(A0U.toString());
        if (i != 152) {
            AnonymousClass008.A0y("VoipPermissionsActivity onActivityResult unhandled request: ", i, " result: ", i2);
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            AnonymousClass0QM r1 = this.A02;
            if (r1 == null) {
                ArrayList arrayList = new ArrayList();
                for (AnonymousClass02N r2 : this.A03) {
                    C007003k A092 = this.A07.A09(r2);
                    if (A092 != null) {
                        arrayList.add(A092);
                    } else {
                        StringBuilder sb = new StringBuilder("VoipPermissionsActivity/unable to find contact:");
                        sb.append(r2);
                        Log.d(sb.toString());
                    }
                }
                Log.i("VoipPermissionsActivity onActivityResult starting call");
                this.A0A.A02(arrayList, this, this.A00, this.A04, this.A05, this.A01);
            } else {
                this.A0A.A04(r1, this);
            }
        }
        finish();
    }

    @Override // X.ActivityC004802g, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        Log.i("voip/VoipPermissionsActivity/onCreate");
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent.getBooleanExtra("join_call_log", false)) {
            int intExtra = intent.getIntExtra("call_log_transaction_id", -1);
            String stringExtra = intent.getStringExtra("call_log_call_id");
            boolean booleanExtra = intent.getBooleanExtra("call_log_from_me", false);
            try {
                this.A02 = this.A09.A04(new C09260ca(UserJid.get(intent.getStringExtra("call_log_user_jid")), booleanExtra, stringExtra, intExtra));
            } catch (AnonymousClass02Y unused) {
                Log.e("voip/VoipPermissionsActivity/onCreate invalid jid");
                return;
            }
        } else {
            List A0G = AnonymousClass1VY.A0G(UserJid.class, intent.getStringArrayListExtra("jids"));
            this.A03 = A0G;
            AnonymousClass00E.A08(!A0G.isEmpty(), "There must be at least one jid");
            this.A00 = intent.getIntExtra("call_from", -1);
            this.A04 = intent.getBooleanExtra("smaller_call_btn", false);
            if (intent.hasExtra("group_jid")) {
                this.A01 = GroupJid.getNullable(intent.getStringExtra("group_jid"));
            }
        }
        boolean booleanExtra2 = intent.getBooleanExtra("video_call", false);
        this.A05 = booleanExtra2;
        RequestPermissionActivity.A0C(this, this.A06, this.A08, booleanExtra2);
    }
}

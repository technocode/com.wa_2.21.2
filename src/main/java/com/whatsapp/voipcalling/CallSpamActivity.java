package com.whatsapp.voipcalling;

import X.AbstractC673938k;
import X.ActivityC004602e;
import X.ActivityC004902h;
import X.AnonymousClass008;
import X.AnonymousClass00T;
import X.AnonymousClass01A;
import X.AnonymousClass01K;
import X.AnonymousClass01X;
import X.AnonymousClass02M;
import X.AnonymousClass037;
import X.AnonymousClass04j;
import X.AnonymousClass098;
import X.AnonymousClass0FE;
import X.AnonymousClass0GG;
import X.AnonymousClass0MB;
import X.AnonymousClass0MC;
import X.AnonymousClass3T9;
import X.C002101e;
import X.C004302a;
import X.C006903j;
import X.C007003k;
import X.C014308b;
import X.C02360Br;
import X.C04360Kb;
import X.C04410Kg;
import X.C674038l;
import X.DialogInterface$OnClickListenerC671137g;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import com.google.android.search.verification.client.R;
import com.whatsapp.base.WaDialogFragment;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape4S0200000_I1;

public class CallSpamActivity extends ActivityC004602e {
    public AbstractC673938k A00 = new AnonymousClass3T9(this);
    public final AnonymousClass01A A01 = AnonymousClass01A.A00();
    public final C006903j A02 = C006903j.A00();
    public final AnonymousClass098 A03 = AnonymousClass098.A00();
    public final C02360Br A04 = C02360Br.A00();
    public final C674038l A05 = C674038l.A01;

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        UserJid nullable;
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        String str = null;
        if (extras == null || (nullable = UserJid.getNullable(extras.getString("caller_jid"))) == null) {
            StringBuilder A0S = AnonymousClass008.A0S("callspamactivity/create/not-creating/bad-jid: ");
            if (extras != null) {
                str = extras.getString("caller_jid");
            }
            A0S.append(str);
            Log.e(A0S.toString());
            finish();
            return;
        }
        C007003k A09 = this.A01.A09(nullable);
        String string = extras.getString("call_id");
        if (A09 == null || string == null) {
            Log.e("callspamactivity/create/not-creating/null-args");
            finish();
            return;
        }
        getWindow().setBackgroundDrawable(new ColorDrawable(C004302a.A00(this, R.color.popup_dim)));
        getWindow().addFlags(2621440);
        setContentView(R.layout.call_spam);
        findViewById(R.id.call_spam_report).setOnClickListener(new ViewOnClickCListenerShape4S0200000_I1(this, extras, 39));
        findViewById(R.id.call_spam_not_spam).setOnClickListener(new ViewOnClickCListenerShape4S0200000_I1(this, nullable, 40));
        findViewById(R.id.call_spam_block).setOnClickListener(new ViewOnClickCListenerShape4S0200000_I1(this, extras, 41));
        this.A05.A00.add(this.A00);
    }

    @Override // X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onDestroy() {
        super.onDestroy();
        C674038l r0 = this.A05;
        r0.A00.remove(this.A00);
    }

    @Override // X.ActivityC004802g, X.ActivityC004902h
    public void onStop() {
        super.onStop();
        finish();
    }

    public class ReportSpamOrBlockDialogFragment extends WaDialogFragment {
        public long A00;
        public CheckBox A01;
        public C007003k A02;
        public UserJid A03;
        public UserJid A04;
        public String A05;
        public String A06;
        public boolean A07;
        public boolean A08;
        public boolean A09;
        public final AnonymousClass0GG A0A = AnonymousClass0GG.A00();
        public final AnonymousClass02M A0B = AnonymousClass02M.A00();
        public final C04360Kb A0C = C04360Kb.A00();
        public final AnonymousClass01A A0D = AnonymousClass01A.A00();
        public final C014308b A0E = C014308b.A00();
        public final C04410Kg A0F = C04410Kg.A00();
        public final AnonymousClass04j A0G = AnonymousClass04j.A00();
        public final AnonymousClass01X A0H = AnonymousClass01X.A00();
        public final AnonymousClass01K A0I = AnonymousClass01K.A00();
        public final C02360Br A0J = C02360Br.A00();
        public final AnonymousClass0FE A0K = AnonymousClass0FE.A00();
        public final AnonymousClass00T A0L = C002101e.A00();

        @Override // androidx.fragment.app.DialogFragment
        public Dialog A0p(Bundle bundle) {
            AnonymousClass01X r8;
            String str;
            String A0D2;
            Log.i("callspamactivity/createdialog");
            Bundle bundle2 = ((AnonymousClass037) this).A06;
            if (bundle2 != null) {
                UserJid nullable = UserJid.getNullable(bundle2.getString("caller_jid"));
                if (nullable != null) {
                    this.A04 = nullable;
                    this.A03 = UserJid.getNullable(bundle2.getString("call_creator_jid"));
                    C007003k A092 = this.A0D.A09(this.A04);
                    if (A092 != null) {
                        this.A02 = A092;
                        String string = bundle2.getString("call_id");
                        if (string != null) {
                            this.A05 = string;
                            this.A00 = bundle2.getLong("call_duration", -1);
                            this.A07 = bundle2.getBoolean("call_terminator", false);
                            this.A06 = bundle2.getString("call_termination_reason");
                            this.A09 = bundle2.getBoolean("call_video", false);
                            DialogInterface$OnClickListenerC671137g r9 = new DialogInterface$OnClickListenerC671137g(this);
                            ActivityC004902h A0A2 = A0A();
                            if (A0A2 != null) {
                                AnonymousClass0MB r5 = new AnonymousClass0MB(A0A2);
                                if (this.A08) {
                                    r8 = this.A0H;
                                    A0D2 = r8.A06(R.string.report_contact_ask);
                                } else {
                                    r8 = this.A0H;
                                    Object[] objArr = new Object[1];
                                    C007003k r1 = this.A02;
                                    if (r1 != null) {
                                        str = this.A0E.A08(r1, false);
                                    } else {
                                        str = "";
                                    }
                                    objArr[0] = str;
                                    A0D2 = r8.A0D(R.string.block_ask, objArr);
                                }
                                AnonymousClass0MC r3 = r5.A01;
                                r3.A0E = A0D2;
                                r5.A07(r8.A06(R.string.ok), r9);
                                r5.A05(r8.A06(R.string.cancel), null);
                                if (this.A08) {
                                    View inflate = LayoutInflater.from(A0A2).inflate(R.layout.report_spam_dialog, (ViewGroup) null);
                                    CheckBox checkBox = (CheckBox) inflate.findViewById(R.id.block_contact);
                                    this.A01 = checkBox;
                                    checkBox.setChecked(true);
                                    r3.A0C = inflate;
                                    r3.A01 = 0;
                                }
                                return r5.A00();
                            }
                            throw null;
                        }
                        throw null;
                    }
                    throw null;
                }
                throw null;
            }
            throw null;
        }
    }
}

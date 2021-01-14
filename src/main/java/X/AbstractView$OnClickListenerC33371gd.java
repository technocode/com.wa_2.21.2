package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.appcompat.widget.Toolbar;
import com.facebook.redex.ViewOnClickEBaseShape7S0100000_I1_5;
import com.google.android.search.verification.client.R;
import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;
import com.whatsapp.payments.ui.BrazilFbPayHubActivity;
import com.whatsapp.payments.ui.BrazilPayBloksActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1gd  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractView$OnClickListenerC33371gd extends ActivityC004602e implements View.OnClickListener, AbstractC63142vv, AbstractC63152vw, AbstractC63182vz, AbstractC63102vr, AbstractC63162vx {
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public View A05;
    public ListView A06;
    public SwitchCompat A07;
    public AbstractC63112vs A08;
    public AnonymousClass3HP A09;
    public AnonymousClass3HS A0A;
    public AbstractC63192w0 A0B;
    public final AnonymousClass0BA A0C = AnonymousClass0BA.A00();
    public final C01980Ae A0D = C01980Ae.A00();
    public final C04570Kw A0E = C04570Kw.A00();
    public final AnonymousClass0GP A0F = AnonymousClass0GP.A00();
    public final C02060Am A0G = C02060Am.A00();
    public final C04560Kv A0H = C04560Kv.A00();
    public final C02010Ah A0I = C02010Ah.A00();
    public final AnonymousClass0AD A0J = AnonymousClass0AD.A00;
    public final C03340Fu A0K = C03340Fu.A00();
    public final C01970Ad A0L = C01970Ad.A00();
    public final C61202sf A0M = C61202sf.A00();
    public final C61592tQ A0N = C61592tQ.A00();
    public final C61762th A0O = C61762th.A00();
    public final AnonymousClass00T A0P = C002101e.A00();

    @Override // X.AbstractC63102vr
    public String A7R(AnonymousClass1VM r3) {
        if (!(this instanceof BrazilFbPayHubActivity)) {
            AnonymousClass01X r1 = ((AnonymousClass2C0) this).A01;
            return C28051Sr.A0v(r1, r3) != null ? C28051Sr.A0v(r1, r3) : "";
        } else if (r3.A01 == 2) {
            return ((AnonymousClass2C0) this).A01.A06(R.string.default_payment_method_set);
        } else {
            AbstractC43781yw r0 = r3.A06;
            return (r0 == null || r0.A06()) ? "" : ((AnonymousClass2C0) this).A01.A06(R.string.payment_method_unverified);
        }
    }

    @Override // X.AbstractC63182vz
    public void ANs(boolean z) {
        View view = this.A00;
        int i = 8;
        if (z) {
            i = 0;
        }
        view.setVisibility(i);
    }

    @Override // X.AbstractC63142vv
    public void ANy(boolean z) {
        this.A07.setChecked(z);
    }

    @Override // X.AbstractC63142vv
    public void ANz(boolean z) {
        View view = this.A02;
        int i = 8;
        if (z) {
            i = 0;
        }
        view.setVisibility(i);
    }

    @Override // X.AbstractC63142vv
    public void AOn(boolean z) {
        View view = this.A05;
        int i = 8;
        if (z) {
            i = 0;
        }
        view.setVisibility(i);
    }

    @Override // X.AbstractC63162vx
    public void AQs(List list) {
        if (!(this instanceof BrazilFbPayHubActivity)) {
            AbstractC63112vs r0 = this.A08;
            r0.A00 = list;
            r0.notifyDataSetChanged();
            C28051Sr.A1U(this.A06);
            return;
        }
        BrazilFbPayHubActivity brazilFbPayHubActivity = (BrazilFbPayHubActivity) this;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass1VM r2 = (AnonymousClass1VM) it.next();
            if (r2.A04() == 5) {
                arrayList.add(r2);
            } else {
                arrayList2.add(r2);
            }
        }
        brazilFbPayHubActivity.A03.A01();
        AbstractC63112vs r02 = ((AbstractView$OnClickListenerC33371gd) brazilFbPayHubActivity).A08;
        r02.A00 = arrayList2;
        r02.notifyDataSetChanged();
        C28051Sr.A1U(((AbstractView$OnClickListenerC33371gd) brazilFbPayHubActivity).A06);
    }

    public void lambda$onCreate$41$FbPayHubActivity(View view) {
        String str;
        AnonymousClass3YK r1 = (AnonymousClass3YK) this.A09;
        if (r1 != null) {
            Intent intent = new Intent(this, BrazilPayBloksActivity.class);
            if (r1.A00.A0B("add_card")) {
                str = "brpay_p_pin_change_verify";
            } else {
                str = "brpay_p_pin_change_create";
            }
            intent.putExtra("screen_name", str);
            A0I(intent, false);
            return;
        }
        throw null;
    }

    public void lambda$onCreate$42$FbPayHubActivity(View view) {
        AnonymousClass3HP r2 = this.A09;
        if (!r2.A00) {
            return;
        }
        if (r2.A03.A05()) {
            PinBottomSheetDialogFragment pinBottomSheetDialogFragment = new PinBottomSheetDialogFragment();
            pinBottomSheetDialogFragment.A07 = new AnonymousClass3F3();
            pinBottomSheetDialogFragment.A08 = new AnonymousClass3HO(r2, pinBottomSheetDialogFragment);
            r2.A01.APm(pinBottomSheetDialogFragment);
            return;
        }
        r2.A01.APq(R.string.payment_add_fingerprint_title, R.string.payment_add_fingerprint_desc, new Object[0]);
    }

    public /* synthetic */ void lambda$onCreate$43$FbPayHubActivity(View view) {
        this.A0B.A02();
    }

    @Override // X.ActivityC004902h
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1 && i2 == -1) {
            this.A0B.A01();
        }
    }

    public void onClick(View view) {
        if (view.getId() == R.id.add_new_account || view.getId() == R.id.p2p_onboarding_nudge_button) {
            boolean z = false;
            if (this.A08.getCount() == 0) {
                z = true;
            }
            ACc(z);
        }
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.fb_pay_hub);
        int A002 = C004302a.A00(this, R.color.fb_pay_hub_icon_tint);
        A0C((Toolbar) findViewById(R.id.pay_service_toolbar));
        AnonymousClass0S2 A092 = A09();
        if (A092 != null) {
            A092.A08(((AnonymousClass2C0) this).A01.A06(R.string.facebook_pay));
            A092.A0A(true);
            A092.A04(C002001d.A0e(getResources().getDrawable(R.drawable.ic_close), A002));
        }
        this.A03 = findViewById(R.id.payment_methods_container);
        this.A04 = findViewById(R.id.p2p_onboarding_nudge_container);
        findViewById(R.id.p2p_onboarding_nudge_button).setOnClickListener(this);
        BrazilFbPayHubActivity brazilFbPayHubActivity = (BrazilFbPayHubActivity) this;
        AnonymousClass01X r8 = ((AnonymousClass2C0) brazilFbPayHubActivity).A01;
        this.A08 = new AnonymousClass3HC(brazilFbPayHubActivity, r8, ((AbstractView$OnClickListenerC33371gd) brazilFbPayHubActivity).A0L, brazilFbPayHubActivity);
        ListView listView = (ListView) findViewById(R.id.methods_list);
        this.A06 = listView;
        listView.setAdapter((ListAdapter) this.A08);
        boolean z = false;
        AnonymousClass3HS r0 = new AnonymousClass3HS(this, this.A0P, this.A0L, this.A0I, this.A0D, this.A0K, this.A0N, this.A0G, this.A0J, this.A0C, this.A0H, false);
        this.A0A = r0;
        r0.A01(false, false);
        this.A06.setOnItemClickListener(new C62262uV(this));
        View findViewById = findViewById(R.id.add_new_account);
        this.A01 = findViewById;
        findViewById.setOnClickListener(this);
        C002001d.A2m((ImageView) findViewById(R.id.change_pin_icon), A002);
        C002001d.A2m((ImageView) findViewById(R.id.add_new_account_icon), A002);
        C002001d.A2m((ImageView) findViewById(R.id.fingerprint_setting_icon), A002);
        this.A05 = findViewById(R.id.pin_container);
        this.A02 = findViewById(R.id.fingerprint_container);
        this.A07 = (SwitchCompat) findViewById(R.id.toggle_fingerprint);
        C61932ty r1 = brazilFbPayHubActivity.A05;
        C01980Ae r02 = brazilFbPayHubActivity.A02;
        C61942tz r03 = brazilFbPayHubActivity.A06;
        C61902tv r14 = brazilFbPayHubActivity.A04;
        AnonymousClass3YK r3 = new AnonymousClass3YK(brazilFbPayHubActivity, r8, r1, r02, r03, r14);
        this.A09 = r3;
        C61902tv r2 = r3.A03;
        if (r2.A00.A05()) {
            AbstractC63142vv r12 = r3.A06;
            r12.ANz(true);
            if (r2.A01() == 1) {
                z = true;
            }
            r12.ANy(z);
            ((AnonymousClass3HP) r3).A00 = true;
        } else {
            r3.A06.ANz(false);
        }
        findViewById(R.id.change_pin).setOnClickListener(new ViewOnClickEBaseShape7S0100000_I1_5(this, 6));
        this.A02.setOnClickListener(new ViewOnClickEBaseShape7S0100000_I1_5(this, 7));
        this.A00 = findViewById(R.id.action_required_row_container);
        findViewById(R.id.action_required_row_container).setOnClickListener(new ViewOnClickEBaseShape7S0100000_I1_5(this, 8));
        AnonymousClass3HQ r22 = new AnonymousClass3HQ(((ActivityC004602e) brazilFbPayHubActivity).A0C, ((ActivityC004702f) brazilFbPayHubActivity).A0F, brazilFbPayHubActivity.A00, ((AbstractView$OnClickListenerC33371gd) brazilFbPayHubActivity).A0M, r8, ((AbstractView$OnClickListenerC33371gd) brazilFbPayHubActivity).A0I, ((ActivityC004702f) brazilFbPayHubActivity).A0H, r02, r03, ((AbstractView$OnClickListenerC33371gd) brazilFbPayHubActivity).A0K, ((AbstractView$OnClickListenerC33371gd) brazilFbPayHubActivity).A0F, r14, ((AbstractView$OnClickListenerC33371gd) brazilFbPayHubActivity).A0O, ((AbstractView$OnClickListenerC33371gd) brazilFbPayHubActivity).A0E, brazilFbPayHubActivity);
        this.A0B = r22;
        r22.A06(getIntent().getStringExtra("notification-type"), "FBPAY", 1);
    }

    @Override // X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onDestroy() {
        super.onDestroy();
        AnonymousClass3HS r2 = this.A0A;
        C10010dt r0 = r2.A02;
        if (r0 != null) {
            ((AnonymousClass0JW) r0).A00.cancel(true);
        }
        r2.A02 = null;
        AbstractC29091Wz r1 = r2.A00;
        if (r1 != null) {
            r2.A09.A00(r1);
        }
    }

    @Override // X.ActivityC004602e, X.ActivityC004702f, X.ActivityC004902h
    public void onResume() {
        super.onResume();
        this.A0A.A00(true);
        AnonymousClass3HP r4 = this.A09;
        boolean z = false;
        if (r4.A05.A04()) {
            AbstractC63142vv r2 = r4.A06;
            r2.AOn(true);
            C61902tv r1 = r4.A03;
            if (r1.A00.A05()) {
                r4.A00 = false;
                if (r1.A01() == 1) {
                    z = true;
                }
                r2.ANy(z);
                r4.A00 = true;
            }
        } else {
            r4.A06.AOn(false);
        }
        this.A0B.A05("FBPAY");
    }
}

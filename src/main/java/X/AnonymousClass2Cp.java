package X;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape1S0200000_I1_0;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.ViewOnClickCListenerShape4S0200000_I1;

/* renamed from: X.2Cp  reason: invalid class name */
public abstract class AnonymousClass2Cp extends ActivityC004602e {
    public ViewGroup A00;
    public TextView A01;
    public final AnonymousClass03P A02 = AnonymousClass03P.A00();

    public View A0T() {
        View inflate = View.inflate(this, R.layout.share_link_action_item, null);
        ViewGroup viewGroup = this.A00;
        if (viewGroup != null) {
            viewGroup.addView(inflate);
            return inflate;
        }
        throw null;
    }

    public C40711ti A0U() {
        C40711ti r4 = new C40711ti();
        ViewOnClickEBaseShape1S0200000_I1_0 viewOnClickEBaseShape1S0200000_I1_0 = new ViewOnClickEBaseShape1S0200000_I1_0(this, r4, 9);
        ((C26931Nf) r4).A00 = A0T();
        r4.A00(R.drawable.ic_action_copy, ((AnonymousClass2C0) this).A01.A06(R.string.copy_link), viewOnClickEBaseShape1S0200000_I1_0);
        return r4;
    }

    public C40721tj A0V() {
        C40721tj r4 = new C40721tj();
        ViewOnClickEBaseShape1S0200000_I1_0 viewOnClickEBaseShape1S0200000_I1_0 = new ViewOnClickEBaseShape1S0200000_I1_0(this, r4, 10);
        findViewById(R.id.link_btn).setOnClickListener(new ViewOnClickCListenerShape4S0200000_I1(r4, viewOnClickEBaseShape1S0200000_I1_0));
        ((C26931Nf) r4).A00 = A0T();
        r4.A00(R.drawable.ic_share, ((AnonymousClass2C0) this).A01.A06(R.string.share_link), viewOnClickEBaseShape1S0200000_I1_0);
        return r4;
    }

    public C40731tk A0W() {
        C40731tk r7 = new C40731tk();
        ViewOnClickEBaseShape1S0200000_I1_0 viewOnClickEBaseShape1S0200000_I1_0 = new ViewOnClickEBaseShape1S0200000_I1_0(this, r7, 8);
        AnonymousClass01X r5 = ((AnonymousClass2C0) this).A01;
        String A06 = r5.A06(R.string.localized_app_name);
        ((C26931Nf) r7).A00 = A0T();
        r7.A00(R.drawable.ic_action_forward, r5.A0D(R.string.share_link_via_whatsapp, A06), viewOnClickEBaseShape1S0200000_I1_0);
        return r7;
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AnonymousClass0S2 A09 = A09();
        if (A09 != null) {
            A09.A0A(true);
            setContentView(R.layout.share_link);
            this.A00 = (ViewGroup) findViewById(R.id.share_link_root);
            this.A01 = (TextView) findViewById(R.id.link);
            return;
        }
        throw null;
    }
}

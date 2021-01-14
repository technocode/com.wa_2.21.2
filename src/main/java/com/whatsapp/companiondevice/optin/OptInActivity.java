package com.whatsapp.companiondevice.optin;

import X.ActivityC004602e;
import X.AnonymousClass008;
import X.AnonymousClass0M9;
import X.AnonymousClass0O5;
import X.AnonymousClass0S2;
import X.AnonymousClass0SD;
import X.AnonymousClass0TX;
import X.AnonymousClass2FN;
import X.AnonymousClass2FO;
import X.AnonymousClass2Xi;
import X.C51082Xg;
import X.C51092Xh;
import X.C51102Xj;
import X.C51132Xm;
import X.C51142Xn;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape4S0100000_I1_2;
import com.facebook.redex.ViewOnClickEBaseShape5S0100000_I1_3;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.components.Button;
import com.whatsapp.util.Log;
import java.util.HashMap;

public class OptInActivity extends ActivityC004602e {
    public ProgressDialog A00;
    public View A01;
    public View A02;
    public ScrollView A03;
    public TextView A04;
    public TextView A05;
    public TextEmojiLabel A06;
    public C51132Xm A07;
    public Button A08;
    public Button A09;
    public final AnonymousClass0M9 A0A = AnonymousClass0M9.A01();

    public /* synthetic */ void lambda$connectUIEventsToViewModel$1854$OptInActivity(View view) {
        C51132Xm r1 = this.A07;
        Log.d("OptInWebBeta/OptIn_Button_Clicked");
        r1.A02(0);
    }

    public /* synthetic */ void lambda$connectUIEventsToViewModel$1855$OptInActivity(View view) {
        C51132Xm r1 = this.A07;
        Log.d("OptInWebBeta/OptOut_Button_Clicked");
        r1.A02(1);
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        boolean z;
        super.onCreate(bundle);
        setContentView(R.layout.opt_in_activity);
        setTitle(getString(R.string.md_opt_in_screen_title));
        AnonymousClass0S2 A092 = A09();
        if (A092 != null) {
            A092.A0A(true);
            this.A03 = (ScrollView) AnonymousClass0TX.A0A(this, R.id.scroll_view);
            this.A02 = AnonymousClass0TX.A0A(this, R.id.opt_in_sheet_shadow);
            this.A04 = (TextView) AnonymousClass0TX.A0A(this, R.id.header_title);
            this.A06 = (TextEmojiLabel) AnonymousClass0TX.A0A(this, R.id.header_description);
            this.A05 = (TextView) AnonymousClass0TX.A0A(this, R.id.opt_in_clarification);
            this.A01 = AnonymousClass0TX.A0A(this, R.id.enrolled_header_group);
            this.A08 = (Button) AnonymousClass0TX.A0A(this, R.id.opt_in_button);
            this.A09 = (Button) AnonymousClass0TX.A0A(this, R.id.opt_out_button);
            Bundle extras = getIntent().getExtras();
            boolean z2 = false;
            if (extras != null) {
                boolean z3 = extras.getBoolean("arg_has_devices_linked", false);
                z = extras.getBoolean("arg_has_portal_device_linked", false);
                z2 = z3;
            } else {
                z = false;
            }
            C51142Xn r5 = new C51142Xn(z2, z);
            AnonymousClass0O5 A9n = A9n();
            String canonicalName = C51132Xm.class.getCanonicalName();
            if (canonicalName != null) {
                String A0K = AnonymousClass008.A0K("androidx.lifecycle.ViewModelProvider.DefaultKey:", canonicalName);
                HashMap hashMap = A9n.A00;
                AnonymousClass0SD r1 = (AnonymousClass0SD) hashMap.get(A0K);
                if (!C51132Xm.class.isInstance(r1)) {
                    r1 = r5.A3B(C51132Xm.class);
                    AnonymousClass0SD r0 = (AnonymousClass0SD) hashMap.put(A0K, r1);
                    if (r0 != null) {
                        r0.A00();
                    }
                }
                this.A07 = (C51132Xm) r1;
                this.A03.getViewTreeObserver().addOnGlobalLayoutListener(new AnonymousClass2FO(this));
                this.A03.getViewTreeObserver().addOnScrollChangedListener(new AnonymousClass2FN(this));
                this.A08.setOnClickListener(new ViewOnClickEBaseShape5S0100000_I1_3(this, 0));
                this.A09.setOnClickListener(new ViewOnClickEBaseShape4S0100000_I1_2(this, 49));
                this.A07.A01.A03(this, new AnonymousClass2Xi(this));
                this.A07.A02.A03(this, new C51092Xh(this));
                this.A07.A03.A03(this, new C51082Xg(this));
                this.A07.A00.A03(this, new C51102Xj(this));
                return;
            }
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        throw null;
    }
}

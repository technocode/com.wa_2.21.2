package com.whatsapp.voipcalling;

import X.AbstractC000400g;
import X.ActivityC004602e;
import X.AnonymousClass00E;
import X.AnonymousClass01A;
import X.AnonymousClass01X;
import X.AnonymousClass02N;
import X.AnonymousClass0JO;
import X.AnonymousClass0LH;
import X.AnonymousClass0M9;
import X.AnonymousClass1VY;
import X.AnonymousClass2C0;
import X.AnonymousClass3UW;
import X.C000300f;
import X.C002001d;
import X.C002301g;
import X.C014308b;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape1S1100000_I1;
import com.facebook.redex.ViewOnClickEBaseShape9S0100000_I1_7;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.UserJid;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;

public class VoipNotAllowedActivity extends ActivityC004602e {
    public final C000300f A00 = C000300f.A00();
    public final AnonymousClass01A A01 = AnonymousClass01A.A00();
    public final C014308b A02 = C014308b.A00();
    public final AnonymousClass0M9 A03 = AnonymousClass0M9.A01();
    public final AnonymousClass0LH A04 = new AnonymousClass3UW(this);
    public final AnonymousClass0JO A05 = AnonymousClass0JO.A00;

    public /* synthetic */ void lambda$onCreate$2838$VoipNotAllowedActivity(View view) {
        finish();
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        View findViewById = findViewById(R.id.content);
        if (findViewById != null) {
            LinearLayout linearLayout = (LinearLayout) findViewById;
            if (configuration.orientation == 1) {
                linearLayout.setOrientation(1);
            } else {
                linearLayout.setOrientation(0);
            }
        } else {
            throw null;
        }
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        String A1g;
        AnonymousClass01X r5;
        super.onCreate(bundle);
        setContentView(R.layout.voip_not_allowed);
        getWindow().addFlags(524288);
        View findViewById = findViewById(R.id.title);
        if (findViewById != null) {
            TextView textView = (TextView) findViewById;
            C002301g.A03(textView);
            AbstractList abstractList = (AbstractList) AnonymousClass1VY.A0G(UserJid.class, getIntent().getStringArrayListExtra("jids"));
            AnonymousClass00E.A08(!abstractList.isEmpty(), "Missing jids");
            int intExtra = getIntent().getIntExtra("reason", 0);
            ArrayList arrayList = new ArrayList(abstractList.size());
            if (intExtra == 0 || intExtra == 12 || intExtra == 14) {
                Iterator it = abstractList.iterator();
                while (it.hasNext()) {
                    arrayList.add(this.A02.A04(this.A01.A0A((AnonymousClass02N) it.next())));
                }
                A1g = C002001d.A1g(this.A02.A02, true, arrayList);
            } else {
                boolean z = false;
                if (abstractList.size() == 1) {
                    z = true;
                }
                AnonymousClass00E.A08(z, "Incorrect number of arguments");
                A1g = this.A02.A04(this.A01.A0A((AnonymousClass02N) abstractList.get(0)));
            }
            View findViewById2 = findViewById(R.id.message);
            if (findViewById2 != null) {
                TextView textView2 = (TextView) findViewById2;
                String str = null;
                switch (intExtra) {
                    case 1:
                        r5 = ((AnonymousClass2C0) this).A01;
                        textView2.setText(r5.A0D(R.string.voip_not_allowed_needs_update, A1g));
                        break;
                    case 2:
                        r5 = ((AnonymousClass2C0) this).A01;
                        textView2.setText(r5.A0D(R.string.voip_not_allowed_never, A1g));
                        break;
                    case 3:
                        r5 = ((AnonymousClass2C0) this).A01;
                        textView2.setText(r5.A06(R.string.voip_not_allowed_caller_country));
                        str = this.A03.A03("general", "28030008", null).toString();
                        break;
                    case 4:
                        r5 = ((AnonymousClass2C0) this).A01;
                        textView2.setText(r5.A0D(R.string.voip_not_allowed_callee_country, A1g));
                        str = this.A03.A03("general", "28030008", null).toString();
                        break;
                    case 5:
                        r5 = ((AnonymousClass2C0) this).A01;
                        textView.setText(r5.A06(R.string.voip_not_connected_title));
                        textView2.setText(getIntent().getStringExtra("message"));
                        break;
                    case 6:
                        r5 = ((AnonymousClass2C0) this).A01;
                        textView.setText(r5.A06(R.string.voip_not_connected_title));
                        textView2.setText(r5.A0D(R.string.voip_not_connected_peer_fail, A1g));
                        break;
                    case 7:
                        r5 = ((AnonymousClass2C0) this).A01;
                        textView2.setText(r5.A06(R.string.voip_video_not_enabled_for_caller));
                        break;
                    case 8:
                        r5 = ((AnonymousClass2C0) this).A01;
                        textView2.setText(r5.A0D(R.string.voip_video_not_allowed_at_this_time, A1g));
                        break;
                    case 9:
                        r5 = ((AnonymousClass2C0) this).A01;
                        textView2.setText(r5.A0D(R.string.voip_video_call_app_needs_update, A1g));
                        break;
                    case 10:
                        r5 = ((AnonymousClass2C0) this).A01;
                        textView2.setText(r5.A0D(R.string.voip_video_call_old_os_ver, A1g));
                        break;
                    case 11:
                        r5 = ((AnonymousClass2C0) this).A01;
                        textView2.setText(r5.A0D(R.string.voip_video_call_old_os_ver, A1g));
                        break;
                    case 12:
                        r5 = ((AnonymousClass2C0) this).A01;
                        textView2.setText(r5.A0A(R.plurals.voip_group_call_not_supported_plural, (long) abstractList.size(), A1g));
                        break;
                    case 13:
                        r5 = ((AnonymousClass2C0) this).A01;
                        textView2.setText(r5.A0D(R.string.voip_group_call_old_os_ver, A1g));
                        break;
                    case 14:
                        int A06 = this.A00.A06(AbstractC000400g.A39);
                        r5 = ((AnonymousClass2C0) this).A01;
                        textView2.setText(r5.A0A(R.plurals.voip_group_call_reach_maximum, (long) A06, Integer.valueOf(A06)));
                        break;
                    case 15:
                        r5 = ((AnonymousClass2C0) this).A01;
                        textView2.setText(r5.A0D(R.string.unable_to_add_participant_to_group_call, A1g));
                        break;
                    case GlVideoRenderer.CAP_RENDER_I420:
                        r5 = ((AnonymousClass2C0) this).A01;
                        textView2.setText(r5.A0D(R.string.voip_peer_not_registered, A1g));
                        break;
                    default:
                        r5 = ((AnonymousClass2C0) this).A01;
                        textView2.setText(r5.A0A(R.plurals.voip_not_allowed_at_this_time_plural, (long) abstractList.size(), A1g));
                        break;
                }
                View findViewById3 = findViewById(R.id.ok);
                if (findViewById3 != null) {
                    TextView textView3 = (TextView) findViewById3;
                    View findViewById4 = findViewById(R.id.more);
                    if (findViewById4 != null) {
                        if (str == null) {
                            findViewById4.setVisibility(8);
                            textView3.setText(r5.A06(R.string.ok));
                        } else {
                            findViewById4.setVisibility(0);
                            findViewById4.setOnClickListener(new ViewOnClickEBaseShape1S1100000_I1(this, str, 9));
                            textView3.setText(r5.A06(R.string.ok_got_it));
                        }
                        textView3.setOnClickListener(new ViewOnClickEBaseShape9S0100000_I1_7(this, 31));
                        View findViewById5 = findViewById(R.id.content);
                        if (findViewById5 != null) {
                            LinearLayout linearLayout = (LinearLayout) findViewById5;
                            if (getResources().getConfiguration().orientation == 1) {
                                linearLayout.setOrientation(1);
                            } else {
                                linearLayout.setOrientation(0);
                            }
                            this.A05.A01(this.A04);
                            return;
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

    @Override // X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onDestroy() {
        super.onDestroy();
        this.A05.A00(this.A04);
    }
}

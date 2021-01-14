package com.whatsapp.group;

import X.AbstractC000400g;
import X.AbstractC49342Qc;
import X.ActivityC004602e;
import X.ActivityC004702f;
import X.AnonymousClass00S;
import X.AnonymousClass00T;
import X.AnonymousClass01A;
import X.AnonymousClass01I;
import X.AnonymousClass01K;
import X.AnonymousClass01R;
import X.AnonymousClass01T;
import X.AnonymousClass01X;
import X.AnonymousClass02M;
import X.AnonymousClass02U;
import X.AnonymousClass037;
import X.AnonymousClass04j;
import X.AnonymousClass0A8;
import X.AnonymousClass0AR;
import X.AnonymousClass0C4;
import X.AnonymousClass0EO;
import X.AnonymousClass0EZ;
import X.AnonymousClass0MB;
import X.AnonymousClass0MC;
import X.AnonymousClass0S2;
import X.AnonymousClass0TX;
import X.AnonymousClass1M5;
import X.AnonymousClass1VY;
import X.AnonymousClass2C0;
import X.AnonymousClass2QR;
import X.AnonymousClass2QS;
import X.C000300f;
import X.C002101e;
import X.C007003k;
import X.C05350Oe;
import X.C28351Tz;
import X.C54782fU;
import X.C55002fq;
import X.C55012fr;
import X.C55022fs;
import X.C55042fu;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape6S0100000_I1_4;
import com.google.android.search.verification.client.R;
import com.whatsapp.base.WaDialogFragment;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.ViewOnClickCListenerShape13S0100000_I1_2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class GroupSettingsActivity extends ActivityC004602e {
    public C007003k A00;
    public AbstractC49342Qc A01 = new C54782fU(this);
    public AnonymousClass02U A02;
    public final AnonymousClass01I A03 = AnonymousClass01I.A00();
    public final C000300f A04 = C000300f.A00();
    public final AnonymousClass01A A05 = AnonymousClass01A.A00();
    public final AnonymousClass04j A06 = AnonymousClass04j.A00();
    public final AnonymousClass01T A07 = AnonymousClass01T.A00();
    public final AnonymousClass0EO A08 = AnonymousClass0EO.A00();
    public final AnonymousClass0EZ A09 = AnonymousClass0EZ.A01;
    public final AnonymousClass00T A0A = C002101e.A00();

    public class EditGroupInfoDialogFragment extends AdminSettingsDialogFragment {
    }

    public class RestrictFrequentlyForwardedDialogFragment extends AdminSettingsDialogFragment {
    }

    public class SendMessagesDialogFragment extends AdminSettingsDialogFragment {
    }

    public abstract class AdminSettingsDialogFragment extends WaDialogFragment {
        public C007003k A00;
        public AnonymousClass02U A01;
        public boolean[] A02;
        public final AnonymousClass02M A03 = AnonymousClass02M.A00();
        public final C000300f A04 = C000300f.A00();
        public final AnonymousClass01A A05 = AnonymousClass01A.A00();
        public final AnonymousClass04j A06;
        public final AnonymousClass01X A07 = AnonymousClass01X.A00();
        public final AnonymousClass0A8 A08;
        public final AnonymousClass01T A09;
        public final AnonymousClass0EO A0A;
        public final AnonymousClass0AR A0B = AnonymousClass0AR.A00();
        public final AnonymousClass0C4 A0C = AnonymousClass0C4.A00();

        public AdminSettingsDialogFragment() {
            AnonymousClass00S.A00();
            AnonymousClass01K.A00();
            this.A0A = AnonymousClass0EO.A00();
            this.A06 = AnonymousClass04j.A00();
            AnonymousClass01R.A01();
            this.A08 = AnonymousClass0A8.A00;
            this.A09 = AnonymousClass01T.A00();
            this.A02 = new boolean[1];
        }

        @Override // X.AnonymousClass037, androidx.fragment.app.DialogFragment
        public void A0j(Bundle bundle) {
            bundle.putBoolean("default", this.A02[0]);
            super.A0j(bundle);
        }

        @Override // androidx.fragment.app.DialogFragment
        public Dialog A0p(Bundle bundle) {
            boolean z;
            String A062;
            String A063;
            String A064;
            String A065;
            Bundle bundle2 = ((AnonymousClass037) this).A06;
            if (bundle2 != null) {
                AnonymousClass02U A032 = AnonymousClass02U.A03(bundle2.getString("gjid"));
                if (A032 != null) {
                    this.A01 = A032;
                    this.A00 = this.A05.A0A(A032);
                    if (bundle == null) {
                        z = ((AnonymousClass037) this).A06.getBoolean("default");
                    } else {
                        z = bundle.getBoolean("default");
                    }
                    this.A02[0] = z;
                    View inflate = A0A().getLayoutInflater().inflate(R.layout.admin_settings_dialog, (ViewGroup) null, false);
                    View findViewById = inflate.findViewById(R.id.first_radio_button);
                    if (findViewById != null) {
                        CompoundButton compoundButton = (CompoundButton) findViewById;
                        View findViewById2 = inflate.findViewById(R.id.second_radio_button);
                        if (findViewById2 != null) {
                            CompoundButton compoundButton2 = (CompoundButton) findViewById2;
                            if (!(this instanceof RestrictFrequentlyForwardedDialogFragment)) {
                                A062 = this.A07.A06(R.string.group_settings_all_participants);
                            } else {
                                A062 = this.A07.A06(R.string.group_settings_allow);
                            }
                            compoundButton.setText(A062);
                            if (!(this instanceof RestrictFrequentlyForwardedDialogFragment)) {
                                A063 = this.A07.A06(R.string.group_settings_only_admins);
                            } else {
                                A063 = this.A07.A06(R.string.group_settings_dont_allow);
                            }
                            compoundButton2.setText(A063);
                            compoundButton.setOnClickListener(new ViewOnClickEBaseShape6S0100000_I1_4(this, 23));
                            compoundButton2.setOnClickListener(new ViewOnClickEBaseShape6S0100000_I1_4(this, 22));
                            if (z) {
                                compoundButton2.setChecked(true);
                            } else {
                                compoundButton.setChecked(true);
                            }
                            AnonymousClass0MB r4 = new AnonymousClass0MB(A0A());
                            if (this instanceof SendMessagesDialogFragment) {
                                A064 = this.A07.A06(R.string.group_settings_announcement_title);
                            } else if (!(this instanceof RestrictFrequentlyForwardedDialogFragment)) {
                                A064 = this.A07.A06(R.string.group_settings_restricted_mode_title);
                            } else {
                                boolean A0D = this.A04.A0D(AbstractC000400g.A1D);
                                int i = R.string.group_settings_frequently_forwarded_title;
                                if (A0D) {
                                    i = R.string.group_settings_forwarded_many_times_title;
                                }
                                A064 = A0F(i);
                            }
                            AnonymousClass0MC r6 = r4.A01;
                            r6.A0I = A064;
                            if (this instanceof SendMessagesDialogFragment) {
                                A065 = this.A07.A06(R.string.group_settings_announcement_info);
                            } else if (!(this instanceof RestrictFrequentlyForwardedDialogFragment)) {
                                A065 = this.A07.A06(R.string.group_settings_restricted_mode_info);
                            } else {
                                boolean A0D2 = this.A04.A0D(AbstractC000400g.A1D);
                                int i2 = R.string.group_settings_frequently_forwarded_info;
                                if (A0D2) {
                                    i2 = R.string.group_settings_forwarded_many_times_info;
                                }
                                A065 = A0F(i2);
                            }
                            r6.A0E = A065;
                            r6.A0J = true;
                            r6.A0C = inflate;
                            r6.A01 = 0;
                            AnonymousClass01X r2 = this.A07;
                            r4.A05(r2.A06(R.string.cancel), AnonymousClass2QR.A00);
                            r4.A07(r2.A06(R.string.ok), new AnonymousClass2QS(this));
                            return r4.A00();
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

    public final void A0T() {
        AnonymousClass01X r3;
        String A062;
        String A063;
        String A064;
        TextView textView = (TextView) findViewById(R.id.restricted_mode_info);
        if (textView != null) {
            if (this.A00.A0Z) {
                r3 = ((AnonymousClass2C0) this).A01;
                A062 = r3.A06(R.string.group_settings_only_admins);
            } else {
                r3 = ((AnonymousClass2C0) this).A01;
                A062 = r3.A06(R.string.group_settings_all_participants);
            }
            textView.setText(A062);
            TextView textView2 = (TextView) findViewById(R.id.announcement_group_info);
            if (textView2 != null) {
                if (this.A00.A0Q) {
                    A063 = r3.A06(R.string.group_settings_only_admins);
                } else {
                    A063 = r3.A06(R.string.group_settings_all_participants);
                }
                textView2.setText(A063);
                C000300f r2 = this.A04;
                boolean A0D = r2.A0D(AbstractC000400g.A10);
                View findViewById = findViewById(R.id.frequently_forwarded_layout);
                if (findViewById != null) {
                    View findViewById2 = findViewById(R.id.frequently_forwarded_divider_bottom);
                    if (findViewById2 != null) {
                        View findViewById3 = findViewById(R.id.frequently_forwarded_divider_top);
                        if (findViewById3 != null) {
                            int i = 8;
                            int i2 = 8;
                            if (A0D) {
                                i2 = 0;
                            }
                            findViewById.setVisibility(i2);
                            int i3 = 8;
                            if (A0D) {
                                i3 = 0;
                            }
                            findViewById3.setVisibility(i3);
                            int i4 = 8;
                            if (A0D) {
                                i4 = 0;
                            }
                            findViewById2.setVisibility(i4);
                            if (A0D) {
                                TextView textView3 = (TextView) findViewById(R.id.frequently_forwarded_info);
                                if (textView3 != null) {
                                    if (this.A00.A0Y) {
                                        A064 = r3.A06(R.string.group_settings_dont_allow);
                                    } else {
                                        A064 = r3.A06(R.string.group_settings_allow);
                                    }
                                    textView3.setText(A064);
                                } else {
                                    throw null;
                                }
                            }
                            View findViewById4 = findViewById(R.id.manage_admins_group);
                            if (findViewById4 != null) {
                                if (r2.A0D(AbstractC000400g.A15)) {
                                    AnonymousClass01T r1 = this.A07;
                                    if (r1.A05(this.A02)) {
                                        Iterator it = r1.A01(this.A02).A04().iterator();
                                        while (true) {
                                            C28351Tz r12 = (C28351Tz) it;
                                            if (!r12.hasNext()) {
                                                break;
                                            }
                                            AnonymousClass1M5 r22 = (AnonymousClass1M5) r12.next();
                                            if (!this.A03.A09(r22.A03) && r22.A01 != 2) {
                                                i = 0;
                                                break;
                                            }
                                        }
                                    }
                                }
                                findViewById4.setVisibility(i);
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
        throw null;
    }

    @Override // X.ActivityC004902h
    public void onActivityResult(int i, int i2, Intent intent) {
        int i3;
        super.onActivityResult(i, i2, intent);
        if (i == 17 && i2 == -1) {
            List A0G = AnonymousClass1VY.A0G(UserJid.class, intent.getStringArrayListExtra("jids"));
            AnonymousClass01T r6 = this.A07;
            C05350Oe A042 = r6.A01(this.A02).A04();
            HashSet hashSet = new HashSet();
            Iterator it = A042.iterator();
            while (true) {
                C28351Tz r1 = (C28351Tz) it;
                if (!r1.hasNext()) {
                    break;
                }
                AnonymousClass1M5 r12 = (AnonymousClass1M5) r1.next();
                UserJid userJid = r12.A03;
                if (!(this.A03.A09(userJid) || (i3 = r12.A01) == 0 || i3 == 2)) {
                    hashSet.add(userJid);
                }
            }
            ArrayList arrayList = new ArrayList(A0G);
            arrayList.removeAll(hashSet);
            ArrayList arrayList2 = new ArrayList(hashSet);
            arrayList2.removeAll(A0G);
            if (arrayList.size() != 0 || arrayList2.size() != 0) {
                if (!this.A06.A05()) {
                    boolean A022 = AnonymousClass04j.A02(this);
                    int i4 = R.string.network_required;
                    if (A022) {
                        i4 = R.string.network_required_airplane_on;
                    }
                    ((ActivityC004702f) this).A0F.A06(i4, 0);
                } else if (this.A04.A06(AbstractC000400g.A3i) - 1 < (arrayList.size() + r6.A01(this.A02).A05().size()) - arrayList2.size()) {
                    HashMap hashMap = new HashMap();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        hashMap.put(it2.next(), 419);
                    }
                    AnonymousClass0EO.A02(3003, hashMap);
                } else {
                    this.A0A.ANC(new C55042fu(this, this.A02, arrayList, arrayList2), new Void[0]);
                }
            }
        }
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(((AnonymousClass2C0) this).A01.A06(R.string.group_settings_title));
        AnonymousClass0S2 A092 = A09();
        if (A092 != null) {
            A092.A0A(true);
            AnonymousClass02U A032 = AnonymousClass02U.A03(getIntent().getStringExtra("gid"));
            if (A032 != null) {
                this.A02 = A032;
                this.A00 = this.A05.A0A(A032);
                setContentView(R.layout.group_settings);
                View findViewById = findViewById(R.id.restricted_mode_layout);
                if (findViewById != null) {
                    findViewById.setOnClickListener(new C55002fq(this));
                    View findViewById2 = findViewById(R.id.announcement_group_layout);
                    if (findViewById2 != null) {
                        findViewById2.setOnClickListener(new C55012fr(this));
                        View findViewById3 = findViewById(R.id.frequently_forwarded_layout);
                        if (findViewById3 != null) {
                            findViewById3.setOnClickListener(new C55022fs(this));
                            TextView textView = (TextView) AnonymousClass0TX.A0A(this, R.id.frequently_forwarded_title);
                            boolean A0D = this.A04.A0D(AbstractC000400g.A1D);
                            int i = R.string.group_settings_frequently_forwarded_title;
                            if (A0D) {
                                i = R.string.group_settings_forward_many_times;
                            }
                            textView.setText(getString(i));
                            View findViewById4 = findViewById(R.id.manage_admins);
                            if (findViewById4 != null) {
                                findViewById4.setOnClickListener(new ViewOnClickCListenerShape13S0100000_I1_2(this, 25));
                                A0T();
                                AnonymousClass0EZ r0 = this.A09;
                                r0.A00.add(this.A01);
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
        throw null;
    }

    @Override // X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onDestroy() {
        super.onDestroy();
        AnonymousClass0EZ r0 = this.A09;
        r0.A00.remove(this.A01);
    }
}

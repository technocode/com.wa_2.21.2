package com.whatsapp.contact.picker;

import X.AbstractC000400g;
import X.AbstractC06100Rs;
import X.AbstractC06110Rt;
import X.AbstractC07170We;
import X.ActivityC004902h;
import X.AnonymousClass008;
import X.AnonymousClass00D;
import X.AnonymousClass00E;
import X.AnonymousClass00T;
import X.AnonymousClass00Y;
import X.AnonymousClass01A;
import X.AnonymousClass01I;
import X.AnonymousClass01P;
import X.AnonymousClass01Q;
import X.AnonymousClass01T;
import X.AnonymousClass01X;
import X.AnonymousClass022;
import X.AnonymousClass02M;
import X.AnonymousClass02N;
import X.AnonymousClass02X;
import X.AnonymousClass037;
import X.AnonymousClass03P;
import X.AnonymousClass03S;
import X.AnonymousClass04j;
import X.AnonymousClass08B;
import X.AnonymousClass09E;
import X.AnonymousClass09H;
import X.AnonymousClass0AI;
import X.AnonymousClass0BB;
import X.AnonymousClass0BP;
import X.AnonymousClass0CN;
import X.AnonymousClass0CO;
import X.AnonymousClass0ET;
import X.AnonymousClass0GG;
import X.AnonymousClass0HI;
import X.AnonymousClass0HN;
import X.AnonymousClass0I7;
import X.AnonymousClass0JW;
import X.AnonymousClass0L2;
import X.AnonymousClass0LW;
import X.AnonymousClass0M6;
import X.AnonymousClass0M9;
import X.AnonymousClass0MB;
import X.AnonymousClass0MC;
import X.AnonymousClass0Q7;
import X.AnonymousClass0QB;
import X.AnonymousClass0S2;
import X.AnonymousClass0Wl;
import X.AnonymousClass0XN;
import X.AnonymousClass0YP;
import X.AnonymousClass0YX;
import X.AnonymousClass1V1;
import X.AnonymousClass1VY;
import X.AnonymousClass1Y8;
import X.AnonymousClass2G3;
import X.AnonymousClass2G4;
import X.AnonymousClass2G5;
import X.AnonymousClass2G6;
import X.AnonymousClass2G7;
import X.AnonymousClass2G9;
import X.AnonymousClass2GA;
import X.AnonymousClass2GC;
import X.AnonymousClass2GE;
import X.AnonymousClass2GP;
import X.AnonymousClass2GS;
import X.AnonymousClass2GT;
import X.AnonymousClass2YD;
import X.AnonymousClass2YE;
import X.AnonymousClass2YF;
import X.AnonymousClass2YG;
import X.AnonymousClass2YH;
import X.AnonymousClass2YJ;
import X.AnonymousClass2YM;
import X.AnonymousClass2YN;
import X.AnonymousClass31y;
import X.AnonymousClass36X;
import X.AnonymousClass3D8;
import X.AnonymousClass3Ot;
import X.C000300f;
import X.C002001d;
import X.C002101e;
import X.C002301g;
import X.C002701k;
import X.C003701u;
import X.C004302a;
import X.C006803i;
import X.C006903j;
import X.C007003k;
import X.C007703s;
import X.C014308b;
import X.C014508d;
import X.C02120As;
import X.C02220Bc;
import X.C02230Bd;
import X.C02590Cr;
import X.C02780Dk;
import X.C03190Fd;
import X.C04350Ka;
import X.C04360Kb;
import X.C04370Kc;
import X.C04600Kz;
import X.C05710Pt;
import X.C05720Pu;
import X.C06190Sd;
import X.C06470Tj;
import X.C09040cC;
import X.C09110cJ;
import X.C09190cR;
import X.C10920fQ;
import X.C10940fS;
import X.C10950fT;
import X.C12420i4;
import X.C14690mi;
import X.C27261Ou;
import X.C28051Sr;
import X.C44261zl;
import X.C47122Go;
import X.C48032Kq;
import X.C58812ma;
import X.C58822mb;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.provider.ContactsContract;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.search.verification.client.R;
import com.whatsapp.BaseSharedPreviewDialogFragment;
import com.whatsapp.Conversation;
import com.whatsapp.HomeActivity;
import com.whatsapp.Main;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.TextStatusComposerActivity;
import com.whatsapp.base.WaFragment;
import com.whatsapp.components.button.ThumbnailButton;
import com.whatsapp.contentprovider.MediaProvider;
import com.whatsapp.emoji.EmojiDescriptor;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.PaymentContactPickerFragment;
import com.whatsapp.util.Log;
import com.whatsapp.util.StatResult;
import com.whatsapp.voipcalling.GroupCallParticipantPicker;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ContactPickerFragment extends WaFragment {
    public static boolean A1t;
    public byte A00;
    public int A01;
    public long A02;
    public long A03;
    public MenuItem A04;
    public View A05;
    public View A06;
    public View A07;
    public View A08;
    public ImageView A09;
    public ListView A0A;
    public AbstractC06100Rs A0B;
    public AbstractC06110Rt A0C;
    public AnonymousClass0YP A0D;
    public TextEmojiLabel A0E;
    public AnonymousClass0BP A0F;
    public AnonymousClass0YX A0G;
    public C58822mb A0H;
    public AnonymousClass2YM A0I;
    public C10950fT A0J;
    public C10940fS A0K;
    public AnonymousClass2YN A0L;
    public C10920fQ A0M;
    public C47122Go A0N;
    public C007003k A0O;
    public AnonymousClass02N A0P;
    public C09110cJ A0Q;
    public Long A0R;
    public String A0S;
    public String A0T;
    public String A0U;
    public String A0V;
    public String A0W;
    public String A0X;
    public String A0Y = "";
    public String A0Z;
    public String A0a;
    public String A0b;
    public ArrayList A0c;
    public ArrayList A0d;
    public ArrayList A0e;
    public List A0f = new ArrayList();
    public List A0g = new ArrayList();
    public List A0h = new ArrayList();
    public List A0i = new ArrayList();
    public boolean A0j;
    public boolean A0k;
    public boolean A0l;
    public boolean A0m;
    public boolean A0n;
    public boolean A0o;
    public boolean A0p;
    public boolean A0q;
    public boolean A0r;
    public boolean A0s;
    public boolean A0t;
    public boolean A0u;
    public boolean A0v;
    public boolean A0w;
    public boolean A0x;
    public boolean A0y;
    public boolean A0z;
    public final Handler A10 = new Handler(Looper.getMainLooper());
    public final C02780Dk A11;
    public final AnonymousClass0GG A12;
    public final AnonymousClass0CO A13;
    public final AnonymousClass02M A14;
    public final AnonymousClass01I A15;
    public final C09190cR A16;
    public final C04350Ka A17;
    public final C000300f A18;
    public final C09040cC A19;
    public final C04360Kb A1A;
    public final AnonymousClass0HI A1B;
    public final AnonymousClass01A A1C;
    public final AnonymousClass08B A1D;
    public final AnonymousClass0AI A1E;
    public final C014308b A1F;
    public final AnonymousClass0L2 A1G;
    public final AnonymousClass0XN A1H;
    public final AnonymousClass0HN A1I;
    public final AnonymousClass0I7 A1J;
    public final AnonymousClass04j A1K;
    public final AnonymousClass03P A1L;
    public final AnonymousClass03S A1M;
    public final AnonymousClass00D A1N;
    public final AnonymousClass01X A1O;
    public final C006903j A1P;
    public final AnonymousClass01Q A1Q;
    public final C02120As A1R;
    public final AnonymousClass01T A1S;
    public final C014508d A1T;
    public final C48032Kq A1U;
    public final AnonymousClass09E A1V;
    public final AnonymousClass01P A1W;
    public final C02590Cr A1X;
    public final AnonymousClass0M9 A1Y;
    public final C002701k A1Z;
    public final AnonymousClass0ET A1a;
    public final AnonymousClass00Y A1b;
    public final AnonymousClass09H A1c;
    public final AnonymousClass022 A1d;
    public final AnonymousClass0BB A1e;
    public final AnonymousClass3Ot A1f;
    public final AnonymousClass31y A1g;
    public final C04370Kc A1h;
    public final C03190Fd A1i;
    public final C007703s A1j;
    public final C02220Bc A1k;
    public final AnonymousClass00T A1l;
    public final AnonymousClass0CN A1m;
    public final Runnable A1n;
    public final HashSet A1o = new HashSet();
    public final List A1p = new ArrayList();
    public final Map A1q = new LinkedHashMap();
    public final Set A1r = new HashSet();
    public final Set A1s;

    public ContactPickerFragment() {
        HashSet hashSet = new HashSet();
        this.A1s = hashSet;
        this.A1n = new RunnableEBaseShape8S0100000_I1_3(hashSet, 43);
        this.A1Z = C002701k.A00();
        this.A1h = C04370Kc.A00();
        this.A14 = AnonymousClass02M.A00();
        this.A15 = AnonymousClass01I.A00();
        this.A17 = C04350Ka.A00();
        this.A1l = C002101e.A00();
        this.A1P = C006903j.A00();
        this.A1b = AnonymousClass00Y.A00();
        this.A1X = C02590Cr.A00();
        this.A16 = C09190cR.A00();
        this.A18 = C000300f.A00();
        this.A1V = AnonymousClass09E.A00();
        this.A19 = C09040cC.A00();
        this.A1A = C04360Kb.A00();
        this.A1m = AnonymousClass0CN.A00();
        this.A1i = C03190Fd.A00();
        this.A1G = AnonymousClass0L2.A01();
        this.A1c = AnonymousClass09H.A01();
        this.A1f = AnonymousClass3Ot.A00();
        this.A11 = C02780Dk.A02();
        this.A1C = AnonymousClass01A.A00();
        this.A1Y = AnonymousClass0M9.A01();
        this.A1k = C02220Bc.A00();
        this.A1L = AnonymousClass03P.A00();
        this.A1F = C014308b.A00();
        this.A1O = AnonymousClass01X.A00();
        this.A1U = C48032Kq.A00();
        this.A12 = AnonymousClass0GG.A00();
        this.A1D = AnonymousClass08B.A00;
        this.A1H = AnonymousClass0XN.A00();
        this.A13 = AnonymousClass0CO.A00();
        this.A1g = AnonymousClass31y.A00();
        this.A1e = AnonymousClass0BB.A00();
        this.A1a = AnonymousClass0ET.A00();
        this.A1B = AnonymousClass0HI.A00();
        this.A1I = AnonymousClass0HN.A00();
        this.A1T = C014508d.A00();
        this.A1K = AnonymousClass04j.A00();
        this.A1W = AnonymousClass01P.A00();
        this.A1M = AnonymousClass03S.A00();
        this.A1N = AnonymousClass00D.A00();
        this.A1Q = AnonymousClass01Q.A00();
        this.A1R = C02120As.A00();
        this.A1j = C007703s.A00();
        this.A1S = AnonymousClass01T.A00();
        this.A1d = AnonymousClass022.A00();
        this.A1E = AnonymousClass0AI.A00();
        this.A1J = AnonymousClass0I7.A00();
    }

    @Override // X.AnonymousClass037
    public View A0Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.contact_picker_fragment, viewGroup, false);
        this.A07 = inflate;
        ImageView imageView = (ImageView) inflate.findViewById(R.id.send);
        this.A09 = imageView;
        AnonymousClass01X r3 = this.A1O;
        imageView.setImageDrawable(new C06470Tj(r3, C004302a.A03(A00(), R.drawable.input_send)));
        this.A09.setOnClickListener(new AnonymousClass2YD(this));
        this.A0E = (TextEmojiLabel) this.A07.findViewById(R.id.recipients);
        View findViewById = this.A07.findViewById(R.id.recipients_container);
        this.A06 = findViewById;
        ((ImageView) findViewById.findViewById(R.id.recipients_chevron)).setImageDrawable(new C06470Tj(r3, C004302a.A03(A00(), R.drawable.chevron_right)));
        return this.A07;
    }

    @Override // X.AnonymousClass037
    public void A0a(Context context) {
        super.A0a(context);
        this.A0Q = new C09110cJ(this.A1b, this.A18, this.A1L, this.A1M);
        try {
            this.A0H = ((AnonymousClass0Wl) context).A6j();
        } catch (ClassCastException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append(context.toString());
            sb.append(" must implement ContactPickerFragment$HostProvider");
            throw new ClassCastException(sb.toString());
        }
    }

    @Override // X.AnonymousClass037
    public void A0b(Bundle bundle) {
        boolean z;
        super.A0U = true;
        C04600Kz r2 = new C04600Kz("contactpicker/onactivitycreated");
        this.A0G = this.A1G.A03(A00());
        Toolbar toolbar = (Toolbar) this.A07.findViewById(R.id.toolbar);
        this.A0H.A00.A0C(toolbar);
        ActivityC004902h A0A2 = A0A();
        AnonymousClass01X r6 = this.A1O;
        this.A0D = new AnonymousClass0YP(A0A2, r6, this.A07.findViewById(R.id.search_holder), toolbar, new AnonymousClass2YE(this));
        AnonymousClass0S2 A092 = this.A0H.A00.A09();
        A092.A0A(true);
        A092.A08(r6.A06(R.string.whatsapp_contacts));
        C58822mb r4 = this.A0H;
        r4.A00.A0O(this.A1J.A0T.get());
        if (bundle == null || !bundle.containsKey("request_sync")) {
            z = A0o().getBoolean("request_sync", false);
        } else {
            z = bundle.getBoolean("request_sync", false);
        }
        this.A0n = z;
        C014508d r0 = this.A1T;
        r0.A05();
        if (!r0.A01) {
            A1t = true;
            AbstractC07170We r02 = this.A0H.A00.A00;
            if (r02.A06.A08(r02.A03)) {
                this.A0H.A00.A00.A02();
            }
        } else {
            A0s();
        }
        if (!this.A1q.isEmpty()) {
            if (this.A0z || this.A0t || this.A0x) {
                this.A06.setVisibility(0);
                this.A09.setVisibility(0);
                A0x();
            } else {
                if (this.A0C == null) {
                    AbstractC06100Rs r1 = this.A0B;
                    if (r1 == null) {
                        r1 = new AnonymousClass2YH(this);
                        this.A0B = r1;
                    }
                    this.A0C = this.A0H.A00.A0B(r1);
                }
                A10();
            }
        }
        if (bundle != null) {
            this.A0D.A02(bundle);
        }
        r2.A01();
    }

    @Override // X.AnonymousClass037
    public void A0c() {
        super.A0U = true;
        AnonymousClass0BP r1 = this.A0F;
        if (r1 != null) {
            this.A1D.A00(r1);
            this.A0F = null;
        }
        C47122Go r12 = this.A0N;
        if (r12 != null) {
            this.A1J.A0C.A00(r12);
            this.A0N = null;
        }
        this.A0G.A00();
        C10950fT r0 = this.A0J;
        if (r0 != null) {
            ((AnonymousClass0JW) r0).A00.cancel(true);
            this.A0J = null;
        }
        C10920fQ r02 = this.A0M;
        if (r02 != null) {
            ((AnonymousClass0JW) r02).A00.cancel(true);
            this.A0M = null;
        }
        AnonymousClass2YN r03 = this.A0L;
        if (r03 != null) {
            ((AnonymousClass0JW) r03).A00.cancel(true);
            this.A0L = null;
        }
        C10940fS r04 = this.A0K;
        if (r04 != null) {
            ((AnonymousClass0JW) r04).A00.cancel(true);
            this.A0K = null;
        }
    }

    @Override // X.AnonymousClass037
    public void A0e() {
        super.A0U = true;
        if (!A1t) {
            AnonymousClass1V1.A00(1);
            this.A0I.notifyDataSetChanged();
            A1t = false;
        }
    }

    @Override // X.AnonymousClass037
    public void A0g(int i, int i2, Intent intent) {
        View view;
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    this.A0Q.A00();
                } else if (i == 151 && i2 == -1) {
                    A16(null);
                }
            } else if (i2 == -1) {
                this.A0H.A00();
            }
        } else if (this.A1V.A0H() && (view = this.A08) != null) {
            view.setVisibility(8);
            this.A08 = null;
        }
    }

    @Override // X.AnonymousClass037
    public void A0i(Bundle bundle) {
        List<AnonymousClass02N> A0G2;
        super.A0i(bundle);
        if (bundle != null) {
            AnonymousClass02N A012 = AnonymousClass02N.A01(bundle.getString("jid"));
            if (A012 != null) {
                this.A0O = this.A1C.A0A(A012);
            }
            ArrayList<String> stringArrayList = bundle.getStringArrayList("selected_jids");
            if (!(stringArrayList == null || (A0G2 = AnonymousClass1VY.A0G(AnonymousClass02N.class, stringArrayList)) == null || A0G2.isEmpty())) {
                Map map = this.A1q;
                map.clear();
                for (AnonymousClass02N r1 : A0G2) {
                    C007003k A092 = this.A1C.A09(r1);
                    if (A092 != null) {
                        map.put(r1, A092);
                    }
                }
            }
        }
        A0I();
    }

    @Override // X.AnonymousClass037
    public void A0j(Bundle bundle) {
        Jid A022;
        bundle.putBoolean("request_sync", this.A0n);
        C007003k r1 = this.A0O;
        if (!(r1 == null || (A022 = r1.A02(AnonymousClass02N.class)) == null)) {
            bundle.putString("jid", A022.getRawString());
        }
        Map map = this.A1q;
        if (!map.isEmpty()) {
            bundle.putStringArrayList("selected_jids", AnonymousClass1VY.A0F(map.keySet()));
        }
        this.A0D.A03(bundle);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0041, code lost:
        if (r4.A0p != false) goto L_0x0043;
     */
    @Override // X.AnonymousClass037
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0k(android.view.Menu r5, android.view.MenuInflater r6) {
        /*
        // Method dump skipped, instructions count: 125
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.contact.picker.ContactPickerFragment.A0k(android.view.Menu, android.view.MenuInflater):void");
    }

    @Override // X.AnonymousClass037
    public boolean A0m(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.menuitem_refresh) {
            this.A0H.A00.A0O(true);
            A0w();
        } else if (itemId == R.id.menuitem_contacts) {
            PackageManager packageManager = A00().getPackageManager();
            Intent intent = new Intent("android.intent.action.VIEW", ContactsContract.Contacts.CONTENT_URI);
            intent.setComponent(intent.resolveActivity(packageManager));
            if (intent.getComponent() != null) {
                A0h(intent);
                return true;
            }
            try {
                Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage("com.android.contacts");
                if (launchIntentForPackage == null) {
                    this.A14.A06(R.string.view_contact_unsupport, 0);
                    return true;
                }
                A0h(launchIntentForPackage);
                return true;
            } catch (ActivityNotFoundException e) {
                Log.w("contact_picker/options/system contacts app could not found", e);
                this.A14.A06(R.string.view_contact_unsupport, 0);
                return true;
            }
        } else if (itemId == R.id.menuitem_tell_friend) {
            C09040cC r3 = this.A19;
            ActivityC004902h A0A2 = A0A();
            int i = 4;
            if (this.A0p) {
                i = 7;
            }
            r3.A02(A0A2, Integer.valueOf(i));
            return true;
        } else if (itemId == R.id.menuitem_search) {
            this.A0D.A01();
            return true;
        } else if (itemId == R.id.menuitem_contacts_help) {
            A0h(new Intent(A00(), ContactPickerHelp.class));
            return true;
        } else if (itemId == 16908332) {
            this.A0H.A00();
            return true;
        }
        return true;
    }

    public Dialog A0n(int i) {
        AnonymousClass01X r7;
        String A0D2;
        AnonymousClass01X r72;
        String A0D3;
        ActivityC004902h A0A2 = A0A();
        if (i == 1) {
            Map map = this.A1q;
            if (map.size() == 1) {
                this.A0O = (C007003k) map.values().iterator().next();
                map.clear();
            }
            if (!map.isEmpty()) {
                String A0D4 = this.A1F.A0D(map.values(), false);
                ArrayList arrayList = this.A0d;
                if (arrayList == null || arrayList.size() <= 1) {
                    r7 = this.A1O;
                    A0D2 = r7.A0D(R.string.confirm_sharing_title, A0D4);
                } else {
                    r7 = this.A1O;
                    A0D2 = r7.A0A(R.plurals.confirm_sharing_multiple_title, (long) arrayList.size(), Integer.valueOf(arrayList.size()), A0D4);
                }
            } else if (this.A0O.A09()) {
                ArrayList arrayList2 = this.A0d;
                if (arrayList2 == null || arrayList2.size() <= 1) {
                    r7 = this.A1O;
                    A0D2 = r7.A0D(R.string.group_confirm_sharing_title, this.A1F.A08(this.A0O, false));
                } else {
                    r7 = this.A1O;
                    A0D2 = r7.A0A(R.plurals.group_confirm_sharing_multiple_title, (long) arrayList2.size(), Integer.valueOf(arrayList2.size()), this.A1F.A08(this.A0O, false));
                }
            } else {
                ArrayList arrayList3 = this.A0d;
                if (arrayList3 == null || arrayList3.size() <= 1) {
                    r7 = this.A1O;
                    A0D2 = r7.A0D(R.string.confirm_sharing_title, this.A1F.A08(this.A0O, false));
                } else {
                    r7 = this.A1O;
                    A0D2 = r7.A0A(R.plurals.confirm_sharing_multiple_title, (long) arrayList3.size(), Integer.valueOf(arrayList3.size()), this.A1F.A08(this.A0O, false));
                }
            }
            AnonymousClass0MB r3 = new AnonymousClass0MB(A00());
            CharSequence A1J2 = C002001d.A1J(A0D2, A0A2, this.A1X);
            AnonymousClass0MC r2 = r3.A01;
            r2.A0E = A1J2;
            r2.A0J = true;
            r3.A05(r7.A06(R.string.cancel), new AnonymousClass2G4(this));
            r3.A07(r7.A06(R.string.ok), new AnonymousClass2GC(this));
            r2.A02 = new AnonymousClass2G6(this);
            return r3.A00();
        } else if (i == 2) {
            if (this.A0O.A09()) {
                r72 = this.A1O;
                A0D3 = r72.A0D(R.string.group_confirm_forward_msg, this.A1F.A08(this.A0O, false));
            } else {
                r72 = this.A1O;
                A0D3 = r72.A0D(R.string.confirm_forward_msg, this.A1F.A08(this.A0O, false));
            }
            AnonymousClass0MB r32 = new AnonymousClass0MB(A00());
            CharSequence A1J3 = C002001d.A1J(A0D3, A0A2, this.A1X);
            AnonymousClass0MC r22 = r32.A01;
            r22.A0E = A1J3;
            r22.A0J = true;
            r32.A05(r72.A06(R.string.cancel), new AnonymousClass2G9(this));
            r32.A07(r72.A06(R.string.ok), new AnonymousClass2G3(this));
            r22.A02 = new AnonymousClass2GA(this);
            return r32.A00();
        } else if (i != 3) {
            return null;
        } else {
            AnonymousClass01X r73 = this.A1O;
            String A0D5 = r73.A0D(R.string.group_confirm_set_icon, this.A1F.A08(this.A0O, false));
            AnonymousClass0MB r33 = new AnonymousClass0MB(A00());
            CharSequence A1J4 = C002001d.A1J(A0D5, A0A2, this.A1X);
            AnonymousClass0MC r23 = r33.A01;
            r23.A0E = A1J4;
            r23.A0J = true;
            r33.A05(r73.A06(R.string.cancel), new AnonymousClass2GE(this));
            r33.A07(r73.A06(R.string.ok), new AnonymousClass2G5(this));
            r23.A02 = new AnonymousClass2G7(this);
            return r33.A00();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (r2 == null) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.os.Bundle A0o() {
        /*
            r3 = this;
            android.os.Bundle r1 = r3.A06
            if (r1 == 0) goto L_0x001b
            java.lang.String r0 = "extras"
            android.os.Bundle r2 = r1.getBundle(r0)
            r1 = 1
            if (r2 != 0) goto L_0x000e
        L_0x000d:
            r1 = 0
        L_0x000e:
            java.lang.String r0 = "extras should not be null (it should be an empty bundle if there are nothing)"
            X.AnonymousClass00E.A08(r1, r0)
            if (r2 != 0) goto L_0x001a
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
        L_0x001a:
            return r2
        L_0x001b:
            r2 = 0
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.contact.picker.ContactPickerFragment.A0o():android.os.Bundle");
    }

    public View A0p(int i, int i2, View.OnClickListener onClickListener) {
        View inflate = A05().inflate(R.layout.contact_picker_row_small, (ViewGroup) null, false);
        AnonymousClass01X r3 = this.A1O;
        inflate.setBackgroundResource(R.drawable.selector_orange_gradient);
        ThumbnailButton thumbnailButton = (ThumbnailButton) inflate.findViewById(R.id.contactpicker_row_photo);
        thumbnailButton.setImageResource(i);
        thumbnailButton.setScaleType(ImageView.ScaleType.CENTER);
        thumbnailButton.setBackgroundResource(R.drawable.green_circle);
        thumbnailButton.A06 = true;
        TextView textView = (TextView) inflate.findViewById(R.id.contactpicker_row_name);
        C002301g.A03(textView);
        textView.setText(r3.A06(i2));
        inflate.findViewById(R.id.contactpicker_row_status).setVisibility(8);
        inflate.setOnClickListener(onClickListener);
        FrameLayout frameLayout = new FrameLayout(A00());
        frameLayout.addView(inflate);
        this.A1p.add(inflate);
        AnonymousClass0Q7.A0W(frameLayout, 2);
        return frameLayout;
    }

    public String A0q(C007003k r4) {
        if (!(this instanceof PaymentContactPickerFragment)) {
            return null;
        }
        PaymentContactPickerFragment paymentContactPickerFragment = (PaymentContactPickerFragment) this;
        if (!paymentContactPickerFragment.A01.A06((UserJid) r4.A02(UserJid.class))) {
            return paymentContactPickerFragment.A1O.A06(R.string.contact_cant_receive_payments);
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x008a, code lost:
        if (r8.A0x != false) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00f2, code lost:
        if (r8.A0p != false) goto L_0x00f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0155, code lost:
        if (r8.A0s != false) goto L_0x0157;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0r() {
        /*
        // Method dump skipped, instructions count: 605
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.contact.picker.ContactPickerFragment.A0r():void");
    }

    public void A0s() {
        String str;
        Parcelable parcelable;
        ComponentName component;
        String queryParameter;
        String queryParameter2;
        int length;
        AnonymousClass02N A012;
        Set A022;
        int length2;
        int length3;
        C007003k A092;
        Bundle bundle = super.A06;
        Bundle A0o2 = A0o();
        String string = bundle.getString("action");
        Uri uri = A0o2.get("uri") instanceof Uri ? (Uri) A0o2.get("uri") : null;
        HashSet hashSet = this.A1o;
        hashSet.clear();
        this.A0k = A0o2.getBoolean("enforce_hfm_limit", false);
        this.A0u = A0o2.getBoolean("forward_ctwa", false);
        if (string != null && string.equals("android.intent.action.CREATE_SHORTCUT")) {
            this.A0q = true;
        } else if (A0o2.getBoolean("call_picker", false)) {
            this.A0p = true;
        } else if (A0o2.getBoolean("for_group_call", false)) {
            this.A0s = true;
            this.A0H.A00.A09().A08(this.A1O.A06(R.string.voip_call_add_person_description));
        } else if (A0o2.getBoolean("for_payments", false)) {
            this.A0w = true;
        } else if (A0o2.getBoolean("forward", false)) {
            this.A0H.A00.A09().A08(this.A1O.A06(R.string.forward_to));
            this.A0t = true;
            this.A0P = AnonymousClass02N.A01(A0o2.getString("forward_jid"));
            ArrayList<Integer> integerArrayList = A0o2.getIntegerArrayList("message_types");
            if (integerArrayList != null) {
                hashSet.addAll(integerArrayList);
                this.A01 = A0o2.getInt("forward_messages_becoming_frequently_forwarded", 0);
                this.A0l = A0o2.getBoolean("forward_highly_forwarded", false);
            } else {
                throw null;
            }
        } else if (A0o2.getBoolean("send", false)) {
            AnonymousClass0S2 A093 = this.A0H.A00.A09();
            AnonymousClass01X r6 = this.A1O;
            A093.A08(r6.A06(R.string.select_contacts));
            this.A0x = true;
            ArrayList<Integer> integerArrayList2 = A0o2.getIntegerArrayList("message_types");
            if (integerArrayList2 != null) {
                hashSet.addAll(integerArrayList2);
                if (A0o2.getBoolean("skip_preview", false)) {
                    this.A09.setImageDrawable(new C06470Tj(r6, C004302a.A03(A00(), R.drawable.input_send)));
                } else {
                    this.A09.setImageDrawable(new C06470Tj(r6, C004302a.A03(A00(), R.drawable.ic_action_arrow_next)));
                    this.A0H.A00.A09().A08(r6.A06(R.string.send_to));
                }
            } else {
                throw null;
            }
        } else if (A0o2.getBoolean("set_group_icon", false)) {
            this.A0H.A00.A09().A08(this.A1O.A06(R.string.contact_picker_choose_group));
            this.A0y = true;
        } else if (A0o2.getBoolean("email_history", false)) {
            this.A0H.A00.A09().A08(this.A1O.A06(R.string.contact_picker_choose_chat));
            this.A0r = true;
        } else if (A0o2.getBoolean("block_contact", false)) {
            this.A0o = true;
            ArrayList<String> stringArrayList = A0o2.getStringArrayList("blocked_list");
            if (stringArrayList != null) {
                this.A1r.addAll(AnonymousClass1VY.A0G(AnonymousClass02N.class, stringArrayList));
            }
        } else if (uri != null) {
            this.A0H.A00.A09().A08(this.A1O.A06(R.string.send_to));
            C48032Kq r14 = this.A1U;
            String A023 = C06190Sd.A02(uri);
            String queryParameter3 = uri.getQueryParameter("text");
            if (queryParameter3 != null) {
                int i = C06190Sd.A02;
                AnonymousClass0M6 r9 = new AnonymousClass0M6(queryParameter3);
                int i2 = 0;
                int i3 = 0;
                while (i2 < queryParameter3.length() && i3 < i) {
                    r9.A00 = i2;
                    int A002 = EmojiDescriptor.A00(r9, false);
                    if (A002 != -1) {
                        i3++;
                    }
                    i2 += r9.A01(i2, A002);
                }
                queryParameter3 = C003701u.A07(queryParameter3.substring(0, i2), 8000);
            }
            String queryParameter4 = uri.getQueryParameter("data");
            if (queryParameter4 != null && (length3 = queryParameter4.length()) > 512) {
                StringBuilder A0S2 = AnonymousClass008.A0S("deeplinkhelper/parseChatUri/Stripping data due to being too long. Length = ");
                A0S2.append(length3);
                A0S2.append(", max = 512.");
                Log.w(A0S2.toString());
                queryParameter4 = null;
            }
            String queryParameter5 = uri.getQueryParameter("source");
            if (queryParameter5 != null && (length2 = queryParameter5.length()) > 32) {
                StringBuilder A0S3 = AnonymousClass008.A0S("deeplinkhelper/parseChatUri/Stripping source due to being too long. Length = ");
                A0S3.append(length2);
                A0S3.append(", max = 32.");
                Log.w(A0S3.toString());
                queryParameter5 = null;
            }
            String queryParameter6 = uri.getQueryParameter("ref");
            String queryParameter7 = uri.getQueryParameter("source_url");
            if (queryParameter7 == null || (A022 = r14.A02(queryParameter7, AnonymousClass02N.A01(A023))) == null || A022.isEmpty()) {
                queryParameter = uri.getQueryParameter("context");
                if (queryParameter == null) {
                    queryParameter = queryParameter4;
                }
                queryParameter2 = uri.getQueryParameter("icebreaker");
                if (queryParameter2 != null && (length = queryParameter2.length()) >= 140) {
                    StringBuilder A0S4 = AnonymousClass008.A0S("deeplinkhelper/parseChatUri/parseIcebreaker/Stripping data due to being too long. Length = ");
                    A0S4.append(length);
                    A0S4.append(", max = 140.");
                    Log.w(A0S4.toString());
                    queryParameter2 = null;
                }
            } else {
                queryParameter = null;
                queryParameter2 = null;
                queryParameter3 = null;
                queryParameter4 = null;
                queryParameter7 = null;
            }
            this.A00 = 0;
            this.A0Y = queryParameter3;
            this.A0U = queryParameter;
            this.A0W = queryParameter2;
            this.A0b = queryParameter7;
            if (!TextUtils.isEmpty(queryParameter3)) {
                this.A0m = true;
                C44261zl r5 = new C44261zl();
                r5.A00 = Boolean.valueOf(!TextUtils.isEmpty(A023));
                r5.A01 = Boolean.TRUE;
                this.A1b.A09(r5, 1);
                AnonymousClass00Y.A01(r5, "");
                if (!TextUtils.isEmpty(A023)) {
                    if (this.A0K != null) {
                        Log.i("contactpicker/textanddirectchatlink/skip/synctask-already-exists");
                    } else {
                        A19(A023, true, queryParameter4, queryParameter5);
                    }
                } else if (queryParameter6 != null) {
                    AnonymousClass00D r10 = this.A16.A03;
                    SharedPreferences sharedPreferences = r10.A00;
                    if (queryParameter6.equals(sharedPreferences.getString("return_chat_id", null)) && (A012 = AnonymousClass02N.A01(sharedPreferences.getString("return_chat_jid", null))) != null) {
                        A16(new C007003k(A012));
                        AnonymousClass008.A0m(r10, "return_chat_jid", null);
                        AnonymousClass008.A0m(r10, "return_chat_id", null);
                    }
                }
            } else if (TextUtils.isEmpty(A023)) {
                A18("contactpicker/textanddirectchatlink/link-failed/no-text-or-phone", R.string.invalid_chat_link);
            } else {
                C44261zl r52 = new C44261zl();
                r52.A00 = Boolean.TRUE;
                r52.A01 = Boolean.FALSE;
                this.A1b.A09(r52, 1);
                AnonymousClass00Y.A01(r52, "");
                if (this.A0K != null) {
                    Log.i("contactpicker/textanddirectchatlink/skip/synctask-already-exists");
                } else {
                    A19(A023, false, queryParameter4, queryParameter5);
                }
            }
            this.A0j = false;
            this.A0z = true;
            hashSet.add(0);
        } else if (!A0o2.isEmpty()) {
            AnonymousClass0S2 A094 = this.A0H.A00.A09();
            AnonymousClass01X r62 = this.A1O;
            A094.A08(r62.A06(R.string.send_to));
            this.A0j = true;
            this.A0z = true;
            String string2 = bundle.getString("type");
            this.A0X = string2;
            if (string2 == null) {
                StringBuilder A0S5 = AnonymousClass008.A0S("contactpicker/type/null ");
                A0S5.append(A0o2.toString());
                Log.i(A0S5.toString());
                if (A0o2.containsKey("android.intent.extra.TEXT")) {
                    this.A00 = 0;
                } else {
                    this.A14.A06(R.string.share_file_format_unsupport, 0);
                    this.A0H.A00();
                    return;
                }
            } else {
                byte A052 = C02230Bd.A05(string2);
                this.A00 = A052;
                if (A052 == 0 && A0o2.containsKey("android.intent.extra.STREAM")) {
                    this.A00 = 9;
                }
                AnonymousClass008.A1K(AnonymousClass008.A0S("contactpicker/set wa_type = "), this.A00);
            }
            try {
                ActivityManager A013 = this.A1L.A01();
                if (A013 == null) {
                    Log.w("contactpicker/set am=null");
                } else {
                    for (ActivityManager.RecentTaskInfo recentTaskInfo : A013.getRecentTasks(4, 1)) {
                        Intent intent = recentTaskInfo.baseIntent;
                        if (!(intent == null || (component = intent.getComponent()) == null)) {
                            String packageName = component.getPackageName();
                            if ("com.juggersoft.whatsappfilesender".equals(packageName) || "com.whatsend".equals(packageName)) {
                                A18("contactpicker/share/badfile", R.string.cannot_share_selected_file);
                                return;
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            }
            byte b = this.A00;
            if (b == 0) {
                String string3 = A0o2.getString("android.intent.extra.TEXT");
                if (string3 != null) {
                    byte[] bytes = string3.getBytes();
                    if (bytes.length > 4096) {
                        string3 = new String(bytes, 0, 4096);
                    }
                    this.A0Y = AnonymousClass008.A0O(new StringBuilder(), this.A0Y, string3);
                }
                if (!C002001d.A3R(this.A1L, this.A1d, this.A0Y)) {
                    A18("contactpicker/share_text/empty", R.string.cannot_send_empty_text_message);
                    return;
                }
                C27261Ou.A01(this.A1Z, this.A14, this.A1l, r62, AnonymousClass1Y8.A01(this.A0Y), null);
                this.A0j = false;
                hashSet.add(0);
                Log.d("contactpicker/share/msg");
            } else if (b == 4) {
                if (A0o2.containsKey("android.intent.extra.TEXT")) {
                    str = A0o2.getCharSequence("android.intent.extra.TEXT").toString();
                    StringBuilder A0S6 = AnonymousClass008.A0S("contactpicker/share/text [");
                    A0S6.append(str.length());
                    A0S6.append("]");
                    Log.i(A0S6.toString());
                } else {
                    if (A0o2.containsKey("android.intent.extra.STREAM") && (parcelable = A0o2.getParcelable("android.intent.extra.STREAM")) != null) {
                        Uri parse = Uri.parse(parcelable.toString());
                        if (parse != null) {
                            StringBuilder A0S7 = AnonymousClass008.A0S("contactpicker/share/stream/");
                            A0S7.append(parse.toString());
                            Log.i(A0S7.toString());
                            try {
                                str = this.A1m.A02(parse);
                            } catch (IOException unused2) {
                                this.A14.A06(R.string.vcard_format_unsupport, 0);
                                this.A0H.A00();
                                return;
                            }
                        } else {
                            StringBuilder A0S8 = AnonymousClass008.A0S("contactpicker/share/stream/vcard uri is not valid. ");
                            A0S8.append(parcelable.toString());
                            Log.i(A0S8.toString());
                        }
                    }
                    Log.w("contact_picker/share intent does not reference VCard data");
                    this.A14.A06(R.string.share_failed, 0);
                    this.A0H.A00();
                    return;
                }
                try {
                    AnonymousClass36X A014 = this.A1m.A01(str);
                    ArrayList arrayList = A014.A01;
                    if (arrayList.size() > 1) {
                        this.A0e = arrayList;
                        hashSet.add(14);
                        this.A00 = 14;
                    } else {
                        this.A0Z = (String) arrayList.get(0);
                        this.A0a = A014.A00;
                        hashSet.add(4);
                        this.A00 = 4;
                    }
                } catch (AnonymousClass3D8 e) {
                    this.A1m.A03(e);
                    this.A0H.A00();
                    return;
                }
            } else {
                ArrayList parcelableArrayList = A0o2.getParcelableArrayList("android.intent.extra.STREAM");
                this.A0d = parcelableArrayList;
                if (parcelableArrayList == null) {
                    Parcelable parcelable2 = A0o2.getParcelable("android.intent.extra.STREAM");
                    StringBuilder sb = new StringBuilder();
                    sb.append("contactpicker/share/uri ");
                    sb.append(parcelable2);
                    Log.i(sb.toString());
                    if (parcelable2 != null) {
                        ArrayList arrayList2 = new ArrayList();
                        this.A0d = arrayList2;
                        arrayList2.add(parcelable2);
                    }
                } else {
                    AnonymousClass008.A1b(parcelableArrayList, AnonymousClass008.A0S("contactpicker/share/uris "));
                    Iterator it = this.A0d.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("contactpicker/share/uri ");
                        sb2.append(next);
                        Log.i(sb2.toString());
                    }
                }
                ArrayList arrayList3 = this.A0d;
                if (arrayList3 == null || arrayList3.isEmpty()) {
                    StringBuilder A0S9 = AnonymousClass008.A0S("contactpicker/share_uris/null ");
                    A0S9.append(A0o2.toString());
                    A18(A0S9.toString(), R.string.share_failed);
                    return;
                }
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    Uri uri2 = (Uri) it2.next();
                    File A0B2 = C006803i.A0B(uri2);
                    if (A0B2 != null) {
                        try {
                            C007703s r142 = this.A1j;
                            String canonicalPath = A0B2.getCanonicalPath();
                            StatResult A015 = C007703s.A01(canonicalPath);
                            StringBuilder sb3 = new StringBuilder("canonicalFilePath=");
                            sb3.append(canonicalPath);
                            r142.A05(A015, sb3.toString());
                        } catch (IOException e2) {
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("contactpicker/shared-internal-file ");
                            sb4.append(uri2);
                            Log.e(sb4.toString(), e2);
                            this.A14.A06(R.string.share_file_format_unsupport, 0);
                            this.A0d = null;
                            this.A0H.A00();
                            return;
                        }
                    }
                    byte A053 = this.A1k.A05(uri2);
                    if (A053 == -1) {
                        StringBuilder sb5 = new StringBuilder("contactpicker/share/unsupported ");
                        sb5.append(uri2);
                        sb5.append(" ");
                        sb5.append(C02230Bd.A0O(this.A1L.A06(), uri2));
                        sb5.append(" ");
                        sb5.append(C02230Bd.A0P(uri2));
                        Log.e(sb5.toString());
                        this.A14.A06(R.string.share_file_format_unsupport, 0);
                        this.A0d = null;
                        this.A0H.A00();
                        return;
                    } else if (MediaProvider.A01().match(uri2) != 4 || A0A().getPackageName().equals(A0A().getCallingPackage())) {
                        hashSet.add(Integer.valueOf(A053));
                    } else {
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append("contactpicker/shared-internal-file ");
                        sb6.append(uri2);
                        Log.e(sb6.toString());
                        this.A0d = null;
                        this.A0H.A00();
                        return;
                    }
                }
                if ((hashSet.contains(1) || hashSet.contains(3) || hashSet.contains(13) || A1E()) && !A0o2.getBoolean("skip_preview", false)) {
                    this.A09.setImageDrawable(new C06470Tj(r62, C004302a.A03(A00(), R.drawable.ic_action_arrow_next)));
                } else {
                    this.A09.setImageDrawable(new C06470Tj(r62, C004302a.A03(A00(), R.drawable.input_send)));
                }
                ArrayList arrayList4 = this.A0d;
                if (arrayList4.size() > 30) {
                    this.A14.A0C(C28051Sr.A0s(r62, 30), 0);
                    this.A0d = null;
                    this.A0H.A00();
                    return;
                }
                Context A003 = A00();
                Iterator it3 = arrayList4.iterator();
                while (it3.hasNext()) {
                    try {
                        A003.grantUriPermission("com.whatsapp", (Uri) it3.next(), 1);
                    } catch (SecurityException e3) {
                        Log.w("contactpicker/permission ", e3);
                    }
                }
            }
        } else {
            this.A0v = true;
        }
        int i4 = this.A01;
        if (i4 == 0) {
            View view = this.A05;
            if (view != null) {
                view.setVisibility(8);
            }
        } else if (this.A05 == null) {
            ViewGroup viewGroup = (ViewGroup) this.A07.findViewById(R.id.frequently_forwarded_holder);
            this.A05 = A05().inflate(R.layout.frequently_forwarded_info, viewGroup, true);
            AnonymousClass01X r1 = this.A1O;
            int i5 = R.string.frequently_forwarded_picker_info_multiple_messages;
            if (i4 == 1) {
                i5 = R.string.frequently_forwarded_picker_info_single_message;
            }
            Spanned fromHtml = Html.fromHtml(r1.A06(i5));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(fromHtml);
            URLSpan[] uRLSpanArr = (URLSpan[]) fromHtml.getSpans(0, fromHtml.length(), URLSpan.class);
            if (uRLSpanArr != null) {
                for (URLSpan uRLSpan : uRLSpanArr) {
                    if ("learn-more".equals(uRLSpan.getURL())) {
                        int spanStart = spannableStringBuilder.getSpanStart(uRLSpan);
                        int spanEnd = spannableStringBuilder.getSpanEnd(uRLSpan);
                        int spanFlags = spannableStringBuilder.getSpanFlags(uRLSpan);
                        spannableStringBuilder.removeSpan(uRLSpan);
                        spannableStringBuilder.setSpan(new C58812ma(this, this.A07.getContext()), spanStart, spanEnd, spanFlags);
                    }
                }
            }
            TextEmojiLabel textEmojiLabel = (TextEmojiLabel) this.A05.findViewById(R.id.info_text);
            textEmojiLabel.A07 = new C05710Pt();
            textEmojiLabel.setAccessibilityHelper(new C05720Pu(textEmojiLabel));
            textEmojiLabel.setText(spannableStringBuilder);
            this.A05.setVisibility(0);
            viewGroup.setVisibility(0);
        }
        AnonymousClass02N A016 = AnonymousClass02N.A01(A0o2.getString("jid"));
        if (!(A016 == null || (A092 = this.A1C.A09(A016)) == null)) {
            A1F(A092, null);
        }
        if (A0o2.containsKey("contacts_to_exclude")) {
            this.A1r.addAll(AnonymousClass1VY.A0G(AnonymousClass02N.class, A0o2.getStringArrayList("contacts_to_exclude")));
        }
        Log.d("contactpicker/messagestoreverified/initcontacts");
        if (this.A0n) {
            this.A0n = false;
            A0w();
        } else {
            A0u();
        }
        A0r();
        AnonymousClass2YF r12 = new AnonymousClass2YF(this);
        this.A0F = r12;
        this.A1D.A01(r12);
        AnonymousClass2YG r13 = new AnonymousClass2YG(this);
        this.A0N = r13;
        this.A1J.A0C.A01(r13);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0053, code lost:
        if (r42.A0k != false) goto L_0x0055;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0t() {
        /*
        // Method dump skipped, instructions count: 144
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.contact.picker.ContactPickerFragment.A0t():void");
    }

    public final void A0u() {
        C10920fQ r0 = this.A0M;
        if (r0 != null) {
            ((AnonymousClass0JW) r0).A00.cancel(true);
        }
        AnonymousClass2YN r02 = this.A0L;
        if (r02 != null) {
            ((AnonymousClass0JW) r02).A00.cancel(true);
            this.A0L = null;
        }
        C10920fQ r2 = new C10920fQ(this, this.A1o, this.A0P, this.A0r, this.A0o, this.A0z, this.A0q, this.A0t, this.A0y, this.A0p, this.A0s, this.A0v, this.A0x, this.A0w, this.A0k, this.A1C, this.A12, this.A1B, this.A1R, this.A1S);
        this.A0M = r2;
        this.A1l.ANC(r2, new Void[0]);
    }

    public final void A0v() {
        List list = null;
        Intent intent = new Intent(A0A(), GroupCallParticipantPicker.class);
        if (0 != 0) {
            intent.putStringArrayListExtra("jids", AnonymousClass1VY.A0F(null));
        }
        if (0 != 0) {
            intent.putExtra("source_group_jid", (Parcelable) null);
        }
        intent.putExtra("hidden_jids", 0);
        if (0 != 0 && !list.isEmpty()) {
            intent.putStringArrayListExtra("selected", AnonymousClass1VY.A0F(null));
        }
        intent.putExtra("call_from_ui", 16);
        A0M(intent, 2, null);
    }

    public final void A0w() {
        AnonymousClass01I r0 = this.A15;
        r0.A04();
        if (r0.A00 == null) {
            this.A14.A06(R.string.finish_registration_first, 1);
            return;
        }
        this.A0H.A00.A0O(true);
        C10950fT r02 = this.A0J;
        if (r02 != null) {
            ((AnonymousClass0JW) r02).A00.cancel(true);
        }
        C10950fT r2 = new C10950fT(this, this.A1C, this.A1I, this.A1Q);
        this.A0J = r2;
        this.A1l.ANC(r2, new Void[0]);
    }

    public final void A0x() {
        String A082;
        Map map = this.A1q;
        ArrayList arrayList = new ArrayList(map.size());
        for (C007003k r1 : map.values()) {
            if (AnonymousClass1VY.A0b(r1.A09)) {
                A082 = this.A1O.A06(R.string.my_status);
            } else {
                A082 = this.A1F.A08(r1, false);
            }
            if (A082 != null) {
                arrayList.add(0, A082);
            }
        }
        this.A0E.A02(C002001d.A1g(this.A1F.A02, false, arrayList));
        AnonymousClass01X r3 = this.A1O;
        if (r3.A02().A06) {
            HorizontalScrollView horizontalScrollView = (HorizontalScrollView) this.A06.findViewById(R.id.recipients_scroller);
            horizontalScrollView.getViewTreeObserver().addOnGlobalLayoutListener(new AnonymousClass2GP(horizontalScrollView));
        }
        if (!TextUtils.isEmpty(this.A0Y)) {
            this.A09.setImageDrawable(new C06470Tj(r3, C004302a.A03(A00(), R.drawable.ic_action_arrow_next)));
        }
    }

    public final void A0y() {
        if (this.A02 + 3500 < SystemClock.elapsedRealtime()) {
            this.A02 = SystemClock.elapsedRealtime();
            this.A14.A0C(this.A1O.A0A(R.plurals.text_status_truncation_info, 700, 700), 1);
        }
    }

    public final void A0z() {
        if (this.A03 + 3500 < SystemClock.elapsedRealtime()) {
            this.A03 = SystemClock.elapsedRealtime();
            this.A1h.A02();
        }
    }

    public final void A10() {
        if (this.A0C != null) {
            Map map = this.A1q;
            if (map.isEmpty()) {
                this.A0C.A00();
            } else {
                this.A0C.A04(this.A1O.A0G().format((long) map.size()));
            }
        }
    }

    public void A11(int i) {
        Context A002 = A00();
        if (A002 != null) {
            if (i == R.string.directly_entered_number_not_whatsappable || i == R.string.directly_entered_number_invalid || i == R.string.directly_entered_number_sync_failed || i == R.string.directly_entered_number_not_checked || i == R.string.directly_entered_number_is_missing_country_code || i == R.string.directly_entered_number_invalid_length || i == R.string.directly_entered_number_invalid_length_without_country_name || i == R.string.directly_entered_number_too_long || i == R.string.directly_entered_number_too_long_without_country_name || i == R.string.directly_entered_number_too_short || i == R.string.directly_entered_number_too_short_without_country_name || i == R.string.directly_entered_number_too_short_without_country_code) {
                A0h(new Intent(A002, Main.class));
                this.A0H.A00();
            }
        }
    }

    public final void A12(Intent intent) {
        String str = this.A0S;
        if (str != null && this.A0T != null) {
            intent.putExtra("conversion_data", str);
            intent.putExtra("conversion_source", this.A0T);
        }
    }

    public void A13(AnonymousClass2GS r6) {
        AnonymousClass2YM r1 = this.A0I;
        r1.A02 = r6.A00;
        r1.notifyDataSetChanged();
        List list = r6.A01;
        boolean z = false;
        int i = 8;
        if (list == null) {
            i = 0;
        }
        for (View view : this.A1p) {
            view.setVisibility(i);
        }
        if (this.A0v || this.A0p) {
            if (list == null) {
                z = true;
            }
            A1B(z);
        }
    }

    public void A14(AnonymousClass2GT r4) {
        ArrayList arrayList = r4.A00;
        this.A0f = arrayList;
        this.A0i = r4.A03;
        this.A0g = r4.A01;
        this.A0h = r4.A02;
        MenuItem menuItem = this.A04;
        if (menuItem != null) {
            menuItem.setVisible(!arrayList.isEmpty());
        }
        A0t();
    }

    public final void A15(C007003k r9) {
        C09040cC r7 = this.A19;
        Activity A002 = C02780Dk.A00(A00());
        StringBuilder A0S2 = AnonymousClass008.A0S("sms:");
        A0S2.append(C12420i4.A00(r9));
        Uri parse = Uri.parse(A0S2.toString());
        String A0D2 = this.A1O.A0D(R.string.tell_a_friend_sms, "https://whatsapp.com/dl/");
        int i = 14;
        if (this.A0p) {
            i = 15;
        }
        r7.A01(A002, parse, A0D2, Integer.valueOf(i));
    }

    public final void A16(C007003k r22) {
        Intent intent;
        Jid A022;
        if (this.A0d == null || this.A1M.A06()) {
            Map map = this.A1q;
            if (map.size() == 1 && !AnonymousClass1VY.A0b(((C007003k) map.values().iterator().next()).A09)) {
                this.A0O = (C007003k) map.values().iterator().next();
                map.clear();
            }
            this.A0H.A00.setResult(-1);
            if (this.A0O == null && r22 == null) {
                ArrayList arrayList = new ArrayList(map.size());
                for (C007003k r3 : map.values()) {
                    arrayList.add(r3.A02(AnonymousClass02N.class));
                }
                if (TextUtils.isEmpty(this.A0Y)) {
                    String str = this.A0Z;
                    if (str != null) {
                        this.A1A.A0V(arrayList, this.A0a, str, null, false);
                        this.A0H.A00.A0S(arrayList);
                        if (map.size() > 1) {
                            C58822mb r32 = this.A0H;
                            ActivityC004902h A0A2 = A0A();
                            if (A0A2 != null) {
                                r32.A00.A0I(HomeActivity.A05(A0A2), false);
                            } else {
                                throw null;
                            }
                        }
                        this.A0H.A00();
                        return;
                    }
                    ArrayList arrayList2 = this.A0e;
                    if (arrayList2 != null) {
                        this.A1A.A0W(arrayList, arrayList2, null, false);
                        this.A0H.A00.A0S(arrayList);
                        if (map.size() > 1) {
                            C58822mb r33 = this.A0H;
                            ActivityC004902h A0A3 = A0A();
                            if (A0A3 != null) {
                                r33.A00.A0I(HomeActivity.A05(A0A3), false);
                            } else {
                                throw null;
                            }
                        }
                        this.A0H.A00();
                        return;
                    }
                    ArrayList arrayList3 = this.A0d;
                    if (!(arrayList3 == null || arrayList3.isEmpty())) {
                        if (A1E()) {
                            A1A(arrayList);
                            return;
                        }
                        Bundle A0o2 = A0o();
                        A0o2.putString("mime_type", this.A0X);
                        this.A17.A06(true, arrayList, this.A0d, A0o2.getString("android.intent.extra.TEXT"), A0o2.getInt("origin", 0), A0o2.getBoolean("skip_preview", false), A0B(), this.A0H, new AnonymousClass2YJ(this, arrayList));
                    }
                } else if (map.size() != 1 || !AnonymousClass1VY.A0b(((C007003k) map.values().iterator().next()).A09)) {
                    C58822mb r8 = this.A0H;
                    String str2 = this.A0Y;
                    boolean z = this.A0m;
                    SharedTextPreviewDialogFragment sharedTextPreviewDialogFragment = new SharedTextPreviewDialogFragment();
                    BaseSharedPreviewDialogFragment baseSharedPreviewDialogFragment = new BaseSharedPreviewDialogFragment();
                    Bundle bundle = new Bundle();
                    bundle.putStringArrayList("jids", AnonymousClass1VY.A0F(arrayList));
                    baseSharedPreviewDialogFragment.A0N(bundle);
                    Bundle bundle2 = ((AnonymousClass037) baseSharedPreviewDialogFragment).A06;
                    if (bundle2 != null) {
                        bundle2.putString("message", str2);
                        bundle2.putBoolean("has_text_from_url", z);
                        sharedTextPreviewDialogFragment.A0N(bundle2);
                        r8.APl(sharedTextPreviewDialogFragment, null);
                        return;
                    }
                    throw null;
                } else {
                    Intent intent2 = new Intent(A00(), TextStatusComposerActivity.class);
                    intent2.putExtra("android.intent.extra.TEXT", this.A0Y);
                    this.A0H.A00.A0I(intent2, true);
                }
            } else if (A1E()) {
                C007003k r2 = this.A0O;
                if (r2 != null) {
                    A022 = r2.A02(AnonymousClass02N.class);
                } else {
                    A022 = r22.A02(AnonymousClass02N.class);
                }
                A1A(Collections.singletonList(A022));
            } else {
                C007003k r1 = this.A0O;
                if (r1 == null) {
                    r1 = r22;
                }
                boolean z2 = false;
                if (r22 != null) {
                    z2 = true;
                }
                Jid jid = r1.A09;
                AnonymousClass00E.A07(!AnonymousClass1VY.A0b(jid));
                if (this.A0d != null) {
                    Bundle A0o3 = A0o();
                    intent = new Intent(A00(), Conversation.class);
                    Jid jid2 = r1.A09;
                    if (jid2 != null) {
                        intent.putExtra("jid", jid2.getRawString());
                        intent.putExtra("wa_type", this.A00);
                        intent.putExtra("has_share", true);
                        A12(intent);
                        intent.putExtra("skip_preview", A0o3.getBoolean("skip_preview", false));
                        intent.putExtra("origin", A0o3.getInt("origin", 0));
                        intent.putExtra("android.intent.extra.TEXT", A0o3.getString("android.intent.extra.TEXT"));
                        intent.putParcelableArrayListExtra("android.intent.extra.STREAM", this.A0d);
                        intent.addFlags(335544320);
                    } else {
                        throw null;
                    }
                } else if (A1G(UserJid.of(jid))) {
                    Context A002 = A00();
                    if (A002 != null) {
                        boolean z3 = !this.A0j;
                        boolean z4 = this.A0m;
                        byte b = this.A00;
                        Jid A023 = r1.A02(AnonymousClass02N.class);
                        if (A023 != null) {
                            String str3 = this.A0U;
                            String str4 = this.A0W;
                            String str5 = this.A0b;
                            intent = new Intent(A002, Conversation.class);
                            intent.putExtra("jid", A023.getRawString());
                            intent.putExtra("wa_type", b);
                            intent.putExtra("has_share", true);
                            intent.putExtra("confirm", z3);
                            intent.putExtra("text_from_url", z4);
                            intent.putExtra("number_from_url", z2);
                            intent.putExtra("iq_code", str3);
                            intent.putExtra("icebreaker", str4);
                            intent.putExtra("source_url", str5);
                            intent.addFlags(335544320);
                            Conversation.A0A(A002, intent);
                            A12(intent);
                        } else {
                            throw null;
                        }
                    } else {
                        throw null;
                    }
                } else if (!TextUtils.isEmpty(this.A0Y)) {
                    Context A003 = A00();
                    if (A003 != null) {
                        boolean z5 = !this.A0j;
                        boolean z6 = this.A0m;
                        String str6 = this.A0Y;
                        byte b2 = this.A00;
                        Jid A024 = r1.A02(AnonymousClass02N.class);
                        if (A024 != null) {
                            intent = Conversation.A07(A003, z5, z6, str6, b2, (AnonymousClass02N) A024, z2);
                            A12(intent);
                            if (intent == null) {
                                return;
                            }
                        } else {
                            throw null;
                        }
                    } else {
                        throw null;
                    }
                } else if (this.A0Z != null) {
                    intent = new Intent(A00(), Conversation.class);
                    Jid jid3 = r1.A09;
                    if (jid3 != null) {
                        intent.putExtra("jid", jid3.getRawString());
                        intent.putExtra("vcard_str", this.A0Z);
                        intent.putExtra("vcard_name", this.A0a);
                        intent.putExtra("wa_type", this.A00);
                        intent.putExtra("has_share", true);
                        intent.addFlags(335544320);
                    } else {
                        throw null;
                    }
                } else if (this.A0e != null) {
                    intent = new Intent(A00(), Conversation.class);
                    Jid jid4 = r1.A09;
                    if (jid4 != null) {
                        intent.putExtra("jid", jid4.getRawString());
                        intent.putStringArrayListExtra("vcard_array_str", this.A0e);
                        intent.putExtra("wa_type", this.A00);
                        intent.putExtra("has_share", true);
                        intent.addFlags(335544320);
                    } else {
                        throw null;
                    }
                } else {
                    return;
                }
                Conversation.A0A(A00(), intent);
                this.A0H.A00.A0I(intent, true);
            }
        } else {
            C58822mb r5 = this.A0H;
            ActivityC004902h A0A4 = A0A();
            if (A0A4 != null) {
                int i = Build.VERSION.SDK_INT;
                int i2 = R.string.permission_storage_need_write_access_on_sharing_v30;
                if (i < 30) {
                    i2 = R.string.permission_storage_need_write_access_on_sharing;
                }
                r5.A00.A0H(RequestPermissionActivity.A05(A0A4, R.string.permission_storage_need_write_access_on_sharing_request, i2, false), 151);
                return;
            }
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:130:0x037e, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0382, code lost:
        throw r3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0257  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0281  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A17(X.C007003k r26, android.view.View r27) {
        /*
        // Method dump skipped, instructions count: 1068
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.contact.picker.ContactPickerFragment.A17(X.03k, android.view.View):void");
    }

    public final void A18(String str, int i) {
        Log.e(str);
        AnonymousClass02M r2 = this.A14;
        r2.A0C(r2.A05.A06(i), 0);
        this.A0H.A00();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0051, code lost:
        if (r9 == 1) goto L_0x0053;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A19(java.lang.String r21, boolean r22, java.lang.String r23, java.lang.String r24) {
        /*
        // Method dump skipped, instructions count: 465
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.contact.picker.ContactPickerFragment.A19(java.lang.String, boolean, java.lang.String, java.lang.String):void");
    }

    public final void A1A(List list) {
        if (A1E()) {
            Bundle A0o2 = A0o();
            A0o2.putString("mime_type", this.A0X);
            Object obj = this.A0d.get(0);
            SharedFilePreviewDialogFragment sharedFilePreviewDialogFragment = new SharedFilePreviewDialogFragment();
            BaseSharedPreviewDialogFragment baseSharedPreviewDialogFragment = new BaseSharedPreviewDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("jids", AnonymousClass1VY.A0F(list));
            baseSharedPreviewDialogFragment.A0N(bundle);
            Bundle bundle2 = ((AnonymousClass037) baseSharedPreviewDialogFragment).A06;
            if (bundle2 != null) {
                bundle2.putString("share_uri", obj.toString());
                bundle2.putBundle("extras", A0o2);
                sharedFilePreviewDialogFragment.A0N(bundle2);
                sharedFilePreviewDialogFragment.A0u(A0A().A04(), null);
                return;
            }
            throw null;
        }
    }

    public final void A1B(boolean z) {
        int i;
        int i2;
        ListView listView = this.A0A;
        if (listView != null) {
            listView.setFastScrollEnabled(z);
            this.A0A.setFastScrollAlwaysVisible(z);
            if (z) {
                this.A0A.setScrollBarStyle(33554432);
                boolean z2 = this.A1O.A02().A06;
                Resources A022 = A02();
                if (z2) {
                    i = A022.getDimensionPixelSize(R.dimen.contact_list_padding_right);
                    i2 = A02().getDimensionPixelSize(R.dimen.contact_list_padding_left);
                } else {
                    i = A022.getDimensionPixelSize(R.dimen.contact_list_padding_left);
                    i2 = A02().getDimensionPixelSize(R.dimen.contact_list_padding_right);
                }
            } else {
                this.A0A.setScrollBarStyle(0);
                i = 0;
                i2 = 0;
            }
            ListView listView2 = this.A0A;
            listView2.setPadding(i, listView2.getPaddingTop(), i2, 0);
        }
    }

    public boolean A1C() {
        if (!(this instanceof PaymentContactPickerFragment)) {
            return this.A0v || this.A0p;
        }
        return false;
    }

    public boolean A1D() {
        if (this.A0D.A05()) {
            this.A0D.A04(true);
            return true;
        } else if (!this.A0t) {
            return false;
        } else {
            this.A1a.A08(true, this.A1q.size());
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        if (r1 == 13) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A1E() {
        /*
            r5 = this;
            java.util.ArrayList r4 = r5.A0d
            r3 = 1
            r2 = 0
            if (r4 == 0) goto L_0x0040
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x0040
            X.0Bc r1 = r5.A1k
            java.lang.Object r0 = r4.get(r2)
            android.net.Uri r0 = (android.net.Uri) r0
            byte r1 = r1.A05(r0)
            if (r1 == r3) goto L_0x0022
            r0 = 3
            if (r1 == r0) goto L_0x0022
            r0 = 13
            r2 = 1
            if (r1 != r0) goto L_0x0023
        L_0x0022:
            r2 = 0
        L_0x0023:
            X.00f r1 = r5.A18
            X.01l r0 = X.AbstractC000400g.A1i
            boolean r0 = r1.A0D(r0)
            if (r0 == 0) goto L_0x003e
            X.02h r0 = r5.A0A()
            if (r0 == 0) goto L_0x003e
            java.util.ArrayList r0 = r5.A0d
            int r0 = r0.size()
            if (r0 != r3) goto L_0x003e
            if (r2 == 0) goto L_0x003e
            return r3
        L_0x003e:
            r3 = 0
            return r3
        L_0x0040:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.contact.picker.ContactPickerFragment.A1E():boolean");
    }

    public boolean A1F(C007003k r8, Intent intent) {
        if (!(this instanceof PaymentContactPickerFragment)) {
            StringBuilder A0S2 = AnonymousClass008.A0S("contactpicker/picked ");
            A0S2.append(r8.A09);
            Log.i(A0S2.toString());
            if (this.A12.A0H((UserJid) r8.A02(UserJid.class))) {
                return true;
            }
            this.A0O = r8;
            if ((this.A0z || this.A0t || this.A0x || this.A0y) && r8.A09()) {
                AnonymousClass01T r4 = this.A1S;
                Jid A022 = r8.A02(GroupJid.class);
                if (A022 == null) {
                    throw null;
                } else if (!r4.A01((AnonymousClass02X) A022).A0A(r4.A01)) {
                    return true;
                }
            }
            if (this.A0q) {
                AnonymousClass0HI r2 = this.A1B;
                this.A0H.A01(C14690mi.A00(r2.A07.A00, r2.A01(r8, true, true)));
                this.A0H.A00();
            } else if (this.A0z) {
                if (this.A0d != null) {
                    if (!A0o().getBoolean("skip_preview", false)) {
                        Iterator it = this.A0d.iterator();
                        while (it.hasNext()) {
                            if (this.A1k.A05((Uri) it.next()) != 1) {
                            }
                        }
                        A16(null);
                        return true;
                    }
                    C002001d.A2O(A0A(), 1);
                    return true;
                }
                String str = this.A0Y;
                if (str == null || str.length() <= 0) {
                    if (this.A0Z != null) {
                        C002001d.A2O(A0A(), 1);
                        return true;
                    } else if (this.A0e != null) {
                        C002001d.A2O(A0A(), 1);
                        return true;
                    }
                } else if (this.A0j) {
                    C002001d.A2O(A0A(), 1);
                    return true;
                } else {
                    A16(null);
                    return true;
                }
            } else if (this.A0t) {
                C002001d.A2O(A0A(), 2);
                return true;
            } else if (this.A0y) {
                C002001d.A2O(A0A(), 3);
                return true;
            } else if (this.A0s) {
                Jid A023 = r8.A02(UserJid.class);
                if (A023 != null) {
                    Bundle bundle = new Bundle();
                    bundle.putString("peer_id", A023.getRawString());
                    InviteToGroupCallConfirmationFragment inviteToGroupCallConfirmationFragment = new InviteToGroupCallConfirmationFragment();
                    inviteToGroupCallConfirmationFragment.A0N(bundle);
                    AnonymousClass0LW A0C2 = A0C();
                    if (A0C2 != null) {
                        AnonymousClass0QB r1 = new AnonymousClass0QB(A0C2);
                        r1.A0A(0, inviteToGroupCallConfirmationFragment, "InviteParticipantConfirmationDialog", 1);
                        r1.A01();
                        return true;
                    }
                    throw null;
                }
                throw null;
            } else {
                if (!this.A0p || intent == null) {
                    intent = new Intent();
                }
                Jid jid = r8.A09;
                if (jid != null) {
                    intent.putExtra("contact", jid.getRawString());
                    this.A0H.A01(intent);
                    this.A0H.A00();
                    return true;
                }
                throw null;
            }
            return true;
        }
        PaymentContactPickerFragment paymentContactPickerFragment = (PaymentContactPickerFragment) this;
        if (!paymentContactPickerFragment.A01.A06((UserJid) r8.A02(UserJid.class))) {
            return true;
        }
        paymentContactPickerFragment.A1H((UserJid) r8.A02(UserJid.class));
        return true;
    }

    public final boolean A1G(UserJid userJid) {
        return userJid != null && (!this.A1W.A02(userJid) || this.A18.A0D(AbstractC000400g.A0h)) && this.A18.A0D(AbstractC000400g.A0g) && !TextUtils.isEmpty(this.A0U) && !TextUtils.isEmpty(this.A0b);
    }
}

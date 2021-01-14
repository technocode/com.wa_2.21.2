package com.whatsapp.gallery;

import X.AbstractC007503q;
import X.AbstractC06100Rs;
import X.AbstractC06110Rt;
import X.AbstractC16450pp;
import X.AbstractC43421yL;
import X.AbstractC48922Oh;
import X.AbstractC658531u;
import X.ActivityC004602e;
import X.ActivityC004702f;
import X.AnonymousClass008;
import X.AnonymousClass00D;
import X.AnonymousClass00S;
import X.AnonymousClass00T;
import X.AnonymousClass00Y;
import X.AnonymousClass01A;
import X.AnonymousClass01I;
import X.AnonymousClass01K;
import X.AnonymousClass01T;
import X.AnonymousClass01X;
import X.AnonymousClass022;
import X.AnonymousClass02M;
import X.AnonymousClass02N;
import X.AnonymousClass037;
import X.AnonymousClass03P;
import X.AnonymousClass03S;
import X.AnonymousClass0AC;
import X.AnonymousClass0AM;
import X.AnonymousClass0CG;
import X.AnonymousClass0CH;
import X.AnonymousClass0D1;
import X.AnonymousClass0DH;
import X.AnonymousClass0EO;
import X.AnonymousClass0M9;
import X.AnonymousClass0MO;
import X.AnonymousClass0Q7;
import X.AnonymousClass0Z6;
import X.AnonymousClass1KQ;
import X.AnonymousClass1VY;
import X.AnonymousClass2C0;
import X.AnonymousClass2IC;
import X.AnonymousClass31y;
import X.AnonymousClass320;
import X.AnonymousClass322;
import X.AnonymousClass325;
import X.C000300f;
import X.C002001d;
import X.C002101e;
import X.C004302a;
import X.C006803i;
import X.C007303n;
import X.C014308b;
import X.C018109n;
import X.C02070An;
import X.C02590Cr;
import X.C03270Fn;
import X.C04350Ka;
import X.C04360Kb;
import X.C04370Kc;
import X.C04420Kh;
import X.C08680bX;
import X.C14360m9;
import X.C29891aN;
import X.C39921sK;
import X.C47612Is;
import X.C51822a5;
import X.C53622dZ;
import X.C53642db;
import X.C53762dn;
import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import com.google.android.search.verification.client.R;
import com.whatsapp.Conversation;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MediaGalleryActivity extends ActivityC004602e implements AbstractC43421yL {
    public int A00;
    public int A01 = 1;
    public int A02 = 2;
    public int A03 = 0;
    public int A04 = 3;
    public MenuItem A05;
    public AbstractC06100Rs A06;
    public AbstractC06110Rt A07;
    public C47612Is A08;
    public C08680bX A09 = new C08680bX();
    public AnonymousClass02N A0A;
    public String A0B = "";
    public ArrayList A0C;
    public final AbstractC16450pp A0D = new C53762dn(this);
    public final AnonymousClass01I A0E = AnonymousClass01I.A00();
    public final AnonymousClass0Z6 A0F = AnonymousClass0Z6.A00();
    public final C04350Ka A0G = C04350Ka.A00();
    public final C000300f A0H = C000300f.A00();
    public final C04360Kb A0I = C04360Kb.A00();
    public final AnonymousClass0DH A0J = AnonymousClass0DH.A00();
    public final AnonymousClass01A A0K = AnonymousClass01A.A00();
    public final C014308b A0L = C014308b.A00();
    public final AnonymousClass2IC A0M = AnonymousClass2IC.A00();
    public final AnonymousClass03P A0N = AnonymousClass03P.A00();
    public final C03270Fn A0O = C03270Fn.A00();
    public final AnonymousClass00S A0P = AnonymousClass00S.A00();
    public final AnonymousClass03S A0Q = AnonymousClass03S.A00();
    public final AnonymousClass01K A0R = AnonymousClass01K.A00();
    public final AnonymousClass0AM A0S = AnonymousClass0AM.A00();
    public final AnonymousClass01T A0T = AnonymousClass01T.A00();
    public final C02070An A0U = C02070An.A00();
    public final AnonymousClass0AC A0V = AnonymousClass0AC.A00;
    public final C018109n A0W = C018109n.A00();
    public final AnonymousClass0CG A0X = AnonymousClass0CG.A00();
    public final AnonymousClass0M9 A0Y = AnonymousClass0M9.A01();
    public final AnonymousClass00Y A0Z = AnonymousClass00Y.A00();
    public final AnonymousClass0EO A0a = AnonymousClass0EO.A00();
    public final C04420Kh A0b = C04420Kh.A00();
    public final AnonymousClass0CH A0c = AnonymousClass0CH.A00();
    public final AnonymousClass022 A0d = AnonymousClass022.A00();
    public final AbstractC658531u A0e = AbstractC658531u.A00();
    public final AnonymousClass31y A0f = AnonymousClass31y.A00();
    public final AnonymousClass320 A0g = AnonymousClass320.A00();
    public final AnonymousClass322 A0h = AnonymousClass322.A00();
    public final AnonymousClass325 A0i = AnonymousClass325.A00();
    public final AnonymousClass0D1 A0j = AnonymousClass0D1.A00();
    public final C04370Kc A0k = C04370Kc.A00();
    public final AnonymousClass00T A0l = C002101e.A00();

    @Override // X.AbstractC43421yL
    public void A1w(C007303n r1) {
    }

    @Override // X.AbstractC43421yL
    public void A3i(C007303n r1) {
    }

    @Override // X.AbstractC43421yL
    public void A4T(AbstractC007503q r1) {
    }

    @Override // X.AbstractC43421yL
    public AnonymousClass1KQ A4l() {
        return null;
    }

    @Override // X.AbstractC43421yL
    public int A5Q() {
        return 0;
    }

    @Override // X.AbstractC43421yL
    public int A5t(AnonymousClass0MO r2) {
        return 0;
    }

    @Override // X.AbstractC03640Hb
    public AnonymousClass0D1 A9D() {
        return null;
    }

    @Override // X.AbstractC43421yL
    public int A9L(AbstractC007503q r2) {
        return 0;
    }

    @Override // X.AbstractC43421yL
    public boolean ABf(AbstractC007503q r2) {
        return false;
    }

    @Override // X.AbstractC43421yL
    public void ANT(AbstractC007503q r1) {
    }

    @Override // X.AbstractC43421yL
    public void APB(AbstractC007503q r1, int i) {
    }

    @Override // X.AbstractC43421yL
    public boolean APY(C007303n r2) {
        return true;
    }

    @Override // X.AbstractC43421yL
    public void AQt(AnonymousClass0MO r1, long j) {
    }

    @Override // X.AbstractC43421yL
    public void AQw(AbstractC007503q r1) {
    }

    @Override // X.AbstractC43421yL
    public void animateStar(View view) {
    }

    public static AbstractC48922Oh A04(MediaGalleryActivity mediaGalleryActivity) {
        int i = mediaGalleryActivity.A00;
        Iterator it = ((AbstractCollection) mediaGalleryActivity.A0D()).iterator();
        while (it.hasNext()) {
            AnonymousClass037 r1 = (AnonymousClass037) it.next();
            if (i == mediaGalleryActivity.A03 && (r1 instanceof MediaGalleryFragment)) {
                return (AbstractC48922Oh) r1;
            }
            if (i == mediaGalleryActivity.A01 && (r1 instanceof DocumentsGalleryFragment)) {
                return (AbstractC48922Oh) r1;
            }
            if (i == mediaGalleryActivity.A02 && (r1 instanceof LinksGalleryFragment)) {
                return (AbstractC48922Oh) r1;
            }
            if (i == mediaGalleryActivity.A04 && (r1 instanceof ProductGalleryFragment)) {
                return (GalleryFragmentBase) r1;
            }
        }
        return null;
    }

    public final void A0T() {
        C47612Is r8;
        AbstractC06110Rt r1 = this.A07;
        if (r1 != null && (r8 = this.A08) != null) {
            if (r8.isEmpty()) {
                r1.A00();
                return;
            }
            C002001d.A2R(this, this.A0N, ((AnonymousClass2C0) this).A01.A0A(R.plurals.n_items_selected, (long) r8.size(), Integer.valueOf(r8.size())));
            this.A07.A01();
        }
    }

    @Override // X.AbstractC43421yL
    public C51822a5 A5U() {
        return this.A0M.A01;
    }

    @Override // X.AbstractC43421yL
    public ArrayList A8u() {
        return this.A0C;
    }

    @Override // X.AbstractC43421yL
    public boolean AAO() {
        return this.A08 != null;
    }

    @Override // X.AbstractC43421yL
    public boolean ABK(AbstractC007503q r3) {
        C47612Is r1 = this.A08;
        return r1 != null && r1.containsKey(r3.A0n);
    }

    @Override // X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02s
    public void AKm(AbstractC06110Rt r3) {
        Toolbar toolbar = ((ActivityC004702f) this).A07;
        if (toolbar != null) {
            AnonymousClass0Q7.A0W(toolbar, 0);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().setStatusBarColor(C004302a.A00(this, 17170444));
        }
    }

    @Override // X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02s
    public void AKn(AbstractC06110Rt r3) {
        Toolbar toolbar = ((ActivityC004702f) this).A07;
        if (toolbar != null) {
            AnonymousClass0Q7.A0W(toolbar, 4);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().setStatusBarColor(C004302a.A00(this, R.color.action_mode_dark));
        }
    }

    @Override // X.AbstractC43421yL
    public void AP3(List list, boolean z) {
        if (this.A08 != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AbstractC007503q r2 = (AbstractC007503q) it.next();
                C47612Is r1 = this.A08;
                if (z) {
                    r1.put(r2.A0n, r2);
                } else {
                    r1.remove(r2.A0n);
                }
            }
            A0T();
        }
    }

    @Override // X.AbstractC43421yL
    public void AQ6(AbstractC007503q r9) {
        C47612Is r1 = new C47612Is(((ActivityC004702f) this).A0F, this.A0V, this.A08, new C53622dZ(this));
        this.A08 = r1;
        r1.put(r9.A0n, r9);
        this.A07 = A0B(this.A06);
        AnonymousClass03P r7 = this.A0N;
        AnonymousClass01X r6 = ((AnonymousClass2C0) this).A01;
        C47612Is r12 = this.A08;
        C002001d.A2R(this, r7, r6.A0A(R.plurals.n_items_selected, (long) r12.size(), Integer.valueOf(r12.size())));
    }

    @Override // X.AbstractC43421yL
    public boolean AQh(AbstractC007503q r4) {
        C47612Is r0 = this.A08;
        if (r0 == null) {
            return false;
        }
        C007303n r2 = r4.A0n;
        boolean containsKey = r0.containsKey(r2);
        C47612Is r02 = this.A08;
        if (containsKey) {
            r02.remove(r2);
            A0T();
        } else {
            r02.put(r2, r4);
            A0T();
        }
        return !containsKey;
    }

    @Override // X.ActivityC004902h
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 2) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            if (this.A08 != null) {
                List A0G2 = AnonymousClass1VY.A0G(AnonymousClass02N.class, intent.getStringArrayListExtra("jids"));
                ArrayList arrayList = new ArrayList(this.A08.values());
                Collections.sort(arrayList, C14360m9.A00);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    this.A0I.A09(this.A0G, (AbstractC007503q) it.next(), A0G2);
                }
                AbstractList abstractList = (AbstractList) A0G2;
                if (abstractList.size() != 1 || AnonymousClass1VY.A0b((Jid) abstractList.get(0))) {
                    A0S(A0G2);
                } else {
                    startActivity(Conversation.A04(this, this.A0K.A0A((AnonymousClass02N) abstractList.get(0))));
                }
            } else {
                Log.w("mediagallery/forward/failed");
                ((ActivityC004702f) this).A0F.A06(R.string.message_forward_failed, 0);
            }
            AbstractC06110Rt r0 = this.A07;
            if (r0 != null) {
                r0.A00();
            }
        }
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A0M.A01(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x010d, code lost:
        if (java.lang.Long.parseLong(r0) == 0) goto L_0x010f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x014e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x014f, code lost:
        if (r5 != null) goto L_0x0151;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0154, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0157, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x015b, code lost:
        throw r0;
     */
    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r42) {
        /*
        // Method dump skipped, instructions count: 725
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallery.MediaGalleryActivity.onCreate(android.os.Bundle):void");
    }

    public void onCreate(Bundle bundle, PersistableBundle persistableBundle) {
        super.onCreate(bundle, persistableBundle);
        this.A0M.A01(this);
    }

    @Override // X.ActivityC004602e
    public Dialog onCreateDialog(int i) {
        if (i == 13) {
            C47612Is r2 = this.A08;
            if (r2 == null || r2.isEmpty()) {
                Log.e("mediagallery/dialog/delete no messages");
                return super.onCreateDialog(i);
            }
            StringBuilder A0S2 = AnonymousClass008.A0S("mediagallery/dialog/delete/");
            A0S2.append(r2.size());
            Log.i(A0S2.toString());
            ArrayList arrayList = new ArrayList(this.A08.values());
            AnonymousClass02M r5 = ((ActivityC004702f) this).A0F;
            AnonymousClass00S r6 = this.A0P;
            AnonymousClass00T r7 = this.A0l;
            C02590Cr r8 = super.A0M;
            C04360Kb r9 = this.A0I;
            AnonymousClass01A r3 = this.A0K;
            C014308b r22 = this.A0L;
            AnonymousClass01X r10 = ((AnonymousClass2C0) this).A01;
            AnonymousClass00D r11 = super.A0J;
            AnonymousClass02N r1 = this.A0A;
            return C002001d.A0N(this, r5, r6, r7, r8, r9, r10, r11, arrayList, new C39921sK(this, 13), true, new C53642db(this), C002001d.A1t(arrayList, r3, r22, r1, r10));
        } else if (i != 19) {
            return super.onCreateDialog(i);
        } else {
            return C002001d.A0M(this, ((ActivityC004602e) this).A04, this.A0Y, ((AnonymousClass2C0) this).A01, super.A0J, new C29891aN(this, 19));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x007e, code lost:
        if (r0 < 0) goto L_0x0080;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onCreateOptionsMenu(android.view.Menu r7) {
        /*
        // Method dump skipped, instructions count: 152
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallery.MediaGalleryActivity.onCreateOptionsMenu(android.view.Menu):boolean");
    }

    @Override // X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onDestroy() {
        super.onDestroy();
        AnonymousClass0D1 r0 = this.A0j;
        if (r0 != null) {
            r0.A04();
        }
        C47612Is r02 = this.A08;
        if (r02 != null) {
            r02.A00();
            this.A08 = null;
        }
        this.A0l.ANF(new RunnableEBaseShape9S0100000_I1_4(this.A0O, 36));
    }

    @Override // X.ActivityC004702f
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }

    @Override // X.ActivityC004802g, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C47612Is r0 = this.A08;
        if (r0 != null) {
            ArrayList arrayList = new ArrayList();
            for (AbstractC007503q r02 : r0.values()) {
                arrayList.add(r02.A0n);
            }
            C006803i.A0U(bundle, arrayList);
        }
    }
}

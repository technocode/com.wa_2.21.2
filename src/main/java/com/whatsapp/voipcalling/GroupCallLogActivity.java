package com.whatsapp.voipcalling;

import X.AbstractC12270hp;
import X.AbstractC16300pa;
import X.ActivityC004602e;
import X.AnonymousClass00S;
import X.AnonymousClass01A;
import X.AnonymousClass01X;
import X.AnonymousClass08B;
import X.AnonymousClass0BP;
import X.AnonymousClass0FS;
import X.AnonymousClass0L2;
import X.AnonymousClass0QM;
import X.AnonymousClass0QP;
import X.AnonymousClass0S2;
import X.AnonymousClass0YX;
import X.AnonymousClass2C0;
import X.AnonymousClass31y;
import X.AnonymousClass39F;
import X.C000300f;
import X.C002001d;
import X.C004302a;
import X.C014308b;
import X.C09200cS;
import X.C09260ca;
import X.C28051Sr;
import X.C72563Tj;
import X.C72573Tk;
import X.C72593Tm;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.ui.voip.MultiContactThumbnail;
import com.whatsapp.util.Log;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class GroupCallLogActivity extends ActivityC004602e {
    public AnonymousClass0YX A00;
    public AnonymousClass0YX A01;
    public AnonymousClass0QM A02;
    public C72593Tm A03;
    public final C000300f A04 = C000300f.A00();
    public final AnonymousClass01A A05 = AnonymousClass01A.A00();
    public final AnonymousClass0BP A06 = new C72563Tj(this);
    public final AnonymousClass08B A07 = AnonymousClass08B.A00;
    public final C014308b A08 = C014308b.A00();
    public final AbstractC12270hp A09 = new C72573Tk();
    public final AnonymousClass0L2 A0A = AnonymousClass0L2.A01();
    public final AnonymousClass00S A0B = AnonymousClass00S.A00();
    public final AnonymousClass0FS A0C = AnonymousClass0FS.A00();
    public final AnonymousClass31y A0D = AnonymousClass31y.A00();
    public final C09200cS A0E = C09200cS.A00();

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        AnonymousClass0QM r0;
        AbstractList abstractList;
        int i;
        String A062;
        super.onCreate(bundle);
        AnonymousClass0S2 A092 = A09();
        if (A092 != null) {
            A092.A0A(true);
            AnonymousClass01X r6 = ((AnonymousClass2C0) this).A01;
            setTitle(r6.A06(R.string.call_details));
            setContentView(R.layout.group_call_info_activity);
            C09260ca r02 = (C09260ca) getIntent().getParcelableExtra("call_log_key");
            if (r02 != null) {
                r0 = this.A0C.A04(new C09260ca(r02.A01, r02.A03, r02.A02, r02.A00));
            } else {
                r0 = null;
            }
            this.A02 = r0;
            if (r0 == null) {
                Log.i("call log missing");
                finish();
                return;
            }
            AnonymousClass0L2 r4 = this.A0A;
            this.A01 = r4.A03(this);
            this.A00 = new AnonymousClass0YX(r4, getResources().getDimensionPixelSize(R.dimen.group_call_log_avatar_size), 0.0f);
            RecyclerView recyclerView = (RecyclerView) findViewById(R.id.participants_list);
            int i2 = 0;
            recyclerView.setLayoutManager(new LinearLayoutManager(1));
            C72593Tm r03 = new C72593Tm(this);
            this.A03 = r03;
            recyclerView.setAdapter(r03);
            List A042 = this.A02.A04();
            UserJid userJid = this.A02.A09.A01;
            int i3 = 0;
            while (true) {
                abstractList = (AbstractList) A042;
                if (i3 < abstractList.size() && !((AnonymousClass0QP) abstractList.get(i3)).A02.equals(userJid)) {
                    i3++;
                } else if (i3 != 0 && i3 < abstractList.size()) {
                    Object obj = abstractList.get(i3);
                    abstractList.remove(i3);
                    abstractList.add(0, obj);
                }
            }
            Object obj2 = abstractList.get(i3);
            abstractList.remove(i3);
            abstractList.add(0, obj2);
            List subList = abstractList.subList(1 ^ (this.A02.A09.A03 ? 1 : 0), abstractList.size());
            AnonymousClass01A r2 = this.A05;
            Collections.sort(subList, new AnonymousClass39F(r2, this.A08, this.A04));
            C72593Tm r42 = this.A03;
            if (r42 != null) {
                ArrayList arrayList = new ArrayList(A042);
                r42.A01 = arrayList;
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        r42.A00 = Integer.MAX_VALUE;
                        break;
                    } else if (((AnonymousClass0QP) it.next()).A00 != 5) {
                        r42.A00 = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
                ((AbstractC16300pa) r42).A01.A00();
                AnonymousClass0QM r7 = this.A02;
                TextView textView = (TextView) findViewById(R.id.call_type_text);
                ImageView imageView = (ImageView) findViewById(R.id.call_type_icon);
                if (r7.A09.A03) {
                    i = R.drawable.ic_call_outgoing;
                    A062 = r6.A06(R.string.outgoing_call);
                } else if (r7.A00 == 5) {
                    i = R.drawable.ic_call_incoming;
                    A062 = r6.A06(R.string.incoming_call);
                } else {
                    i = R.drawable.ic_call_missed;
                    A062 = r6.A06(R.string.missed_call);
                }
                textView.setText(A062);
                imageView.setImageResource(i);
                C002001d.A2m(imageView, C004302a.A00(this, C28051Sr.A01(i)));
                ((TextView) findViewById(R.id.call_duration)).setText(C002001d.A1W(r6, (long) r7.A01));
                ((TextView) findViewById(R.id.call_data)).setText(C002001d.A1b(r6, r7.A02));
                ((TextView) findViewById(R.id.call_date)).setText(C002001d.A1F(r6, this.A0B.A06(r7.A08)));
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = abstractList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(r2.A0A(((AnonymousClass0QP) it2.next()).A02));
                }
                ((MultiContactThumbnail) findViewById(R.id.multi_contact_photo)).A00(arrayList2, this.A00, this.A09);
                this.A07.A01(this.A06);
                return;
            }
            throw null;
        }
        throw null;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, R.id.menuitem_clear_call_log, 0, ((AnonymousClass2C0) this).A01.A06(R.string.clear_single_log)).setIcon(R.drawable.ic_action_delete);
        return true;
    }

    @Override // X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onDestroy() {
        super.onDestroy();
        this.A07.A00(this.A06);
    }

    @Override // X.ActivityC004702f
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.menuitem_clear_call_log) {
            Log.i("calllog/delete");
            this.A0C.A0A(Collections.singletonList(this.A02));
            finish();
            return true;
        } else if (menuItem.getItemId() != 16908332) {
            return false;
        } else {
            finish();
            return true;
        }
    }
}

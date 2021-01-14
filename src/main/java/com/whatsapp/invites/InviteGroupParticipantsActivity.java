package com.whatsapp.invites;

import X.AbstractC16300pa;
import X.ActivityC004602e;
import X.ActivityC004702f;
import X.AnonymousClass00D;
import X.AnonymousClass00T;
import X.AnonymousClass01A;
import X.AnonymousClass01X;
import X.AnonymousClass022;
import X.AnonymousClass02N;
import X.AnonymousClass02U;
import X.AnonymousClass03P;
import X.AnonymousClass0Eg;
import X.AnonymousClass0L2;
import X.AnonymousClass0YX;
import X.AnonymousClass1MN;
import X.AnonymousClass1VY;
import X.AnonymousClass2RV;
import X.AnonymousClass2RY;
import X.C002101e;
import X.C002301g;
import X.C004302a;
import X.C006903j;
import X.C007003k;
import X.C014308b;
import X.C02590Cr;
import X.C02600Cs;
import X.C03930Ii;
import X.C04360Kb;
import X.C06170Sb;
import X.C06470Tj;
import X.C10290eO;
import X.C36901n6;
import X.C53492dM;
import X.C55462ga;
import X.C55482gc;
import X.C64482yG;
import X.C64502yI;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.ViewOnClickEBaseShape6S0100000_I1_4;
import com.google.android.search.verification.client.R;
import com.whatsapp.MentionableEntry;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.ViewOnClickCListenerShape13S0100000_I1_2;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class InviteGroupParticipantsActivity extends ActivityC004602e {
    public LayoutInflater A00;
    public ImageView A01;
    public MentionableEntry A02;
    public AnonymousClass0YX A03;
    public C007003k A04;
    public List A05;
    public byte[] A06;
    public final C04360Kb A07 = C04360Kb.A00();
    public final AnonymousClass01A A08 = AnonymousClass01A.A00();
    public final C014308b A09 = C014308b.A00();
    public final AnonymousClass0L2 A0A = AnonymousClass0L2.A01();
    public final AnonymousClass03P A0B = AnonymousClass03P.A00();
    public final AnonymousClass00D A0C = AnonymousClass00D.A00();
    public final AnonymousClass01X A0D = AnonymousClass01X.A00();
    public final C006903j A0E = C006903j.A00();
    public final C02600Cs A0F = C02600Cs.A00();
    public final C02590Cr A0G = C02590Cr.A00();
    public final C03930Ii A0H = C03930Ii.A00();
    public final C53492dM A0I = C53492dM.A00();
    public final AnonymousClass0Eg A0J = AnonymousClass0Eg.A00();
    public final AnonymousClass022 A0K = AnonymousClass022.A00();
    public final C06170Sb A0L = C06170Sb.A00();
    public final AnonymousClass00T A0M = C002101e.A00();

    public static Intent A04(Context context, C64502yI r9) {
        Intent intent = new Intent(context, InviteGroupParticipantsActivity.class);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Map map = r9.A02;
        Long l = null;
        for (Jid jid : map.keySet()) {
            C64482yG r2 = (C64482yG) map.get(jid);
            if (r2 != null) {
                if (l == null) {
                    l = Long.valueOf(r2.A00);
                }
                arrayList.add(jid.getRawString());
                arrayList2.add(r2.A01);
            }
        }
        intent.putExtra("jids", arrayList);
        intent.putExtra("invite_hashes", arrayList2);
        intent.putExtra("invite_expiration", l);
        intent.putExtra("group_jid", r9.A00.getRawString());
        return intent;
    }

    public static C36901n6 A05(Activity activity, AnonymousClass01X r4, View view, Intent intent, int i) {
        C36901n6 A002 = C36901n6.A00(view, r4.A06(R.string.invite_cancelled), 0);
        A002.A06(r4.A06(R.string.undo), new C55462ga(activity, intent, i));
        A002.A05(C004302a.A00(view.getContext(), R.color.group_invite_undo_accent));
        return A002;
    }

    public /* synthetic */ void lambda$onCreate$2204$InviteGroupParticipantsActivity(View view) {
        finish();
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AnonymousClass01X r15 = this.A0D;
        setTitle(r15.A06(R.string.app_name));
        setContentView(R.layout.invite_group_select_layout);
        this.A00 = LayoutInflater.from(this);
        this.A03 = this.A0A.A03(this);
        this.A02 = (MentionableEntry) findViewById(R.id.comment);
        new AnonymousClass1MN(this, this.A0J, this.A0L, this.A0G, this.A0F, this.A0H, this.A0B, r15, this.A0I, this.A0C, this.A0K, findViewById(R.id.main), null);
        this.A02.setText(r15.A06(R.string.group_invite_default_caption));
        getWindow().setSoftInputMode(3);
        this.A02.requestFocus();
        TextView textView = (TextView) findViewById(R.id.group_name);
        this.A01 = (ImageView) findViewById(R.id.group_photo);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = ((AbstractCollection) AnonymousClass1VY.A0G(UserJid.class, getIntent().getStringArrayListExtra("jids"))).iterator();
        while (it.hasNext()) {
            AnonymousClass02N r1 = (AnonymousClass02N) it.next();
            arrayList.add(r1);
            arrayList2.add(this.A08.A0A(r1));
        }
        ArrayList<String> stringArrayListExtra = getIntent().getStringArrayListExtra("invite_hashes");
        long longExtra = getIntent().getLongExtra("invite_expiration", 0);
        AnonymousClass02U A032 = AnonymousClass02U.A03(getIntent().getStringExtra("group_jid"));
        if (A032 != null) {
            this.A05 = new ArrayList();
            for (int i = 0; i < stringArrayListExtra.size(); i++) {
                this.A05.add(new AnonymousClass2RV((UserJid) arrayList.get(i), A032, stringArrayListExtra.get(i), longExtra));
            }
            C007003k A0A2 = this.A08.A0A(A032);
            this.A04 = A0A2;
            textView.setText(this.A09.A08(A0A2, false));
            this.A0M.ANC(new C10290eO(this, this.A04), new Void[0]);
            ImageView imageView = (ImageView) findViewById(R.id.send);
            imageView.setImageDrawable(new C06470Tj(r15, C004302a.A03(this, R.drawable.input_send)));
            imageView.setOnClickListener(new ViewOnClickCListenerShape13S0100000_I1_2(this, 27));
            RecyclerView recyclerView = (RecyclerView) findViewById(R.id.invite_contacts_recycler);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
            linearLayoutManager.A1A(0);
            recyclerView.setLayoutManager(linearLayoutManager);
            C55482gc r12 = new C55482gc(this);
            r12.A00 = arrayList2;
            ((AbstractC16300pa) r12).A01.A00();
            recyclerView.setAdapter(r12);
            C002301g.A03((TextView) findViewById(R.id.send_invite_title));
            View findViewById = findViewById(R.id.container);
            findViewById.getViewTreeObserver().addOnGlobalLayoutListener(new AnonymousClass2RY(findViewById));
            setResult(0, getIntent());
            findViewById(R.id.filler).setOnClickListener(new ViewOnClickEBaseShape6S0100000_I1_4(this, 34));
            if (Build.VERSION.SDK_INT >= 21) {
                getWindow().addFlags(EditorInfoCompat.IME_FLAG_FORCE_ASCII);
                getWindow().setStatusBarColor(0);
                getWindow().setNavigationBarColor(C004302a.A00(this, R.color.black));
                return;
            }
            return;
        }
        throw null;
    }

    @Override // X.ActivityC004602e, X.ActivityC004702f, X.ActivityC004902h
    public void onPause() {
        super.onPause();
        if (C06170Sb.A01(((ActivityC004702f) this).A04)) {
            getWindow().setSoftInputMode(5);
        } else {
            getWindow().setSoftInputMode(3);
        }
    }
}

package com.whatsapp.group;

import X.AbstractC000400g;
import X.AbstractC26561Lk;
import X.ActivityC004602e;
import X.ActivityC004702f;
import X.AnonymousClass00D;
import X.AnonymousClass00S;
import X.AnonymousClass00Y;
import X.AnonymousClass01A;
import X.AnonymousClass01K;
import X.AnonymousClass01R;
import X.AnonymousClass01X;
import X.AnonymousClass022;
import X.AnonymousClass02M;
import X.AnonymousClass02N;
import X.AnonymousClass02R;
import X.AnonymousClass02U;
import X.AnonymousClass03P;
import X.AnonymousClass04j;
import X.AnonymousClass08C;
import X.AnonymousClass09H;
import X.AnonymousClass0A8;
import X.AnonymousClass0BR;
import X.AnonymousClass0C4;
import X.AnonymousClass0EO;
import X.AnonymousClass0EV;
import X.AnonymousClass0EY;
import X.AnonymousClass0Eg;
import X.AnonymousClass0HK;
import X.AnonymousClass0L2;
import X.AnonymousClass0Q7;
import X.AnonymousClass0S2;
import X.AnonymousClass0SE;
import X.AnonymousClass0YX;
import X.AnonymousClass1M3;
import X.AnonymousClass1N9;
import X.AnonymousClass1VY;
import X.AnonymousClass2C0;
import X.AnonymousClass2CD;
import X.C000300f;
import X.C002001d;
import X.C006903j;
import X.C007003k;
import X.C008805h;
import X.C014308b;
import X.C02590Cr;
import X.C02600Cs;
import X.C03930Ii;
import X.C06170Sb;
import X.C07850Zx;
import X.C11230fv;
import X.C28051Sr;
import X.C48672Ng;
import X.C49382Qg;
import X.C53392d8;
import X.C53492dM;
import X.C54792fV;
import X.C55052fv;
import X.C55062fw;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape6S0100000_I1_4;
import com.google.android.search.verification.client.R;
import com.whatsapp.KeyboardPopupLayout;
import com.whatsapp.WaEditText;
import com.whatsapp.crop.CropImage;
import com.whatsapp.emoji.search.EmojiSearchContainer;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape4S0200000_I1;
import java.io.File;
import java.io.IOException;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

public class NewGroup extends ActivityC004602e {
    public int A00;
    public Bundle A01;
    public CheckBox A02;
    public ImageButton A03;
    public ImageView A04;
    public AnonymousClass02R A05;
    public AbstractC26561Lk A06 = new C55052fv(this);
    public KeyboardPopupLayout A07;
    public WaEditText A08;
    public AnonymousClass0YX A09;
    public C53392d8 A0A;
    public Integer A0B;
    public List A0C;
    public final AnonymousClass0EY A0D = AnonymousClass0EY.A00();
    public final C000300f A0E = C000300f.A00();
    public final AnonymousClass01A A0F = AnonymousClass01A.A00();
    public final C014308b A0G = C014308b.A00();
    public final AnonymousClass08C A0H = AnonymousClass08C.A00();
    public final AnonymousClass0EV A0I = AnonymousClass0EV.A00();
    public final AnonymousClass0L2 A0J = AnonymousClass0L2.A01();
    public final AnonymousClass0HK A0K = AnonymousClass0HK.A00();
    public final AnonymousClass04j A0L = AnonymousClass04j.A00();
    public final AnonymousClass03P A0M = AnonymousClass03P.A00();
    public final AnonymousClass00S A0N = AnonymousClass00S.A00();
    public final C006903j A0O = C006903j.A00();
    public final AnonymousClass0BR A0P = new C55062fw(this);
    public final AnonymousClass0A8 A0Q = AnonymousClass0A8.A00;
    public final AnonymousClass01K A0R = AnonymousClass01K.A00();
    public final C007003k A0S = new C11230fv();
    public final C03930Ii A0T = C03930Ii.A00();
    public final C53492dM A0U = C53492dM.A00();
    public final AnonymousClass00Y A0V = AnonymousClass00Y.A00();
    public final AnonymousClass0Eg A0W = AnonymousClass0Eg.A00();
    public final AnonymousClass0EO A0X = AnonymousClass0EO.A00();
    public final AnonymousClass09H A0Y = AnonymousClass09H.A01();
    public final AnonymousClass022 A0Z = AnonymousClass022.A00();
    public final AnonymousClass01R A0a = AnonymousClass01R.A01();
    public final AnonymousClass0C4 A0b = AnonymousClass0C4.A00();
    public final AtomicReference A0c = new AtomicReference();

    public static void A04(Activity activity, int i, Collection collection) {
        Intent intent = new Intent(activity, GroupMembersSelector.class);
        intent.putExtra("entry_point", i);
        if (collection != null && !collection.isEmpty()) {
            intent.putExtra("selected", new ArrayList(collection));
        }
        activity.startActivity(intent);
    }

    public static void A05(NewGroup newGroup, AnonymousClass02U r4) {
        Intent intent = new Intent();
        intent.putExtra("group_jid", r4.getRawString());
        if (newGroup.A01 != null) {
            newGroup.A08.A00();
            intent.putExtra("invite_bundle", newGroup.A01);
        }
        newGroup.setResult(-1, intent);
    }

    public final void A0T(List list) {
        String A1l = C002001d.A1l(this.A08.getText().toString());
        int A0B2 = C28051Sr.A0B(A1l);
        int A062 = this.A0E.A06(AbstractC000400g.A40);
        if (A0B2 > A062) {
            ((ActivityC004702f) this).A0F.A0C(((AnonymousClass2C0) this).A01.A0A(R.plurals.subject_reach_limit, (long) A062, Integer.valueOf(A062)), 0);
        } else if (list.isEmpty()) {
            ((ActivityC004702f) this).A0F.A06(R.string.no_valid_participant, 0);
        } else {
            AnonymousClass0EO r4 = this.A0X;
            AnonymousClass2CD A022 = AnonymousClass2CD.A02(r4.A06, UUID.randomUUID().toString().replace("-", ""));
            r4.A0C(A022, list, true);
            if (this.A0L.A05()) {
                StringBuilder sb = new StringBuilder("newgroup/go create group:");
                sb.append(A022);
                Log.i(sb.toString());
                A0G(R.string.creating_group);
                this.A05 = new AnonymousClass02R(A022, new RunnableEBaseShape1S1300000_I1(this, A022, list, A1l, 1));
                this.A0R.A0J(this.A0a.A03(A022, this.A0N.A05(), 2, A1l, list));
                AnonymousClass02M r42 = ((ActivityC004702f) this).A0F;
                r42.A02.postDelayed(new RunnableEBaseShape10S0100000_I1_5(this, 17), 10000);
                return;
            }
            Log.i("newgroup/no network access, fail to create group");
            this.A0R.A0J(this.A0a.A03(A022, this.A0N.A05(), 3, A1l, list));
            File A023 = this.A0H.A02(this.A0S);
            if (A023.exists()) {
                try {
                    AnonymousClass1N9 A032 = this.A0D.A03(A023);
                    this.A0I.A02(this.A0F.A0A(A022), A032.A00, A032.A01);
                } catch (IOException e) {
                    Log.e("newgroup/failed to update photo", e);
                }
            }
            setResult(-1);
            finish();
        }
    }

    public /* synthetic */ void lambda$onCreate$2172$NewGroup(View view) {
        C007003k r2 = this.A0S;
        r2.A0F = this.A08.getText().toString();
        this.A0D.A05(this, r2, 12);
    }

    @Override // X.ActivityC004902h
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 12) {
            if (i != 13) {
                super.onActivityResult(i, i2, intent);
                return;
            }
            AnonymousClass0EY r2 = this.A0D;
            r2.A04().delete();
            if (i2 == -1) {
                Log.i("newgroup/photopicked");
                this.A04.setImageBitmap(this.A0K.A02(this.A0S, getResources().getDimensionPixelSize(R.dimen.registration_profile_photo_size), 0.0f, false));
            } else if (i2 == 0 && intent != null) {
                CropImage.A00(r2.A02, intent, this, r2.A0C);
            }
        } else if (i2 != -1) {
        } else {
            if (intent == null || !intent.getBooleanExtra("is_reset", false)) {
                Log.i("newgroup/cropphoto");
                Intent A012 = this.A0D.A01(this, this, intent);
                if (A012 != null) {
                    startActivityForResult(A012, 13);
                    return;
                }
                return;
            }
            Log.i("newgroup/resetphoto");
            AnonymousClass08C r22 = this.A0H;
            C007003k r1 = this.A0S;
            r22.A02(r1).delete();
            r22.A03(r1).delete();
            this.A04.setImageResource(R.drawable.ic_addphoto);
        }
    }

    @Override // X.ActivityC004702f, X.AnonymousClass02i
    public void onBackPressed() {
        C53392d8 r0 = this.A0A;
        if (r0 == null || !r0.isShowing()) {
            super.onBackPressed();
        } else {
            this.A0A.dismiss();
        }
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        String A0D2;
        int A062;
        super.onCreate(bundle);
        AnonymousClass01X r6 = ((AnonymousClass2C0) this).A01;
        setTitle(r6.A06(R.string.new_group));
        AnonymousClass0S2 A092 = A09();
        if (A092 != null) {
            A092.A0A(true);
            A092.A0B(true);
            A092.A07(r6.A06(R.string.add_subject));
            setContentView(R.layout.new_group);
            this.A09 = this.A0J.A03(this);
            ImageView imageView = (ImageView) findViewById(R.id.change_photo_btn);
            this.A04 = imageView;
            imageView.setOnClickListener(new ViewOnClickEBaseShape6S0100000_I1_4(this, 24));
            if (bundle == null) {
                this.A00 = 0;
                AnonymousClass08C r2 = this.A0H;
                C007003k r1 = this.A0S;
                r2.A02(r1).delete();
                r2.A03(r1).delete();
            } else {
                this.A00 = bundle.getInt("input_method");
            }
            this.A07 = (KeyboardPopupLayout) findViewById(R.id.main);
            WaEditText waEditText = (WaEditText) findViewById(R.id.group_name);
            this.A08 = waEditText;
            AnonymousClass0Eg r0 = this.A0W;
            C06170Sb r15 = ((ActivityC004602e) this).A0H;
            C02590Cr r11 = super.A0M;
            C02600Cs r12 = super.A0L;
            C03930Ii r5 = this.A0T;
            AnonymousClass03P r10 = this.A0M;
            C53492dM r4 = this.A0U;
            AnonymousClass00D r22 = super.A0J;
            AnonymousClass022 r9 = this.A0Z;
            C53392d8 r13 = new C53392d8(this, r0, r15, r11, r12, r5, r10, r6, r4, r22, r9, this.A07, (ImageButton) findViewById(R.id.emoji_btn), waEditText);
            this.A0A = r13;
            r13.A08(this.A06);
            C48672Ng r42 = new C48672Ng((EmojiSearchContainer) findViewById(R.id.emoji_search_container), this.A0A, this, r11, r5, r6, r9);
            r42.A00 = new C54792fV(this);
            this.A0A.A0B = new RunnableEBaseShape10S0100000_I1_5(r42, 16);
            this.A04.setImageResource(R.drawable.ic_addphoto);
            AnonymousClass0SE.A0A(r6, this.A08);
            int A063 = this.A0E.A06(AbstractC000400g.A40);
            this.A08.setFilters(new InputFilter[]{new AnonymousClass1M3(A063)});
            WaEditText waEditText2 = this.A08;
            waEditText2.addTextChangedListener(new C07850Zx(r11, r10, r6, r9, waEditText2, (TextView) findViewById(R.id.subject_counter_tv), A063, A063, false));
            List A0G2 = AnonymousClass1VY.A0G(UserJid.class, getIntent().getStringArrayListExtra("selected"));
            AbstractCollection abstractCollection = (AbstractCollection) A0G2;
            this.A0C = new ArrayList(abstractCollection.size());
            if (!abstractCollection.isEmpty()) {
                Iterator it = abstractCollection.iterator();
                while (it.hasNext()) {
                    this.A0C.add(this.A0F.A0A((AnonymousClass02N) it.next()));
                }
            }
            View findViewById = findViewById(R.id.ok_btn);
            if (findViewById != null) {
                ImageButton imageButton = (ImageButton) findViewById;
                this.A03 = imageButton;
                imageButton.setOnClickListener(new ViewOnClickCListenerShape4S0200000_I1(this, A0G2, 30));
                ((AbsListView) findViewById(R.id.selected_items)).setAdapter((ListAdapter) new C49382Qg(this, this, this.A0C));
                int size = this.A0C.size();
                AtomicReference atomicReference = this.A0c;
                if (atomicReference.get() == null || (A062 = this.A0X.A06((AnonymousClass02U) atomicReference.get())) <= 0) {
                    A0D2 = r6.A0D(R.string.new_group_n_contacts_selected, Integer.valueOf(size));
                } else {
                    A0D2 = r6.A0D(R.string.new_group_n_of_m_contacts_selected, Integer.valueOf(size), Integer.valueOf(A062));
                }
                TextView textView = (TextView) findViewById(R.id.selected_header);
                textView.setText(A0D2);
                AnonymousClass0Q7.A0N(textView);
                this.A0Q.A00(this.A0P);
                Integer valueOf = Integer.valueOf(getIntent().getIntExtra("entry_point", -1));
                if (valueOf.intValue() == -1) {
                    valueOf = null;
                }
                this.A0B = valueOf;
                if (this.A0X.A0X.A0E(308)) {
                    View findViewById2 = findViewById(R.id.experimental_checkbox);
                    if (findViewById2 != null) {
                        CheckBox checkBox = (CheckBox) findViewById2;
                        this.A02 = checkBox;
                        checkBox.setVisibility(0);
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.A03.getLayoutParams();
                        marginLayoutParams.setMargins(0, C008805h.A02(this, 122.0f), 0, 0);
                        this.A03.setLayoutParams(marginLayoutParams);
                        View findViewById3 = findViewById(R.id.group_setting_layout);
                        ViewGroup.LayoutParams layoutParams = findViewById3.getLayoutParams();
                        layoutParams.height = C008805h.A02(this, 170.0f);
                        findViewById3.setLayoutParams(layoutParams);
                        return;
                    }
                    throw null;
                }
                return;
            }
            throw null;
        }
        throw null;
    }

    @Override // X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onDestroy() {
        super.onDestroy();
        this.A0Q.A01(this.A0P);
    }

    @Override // X.ActivityC004802g, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onSaveInstanceState(Bundle bundle) {
        int i;
        super.onSaveInstanceState(bundle);
        if (this.A0A.isShowing()) {
            i = 1;
            this.A00 = 1;
        } else if (C06170Sb.A01(this.A07)) {
            i = 0;
            this.A00 = 0;
        } else {
            i = 2;
            this.A00 = 2;
        }
        bundle.putInt("input_method", i);
    }

    @Override // X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onStart() {
        super.onStart();
        int i = this.A00;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return;
                }
            } else if (!this.A0A.isShowing()) {
                this.A07.post(new RunnableEBaseShape10S0100000_I1_5(this, 15));
            }
            getWindow().setSoftInputMode(2);
            return;
        }
        getWindow().setSoftInputMode(4);
    }
}

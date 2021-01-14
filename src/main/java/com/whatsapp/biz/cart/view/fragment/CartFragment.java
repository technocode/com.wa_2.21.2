package com.whatsapp.biz.cart.view.fragment;

import X.AbstractC26561Lk;
import X.ActivityC004902h;
import X.AnonymousClass008;
import X.AnonymousClass00D;
import X.AnonymousClass00E;
import X.AnonymousClass00T;
import X.AnonymousClass01J;
import X.AnonymousClass01P;
import X.AnonymousClass01X;
import X.AnonymousClass022;
import X.AnonymousClass02M;
import X.AnonymousClass037;
import X.AnonymousClass03P;
import X.AnonymousClass088;
import X.AnonymousClass08B;
import X.AnonymousClass09H;
import X.AnonymousClass0AY;
import X.AnonymousClass0BP;
import X.AnonymousClass0Eg;
import X.AnonymousClass0GG;
import X.AnonymousClass0HL;
import X.AnonymousClass0J9;
import X.AnonymousClass0O5;
import X.AnonymousClass0Q7;
import X.AnonymousClass0SD;
import X.AnonymousClass1RX;
import X.AnonymousClass1RY;
import X.AnonymousClass1S0;
import X.AnonymousClass1SJ;
import X.AnonymousClass1SL;
import X.AnonymousClass1SN;
import X.AnonymousClass1SX;
import X.AnonymousClass1SY;
import X.C002001d;
import X.C002101e;
import X.C004302a;
import X.C006803i;
import X.C007003k;
import X.C014308b;
import X.C02590Cr;
import X.C02600Cs;
import X.C03930Ii;
import X.C04360Kb;
import X.C05530Oy;
import X.C06170Sb;
import X.C06470Tj;
import X.C27691Ra;
import X.C27701Rb;
import X.C27711Rc;
import X.C27741Rf;
import X.C27831Rq;
import X.C27881Ry;
import X.C41771vc;
import X.C41781vd;
import X.C41831vi;
import X.C41851vk;
import X.C41861vl;
import X.C41871vm;
import X.C41881vn;
import X.C41891vo;
import X.C41901vp;
import X.C41911vq;
import X.C41921vr;
import X.C41931vs;
import X.C41941vt;
import X.C41951vu;
import X.C41961vv;
import X.C41991vy;
import X.C42011w0;
import X.C42541ws;
import X.C42631x1;
import X.C42681x6;
import X.C460327p;
import X.C48052Ks;
import X.C48072Ku;
import X.C48672Ng;
import X.C53392d8;
import X.C53492dM;
import android.app.Dialog;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.DialogFragment;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.search.verification.client.R;
import com.whatsapp.KeyboardPopupLayout;
import com.whatsapp.MentionableEntry;
import com.whatsapp.RoundedBottomSheetDialogFragment;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;
import com.whatsapp.emoji.search.EmojiSearchContainer;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.ViewOnClickCListenerShape11S0100000_I1_0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class CartFragment extends RoundedBottomSheetDialogFragment {
    public static final HashMap A0n = new HashMap();
    public static final HashMap A0o = new HashMap();
    public int A00;
    public int A01;
    public int A02;
    public View A03;
    public View A04;
    public View A05;
    public View A06;
    public ImageButton A07;
    public KeyboardPopupLayout A08;
    public MentionableEntry A09;
    public WaTextView A0A;
    public WaTextView A0B;
    public WaTextView A0C;
    public WaTextView A0D;
    public AnonymousClass1RY A0E;
    public C41831vi A0F;
    public C41991vy A0G;
    public AnonymousClass1S0 A0H;
    public C460327p A0I;
    public C53392d8 A0J;
    public UserJid A0K;
    public boolean A0L = false;
    public final AnonymousClass0GG A0M = AnonymousClass0GG.A00();
    public final AbstractC26561Lk A0N = new C41961vv(this);
    public final AnonymousClass088 A0O = AnonymousClass088.A00();
    public final AnonymousClass02M A0P = AnonymousClass02M.A00();
    public final C04360Kb A0Q = C04360Kb.A00();
    public final AnonymousClass01J A0R = AnonymousClass01J.A00();
    public final C41771vc A0S = C41771vc.A00;
    public final C05530Oy A0T = C05530Oy.A02();
    public final C27831Rq A0U = C27831Rq.A00();
    public final AnonymousClass0HL A0V = AnonymousClass0HL.A00();
    public final C27881Ry A0W = C27881Ry.A00();
    public final AnonymousClass0BP A0X = new C41951vu(this);
    public final AnonymousClass08B A0Y = AnonymousClass08B.A00;
    public final C014308b A0Z = C014308b.A00();
    public final AnonymousClass03P A0a = AnonymousClass03P.A00();
    public final AnonymousClass00D A0b = AnonymousClass00D.A00();
    public final AnonymousClass01X A0c = AnonymousClass01X.A00();
    public final AnonymousClass01P A0d = AnonymousClass01P.A00();
    public final C02600Cs A0e = C02600Cs.A00();
    public final C02590Cr A0f = C02590Cr.A00();
    public final C03930Ii A0g = C03930Ii.A00();
    public final C53492dM A0h = C53492dM.A00();
    public final AnonymousClass0Eg A0i = AnonymousClass0Eg.A00();
    public final AnonymousClass09H A0j = AnonymousClass09H.A01();
    public final AnonymousClass022 A0k = AnonymousClass022.A00();
    public final C06170Sb A0l = C06170Sb.A00();
    public final AnonymousClass00T A0m = C002101e.A00();

    @Override // X.AnonymousClass037
    public View A0Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2 = ((AnonymousClass037) this).A06;
        if (bundle2 != null) {
            Parcelable parcelable = bundle2.getParcelable("extra_business_id");
            if (parcelable != null) {
                this.A0K = (UserJid) parcelable;
                View inflate = layoutInflater.inflate(R.layout.fragment_cart, viewGroup, false);
                this.A06 = inflate;
                this.A08 = (KeyboardPopupLayout) AnonymousClass0Q7.A0D(inflate, R.id.cart);
                this.A09 = (MentionableEntry) AnonymousClass0Q7.A0D(this.A06, R.id.entry);
                this.A07 = (ImageButton) AnonymousClass0Q7.A0D(this.A06, R.id.emoji_picker_btn);
                this.A05 = AnonymousClass0Q7.A0D(this.A06, R.id.footer);
                this.A0D = (WaTextView) AnonymousClass0Q7.A0D(this.A06, R.id.cart_total_quantity);
                this.A04 = AnonymousClass0Q7.A0D(this.A06, R.id.cart_empty_container);
                this.A0C = (WaTextView) AnonymousClass0Q7.A0D(this.A06, R.id.cart_estimated_value);
                this.A03 = AnonymousClass0Q7.A0D(this.A06, R.id.cart_items_container);
                this.A0B = (WaTextView) AnonymousClass0Q7.A0D(this.A06, R.id.empty_cart_title);
                this.A0A = (WaTextView) AnonymousClass0Q7.A0D(this.A06, R.id.empty_cart_description);
                View A0D2 = AnonymousClass0Q7.A0D(this.A06, R.id.send);
                View A0D3 = AnonymousClass0Q7.A0D(this.A06, R.id.cart_close_btn);
                View A0D4 = AnonymousClass0Q7.A0D(this.A06, R.id.add_more_btn);
                View A0D5 = AnonymousClass0Q7.A0D(this.A06, R.id.cart_empty_view_catalog_btn);
                RecyclerView recyclerView = (RecyclerView) AnonymousClass0Q7.A0D(this.A06, R.id.cart_items_recycler_view);
                this.A06.setMinimumHeight(A0x());
                View A0D6 = AnonymousClass0Q7.A0D(this.A06, R.id.text_entry_layout);
                int max = Math.max(A0D6.getPaddingLeft(), A0D6.getPaddingRight());
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) A0D6.getLayoutParams();
                AnonymousClass01X r9 = this.A0c;
                if (r9.A0M()) {
                    layoutParams.rightMargin = max;
                } else {
                    layoutParams.leftMargin = max;
                }
                A0D6.setLayoutParams(layoutParams);
                this.A0E = new AnonymousClass1RY();
                this.A02 = A02().getDimensionPixelSize(R.dimen.order_message_thumbnail_width);
                this.A01 = A02().getDimensionPixelSize(R.dimen.order_message_thumbnail_height);
                AnonymousClass02M r11 = this.A0P;
                AnonymousClass09H r8 = this.A0j;
                C42541ws r15 = new C42541ws(r11, r8, new AnonymousClass1SN(new AnonymousClass1SY()));
                C41781vd r14 = new C41781vd(r11, r8, new C27691Ra(new AnonymousClass1SY(), new AnonymousClass1SX()));
                UserJid userJid = this.A0K;
                AnonymousClass00T r7 = this.A0m;
                C05530Oy r1 = this.A0T;
                AnonymousClass0HL r0 = this.A0V;
                C27831Rq r82 = this.A0U;
                C27701Rb r112 = new C27701Rb(userJid, r7, r1, r0, r15, r14, r82);
                Dialog dialog = ((DialogFragment) this).A03;
                if (!(dialog == null || dialog.getWindow() == null)) {
                    ((DialogFragment) this).A03.getWindow().setSoftInputMode(16);
                }
                this.A09.setHint(A01().getString(R.string.type_a_message));
                A0D2.setOnClickListener(new ViewOnClickCListenerShape11S0100000_I1_0(this, 25));
                A0D4.setOnClickListener(new ViewOnClickCListenerShape11S0100000_I1_0(this, 26));
                A0D3.setOnClickListener(new ViewOnClickCListenerShape11S0100000_I1_0(this, 27));
                A0D5.setOnClickListener(new ViewOnClickCListenerShape11S0100000_I1_0(this, 28));
                this.A0F = new C41831vi(r112, r9, this.A0H, this);
                recyclerView.A0i = true;
                AnonymousClass0Q7.A0h(recyclerView, false);
                recyclerView.setAdapter(this.A0F);
                C42631x1 r142 = new C42631x1(A0B().getApplication(), r9);
                AnonymousClass0O5 A9n = A9n();
                String canonicalName = C460327p.class.getCanonicalName();
                if (canonicalName != null) {
                    String A0K2 = AnonymousClass008.A0K("androidx.lifecycle.ViewModelProvider.DefaultKey:", canonicalName);
                    HashMap hashMap = A9n.A00;
                    Object obj = (AnonymousClass0SD) hashMap.get(A0K2);
                    if (!C460327p.class.isInstance(obj)) {
                        obj = new C460327p(r142.A00, r142.A01);
                        AnonymousClass0SD r02 = (AnonymousClass0SD) hashMap.put(A0K2, obj);
                        if (r02 != null) {
                            r02.A00();
                        }
                    }
                    this.A0I = (C460327p) obj;
                    C42011w0 r72 = new C42011w0(new C27741Rf(), this.A0K, this.A0Q, this.A0R, r112, this.A0Z, new C42681x6(r7, this.A0O), this.A0d, r82);
                    AnonymousClass0O5 A9n2 = A9n();
                    String canonicalName2 = C41991vy.class.getCanonicalName();
                    if (canonicalName2 != null) {
                        String A0K3 = AnonymousClass008.A0K("androidx.lifecycle.ViewModelProvider.DefaultKey:", canonicalName2);
                        HashMap hashMap2 = A9n2.A00;
                        AnonymousClass0SD r12 = (AnonymousClass0SD) hashMap2.get(A0K3);
                        if (!C41991vy.class.isInstance(r12)) {
                            r12 = r72.A3B(C41991vy.class);
                            AnonymousClass0SD r03 = (AnonymousClass0SD) hashMap2.put(A0K3, r12);
                            if (r03 != null) {
                                r03.A00();
                            }
                        }
                        C41991vy r13 = (C41991vy) r12;
                        this.A0G = r13;
                        r13.A06.A03(A0E(), new C41861vl(this));
                        this.A0G.A09.A03(A0E(), new C41941vt(this));
                        this.A0G.A02.A03(A0E(), new C41851vk(this));
                        this.A0G.A08.A03(A0E(), new C41931vs(this));
                        this.A0G.A05.A03(A0E(), new C41911vq(this));
                        this.A0G.A07.A03(A0E(), new C41891vo(this));
                        this.A0G.A04.A03(A0E(), new C41901vp(this));
                        this.A0G.A0A.A03(A0E(), new C41871vm(this));
                        this.A0G.A03.A03(A0E(), new C41921vr(this));
                        C41991vy r04 = this.A0G;
                        r04.A00 = false;
                        r04.A01 = true;
                        C27701Rb r3 = r04.A0D;
                        r3.A0H.ANF(new RunnableEBaseShape7S0100000_I1_2(r3, 32));
                        A11();
                        ActivityC004902h A0B2 = A0B();
                        AnonymousClass0Eg r132 = this.A0i;
                        C06170Sb r122 = this.A0l;
                        C02590Cr r143 = this.A0f;
                        C02600Cs r113 = this.A0e;
                        C03930Ii r73 = this.A0g;
                        AnonymousClass03P r6 = this.A0a;
                        C53492dM r5 = this.A0h;
                        AnonymousClass00D r4 = this.A0b;
                        AnonymousClass022 r32 = this.A0k;
                        this.A0J = new C53392d8(A0B2, r132, r122, r143, r113, r73, r6, r9, r5, r4, r32, this.A08, this.A07, this.A09);
                        new C48672Ng((EmojiSearchContainer) this.A08.findViewById(R.id.emoji_search_container), this.A0J, A0B(), r143, r73, r9, r32).A00 = new C41881vn(this);
                        C53392d8 r2 = this.A0J;
                        r2.A08(this.A0N);
                        r2.A0B = new RunnableEBaseShape7S0100000_I1_2(this, 33);
                        String str = (String) A0o.get(this.A0K);
                        if (!TextUtils.isEmpty(str)) {
                            this.A09.setMentionableText(str, C006803i.A0O((String) A0n.get(this.A0K)));
                        }
                        r82.A04(37, null, this.A0K, null);
                        A10();
                        return this.A06;
                    }
                    throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
                }
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            throw null;
        }
        throw null;
    }

    @Override // X.AnonymousClass037
    public void A0c() {
        super.A0U = true;
        this.A0H.A00();
        this.A0Y.A00(this.A0X);
    }

    @Override // X.AnonymousClass037
    public void A0d() {
        MentionableEntry mentionableEntry;
        super.A0U = true;
        UserJid userJid = this.A0K;
        if (userJid != null && (mentionableEntry = this.A09) != null) {
            A0o.put(userJid, C002001d.A1l(mentionableEntry.getStringText()));
            A0n.put(this.A0K, C006803i.A0M(this.A09.getMentions()));
        }
    }

    @Override // X.AnonymousClass037
    public void A0e() {
        super.A0U = true;
        ActivityC004902h A0B2 = A0B();
        int i = this.A00;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return;
                }
            } else if (!this.A0J.isShowing()) {
                this.A08.post(new RunnableEBaseShape7S0100000_I1_2(this, 34));
            }
            A0B2.getWindow().setSoftInputMode(2);
            return;
        }
        A0B2.getWindow().setSoftInputMode(4);
    }

    @Override // X.AnonymousClass037, androidx.fragment.app.DialogFragment
    public void A0i(Bundle bundle) {
        super.A0i(bundle);
        this.A0Y.A01(this.A0X);
        this.A0H = new AnonymousClass1S0(this.A0W);
        if (bundle == null) {
            this.A00 = 2;
            return;
        }
        this.A00 = bundle.getInt("extra_input_method");
        this.A0L = bundle.getBoolean("extra_is_sending_order");
    }

    @Override // X.AnonymousClass037, androidx.fragment.app.DialogFragment
    public void A0j(Bundle bundle) {
        int i;
        super.A0j(bundle);
        if (this.A0J.isShowing()) {
            i = 1;
            this.A00 = 1;
        } else if (C06170Sb.A01(this.A08)) {
            i = 0;
            this.A00 = 0;
        } else {
            i = 2;
            this.A00 = 2;
        }
        bundle.putInt("extra_input_method", i);
        bundle.putBoolean("extra_is_sending_order", this.A0L);
    }

    @Override // com.whatsapp.RoundedBottomSheetDialogFragment
    public void A0y(View view) {
        super.A0y(view);
        BottomSheetBehavior.A00(view).A0J = false;
    }

    public final void A0z() {
        int A082 = this.A0F.A08();
        this.A0D.setText(this.A0c.A0A(R.plurals.products_total_quantity, (long) A082, Integer.valueOf(A082)));
        AnonymousClass1RY r1 = this.A0E;
        List<C27711Rc> list = this.A0F.A00;
        if (r1 != null) {
            ArrayList arrayList = new ArrayList();
            for (C27711Rc r7 : list) {
                C48052Ks r8 = r7.A01;
                List list2 = r8.A0A;
                arrayList.add(new AnonymousClass1SJ(r8.A06, r8.A08, r8.A09, r8.A01, !list2.isEmpty() ? new AnonymousClass1SL(((C48072Ku) list2.get(0)).A02, ((C48072Ku) list2.get(0)).A03) : null, (int) r7.A00));
            }
            this.A0C.setText(this.A0I.A02(arrayList));
            if (this.A0F.A08() == 0) {
                this.A0U.A04(31, null, this.A0K, null);
                this.A04.setVisibility(0);
                this.A03.setVisibility(8);
                this.A05.setVisibility(8);
            } else {
                this.A03.setVisibility(0);
                this.A05.setVisibility(0);
                this.A04.setVisibility(8);
            }
            C41771vc r0 = this.A0S;
            AnonymousClass00E.A01();
            Iterator it = r0.A00.iterator();
            while (true) {
                AnonymousClass0AY r12 = (AnonymousClass0AY) it;
                if (r12.hasNext()) {
                    ((AnonymousClass1RX) r12.next()).A00();
                } else {
                    return;
                }
            }
        } else {
            throw null;
        }
    }

    public final void A10() {
        int dimensionPixelSize = A02().getDimensionPixelSize(R.dimen.horizontal_padding);
        int i = dimensionPixelSize << 1;
        if (A02().getConfiguration().orientation != 1) {
            dimensionPixelSize >>= 1;
            i = dimensionPixelSize;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.A0B.getLayoutParams();
        layoutParams.topMargin = i;
        this.A0B.setLayoutParams(layoutParams);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.A0A.getLayoutParams();
        layoutParams2.topMargin = dimensionPixelSize;
        this.A0A.setLayoutParams(layoutParams2);
    }

    public final void A11() {
        String A082;
        C41991vy r1 = this.A0G;
        AnonymousClass01P r0 = r1.A0I;
        UserJid userJid = r1.A0J;
        AnonymousClass0J9 A0C2 = r0.A02.A0C(userJid);
        if (A0C2 != null) {
            A082 = A0C2.A08;
        } else {
            A082 = r1.A0H.A08(new C007003k(userJid), false);
        }
        if (!TextUtils.isEmpty(A082)) {
            View A0D2 = AnonymousClass0Q7.A0D(this.A06, R.id.recipient_name_layout);
            TextEmojiLabel textEmojiLabel = (TextEmojiLabel) AnonymousClass0Q7.A0D(this.A06, R.id.recipient_name_text);
            Typeface createFromAsset = Typeface.createFromAsset(A01().getAssets(), "fonts/Roboto-Medium.ttf");
            A0D2.setVisibility(0);
            ((ImageView) AnonymousClass0Q7.A0D(this.A06, R.id.recipient_name_prompt_icon)).setImageDrawable(new C06470Tj(this.A0c, C004302a.A03(A01(), R.drawable.chevron)));
            textEmojiLabel.A02(A082);
            if (createFromAsset != null) {
                textEmojiLabel.setTypeface(createFromAsset);
            }
        }
    }

    @Override // X.AnonymousClass037
    public void onConfigurationChanged(Configuration configuration) {
        super.A0U = true;
        A10();
    }
}

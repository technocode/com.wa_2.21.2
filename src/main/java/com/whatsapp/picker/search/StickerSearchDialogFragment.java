package com.whatsapp.picker.search;

import X.AnonymousClass008;
import X.AnonymousClass00Y;
import X.AnonymousClass01X;
import X.AnonymousClass0D1;
import X.AnonymousClass0O5;
import X.AnonymousClass0SD;
import X.AnonymousClass0YE;
import X.AnonymousClass1E4;
import X.AnonymousClass1E5;
import X.AnonymousClass21E;
import X.AnonymousClass21F;
import X.AnonymousClass33U;
import X.AnonymousClass3Ip;
import X.AnonymousClass3J1;
import X.AnonymousClass3J2;
import X.AnonymousClass3QG;
import X.C002701k;
import X.C004302a;
import X.C03960Il;
import X.C04230Jo;
import X.C08470bA;
import X.C29241Xq;
import X.C29251Xr;
import X.C36931nA;
import X.C53492dM;
import X.C59842oN;
import X.C63992xL;
import X.C64022xO;
import X.C69813Iq;
import X.C69873Iw;
import X.C69883Ix;
import X.C69893Iy;
import X.C69903Iz;
import X.C71933Qw;
import X.ViewTreeObserver$OnGlobalLayoutListenerC64002xM;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.facebook.redex.ViewOnClickEBaseShape8S0100000_I1_6;
import com.google.android.material.tabs.TabLayout;
import com.google.android.search.verification.client.R;
import com.whatsapp.WaEditText;
import com.whatsapp.util.ViewOnClickCListenerShape13S0100000_I1_2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class StickerSearchDialogFragment extends PickerSearchDialogFragment implements AnonymousClass33U {
    public View A00;
    public ViewTreeObserver.OnGlobalLayoutListener A01;
    public RecyclerView A02;
    public ViewPager A03;
    public TabLayout A04;
    public WaEditText A05;
    public ViewTreeObserver$OnGlobalLayoutListenerC64002xM A06;
    public AnonymousClass3J1 A07;
    public AnonymousClass3QG A08;
    public Runnable A09;
    public String A0A = "";
    public final AnonymousClass01X A0B = AnonymousClass01X.A00();
    public final C53492dM A0C = C53492dM.A00();
    public final C002701k A0D = C002701k.A00();
    public final AnonymousClass00Y A0E = AnonymousClass00Y.A00();
    public final C63992xL A0F = new C63992xL();
    public final C04230Jo A0G = C04230Jo.A00();

    @Override // X.AnonymousClass037, androidx.fragment.app.DialogFragment
    public void A0X() {
        this.A02.getViewTreeObserver().removeGlobalOnLayoutListener(this.A01);
        this.A02.getViewTreeObserver().removeGlobalOnLayoutListener(this.A06);
        List list = this.A02.A0b;
        if (list != null) {
            list.clear();
        }
        Runnable runnable = this.A09;
        if (runnable != null) {
            this.A05.removeCallbacks(runnable);
            this.A09 = null;
        }
        super.A0X();
    }

    @Override // X.AnonymousClass037
    public View A0Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AnonymousClass0D1 r15;
        Context A002 = A00();
        if (A002 != null) {
            if (bundle != null) {
                this.A0A = bundle.getString("search_term");
            }
            if (this.A0A == null) {
                this.A0A = "";
            }
            View inflate = layoutInflater.inflate(R.layout.sticker_search_dialog, viewGroup, false);
            this.A00 = inflate.findViewById(R.id.no_results);
            View findViewById = inflate.findViewById(R.id.get_more_stickers_button);
            if (((PickerSearchDialogFragment) this).A00 != null) {
                findViewById.setOnClickListener(new ViewOnClickEBaseShape8S0100000_I1_6(this, 7));
            }
            this.A02 = (RecyclerView) inflate.findViewById(R.id.search_result);
            View findViewById2 = inflate.findViewById(R.id.search_bar_container);
            this.A05 = (WaEditText) inflate.findViewById(R.id.search_bar);
            C64022xO r7 = new C64022xO(A002, viewGroup, this.A02, this.A08);
            this.A01 = r7.A07;
            this.A02.getViewTreeObserver().addOnGlobalLayoutListener(this.A01);
            this.A02.A0l(new C69883Ix(this));
            C71933Qw r72 = new C71933Qw(this.A0D, A02(), r7.A08);
            this.A02.A0l(r72);
            RecyclerView recyclerView = this.A02;
            this.A06 = new ViewTreeObserver$OnGlobalLayoutListenerC64002xM(recyclerView, r72);
            recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(this.A06);
            AnonymousClass3J2 r10 = new AnonymousClass3J2(this.A0C);
            AnonymousClass0O5 A9n = A9n();
            String canonicalName = AnonymousClass3J1.class.getCanonicalName();
            if (canonicalName != null) {
                String A0K = AnonymousClass008.A0K("androidx.lifecycle.ViewModelProvider.DefaultKey:", canonicalName);
                HashMap hashMap = A9n.A00;
                Object obj = (AnonymousClass0SD) hashMap.get(A0K);
                if (!AnonymousClass3J1.class.isInstance(obj)) {
                    obj = new AnonymousClass3J1(r10.A00);
                    AnonymousClass0SD r0 = (AnonymousClass0SD) hashMap.put(A0K, obj);
                    if (r0 != null) {
                        r0.A00();
                    }
                }
                AnonymousClass3J1 r2 = (AnonymousClass3J1) obj;
                this.A07 = r2;
                r2.A00.A03(A0E(), new C69813Iq(this));
                this.A07.A01.A03(A0E(), new AnonymousClass3Ip(this));
                if (this.A08 == null) {
                    C69873Iw r02 = ((PickerSearchDialogFragment) this).A00;
                    if (r02 != null) {
                        List list = r02.A05;
                        if (list == null) {
                            r02.A08.A02();
                        } else {
                            this.A07.A00.A07(list);
                        }
                        List list2 = (List) this.A07.A01.A01();
                        Context A003 = A00();
                        C59842oN r03 = ((PickerSearchDialogFragment) this).A00.A00;
                        if (r03 == null) {
                            r15 = null;
                        } else {
                            r15 = r03.A0Y;
                        }
                        AnonymousClass3QG r12 = new AnonymousClass3QG(list2, A003, r15, this.A0B, this, 1);
                        this.A08 = r12;
                        this.A02.setAdapter(r12);
                    } else {
                        throw null;
                    }
                }
                View findViewById3 = inflate.findViewById(R.id.clear_search_btn);
                findViewById3.setOnClickListener(new ViewOnClickCListenerShape13S0100000_I1_2(this, 40));
                this.A05.addTextChangedListener(new C69893Iy(this, findViewById3));
                inflate.findViewById(R.id.back).setOnClickListener(new ViewOnClickCListenerShape13S0100000_I1_2(this, 41));
                TabLayout tabLayout = (TabLayout) inflate.findViewById(R.id.sticker_category_tabs);
                this.A04 = tabLayout;
                int A004 = C004302a.A00(A00(), R.color.mediaGalleryTabInactive);
                int A005 = C004302a.A00(A00(), R.color.mediaGalleryTabActive);
                if (tabLayout != null) {
                    tabLayout.setTabTextColors(TabLayout.A00(A004, A005));
                    this.A04.setBackgroundColor(C004302a.A00(A00(), R.color.elevated_background));
                    findViewById2.setBackgroundColor(C004302a.A00(A00(), R.color.elevated_background));
                    A10(R.string.sticker_search_tab_all);
                    A10(R.string.sticker_search_tab_love);
                    A10(R.string.sticker_search_tab_greetings);
                    A10(R.string.sticker_search_tab_happy);
                    A10(R.string.sticker_search_tab_sad);
                    A10(R.string.sticker_search_tab_angry);
                    A10(R.string.sticker_search_tab_celebrate);
                    this.A04.setTabMode(0);
                    this.A03 = (ViewPager) inflate.findViewById(R.id.sticker_category_viewpager);
                    this.A03.setAdapter(new C08470bA(A0C()));
                    this.A03.setOffscreenPageLimit(7);
                    this.A03.A0F(new C36931nA(this.A04));
                    TabLayout tabLayout2 = this.A04;
                    C69903Iz r6 = new C69903Iz(this);
                    if (!tabLayout2.A0c.contains(r6)) {
                        tabLayout2.A0c.add(r6);
                    }
                    this.A05.setText("");
                    this.A05.requestFocus();
                    this.A05.A01(false);
                    AnonymousClass21E r1 = new AnonymousClass21E();
                    this.A0E.A09(r1, 1);
                    AnonymousClass00Y.A01(r1, "");
                    return inflate;
                }
                throw null;
            }
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        throw null;
    }

    @Override // com.whatsapp.base.WaDialogFragment, X.AnonymousClass037, androidx.fragment.app.DialogFragment
    public void A0f() {
        super.A0f();
        this.A05.A01(false);
    }

    @Override // X.AnonymousClass037, androidx.fragment.app.DialogFragment
    public void A0j(Bundle bundle) {
        super.A0j(bundle);
        if (!TextUtils.isEmpty(this.A0A)) {
            bundle.putString("search_term", this.A0A);
        }
    }

    public List A0y(int i) {
        List<C29241Xq> list = (List) this.A07.A00.A01();
        if (list == null) {
            return new ArrayList(0);
        }
        C63992xL r0 = this.A0F;
        if (r0 == null) {
            throw null;
        } else if (i == 0) {
            return list;
        } else {
            ArrayList arrayList = new ArrayList();
            Set set = (Set) r0.A00.get(Integer.valueOf(i));
            if (set != null) {
                for (C29241Xq r4 : list) {
                    C29251Xr r3 = r4.A04;
                    if (r3 != null && r3.A06 != null) {
                        int i2 = 0;
                        while (true) {
                            C03960Il[] r1 = r3.A06;
                            if (i2 >= r1.length) {
                                break;
                            } else if (set.contains(r1[i2])) {
                                arrayList.add(r4);
                                break;
                            } else {
                                i2++;
                            }
                        }
                    }
                }
            }
            return arrayList;
        }
    }

    public final void A0z() {
        List list = (List) this.A07.A01.A01();
        List list2 = (List) this.A07.A00.A01();
        int i = 0;
        if (TextUtils.isEmpty(this.A0A)) {
            this.A04.setVisibility(0);
            if (this.A03.getVisibility() != 0) {
                this.A03.setVisibility(0);
                A11(true);
            }
            View view = this.A00;
            if (list2 != null && !list2.isEmpty()) {
                i = 8;
            }
            view.setVisibility(i);
            return;
        }
        this.A04.setVisibility(8);
        if (this.A03.getVisibility() != 8) {
            A11(false);
            this.A03.setVisibility(8);
        }
        if (list == null || list.isEmpty()) {
            this.A00.setVisibility(0);
        } else {
            this.A00.setVisibility(8);
        }
    }

    public final void A10(int i) {
        AnonymousClass1E4 A032 = this.A04.A03();
        TabLayout tabLayout = A032.A02;
        if (tabLayout != null) {
            A032.A01(tabLayout.getResources().getText(i));
            A032.A03 = this.A0B.A0D(R.string.sticker_search_tab_content_description, A02().getString(i));
            AnonymousClass1E5 r0 = A032.A01;
            if (r0 != null) {
                r0.A00();
            }
            TabLayout tabLayout2 = this.A04;
            tabLayout2.A0E(A032, tabLayout2.A0d.isEmpty());
            return;
        }
        throw new IllegalArgumentException("Tab not attached to a TabLayout");
    }

    public final void A11(boolean z) {
        StickerSearchTabFragment stickerSearchTabFragment;
        AnonymousClass3QG r0;
        AnonymousClass0YE r1 = this.A03.A0V;
        if ((r1 instanceof C08470bA) && (r0 = (stickerSearchTabFragment = ((C08470bA) r1).A00).A02) != null) {
            r0.A04 = z;
            stickerSearchTabFragment.A01.setAdapter(null);
            stickerSearchTabFragment.A01.setAdapter(stickerSearchTabFragment.A02);
        }
    }

    @Override // X.AnonymousClass33U
    public void AKY(C29241Xq r6, Integer num) {
        if (((PickerSearchDialogFragment) this).A00 != null) {
            C04230Jo r4 = this.A0G;
            r4.A0A.execute(new RunnableEBaseShape0S0210000_I0(r4, r6, true, 11));
            AnonymousClass33U r0 = ((PickerSearchDialogFragment) this).A00.A04;
            if (r0 != null) {
                r0.AKY(r6, num);
            }
            AnonymousClass21F r1 = new AnonymousClass21F();
            r1.A02 = 1;
            r1.A01 = Boolean.valueOf(!r6.A01());
            this.A0E.A09(r1, 1);
            AnonymousClass00Y.A01(r1, "");
        }
    }
}

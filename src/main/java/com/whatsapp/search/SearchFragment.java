package com.whatsapp.search;

import X.AbstractC005102k;
import X.AbstractC07260Wt;
import X.AbstractC16450pp;
import X.ActivityC004902h;
import X.AnonymousClass008;
import X.AnonymousClass009;
import X.AnonymousClass00G;
import X.AnonymousClass00S;
import X.AnonymousClass00T;
import X.AnonymousClass00Y;
import X.AnonymousClass00b;
import X.AnonymousClass01A;
import X.AnonymousClass01I;
import X.AnonymousClass01S;
import X.AnonymousClass01T;
import X.AnonymousClass01X;
import X.AnonymousClass022;
import X.AnonymousClass02M;
import X.AnonymousClass02N;
import X.AnonymousClass03P;
import X.AnonymousClass03S;
import X.AnonymousClass08B;
import X.AnonymousClass08C;
import X.AnonymousClass09H;
import X.AnonymousClass0A8;
import X.AnonymousClass0A9;
import X.AnonymousClass0AO;
import X.AnonymousClass0AP;
import X.AnonymousClass0AQ;
import X.AnonymousClass0AS;
import X.AnonymousClass0BB;
import X.AnonymousClass0BP;
import X.AnonymousClass0BR;
import X.AnonymousClass0BW;
import X.AnonymousClass0CG;
import X.AnonymousClass0CN;
import X.AnonymousClass0DG;
import X.AnonymousClass0DH;
import X.AnonymousClass0EO;
import X.AnonymousClass0FE;
import X.AnonymousClass0GG;
import X.AnonymousClass0GW;
import X.AnonymousClass0HI;
import X.AnonymousClass0HJ;
import X.AnonymousClass0HN;
import X.AnonymousClass0L2;
import X.AnonymousClass0Q7;
import X.AnonymousClass0YP;
import X.AnonymousClass0YX;
import X.AnonymousClass0Z6;
import X.AnonymousClass0Z7;
import X.AnonymousClass1PN;
import X.AnonymousClass31y;
import X.AnonymousClass325;
import X.AnonymousClass3N5;
import X.AnonymousClass3N6;
import X.AnonymousClass3NH;
import X.AnonymousClass3NI;
import X.AnonymousClass3NJ;
import X.AnonymousClass3NK;
import X.AnonymousClass3NL;
import X.AnonymousClass3O0;
import X.AnonymousClass3SQ;
import X.AnonymousClass3ZP;
import X.C000300f;
import X.C002001d;
import X.C002101e;
import X.C002401h;
import X.C004302a;
import X.C006803i;
import X.C006903j;
import X.C008805h;
import X.C013807v;
import X.C014308b;
import X.C017009c;
import X.C017109d;
import X.C02150Av;
import X.C02360Br;
import X.C02590Cr;
import X.C02770Dj;
import X.C02780Dk;
import X.C04360Kb;
import X.C04370Kc;
import X.C04410Kg;
import X.C04490Ko;
import X.C06470Tj;
import X.C06940Vh;
import X.C09050cD;
import X.C09060cE;
import X.C09110cJ;
import X.C09480d1;
import X.C09490d2;
import X.C28301Tu;
import X.C36901n6;
import X.C40181sl;
import X.C40841tv;
import X.C48032Kq;
import X.C655830l;
import X.C70953Na;
import X.C70963Nb;
import X.C70973Nc;
import X.C70983Nd;
import X.C70993Ne;
import X.C71003Nf;
import X.C71013Ng;
import X.C71023Nh;
import X.C71033Ni;
import X.C71063Nl;
import X.C71073Nm;
import X.C71083Nn;
import X.C71093No;
import X.C71123Nr;
import X.C71133Ns;
import X.C71143Nt;
import X.C71153Nu;
import X.C71163Nv;
import X.C71173Nw;
import X.C71193Ny;
import X.C72063Rj;
import X.View$OnLayoutChangeListenerC655730k;
import android.animation.Animator;
import android.animation.LayoutTransition;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.ViewOnClickEBaseShape1S0100000_I0_1;
import com.google.android.material.chip.Chip;
import com.google.android.search.verification.client.R;
import com.whatsapp.BidiToolbar;
import com.whatsapp.base.WaFragment;
import com.whatsapp.jid.UserJid;
import com.whatsapp.search.views.ProgressView;
import com.whatsapp.search.views.TokenizedSearchInput;
import com.whatsapp.text.FinalBackspaceAwareEntry;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class SearchFragment extends WaFragment {
    public ValueAnimator A00;
    public View A01;
    public ViewGroup A02;
    public RecyclerView A03;
    public C36901n6 A04;
    public BidiToolbar A05;
    public AnonymousClass0YX A06;
    public C09490d2 A07;
    public AnonymousClass02N A08;
    public IteratingPlayer A09;
    public AnonymousClass3ZP A0A;
    public SearchViewModel A0B;
    public ProgressView A0C;
    public TokenizedSearchInput A0D;
    public C09110cJ A0E;
    public AnonymousClass3SQ A0F;
    public Runnable A0G;
    public boolean A0H;
    public final AbstractC16450pp A0I = new C71083Nn(this);
    public final C02780Dk A0J = C02780Dk.A02();
    public final AnonymousClass0GG A0K = AnonymousClass0GG.A00();
    public final C09050cD A0L = C09050cD.A00();
    public final AnonymousClass009 A0M = AnonymousClass009.A00();
    public final AnonymousClass02M A0N = AnonymousClass02M.A00();
    public final AnonymousClass01I A0O = AnonymousClass01I.A00();
    public final AnonymousClass0Z6 A0P = AnonymousClass0Z6.A00();
    public final C000300f A0Q = C000300f.A00();
    public final AnonymousClass0Z7 A0R = AnonymousClass0Z7.A00();
    public final C04360Kb A0S = C04360Kb.A00();
    public final AnonymousClass0HI A0T = AnonymousClass0HI.A00();
    public final AnonymousClass1PN A0U = AnonymousClass1PN.A00();
    public final C017009c A0V = C017009c.A00();
    public final C017109d A0W = C017109d.A00();
    public final AnonymousClass0DH A0X = AnonymousClass0DH.A00();
    public final AnonymousClass0HJ A0Y = AnonymousClass0HJ.A02();
    public final AnonymousClass01A A0Z = AnonymousClass01A.A00();
    public final AnonymousClass0BP A0a = new C71063Nl(this);
    public final AnonymousClass08B A0b = AnonymousClass08B.A00;
    public final C014308b A0c = C014308b.A00();
    public final AnonymousClass08C A0d = AnonymousClass08C.A00();
    public final AnonymousClass0L2 A0e = AnonymousClass0L2.A01();
    public final AnonymousClass0HN A0f = AnonymousClass0HN.A00();
    public final C04410Kg A0g = C04410Kg.A00();
    public final AnonymousClass03P A0h = AnonymousClass03P.A00();
    public final AnonymousClass00S A0i = AnonymousClass00S.A00();
    public final AnonymousClass00G A0j = AnonymousClass00G.A01;
    public final AnonymousClass03S A0k = AnonymousClass03S.A00();
    public final AnonymousClass01X A0l = AnonymousClass01X.A00();
    public final AnonymousClass0DG A0m = AnonymousClass0DG.A00();
    public final C006903j A0n = C006903j.A00();
    public final AnonymousClass0AQ A0o = AnonymousClass0AQ.A00();
    public final AnonymousClass0BR A0p = new C71073Nm(this);
    public final AnonymousClass0A8 A0q = AnonymousClass0A8.A00;
    public final AnonymousClass0A9 A0r = AnonymousClass0A9.A00();
    public final AnonymousClass0GW A0s = AnonymousClass0GW.A00();
    public final AnonymousClass0AO A0t = AnonymousClass0AO.A00();
    public final AnonymousClass01T A0u = AnonymousClass01T.A00();
    public final AnonymousClass0AP A0v = AnonymousClass0AP.A00();
    public final C48032Kq A0w = C48032Kq.A00();
    public final AnonymousClass0CG A0x = AnonymousClass0CG.A00();
    public final C04490Ko A0y = C04490Ko.A00();
    public final AnonymousClass0BW A0z = AnonymousClass0BW.A00();
    public final C02590Cr A10 = C02590Cr.A00();
    public final AnonymousClass0AS A11 = AnonymousClass0AS.A00();
    public final AnonymousClass00Y A12 = AnonymousClass00Y.A00();
    public final AnonymousClass0EO A13 = AnonymousClass0EO.A00();
    public final AnonymousClass01S A14 = AnonymousClass01S.A00();
    public final C02770Dj A15 = C02770Dj.A00();
    public final AnonymousClass09H A16 = AnonymousClass09H.A01();
    public final C02360Br A17 = C02360Br.A00();
    public final AnonymousClass0FE A18 = AnonymousClass0FE.A00();
    public final C02150Av A19 = C02150Av.A02();
    public final AnonymousClass022 A1A = AnonymousClass022.A00();
    public final AnonymousClass0BB A1B = AnonymousClass0BB.A00();
    public final AnonymousClass31y A1C = AnonymousClass31y.A00();
    public final AnonymousClass325 A1D = AnonymousClass325.A00();
    public final C04370Kc A1E = C04370Kc.A00();
    public final C09060cE A1F = C09060cE.A01();
    public final C002401h A1G = C002401h.A00();
    public final AnonymousClass00T A1H = C002101e.A00();
    public final AnonymousClass0CN A1I = AnonymousClass0CN.A00();

    public static void A00(SearchFragment searchFragment, AnonymousClass02N r4) {
        AnonymousClass02M r2 = searchFragment.A0N;
        r2.A02.post(new RunnableEBaseShape4S0200000_I0_3(searchFragment, r4, 0));
    }

    @Override // X.AnonymousClass037
    public void A0X() {
        StringBuilder sb = new StringBuilder("SearchFragment/onDestroyView ");
        sb.append(this);
        Log.i(sb.toString());
        Runnable runnable = this.A0G;
        if (runnable != null) {
            this.A1H.AMj(runnable);
        }
        ValueAnimator valueAnimator = this.A00;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        C28301Tu.A05();
        TokenizedSearchInput tokenizedSearchInput = this.A0D;
        FinalBackspaceAwareEntry finalBackspaceAwareEntry = tokenizedSearchInput.A0Q;
        C71193Ny r1 = tokenizedSearchInput.A0D;
        List list = finalBackspaceAwareEntry.A01;
        if (list != null) {
            list.remove(r1);
        }
        FinalBackspaceAwareEntry finalBackspaceAwareEntry2 = tokenizedSearchInput.A0Q;
        finalBackspaceAwareEntry2.setOnFocusChangeListener(null);
        finalBackspaceAwareEntry2.setOnEditorActionListener(null);
        finalBackspaceAwareEntry2.setOnKeyListener(null);
        RecyclerView recyclerView = this.A03;
        IteratingPlayer iteratingPlayer = this.A09;
        List list2 = recyclerView.A0a;
        if (list2 != null) {
            list2.remove(iteratingPlayer);
        }
        this.A03.A0m(this.A0I);
        C013807v r0 = super.A0K;
        r0.A01.A01(this.A09);
        this.A06.A00();
        this.A0F.A07();
        this.A02 = null;
        super.A0U = true;
    }

    @Override // X.AnonymousClass037
    public View A0Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        StringBuilder sb = new StringBuilder("SearchFragment/onCreateView ");
        sb.append(this);
        Log.i(sb.toString());
        try {
            AnonymousClass00b.A00(this.A0j.A00);
        } catch (IOException unused) {
        }
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.search_fragment, viewGroup, false);
        this.A02 = viewGroup2;
        this.A03 = (RecyclerView) viewGroup2.findViewById(R.id.result_list);
        this.A01 = this.A02.findViewById(R.id.divider);
        SearchViewModel searchViewModel = this.A0B;
        if (searchViewModel != null) {
            try {
                searchViewModel.A0o.ANF(new RunnableEBaseShape4S0100000_I0_4(searchViewModel.A0m, 10));
            } catch (Exception e) {
                StringBuilder A0S2 = AnonymousClass008.A0S("SearchViewModel/warmContacts/");
                A0S2.append(searchViewModel.A0o);
                A0S2.append("/");
                A0S2.append(searchViewModel.A0m);
                Log.e(A0S2.toString(), e);
            }
            if (!this.A0H) {
                if (this.A02 != null) {
                    SearchViewModel searchViewModel2 = this.A0B;
                    if (searchViewModel2 != null) {
                        searchViewModel2.A0G(1);
                    }
                    this.A0G = this.A1H.ANO(new RunnableEBaseShape4S0100000_I0_4(this, 12), 50);
                    this.A02.addOnLayoutChangeListener(new View$OnLayoutChangeListenerC655730k(this));
                }
                this.A0H = true;
            }
            AnonymousClass02M r0 = this.A0N;
            IteratingPlayer iteratingPlayer = new IteratingPlayer(r0, this.A03);
            this.A09 = iteratingPlayer;
            super.A0K.A00(iteratingPlayer);
            super.A0K.A00(this.A0B);
            AnonymousClass00G r02 = this.A0j;
            AnonymousClass0CN r6 = this.A1I;
            AnonymousClass01A r03 = this.A0Z;
            AnonymousClass01X r4 = this.A0l;
            AnonymousClass08C r1 = this.A0d;
            C017009c r04 = this.A0V;
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 5, TimeUnit.SECONDS, new PriorityBlockingQueue());
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            AnonymousClass3SQ r10 = new AnonymousClass3SQ(r02, r6, r03, r4, r1, r04, threadPoolExecutor);
            this.A0F = r10;
            AnonymousClass00S r05 = this.A0i;
            ActivityC004902h A0A2 = A0A();
            AnonymousClass0Z6 r06 = this.A0P;
            C013807v r07 = super.A0K;
            C04370Kc r08 = this.A1E;
            AnonymousClass009 r09 = this.A0M;
            AnonymousClass00T r010 = this.A1H;
            AnonymousClass01I r011 = this.A0O;
            C006903j r012 = this.A0n;
            C02590Cr r013 = this.A10;
            C000300f r014 = this.A0Q;
            C02780Dk r015 = this.A0J;
            C02770Dj r016 = this.A15;
            C02150Av r017 = this.A19;
            AnonymousClass0HJ r018 = this.A0Y;
            C09050cD r019 = this.A0L;
            AnonymousClass0A9 r020 = this.A0r;
            AnonymousClass03P r021 = this.A0h;
            C014308b r022 = this.A0c;
            C48032Kq r023 = this.A0w;
            AnonymousClass0GG r024 = this.A0K;
            AnonymousClass0AP r025 = this.A0v;
            AnonymousClass31y r026 = this.A1C;
            AnonymousClass0BB r027 = this.A1B;
            this.A0A = new AnonymousClass3ZP(r05, A0A2, r06, r07, r08, r0, r09, r010, r011, r02, r012, r013, r014, r015, r016, r017, r018, r03, r019, r020, r021, r022, r4, r023, r024, r025, r026, r027, r10, this.A0z, this.A0k, this.A06, r04, this.A14, this.A1A, this.A0R, this.A0B, this.A0o, this.A09);
            Context A012 = A01();
            SearchGridLayoutManager searchGridLayoutManager = new SearchGridLayoutManager(A012, this.A0A);
            RecyclerView recyclerView = this.A03;
            recyclerView.A0i = true;
            recyclerView.setLayoutManager(searchGridLayoutManager);
            this.A03.setAdapter(this.A0A);
            RecyclerView recyclerView2 = this.A03;
            IteratingPlayer iteratingPlayer2 = this.A09;
            List list = recyclerView2.A0a;
            if (list == null) {
                list = new ArrayList();
                recyclerView2.A0a = list;
            }
            list.add(iteratingPlayer2);
            this.A03.A0j(new C40181sl(r4, A02().getDimensionPixelSize(R.dimen.search_grid_padding)));
            RecyclerView recyclerView3 = this.A03;
            recyclerView3.A0j(new C40841tv(recyclerView3, this.A0A));
            this.A03.A0j(new AnonymousClass3O0(this.A0A, C004302a.A00(A012, R.color.search_large_divider_color), C004302a.A00(A012, R.color.list_section_divider), A02().getDimensionPixelSize(R.dimen.search_header_divider_height), A02().getDimensionPixelSize(R.dimen.search_message_divider_height)));
            this.A03.setItemAnimator(null);
            AnonymousClass0DG r8 = this.A0m;
            AnonymousClass0DH r7 = this.A0X;
            C02360Br r62 = this.A17;
            AnonymousClass0EO r028 = this.A13;
            C04490Ko r2 = this.A0y;
            AnonymousClass0CG r12 = this.A0x;
            AnonymousClass01T r029 = this.A0u;
            this.A07 = new C09490d2(A012, super.A0H, r05, r0, r010, r012, this.A1D, r014, this.A0S, this.A16, r03, r4, this.A0b, r028, r026, this.A0E, r027, this.A0T, this.A1F, this.A0f, this.A18, this.A0W, r04, this.A0g, r029, new C09480d1(r05, r0, r010, r8, r014, r7, r03, r62, r4, r028, r027, r2, r12, r029, new C71023Nh(this)), 1);
            this.A03.setOnCreateContextMenuListener(this);
            BidiToolbar bidiToolbar = (BidiToolbar) this.A02.findViewById(R.id.toolbar);
            this.A05 = bidiToolbar;
            bidiToolbar.setNavigationIcon(new C06470Tj(r4, C002001d.A0b(A012, R.drawable.ic_back, R.color.searchNavigateBackTint)));
            this.A05.setNavigationContentDescription(R.string.close);
            this.A05.setNavigationOnClickListener(new ViewOnClickEBaseShape1S0100000_I0_1(this, 14));
            this.A05.setContentInsetStartWithNavigation(A02().getDimensionPixelSize(R.dimen.search_input_offset));
            TokenizedSearchInput tokenizedSearchInput = (TokenizedSearchInput) this.A05.findViewById(R.id.search_input_layout);
            this.A0D = tokenizedSearchInput;
            AbstractC005102k A0E2 = A0E();
            tokenizedSearchInput.A0C = this.A0B;
            tokenizedSearchInput.A06 = A0E2;
            Chip chip = tokenizedSearchInput.A0N;
            chip.setOnClickListener(new ViewOnClickEBaseShape1S0100000_I0_1(tokenizedSearchInput, 16));
            Chip chip2 = tokenizedSearchInput.A0M;
            chip2.setOnClickListener(new ViewOnClickEBaseShape1S0100000_I0_1(tokenizedSearchInput, 17));
            AnonymousClass0Q7.A0d(chip, tokenizedSearchInput.A05);
            AnonymousClass0Q7.A0d(chip2, tokenizedSearchInput.A05);
            SearchViewModel searchViewModel3 = tokenizedSearchInput.A0C;
            searchViewModel3.A05.A03(A0E2, new C71133Ns(tokenizedSearchInput));
            SearchViewModel searchViewModel4 = tokenizedSearchInput.A0C;
            searchViewModel4.A04.A03(A0E2, new C71173Nw(tokenizedSearchInput));
            SearchViewModel searchViewModel5 = tokenizedSearchInput.A0C;
            searchViewModel5.A0C.A03(A0E2, new C71123Nr(tokenizedSearchInput));
            SearchViewModel searchViewModel6 = tokenizedSearchInput.A0C;
            searchViewModel6.A0G.A03(A0E2, new C71163Nv(tokenizedSearchInput));
            FinalBackspaceAwareEntry finalBackspaceAwareEntry = tokenizedSearchInput.A0Q;
            finalBackspaceAwareEntry.setOnClickListener(new ViewOnClickEBaseShape1S0100000_I0_1(tokenizedSearchInput, 18));
            if (tokenizedSearchInput.A0A.A0M()) {
                finalBackspaceAwareEntry.setSingleLine(true);
            }
            finalBackspaceAwareEntry.setFilters(new InputFilter[]{new InputFilter.LengthFilter(1024)});
            C71193Ny r13 = tokenizedSearchInput.A0D;
            List list2 = finalBackspaceAwareEntry.A01;
            if (list2 == null) {
                list2 = new ArrayList();
                finalBackspaceAwareEntry.A01 = list2;
            }
            list2.add(r13);
            C72063Rj r22 = new C72063Rj(finalBackspaceAwareEntry);
            TokenizedSearchInput tokenizedSearchInput2 = r13.A00;
            SearchViewModel searchViewModel7 = tokenizedSearchInput2.A0C;
            if (searchViewModel7 != null) {
                searchViewModel7.A0C.A03(tokenizedSearchInput2.A06, r22);
            }
            finalBackspaceAwareEntry.setOnFocusChangeListener(tokenizedSearchInput.A0K);
            finalBackspaceAwareEntry.setInputEnterAction(3);
            finalBackspaceAwareEntry.setOnEditorActionListener(tokenizedSearchInput.A04);
            finalBackspaceAwareEntry.setOnKeyListener(tokenizedSearchInput.A03);
            if (!tokenizedSearchInput.A0J) {
                LayoutTransition layoutTransition = new LayoutTransition();
                layoutTransition.setAnimator(2, null);
                layoutTransition.setDuration(100);
                ((ViewGroup) AnonymousClass0Q7.A0D(tokenizedSearchInput, R.id.input_layout)).setLayoutTransition(layoutTransition);
            }
            tokenizedSearchInput.A0P.setOnClickListener(tokenizedSearchInput.A02);
            tokenizedSearchInput.A0E = Integer.valueOf(tokenizedSearchInput.A0C.A03());
            tokenizedSearchInput.A0B = tokenizedSearchInput.A0C.A06();
            tokenizedSearchInput.A0H = tokenizedSearchInput.A0C.A09();
            tokenizedSearchInput.A05();
            UserJid userJid = tokenizedSearchInput.A0B;
            if (userJid != null) {
                chip2.setText(tokenizedSearchInput.A08.A08(tokenizedSearchInput.A07.A0A(userJid), false));
            }
            tokenizedSearchInput.A04();
            tokenizedSearchInput.A03();
            if (tokenizedSearchInput.A0C != null) {
                tokenizedSearchInput.A01();
                tokenizedSearchInput.A0O.setOnClickListener(new ViewOnClickEBaseShape1S0100000_I0_1(tokenizedSearchInput, 15));
                SearchViewModel searchViewModel8 = tokenizedSearchInput.A0C;
                searchViewModel8.A09.A03(tokenizedSearchInput.A06, new C71153Nu(tokenizedSearchInput));
                SearchViewModel searchViewModel9 = tokenizedSearchInput.A0C;
                searchViewModel9.A08.A03(tokenizedSearchInput.A06, new C71143Nt(tokenizedSearchInput));
                this.A0C = (ProgressView) AnonymousClass0Q7.A0D(this.A02, R.id.progress);
                this.A03.A0l(this.A0I);
                A0n();
                return this.A02;
            }
            throw null;
        }
        throw null;
    }

    @Override // X.AnonymousClass037
    public void A0a(Context context) {
        super.A0a(context);
        this.A0E = new C09110cJ(this.A12, this.A0Q, this.A0h, this.A0k);
        this.A06 = this.A0e.A03(context.getApplicationContext());
    }

    @Override // X.AnonymousClass037
    public void A0c() {
        StringBuilder sb = new StringBuilder("SearchFragment/onDestroy ");
        sb.append(this);
        Log.i(sb.toString());
        if (super.A0g) {
            this.A0s.A04(null, SearchFragment.class.getName());
        }
        this.A0b.A00(this.A0a);
        this.A0q.A01(this.A0p);
        super.A0U = true;
    }

    @Override // X.AnonymousClass037
    public void A0e() {
        StringBuilder sb = new StringBuilder("SearchFragment/onResume ");
        sb.append(this);
        Log.i(sb.toString());
        super.A0U = true;
    }

    @Override // X.AnonymousClass037
    public void A0g(int i, int i2, Intent intent) {
        this.A07.A01(i);
    }

    @Override // X.AnonymousClass037
    public void A0i(Bundle bundle) {
        StringBuilder sb = new StringBuilder("SearchFragment/onCreate ");
        sb.append(this);
        Log.i(sb.toString());
        super.A0i(bundle);
        boolean z = false;
        if (bundle != null) {
            z = true;
        }
        this.A0H = z;
        AbstractC07260Wt r4 = (AbstractC07260Wt) A0A();
        if (r4 != null && !r4.isFinishing()) {
            AnonymousClass0AO r3 = this.A0t;
            if (bundle != null) {
                r3.A00 = bundle.getLong("ephemeral_session_start", -1);
            }
            this.A0s.A03(null, SearchFragment.class.getName());
            SearchViewModel A8v = r4.A8v(this.A06);
            this.A0B = A8v;
            A8v.A0D.A03(this, new AnonymousClass3NJ(this));
            SearchViewModel searchViewModel = this.A0B;
            searchViewModel.A07.A03(this, new AnonymousClass3NL(this));
            this.A0B.A0A.A03(this, new AnonymousClass3NK(this));
            this.A0b.A01(this.A0a);
            this.A0q.A00(this.A0p);
            this.A0B.A03.A03(this, new C71003Nf(this));
            this.A0B.A0B.A03(this, new C71013Ng(this));
            SearchViewModel searchViewModel2 = this.A0B;
            searchViewModel2.A0T.A03(this, new AnonymousClass3N6(this));
            SearchViewModel searchViewModel3 = this.A0B;
            searchViewModel3.A0R.A03(this, new C70973Nc(this));
            SearchViewModel searchViewModel4 = this.A0B;
            searchViewModel4.A0M.A03(this, new AnonymousClass3NH(this));
            SearchViewModel searchViewModel5 = this.A0B;
            searchViewModel5.A0O.A03(this, new C70993Ne(this));
            SearchViewModel searchViewModel6 = this.A0B;
            searchViewModel6.A0N.A03(this, new C70953Na(this));
            SearchViewModel searchViewModel7 = this.A0B;
            searchViewModel7.A0Q.A03(this, new AnonymousClass3N5(this));
            SearchViewModel searchViewModel8 = this.A0B;
            searchViewModel8.A05.A03(this, new C71033Ni(this));
            SearchViewModel searchViewModel9 = this.A0B;
            searchViewModel9.A0C.A03(this, new C70983Nd(this));
            SearchViewModel searchViewModel10 = this.A0B;
            searchViewModel10.A04.A03(this, new C70963Nb(this));
            SearchViewModel searchViewModel11 = this.A0B;
            searchViewModel11.A0S.A03(this, new AnonymousClass3NI(this));
        }
    }

    @Override // X.AnonymousClass037
    public void A0j(Bundle bundle) {
        bundle.putLong("ephemeral_session_start", this.A0t.A00);
    }

    public final void A0n() {
        if (Build.VERSION.SDK_INT >= 23) {
            ActivityC004902h A0B2 = A0B();
            Window window = A0B2.getWindow();
            window.setStatusBarColor(C004302a.A00(A0B2, R.color.searchStatusBar));
            C002001d.A2k(window, !C002001d.A3E(A01()));
            window.addFlags(EditorInfoCompat.IME_FLAG_FORCE_ASCII);
            window.clearFlags(67108864);
        }
    }

    public final void A0o() {
        ActivityC004902h A0A2;
        if (Build.VERSION.SDK_INT >= 23 && (A0A2 = A0A()) != null) {
            C002001d.A2k(A0A2.getWindow(), false);
        }
    }

    public final void A0p() {
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.A03.A0S;
        if (linearLayoutManager != null) {
            SearchViewModel searchViewModel = this.A0B;
            Integer valueOf = Integer.valueOf(linearLayoutManager.A0r() + 6);
            if (!valueOf.equals(searchViewModel.A0E.A01())) {
                searchViewModel.A0E.A08(valueOf);
            }
            SearchViewModel searchViewModel2 = this.A0B;
            Integer valueOf2 = Integer.valueOf(linearLayoutManager.A0t());
            if (!valueOf2.equals(searchViewModel2.A0F.A01())) {
                searchViewModel2.A0F.A08(valueOf2);
            }
        }
    }

    public /* synthetic */ void A0q() {
        SearchViewModel searchViewModel = this.A0B;
        if (searchViewModel != null && A00() != null) {
            searchViewModel.A0G(3);
            this.A01.setVisibility(8);
            if (Build.VERSION.SDK_INT >= 21) {
                this.A05.setElevation(A02().getDimension(R.dimen.actionbar_elevation));
            } else {
                AnonymousClass0YP.A00(this.A05);
            }
        }
    }

    public final void A0r(int i, int i2, int i3, int i4, boolean z, Runnable runnable) {
        int i5;
        float f;
        Bundle bundle = super.A06;
        if (bundle != null) {
            if (z) {
                i5 = bundle.getInt("enter_duration_ms", 500);
            } else {
                i5 = bundle.getInt("exit_duration_ms", 250);
            }
            C06940Vh r5 = new C06940Vh();
            float f2 = 0.0f;
            if (Build.VERSION.SDK_INT < 21) {
                ViewGroup viewGroup = this.A02;
                if (viewGroup != null) {
                    float f3 = -((float) viewGroup.getHeight());
                    if (z) {
                        f = 0.0f;
                    } else {
                        f = f3;
                        f3 = 0.0f;
                    }
                    TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, f3, f);
                    translateAnimation.setInterpolator(r5);
                    translateAnimation.setDuration((long) i5);
                    if (runnable != null) {
                        translateAnimation.setAnimationListener(new C71093No(runnable));
                    }
                    this.A02.startAnimation(translateAnimation);
                }
            } else if (this.A02 != null) {
                int i6 = bundle.getInt("x", 0);
                int i7 = bundle.getInt("y", 0);
                float hypot = (float) Math.hypot((double) (i3 - i), (double) (i4 - i2));
                float f4 = hypot;
                if (z) {
                    f4 = 0.0f;
                    f2 = hypot;
                }
                Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(this.A02, i6, i7, f4, f2);
                createCircularReveal.setDuration((long) i5);
                createCircularReveal.setInterpolator(r5);
                if (runnable != null) {
                    createCircularReveal.addListener(new C655830l(runnable));
                }
                createCircularReveal.start();
            }
        }
    }

    public void A0s(Boolean bool) {
        View view;
        if (bool != null && bool.booleanValue() && (view = super.A0A) != null && (view.getParent() instanceof FrameLayout)) {
            ValueAnimator valueAnimator = this.A00;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.A00 = null;
            }
            SearchViewModel searchViewModel = this.A0B;
            if (searchViewModel != null) {
                searchViewModel.A0G(2);
            }
            ((View) super.A0A.getParent()).setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            this.A01.setVisibility(0);
            if (Build.VERSION.SDK_INT >= 21) {
                this.A05.setElevation(0.0f);
            } else {
                this.A05.setBackgroundResource(0);
                this.A05.setBackgroundColor(C004302a.A00(A00(), R.color.neutral_primary));
            }
            this.A02.forceLayout();
        }
    }

    public final void A0t(Object obj) {
        View view;
        View view2;
        ValueAnimator valueAnimator;
        C28301Tu.A05();
        if (obj != null && !C006803i.A0q(obj, 0) && !C006803i.A0q(obj, "")) {
            Integer num = 2;
            if (num.equals(this.A0B.A03.A01()) && (view = super.A0A) != null && (view2 = (View) view.getParent()) != null) {
                RunnableEBaseShape4S0100000_I0_4 runnableEBaseShape4S0100000_I0_4 = new RunnableEBaseShape4S0100000_I0_4(this, 11);
                View view3 = (View) view2.getParent();
                if (view3 != null) {
                    valueAnimator = C008805h.A06(view2, view3.getHeight(), new RunnableEBaseShape0S0201000_I0(view2, -1, runnableEBaseShape4S0100000_I0_4, 1), -1);
                } else {
                    valueAnimator = null;
                }
                this.A00 = valueAnimator;
                if (valueAnimator != null) {
                    valueAnimator.start();
                }
            }
        }
    }

    @Override // X.AnonymousClass037
    public void onConfigurationChanged(Configuration configuration) {
        super.A0U = true;
        A0n();
    }
}

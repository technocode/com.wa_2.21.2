package com.whatsapp.stickers;

import X.AbstractC000900m;
import X.AbstractC16300pa;
import X.AbstractC16450pp;
import X.ActivityC004602e;
import X.ActivityC004702f;
import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass01X;
import X.AnonymousClass0D1;
import X.AnonymousClass0HC;
import X.AnonymousClass0JF;
import X.AnonymousClass0JW;
import X.AnonymousClass2C0;
import X.AnonymousClass339;
import X.AnonymousClass33B;
import X.AnonymousClass33L;
import X.AnonymousClass33O;
import X.AnonymousClass33V;
import X.AnonymousClass3QC;
import X.AnonymousClass3QO;
import X.AnonymousClass3QU;
import X.C002001d;
import X.C002101e;
import X.C003301q;
import X.C03570Gt;
import X.C03620Gz;
import X.C06470Tj;
import X.C29241Xq;
import X.C71753Qe;
import X.C71763Qf;
import X.C71773Qg;
import X.C71793Qi;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.ViewOnClickEBaseShape8S0100000_I1_6;
import com.google.android.search.verification.client.R;
import com.whatsapp.components.Button;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape14S0100000_I1_3;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

public class StickerStorePackPreviewActivity extends ActivityC004602e implements AnonymousClass33B, AnonymousClass339, AbstractC000900m {
    public int A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public ImageView A05;
    public ImageView A06;
    public TextView A07;
    public TextView A08;
    public TextView A09;
    public GridLayoutManager A0A;
    public RecyclerView A0B;
    public Button A0C;
    public Button A0D;
    public AnonymousClass00C A0E = AnonymousClass00C.A00();
    public AnonymousClass0HC A0F = AnonymousClass0HC.A00();
    public AnonymousClass33O A0G;
    public AnonymousClass3QO A0H;
    public C71793Qi A0I;
    public StickerView A0J;
    public String A0K;
    public Map A0L;
    public Map A0M;
    public Set A0N;
    public boolean A0O;
    public final ViewTreeObserver.OnGlobalLayoutListener A0P = new AnonymousClass33V(this);
    public final AbstractC16450pp A0Q = new C71763Qf(this);
    public final C003301q A0R = C003301q.A02;
    public final AnonymousClass0D1 A0S = AnonymousClass0D1.A00();
    public final AnonymousClass33L A0T = new C71753Qe(this);
    public final C03620Gz A0U = C03620Gz.A00();
    public final C03570Gt A0V = C03570Gt.A00();
    public final C71773Qg A0W = new C71773Qg(this);
    public final AnonymousClass00T A0X = C002101e.A00();

    public static void A04(StickerStorePackPreviewActivity stickerStorePackPreviewActivity, RecyclerView recyclerView) {
        if (stickerStorePackPreviewActivity != null) {
            int i = 0;
            boolean z = false;
            if (recyclerView.computeVerticalScrollOffset() > 0) {
                z = true;
            }
            View view = stickerStorePackPreviewActivity.A02;
            if (view != null) {
                if (!z) {
                    i = 8;
                }
                view.setVisibility(i);
                return;
            }
            return;
        }
        throw null;
    }

    public final void A0T() {
        C03570Gt r5 = this.A0V;
        String str = this.A0K;
        AnonymousClass3QC r1 = new AnonymousClass3QC(this);
        if (r5 != null) {
            Log.d("StickerRepository/getStickerPackById/begin");
            r5.A0R.ANC(new AnonymousClass3QU(r5, r1, r5.A0H), new Pair(str, Boolean.TRUE));
            return;
        }
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0093, code lost:
        if (r7 != false) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0125, code lost:
        if (r8.A01() == false) goto L_0x0127;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0U() {
        /*
        // Method dump skipped, instructions count: 450
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.stickers.StickerStorePackPreviewActivity.A0U():void");
    }

    @Override // X.AbstractC000900m
    public void AEa(AnonymousClass0JF r2) {
        if (r2.A02) {
            A0U();
            AnonymousClass3QO r0 = this.A0H;
            if (r0 != null) {
                ((AbstractC16300pa) r0).A01.A00();
            }
        }
    }

    @Override // X.AnonymousClass33B
    public void AKH(C29241Xq r4) {
        this.A0H.A08();
        Object obj = this.A0M.get(r4.A0A);
        if (obj != null) {
            int intValue = ((Number) obj).intValue();
            SparseBooleanArray sparseBooleanArray = this.A0G.A01;
            if (sparseBooleanArray != null) {
                sparseBooleanArray.put(intValue, true);
            }
            this.A0H.A02(intValue);
            return;
        }
        throw null;
    }

    @Override // X.AnonymousClass33B
    public void AKU(C29241Xq r4) {
        ((ActivityC004702f) this).A0F.A06(R.string.sticker_failed_to_download, 1);
        Object obj = this.A0M.get(r4.A0A);
        if (obj != null) {
            int intValue = ((Number) obj).intValue();
            SparseBooleanArray sparseBooleanArray = this.A0G.A01;
            if (sparseBooleanArray != null) {
                sparseBooleanArray.put(intValue, false);
            }
            this.A0H.A02(intValue);
            return;
        }
        throw null;
    }

    @Override // X.AnonymousClass33B
    public void AKZ(C29241Xq r4) {
        Object obj = this.A0M.get(r4.A0A);
        if (obj != null) {
            int intValue = ((Number) obj).intValue();
            SparseBooleanArray sparseBooleanArray = this.A0G.A01;
            if (sparseBooleanArray != null) {
                sparseBooleanArray.put(intValue, false);
            }
            this.A0H.A02(intValue);
            return;
        }
        throw null;
    }

    @Override // X.AnonymousClass339
    public void ALP(boolean z) {
        this.A0O = false;
        if (z) {
            finish();
        } else {
            A0U();
        }
    }

    @Override // X.AnonymousClass339
    public void ALQ() {
        this.A0O = true;
        A0U();
    }

    public /* synthetic */ void lambda$onCreate$2582$StickerStorePackPreviewActivity(View view) {
        finish();
    }

    @Override // X.ActivityC004902h
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 28) {
            super.onActivityResult(i, i2, intent);
            finish();
        }
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.sticker_store_pack_preview);
        this.A0K = getIntent().getStringExtra("sticker_pack_id");
        this.A0G = new AnonymousClass33O();
        this.A0U.A01(this.A0T);
        A0T();
        if (this.A0K == null) {
            Log.e("StickerStorePackPreviewActivity/onCreate no pack id passed");
            finish();
        }
        View view = ((ActivityC004702f) this).A04;
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        AnonymousClass01X r2 = ((AnonymousClass2C0) this).A01;
        toolbar.setNavigationIcon(new C06470Tj(r2, C002001d.A0b(this, R.drawable.ic_back_teal, R.color.tealActionBarItemDrawableTint)));
        toolbar.setTitle(r2.A06(R.string.sticker_store_pack_preview_title));
        toolbar.setNavigationContentDescription(r2.A06(R.string.sticker_pack_preview_back_button_content_description));
        toolbar.setNavigationOnClickListener(new ViewOnClickEBaseShape8S0100000_I1_6(this, 43));
        this.A01 = view.findViewById(R.id.details_container);
        this.A04 = view.findViewById(R.id.loading_progress);
        this.A08 = (TextView) view.findViewById(R.id.pack_preview_title);
        this.A09 = (TextView) view.findViewById(R.id.pack_preview_publisher);
        this.A07 = (TextView) view.findViewById(R.id.pack_preview_description);
        this.A03 = view.findViewById(R.id.pack_download_progress);
        this.A06 = (ImageView) view.findViewById(R.id.pack_tray_icon);
        this.A02 = view.findViewById(R.id.divider);
        this.A0D = (Button) view.findViewById(R.id.download_btn);
        this.A0C = (Button) view.findViewById(R.id.delete_btn);
        this.A05 = (ImageView) view.findViewById(R.id.sticker_pack_animation_icon);
        this.A0D.setOnClickListener(new ViewOnClickCListenerShape14S0100000_I1_3(this, 11));
        this.A0C.setOnClickListener(new ViewOnClickCListenerShape14S0100000_I1_3(this, 12));
        this.A0A = new GridLayoutManager(1);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.sticker_preview_recycler);
        this.A0B = recyclerView;
        recyclerView.setLayoutManager(this.A0A);
        this.A0B.A0l(this.A0Q);
        this.A0B.getViewTreeObserver().addOnGlobalLayoutListener(this.A0P);
        StickerView stickerView = (StickerView) view.findViewById(R.id.sticker_preview_expanded_sticker);
        this.A0J = stickerView;
        stickerView.A02 = true;
        this.A0R.A01(this);
    }

    @Override // X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onDestroy() {
        super.onDestroy();
        this.A0U.A00(this.A0T);
        AnonymousClass0D1 r0 = this.A0S;
        if (r0 != null) {
            r0.A04();
        }
        this.A0R.A00(this);
        C71793Qi r02 = this.A0I;
        if (r02 != null) {
            ((AnonymousClass0JW) r02).A00.cancel(true);
            this.A0I = null;
        }
        Map map = this.A0L;
        if (map != null) {
            this.A0X.ANF(new RunnableEBaseShape12S0100000_I1_7(new ArrayList(map.values()), 49));
            this.A0L.clear();
            this.A0L = null;
        }
    }
}

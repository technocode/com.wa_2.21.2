package com.whatsapp.stickers;

import X.AbstractC03640Hb;
import X.ActivityC004902h;
import X.AnonymousClass00E;
import X.AnonymousClass00T;
import X.AnonymousClass01X;
import X.AnonymousClass037;
import X.AnonymousClass0D1;
import X.AnonymousClass0MB;
import X.AnonymousClass0MC;
import X.AnonymousClass0MD;
import X.AnonymousClass33I;
import X.AnonymousClass3Q6;
import X.AnonymousClass3QL;
import X.C002101e;
import X.C002301g;
import X.C02780Dk;
import X.C03570Gt;
import X.C04470Km;
import X.C29241Xq;
import X.DialogInterface$OnClickListenerC661232y;
import X.DialogInterface$OnClickListenerC661332z;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.google.android.search.verification.client.R;
import com.whatsapp.base.WaDialogFragment;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.Set;

public class StickerInfoDialogFragment extends WaDialogFragment {
    public int A00;
    public View A01;
    public View A02;
    public Button A03;
    public Button A04;
    public Button A05;
    public TextView A06;
    public TextView A07;
    public TextView A08;
    public C29241Xq A09;
    public AnonymousClass0D1 A0A;
    public AnonymousClass33I A0B;
    public StickerView A0C;
    public final DialogInterface.OnClickListener A0D = new DialogInterface$OnClickListenerC661332z(this);
    public final DialogInterface.OnClickListener A0E = new DialogInterface$OnClickListenerC661232y(this);
    public final C02780Dk A0F = C02780Dk.A02();
    public final AnonymousClass01X A0G = AnonymousClass01X.A00();
    public final C03570Gt A0H = C03570Gt.A00();
    public final C04470Km A0I = C04470Km.A00;
    public final AnonymousClass00T A0J = C002101e.A00();

    @Override // X.AnonymousClass037, androidx.fragment.app.DialogFragment
    public void A0Y() {
        super.A0Y();
        this.A0A = null;
    }

    @Override // X.AnonymousClass037, androidx.fragment.app.DialogFragment
    public void A0a(Context context) {
        super.A0a(context);
        AnonymousClass00E.A08(context instanceof AbstractC03640Hb, "StickerInfoDialogFragment requires host context implement StickerImageFileLoaderProvider");
        this.A0A = ((AbstractC03640Hb) context).A9D();
    }

    @Override // X.AnonymousClass037, com.whatsapp.base.WaDialogFragment, androidx.fragment.app.DialogFragment
    public void A0f() {
        super.A0f();
        AnonymousClass0MD r1 = (AnonymousClass0MD) ((DialogFragment) this).A03;
        Button A022 = r1.A02(-1);
        this.A03 = A022;
        this.A04 = r1.A02(-2);
        this.A05 = r1.A02(-3);
        if (this.A0A != null && this.A09 != null && this.A0C != null && this.A0B == null) {
            A022.setVisibility(8);
            this.A04.setVisibility(8);
            this.A05.setVisibility(8);
            AnonymousClass0D1 r0 = this.A0A;
            C29241Xq r12 = this.A09;
            StickerView stickerView = this.A0C;
            int i = this.A00;
            r0.A06(r12, 1, stickerView, i, i, true, false, new AnonymousClass3Q6(this));
            this.A0J.ANC(new AnonymousClass3QL(this.A09, this), new Void[0]);
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0p(Bundle bundle) {
        ActivityC004902h A0A2 = A0A();
        if (A0A2 != null) {
            Bundle bundle2 = ((AnonymousClass037) this).A06;
            if (bundle2 != null) {
                this.A09 = (C29241Xq) bundle2.getParcelable("sticker");
                AnonymousClass0MB r3 = new AnonymousClass0MB(A0A2);
                LayoutInflater layoutInflater = A0A2.getLayoutInflater();
                this.A00 = A02().getDimensionPixelSize(R.dimen.conversation_row_sticker_size);
                View inflate = layoutInflater.inflate(R.layout.sticker_detail_dialog, (ViewGroup) null);
                View findViewById = inflate.findViewById(R.id.sticker_view);
                if (findViewById != null) {
                    StickerView stickerView = (StickerView) findViewById;
                    this.A0C = stickerView;
                    stickerView.A02 = true;
                    View findViewById2 = inflate.findViewById(R.id.progress_view);
                    if (findViewById2 != null) {
                        this.A01 = findViewById2;
                        View findViewById3 = inflate.findViewById(R.id.sticker_info_container);
                        if (findViewById3 != null) {
                            this.A02 = findViewById3;
                            View findViewById4 = inflate.findViewById(R.id.sticker_pack_name);
                            if (findViewById4 != null) {
                                this.A07 = (TextView) findViewById4;
                                View findViewById5 = inflate.findViewById(R.id.sticker_pack_publisher);
                                if (findViewById5 != null) {
                                    this.A08 = (TextView) findViewById5;
                                    View findViewById6 = inflate.findViewById(R.id.bullet_sticker_info);
                                    if (findViewById6 != null) {
                                        this.A06 = (TextView) findViewById6;
                                        C002301g.A03(this.A07);
                                        AnonymousClass01X r2 = this.A0G;
                                        r3.A07(r2.A06(R.string.sticker_remove_from_favorites), this.A0D);
                                        r3.A05(r2.A06(R.string.cancel), null);
                                        r3.A06(r2.A06(R.string.sticker_remove_from_favorites), this.A0E);
                                        AnonymousClass0MC r1 = r3.A01;
                                        r1.A0C = inflate;
                                        r1.A01 = 0;
                                        return r3.A00();
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
            throw null;
        }
        throw null;
    }

    public final void A0x(AnonymousClass33I r6, C29241Xq r7) {
        if (r6.A05) {
            C03570Gt r4 = this.A0H;
            Set singleton = Collections.singleton(r7);
            if (r4 != null) {
                Log.d("StickerRepository/unstarStickersAsync/begin");
                r4.A0R.ANF(new RunnableEBaseShape4S0200000_I0_3(r4, singleton, 8));
                return;
            }
            throw null;
        }
        this.A0H.A0K(Collections.singleton(r7));
        this.A0I.A02("starred");
    }
}
